package defpackage;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class f7j {
    public final CharSequence a;
    public final CharSequence b;
    public final UiStateDrawableWrapper c;
    public final DetailsCardListItem.a d;
    public final boolean e;
    public final boolean f;
    public final ibk0 g;

    static {
        DetailsCardListItem.a aVar = DetailsCardListItem.a.g;
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public f7j(ibk0 ibk0Var, DetailsCardListItem.a aVar, CharSequence charSequence, CharSequence charSequence2, UiStateDrawableWrapper uiStateDrawableWrapper, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = uiStateDrawableWrapper;
        this.d = aVar;
        this.e = z;
        this.f = z2;
        this.g = ibk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7j)) {
            return false;
        }
        f7j f7jVar = (f7j) obj;
        return jl40.l(this.a, f7jVar.a) && jl40.l(this.b, f7jVar.b) && jl40.l(this.c, f7jVar.c) && jl40.l(this.d, f7jVar.d) && this.e == f7jVar.e && this.f == f7jVar.f && jl40.l(this.g, f7jVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.g.hashCode() + unr0.e(unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "RoutePoint(title=", ", subtitle=", ", leadIcon=");
        r.append(this.c);
        r.append(", style=");
        r.append(this.d);
        r.append(", isLoading=");
        nnm.v(", isRemoteStyle=", ", onClickAction=", r, this.e, this.f);
        r.append(this.g);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
