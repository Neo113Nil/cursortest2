package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SheetDefaults.kt */
/* loaded from: classes11.dex */
public final class ycj0 implements d160 {
    public final /* synthetic */ gdj0 b;
    public final /* synthetic */ izs<Float, s3q0> c;
    public final /* synthetic */ Orientation d;

    /* JADX WARN: Multi-variable type inference failed */
    public ycj0(gdj0 gdj0Var, izs<? super Float, s3q0> izsVar, Orientation orientation) {
        this.b = gdj0Var;
        this.c = izsVar;
        this.d = orientation;
    }

    @Override // xsna.d160
    public final Object M(long j, spj<? super jmr0> spjVar) {
        float b = this.d == Orientation.Horizontal ? jmr0.b(j) : jmr0.c(j);
        gdj0 gdj0Var = this.b;
        float g = gdj0Var.d.g();
        float d = gdj0Var.d.e().d();
        if (b >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || g <= d) {
            j = 0;
        } else {
            this.c.invoke(new Float(b));
        }
        return new jmr0(j);
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (this.d == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
        if (intBitsToFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i != 1) {
            return 0L;
        }
        return a(this.b.d.d(intBitsToFloat));
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        if (i == 1) {
            return a(this.b.d.d(Float.intBitsToFloat((int) (this.d == Orientation.Horizontal ? j2 >> 32 : 4294967295L & j2))));
        }
        return 0L;
    }

    public final long a(float f) {
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.d;
        float f2 = orientation2 == orientation ? f : 0.0f;
        if (orientation2 != Orientation.Vertical) {
            f = 0.0f;
        }
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }

    @Override // xsna.d160
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        this.c.invoke(new Float(this.d == Orientation.Horizontal ? jmr0.b(j2) : jmr0.c(j2)));
        return new jmr0(j2);
    }
}
