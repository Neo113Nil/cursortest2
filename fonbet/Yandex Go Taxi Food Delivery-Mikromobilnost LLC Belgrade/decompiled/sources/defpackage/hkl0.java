package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class hkl0 {
    public final Drawable a;
    public final CharSequence b;

    public hkl0(UiStateDrawableWrapper uiStateDrawableWrapper, CharSequence charSequence) {
        this.a = uiStateDrawableWrapper;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkl0)) {
            return false;
        }
        hkl0 hkl0Var = (hkl0) obj;
        return jl40.l(this.a, hkl0Var.a) && jl40.l(this.b, hkl0Var.b);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "RulesItemUiState(leadImage=" + this.a + ", title=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
