package defpackage;

import com.yandex.go.address.models.FavoriteAddressesBannerItem;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lefp;", "", "Companion", "cfp", "dfp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class efp {
    public static final dfp Companion = new dfp();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(21)), null, null, null, null};
    public final List a;
    public final FavoriteAddressesBannerItem b;
    public final String c;
    public final e5f d;
    public final e81 e;

    public efp(int i, List list, FavoriteAddressesBannerItem favoriteAddressesBannerItem, String str, e5f e5fVar, e81 e81Var) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = favoriteAddressesBannerItem;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            e5f.Companion.getClass();
            this.d = e5f.e;
        } else {
            this.d = e5fVar;
        }
        if ((i & 16) == 0) {
            this.e = new e81(0);
        } else {
            this.e = e81Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efp)) {
            return false;
        }
        efp efpVar = (efp) obj;
        return jl40.l(this.a, efpVar.a) && jl40.l(this.b, efpVar.b) && jl40.l(this.c, efpVar.c) && jl40.l(this.d, efpVar.d) && jl40.l(this.e, efpVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FavoriteAddressesBannerItem favoriteAddressesBannerItem = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + unr0.b((hashCode + (favoriteAddressesBannerItem == null ? 0 : favoriteAddressesBannerItem.hashCode())) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "FavoriteAddressesResponse(addresses=" + this.a + ", bannerItem=" + this.b + ", title=" + this.c + ", createFavoriteAddressInfo=" + this.d + ", addressTopDescription=" + this.e + Extension.C_BRAKE;
    }

    public efp() {
        e5f.Companion.getClass();
        e5f e5fVar = e5f.e;
        e81 e81Var = new e81(0);
        this.a = EmptyList.a;
        this.b = null;
        this.c = "";
        this.d = e5fVar;
        this.e = e81Var;
    }
}
