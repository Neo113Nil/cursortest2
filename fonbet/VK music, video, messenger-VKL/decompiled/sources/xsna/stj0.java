package xsna;

import com.vk.dto.common.Image;

/* compiled from: SingleDocumentThumbnailHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class stj0 extends ol60 {
    public final mun h;
    public final Image i;
    public final boolean j;
    public final boolean k;
    public final int l;

    public stj0(mun munVar, Image image, boolean z, boolean z2, int i) {
        super(i, 0, 0, 0, null);
        this.h = munVar;
        this.i = image;
        this.j = z;
        this.k = z2;
        this.l = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stj0)) {
            return false;
        }
        stj0 stj0Var = (stj0) obj;
        return epx.f(this.h, stj0Var.h) && epx.f(this.i, stj0Var.i) && this.j == stj0Var.j && this.k == stj0Var.k && this.l == stj0Var.l;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        Image image = this.i;
        return Integer.hashCode(0) + shy.a(this.l, qoy.b(qoy.b((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.j), 31, this.k), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleDocumentThumbnailHolderUiDto(documentThumbnailHolderUiDto=");
        sb.append(this.h);
        sb.append(", image=");
        sb.append(this.i);
        sb.append(", isGif=");
        sb.append(this.j);
        sb.append(", hasAnimation=");
        sb.append(this.k);
        sb.append(", holderViewType=");
        return h5s.c(this.l, ", seqId=0)", sb);
    }
}
