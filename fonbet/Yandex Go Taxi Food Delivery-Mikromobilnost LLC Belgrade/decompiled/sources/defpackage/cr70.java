package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class cr70 implements fr70 {
    public final UiStateDrawableWrapper a;
    public final CharSequence b;
    public final CharSequence c;
    public final boolean d;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public cr70(UiStateDrawableWrapper uiStateDrawableWrapper, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = uiStateDrawableWrapper;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr70)) {
            return false;
        }
        cr70 cr70Var = (cr70) obj;
        return jl40.l(this.a, cr70Var.a) && jl40.l(this.b, cr70Var.b) && jl40.l(this.c, cr70Var.c) && this.d == cr70Var.d;
    }

    public final int hashCode() {
        UiStateDrawableWrapper uiStateDrawableWrapper = this.a;
        return Boolean.hashCode(this.d) + smw0.b(smw0.b((uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "HeaderItem(image=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", hasBigImage=" + this.d + Extension.C_BRAKE;
    }
}
