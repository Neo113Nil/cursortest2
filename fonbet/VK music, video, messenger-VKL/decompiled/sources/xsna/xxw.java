package xsna;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.libvideo.autoplay.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$handleInit$1", f = "InitDelegate.kt", l = {44, TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class xxw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ars0 $this_handleInit;
    Object L$0;
    int label;

    /* compiled from: InitDelegate.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ ars0 b;

        public a(ars0 ars0Var) {
            this.b = ars0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            gi5 gi5Var = (gi5) obj;
            ars0 ars0Var = this.b;
            mcc0 mcc0Var = ars0Var.b;
            b2a b2aVar = (b2a) mcc0Var.b;
            boolean z = ((VideoLargeListState) ((b2a) mcc0Var.b).getCurrentState()).t.e;
            boolean z2 = gi5Var.e;
            if (z != z2) {
                if (z2) {
                    fjz fjzVar = ((VideoLargeListState) b2aVar.getCurrentState()).v;
                    if (fjzVar == null) {
                        yjk0 yjk0Var = ((VideoLargeListState) b2aVar.getCurrentState()).w.get();
                        ViewGroup viewGroup = ((VideoLargeListState) b2aVar.getCurrentState()).x.get();
                        if (yjk0Var == null || viewGroup == null) {
                            fjzVar = null;
                        } else {
                            yjk0Var.setSpectatorsCounterView(new ziz(ars0Var));
                            fjzVar = ars0Var.f.D(viewGroup, yjk0Var, true, new ajz(ars0Var));
                        }
                    }
                    if (fjzVar != null) {
                        fjzVar.c(((VideoLargeListState) b2aVar.getCurrentState()).d);
                    }
                    if (fjzVar != null) {
                        fjzVar.b(gi5Var.f, new b1h(ars0Var, 27));
                    }
                } else {
                    fjz fjzVar2 = ((VideoLargeListState) b2aVar.getCurrentState()).v;
                    if (fjzVar2 != null) {
                        fjzVar2.a();
                    }
                }
            }
            long c = an10.c((gi5Var.s / 100.0f) * gi5Var.r);
            ((VideoLargeListState) b2aVar.getCurrentState()).l.p(gi5Var.q);
            ((VideoLargeListState) b2aVar.getCurrentState()).m.p(c);
            ars0Var.m(new bhh(gi5Var, 27));
            return s3q0.a;
        }
    }

    /* compiled from: InitDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$handleInit$1$autoPlayInstance$1", f = "InitDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super yg5>, Object> {
        final /* synthetic */ ars0 $this_handleInit;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ars0 ars0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$this_handleInit = ars0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$this_handleInit, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super yg5> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            yg5 e = b.C1208b.a().e(((VideoLargeListState) ((b2a) this.$this_handleInit.b.b).getCurrentState()).d, null);
            ars0 ars0Var = this.$this_handleInit;
            ars0Var.m(new defpackage.b0(20, e, ars0Var));
            return e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxw(ars0 ars0Var, spj<? super xxw> spjVar) {
        super(2, spjVar);
        this.$this_handleInit = ars0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xxw(this.$this_handleInit, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xxw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (r7.collect(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r7 == r0) goto L15;
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
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            b bVar = new b(this.$this_handleInit, null);
            this.label = 1;
            obj = myc0.k(ge00Var, bVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        yg5 yg5Var = (yg5) obj;
        ars0 ars0Var = this.$this_handleInit;
        w1a.b(ars0Var, null, new sxw(yg5Var, ars0Var, null), 3);
        nb9 i2 = rsr.i(new hi5(yg5Var, null));
        bdn bdnVar2 = bdn.a;
        ksr q = rsr.q(i2, ie00.a);
        a aVar = new a(this.$this_handleInit);
        this.L$0 = null;
        this.label = 2;
    }
}
