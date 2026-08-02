package xsna;

import com.vk.media.pipeline.model.effect.VideoEffect;

/* compiled from: FragmentRenderingParams.kt */
/* loaded from: classes3.dex */
public final class ocs {
    public final Integer a;
    public final VideoEffect b;

    public ocs() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocs)) {
            return false;
        }
        ocs ocsVar = (ocs) obj;
        return epx.f(this.a, ocsVar.a) && epx.f(this.b, ocsVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        VideoEffect videoEffect = this.b;
        return hashCode + (videoEffect != null ? videoEffect.hashCode() : 0);
    }

    public final String toString() {
        return "FragmentRenderingParams(rotationDegrees=" + this.a + ", videoEffects=" + this.b + ')';
    }

    public ocs(Integer num, VideoEffect videoEffect, int i) {
        num = (i & 1) != 0 ? null : num;
        videoEffect = (i & 2) != 0 ? null : videoEffect;
        this.a = num;
        this.b = videoEffect;
    }
}
