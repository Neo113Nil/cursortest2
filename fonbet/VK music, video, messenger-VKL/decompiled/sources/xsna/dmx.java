package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.epx;

/* compiled from: InternalSlider.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class dmx extends FunctionReferenceImpl implements izs<Float, Float> {
    final /* synthetic */ Ref$FloatRef $maxPx;
    final /* synthetic */ Ref$FloatRef $minPx;
    final /* synthetic */ bwf<Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmx(bwf<Float> bwfVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2) {
        super(1, epx.a.class, "scaleToOffset", "InternalRangeSlider_bnqHvKU$lambda$36$scaleToOffset$21(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.$valueRange = bwfVar;
        this.$minPx = ref$FloatRef;
        this.$maxPx = ref$FloatRef2;
    }

    @Override // xsna.izs
    public final Float invoke(Float f) {
        return Float.valueOf(nmx.c(this.$valueRange, this.$minPx, this.$maxPx, f.floatValue()));
    }
}
