package com.yandex.go.overdraft.domain;

import com.yandex.go.overdraft.data.model.DebtPaymentMethodDto;
import defpackage.edi0;
import defpackage.evu0;
import defpackage.ez80;
import defpackage.hia1;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.lea0;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.nea0;
import defpackage.ny61;
import defpackage.ogz0;
import defpackage.pl21;
import defpackage.rhq0;
import defpackage.u0k;
import defpackage.vez0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljfa0;", "paymentOptions", "Lpl21;", "userDebtsState", "Lez80;", "<anonymous>", "(Ljfa0;Lpl21;)Lez80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.OverdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1", f = "OverdraftDomainStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1(h hVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OverdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1 overdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1 = new OverdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1(this.this$0, (Continuation) obj3);
        overdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1.L$0 = (jfa0) obj;
        overdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1.L$1 = (pl21) obj2;
        return overdraftDomainStateInteractor$getOverdraftPaymentDomainStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        edi0 edi0Var;
        jfa0 jfa0Var = (jfa0) this.L$0;
        pl21 pl21Var = (pl21) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        List list = pl21Var.b.f;
        if (list != null) {
            List list2 = jfa0Var.a;
            rhq0 rhq0Var = jfa0Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                u0k u0kVar = ((nea0) obj2).a;
                if (!(u0kVar instanceof ogz0)) {
                    if (u0kVar instanceof lea0) {
                        lea0 lea0Var = (lea0) u0kVar;
                        String code = lea0Var.c().getCode();
                        String id = lea0Var.getId();
                        List<DebtPaymentMethodDto> list3 = list;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            for (DebtPaymentMethodDto debtPaymentMethodDto : list3) {
                                String str = debtPaymentMethodDto.a;
                                String str2 = debtPaymentMethodDto.b;
                                if (!jl40.l(str, code) || (id != null && !id.equals(str2) && (!hia1.c(lea0Var.c()) || !evu0.J(str2)))) {
                                }
                            }
                        }
                    }
                    arrayList.add(obj2);
                    break;
                }
            }
            lea0 lea0Var2 = (rhq0Var == null || (edi0Var = rhq0Var.a) == null) ? null : edi0Var.a;
            if (lea0Var2 != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u0k u0kVar2 = ((nea0) it.next()).a;
                    if (vez0.O(u0kVar2 instanceof lea0 ? (lea0) u0kVar2 : null, lea0Var2)) {
                        break;
                    }
                }
            }
            rhq0Var = null;
            jfa0Var = jfa0.a(jfa0Var, arrayList, rhq0Var, 4);
        }
        h hVar = this.this$0;
        m6a0 a = hVar.a.a();
        List list4 = jfa0Var.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            u0k u0kVar3 = ((nea0) it2.next()).a;
            lea0 lea0Var3 = u0kVar3 instanceof lea0 ? (lea0) u0kVar3 : null;
            if (lea0Var3 != null) {
                arrayList2.add(lea0Var3);
            }
        }
        lea0 b = h.b(arrayList2, a);
        if (b != null) {
            List list5 = jfa0Var.a;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    u0k u0kVar4 = ((nea0) it3.next()).a;
                    if (vez0.O(u0kVar4 instanceof lea0 ? (lea0) u0kVar4 : null, b)) {
                        break;
                    }
                }
            }
        }
        hVar.a.a.l(null);
        b = null;
        this.this$0.getClass();
        rhq0 rhq0Var2 = jfa0Var.b;
        if (b == null) {
            rhq0Var2 = null;
        }
        return new ez80(jfa0.a(jfa0Var, null, rhq0Var2, 5), pl21Var);
    }
}
