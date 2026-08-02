package xsna;

import com.vk.dto.photo.Photo;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PhotoRestrictedGridItemUiDto.kt */
/* loaded from: classes4.dex */
public final class aba0 extends v64<PhotoAttachment> {
    public final PhotoAttachment e;
    public final Photo f;
    public final int g;
    public final int h;

    public aba0(PhotoAttachment photoAttachment, Photo photo, int i, int i2) {
        super(10, photoAttachment, i, i2);
        this.e = photoAttachment;
        this.f = photo;
        this.g = i;
        this.h = i2;
    }

    @Override // xsna.v64
    public final PhotoAttachment a() {
        return this.e;
    }

    @Override // xsna.v64
    public final int b() {
        return this.h;
    }

    @Override // xsna.v64
    public final int d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aba0)) {
            return false;
        }
        aba0 aba0Var = (aba0) obj;
        return epx.f(this.e, aba0Var.e) && epx.f(this.f, aba0Var.f) && this.g == aba0Var.g && this.h == aba0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + shy.a(this.g, (this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoRestrictedGridItemUiDto(attachment=");
        sb.append(this.e);
        sb.append(", photo=");
        sb.append(this.f);
        sb.append(", width=");
        sb.append(this.g);
        sb.append(", height=");
        return vu5.b(sb, this.h, ')');
    }
}
