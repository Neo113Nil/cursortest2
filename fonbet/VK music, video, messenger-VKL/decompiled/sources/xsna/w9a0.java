package xsna;

import com.vk.dto.common.ImageSize;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PhotoGridItemUiDto.kt */
/* loaded from: classes4.dex */
public final class w9a0 extends v64<PhotoAttachment> {
    public final PhotoAttachment e;
    public final List<ImageSize> f;
    public final boolean g;
    public final int h;
    public final int i;

    public w9a0(PhotoAttachment photoAttachment, ArrayList arrayList, boolean z, int i, int i2) {
        super(0, photoAttachment, i, i2);
        this.e = photoAttachment;
        this.f = arrayList;
        this.g = z;
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
    public final int d() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9a0)) {
            return false;
        }
        w9a0 w9a0Var = (w9a0) obj;
        return epx.f(this.e, w9a0Var.e) && epx.f(this.f, w9a0Var.f) && this.g == w9a0Var.g && this.h == w9a0Var.h && this.i == w9a0Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + shy.a(this.h, qoy.b(fw3.a(this.e.hashCode() * 31, 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoGridItemUiDto(attachment=");
        sb.append(this.e);
        sb.append(", remoteImage=");
        sb.append(this.f);
        sb.append(", hasTags=");
        sb.append(this.g);
        sb.append(", width=");
        sb.append(this.h);
        sb.append(", height=");
        return vu5.b(sb, this.i, ')');
    }
}
