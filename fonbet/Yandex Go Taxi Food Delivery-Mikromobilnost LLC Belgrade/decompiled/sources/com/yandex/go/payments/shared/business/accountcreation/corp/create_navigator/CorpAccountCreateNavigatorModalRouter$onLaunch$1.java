package com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator;

import com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.analytics.B2BAccountFlowAnalytics$B2BNavigatorModalButtonType;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$AddCompanyButton;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$EmployeeAccessButton;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$HireDriverButton;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$RestoreAccessButton;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.o;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.p;
import defpackage.ate;
import defpackage.foc;
import defpackage.fte;
import defpackage.g6u;
import defpackage.kfv;
import defpackage.kte;
import defpackage.lte;
import defpackage.mja1;
import defpackage.mte;
import defpackage.mvg;
import defpackage.nte;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o61;
import defpackage.ovi0;
import defpackage.pte;
import defpackage.qte;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.wte;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.CorpAccountCreateNavigatorModalRouter$onLaunch$1", f = "CorpAccountCreateNavigatorModalRouter.kt", l = {HProv.ALG_SID_NO_HASH, 85}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CorpAccountCreateNavigatorModalRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ ate $payload;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.CorpAccountCreateNavigatorModalRouter$onLaunch$1$1", f = "CorpAccountCreateNavigatorModalRouter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.CorpAccountCreateNavigatorModalRouter$onLaunch$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.this$0.r(new foc(19));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpAccountCreateNavigatorModalRouter$onLaunch$1(a aVar, ate ateVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = ateVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CorpAccountCreateNavigatorModalRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CorpAccountCreateNavigatorModalRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x002e, code lost:
    
        if (r2 == r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0158 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        B2BAccountFlowAnalytics$B2BNavigatorModalButtonType b;
        B2BAccountFlowAnalytics$B2BNavigatorModalButtonType b2;
        Object pteVar;
        Object obj2;
        B2BAccountFlowAnalytics$B2BNavigatorModalButtonType b3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        kfv kfvVar = null;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.domain.a aVar = this.this$0.K;
            this.label = 1;
            a = aVar.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = obj;
        }
        boolean booleanValue = ((Boolean) a).booleanValue();
        a aVar2 = this.this$0;
        if (!booleanValue) {
            aVar2.H.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 2;
            return tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        fte fteVar = aVar2.L;
        ate ateVar = this.$payload;
        fteVar.getClass();
        CorpAccountFlowExperiment.CorpCreationNavigatorModalDto corpCreationNavigatorModalDto = ateVar.a;
        Map map = ateVar.b;
        String str = (String) map.get(corpCreationNavigatorModalDto.a);
        int i2 = 6;
        ovi0 a2 = str != null ? mja1.a(str, null, 6) : null;
        String str2 = (String) map.get(corpCreationNavigatorModalDto.b);
        String str3 = (String) map.get(corpCreationNavigatorModalDto.c);
        List<p> list = corpCreationNavigatorModalDto.d;
        ArrayList arrayList = new ArrayList();
        for (p pVar : list) {
            String str4 = (String) map.get(pVar.getA());
            Object obj3 = kfvVar;
            if (str4 != null) {
                String b4 = pVar.getB();
                if (pVar instanceof CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$AddCompanyButton) {
                    B2BAccountFlowAnalytics$B2BNavigatorModalButtonType b5 = fte.b(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type.ADD_COMPANY);
                    obj3 = kfvVar;
                    if (b5 != null) {
                        obj2 = new pte(str4, b4 != null ? mja1.a(b4, kfvVar, i2) : kfvVar, kte.a, b5);
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                        kfvVar = null;
                    }
                } else {
                    if (pVar instanceof CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$EmployeeAccessButton) {
                        CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.EmployeeAccessInfoModalDto employeeAccessInfoModalDto = corpCreationNavigatorModalDto.e;
                        if (employeeAccessInfoModalDto != null && (b3 = fte.b(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type.EMPLOYEE_ACCESS)) != null) {
                            pteVar = new pte(str4, b4 != null ? mja1.a(b4, null, i2) : null, new lte(new wte(employeeAccessInfoModalDto, map)), b3);
                            obj2 = pteVar;
                            i2 = 6;
                        }
                        obj2 = null;
                    } else {
                        if (pVar instanceof CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$RestoreAccessButton) {
                            String str5 = ((CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$RestoreAccessButton) pVar).c;
                            if (str5 != null && (b2 = fte.b(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type.RESTORE_ACCESS)) != null) {
                                pteVar = new pte(str4, b4 != null ? mja1.a(b4, null, 6) : null, new nte(str5), b2);
                                obj2 = pteVar;
                                i2 = 6;
                            }
                        } else if (pVar instanceof CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$HireDriverButton) {
                            String str6 = ((CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$HireDriverButton) pVar).c;
                            if (str6 != null && (b = fte.b(CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$Type.HIRE_DRIVER)) != null) {
                                i2 = 6;
                                obj3 = new pte(str4, b4 != null ? mja1.a(b4, null, 6) : null, new mte(str6), b);
                            }
                        } else {
                            i2 = 6;
                            if (!(pVar instanceof o)) {
                                w511.b();
                                return null;
                            }
                            obj2 = null;
                        }
                        i2 = 6;
                        obj2 = null;
                    }
                    if (obj2 != null) {
                    }
                    kfvVar = null;
                }
            }
            obj2 = obj3;
            if (obj2 != null) {
            }
            kfvVar = null;
        }
        kfv kfvVar2 = kfvVar;
        List I = kotlin.collections.a.I(arrayList);
        qte qteVar = new qte(a2, str2, str3, I);
        r0 r0Var = fteVar.a;
        r0Var.getClass();
        r0Var.m(kfvVar2, qteVar);
        a aVar3 = this.this$0;
        aVar3.getClass();
        List list2 = I;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pte) it.next()).d);
        }
        o61 o61Var = aVar3.J;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((B2BAccountFlowAnalytics$B2BNavigatorModalButtonType) it2.next()).getEventValue());
        }
        hashMap.put("shown_buttons", arrayList3);
        o61Var.a.a("B2BAccountFlow.NavigatorModal.Shown", hashMap, 1, new HashMap());
        return zy11Var;
    }
}
