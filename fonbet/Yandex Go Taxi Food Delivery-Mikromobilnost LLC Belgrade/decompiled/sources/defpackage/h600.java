package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class h600 {
    public final UiWebViewConfig a;
    public final siw0 b;

    public h600(UiWebViewConfig uiWebViewConfig, siw0 siw0Var) {
        this.a = uiWebViewConfig;
        this.b = siw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h600)) {
            return false;
        }
        h600 h600Var = (h600) obj;
        return jl40.l(this.a, h600Var.a) && jl40.l(this.b, h600Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        siw0 siw0Var = this.b;
        return hashCode + (siw0Var == null ? 0 : siw0Var.hashCode());
    }

    public final String toString() {
        return "MainMenuSupportRouterPayload(fallbackConfig=" + this.a + ", chatData=" + this.b + Extension.C_BRAKE;
    }
}
