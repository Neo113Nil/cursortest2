package xsna;

import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;

/* compiled from: VideoRelatedVideoItem.kt */
/* loaded from: classes7.dex */
public final class mbt0 implements hfz {
    public final VideoFile b;
    public final DonutVideoUiModel c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public mbt0(VideoFile videoFile, DonutVideoUiModel donutVideoUiModel, boolean z, boolean z2, String str) {
        this.b = videoFile;
        this.c = donutVideoUiModel;
        this.d = z;
        this.e = z2;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbt0)) {
            return false;
        }
        mbt0 mbt0Var = (mbt0) obj;
        return epx.f(this.b, mbt0Var.b) && epx.f(this.c, mbt0Var.c) && this.d == mbt0Var.d && this.e == mbt0Var.e && epx.f(this.f, mbt0Var.f);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.o0());
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        DonutVideoUiModel donutVideoUiModel = this.c;
        int b = qoy.b(qoy.b((hashCode + (donutVideoUiModel == null ? 0 : donutVideoUiModel.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRelatedVideoItem(video=");
        sb.append(this.b);
        sb.append(", donutVideoUiModel=");
        sb.append(this.c);
        sb.append(", isCurrentInPlayer=");
        sb.append(this.d);
        sb.append(", isPlaying=");
        sb.append(this.e);
        sb.append(", ref=");
        return ho8.a(sb, this.f, ')');
    }
}
