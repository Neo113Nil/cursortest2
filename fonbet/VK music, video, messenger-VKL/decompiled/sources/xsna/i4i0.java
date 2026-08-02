package xsna;

import xsna.n3i0;

/* compiled from: Seeker.java */
/* loaded from: classes12.dex */
public interface i4i0 extends n3i0 {

    /* compiled from: Seeker.java */
    public static class a extends n3i0.b implements i4i0 {
        @Override // xsna.i4i0
        public final long b() {
            return -1L;
        }

        @Override // xsna.i4i0
        public final int getAverageBitrate() {
            return -2147483647;
        }

        @Override // xsna.i4i0
        public final long getTimeUs(long j) {
            return 0L;
        }
    }

    long b();

    int getAverageBitrate();

    long getTimeUs(long j);
}
