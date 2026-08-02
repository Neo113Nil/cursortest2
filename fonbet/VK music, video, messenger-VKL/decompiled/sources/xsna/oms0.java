package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.oap;

/* compiled from: VideoFrameRequest.kt */
/* loaded from: classes3.dex */
public abstract class oms0 {
    public final oap<Long, Integer> a;

    /* compiled from: VideoFrameRequest.kt */
    public static final class a extends oms0 {
    }

    /* compiled from: VideoFrameRequest.kt */
    public static final class b extends oms0 {
        public final long b;

        public b(long j) {
            super(new oap.a(Long.valueOf(j)));
            this.b = j;
        }
    }

    public oms0(oap oapVar) {
        this.a = oapVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        oap<Long, Integer> oapVar = this.a;
        if (oapVar instanceof oap.b) {
            return uqi.a("ByFrameNumber(", ((Integer) ((oap.b) oapVar).a).intValue(), ')');
        }
        if (oapVar instanceof oap.a) {
            return q9k.d("ByTimestamp(", ((Long) ((oap.a) oapVar).a).longValue(), ')');
        }
        throw new NoWhenBranchMatchedException();
    }
}
