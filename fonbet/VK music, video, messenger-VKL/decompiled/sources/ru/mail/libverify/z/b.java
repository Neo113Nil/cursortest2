package ru.mail.libverify.z;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.mail.libverify.n0.e;
import ru.mail.libverify.utils.PackageStateReceiver;
import ru.mail.verify.core.utils.FileLog;
import xsna.vu5;
import xsna.yjx0;

/* loaded from: classes9.dex */
public final class b {

    @NonNull
    private final ResolveInfo a;
    private final PackageInfo b;
    private Integer c;

    private b(@NonNull Context context, @NonNull ResolveInfo resolveInfo) throws PackageManager.NameNotFoundException {
        this.a = resolveInfo;
        this.b = context.getPackageManager().getPackageInfo(resolveInfo.activityInfo.packageName, 0);
    }

    public static boolean a(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(PackageStateReceiver.class.getName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.isEmpty()) {
                return true;
            }
            ArrayList arrayList = new ArrayList(queryBroadcastReceivers.size());
            boolean z = false;
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                try {
                    b bVar = new b(context, resolveInfo);
                    arrayList.add(bVar);
                    if (!z && TextUtils.equals(bVar.b.packageName, str)) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    FileLog.e("PackageInfo", e, "failed to find info for package %s", resolveInfo);
                }
            }
            if (!z) {
                return true;
            }
            Collections.sort(arrayList, new yjx0(1));
            int size = arrayList.size();
            int i = -1;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str2 = ((b) arrayList.get(i2)).b.packageName;
                if (TextUtils.equals(str2, str)) {
                    i = i2;
                } else if (TextUtils.equals(str2, context.getPackageName())) {
                    size = i2;
                }
            }
            return size > i;
        } catch (Throwable th) {
            FileLog.e("PackageInfo", "failed to query packages info", th);
            return true;
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PackageInfo{name=");
        sb.append(this.b.packageName);
        sb.append(", lastUpdateTime=");
        sb.append(this.b.lastUpdateTime);
        sb.append(", instanceVersion=");
        return vu5.b(sb, a(), '}');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(b bVar, b bVar2) {
        int a = e.a(bVar.a(), bVar2.a());
        return a != 0 ? a : e.a(bVar.b.lastUpdateTime, bVar2.b.lastUpdateTime);
    }

    private int a() {
        if (this.c == null) {
            ActivityInfo activityInfo = this.a.activityInfo;
            if (activityInfo == null || TextUtils.isEmpty(activityInfo.nonLocalizedLabel)) {
                return 0;
            }
            String[] split = this.a.activityInfo.nonLocalizedLabel.toString().split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (split.length != 2) {
                return 0;
            }
            this.c = Integer.valueOf(Integer.parseInt(split[1]));
        }
        return this.c.intValue();
    }
}
