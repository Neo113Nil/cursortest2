package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class pbk0 {
    public final UiStateDrawableWrapper a;
    public final CharSequence b;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public pbk0(UiStateDrawableWrapper uiStateDrawableWrapper, CharSequence charSequence) {
        this.a = uiStateDrawableWrapper;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbk0)) {
            return false;
        }
        pbk0 pbk0Var = (pbk0) obj;
        return this.a.equals(pbk0Var.a) && jl40.l(this.b, pbk0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "Title(image=" + this.a + ", text=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
