package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: VideoFullscreenBottomBarView.kt */
/* loaded from: classes2.dex */
public final class vxs {
    public final boolean a;
    public final boolean b;
    public final List<Image> c;
    public final VideoFile d;
    public final boolean e;
    public final boolean f;

    public vxs(boolean z, boolean z2, List<Image> list, VideoFile videoFile, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = videoFile;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxs)) {
            return false;
        }
        vxs vxsVar = (vxs) obj;
        return this.a == vxsVar.a && this.b == vxsVar.b && epx.f(this.c, vxsVar.c) && epx.f(this.d, vxsVar.d) && this.e == vxsVar.e && this.f == vxsVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(jq.b(this.d, fw3.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullscreenControlsState(isLandscape=");
        sb.append(this.a);
        sb.append(", isFullscreen=");
        sb.append(this.b);
        sb.append(", previews=");
        sb.append(this.c);
        sb.append(", videoFile=");
        sb.append(this.d);
        sb.append(", isInPlaylist=");
        sb.append(this.e);
        sb.append(", canAddToWatchLater=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
