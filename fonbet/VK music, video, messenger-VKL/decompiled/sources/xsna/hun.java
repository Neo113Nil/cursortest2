package xsna;

import com.vkontakte.android.attachments.DocumentAttachment;

/* compiled from: DocumentThumbGridItemUiDto.kt */
/* loaded from: classes4.dex */
public final class hun extends v64<DocumentAttachment> {
    public final DocumentAttachment e;
    public final mun f;
    public final int g;
    public final int h;
    public final int i;

    public hun(DocumentAttachment documentAttachment, mun munVar, int i, int i2, int i3) {
        super(i3, documentAttachment, i, i2);
        this.e = documentAttachment;
        this.f = munVar;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    @Override // xsna.v64
    public final DocumentAttachment a() {
        return this.e;
    }

    @Override // xsna.v64
    public final int b() {
        return this.h;
    }

    @Override // xsna.v64
    public final int c() {
        return this.i;
    }

    @Override // xsna.v64
    public final int d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hun)) {
            return false;
        }
        hun hunVar = (hun) obj;
        return epx.f(this.e, hunVar.e) && epx.f(this.f, hunVar.f) && this.g == hunVar.g && this.h == hunVar.h && this.i == hunVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + shy.a(this.h, shy.a(this.g, (this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocumentThumbGridItemUiDto(attachment=");
        sb.append(this.e);
        sb.append(", documentThumbnailHolderUiDto=");
        sb.append(this.f);
        sb.append(", width=");
        sb.append(this.g);
        sb.append(", height=");
        sb.append(this.h);
        sb.append(", viewType=");
        return vu5.b(sb, this.i, ')');
    }
}
