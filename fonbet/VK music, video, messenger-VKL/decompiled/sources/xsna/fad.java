package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.newsfeed.entries.Post;

/* compiled from: ClipPostHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class fad extends ol60 {
    public final efd h;
    public final ClipVideoFile i;
    public final Post j;
    public final boolean k;
    public final String l;
    public final String m;
    public final boolean n;
    public final int o;

    public fad(efd efdVar, ClipVideoFile clipVideoFile, Post post, boolean z, String str, String str2, boolean z2, int i) {
        super(i, 0, 0, 0, null);
        this.h = efdVar;
        this.i = clipVideoFile;
        this.j = post;
        this.k = z;
        this.l = str;
        this.m = str2;
        this.n = z2;
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fad)) {
            return false;
        }
        fad fadVar = (fad) obj;
        return epx.f(this.h, fadVar.h) && epx.f(this.i, fadVar.i) && epx.f(this.j, fadVar.j) && this.k == fadVar.k && epx.f(this.l, fadVar.l) && epx.f(this.m, fadVar.m) && this.n == fadVar.n && this.o == fadVar.o;
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
        int hashCode3 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        return Integer.hashCode(0) + shy.a(this.o, qoy.b((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.n), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipPostHolderUiDto(clipVideoHolderUiDto=");
        sb.append(this.h);
        sb.append(", clipVideoFile=");
        sb.append(this.i);
        sb.append(", postEntry=");
        sb.append(this.j);
        sb.append(", withClipOwner=");
        sb.append(this.k);
        sb.append(", clipOwnerName=");
        sb.append(this.l);
        sb.append(", clipOwnerPhoto=");
        sb.append(this.m);
        sb.append(", isVerified=");
        sb.append(this.n);
        sb.append(", clipViewType=");
        return h5s.c(this.o, ", seqId=0)", sb);
    }
}
