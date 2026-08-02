package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: PendingDownloadInfo.kt */
/* loaded from: classes3.dex */
public final class pu90 {
    public final VideoFile a;
    public final gzs<s3q0> b;

    public pu90(VideoFile videoFile, gzs<s3q0> gzsVar) {
        this.a = videoFile;
        this.b = gzsVar;
    }

    public final gzs<s3q0> a() {
        return this.b;
    }

    public final VideoFile b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu90)) {
            return false;
        }
        pu90 pu90Var = (pu90) obj;
        return epx.f(this.a, pu90Var.a) && epx.f(this.b, pu90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PendingDownloadInfo(video=");
        sb.append(this.a);
        sb.append(", startLoading=");
        return uf3.d(sb, this.b, ')');
    }
}
