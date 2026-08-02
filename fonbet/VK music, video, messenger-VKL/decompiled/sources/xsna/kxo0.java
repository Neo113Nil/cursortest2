package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimelineView.kt */
@b6l(c = "com.vk.libvideo.design.compose.base.timeline.TimelineViewKt$TimelineView$1$1", f = "TimelineView.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class kxo0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Long> $dragProgress;
    final /* synthetic */ wh50<qgo> $isDraggedState;
    final /* synthetic */ TimelineViewState $state;
    int label;

    /* compiled from: TimelineView.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ wh50<qgo> b;
        public final /* synthetic */ wh50<Long> c;

        public a(wh50<qgo> wh50Var, wh50<Long> wh50Var2) {
            this.b = wh50Var;
            this.c = wh50Var2;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            long longValue = ((Number) obj).longValue();
            wh50<qgo> wh50Var = this.b;
            if (wh50Var.getValue() == qgo.OnlyPreviewBehind) {
                wh50<Long> wh50Var2 = this.c;
                Long value = wh50Var2.getValue();
                if (longValue > (value != null ? value.longValue() : 0L)) {
                    wh50Var2.setValue(null);
                    wh50Var.setValue(qgo.NoState);
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxo0(TimelineViewState timelineViewState, wh50<qgo> wh50Var, wh50<Long> wh50Var2, spj<? super kxo0> spjVar) {
        super(2, spjVar);
        this.$state = timelineViewState;
        this.$isDraggedState = wh50Var;
        this.$dragProgress = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kxo0(this.$state, this.$isDraggedState, this.$dragProgress, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kxo0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new kld0(this.$state, 15));
            a aVar = new a(this.$isDraggedState, this.$dragProgress);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
