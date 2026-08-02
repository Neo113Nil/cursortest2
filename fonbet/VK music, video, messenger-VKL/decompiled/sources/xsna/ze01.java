package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ze01 implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ af01 f;

    public ze01(af01 af01Var, boolean z, Uri uri, String str, String str2) {
        this.f = af01Var;
        this.b = z;
        this.c = uri;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9 A[Catch: RuntimeException -> 0x006e, TryCatch #0 {RuntimeException -> 0x006e, blocks: (B:3:0x0016, B:9:0x0090, B:11:0x009b, B:14:0x00a8, B:16:0x00ae, B:17:0x00c8, B:18:0x00d1, B:23:0x00d9, B:26:0x00f2, B:27:0x0105, B:29:0x00f9, B:30:0x0119, B:32:0x011f, B:34:0x0125, B:36:0x012b, B:38:0x0131, B:40:0x0139, B:42:0x0141, B:44:0x0147, B:47:0x0159, B:51:0x002f, B:53:0x0035, B:55:0x003b, B:57:0x0041, B:59:0x0047, B:61:0x004f, B:63:0x0057, B:65:0x005f, B:66:0x0071, B:68:0x0081), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0090 A[Catch: RuntimeException -> 0x006e, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x006e, blocks: (B:3:0x0016, B:9:0x0090, B:11:0x009b, B:14:0x00a8, B:16:0x00ae, B:17:0x00c8, B:18:0x00d1, B:23:0x00d9, B:26:0x00f2, B:27:0x0105, B:29:0x00f9, B:30:0x0119, B:32:0x011f, B:34:0x0125, B:36:0x012b, B:38:0x0131, B:40:0x0139, B:42:0x0141, B:44:0x0147, B:47:0x0159, B:51:0x002f, B:53:0x0035, B:55:0x003b, B:57:0x0041, B:59:0x0047, B:61:0x004f, B:63:0x0057, B:65:0x005f, B:66:0x0071, B:68:0x0081), top: B:2:0x0016 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bundle k0;
        boolean z;
        String str;
        Uri uri = this.c;
        String str2 = this.e;
        bf01 bf01Var = this.f.b;
        op01 op01Var = bf01Var.q;
        mb01 mb01Var = (mb01) bf01Var.b;
        bf01Var.k();
        try {
            sk01 sk01Var = mb01Var.m;
            mb01.i(sk01Var);
            if (!TextUtils.isEmpty(str2)) {
                if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid")) {
                    k0 = sk01Var.k0(Uri.parse("https://google.com/search?".concat(str2)));
                    if (k0 != null) {
                        k0.putString("_cis", "referrer");
                    }
                    z = this.b;
                    String str3 = this.d;
                    if (z) {
                        sk01 sk01Var2 = mb01Var.m;
                        mb01.i(sk01Var2);
                        Bundle k02 = sk01Var2.k0(uri);
                        if (k02 != null) {
                            k02.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                            if (k02.containsKey("gclid") || k0 == null || !k0.containsKey("gclid")) {
                                str = "Activity created with data 'referrer' without required params";
                            } else {
                                str = "Activity created with data 'referrer' without required params";
                                k02.putString("_cer", "gclid=" + k0.getString("gclid"));
                            }
                            bf01Var.r(str3, "_cmp", k02);
                            op01Var.a(k02, str3);
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            k901 k901Var = mb01Var.j;
                            mb01.k(k901Var);
                            k901Var.p.b(str2, "Activity created with referrer");
                            if (mb01Var.h.t(null, s701.Y)) {
                                if (k0 != null) {
                                    bf01Var.r(str3, "_cmp", k0);
                                    op01Var.a(k0, str3);
                                } else {
                                    k901 k901Var2 = mb01Var.j;
                                    mb01.k(k901Var2);
                                    k901Var2.p.b(str2, "Referrer does not contain valid parameters");
                                }
                                mb01Var.o.getClass();
                                bf01Var.z("auto", "_ldl", null, true, System.currentTimeMillis());
                                return;
                            }
                            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                                k901 k901Var3 = mb01Var.j;
                                mb01.k(k901Var3);
                                k901Var3.p.a(str);
                                return;
                            } else {
                                if (TextUtils.isEmpty(str2)) {
                                    return;
                                }
                                mb01Var.o.getClass();
                                bf01Var.z("auto", "_ldl", str2, true, System.currentTimeMillis());
                                return;
                            }
                        }
                    }
                    str = "Activity created with data 'referrer' without required params";
                    if (TextUtils.isEmpty(str2)) {
                    }
                } else {
                    k901 k901Var4 = ((mb01) sk01Var.b).j;
                    mb01.k(k901Var4);
                    k901Var4.p.a("Activity created with data 'referrer' without required params");
                }
            }
            k0 = null;
            z = this.b;
            String str32 = this.d;
            if (z) {
            }
            str = "Activity created with data 'referrer' without required params";
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e) {
            k901 k901Var5 = mb01Var.j;
            mb01.k(k901Var5);
            k901Var5.i.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
        }
    }
}
