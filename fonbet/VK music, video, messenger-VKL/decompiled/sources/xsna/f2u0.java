package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ViewUtils.kt */
@b6l(c = "com.vk.catalog.mvi.section.ui.utils.ViewUtilsKt$NearEndTrigger$1$1", f = "ViewUtils.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class f2u0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ wh50<Boolean> $isTriggered;
    final /* synthetic */ int $itemsCount;
    final /* synthetic */ xvy $lazyListState;
    final /* synthetic */ gzs<s3q0> $onActionTrigger;
    int label;

    /* compiled from: ViewUtils.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ int b;
        public final /* synthetic */ wh50<Boolean> c;
        public final /* synthetic */ gzs<s3q0> d;

        public a(int i, wh50<Boolean> wh50Var, gzs<s3q0> gzsVar) {
            this.b = i;
            this.c = wh50Var;
            this.d = gzsVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            fvy fvyVar = (fvy) obj;
            xuy xuyVar = (xuy) j5g.k0(fvyVar.f());
            if (xuyVar == null) {
                return s3q0.a;
            }
            int index = xuyVar.getIndex();
            int d = fvyVar.d() - this.b;
            wh50<Boolean> wh50Var = this.c;
            if (index < d) {
                wh50Var.setValue(Boolean.FALSE);
            } else if (!wh50Var.getValue().booleanValue()) {
                wh50Var.setValue(Boolean.TRUE);
                this.d.invoke();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2u0(boolean z, xvy xvyVar, int i, wh50<Boolean> wh50Var, gzs<s3q0> gzsVar, spj<? super f2u0> spjVar) {
        super(2, spjVar);
        this.$isEnabled = z;
        this.$lazyListState = xvyVar;
        this.$itemsCount = i;
        this.$isTriggered = wh50Var;
        this.$onActionTrigger = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f2u0(this.$isEnabled, this.$lazyListState, this.$itemsCount, this.$isTriggered, this.$onActionTrigger, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((f2u0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$isEnabled) {
                izg0 M = nr2.M(new acp0(this.$lazyListState, 9));
                a aVar = new a(this.$itemsCount, this.$isTriggered, this.$onActionTrigger);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
