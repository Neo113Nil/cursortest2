package xsna;

import com.vk.media.pipeline.model.timeline.Timeline;

/* compiled from: PlayerContentModel.kt */
/* loaded from: classes3.dex */
public final class g0b0 {
    public final Timeline a;
    public final int b;
    public final int c;

    public g0b0(Timeline timeline, int i, int i2) {
        this.a = timeline;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0b0)) {
            return false;
        }
        g0b0 g0b0Var = (g0b0) obj;
        return epx.f(this.a, g0b0Var.a) && this.b == g0b0Var.b && this.c == g0b0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerContentModel(timeline=");
        sb.append(this.a);
        sb.append(", viewPortWidth=");
        sb.append(this.b);
        sb.append(", viewPortHeight=");
        return vu5.b(sb, this.c, ')');
    }
}
