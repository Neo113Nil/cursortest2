package defpackage;

import com.yandex.go.address.models.FavoriteAddressesBannerItem;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ffp {
    public final List a;
    public final FavoriteAddressesBannerItem b;
    public final String c;
    public final e81 d;

    public ffp(List list, FavoriteAddressesBannerItem favoriteAddressesBannerItem, String str, e81 e81Var) {
        this.a = list;
        this.b = favoriteAddressesBannerItem;
        this.c = str;
        this.d = e81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffp)) {
            return false;
        }
        ffp ffpVar = (ffp) obj;
        return jl40.l(this.a, ffpVar.a) && jl40.l(this.b, ffpVar.b) && jl40.l(this.c, ffpVar.c) && jl40.l(this.d, ffpVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FavoriteAddressesBannerItem favoriteAddressesBannerItem = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (favoriteAddressesBannerItem == null ? 0 : favoriteAddressesBannerItem.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "FavoriteAddressesResult(addresses=" + this.a + ", bannerItem=" + this.b + ", toolbarTitle=" + this.c + ", addressTopDescription=" + this.d + Extension.C_BRAKE;
    }
}
