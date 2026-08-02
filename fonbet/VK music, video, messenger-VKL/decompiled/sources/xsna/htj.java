package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.item.VideoItem;
import xsna.dkt0;
import xsna.k0h0;

/* compiled from: CopyVideoTrackHandler.kt */
/* loaded from: classes3.dex */
public final class htj extends gjp0 {
    public final dkt0 e;

    public htj(csp cspVar, rfp0 rfp0Var) {
        super(rfp0Var, cspVar.d, "CopyVideoTrackHandler");
        this.e = new dkt0(cspVar, rfp0Var.a.a, new a(rfp0Var.e), new pf(22));
    }

    @Override // xsna.gjp0
    public final boolean a() {
        return !this.e.c;
    }

    @Override // xsna.gjp0
    public final void c() {
        this.e.a();
    }

    /* compiled from: CopyVideoTrackHandler.kt */
    public final class a implements dkt0.b {
        public final e020 a;
        public final MediaCodec.BufferInfo b = new MediaCodec.BufferInfo();

        public a(e020 e020Var) {
            this.a = e020Var;
        }

        @Override // xsna.dkt0.b
        public final void a() {
            htj htjVar = htj.this;
            f100 f100Var = htjVar.b;
            if (f100Var != null) {
                f100Var.d(htjVar.c, "timeline end reached");
            }
        }

        @Override // xsna.dkt0.b
        public final void b(tht0 tht0Var, k0h0.b bVar) {
            this.b.set(0, bVar.getSize(), bVar.a(), bVar.getFlags());
            this.a.b(bVar.getData(), this.b);
        }

        @Override // xsna.dkt0.b
        public final void d(c7s0 c7s0Var) {
            htj htjVar = htj.this;
            f100 f100Var = htjVar.b;
            if (f100Var != null) {
                String str = htjVar.c;
                StringBuilder sb = new StringBuilder("detach [");
                sb.append(c7s0Var.getLayout().c);
                sb.append(", ");
                f100Var.d(str, vu5.a(']', c7s0Var.getLayout().d, sb));
            }
        }

        @Override // xsna.dkt0.b
        public final void e(c7s0 c7s0Var, VideoItem videoItem, tht0 tht0Var, int i) {
            boolean z = tht0Var instanceof cr10;
            htj htjVar = htj.this;
            f100 f100Var = htjVar.b;
            String str = htjVar.c;
            if (!z) {
                throw new IllegalArgumentException(str.concat(" can't process non-media-extractors video sources").toString());
            }
            if (f100Var != null) {
                StringBuilder sb = new StringBuilder("ATTACH [");
                sb.append(c7s0Var.getLayout().c);
                sb.append(", ");
                f100Var.d(str, vu5.a(']', c7s0Var.getLayout().d, sb));
            }
            if (f100Var != null) {
                f100Var.v(str, "video decoder input format=" + ((cr10) tht0Var).o);
            }
            this.a.c(((cr10) tht0Var).o);
        }

        @Override // xsna.dkt0.b
        public final void c(VideoEffect videoEffect) {
        }
    }
}
