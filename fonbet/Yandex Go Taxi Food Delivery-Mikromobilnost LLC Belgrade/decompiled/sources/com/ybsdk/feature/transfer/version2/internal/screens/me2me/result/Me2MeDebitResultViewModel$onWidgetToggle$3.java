package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result;

import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.k910;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o910;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultViewModel$onWidgetToggle$3", f = "Me2MeDebitResultViewModel.kt", l = {160, HProv.PP_REFCOUNT, 183}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2MeDebitResultViewModel$onWidgetToggle$3 extends SuspendLambda implements wls {
    final /* synthetic */ Me2MeDebitResultState$WidgetState $currentState;
    final /* synthetic */ Me2MeDebitResultState$WidgetState $targetState;
    final /* synthetic */ String $verificationToken;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me2MeDebitResultViewModel$onWidgetToggle$3(Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState, a aVar, String str, Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState2, Continuation continuation) {
        super(2, continuation);
        this.$targetState = me2MeDebitResultState$WidgetState;
        this.this$0 = aVar;
        this.$verificationToken = str;
        this.$currentState = me2MeDebitResultState$WidgetState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Me2MeDebitResultViewModel$onWidgetToggle$3(this.$targetState, this.this$0, this.$verificationToken, this.$currentState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Me2MeDebitResultViewModel$onWidgetToggle$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.a.e0(r1, r2, r4, r13) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0067, code lost:
    
        if (r14 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
    
        if (r14 == r0) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object a;
        r0 r0Var;
        Object value;
        pk11 pk11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = o910.a[this.$targetState.ordinal()];
            if (i2 == 1) {
                a aVar = this.this$0;
                com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.a aVar2 = aVar.G;
                String partnerId = ((k910) aVar.X()).a.getYbInfo().getPartnerId();
                this.label = 1;
                b = aVar2.b(partnerId, this);
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                a aVar3 = this.this$0;
                com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.a aVar4 = aVar3.G;
                String partnerId2 = ((k910) aVar3.X()).a.getYbInfo().getPartnerId();
                String str = ((k910) this.this$0.X()).g;
                String str2 = this.$verificationToken;
                this.label = 2;
                a = aVar4.a(partnerId2, str, str2, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            b.b(obj);
            b = ((Result) obj).getValue();
            a aVar5 = this.this$0;
            Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState = this.$targetState;
            Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState2 = this.$currentState;
            Throwable a2 = Result.a(b);
            if (a2 != null) {
                a.b0(aVar5, me2MeDebitResultState$WidgetState, me2MeDebitResultState$WidgetState2, a2);
            }
            a aVar6 = this.this$0;
            Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState3 = this.$targetState;
            Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState4 = this.$currentState;
            if (!(b instanceof Result.Failure)) {
                Object obj2 = (dqg) b;
                if (obj2 instanceof bqg) {
                    a.d0(aVar6, me2MeDebitResultState$WidgetState3, me2MeDebitResultState$WidgetState4, (ct11) obj2);
                } else {
                    if (!(obj2 instanceof cqg)) {
                        w511.b();
                        return null;
                    }
                    a.c0(aVar6, me2MeDebitResultState$WidgetState3, (String) ((cqg) obj2).a);
                }
            }
            return zy11.a;
        }
        if (i != 2) {
            if (i == 3) {
                b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a = ((Result) obj).getValue();
        a aVar7 = this.this$0;
        Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState5 = this.$targetState;
        Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState6 = this.$currentState;
        Throwable a3 = Result.a(a);
        if (a3 != null) {
            a.b0(aVar7, me2MeDebitResultState$WidgetState5, me2MeDebitResultState$WidgetState6, a3);
        }
        a aVar8 = this.this$0;
        Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState7 = this.$currentState;
        Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState8 = this.$targetState;
        if (!(a instanceof Result.Failure)) {
            sk11 sk11Var = (sk11) a;
            if (sk11Var instanceof pk11) {
                pz40 Y = aVar8.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    pk11Var = (pk11) sk11Var;
                } while (!r0Var.k(value, k910.a((k910) value, me2MeDebitResultState$WidgetState7, Me2MeDebitResultState$WidgetSubState.ENABLED, pk11Var.b, 39)));
                String str3 = pk11Var.a;
                TransferTwoFactorScreenProvider$Request transferTwoFactorScreenProvider$Request = TransferTwoFactorScreenProvider$Request.CONFIRM_ME2ME_AUTO_PULL;
                this.L$0 = a;
                this.label = 3;
            } else if (sk11Var instanceof qk11) {
                a.d0(aVar8, me2MeDebitResultState$WidgetState8, me2MeDebitResultState$WidgetState7, (ct11) sk11Var);
            } else {
                if (!(sk11Var instanceof rk11)) {
                    w511.b();
                    return null;
                }
                a.c0(aVar8, me2MeDebitResultState$WidgetState8, (String) ((rk11) sk11Var).a);
            }
        }
        return zy11.a;
    }
}
