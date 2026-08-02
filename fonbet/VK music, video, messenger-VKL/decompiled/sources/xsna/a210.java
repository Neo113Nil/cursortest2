package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;

/* compiled from: MarketItemListItem.kt */
/* loaded from: classes18.dex */
public final class a210 implements hfz {
    public final long b;
    public final UserId c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Photo h;
    public final boolean i;
    public final boolean j;
    public boolean k;
    public final String l;
    public final String m;
    public final String n;

    public a210(long j, UserId userId, String str, String str2, String str3, String str4, Photo photo, boolean z, boolean z2, boolean z3, String str5, String str6, String str7) {
        this.b = j;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = photo;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str5;
        this.m = str6;
        this.n = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a210)) {
            return false;
        }
        a210 a210Var = (a210) obj;
        return this.b == a210Var.b && epx.f(this.c, a210Var.c) && epx.f(this.d, a210Var.d) && epx.f(this.e, a210Var.e) && epx.f(this.f, a210Var.f) && epx.f(this.g, a210Var.g) && epx.f(this.h, a210Var.h) && this.i == a210Var.i && this.j == a210Var.j && this.k == a210Var.k && epx.f(this.l, a210Var.l) && epx.f(this.m, a210Var.m) && epx.f(this.n, a210Var.n);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int a2 = urd0.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        Photo photo = this.h;
        int a3 = urd0.a(urd0.a(qoy.b(qoy.b(qoy.b((a2 + (photo == null ? 0 : photo.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str3 = this.n;
        return (a3 + (str3 != null ? str3.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItem(itemId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", loyaltyPrice=");
        sb.append(this.e);
        sb.append(", oldPrice=");
        sb.append(this.f);
        sb.append(", price=");
        sb.append(this.g);
        sb.append(", imageUrl=");
        sb.append(this.h);
        sb.append(", isOwner=");
        sb.append(this.i);
        sb.append(", isAdult=");
        sb.append(this.j);
        sb.append(", isFavorite=");
        sb.append(this.k);
        sb.append(", link=");
        sb.append(this.l);
        sb.append(", target=");
        sb.append(this.m);
        sb.append(", adsLabel=");
        return i5s.a(sb, this.n, ", owner=null, itemRating=null)");
    }
}
