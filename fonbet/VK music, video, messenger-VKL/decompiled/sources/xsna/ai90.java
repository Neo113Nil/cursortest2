package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.TypeScreen;

/* compiled from: VideoDiscoveryActionsTracker.kt */
/* loaded from: classes2.dex */
public final class ai90 {
    public final VideoFile a;
    public final TypeScreen b;
    public final String c;

    public ai90(VideoFile videoFile, TypeScreen typeScreen, String str) {
        this.a = videoFile;
        this.b = typeScreen;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai90)) {
            return false;
        }
        ai90 ai90Var = (ai90) obj;
        return epx.f(this.a, ai90Var.a) && this.b == ai90Var.b && epx.f(this.c, ai90Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        TypeScreen typeScreen = this.b;
        return this.c.hashCode() + ((hashCode + (typeScreen == null ? 0 : typeScreen.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(videoFile=");
        sb.append(this.a);
        sb.append(", typeScreen=");
        sb.append(this.b);
        sb.append(", sourceScreen=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ ai90(VideoFile videoFile, TypeScreen typeScreen) {
        this(videoFile, typeScreen, "video_discovery");
    }
}
