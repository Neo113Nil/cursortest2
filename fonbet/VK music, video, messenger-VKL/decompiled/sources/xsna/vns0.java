package xsna;

import com.vk.newsfeed.common.presentation.model.items.attachments.video.VideoSimpleHolderUiDto;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: VideoGridItemUiDto.kt */
/* loaded from: classes4.dex */
public final class vns0 extends v64<VideoAttachment> {
    public final VideoSimpleHolderUiDto e;
    public final VideoAttachment f;
    public final int g;
    public final int h;

    public vns0(VideoSimpleHolderUiDto videoSimpleHolderUiDto, VideoAttachment videoAttachment, int i, int i2) {
        super(1, videoAttachment, i, i2);
        this.e = videoSimpleHolderUiDto;
        this.f = videoAttachment;
        this.g = i;
        this.h = i2;
    }

    @Override // xsna.v64
    public final VideoAttachment a() {
        return this.f;
    }

    @Override // xsna.v64
    public final int b() {
        return this.h;
    }

    @Override // xsna.v64
    public final int c() {
        return 1;
    }

    @Override // xsna.v64
    public final int d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vns0)) {
            return false;
        }
        vns0 vns0Var = (vns0) obj;
        return this.e.equals(vns0Var.e) && this.f.equals(vns0Var.f) && this.g == vns0Var.g && this.h == vns0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + shy.a(this.g, shy.a(1, (this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGridItemUiDto(videoSimpleHolderUiDto=");
        sb.append(this.e);
        sb.append(", attachment=");
        sb.append(this.f);
        sb.append(", viewType=1, width=");
        sb.append(this.g);
        sb.append(", height=");
        return vu5.b(sb, this.h, ')');
    }
}
