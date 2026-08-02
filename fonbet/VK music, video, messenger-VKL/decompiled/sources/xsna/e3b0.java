package xsna;

import com.vk.media.pipeline.model.timeline.Timeline;
import java.util.List;

/* compiled from: PlayerRelatedUiData.kt */
/* loaded from: classes17.dex */
public final class e3b0 {
    public final Object a;
    public final List<uq10> b;
    public final cv10 c;
    public final f100 d;

    public e3b0() {
        throw null;
    }

    public e3b0(Timeline timeline, List list, cv10 cv10Var, f100 f100Var) {
        this.a = timeline;
        this.b = list;
        this.c = cv10Var;
        this.d = f100Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3b0)) {
            return false;
        }
        e3b0 e3b0Var = (e3b0) obj;
        return epx.f(this.a, e3b0Var.a) && epx.f(this.b, e3b0Var.b) && epx.f(this.c, e3b0Var.c) && epx.f(this.d, e3b0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + fw3.a(qow.a(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "PlayerRelatedUiData(timeline=" + ((Object) qow.b(this.a)) + ", layers=" + this.b + ", playbackController=" + this.c + ", logger=" + this.d + ')';
    }
}
