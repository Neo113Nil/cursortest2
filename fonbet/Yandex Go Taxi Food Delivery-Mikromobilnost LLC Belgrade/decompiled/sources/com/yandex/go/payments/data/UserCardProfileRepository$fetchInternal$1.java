package com.yandex.go.payments.data;

import com.yandex.go.payments.cards.domain.model.UserCardProfileParams;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qk21;
import defpackage.tse;
import defpackage.tx90;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.data.UserCardProfileRepository$fetchInternal$1", f = "UserCardProfileRepository.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class UserCardProfileRepository$fetchInternal$1 extends SuspendLambda implements wls {
    final /* synthetic */ UserCardProfileParams $params;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCardProfileRepository$fetchInternal$1(u uVar, UserCardProfileParams userCardProfileParams, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uVar;
        this.$params = userCardProfileParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserCardProfileRepository$fetchInternal$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserCardProfileRepository$fetchInternal$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        UserCardProfileName userCardProfileName;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                u uVar = this.this$0;
                UserCardProfileParams userCardProfileParams = this.$params;
                r rVar = uVar.a;
                this.label = 1;
                obj = rVar.a(userCardProfileParams, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            userCardProfileName = (UserCardProfileName) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        if (userCardProfileName == null) {
            throw new IllegalArgumentException(("Unknown or absent profile " + userCardProfileName).toString());
        }
        failure = new tx90(userCardProfileName);
        r0 r0Var = this.this$0.c;
        qk21 qk21Var = new qk21(this.$params, new Result(failure));
        r0Var.getClass();
        r0Var.m(null, qk21Var);
        return zy11.a;
    }
}
