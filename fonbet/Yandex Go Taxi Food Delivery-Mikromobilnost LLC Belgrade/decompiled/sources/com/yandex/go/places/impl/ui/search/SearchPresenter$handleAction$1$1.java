package com.yandex.go.places.impl.ui.search;

import defpackage.bvp0;
import defpackage.gj80;
import defpackage.hj80;
import defpackage.ij80;
import defpackage.mvg;
import defpackage.mwp0;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.xsp0;
import defpackage.zsp0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.search.SearchPresenter$handleAction$1$1", f = "SearchPresenter.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchPresenter$handleAction$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zsp0 $actionType;
    final /* synthetic */ zzs $it;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPresenter$handleAction$1$1(f fVar, zzs zzsVar, zsp0 zsp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$it = zzsVar;
        this.$actionType = zsp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchPresenter$handleAction$1$1(this.this$0, this.$it, this.$actionType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchPresenter$handleAction$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Integer num = null;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ((bvp0) this.this$0.Dg()).render(new mwp0(""));
                f fVar = this.this$0;
                zzs zzsVar = this.$it;
                zsp0 zsp0Var = this.$actionType;
                a aVar = fVar.G;
                String str = ((xsp0) zsp0Var).b;
                ij80 a = fVar.H.a().a();
                if (a instanceof gj80) {
                    num = Integer.valueOf(((gj80) a).a);
                } else if (!(a instanceof hj80)) {
                    throw new NoWhenBranchMatchedException();
                }
                int intValue = num != null ? num.intValue() : 1;
                this.label = 1;
                if (aVar.b(zzsVar, str, intValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        ((bvp0) this.this$0.Dg()).hideKeyboard();
        this.this$0.x.a.r(new qu(9));
        return zy11.a;
    }
}
