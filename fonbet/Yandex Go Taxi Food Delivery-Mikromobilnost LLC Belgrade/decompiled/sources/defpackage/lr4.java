package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lr4 {
    public final jwh a;

    public lr4(jwh jwhVar) {
        this.a = jwhVar;
    }

    public static String a(xbp0 xbp0Var) {
        if (jl40.l(xbp0Var, sbp0.a) || jl40.l(xbp0Var, tbp0.a)) {
            return "SuperApp.Delivery.PultOrder.BannerCard";
        }
        if (xbp0Var instanceof vbp0) {
            return "SharedOrderCard.BannerCard";
        }
        if (xbp0Var instanceof ubp0) {
            return ((ubp0) xbp0Var).b;
        }
        w511.b();
        return null;
    }

    public final void b(String str, String str2, String str3) {
        if (str != null) {
            this.a.a.o(g8e.p(str, Extension.DOT_CHAR, str2), null, g8e.x("banner_id", str3));
        }
    }
}
