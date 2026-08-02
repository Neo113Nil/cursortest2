package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;

/* compiled from: VideosQueueSimpleRecommendationProvider.kt */
/* loaded from: classes3.dex */
public final class jtt0 implements pat0 {
    public final VideoFile a;
    public final a2s0 b;
    public final a2s0 c;
    public final a2s0 d;
    public final a2s0 e;
    public final VideoRecommendationVideosType f;

    public jtt0(VideoFile videoFile, a2s0 a2s0Var, a2s0 a2s0Var2, a2s0 a2s0Var3, a2s0 a2s0Var4) {
        VideoRecommendationVideosType videoRecommendationVideosType = VideoRecommendationVideosType.SIMILAR_VIDEOS;
        this.a = videoFile;
        this.b = a2s0Var;
        this.c = a2s0Var2;
        this.d = a2s0Var3;
        this.e = a2s0Var4;
        this.f = videoRecommendationVideosType;
    }

    @Override // xsna.pat0
    public final pat0 b() {
        return null;
    }

    @Override // xsna.kat0
    public final a2s0 c() {
        return this.c;
    }

    @Override // xsna.kat0
    public final a2s0 d() {
        return this.e;
    }

    @Override // xsna.kat0
    public final VideoFile e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtt0)) {
            return false;
        }
        jtt0 jtt0Var = (jtt0) obj;
        return epx.f(this.a, jtt0Var.a) && epx.f(this.b, jtt0Var.b) && epx.f(this.c, jtt0Var.c) && epx.f(this.d, jtt0Var.d) && epx.f(this.e, jtt0Var.e) && this.f == jtt0Var.f;
    }

    @Override // xsna.kat0
    public final a2s0 f() {
        return this.d;
    }

    @Override // xsna.kat0
    public final a2s0 g() {
        return this.b;
    }

    @Override // xsna.pat0
    public final VideoRecommendationVideosType getType() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a2s0 a2s0Var = this.b;
        int hashCode2 = (hashCode + (a2s0Var == null ? 0 : a2s0Var.hashCode())) * 31;
        a2s0 a2s0Var2 = this.c;
        int hashCode3 = (hashCode2 + (a2s0Var2 == null ? 0 : a2s0Var2.hashCode())) * 31;
        a2s0 a2s0Var3 = this.d;
        int hashCode4 = (hashCode3 + (a2s0Var3 == null ? 0 : a2s0Var3.hashCode())) * 31;
        a2s0 a2s0Var4 = this.e;
        return this.f.hashCode() + ((hashCode4 + (a2s0Var4 != null ? a2s0Var4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VideosQueueSimpleRecommendationProvider(currentVideo=" + this.a + ", firstVideo=" + this.b + ", lastVideo=" + this.c + ", nextVideo=" + this.d + ", previousVideo=" + this.e + ", type=" + this.f + ')';
    }
}
