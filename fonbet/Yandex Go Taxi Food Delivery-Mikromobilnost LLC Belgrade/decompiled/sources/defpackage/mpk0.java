package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class mpk0 {
    public final UiStateDrawableWrapper a;

    public mpk0(UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = uiStateDrawableWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpk0) && this.a.equals(((mpk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RideCardTopDecorationUiState(image=" + this.a + Extension.C_BRAKE;
    }
}
