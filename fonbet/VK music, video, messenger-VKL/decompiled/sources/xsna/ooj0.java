package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: SimilarVideoUiState.kt */
/* loaded from: classes7.dex */
public final class ooj0 {
    public final foj0 a;
    public final VideoFile b;

    public ooj0(foj0 foj0Var, VideoFile videoFile) {
        this.a = foj0Var;
        this.b = videoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ooj0)) {
            return false;
        }
        ooj0 ooj0Var = (ooj0) obj;
        return epx.f(this.a, ooj0Var.a) && epx.f(this.b, ooj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarVideoUiState(videoCardState=");
        sb.append(this.a);
        sb.append(", videoFile=");
        return lq.a(sb, this.b, ')');
    }
}
