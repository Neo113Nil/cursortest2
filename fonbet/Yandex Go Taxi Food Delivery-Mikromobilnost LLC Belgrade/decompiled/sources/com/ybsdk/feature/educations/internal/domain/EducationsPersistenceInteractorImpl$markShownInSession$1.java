package com.ybsdk.feature.educations.internal.domain;

import com.ybsdk.di.modules.features.h;
import defpackage.btc;
import defpackage.dsg;
import defpackage.jqp0;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.trp0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.educations.internal.domain.EducationsPersistenceInteractorImpl$markShownInSession$1", f = "EducationsPersistenceInteractorImpl.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EducationsPersistenceInteractorImpl$markShownInSession$1 extends SuspendLambda implements wls {
    final /* synthetic */ btc $shownInfo;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationsPersistenceInteractorImpl$markShownInSession$1(a aVar, btc btcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$shownInfo = btcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EducationsPersistenceInteractorImpl$markShownInSession$1(this.this$0, this.$shownInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EducationsPersistenceInteractorImpl$markShownInSession$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        a aVar;
        btc btcVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                b.b(obj);
                aVar = this.this$0;
                btc btcVar2 = this.$shownInfo;
                h hVar = aVar.a;
                this.L$0 = aVar;
                this.L$1 = btcVar2;
                this.label = 1;
                Object a = hVar.a(this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                btcVar = btcVar2;
                obj = a;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                btcVar = (btc) this.L$1;
                aVar = (a) this.L$0;
                b.b(obj);
            }
            aVar.e.put(btcVar.c.a + ((String) obj), Boolean.TRUE);
            failure = zy11Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        btc btcVar3 = this.$shownInfo;
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            List singletonList = Collections.singletonList(lrp0.j);
            String str2 = btcVar3.a;
            boolean isEmpty = singletonList.isEmpty();
            if (!isEmpty) {
                if (isEmpty) {
                    w511.b();
                    return null;
                }
                str = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
            }
            trp0 trp0Var = trp0.a;
            trp0.e(new jqp0(a2, "Failed to mark education shown in session", str2, str));
        }
        return zy11Var;
    }
}
