package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4836fh extends AbstractC4733bh {
    public final SafePackageManager b;

    public C4836fh(C4927j5 c4927j5) {
        this(c4927j5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(@NonNull C4722b6 c4722b6) {
        HashSet hashSet;
        ArrayList b;
        C4927j5 c4927j5 = this.a;
        if (c4927j5.t.c() && c4927j5.y()) {
            C4860gf c4860gf = c4927j5.c;
            String e = this.a.c.e();
            try {
                if (!TextUtils.isEmpty(e)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            hashSet.add(new C4778da(jSONArray.getJSONObject(i)));
                        }
                    } catch (Throwable unused) {
                    }
                    b = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b)) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            C4778da c4778da = (C4778da) it.next();
                            c4778da.getClass();
                            JSONObject put = new JSONObject().put("name", c4778da.a).put("required", c4778da.c);
                            int i2 = c4778da.b;
                            if (i2 != -1) {
                                put.put("version", i2);
                            }
                            jSONArray2.put(put);
                        }
                        C4722b6 a = C4722b6.a(c4722b6, new JSONObject().put("features", jSONArray2).toString());
                        C5266w9 c5266w9 = c4927j5.n;
                        c5266w9.a(a, C4737bl.a(c5266w9.c.b(a), a.i));
                        int i3 = c5266w9.j;
                        c5266w9.l = i3;
                        c5266w9.a.a(i3).b();
                        c4860gf.i(jSONArray2.toString());
                    } else {
                        C5266w9 c5266w92 = c4927j5.n;
                        int i4 = c5266w92.j;
                        c5266w92.l = i4;
                        c5266w92.a.a(i4).b();
                    }
                }
                b = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, b)) {
                }
            } catch (Throwable unused2) {
            }
            hashSet = null;
        }
        return false;
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            C4927j5 c4927j5 = this.a;
            SafePackageManager safePackageManager = this.b;
            Context context = c4927j5.a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            AbstractC4752ca c4700aa = AndroidUtils.isApiAchieved(24) ? new C4700aa() : new C4726ba();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(c4700aa.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C4836fh(C4927j5 c4927j5, @NonNull SafePackageManager safePackageManager) {
        super(c4927j5);
        this.b = safePackageManager;
    }
}
