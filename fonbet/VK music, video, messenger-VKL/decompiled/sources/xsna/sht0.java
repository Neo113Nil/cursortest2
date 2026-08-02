package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: VideoSource.kt */
/* loaded from: classes8.dex */
public abstract class sht0 {
    public final VideoContentType a;
    public final Uri b;
    public final boolean c;

    public sht0(VideoContentType videoContentType, Uri uri, boolean z) {
        this.a = videoContentType;
        this.b = uri;
        this.c = z;
    }

    public static Uri c(Uri uri, String str) {
        return uri.buildUpon().authority(str).build();
    }

    public final VideoContentType a() {
        return this.a;
    }

    public final Uri b() {
        return this.b;
    }

    public abstract sht0 d(String str);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        sht0 sht0Var = (sht0) obj;
        return epx.f(this.b, sht0Var.b) && this.a == sht0Var.a && this.c == sht0Var.c;
    }

    public int hashCode() {
        return Boolean.hashCode(this.c) + ((this.a.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VideoSource(type: " + this.a + ", isLive: " + this.c + ", uri: " + this.b + ")";
    }

    public sht0(sht0 sht0Var) {
        this(sht0Var.a, sht0Var.b, sht0Var.c);
    }
}
