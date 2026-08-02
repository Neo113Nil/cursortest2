package xsna;

import com.vk.dto.newsfeed.entries.Post;

/* compiled from: DeletedSuggestedPostFooterHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class wvl extends ol60 {
    public final Post h;
    public final boolean i;
    public final boolean j;

    public wvl(Post post, boolean z, boolean z2) {
        super(1123, 0, 0, 0, null);
        this.h = post;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvl)) {
            return false;
        }
        wvl wvlVar = (wvl) obj;
        return epx.f(this.h, wvlVar.h) && this.i == wvlVar.i && this.j == wvlVar.j;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qoy.b(qoy.b(this.h.hashCode() * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeletedSuggestedPostFooterHolderUiDto(post=");
        sb.append(this.h);
        sb.append(", isAuthorBanned=");
        sb.append(this.i);
        sb.append(", isReported=");
        return n23.b(sb, this.j, ", seqId=0)");
    }
}
