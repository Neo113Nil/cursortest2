package com.yandex.payment.divkit.sbp;

import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.divkit.usecases.t;
import defpackage.cjm0;
import defpackage.fq4;
import defpackage.jl40;
import defpackage.krl0;
import defpackage.luf;
import defpackage.muf;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vam0;
import defpackage.w511;
import defpackage.wls;
import defpackage.yv90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.sbp.DKSbpViewModel$onPayClick$1", f = "DKSbpViewModel.kt", l = {273, 280, 284}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSbpViewModel$onPayClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ fq4 $bankInfo;
    final /* synthetic */ muf $bindCompletion;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSbpViewModel$onPayClick$1(a aVar, muf mufVar, fq4 fq4Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$bindCompletion = mufVar;
        this.$bankInfo = fq4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSbpViewModel$onPayClick$1(this.this$0, this.$bindCompletion, this.$bankInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSbpViewModel$onPayClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        int i3 = 1;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            if (i == 2) {
                b.b(obj);
                return zy11Var;
            }
            if (i == 3) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        SbpOperation sbpOperation = aVar.x;
        int i4 = 0;
        if (sbpOperation instanceof SbpOperation.BindSbpToken) {
            t tVar = aVar.b;
            String redirectUrl = ((SbpOperation.BindSbpToken) sbpOperation).getRedirectUrl();
            if (redirectUrl == null) {
                redirectUrl = "";
            }
            luf lufVar = new luf(this.this$0, this.$bankInfo, i4);
            muf mufVar = this.$bindCompletion;
            this.label = 1;
            tVar.d.a = true;
            ((yv90) tVar.b).j.b(redirectUrl, new vam0(8, tVar, lufVar), mufVar);
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (jl40.l(sbpOperation, SbpOperation.NewTokenPay.INSTANCE)) {
            a aVar2 = this.this$0;
            t tVar2 = aVar2.b;
            String str = aVar2.w;
            luf lufVar2 = new luf(aVar2, this.$bankInfo, i3);
            this.label = 2;
            tVar2.d.a = true;
            tVar2.a.b(str, new krl0(tVar2, lufVar2));
            if (zy11Var == coroutineSingletons) {
            }
        } else {
            if (!jl40.l(sbpOperation, SbpOperation.Pay.INSTANCE)) {
                w511.b();
                return null;
            }
            a aVar3 = this.this$0;
            t tVar3 = aVar3.b;
            String str2 = aVar3.w;
            luf lufVar3 = new luf(aVar3, this.$bankInfo, i2);
            this.label = 3;
            tVar3.d.a = true;
            tVar3.a.e(str2, new cjm0(0, tVar3, lufVar3));
            if (zy11Var == coroutineSingletons) {
            }
        }
    }
}
