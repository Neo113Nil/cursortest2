package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class cd6 {
    public final UiStateDrawableWrapper a;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public cd6(UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = uiStateDrawableWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd6) && this.a.equals(((cd6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(drawableWrapper=" + this.a + Extension.C_BRAKE;
    }
}
