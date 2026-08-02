package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Parameters;
import xsna.yen0;

/* compiled from: PixelHandler.kt */
/* loaded from: classes6.dex */
public final class cqa0 {
    public final defpackage.o0 a;
    public final x1n0 b;
    public final svp c;

    public cqa0(defpackage.o0 o0Var, x1n0 x1n0Var, svp svpVar) {
        this.a = o0Var;
        this.b = x1n0Var;
        this.c = svpVar;
    }

    public final io.reactivex.rxjava3.core.q<Boolean> a(RetargetingPixel$Parameters retargetingPixel$Parameters) {
        String f = retargetingPixel$Parameters.f();
        String b = b();
        xwv0 xwv0Var = (xwv0) this.a.invoke();
        yen0.a aVar = new yen0.a(f, b, xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null);
        String e = retargetingPixel$Parameters.e();
        if (e == null) {
            e = "";
        }
        yen0.c cVar = new yen0.c(aVar, e, retargetingPixel$Parameters.k() != null ? Long.valueOf(r3.intValue()) : null, retargetingPixel$Parameters.g() != null ? Long.valueOf(r4.intValue()) : null, retargetingPixel$Parameters.h(), retargetingPixel$Parameters.i());
        vdx0 vdx0Var = e370.e;
        return (vdx0Var != null ? vdx0Var : null).c().b(cVar);
    }

    public final String b() {
        WebApiApplication v;
        String c;
        defpackage.o0 o0Var = this.a;
        xwv0 xwv0Var = (xwv0) o0Var.invoke();
        if (xwv0Var != null && (c = xwv0Var.c()) != null) {
            return c;
        }
        xwv0 xwv0Var2 = (xwv0) o0Var.invoke();
        if (xwv0Var2 == null || (v = xwv0Var2.v()) == null) {
            return null;
        }
        return v.D;
    }
}
