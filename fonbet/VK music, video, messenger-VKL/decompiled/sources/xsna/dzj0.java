package xsna;

import com.vk.dto.newsfeed.entries.Digest;

/* compiled from: SkeletonWithRetryFooterHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class dzj0 extends ol60 {
    public final Digest h;
    public final bwy i;

    public dzj0(Digest digest, bwy bwyVar) {
        super(285, 0, 0, 0, null);
        this.h = digest;
        this.i = bwyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzj0)) {
            return false;
        }
        dzj0 dzj0Var = (dzj0) obj;
        return epx.f(this.h, dzj0Var.h) && epx.f(this.i, dzj0Var.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SkeletonWithRetryFooterHolderUiDto(digest=" + this.h + ", lazyLoadState=" + this.i + ", seqId=0)";
    }
}
