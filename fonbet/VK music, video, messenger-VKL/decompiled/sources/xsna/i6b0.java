package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;

/* compiled from: PlayingIndication.kt */
@b6l(c = "com.vk.feed.design.compose.posting.indication.PlayingIndicationKt$PlayingIndication$1$1", f = "PlayingIndication.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class i6b0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<if2<Float, sq2>> $animatedHeights;
    final /* synthetic */ float $animationScale;
    final /* synthetic */ dtp0<Float> $animationSpec;
    final /* synthetic */ v5b0 $cachedConfig;
    final /* synthetic */ boolean $isAnimating;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: PlayingIndication.kt */
    @b6l(c = "com.vk.feed.design.compose.posting.indication.PlayingIndicationKt$PlayingIndication$1$1$1$1", f = "PlayingIndication.kt", l = {70}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super fq2<Float, sq2>>, Object> {
        final /* synthetic */ List<if2<Float, sq2>> $animatedHeights;
        final /* synthetic */ dtp0<Float> $animationSpec;
        final /* synthetic */ int $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<if2<Float, sq2>> list, int i, dtp0<Float> dtp0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$animatedHeights = list;
            this.$it = i;
            this.$animationSpec = dtp0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$animatedHeights, this.$it, this.$animationSpec, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super fq2<Float, sq2>> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            if2<Float, sq2> if2Var = this.$animatedHeights.get(this.$it);
            Random.b.getClass();
            Float f = new Float(((float) Math.cbrt(Random.c.i() * 1000000)) / 100.0f);
            dtp0<Float> dtp0Var = this.$animationSpec;
            this.label = 1;
            Object c = if2.c(if2Var, f, dtp0Var, null, this, 12);
            return c == coroutineSingletons ? coroutineSingletons : c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6b0(float f, boolean z, v5b0 v5b0Var, List<if2<Float, sq2>> list, dtp0<Float> dtp0Var, spj<? super i6b0> spjVar) {
        super(2, spjVar);
        this.$animationScale = f;
        this.$isAnimating = z;
        this.$cachedConfig = v5b0Var;
        this.$animatedHeights = list;
        this.$animationSpec = dtp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        i6b0 i6b0Var = new i6b0(this.$animationScale, this.$isAnimating, this.$cachedConfig, this.$animatedHeights, this.$animationSpec, spjVar);
        i6b0Var.L$0 = obj;
        return i6b0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i6b0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        while (this.$animationScale > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.$isAnimating) {
            k9x q = swe0.q(0, this.$cachedConfig.a);
            List<if2<Float, sq2>> list = this.$animatedHeights;
            dtp0<Float> dtp0Var = this.$animationSpec;
            ArrayList arrayList = new ArrayList(c5g.u(q, 10));
            j9x it = q.iterator();
            while (it.d) {
                arrayList.add(myc0.b(yvjVar, null, null, new a(list, it.nextInt(), dtp0Var, null), 3));
            }
            this.L$0 = yvjVar;
            this.label = 1;
            if (fto0.e(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return s3q0.a;
    }
}
