package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicMixAnimationGLView.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn40 extends FunctionReferenceImpl implements izs<Float, Float> {
    public static final sn40 b = new sn40(1, po40.class, "easeInOut", "easeInOut(F)F", 1);

    @Override // xsna.izs
    public final Float invoke(Float f) {
        return Float.valueOf((float) ((-(Math.cos(f.floatValue() * 3.141592653589793d) - 1)) / 2.0f));
    }
}
