package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.dod0;
import defpackage.hod0;
import defpackage.ind0;
import defpackage.iod0;
import defpackage.jod0;
import defpackage.kod0;
import defpackage.m3v0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppr0;
import defpackage.qcs0;
import defpackage.scs0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.y0u0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentViewModel$startSilentPayment$1", f = "SilentPaymentViewModel.kt", l = {114, HProv.PP_PASSWD_TERM}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SilentPaymentViewModel$startSilentPayment$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilentPaymentViewModel$startSilentPayment$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SilentPaymentViewModel$startSilentPayment$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SilentPaymentViewModel$startSilentPayment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r12 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ind0 a = this.this$0.b.a.a();
            b bVar = this.this$0;
            PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
            bVar.D.b();
            r0 r0Var = bVar.E;
            qcs0 qcs0Var = new qcs0(bVar.W(plusTarifficatorPurchase));
            r0Var.getClass();
            r0Var.m(null, qcs0Var);
            b bVar2 = this.this$0;
            dod0 dod0Var = bVar2.w;
            scs0 scs0Var = new scs0(0, bVar2, a);
            ppr0 ppr0Var = new ppr0(8, bVar2, a);
            this.L$0 = null;
            this.label = 1;
            obj = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.b) dod0Var).a(a, scs0Var, ppr0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        kod0 kod0Var = (kod0) obj;
        if (kod0Var instanceof jod0) {
            b bVar3 = this.this$0;
            bVar3.D.b();
            ((m3v0) bVar3.x).e();
            return zy11Var;
        }
        if (kod0Var instanceof iod0) {
            b bVar4 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            bVar4.X(false);
            bVar4.D.b();
            ((y0u0) bVar4.y).a();
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (!(kod0Var instanceof hod0)) {
            w511.b();
            return null;
        }
        b bVar5 = this.this$0;
        bVar5.X(true);
        bVar5.D.b();
        bVar5.z.a();
        return zy11Var;
    }
}
