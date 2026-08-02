package defpackage;

import com.yandex.go.address.models.PlaceType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes5.dex */
public final class l2x extends w2x {
    public final UiStateDrawableWrapper b;
    public final UiStateDrawableWrapper c;
    public final PlaceType d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public l2x(UiStateDrawableWrapper uiStateDrawableWrapper, UiStateDrawableWrapper uiStateDrawableWrapper2, PlaceType placeType, String str, boolean z, boolean z2) {
        super(ViewType.ADD_FAVORITE_ADDRESS);
        this.b = uiStateDrawableWrapper;
        this.c = uiStateDrawableWrapper2;
        this.d = placeType;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2x)) {
            return false;
        }
        l2x l2xVar = (l2x) obj;
        return jl40.l(this.b, l2xVar.b) && jl40.l(this.c, l2xVar.c) && this.d == l2xVar.d && jl40.l(this.e, l2xVar.e) && this.f == l2xVar.f && this.g == l2xVar.g && jl40.l(this.h, l2xVar.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.e(unr0.e(unr0.b((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddFavorite(leadImage=");
        sb.append(this.b);
        sb.append(", trailImage=");
        sb.append(this.c);
        sb.append(", placeType=");
        sb.append(this.d);
        sb.append(", buttonText=");
        sb.append(this.e);
        sb.append(", withDatumSync=");
        nnm.v(", withDivider=", ", id=", sb, this.f, this.g);
        return oyr.t(sb, this.h, Extension.C_BRAKE);
    }
}
