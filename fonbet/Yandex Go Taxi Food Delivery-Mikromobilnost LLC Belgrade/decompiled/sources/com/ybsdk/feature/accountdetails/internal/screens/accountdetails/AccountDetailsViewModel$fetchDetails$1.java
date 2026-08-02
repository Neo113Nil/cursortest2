package com.ybsdk.feature.accountdetails.internal.screens.accountdetails;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk;
import defpackage.pz40;
import defpackage.tse;
import defpackage.v7l;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.accountdetails.internal.screens.accountdetails.AccountDetailsViewModel$fetchDetails$1", f = "AccountDetailsViewModel.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AccountDetailsViewModel$fetchDetails$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDetailsViewModel$fetchDetails$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountDetailsViewModel$fetchDetails$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountDetailsViewModel$fetchDetails$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, pk.b((pk) value, null, null, 2)));
            a aVar = this.this$0;
            com.ybsdk.feature.accountdetails.internal.interactors.a aVar2 = aVar.C;
            String agreementId = aVar.B.getAgreementId();
            this.label = 1;
            a = aVar2.a(agreementId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            v7l v7lVar = (v7l) a;
            pz40 Y2 = aVar3.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, pk.b((pk) value3, null, v7lVar, 1)));
        }
        a aVar4 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            x4c.g("Failed to fetch account details", null, a2, null, 10);
            pz40 Y3 = aVar4.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, pk.b((pk) value2, a2, null, 2)));
        }
        return zy11.a;
    }
}
