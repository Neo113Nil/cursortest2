package xsna;

import com.vk.dto.common.VideoFileOld;

/* compiled from: StartStreamingFile.kt */
/* loaded from: classes3.dex */
public final class vqk0 {
    public final VideoFileOld a;
    public final int b;

    public vqk0(int i, VideoFileOld videoFileOld) {
        this.a = videoFileOld;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqk0)) {
            return false;
        }
        vqk0 vqk0Var = (vqk0) obj;
        return this.a.equals(vqk0Var.a) && this.b == vqk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartStreamingFile(videoFile=");
        sb.append(this.a);
        sb.append(", postId=");
        return vu5.b(sb, this.b, ')');
    }
}
