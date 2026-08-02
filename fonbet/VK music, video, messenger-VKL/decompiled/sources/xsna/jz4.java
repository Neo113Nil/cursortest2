package xsna;

import android.media.MediaCodec;
import android.util.SparseArray;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import java.util.List;

/* compiled from: AudioTrackHandler.kt */
/* loaded from: classes3.dex */
public final class jz4 extends gjp0 {
    public final py4 e;
    public mz4 f;

    /* compiled from: AudioTrackHandler.kt */
    public final class a implements j8l<qm4> {
        public a() {
        }

        @Override // xsna.j8l
        public final DecodedSampleStatus a(MediaCodec.BufferInfo bufferInfo) {
            return jz4.this.a.d.a(bufferInfo).a;
        }

        @Override // xsna.j8l
        public final void b(MediaCodec.BufferInfo bufferInfo) {
            jz4.this.a.d.c(bufferInfo);
        }

        @Override // xsna.j8l
        public final /* bridge */ /* synthetic */ void c(hzf hzfVar) {
        }
    }

    /* compiled from: AudioTrackHandler.kt */
    public final class b extends q56 {
        public b(csp cspVar, ncl nclVar, d80 d80Var) {
            super(cspVar, nclVar, d80Var);
        }

        @Override // xsna.py4.b
        public final void b(List list, qy4[] qy4VarArr) {
            jz4 jz4Var = jz4.this;
            mz4 mz4Var = jz4Var.f;
            if (mz4Var != null) {
                mz4Var.d.a();
                mz4Var.i.b(list, qy4VarArr);
            } else {
                f100 f100Var = jz4Var.b;
                if (f100Var != null) {
                    f100Var.e(jz4Var.c, "Tried to push samples to null transcoder");
                }
            }
        }

        @Override // xsna.py4.b
        public final void c() {
            jz4 jz4Var = jz4.this;
            f100 f100Var = jz4Var.b;
            if (f100Var != null) {
                f100Var.d(jz4Var.c, "audio timeline end reached");
            }
            jz4Var.d(true);
        }

        @Override // xsna.q56, xsna.py4.b
        public final void d(el4 el4Var, List<AudioFragmentItem> list, List<? extends xx4> list2) {
            super.d(el4Var, list, list2);
            jz4.this.a.d.b(el4Var, ((AudioFragmentItem) j5g.Y(list)).b);
        }

        @Override // xsna.q56
        public final void e(csp cspVar, f8l<qm4> f8lVar, SparseArray<kz4> sparseArray, d80 d80Var) {
            jz4 jz4Var = jz4.this;
            jz4Var.f = new mz4(cspVar, jz4Var.a, d80Var, f8lVar, sparseArray, jz4Var.new a());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jz4(csp cspVar, rfp0 rfp0Var, d80 d80Var) {
        super(rfp0Var, r0, "AudioTrackHandler");
        f100 f100Var = cspVar.d;
        this.e = new py4(rfp0Var.a.b, new b(cspVar, rfp0Var.b, d80Var), f100Var);
    }

    @Override // xsna.gjp0
    public final boolean a() {
        return !this.e.d;
    }

    @Override // xsna.gjp0
    public final void b() {
        f100 f100Var = this.b;
        if (f100Var != null) {
            f100Var.v(this.c, "release audio track handler");
        }
        d(false);
        super.b();
    }

    @Override // xsna.gjp0
    public final void c() {
        this.e.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        r4.v("AudioTrackTranscoder", "last rendered/written audio sample pts=" + r11 + '/' + r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        kfp0<in4> kfp0Var;
        mz4 mz4Var = this.f;
        if (mz4Var != null) {
            kfp0<in4> kfp0Var2 = mz4Var.d;
            csp cspVar = mz4Var.a;
            f100 f100Var = cspVar.d;
            if (f100Var != null) {
                f100Var.v("AudioTrackTranscoder", "release audio track transcoder started");
            }
            mz4Var.i.e(true, new oz4(kfp0Var2, 0));
            if (f100Var != null) {
                f100Var.i("AudioTrackTranscoder", "max cache buffer size: " + mz4Var.f + " bytes");
            }
            if (z) {
                rfp0 rfp0Var = mz4Var.b;
                long currentTimeMillis = System.currentTimeMillis();
                if (f100Var != null) {
                    f100Var.v("AudioTrackTranscoder", "try to drain audio track encoder ...");
                }
                f020 f020Var = rfp0Var.d;
                e020 e020Var = rfp0Var.e;
                long j = f020Var.c;
                long a2 = e020Var.a();
                boolean z2 = true;
                while (true) {
                    kfp0Var = kfp0Var2;
                    if (kfp0Var2.g.b() || ((Boolean) cspVar.c.get()).booleanValue() || j <= a2 || !z2 || Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    if (f100Var != null) {
                        f100Var.v("AudioTrackTranscoder", "last rendered/written audio sample pts=" + j + '/' + a2);
                    }
                    kfp0Var.a();
                    csp cspVar2 = cspVar;
                    z2 = (j == f020Var.c && a2 == e020Var.a()) ? false : true;
                    j = f020Var.c;
                    a2 = e020Var.a();
                    cspVar = cspVar2;
                    kfp0Var2 = kfp0Var;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (f100Var != null) {
                    f100Var.v("AudioTrackTranscoder", qlb0.a(currentTimeMillis2, "drain audio track encoder took ", " ms"));
                }
            } else {
                kfp0Var = kfp0Var2;
            }
            kfp0Var.d();
            mz4Var.c.c();
            if (f100Var != null) {
                f100Var.v("AudioTrackTranscoder", "release audio track transcoder finished");
            }
        }
        this.f = null;
    }
}
