package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.media.MediaUtils;
import com.vk.media.player.video.VideoScale;
import java.io.File;
import java.util.Objects;

/* compiled from: VideoRawData.kt */
/* loaded from: classes15.dex */
public final class mat0 {
    public final File a;
    public final boolean b;
    public final long c;
    public final long d;
    public boolean e;
    public boolean f;
    public final boolean g;
    public Bitmap h;
    public Bitmap i;
    public volatile MediaUtils.f j;
    public final VideoScale k;

    public /* synthetic */ mat0(File file, boolean z, long j, long j2, boolean z2, MediaUtils.f fVar, int i) {
        this(file, z, j, j2, (i & 16) != 0 ? false : z2, true, false, (i & 256) != 0 ? null : fVar);
    }

    public final int a() {
        long j = this.d;
        if (j != 0) {
            return (int) (j - this.c);
        }
        MediaUtils.f fVar = this.j;
        if (fVar != null) {
            return fVar.f;
        }
        return 0;
    }

    public final int b() {
        MediaUtils.f fVar = this.j;
        if (fVar != null) {
            return fVar.b;
        }
        return 0;
    }

    public final int c() {
        MediaUtils.f fVar = this.j;
        if (fVar != null) {
            return fVar.a;
        }
        return 0;
    }

    public final wds0 d() {
        return new wds0(Uri.fromFile(this.a), this.j != null ? r2.f : 0, this.c, this.d, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r1 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        VideoScale.ScaleType scaleType;
        if (this.j == null) {
            this.j = MediaUtils.a.d(this.a.getPath());
        }
        VideoScale videoScale = this.k;
        MediaUtils.f fVar = this.j;
        if (fVar != null) {
            scaleType = fVar.a > fVar.b ? VideoScale.ScaleType.CENTER_INSIDE : VideoScale.ScaleType.CENTER_CROP;
        }
        scaleType = VideoScale.ScaleType.CENTER_CROP;
        videoScale.a = scaleType;
    }

    public final boolean equals(Object obj) {
        mat0 mat0Var = obj instanceof mat0 ? (mat0) obj : null;
        return mat0Var != null && epx.f(this.a, mat0Var.a) && this.c == mat0Var.c && this.d == mat0Var.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.c), Long.valueOf(this.d));
    }

    public final String toString() {
        return "VideoRawData(startTimeMs=" + this.c + ", endTimeMs=" + this.d + ", durationMs=" + a() + ')';
    }

    public mat0(File file, boolean z, long j, long j2, boolean z2, boolean z3, boolean z4, MediaUtils.f fVar) {
        this.a = file;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.j = fVar;
        this.k = new VideoScale();
        e();
    }
}
