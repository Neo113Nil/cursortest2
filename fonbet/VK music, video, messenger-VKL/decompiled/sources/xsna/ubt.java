package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogFeature.kt */
@b6l(c = "com.vk.games.presentation.catalog.mvi.GamesCatalogFeature$launchLoading$1", f = "GamesCatalogFeature.kt", l = {332}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ubt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $catalogLastOffset;
    final /* synthetic */ izs<Throwable, s3q0> $onError;
    final /* synthetic */ izs<adt, s3q0> $onSuccessLoad;
    final /* synthetic */ GamesCatalogScreenTab $tab;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xbt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ubt(xbt xbtVar, GamesCatalogScreenTab gamesCatalogScreenTab, int i, izs<? super adt, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, spj<? super ubt> spjVar) {
        super(2, spjVar);
        this.this$0 = xbtVar;
        this.$tab = gamesCatalogScreenTab;
        this.$catalogLastOffset = i;
        this.$onSuccessLoad = izsVar;
        this.$onError = izsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ubt ubtVar = new ubt(this.this$0, this.$tab, this.$catalogLastOffset, this.$onSuccessLoad, this.$onError, spjVar);
        ubtVar.L$0 = obj;
        return ubtVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ubt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                xbt xbtVar = this.this$0;
                GamesCatalogScreenTab gamesCatalogScreenTab = this.$tab;
                int i2 = this.$catalogLastOffset;
                ddt ddtVar = xbtVar.f;
                boolean booleanValue = ((Boolean) xbtVar.n.getValue()).booleanValue();
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = ddtVar.a(gamesCatalogScreenTab, i2, booleanValue, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            failure = (adt) obj;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        izs<adt, s3q0> izsVar = this.$onSuccessLoad;
        if (!(failure instanceof Result.Failure)) {
            izsVar.invoke((adt) failure);
        }
        izs<Throwable, s3q0> izsVar2 = this.$onError;
        Throwable a = Result.a(failure);
        if (a != null) {
            izsVar2.invoke(a);
        }
        return s3q0.a;
    }
}
