package xsna;

import com.vk.dto.newsfeed.entries.Post;
import java.util.ArrayList;
import xsna.tlo0;

/* compiled from: PostLikesActivityHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class k4c0 extends ol60 {
    public final Post h;
    public final ArrayList i;
    public final ArrayList j;
    public final String k;
    public final boolean l;
    public final tlo0.h m;
    public final int n;

    public k4c0(Post post, ArrayList arrayList, ArrayList arrayList2, String str, boolean z, tlo0.h hVar, int i) {
        super(18, 0, 0, 0, null);
        this.h = post;
        this.i = arrayList;
        this.j = arrayList2;
        this.k = str;
        this.l = z;
        this.m = hVar;
        this.n = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4c0)) {
            return false;
        }
        k4c0 k4c0Var = (k4c0) obj;
        return epx.f(this.h, k4c0Var.h) && epx.f(this.i, k4c0Var.i) && epx.f(this.j, k4c0Var.j) && epx.f(this.k, k4c0Var.k) && this.l == k4c0Var.l && epx.f(this.m, k4c0Var.m) && this.n == k4c0Var.n;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = qr.a(this.j, qr.a(this.i, this.h.hashCode() * 31, 31), 31);
        String str = this.k;
        return Integer.hashCode(0) + shy.a(this.n, u11.c(qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.l), 31, this.m.a), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostLikesActivityHolderUiDto(post=");
        sb.append(this.h);
        sb.append(", images=");
        sb.append(this.i);
        sb.append(", imageUrls=");
        sb.append(this.j);
        sb.append(", likeAnimationUrl=");
        sb.append(this.k);
        sb.append(", isFriendLikesRedesign=");
        sb.append(this.l);
        sb.append(", text=");
        sb.append(this.m);
        sb.append(", userCount=");
        return h5s.c(this.n, ", seqId=0)", sb);
    }
}
