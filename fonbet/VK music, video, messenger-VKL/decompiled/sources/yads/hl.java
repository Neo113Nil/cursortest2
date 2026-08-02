package yads;

/* loaded from: classes10.dex */
public final class hl extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hl(long j, long j2) {
        super(r5.toString());
        StringBuilder b = xsna.fp.b(j2, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
        b.append(j);
    }
}
