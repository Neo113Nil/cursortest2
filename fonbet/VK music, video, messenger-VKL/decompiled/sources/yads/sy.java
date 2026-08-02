package yads;

/* loaded from: classes10.dex */
public final class sy implements vy2 {
    public final vy2[] b;

    public sy(vy2[] vy2VarArr) {
        this.b = vy2VarArr;
    }

    @Override // yads.vy2
    public final boolean continueLoading(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z2;
            }
            z = false;
            for (vy2 vy2Var : this.b) {
                long nextLoadPositionUs2 = vy2Var.getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= vy2Var.continueLoading(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // yads.vy2
    public final long getBufferedPositionUs() {
        long j = Long.MAX_VALUE;
        for (vy2 vy2Var : this.b) {
            long bufferedPositionUs = vy2Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, bufferedPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // yads.vy2
    public final long getNextLoadPositionUs() {
        long j = Long.MAX_VALUE;
        for (vy2 vy2Var : this.b) {
            long nextLoadPositionUs = vy2Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, nextLoadPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // yads.vy2
    public final boolean isLoading() {
        for (vy2 vy2Var : this.b) {
            if (vy2Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.vy2
    public final void reevaluateBuffer(long j) {
        for (vy2 vy2Var : this.b) {
            vy2Var.reevaluateBuffer(j);
        }
    }
}
