package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;

/* compiled from: InteractiveVideoPlayerParams.kt */
/* loaded from: classes3.dex */
public final class ncx {
    public final ef6 a;
    public final ViewGroup b;
    public final VideoTextureView c;
    public final boolean d;
    public final boolean e;
    public final com.vk.libvideo.autoplay.a f;
    public final VideoFile g;

    public ncx(ef6 ef6Var, ViewGroup viewGroup, VideoTextureView videoTextureView, boolean z, boolean z2, com.vk.libvideo.autoplay.a aVar, VideoFile videoFile) {
        this.a = ef6Var;
        this.b = viewGroup;
        this.c = videoTextureView;
        this.d = z;
        this.e = z2;
        this.f = aVar;
        this.g = videoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncx)) {
            return false;
        }
        ncx ncxVar = (ncx) obj;
        return this.a.equals(ncxVar.a) && epx.f(this.b, ncxVar.b) && epx.f(this.c, ncxVar.c) && this.d == ncxVar.d && this.e == ncxVar.e && epx.f(this.f, ncxVar.f) && epx.f(this.g, ncxVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e)) * 31;
        VideoFile videoFile = this.g;
        return hashCode + (videoFile == null ? 0 : videoFile.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractiveVideoPlayerParams(interactiveVideoView=");
        sb.append(this.a);
        sb.append(", interactiveContainer=");
        sb.append(this.b);
        sb.append(", videoTextureView=");
        sb.append(this.c);
        sb.append(", isNotInterested=");
        sb.append(this.d);
        sb.append(", isRestricted=");
        sb.append(this.e);
        sb.append(", config=");
        sb.append(this.f);
        sb.append(", videoFile=");
        return lq.a(sb, this.g, ')');
    }
}
