package xsna;

import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: PostCoownersHeaderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class g1c0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final CharSequence j;
    public final CharSequence k;
    public final Owner l;
    public final Owner m;
    public final int n;
    public final NewsfeedCoowners o;
    public final c4c0 p;
    public final List<Description> q;
    public final boolean r;
    public final int s;
    public final boolean t;

    public g1c0(NewsEntry newsEntry, NewsEntry newsEntry2, String str, String str2, Owner owner, Owner owner2, int i, NewsfeedCoowners newsfeedCoowners, c4c0 c4c0Var, List list, boolean z, int i2, boolean z2) {
        super(i2, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = str;
        this.k = str2;
        this.l = owner;
        this.m = owner2;
        this.n = i;
        this.o = newsfeedCoowners;
        this.p = c4c0Var;
        this.q = list;
        this.r = z;
        this.s = i2;
        this.t = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1c0)) {
            return false;
        }
        g1c0 g1c0Var = (g1c0) obj;
        return epx.f(this.h, g1c0Var.h) && epx.f(this.i, g1c0Var.i) && epx.f(this.j, g1c0Var.j) && epx.f(this.k, g1c0Var.k) && epx.f(this.l, g1c0Var.l) && epx.f(this.m, g1c0Var.m) && this.n == g1c0Var.n && epx.f(this.o, g1c0Var.o) && epx.f(this.p, g1c0Var.p) && epx.f(this.q, g1c0Var.q) && this.r == g1c0Var.r && this.s == g1c0Var.s && this.t == g1c0Var.t;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int c = u11.c(e630.b(this.h.hashCode() * 31, 31, this.i), 31, this.j);
        CharSequence charSequence = this.k;
        return Boolean.hashCode(this.t) + shy.a(this.s, shy.a(0, qoy.b(fw3.a((this.p.hashCode() + ((this.o.hashCode() + shy.a(this.n, (this.m.hashCode() + ((this.l.hashCode() + ((c + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31, this.q), 31, this.r), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostCoownersHeaderHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", ownerName=");
        sb.append((Object) this.j);
        sb.append(", coownerName=");
        sb.append((Object) this.k);
        sb.append(", owner=");
        sb.append(this.l);
        sb.append(", coowner=");
        sb.append(this.m);
        sb.append(", coownersCount=");
        sb.append(this.n);
        sb.append(", coowners=");
        sb.append(this.o);
        sb.append(", postInfo=");
        sb.append(this.p);
        sb.append(", descriptions=");
        sb.append(this.q);
        sb.append(", shouldAnimateDescriptions=");
        sb.append(this.r);
        sb.append(", seqId=0, type=");
        sb.append(this.s);
        sb.append(", isPinned=");
        return defpackage.q0.a(sb, this.t, ')');
    }
}
