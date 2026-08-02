package com.yandex.go.payments.shared.wizard.welcome;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import defpackage.il;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o3f;
import defpackage.tor0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.wizard.welcome.CreateAccountPresenter$createAccount$1", f = "CreateAccountPresenter.kt", l = {108}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CreateAccountPresenter$createAccount$1 extends SuspendLambda implements wls {
    final /* synthetic */ o3f $accountInfo;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateAccountPresenter$createAccount$1(a aVar, o3f o3fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$accountInfo = o3fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateAccountPresenter$createAccount$1(this.this$0, this.$accountInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateAccountPresenter$createAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.go.payments.shared.wizard.welcome.a, java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        a aVar3;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar4 = this.this$0;
                o3f o3fVar = this.$accountInfo;
                try {
                    v vVar = aVar4.y;
                    this.L$0 = aVar4;
                    this.L$1 = aVar4;
                    this.L$2 = aVar4;
                    this.label = 1;
                    Object d = vVar.d(o3fVar, this);
                    if (d == r0) {
                        return r0;
                    }
                    aVar = aVar4;
                    aVar2 = aVar;
                    obj = d;
                    aVar3 = aVar2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar4;
                    aVar2 = aVar;
                    a.Kg(aVar2, th);
                    aVar.G = false;
                    aVar.Ng();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$2;
                aVar2 = (a) this.L$1;
                aVar3 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    a.Kg(aVar2, th);
                    aVar.G = false;
                    aVar.Ng();
                    return zy11.a;
                }
            }
            Account account = (Account) obj;
            tor0 tor0Var = aVar3.x.b;
            y.b(tor0Var.a, new il(account, account.a, account.b(), account.c()), MemberListMode.WIZARD_ADD_PARTICIPANTS_STEP, tor0Var.b);
            aVar.G = false;
            aVar.Ng();
            return zy11.a;
        } catch (Throwable th3) {
            r0.G = false;
            r0.Ng();
            throw th3;
        }
    }
}
