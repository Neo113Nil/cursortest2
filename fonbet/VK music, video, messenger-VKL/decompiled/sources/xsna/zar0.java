package xsna;

import android.util.Log;
import xsna.abr0;
import xsna.j9y0;

/* compiled from: VKCaptcha.kt */
/* loaded from: classes2.dex */
public final class zar0 {
    public static final void a(j9y0 j9y0Var) {
        String str;
        String str2;
        bbr0 bbr0Var;
        if (j9y0Var instanceof j9y0.d) {
            j9y0.d dVar = (j9y0.d) j9y0Var;
            abr0.b bVar = new abr0.b(dVar.a);
            var0.a.getClass();
            bbr0 bbr0Var2 = var0.b;
            if (bbr0Var2 != null) {
                bbr0Var2.a(bVar);
            }
            if (dVar.b != null) {
                ((l9y0) var0.e.getValue()).a.put(dVar.b, dVar.a);
                return;
            }
            return;
        }
        if (j9y0Var instanceof j9y0.b) {
            xar0 xar0Var = ((j9y0.b) j9y0Var).a;
            abr0.a aVar = new abr0.a();
            var0.a.getClass();
            bbr0 bbr0Var3 = var0.b;
            if (bbr0Var3 != null) {
                bbr0Var3.a(aVar);
                return;
            }
            return;
        }
        if (j9y0Var instanceof j9y0.a) {
            abr0.a aVar2 = new abr0.a();
            var0.a.getClass();
            bbr0 bbr0Var4 = var0.b;
            if (bbr0Var4 != null) {
                bbr0Var4.a(aVar2);
                return;
            }
            return;
        }
        if (epx.f(j9y0Var, j9y0.c.a)) {
            var0 var0Var = var0.a;
            synchronized (var0Var) {
                str = var0.c;
                str2 = var0.d;
                bbr0Var = var0.b;
                s3q0 s3q0Var = s3q0.a;
            }
            if (str != null && str2 != null && bbr0Var != null) {
                var0Var.c(str, str2, bbr0Var);
                return;
            }
            StringBuilder sb = new StringBuilder("Can not retry to open captcha because illegal state. domain is null:");
            sb.append(str == null);
            sb.append(", redirectUri is null:");
            sb.append(str2 == null);
            sb.append(", captchaListener is null: ");
            sb.append(bbr0Var == null);
            Log.e("VKCaptchaState", sb.toString());
        }
    }
}
