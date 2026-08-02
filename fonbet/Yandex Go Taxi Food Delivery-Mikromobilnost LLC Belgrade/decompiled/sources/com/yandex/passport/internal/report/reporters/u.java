package com.yandex.passport.internal.report.reporters;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.l6;
import defpackage.cma1;
import defpackage.uza;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class u extends l3 {
    public final Context b;
    public final com.yandex.passport.internal.flags.j c;

    public u(Context context, com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.flags.j jVar2) {
        super(jVar);
        this.b = context;
        this.c = jVar2;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.flags.a aVar = com.yandex.passport.internal.flags.q.a;
        return ((Boolean) this.c.b(com.yandex.passport.internal.flags.q.A0)).booleanValue();
    }

    public final Map j() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getAssets().open("dependencies/dependencies.json"), uza.a), 8192);
            try {
                String x0 = cma1.x0(bufferedReader);
                bufferedReader.close();
                JSONObject jSONObject = new JSONObject(x0).getJSONObject("dependencies");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    linkedHashMap.put(next, jSONObject.getString(next));
                }
                return linkedHashMap;
            } finally {
            }
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.INFO, null, "DependenciesReporter::loadDependenciesInfo: " + e.getMessage(), e);
            }
            return kotlin.collections.b.f();
        }
    }

    public final void k(long j) {
        Integer num;
        int i;
        Context context = this.b;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            Pair pair = new Pair("dependencies", j());
            Pair pair2 = new Pair("target_sdk_version", String.valueOf(applicationInfo.targetSdkVersion));
            Pair pair3 = new Pair("min_sdk_version", String.valueOf(applicationInfo.minSdkVersion));
            if (Build.VERSION.SDK_INT >= 31) {
                i = applicationInfo.compileSdkVersion;
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            Pair pair4 = new Pair("compile_sdk_version", String.valueOf(num));
            Pair pair5 = new Pair("version_code", String.valueOf(j));
            String str = "unknown";
            try {
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str2 != null) {
                    str = str2;
                }
            } catch (Exception unused) {
            }
            b(l6.w, kotlin.collections.b.i(pair, pair2, pair3, pair4, pair5, new Pair("version_name", str)));
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.INFO, null, "DependenciesReporter::reportDependencies: " + e.getMessage(), e);
            }
        }
    }
}
