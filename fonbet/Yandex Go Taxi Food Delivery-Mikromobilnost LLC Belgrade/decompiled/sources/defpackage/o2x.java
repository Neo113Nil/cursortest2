package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes5.dex */
public final class o2x extends w2x {
    public final UiStateDrawableWrapper b;
    public final UiStateDrawableWrapper c;
    public final FavoriteAddress d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2x(UiStateDrawableWrapper uiStateDrawableWrapper, UiStateDrawableWrapper uiStateDrawableWrapper2, FavoriteAddress favoriteAddress, boolean z, boolean z2, String str) {
        super(ViewType.FAVORITE_ADDRESS);
        String id = favoriteAddress.getId();
        this.b = uiStateDrawableWrapper;
        this.c = uiStateDrawableWrapper2;
        this.d = favoriteAddress;
        this.e = z;
        this.f = z2;
        this.g = str;
        this.h = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2x)) {
            return false;
        }
        o2x o2xVar = (o2x) obj;
        return jl40.l(this.b, o2xVar.b) && jl40.l(this.c, o2xVar.c) && jl40.l(this.d, o2xVar.d) && this.e == o2xVar.e && this.f == o2xVar.f && jl40.l(this.g, o2xVar.g) && jl40.l(this.h, o2xVar.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper = this.c;
        int e = unr0.e(unr0.e((this.d.hashCode() + ((hashCode + (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return this.h.hashCode() + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteAddress(fallbackLeadImage=");
        sb.append(this.b);
        sb.append(", trailImage=");
        sb.append(this.c);
        sb.append(", address=");
        sb.append(this.d);
        sb.append(", withDatumSync=");
        sb.append(this.e);
        sb.append(", withDivider=");
        unr0.A(", addressTypeDescription=", this.g, ", id=", sb, this.f);
        return oyr.t(sb, this.h, Extension.C_BRAKE);
    }
}
