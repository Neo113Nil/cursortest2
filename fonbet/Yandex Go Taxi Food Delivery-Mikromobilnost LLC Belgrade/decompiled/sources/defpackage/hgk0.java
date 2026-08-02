package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class hgk0 {
    public static final hgk0 c;
    public final boolean a;
    public final UiStateDrawableWrapper b;

    static {
        UiStateDrawableWrapper uiStateDrawableWrapper;
        UiStateDrawableWrapper.Companion.getClass();
        uiStateDrawableWrapper = UiStateDrawableWrapper.EMPTY;
        c = new hgk0(false, uiStateDrawableWrapper);
    }

    public hgk0(boolean z, UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = z;
        this.b = uiStateDrawableWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgk0)) {
            return false;
        }
        hgk0 hgk0Var = (hgk0) obj;
        return this.a == hgk0Var.a && jl40.l(this.b, hgk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RideCardDriverAvatarState(isLoading=" + this.a + ", drawable=" + this.b + Extension.C_BRAKE;
    }
}
