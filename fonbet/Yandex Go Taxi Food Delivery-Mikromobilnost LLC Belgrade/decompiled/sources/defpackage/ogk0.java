package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class ogk0 {
    public static final ogk0 b;
    public final UiStateDrawableWrapper a;

    static {
        UiStateDrawableWrapper uiStateDrawableWrapper;
        UiStateDrawableWrapper.Companion.getClass();
        uiStateDrawableWrapper = UiStateDrawableWrapper.EMPTY;
        b = new ogk0(uiStateDrawableWrapper);
    }

    public ogk0(UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = uiStateDrawableWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogk0) && jl40.l(this.a, ((ogk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RideCardDriverCarIconState(image=" + this.a + Extension.C_BRAKE;
    }
}
