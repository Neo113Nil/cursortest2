package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class dv11 implements fv11 {
    public final UiStateDrawableWrapper a;
    public final String b;
    public final CharSequence c;
    public final vu11 d;
    public final CharSequence e;
    public final vu11 f;

    public dv11(UiStateDrawableWrapper uiStateDrawableWrapper, String str, CharSequence charSequence, vu11 vu11Var, CharSequence charSequence2, vu11 vu11Var2) {
        this.a = uiStateDrawableWrapper;
        this.b = str;
        this.c = charSequence;
        this.d = vu11Var;
        this.e = charSequence2;
        this.f = vu11Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv11)) {
            return false;
        }
        dv11 dv11Var = (dv11) obj;
        return jl40.l(this.a, dv11Var.a) && jl40.l(this.b, dv11Var.b) && jl40.l(this.c, dv11Var.c) && jl40.l(this.d, dv11Var.d) && jl40.l(this.e, dv11Var.e) && jl40.l(this.f, dv11Var.f);
    }

    public final int hashCode() {
        UiStateDrawableWrapper uiStateDrawableWrapper = this.a;
        int hashCode = (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31;
        CharSequence charSequence2 = this.e;
        return this.f.hashCode() + ((hashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Content(titleDrawable=" + this.a + ", titleDrawableAccessibilityText=" + this.b + ", titleTrail=" + ((Object) this.c) + ", titleTrailAction=" + this.d + ", subtitle=" + ((Object) this.e) + ", subtitleClickAction=" + this.f + Extension.C_BRAKE;
    }
}
