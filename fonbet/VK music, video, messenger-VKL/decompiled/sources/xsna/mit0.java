package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import java.util.List;
import xsna.wox;

/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class mit0 {
    public final VideoFile a;
    public final j4t0 b;
    public final drt0 c;
    public final List<Image> d;
    public final wox.a e;
    public final String f;
    public final boolean g;

    public mit0(VideoFile videoFile, j4t0 j4t0Var, drt0 drt0Var, List<Image> list, wox.a aVar, String str, boolean z) {
        this.a = videoFile;
        this.b = j4t0Var;
        this.c = drt0Var;
        this.d = list;
        this.e = aVar;
        this.f = str;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mit0)) {
            return false;
        }
        mit0 mit0Var = (mit0) obj;
        return epx.f(this.a, mit0Var.a) && epx.f(this.b, mit0Var.b) && epx.f(this.c, mit0Var.c) && epx.f(this.d, mit0Var.d) && epx.f(this.e, mit0Var.e) && epx.f(this.f, mit0Var.f) && this.g == mit0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        if (this.e != null) {
            throw null;
        }
        int i = hashCode * 961;
        String str = this.f;
        return Boolean.hashCode(this.g) + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoState(videoFile=");
        sb.append(this.a);
        sb.append(", playerState=");
        sb.append(this.b);
        sb.append(", viewState=");
        sb.append(this.c);
        sb.append(", similarVideosPreviews=");
        sb.append(this.d);
        sb.append(", intervalsData=");
        sb.append(this.e);
        sb.append(", sessionId=");
        sb.append(this.f);
        sb.append(", isModalOpened=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
