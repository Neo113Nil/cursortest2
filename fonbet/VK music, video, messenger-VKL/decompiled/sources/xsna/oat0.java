package xsna;

import com.vk.media.pipeline.model.source.picture.ImageMediaSource;

/* compiled from: VideoRawProducerConfig.kt */
/* loaded from: classes3.dex */
public final class oat0 {
    public final o6t0 a;
    public final b0u b;
    public final ImageMediaSource c;
    public final int d;

    public oat0(o6t0 o6t0Var, b0u b0uVar, ImageMediaSource imageMediaSource, int i) {
        this.a = o6t0Var;
        this.b = b0uVar;
        this.c = imageMediaSource;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oat0)) {
            return false;
        }
        oat0 oat0Var = (oat0) obj;
        return epx.f(this.a, oat0Var.a) && epx.f(this.b, oat0Var.b) && epx.f(this.c, oat0Var.c) && this.d == oat0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b0u b0uVar = this.b;
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((hashCode + (b0uVar == null ? 0 : b0uVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRawProducerConfig(producerConfig=");
        sb.append(this.a);
        sb.append(", glContext=");
        sb.append(this.b);
        sb.append(", picture=");
        sb.append(this.c);
        sb.append(", maxTargetSizeSide=");
        return vu5.b(sb, this.d, ')');
    }
}
