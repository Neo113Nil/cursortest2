package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import kotlin.Pair;
import xsna.dkt0;

/* compiled from: DecoderPreparer.kt */
/* loaded from: classes3.dex */
public final class m8l {
    public final n6t0 a;
    public final Pair<Integer, VideoItem> b;
    public final hvz c;
    public final dkt0.a d;
    public boolean e;
    public l8l f;
    public final klt0 g;

    public m8l(csp cspVar, c7s0 c7s0Var, n6t0 n6t0Var, Pair pair, hvz hvzVar) {
        this.a = n6t0Var;
        this.b = pair;
        this.c = hvzVar;
        this.d = new dkt0.a(0, c7s0Var);
        n6t0Var.b = new a(Math.max(c7s0Var.getLayout().b.O0(), 0L));
        this.g = new klt0(cspVar, n6t0Var);
    }

    /* compiled from: DecoderPreparer.kt */
    public final class a implements r6t0 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        @Override // xsna.r6t0
        public final void d(l8l l8lVar) {
            m8l.this.f = l8lVar;
        }

        @Override // xsna.r6t0
        public final x7l e(MediaCodec.BufferInfo bufferInfo) {
            DecodedSampleStatus decodedSampleStatus;
            if (bufferInfo.presentationTimeUs < this.a) {
                decodedSampleStatus = DecodedSampleStatus.SKIP;
            } else if ((bufferInfo.flags & 2) != 0) {
                decodedSampleStatus = DecodedSampleStatus.SKIP;
            } else if (bufferInfo.size <= 0) {
                decodedSampleStatus = DecodedSampleStatus.SKIP;
            } else {
                m8l.this.e = true;
                decodedSampleStatus = DecodedSampleStatus.CONSUMED;
            }
            return new x7l(decodedSampleStatus, null);
        }

        @Override // xsna.r6t0
        public final void a(MediaCodec.BufferInfo bufferInfo) {
        }

        @Override // xsna.r6t0
        public final void b(kes0 kes0Var, long j) {
        }

        @Override // xsna.r6t0
        public final void c(int i, long j, kes0 kes0Var) {
        }
    }
}
