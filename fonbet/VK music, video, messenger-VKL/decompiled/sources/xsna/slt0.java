package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoTrackerArgs.kt */
/* loaded from: classes17.dex */
public final class slt0 {
    public final VideoFile a;
    public final String b;

    public slt0(VideoFile videoFile, String str) {
        this.a = videoFile;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slt0)) {
            return false;
        }
        slt0 slt0Var = (slt0) obj;
        return epx.f(this.a, slt0Var.a) && epx.f(this.b, slt0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTrackerArgs(video=");
        sb.append(this.a);
        sb.append(", trackCode=");
        return ho8.a(sb, this.b, ')');
    }
}
