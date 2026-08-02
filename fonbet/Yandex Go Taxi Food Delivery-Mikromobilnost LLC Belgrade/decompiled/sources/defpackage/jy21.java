package defpackage;

import kotlin.a;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;

/* loaded from: classes15.dex */
public final class jy21 {
    public final i3y a = a.a(new gp21(10));

    public final void a(String str) {
        String A = dai0.A(String.valueOf(System.currentTimeMillis()));
        if (A == null) {
            A = "";
        }
        if (evu0.J(A)) {
            g8e.A(jst.e, "Got blank content");
            return;
        }
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, str);
            kwu e = jwuVar.e();
            t4j0 t4j0Var = new t4j0();
            t4j0Var.a = e;
            int i = m5j0.a;
            Regex regex = wg10.e;
            t4j0Var.e("POST", wms.a(A, qje.o("text/plain")));
            ((nci0) ((OkHttpClient) this.a.getValue()).newCall(new d5j0(t4j0Var))).I(new r400(16));
        } catch (Throwable th) {
            jst.e.k(th, "Can't parse url ".concat(str));
        }
    }
}
