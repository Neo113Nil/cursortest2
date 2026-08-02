package xsna;

import com.vk.dto.photo.Photo;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PhotoBlurredRestrictedGridItemUiDto.kt */
/* loaded from: classes4.dex */
public final class p5a0 extends v64<PhotoAttachment> {
    public final PhotoAttachment e;
    public final Photo f;
    public final String g;
    public final int h;
    public final int i;

    public p5a0(PhotoAttachment photoAttachment, Photo photo, String str, int i, int i2) {
        super(11, photoAttachment, i, i2);
        this.e = photoAttachment;
        this.f = photo;
        this.g = str;
        this.h = i;
        this.i = i2;
    }

    @Override // xsna.v64
    public final PhotoAttachment a() {
        return this.e;
    }

    @Override // xsna.v64
    public final int b() {
        return this.i;
    }

    @Override // xsna.v64
    public final int c() {
        return 11;
    }

    @Override // xsna.v64
    public final int d() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5a0)) {
            return false;
        }
        p5a0 p5a0Var = (p5a0) obj;
        return this.e.equals(p5a0Var.e) && epx.f(this.f, p5a0Var.f) && epx.f(this.g, p5a0Var.g) && this.h == p5a0Var.h && this.i == p5a0Var.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + (this.e.hashCode() * 31)) * 31;
        String str = this.g;
        return Integer.hashCode(this.i) + shy.a(this.h, shy.a(11, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoBlurredRestrictedGridItemUiDto(attachment=");
        sb.append(this.e);
        sb.append(", photo=");
        sb.append(this.f);
        sb.append(", thumbUrl=");
        sb.append(this.g);
        sb.append(", viewType=11, width=");
        sb.append(this.h);
        sb.append(", height=");
        return vu5.b(sb, this.i, ')');
    }
}
