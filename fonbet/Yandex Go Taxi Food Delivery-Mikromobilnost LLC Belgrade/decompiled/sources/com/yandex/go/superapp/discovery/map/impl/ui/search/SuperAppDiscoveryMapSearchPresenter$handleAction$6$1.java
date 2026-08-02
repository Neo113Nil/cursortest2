package com.yandex.go.superapp.discovery.map.impl.ui.search;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.ixv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvv0;
import defpackage.qu;
import defpackage.qwv0;
import defpackage.swv0;
import defpackage.tse;
import defpackage.txv0;
import defpackage.wls;
import defpackage.ygs;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.SuperAppDiscoveryMapSearchPresenter$handleAction$6$1", f = "SuperAppDiscoveryMapSearchPresenter.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapSearchPresenter$handleAction$6$1 extends SuspendLambda implements wls {
    final /* synthetic */ swv0 $actionType;
    final /* synthetic */ zzs $it;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchPresenter$handleAction$6$1(f fVar, zzs zzsVar, swv0 swv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$it = zzsVar;
        this.$actionType = swv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapSearchPresenter$handleAction$6$1(this.this$0, this.$it, this.$actionType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapSearchPresenter$handleAction$6$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ((ixv0) this.this$0.Dg()).render(new txv0(""));
                f fVar = this.this$0;
                zzs zzsVar = this.$it;
                swv0 swv0Var = this.$actionType;
                a aVar = fVar.D;
                String str = ((qwv0) swv0Var).b;
                int i2 = ((pvv0) fVar.E.a.get()).a.a;
                this.label = 1;
                if (aVar.b(zzsVar, str, i2, this) == coroutineSingletons) {
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
        ((ixv0) this.this$0.Dg()).hideKeyboard();
        ((ygs) this.this$0.x.a).r(new qu(9));
        return zy11.a;
    }
}
