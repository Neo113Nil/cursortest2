package defpackage;

import android.os.Build;
import com.yandex.xplat.common.NetworkMethod;
import com.yandex.xplat.payment.sdk.ClientPlatform;

/* loaded from: classes2.dex */
public final class mu2 implements vv50 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mu2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vv50
    public final md51 d(hz50 hz50Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                NetworkMethod method = hz50Var.method();
                String c = hz50Var.c();
                wj00 a = hz50Var.a();
                wj00 b = hz50Var.b();
                wj00 d = hz50Var.d();
                rbh rbhVar = (rbh) obj;
                String str = rbhVar.b;
                if (str != null) {
                    d.k("X-Client-Version", str);
                } else {
                    d.getClass();
                }
                String str2 = rbhVar.c;
                if (str2 != null) {
                    d.k("X-Client-App", str2);
                }
                return zmx.d(new tsp0(method, c, a, b, d, hz50Var.encoding()));
            case 1:
                NetworkMethod method2 = hz50Var.method();
                String c2 = hz50Var.c();
                wj00 a2 = hz50Var.a();
                wj00 b2 = hz50Var.b();
                wj00 d2 = hz50Var.d();
                kw kwVar = (kw) obj;
                String str3 = Build.MANUFACTURER;
                if (str3 != null) {
                    d2.k("X-Device-Manufacturer", str3);
                } else {
                    d2.getClass();
                }
                String str4 = Build.MODEL;
                if (str4 != null) {
                    d2.k("X-Device-Model", str4);
                }
                String str5 = kwVar.a;
                if (str5 != null) {
                    d2.k("X-OS-Version", str5);
                }
                String str6 = kwVar.b;
                if (str6 != null) {
                    d2.k("X-OS-API-Version", str6);
                }
                String str7 = kwVar.c;
                if (str7 != null) {
                    d2.k("X-Screen-Width", str7);
                }
                String str8 = kwVar.d;
                if (str8 != null) {
                    d2.k("X-Screen-Height", str8);
                }
                return zmx.d(new tsp0(method2, c2, a2, b2, d2, hz50Var.encoding()));
            case 2:
                return evu0.y(hz50Var.c(), "tokenize", false) ? ((mhj) obj).b.b().h(new rhj(hz50Var, this, 0)) : zmx.d(hz50Var);
            case 3:
                NetworkMethod method3 = hz50Var.method();
                String c3 = hz50Var.c();
                wj00 a3 = hz50Var.a();
                wj00 b3 = hz50Var.b();
                wj00 d3 = hz50Var.d();
                d3.k("X-SDK-PLATFORM", String.valueOf((ClientPlatform) obj));
                d3.k("X-SDK-VERSION", "7.6.6");
                return zmx.d(new tsp0(method3, c3, a3, b3, d3, hz50Var.encoding()));
            default:
                return hz50Var.d().h("X-USER-UUID") == null ? ((md51) ((m020) obj).invoke()).a(new rhj(hz50Var, this, 1), new rhj(hz50Var)) : zmx.d(hz50Var);
        }
    }
}
