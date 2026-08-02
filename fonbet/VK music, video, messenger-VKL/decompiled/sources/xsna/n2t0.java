package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoPickerItemData.kt */
/* loaded from: classes16.dex */
public final class n2t0 {
    public final VideoFile a;
    public final boolean b;
    public final boolean c;

    public n2t0(VideoFile videoFile, boolean z, boolean z2) {
        this.a = videoFile;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2t0)) {
            return false;
        }
        n2t0 n2t0Var = (n2t0) obj;
        return epx.f(this.a, n2t0Var.a) && this.b == n2t0Var.b && this.c == n2t0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPickerItemData(video=");
        sb.append(this.a);
        sb.append(", isChosen=");
        sb.append(this.b);
        sb.append(", isAvailable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
