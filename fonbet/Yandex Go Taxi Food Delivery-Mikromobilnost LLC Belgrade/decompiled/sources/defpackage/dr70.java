package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class dr70 implements fr70 {
    public final UiStateDrawableWrapper a;
    public final CharSequence b;
    public final CharSequence c;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public dr70(UiStateDrawableWrapper uiStateDrawableWrapper, CharSequence charSequence, CharSequence charSequence2) {
        this.a = uiStateDrawableWrapper;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr70)) {
            return false;
        }
        dr70 dr70Var = (dr70) obj;
        return jl40.l(this.a, dr70Var.a) && jl40.l(this.b, dr70Var.b) && jl40.l(this.c, dr70Var.c);
    }

    public final int hashCode() {
        UiStateDrawableWrapper uiStateDrawableWrapper = this.a;
        return this.c.hashCode() + smw0.b((uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProminentHeaderItem(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
