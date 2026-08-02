package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class pdk0 implements zjk0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final int e;
    public final UiStateDrawableWrapper f;
    public final w8i0 g;
    public final ibk0 h;
    public final akk0 i;

    static {
        int i = w8i0.c;
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public pdk0(String str, String str2, CharSequence charSequence, CharSequence charSequence2, int i, UiStateDrawableWrapper uiStateDrawableWrapper, w8i0 w8i0Var, ibk0 ibk0Var) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = i;
        this.f = uiStateDrawableWrapper;
        this.g = w8i0Var;
        this.h = ibk0Var;
        this.i = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdk0)) {
            return false;
        }
        pdk0 pdk0Var = (pdk0) obj;
        return jl40.l(this.a, pdk0Var.a) && jl40.l(this.b, pdk0Var.b) && jl40.l(this.c, pdk0Var.c) && jl40.l(this.d, pdk0Var.d) && this.e == pdk0Var.e && jl40.l(this.f, pdk0Var.f) && jl40.l(this.g, pdk0Var.g) && jl40.l(this.h, pdk0Var.h);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.i;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int b = oyr.b(this.e, (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31);
        UiStateDrawableWrapper uiStateDrawableWrapper = this.f;
        int hashCode4 = (b + (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode())) * 31;
        w8i0 w8i0Var = this.g;
        return this.h.hashCode() + ((hashCode4 + (w8i0Var != null ? w8i0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardCoherentRatingSelectorItemUiState(id=", this.a, ", analyticsId=", this.b, ", title=");
        vfc.A(v, this.c, ", subtitle=", this.d, ", rating=");
        v.append(this.e);
        v.append(", background=");
        v.append(this.f);
        v.append(", itemsDecoration=");
        v.append(this.g);
        v.append(", action=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
