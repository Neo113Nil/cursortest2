package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicMixTransitionConfig.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class no40 extends FunctionReferenceImpl implements izs<Float, Float> {
    public static final no40 b = new no40(1, po40.class, "easeOut", "easeOut(F)F", 1);

    @Override // xsna.izs
    public final Float invoke(Float f) {
        float floatValue = 1.0f - f.floatValue();
        return Float.valueOf(1.0f - ((floatValue * floatValue) * floatValue));
    }
}
