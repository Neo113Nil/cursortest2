package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dz40;

/* compiled from: Chip.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.chips.ChipKt$ChipConcerts$2$1", f = "Chip.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class abc extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dz40.d.b $chip;
    final /* synthetic */ rg50 $iconReplayNonce$delegate;
    final /* synthetic */ kg50 $textOpacity$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Chip.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.chips.ChipKt$ChipConcerts$2$1$1", f = "Chip.kt", l = {352, 354}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ dz40.d.b $chip;
        final /* synthetic */ rg50 $iconReplayNonce$delegate;
        final /* synthetic */ kg50 $textOpacity$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dz40.d.b bVar, kg50 kg50Var, rg50 rg50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$chip = bVar;
            this.$textOpacity$delegate = kg50Var;
            this.$iconReplayNonce$delegate = rg50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$chip, this.$textOpacity$delegate, this.$iconReplayNonce$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (xsna.qsl.b(720, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        
            if (xsna.qsl.b(30, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (!this.$chip.a) {
                    this.$textOpacity$delegate.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return s3q0.a;
                }
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    int intValue = this.$iconReplayNonce$delegate.getIntValue();
                    this.$iconReplayNonce$delegate.C(intValue + 1);
                    new Integer(intValue);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            this.$textOpacity$delegate.g(1.0f);
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abc(dz40.d.b bVar, kg50 kg50Var, rg50 rg50Var, spj<? super abc> spjVar) {
        super(2, spjVar);
        this.$chip = bVar;
        this.$textOpacity$delegate = kg50Var;
        this.$iconReplayNonce$delegate = rg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        abc abcVar = new abc(this.$chip, this.$textOpacity$delegate, this.$iconReplayNonce$delegate, spjVar);
        abcVar.L$0 = obj;
        return abcVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((abc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h(yvjVar, null, null, new a(this.$chip, this.$textOpacity$delegate, this.$iconReplayNonce$delegate, null), 3);
        return s3q0.a;
    }
}
