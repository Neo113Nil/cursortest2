package com.ybsdk.feature.autotopup.internal.presentation.result;

import com.ybsdk.feature.autotopup.internal.domain.e;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import defpackage.az3;
import defpackage.ba4;
import defpackage.ds31;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.tje;
import defpackage.tse;
import defpackage.ty3;
import defpackage.w511;
import defpackage.wls;
import defpackage.wy3;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultViewModel$saveDraft$1", f = "AutoTopupResultViewModel.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupResultViewModel$saveDraft$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupResultViewModel$saveDraft$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupResultViewModel$saveDraft$1 autoTopupResultViewModel$saveDraft$1 = new AutoTopupResultViewModel$saveDraft$1(this.this$0, continuation);
        autoTopupResultViewModel$saveDraft$1.L$0 = obj;
        return autoTopupResultViewModel$saveDraft$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupResultViewModel$saveDraft$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SaveAutoTopupRequest saveAutoTopupRequest;
        Object e;
        lrp0 lrp0Var = lrp0.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            e eVar = bVar.H;
            ba4 ba4Var = ((wy3) bVar.X()).i;
            if (ba4Var == null || (saveAutoTopupRequest = ba4Var.d) == null) {
                x4c.g("Can't save draft without SaveAutoTopupInfo", null, null, Collections.singletonList(lrp0Var), 6);
                return zy11Var;
            }
            this.label = 1;
            e = eVar.e(bVar, saveAutoTopupRequest, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        b bVar2 = this.this$0;
        if (!(e instanceof Result.Failure)) {
            sk11 sk11Var = (sk11) e;
            if (sk11Var instanceof rk11) {
                rk11 rk11Var = (rk11) sk11Var;
                bVar2.a0(new az3(rk11Var, 0));
                tje.N(ds31.a(bVar2), null, null, new AutoTopupResultViewModel$callRequestStatus$1(bVar2, ((ty3) rk11Var.a).a, bVar2.H.c.a(), null), 3);
            } else {
                if (!(sk11Var instanceof pk11) && !(sk11Var instanceof qk11)) {
                    w511.b();
                    return null;
                }
                x4c.g("Can't save draft on AutotopupResultScreen, auth required or failed", null, null, Collections.singletonList(lrp0Var), 6);
            }
        }
        b bVar3 = this.this$0;
        Throwable a = Result.a(e);
        if (a != null) {
            x4c.g("Can't save draft on AutotopupResultScreen", a, null, Collections.singletonList(lrp0Var), 4);
            b.b0(bVar3);
        }
        return zy11Var;
    }
}
