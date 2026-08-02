package defpackage;

import com.ybsdk.feature.videoplayer.api.VideoPlayer$RepeatMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class mm31 {
    public final String a;
    public final VideoPlayer$RepeatMode b;
    public final boolean c;

    public mm31(String str, VideoPlayer$RepeatMode videoPlayer$RepeatMode, boolean z) {
        this.a = str;
        this.b = videoPlayer$RepeatMode;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm31)) {
            return false;
        }
        mm31 mm31Var = (mm31) obj;
        return this.a.equals(mm31Var.a) && this.b == mm31Var.b && this.c == mm31Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayerMediaItem(uri=");
        sb.append(this.a);
        sb.append(", repeatMode=");
        sb.append(this.b);
        sb.append(", playWhenReady=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
