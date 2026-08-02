package defpackage;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class n5j {
    public static final n5j i;
    public final CharSequence a;
    public final CharSequence b;
    public final UiStateDrawableWrapper c;
    public final DetailsCardListItem.a d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ibk0 h;

    static {
        UiStateDrawableWrapper uiStateDrawableWrapper;
        DetailsCardListItem.a aVar = DetailsCardListItem.a.g;
        UiStateDrawableWrapper.Companion.getClass();
        uiStateDrawableWrapper = UiStateDrawableWrapper.EMPTY;
        DetailsCardListItem.a aVar2 = DetailsCardListItem.a.g;
        i = new n5j(null, null, uiStateDrawableWrapper, DetailsCardListItem.a.g, false, false, false, s9k0.a);
    }

    public n5j(CharSequence charSequence, CharSequence charSequence2, UiStateDrawableWrapper uiStateDrawableWrapper, DetailsCardListItem.a aVar, boolean z, boolean z2, boolean z3, ibk0 ibk0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = uiStateDrawableWrapper;
        this.d = aVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = ibk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5j)) {
            return false;
        }
        n5j n5jVar = (n5j) obj;
        return jl40.l(this.a, n5jVar.a) && jl40.l(this.b, n5jVar.b) && jl40.l(this.c, n5jVar.c) && jl40.l(this.d, n5jVar.d) && this.e == n5jVar.e && this.f == n5jVar.f && this.g == n5jVar.g && jl40.l(this.h, n5jVar.h);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return this.h.hashCode() + unr0.e(unr0.e(unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "DetailsCardDestinationUiState(title=", ", subtitle=", ", leadIcon=");
        r.append(this.c);
        r.append(", style=");
        r.append(this.d);
        r.append(", isVisible=");
        nnm.v(", isLoading=", ", isRemoteStyle=", r, this.e, this.f);
        r.append(this.g);
        r.append(", onClickAction=");
        r.append(this.h);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
