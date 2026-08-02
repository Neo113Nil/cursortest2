package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.Post;

/* compiled from: InlineCommentTextHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class g0x extends ol60 {
    public final Post h;
    public final Comment i;
    public final Owner j;
    public final String k;
    public final String l;
    public final int m;
    public final CharSequence n;
    public final CharSequence o;
    public final String p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final VerifyInfo t;
    public final int u;

    public g0x(Post post, Comment comment, Owner owner, String str, String str2, int i, CharSequence charSequence, CharSequence charSequence2, String str3, String str4, boolean z, boolean z2, VerifyInfo verifyInfo, int i2) {
        super(60, 0, i2, 0, null);
        this.h = post;
        this.i = comment;
        this.j = owner;
        this.k = str;
        this.l = str2;
        this.m = i;
        this.n = charSequence;
        this.o = charSequence2;
        this.p = str3;
        this.q = str4;
        this.r = z;
        this.s = z2;
        this.t = verifyInfo;
        this.u = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0x)) {
            return false;
        }
        g0x g0xVar = (g0x) obj;
        return epx.f(this.h, g0xVar.h) && epx.f(this.i, g0xVar.i) && epx.f(this.j, g0xVar.j) && epx.f(this.k, g0xVar.k) && epx.f(this.l, g0xVar.l) && this.m == g0xVar.m && epx.f(this.n, g0xVar.n) && epx.f(this.o, g0xVar.o) && epx.f(this.p, g0xVar.p) && epx.f(this.q, g0xVar.q) && this.r == g0xVar.r && this.s == g0xVar.s && epx.f(this.t, g0xVar.t) && this.u == g0xVar.u;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.u;
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + (this.h.hashCode() * 31)) * 31;
        Owner owner = this.j;
        int a = urd0.a((hashCode + (owner == null ? 0 : owner.hashCode())) * 31, 31, this.k);
        String str = this.l;
        int a2 = shy.a(this.m, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
        CharSequence charSequence = this.n;
        int hashCode2 = (a2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.o;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str2 = this.p;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.q;
        int b = qoy.b(qoy.b((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.r), 31, this.s);
        VerifyInfo verifyInfo = this.t;
        return Integer.hashCode(this.u) + ((b + (verifyInfo != null ? verifyInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InlineCommentTextHolderUiDto(post=");
        sb.append(this.h);
        sb.append(", comment=");
        sb.append(this.i);
        sb.append(", user=");
        sb.append(this.j);
        sb.append(", name=");
        sb.append(this.k);
        sb.append(", commentText=");
        sb.append(this.l);
        sb.append(", commentStartPadding=");
        sb.append(this.m);
        sb.append(", parsedText=");
        sb.append((Object) this.n);
        sb.append(", strippedText=");
        sb.append((Object) this.o);
        sb.append(", attachmentsText=");
        sb.append(this.p);
        sb.append(", fromUserAvatarUrl=");
        sb.append(this.q);
        sb.append(", isDonUser=");
        sb.append(this.r);
        sb.append(", isGeoBlockedUser=");
        sb.append(this.s);
        sb.append(", verifyInfo=");
        sb.append(this.t);
        sb.append(", seqId=");
        return vu5.b(sb, this.u, ')');
    }
}
