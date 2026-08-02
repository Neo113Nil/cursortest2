package xsna;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: DragGestureDetector.kt */
/* loaded from: classes11.dex */
public final class idp0 {
    public Orientation a;
    public long b;

    /* compiled from: DragGestureDetector.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public idp0(long j, Orientation orientation) {
        this.a = orientation;
        this.b = j;
    }

    public final long a(long j, float f, boolean z) {
        long f2;
        if (z) {
            f2 = ov70.f(this.b, j);
            this.b = f2;
        } else {
            f2 = ov70.f(this.b, j);
        }
        if ((this.a == null ? ov70.d(f2) : Math.abs(b(f2))) < f) {
            return 9205357640488583168L;
        }
        if (this.a == null) {
            long j2 = this.b;
            return ov70.e(this.b, ov70.g(f, ov70.b(ov70.d(j2), j2)));
        }
        float b = b(this.b) - (Math.signum(b(this.b)) * f);
        long j3 = this.b;
        Orientation orientation = this.a;
        Orientation orientation2 = Orientation.Horizontal;
        float intBitsToFloat = Float.intBitsToFloat((int) (orientation == orientation2 ? j3 & 4294967295L : j3 >> 32));
        if (this.a != orientation2) {
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(b) & 4294967295L);
        }
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    public /* synthetic */ idp0(Orientation orientation, int i) {
        this(0L, (i & 1) != 0 ? null : orientation);
    }
}
