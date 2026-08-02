package xsna;

/* compiled from: LayoutCoordinates.kt */
/* loaded from: classes11.dex */
public interface tny {
    long D(long j);

    long F(long j);

    default long S(tny tnyVar, long j) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    default void T(tny tnyVar, float[] fArr) {
        uzw.e("transformFrom is not implemented on this LayoutCoordinates");
    }

    long U(long j);

    long a();

    tny b0();

    boolean e();

    default long k(long j) {
        return 9205357640488583168L;
    }

    default void k0(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    default long p(long j) {
        return 9205357640488583168L;
    }

    long w(tny tnyVar, long j);

    tny y();

    zhf0 z(tny tnyVar, boolean z);
}
