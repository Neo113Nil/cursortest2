package xsna;

import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;

/* compiled from: PostCoownersInviteBannerUiDto.kt */
/* loaded from: classes4.dex */
public final class m1c0 extends ol60 {
    public final Post h;
    public final Owner i;
    public final Owner j;
    public final CharSequence k;
    public final CharSequence l;
    public final CharSequence m;
    public final CharSequence n;
    public final String o;
    public final CoownershipStatusUiDto p;
    public final int q;

    public m1c0(Post post, Owner owner, Owner owner2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, String str, CoownershipStatusUiDto coownershipStatusUiDto, int i) {
        super(350, 0, i, 0, null);
        this.h = post;
        this.i = owner;
        this.j = owner2;
        this.k = charSequence;
        this.l = charSequence2;
        this.m = charSequence3;
        this.n = charSequence4;
        this.o = str;
        this.p = coownershipStatusUiDto;
        this.q = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1c0)) {
            return false;
        }
        m1c0 m1c0Var = (m1c0) obj;
        return epx.f(this.h, m1c0Var.h) && epx.f(this.i, m1c0Var.i) && epx.f(this.j, m1c0Var.j) && epx.f(this.k, m1c0Var.k) && epx.f(this.l, m1c0Var.l) && epx.f(this.m, m1c0Var.m) && epx.f(this.n, m1c0Var.n) && epx.f(this.o, m1c0Var.o) && this.p == m1c0Var.p && this.q == m1c0Var.q;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.q;
    }

    public final int hashCode() {
        int c = u11.c(u11.c(u11.c((this.j.hashCode() + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m);
        CharSequence charSequence = this.n;
        return Integer.hashCode(this.q) + ((this.p.hashCode() + urd0.a((c + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.o)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostCoownersInviteBannerUiDto(post=");
        sb.append(this.h);
        sb.append(", owner=");
        sb.append(this.i);
        sb.append(", coowner=");
        sb.append(this.j);
        sb.append(", inviteString=");
        sb.append((Object) this.k);
        sb.append(", acceptedTitle=");
        sb.append((Object) this.l);
        sb.append(", acceptedDescription=");
        sb.append((Object) this.m);
        sb.append(", ownerName=");
        sb.append((Object) this.n);
        sb.append(", rejectedPrivacyLink=");
        sb.append(this.o);
        sb.append(", coownershipInviteStatus=");
        sb.append(this.p);
        sb.append(", seqId=");
        return vu5.b(sb, this.q, ')');
    }
}
