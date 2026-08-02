package xsna;

import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.item.VideoItem;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.dkt0;
import xsna.k0h0;

/* compiled from: VideoBoundTimelineWrapper.kt */
/* loaded from: classes3.dex */
public final class e7s0 {
    public final List<c7s0> a;
    public final ir6 b;
    public long c;
    public long d;
    public final f100 e;
    public final Object f;

    /* compiled from: VideoBoundTimelineWrapper.kt */
    public final class a implements dkt0.b {
        public a() {
        }

        @Override // xsna.dkt0.b
        public final void a() {
            e7s0 e7s0Var = e7s0.this;
            f100 f100Var = e7s0Var.e;
            if (f100Var != null) {
                f100Var.d("VideoBoundTimelineWrapper", "timeline end reached");
            }
            e7s0Var.b.a();
        }

        @Override // xsna.dkt0.b
        public final void b(tht0 tht0Var, k0h0.b bVar) {
            klt0 klt0Var = e7s0.this.b.l.f;
            if (klt0Var != null) {
                klt0Var.a(bVar, tht0Var);
            }
        }

        @Override // xsna.dkt0.b
        public final void c(VideoEffect videoEffect) {
            ir6 ir6Var = e7s0.this.b;
            ir6Var.e.c(new ocs(null, videoEffect, 1));
        }

        @Override // xsna.dkt0.b
        public final void d(c7s0 c7s0Var) {
            e7s0 e7s0Var = e7s0.this;
            f100 f100Var = e7s0Var.e;
            if (f100Var != null) {
                StringBuilder sb = new StringBuilder("detach [");
                sb.append(c7s0Var.getLayout().c);
                sb.append(", ");
                f100Var.d("VideoBoundTimelineWrapper", vu5.a(']', c7s0Var.getLayout().d, sb));
            }
            e7s0Var.c += e7s0Var.d;
            e7s0Var.b.b();
        }

        @Override // xsna.dkt0.b
        public final void e(c7s0 c7s0Var, VideoItem videoItem, tht0 tht0Var, int i) {
            e7s0 e7s0Var = e7s0.this;
            f100 f100Var = e7s0Var.e;
            if (f100Var != null) {
                StringBuilder sb = new StringBuilder("ATTACH [");
                sb.append(c7s0Var.getLayout().c);
                sb.append(", ");
                f100Var.d("VideoBoundTimelineWrapper", vu5.a(']', c7s0Var.getLayout().d, sb));
            }
            if (f100Var != null) {
                f100Var.v("VideoBoundTimelineWrapper", "video decoder input format=" + tht0Var.getFormat());
            }
            e7s0Var.d = c7s0Var.getLayout().d();
            e7s0Var.b.c(c7s0Var, videoItem, tht0Var, i);
        }
    }

    public e7s0(csp cspVar, List list, ir6 ir6Var) {
        this.a = list;
        this.b = ir6Var;
        this.e = cspVar.d;
        this.f = msy.a(LazyThreadSafetyMode.NONE, new d7s0(0, this, cspVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dkt0 a() {
        return (dkt0) this.f.getValue();
    }
}
