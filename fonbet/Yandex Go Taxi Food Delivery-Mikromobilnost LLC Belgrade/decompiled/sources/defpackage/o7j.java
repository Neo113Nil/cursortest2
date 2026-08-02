package defpackage;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class o7j {
    public static final o7j h;
    public final CharSequence a;
    public final CharSequence b;
    public final UiStateDrawableWrapper c;
    public final DetailsCardListItem.a d;
    public final ibk0 e;
    public final boolean f;
    public final boolean g;

    static {
        UiStateDrawableWrapper uiStateDrawableWrapper;
        DetailsCardListItem.a aVar = DetailsCardListItem.a.g;
        UiStateDrawableWrapper.Companion.getClass();
        uiStateDrawableWrapper = UiStateDrawableWrapper.EMPTY;
        h = new o7j(s9k0.a, DetailsCardListItem.a.g, null, null, uiStateDrawableWrapper, false, false);
    }

    public o7j(ibk0 ibk0Var, DetailsCardListItem.a aVar, CharSequence charSequence, CharSequence charSequence2, UiStateDrawableWrapper uiStateDrawableWrapper, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = uiStateDrawableWrapper;
        this.d = aVar;
        this.e = ibk0Var;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7j)) {
            return false;
        }
        o7j o7jVar = (o7j) obj;
        return jl40.l(this.a, o7jVar.a) && jl40.l(this.b, o7jVar.b) && jl40.l(this.c, o7jVar.c) && jl40.l(this.d, o7jVar.d) && jl40.l(this.e, o7jVar.e) && this.f == o7jVar.f && this.g == o7jVar.g;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return Boolean.hashCode(this.g) + unr0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "DetailsCardSourceUiState(title=", ", subtitle=", ", leadIcon=");
        r.append(this.c);
        r.append(", style=");
        r.append(this.d);
        r.append(", onClickAction=");
        r.append(this.e);
        r.append(", isVisible=");
        r.append(this.f);
        r.append(", isLoading=");
        return x4e.i(r, this.g, Extension.C_BRAKE);
    }
}
