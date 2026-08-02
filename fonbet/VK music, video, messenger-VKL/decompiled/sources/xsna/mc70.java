package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.oa70;
import xsna.yb70;

/* compiled from: NotificationListView.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView$NotificationListPagerSynchronizationEffects$2$1", f = "NotificationListView.kt", l = {246}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class mc70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<oa70, s3q0> $onAction;
    final /* synthetic */ yb70.f $pagesState;
    final /* synthetic */ mc90 $vkPagerState;
    int label;

    /* compiled from: NotificationListView.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ yb70.f b;
        public final /* synthetic */ mc90 c;
        public final /* synthetic */ izs<oa70, s3q0> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yb70.f fVar, mc90 mc90Var, izs<? super oa70, s3q0> izsVar) {
            this.b = fVar;
            this.c = mc90Var;
            this.d = izsVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            int intValue = ((Number) obj).intValue();
            if (intValue >= 0) {
                yb70.f fVar = this.b;
                if (intValue < fVar.b.size() && intValue != fVar.c && this.c.o() > 0) {
                    this.d.invoke(new oa70.k(intValue));
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mc70(mc90 mc90Var, yb70.f fVar, izs<? super oa70, s3q0> izsVar, spj<? super mc70> spjVar) {
        super(2, spjVar);
        this.$vkPagerState = mc90Var;
        this.$pagesState = fVar;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mc70(this.$vkPagerState, this.$pagesState, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mc70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr l = rsr.l(new etr(nr2.M(new tju(this.$vkPagerState, 12))));
            a aVar = new a(this.$pagesState, this.$vkPagerState, this.$onAction);
            this.label = 1;
            if (l.collect(aVar, this) == coroutineSingletons) {
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
