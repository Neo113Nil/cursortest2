package xsna;

import android.media.MediaCodec;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.transcoder.DecodedSampleStatus;
import java.util.List;
import xsna.py4;
import xsna.qy4;

/* compiled from: CopyAudioTrackHandler.kt */
/* loaded from: classes3.dex */
public final class dtj extends gjp0 {
    public final py4 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dtj(csp cspVar, rfp0 rfp0Var) {
        super(rfp0Var, r4, "CopyAudioTrackHandler");
        f100 f100Var = cspVar.d;
        this.e = new py4(rfp0Var.a.b, new a(rfp0Var.d, rfp0Var.e), f100Var);
    }

    @Override // xsna.gjp0
    public final boolean a() {
        return !this.e.d;
    }

    @Override // xsna.gjp0
    public final void c() {
        this.e.a();
    }

    /* compiled from: CopyAudioTrackHandler.kt */
    public final class a implements py4.b {
        public final f020 a;
        public final e020 b;
        public final MediaCodec.BufferInfo c = new MediaCodec.BufferInfo();

        public a(f020 f020Var, e020 e020Var) {
            this.a = f020Var;
            this.b = e020Var;
        }

        @Override // xsna.py4.b
        public final void b(List list, qy4[] qy4VarArr) {
            dtj dtjVar = dtj.this;
            String str = dtjVar.c;
            if (qy4VarArr.length != 1) {
                throw new IllegalArgumentException(str.concat(" can process only single track").toString());
            }
            Object L = rl3.L(qy4VarArr);
            qy4.b bVar = L instanceof qy4.b ? (qy4.b) L : null;
            if (bVar == null) {
                f100 f100Var = dtjVar.b;
                if (f100Var != null) {
                    f100Var.e(str, "can only process ExtractorAudioTimelineResult");
                    return;
                }
                return;
            }
            tll tllVar = bVar.a;
            int i = tllVar.c;
            long j = tllVar.b;
            k0h0.a.getClass();
            this.c.set(0, i, j, tllVar.f ? 1 : 0);
            f020 f020Var = this.a;
            MediaCodec.BufferInfo bufferInfo = this.c;
            DecodedSampleStatus decodedSampleStatus = f020Var.a(bufferInfo).a;
            bufferInfo.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, tllVar.d);
            if (decodedSampleStatus == DecodedSampleStatus.RENDER) {
                this.b.b(tllVar.a, bufferInfo);
            }
        }

        @Override // xsna.py4.b
        public final void c() {
            dtj dtjVar = dtj.this;
            f100 f100Var = dtjVar.b;
            if (f100Var != null) {
                f100Var.i(dtjVar.c, "audio timeline end reached");
            }
        }

        @Override // xsna.py4.b
        public final void d(el4 el4Var, List<AudioFragmentItem> list, List<? extends xx4> list2) {
            String str = dtj.this.c;
            if (list2.size() != 1) {
                throw new IllegalArgumentException(str.concat(" can process only single track").toString());
            }
            xx4 xx4Var = (xx4) j5g.Y(list2);
            if (!(xx4Var instanceof yq10)) {
                throw new IllegalArgumentException(str.concat(" can process only MediaExtractorAudioSource").toString());
            }
            this.a.b(el4Var, ((AudioFragmentItem) j5g.Y(list)).b);
            this.b.c(((yq10) xx4Var).s);
        }

        @Override // xsna.py4.b
        public final void a(long j) {
        }
    }
}
