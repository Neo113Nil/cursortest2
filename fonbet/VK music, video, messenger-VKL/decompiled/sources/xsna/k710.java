package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MarketLinkedContentScreen.kt */
@b6l(c = "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentScreenKt$lazyRememberState$1$1$1$1", f = "MarketLinkedContentScreen.kt", l = {481}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class k710 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<gzs<s3q0>> $callback$delegate;
    final /* synthetic */ mtk0<Boolean> $state;
    final /* synthetic */ dsy $this_apply;
    final /* synthetic */ int $totalCount;
    int label;

    /* compiled from: MarketLinkedContentScreen.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ dsy b;
        public final /* synthetic */ int c;
        public final /* synthetic */ mtk0<gzs<s3q0>> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(dsy dsyVar, int i, mtk0<? extends gzs<s3q0>> mtk0Var) {
            this.b = dsyVar;
            this.c = i;
            this.d = mtk0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            dsy dsyVar = this.b;
            if (dsyVar.i().d() > 1) {
                if (this.c > dsyVar.i().d() && booleanValue) {
                    this.d.getValue().invoke();
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k710(mtk0<Boolean> mtk0Var, dsy dsyVar, int i, mtk0<? extends gzs<s3q0>> mtk0Var2, spj<? super k710> spjVar) {
        super(2, spjVar);
        this.$state = mtk0Var;
        this.$this_apply = dsyVar;
        this.$totalCount = i;
        this.$callback$delegate = mtk0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k710(this.$state, this.$this_apply, this.$totalCount, this.$callback$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((k710) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new uqs(this.$state, 1));
            a aVar = new a(this.$this_apply, this.$totalCount, this.$callback$delegate);
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
