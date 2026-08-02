package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.newsfeed.entries.Post;

/* compiled from: ClipRepostHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class tbd extends ol60 {
    public final efd h;
    public final ClipVideoFile i;
    public final Post j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final int n;

    public tbd(efd efdVar, ClipVideoFile clipVideoFile, Post post, boolean z, String str, boolean z2, int i) {
        super(i, 0, 0, 0, null);
        this.h = efdVar;
        this.i = clipVideoFile;
        this.j = post;
        this.k = z;
        this.l = str;
        this.m = z2;
        this.n = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbd)) {
            return false;
        }
        tbd tbdVar = (tbd) obj;
        return epx.f(this.h, tbdVar.h) && epx.f(this.i, tbdVar.i) && epx.f(this.j, tbdVar.j) && this.k == tbdVar.k && epx.f(this.l, tbdVar.l) && this.m == tbdVar.m && this.n == tbdVar.n;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        ClipVideoFile clipVideoFile = this.i;
        int hashCode2 = (hashCode + (clipVideoFile == null ? 0 : clipVideoFile.hashCode())) * 31;
        Post post = this.j;
        int b = qoy.b((hashCode2 + (post == null ? 0 : post.hashCode())) * 31, 31, this.k);
        String str = this.l;
        return Integer.hashCode(0) + shy.a(this.n, qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.m), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipRepostHolderUiDto(clipVideoHolderUiDto=");
        sb.append(this.h);
        sb.append(", clipVideoFile=");
        sb.append(this.i);
        sb.append(", postEntry=");
        sb.append(this.j);
        sb.append(", withClipOwner=");
        sb.append(this.k);
        sb.append(", clipOwnerName=");
        sb.append(this.l);
        sb.append(", isVerified=");
        sb.append(this.m);
        sb.append(", clipViewType=");
        return h5s.c(this.n, ", seqId=0)", sb);
    }
}
