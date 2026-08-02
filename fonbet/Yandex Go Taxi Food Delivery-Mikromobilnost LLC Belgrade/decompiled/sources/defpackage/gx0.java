package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class gx0 {
    public final UiStateDrawableWrapper a;
    public final UiStateDrawableWrapper b;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public gx0(UiStateDrawableWrapper uiStateDrawableWrapper, UiStateDrawableWrapper uiStateDrawableWrapper2) {
        this.a = uiStateDrawableWrapper;
        this.b = uiStateDrawableWrapper2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx0)) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        return jl40.l(this.a, gx0Var.a) && this.b.equals(gx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressLeadIconState(sourceIcon=" + this.a + ", destinationIcon=" + this.b + Extension.C_BRAKE;
    }
}
