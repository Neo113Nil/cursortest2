package xsna;

import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: VideoRelatedVideosChunk.kt */
/* loaded from: classes7.dex */
public final class rbt0 {
    public final int a;
    public final int b;
    public final int c;
    public final List<VideoFile> d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ rbt0(int i, int i2, int i3, int i4, List list) {
        this(i, i2, i3, list, (i4 & 16) == 0, (i4 & 32) == 0);
    }

    public final boolean a() {
        return (this.e || this.f) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbt0)) {
            return false;
        }
        rbt0 rbt0Var = (rbt0) obj;
        return this.a == rbt0Var.a && this.b == rbt0Var.b && this.c == rbt0Var.c && epx.f(this.d, rbt0Var.d) && this.e == rbt0Var.e && this.f == rbt0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(fw3.a(shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRelatedVideosChunk(offset=");
        sb.append(this.a);
        sb.append(", requestedSize=");
        sb.append(this.b);
        sb.append(", total=");
        sb.append(this.c);
        sb.append(", videos=");
        sb.append(this.d);
        sb.append(", isErrorOccurred=");
        sb.append(this.e);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rbt0(int i, int i2, int i3, List<? extends VideoFile> list, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
        this.e = z;
        this.f = z2;
    }
}
