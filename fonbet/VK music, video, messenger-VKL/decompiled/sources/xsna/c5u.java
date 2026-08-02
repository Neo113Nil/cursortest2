package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.clipproductattaches.models.GoodBadge;
import java.util.List;

/* compiled from: GoodItem.kt */
/* loaded from: classes18.dex */
public final class c5u implements pmc {
    public final long a;
    public final UserId b;
    public final String c;
    public final d5u d;
    public final int e;
    public final boolean f;
    public final Image g;
    public final c530 h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final p7u m;
    public final j5u n;
    public final List<GoodBadge> o;

    public c5u(long j, UserId userId, String str, d5u d5uVar, int i, boolean z, Image image, c530 c530Var, String str2, boolean z2, boolean z3, boolean z4, p7u p7uVar, j5u j5uVar, List<GoodBadge> list) {
        this.a = j;
        this.b = userId;
        this.c = str;
        this.d = d5uVar;
        this.e = i;
        this.f = z;
        this.g = image;
        this.h = c530Var;
        this.i = str2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = p7uVar;
        this.n = j5uVar;
        this.o = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5u)) {
            return false;
        }
        c5u c5uVar = (c5u) obj;
        return this.a == c5uVar.a && epx.f(this.b, c5uVar.b) && epx.f(this.c, c5uVar.c) && epx.f(this.d, c5uVar.d) && this.e == c5uVar.e && this.f == c5uVar.f && epx.f(this.g, c5uVar.g) && epx.f(this.h, c5uVar.h) && epx.f(this.i, c5uVar.i) && this.j == c5uVar.j && this.k == c5uVar.k && this.l == c5uVar.l && epx.f(this.m, c5uVar.m) && epx.f(this.n, c5uVar.n) && epx.f(this.o, c5uVar.o);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.e, (this.d.hashCode() + urd0.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b), 31, this.c)) * 31, 31), 31, this.f);
        Image image = this.g;
        int hashCode = (this.h.hashCode() + ((b + (image == null ? 0 : image.hashCode())) * 31)) * 31;
        String str = this.i;
        int b2 = qoy.b(qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l);
        p7u p7uVar = this.m;
        int hashCode2 = (b2 + (p7uVar == null ? 0 : p7uVar.hashCode())) * 31;
        j5u j5uVar = this.n;
        int hashCode3 = (hashCode2 + (j5uVar == null ? 0 : j5uVar.hashCode())) * 31;
        List<GoodBadge> list = this.o;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodItem(goodId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", price=");
        sb.append(this.d);
        sb.append(", discountRate=");
        sb.append(this.e);
        sb.append(", isService=");
        sb.append(this.f);
        sb.append(", imageUrl=");
        sb.append(this.g);
        sb.append(", moderation=");
        sb.append(this.h);
        sb.append(", adsLabel=");
        sb.append(this.i);
        sb.append(", isFave=");
        sb.append(this.j);
        sb.append(", rejectIsInProgress=");
        sb.append(this.k);
        sb.append(", isAvailable=");
        sb.append(this.l);
        sb.append(", itemRating=");
        sb.append(this.m);
        sb.append(", owner=");
        sb.append(this.n);
        sb.append(", badges=");
        return ms9.a(')', sb, this.o);
    }
}
