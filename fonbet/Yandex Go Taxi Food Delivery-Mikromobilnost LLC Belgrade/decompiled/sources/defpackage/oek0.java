package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class oek0 implements qek0 {
    public final UiStateDrawableWrapper a;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public oek0(UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = uiStateDrawableWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oek0) && this.a.equals(((oek0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(image=" + this.a + Extension.C_BRAKE;
    }
}
