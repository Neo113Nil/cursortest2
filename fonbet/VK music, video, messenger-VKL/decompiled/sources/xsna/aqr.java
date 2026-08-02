package xsna;

/* compiled from: FloatAnimationSpec.kt */
/* loaded from: classes11.dex */
public interface aqr extends iq2<Float> {
    @Override // xsna.iq2
    default tlr0 a(itp0 itp0Var) {
        return new ylr0(this);
    }

    float b(long j, float f, float f2, float f3);

    long c(float f, float f2, float f3);

    default float d(float f, float f2, float f3) {
        return b(c(f, f2, f3), f, f2, f3);
    }

    float e(long j, float f, float f2, float f3);
}
