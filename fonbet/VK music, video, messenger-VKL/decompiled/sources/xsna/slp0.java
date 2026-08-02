package xsna;

import android.util.SparseLongArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.NoSuchElementException;

/* compiled from: TransformerMediaClock.java */
/* loaded from: classes12.dex */
public final class slp0 implements cq10 {
    public final SparseLongArray b = new SparseLongArray();
    public long c;

    public final void a(int i, long j) {
        SparseLongArray sparseLongArray = this.b;
        long j2 = sparseLongArray.get(i, C.TIME_UNSET);
        if (j2 == C.TIME_UNSET || j > j2) {
            sparseLongArray.put(i, j);
            if (j2 == C.TIME_UNSET || j2 == this.c) {
                String str = y2r0.a;
                if (sparseLongArray.size() == 0) {
                    throw new NoSuchElementException();
                }
                long j3 = Long.MAX_VALUE;
                for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                    j3 = Math.min(j3, sparseLongArray.valueAt(i2));
                }
                this.c = j3;
            }
        }
    }

    @Override // xsna.cq10
    public final jwa0 getPlaybackParameters() {
        return jwa0.d;
    }

    @Override // xsna.cq10
    public final long getPositionUs() {
        return this.c;
    }

    @Override // xsna.cq10
    public final void b(jwa0 jwa0Var) {
    }
}
