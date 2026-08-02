package xsna;

import android.net.Uri;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.core.models.product.ProductItemType;
import com.vk.ecomm.core.models.product.ProductPrice;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;

/* compiled from: TagLink.kt */
/* loaded from: classes18.dex */
public final class n0o0 {
    public final String a;
    public final String b;
    public final String c;
    public final Photo d;
    public final a e;
    public final String f;
    public final boolean g;

    /* compiled from: TagLink.kt */
    public static final class a {
        public final ProductPrice a;
        public final rnd0 b;
        public final ProductItemType c;
        public final jpd0 d;
        public final String e;

        public a(ProductPrice productPrice, rnd0 rnd0Var, ProductItemType productItemType, jpd0 jpd0Var, String str) {
            this.a = productPrice;
            this.b = rnd0Var;
            this.c = productItemType;
            this.d = jpd0Var;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            rnd0 rnd0Var = this.b;
            int hashCode2 = (hashCode + (rnd0Var == null ? 0 : rnd0Var.hashCode())) * 31;
            ProductItemType productItemType = this.c;
            int hashCode3 = (hashCode2 + (productItemType == null ? 0 : productItemType.hashCode())) * 31;
            jpd0 jpd0Var = this.d;
            int hashCode4 = (hashCode3 + (jpd0Var == null ? 0 : jpd0Var.hashCode())) * 31;
            String str = this.e;
            return hashCode4 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Product(price=");
            sb.append(this.a);
            sb.append(", category=");
            sb.append(this.b);
            sb.append(", itemType=");
            sb.append(this.c);
            sb.append(", itemRating=");
            sb.append(this.d);
            sb.append(", adsLabel=");
            return ho8.a(sb, this.e, ')');
        }
    }

    public n0o0(String str, String str2, String str3, Photo photo, a aVar, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = photo;
        this.e = aVar;
        this.f = str4;
        this.g = z;
    }

    public final String a(Long l, Integer num, CommonMarketStat$TypeMarketContextContent.Type type, String str) {
        return Uri.parse(this.b).buildUpon().appendQueryParameter("parent_content_owner_id", l != null ? l.toString() : null).appendQueryParameter("parent_content_id", num != null ? num.toString() : null).appendQueryParameter("parent_content_type", type != null ? type.name() : null).appendQueryParameter("ref_source", str).build().toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n0o0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n0o0 n0o0Var = (n0o0) obj;
        return epx.f(this.a, n0o0Var.a) && epx.f(this.b, n0o0Var.b) && epx.f(this.c, n0o0Var.c) && epx.f(this.d, n0o0Var.d) && epx.f(this.e, n0o0Var.e) && this.g == n0o0Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int a2 = urd0.a(urd0.a((str != null ? str.hashCode() : 0) * 31, 31, this.b), 31, this.c);
        Photo photo = this.d;
        int hashCode = (a2 + (photo != null ? photo.hashCode() : 0)) * 31;
        a aVar = this.e;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TagLink(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", photo=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", target=");
        sb.append(this.f);
        sb.append(", isFavorite=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
