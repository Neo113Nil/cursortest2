package com.yandex.go.payments.plus.domain;

import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.evu0;
import defpackage.fl8;
import defpackage.jl40;
import defpackage.lea0;
import defpackage.lv90;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.nid0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.vez0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm6a0;", "selectedCardReference", "Loea0;", "paymentModels", "Lfl8;", "<anonymous>", "(Lm6a0;Loea0;)Lfl8;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.plus.domain.PlusPurchaseCardSelectionInteractor$getSelectedCardFlow$2", f = "PlusPurchaseCardSelectionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlusPurchaseCardSelectionInteractor$getSelectedCardFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPurchaseCardSelectionInteractor$getSelectedCardFlow$2(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusPurchaseCardSelectionInteractor$getSelectedCardFlow$2 plusPurchaseCardSelectionInteractor$getSelectedCardFlow$2 = new PlusPurchaseCardSelectionInteractor$getSelectedCardFlow$2(this.this$0, (Continuation) obj3);
        plusPurchaseCardSelectionInteractor$getSelectedCardFlow$2.L$0 = (m6a0) obj;
        plusPurchaseCardSelectionInteractor$getSelectedCardFlow$2.L$1 = (oea0) obj2;
        return plusPurchaseCardSelectionInteractor$getSelectedCardFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (((com.yandex.go.payments.data.model.response.Card) r5) != null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[EDGE_INSN: B:15:0x0046->B:16:0x0046 BREAK  A[LOOP:0: B:4:0x0020->B:96:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[LOOP:3: B:61:0x00eb->B:77:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[LOOP:0: B:4:0x0020->B:96:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fl8 fl8Var;
        fl8 fl8Var2;
        fl8 fl8Var3;
        Object obj2;
        Object obj3;
        m6a0 m6a0Var = (m6a0) this.L$0;
        oea0 oea0Var = (oea0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        fl8 fl8Var4 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        List list = oea0Var.a;
        i iVar = cVar.b;
        nid0 nid0Var = cVar.c;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                fl8Var = null;
                break;
            }
            lea0 lea0Var = (lea0) it.next();
            if (lea0Var instanceof fl8) {
                fl8Var = (fl8) lea0Var;
                if (jl40.l(fl8Var.a, m6a0Var != null ? m6a0Var.b : null)) {
                    if (fl8Var == null) {
                        break;
                    }
                }
            }
            fl8Var = null;
            if (fl8Var == null) {
            }
        }
        String str = fl8Var != null ? fl8Var.a : null;
        if (fl8Var != null && str != null && !evu0.J(str)) {
            Iterator it2 = iVar.a.d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (jl40.l(((Card) obj3).b, str)) {
                    break;
                }
            }
        }
        fl8Var = null;
        if (fl8Var != null) {
            return fl8Var;
        }
        lv90 a = iVar.p.b.a();
        if (a.c()) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                lea0 lea0Var2 = (lea0) obj2;
                if (a.c()) {
                    if (jl40.l(a.b, lea0Var2 != null ? lea0Var2.getId() : null)) {
                        if (a.a == (lea0Var2 != null ? lea0Var2.c() : null)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            fl8Var2 = obj2 instanceof fl8 ? (fl8) obj2 : null;
            if (fl8Var2 != null) {
                nid0Var.a.l(vez0.d0(fl8Var2));
                if (fl8Var2 == null) {
                    nid0Var.a.l(vez0.d0(fl8Var2));
                    return fl8Var2;
                }
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    lea0 lea0Var3 = (lea0) it4.next();
                    if (lea0Var3 instanceof fl8) {
                        fl8Var3 = (fl8) lea0Var3;
                        if (!fl8Var3.h && fl8Var3.c && lea0Var3.e()) {
                            if (fl8Var3 == null) {
                                fl8Var4 = fl8Var3;
                                break;
                            }
                        }
                    }
                    fl8Var3 = null;
                    if (fl8Var3 == null) {
                    }
                }
                nid0Var.a.l(vez0.d0(fl8Var4));
                return fl8Var4;
            }
        }
        fl8Var2 = null;
        if (fl8Var2 == null) {
        }
    }
}
