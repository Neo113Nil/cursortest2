package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicMixAnimationGLView.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn40 extends FunctionReferenceImpl implements izs<Float, Float> {
    public static final rn40 b = new rn40(1, po40.class, "easeInOutQuad", "easeInOutQuad(F)F", 1);

    @Override // xsna.izs
    public final Float invoke(Float f) {
        float pow;
        float floatValue = f.floatValue();
        double d = floatValue;
        if (d < 0.5d) {
            pow = 2 * floatValue * floatValue;
        } else {
            double d2 = 2;
            pow = (float) (1 - (Math.pow((d * (-2.0d)) + d2, 2.0d) / d2));
        }
        return Float.valueOf(pow);
    }
}
