package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: InternalSlider.kt */
@b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$InternalRangeSlider$2$gestureEndAction$1$1$1", f = "InternalSlider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class emx extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isStart;
    final /* synthetic */ Ref$FloatRef $maxPx;
    final /* synthetic */ Ref$FloatRef $minPx;
    final /* synthetic */ gzs<s3q0> $onValueChangeFinished;
    final /* synthetic */ mtk0<izs<bwf<Float>, s3q0>> $onValueChangeState;
    final /* synthetic */ wh50<Float> $rawOffsetEnd;
    final /* synthetic */ wh50<Float> $rawOffsetStart;
    final /* synthetic */ wh50<Float> $snappedRawOffsetEnd;
    final /* synthetic */ wh50<Float> $snappedRawOffsetStart;
    final /* synthetic */ float $target;
    final /* synthetic */ bwf<Float> $valueRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public emx(boolean z, wh50<Float> wh50Var, wh50<Float> wh50Var2, float f, wh50<Float> wh50Var3, wh50<Float> wh50Var4, mtk0<? extends izs<? super bwf<Float>, s3q0>> mtk0Var, gzs<s3q0> gzsVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, bwf<Float> bwfVar, spj<? super emx> spjVar) {
        super(2, spjVar);
        this.$isStart = z;
        this.$rawOffsetStart = wh50Var;
        this.$rawOffsetEnd = wh50Var2;
        this.$target = f;
        this.$snappedRawOffsetStart = wh50Var3;
        this.$snappedRawOffsetEnd = wh50Var4;
        this.$onValueChangeState = mtk0Var;
        this.$onValueChangeFinished = gzsVar;
        this.$minPx = ref$FloatRef;
        this.$maxPx = ref$FloatRef2;
        this.$valueRange = bwfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new emx(this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$target, this.$snappedRawOffsetStart, this.$snappedRawOffsetEnd, this.$onValueChangeState, this.$onValueChangeFinished, this.$minPx, this.$maxPx, this.$valueRange, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((emx) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        (this.$isStart ? this.$rawOffsetStart : this.$rawOffsetEnd).setValue(new Float(this.$target));
        (this.$isStart ? this.$snappedRawOffsetStart : this.$snappedRawOffsetEnd).setValue(new Float(this.$target));
        izs<bwf<Float>, s3q0> value = this.$onValueChangeState.getValue();
        Ref$FloatRef ref$FloatRef = this.$minPx;
        Ref$FloatRef ref$FloatRef2 = this.$maxPx;
        bwf<Float> bwfVar = this.$valueRange;
        float floatValue = this.$snappedRawOffsetStart.getValue().floatValue();
        float floatValue2 = this.$snappedRawOffsetEnd.getValue().floatValue();
        float f = ref$FloatRef.element;
        float f2 = ref$FloatRef2.element;
        float floatValue3 = bwfVar.getStart().floatValue();
        float floatValue4 = bwfVar.c().floatValue();
        value.invoke(new awf(nmx.m(f, f2, floatValue, floatValue3, floatValue4), nmx.m(f, f2, floatValue2, floatValue3, floatValue4)));
        gzs<s3q0> gzsVar = this.$onValueChangeFinished;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        return s3q0.a;
    }
}
