package xsna;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.O6;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: GmsRpc.java */
/* loaded from: classes.dex */
public final class h3u {
    public final vhr a;
    public final gi20 b;
    public final upg0 c;
    public final f9e0<hgq0> d;
    public final f9e0<HeartBeatInfo> e;
    public final uir f;

    public h3u(vhr vhrVar, gi20 gi20Var, f9e0<hgq0> f9e0Var, f9e0<HeartBeatInfo> f9e0Var2, uir uirVar) {
        vhrVar.a();
        upg0 upg0Var = new upg0(vhrVar.a);
        this.a = vhrVar;
        this.b = gi20Var;
        this.c = upg0Var;
        this.d = f9e0Var;
        this.e = f9e0Var2;
        this.f = uirVar;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new ddk(), new d45(this));
    }

    public final void b(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        int i;
        String str3;
        String str4;
        HeartBeatInfo.HeartBeat a;
        PackageInfo packageInfo;
        bundle.putString(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        vhr vhrVar = this.a;
        vhrVar.a();
        bundle.putString("gmp_app_id", vhrVar.c.b);
        gi20 gi20Var = this.b;
        synchronized (gi20Var) {
            try {
                if (gi20Var.d == 0) {
                    try {
                        packageInfo = gi20Var.a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        e.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        gi20Var.d = packageInfo.versionCode;
                    }
                }
                i = gi20Var.d;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString(O6.G, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        gi20 gi20Var2 = this.b;
        synchronized (gi20Var2) {
            try {
                if (gi20Var2.c == null) {
                    gi20Var2.d();
                }
                str3 = gi20Var2.c;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        vhr vhrVar2 = this.a;
        vhrVar2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(vhrVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String b = ((k6x) Tasks.await(this.f.getToken())).b();
            if (!TextUtils.isEmpty(b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (String) Tasks.await(this.f.getId()));
        bundle.putString("cliv", "fcm-23.4.1");
        HeartBeatInfo heartBeatInfo = this.e.get();
        hgq0 hgq0Var = this.d.get();
        if (heartBeatInfo == null || hgq0Var == null || (a = heartBeatInfo.a()) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(a.h()));
        bundle.putString("Firebase-Client", hgq0Var.getUserAgent());
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        int i;
        try {
            b(str, str2, bundle);
            upg0 upg0Var = this.c;
            ns01 ns01Var = ns01.b;
            dr01 dr01Var = upg0Var.c;
            if (dr01Var.a() < 12000000) {
                return dr01Var.b() != 0 ? upg0Var.a(bundle).continueWithTask(ns01Var, new mv9(upg0Var, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            nq01 a = nq01.a(upg0Var.b);
            synchronized (a) {
                i = a.d;
                a.d = i + 1;
            }
            return a.b(new cq01(i, 1, bundle)).continueWith(ns01Var, ktr.b);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }
}
