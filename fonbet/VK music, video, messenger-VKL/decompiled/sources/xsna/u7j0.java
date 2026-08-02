package xsna;

import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: ShareState.kt */
/* loaded from: classes7.dex */
public final class u7j0 implements km50 {
    public final VideoFile b;
    public final String c;
    public final List<n9j0> d;
    public final int e;
    public final boolean f;

    public u7j0(VideoFile videoFile, String str, List<n9j0> list, int i, boolean z) {
        this.b = videoFile;
        this.c = str;
        this.d = list;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7j0)) {
            return false;
        }
        u7j0 u7j0Var = (u7j0) obj;
        return epx.f(this.b, u7j0Var.b) && epx.f(this.c, u7j0Var.c) && epx.f(this.d, u7j0Var.d) && this.e == u7j0Var.e && this.f == u7j0Var.f;
    }

    public final int hashCode() {
        VideoFile videoFile = this.b;
        return Boolean.hashCode(this.f) + shy.a(this.e, fw3.a(urd0.a((videoFile == null ? 0 : videoFile.hashCode()) * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareState(videoFile=");
        sb.append(this.b);
        sb.append(", shareLink=");
        sb.append(this.c);
        sb.append(", externalApps=");
        sb.append(this.d);
        sb.append(", shareTimeSec=");
        sb.append(this.e);
        sb.append(", shareTimeChecked=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
