package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.entries.Post;

/* compiled from: RepostOriginalHeaderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class a7g0 extends ol60 {
    public final Post h;
    public final String i;
    public final Image j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final Integer p;

    public a7g0(Post post, String str, Image image, String str2, boolean z, boolean z2, boolean z3, boolean z4, Integer num) {
        super(181, 0, 0, 0, null);
        this.h = post;
        this.i = str;
        this.j = image;
        this.k = str2;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7g0)) {
            return false;
        }
        a7g0 a7g0Var = (a7g0) obj;
        return epx.f(this.h, a7g0Var.h) && epx.f(this.i, a7g0Var.i) && epx.f(this.j, a7g0Var.j) && epx.f(this.k, a7g0Var.k) && this.l == a7g0Var.l && this.m == a7g0Var.m && this.n == a7g0Var.n && this.o == a7g0Var.o && epx.f(this.p, a7g0Var.p);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.j;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.k;
        int b = qoy.b(qoy.b(qoy.b(qoy.b((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        Integer num = this.p;
        return Integer.hashCode(0) + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepostOriginalHeaderHolderUiDto(item=");
        sb.append(this.h);
        sb.append(", photoUrl=");
        sb.append(this.i);
        sb.append(", photoImage=");
        sb.append(this.j);
        sb.append(", title=");
        sb.append(this.k);
        sb.append(", isGovernmentOrganization=");
        sb.append(this.l);
        sb.append(", isVerified=");
        sb.append(this.m);
        sb.append(", hasVerification=");
        sb.append(this.n);
        sb.append(", isTrending=");
        sb.append(this.o);
        sb.append(", date=");
        return oq.b(sb, this.p, ", seqId=0)");
    }
}
