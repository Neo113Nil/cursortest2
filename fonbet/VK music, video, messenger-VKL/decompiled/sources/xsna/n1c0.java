package xsna;

import com.vk.dto.newsfeed.Owner;

/* compiled from: PostCoownersRepostHeaderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class n1c0 extends ol60 {
    public final CharSequence h;
    public final CharSequence i;
    public final Owner j;
    public final Owner k;
    public final int l;
    public final Integer m;

    public n1c0(String str, String str2, Owner owner, Owner owner2, int i, Integer num) {
        super(330, 0, 0, 0, null);
        this.h = str;
        this.i = str2;
        this.j = owner;
        this.k = owner2;
        this.l = i;
        this.m = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1c0)) {
            return false;
        }
        n1c0 n1c0Var = (n1c0) obj;
        return epx.f(this.h, n1c0Var.h) && epx.f(this.i, n1c0Var.i) && epx.f(this.j, n1c0Var.j) && epx.f(this.k, n1c0Var.k) && this.l == n1c0Var.l && epx.f(this.m, n1c0Var.m);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        CharSequence charSequence = this.i;
        int a = shy.a(this.l, (this.k.hashCode() + ((this.j.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31, 31);
        Integer num = this.m;
        return Integer.hashCode(0) + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostCoownersRepostHeaderHolderUiDto(ownerName=");
        sb.append((Object) this.h);
        sb.append(", coownerName=");
        sb.append((Object) this.i);
        sb.append(", owner=");
        sb.append(this.j);
        sb.append(", coowner=");
        sb.append(this.k);
        sb.append(", coownersCount=");
        sb.append(this.l);
        sb.append(", date=");
        return oq.b(sb, this.m, ", seqId=0)");
    }
}
