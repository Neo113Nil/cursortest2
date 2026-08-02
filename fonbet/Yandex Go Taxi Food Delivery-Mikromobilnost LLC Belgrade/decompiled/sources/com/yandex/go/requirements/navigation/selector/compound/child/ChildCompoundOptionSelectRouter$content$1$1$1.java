package com.yandex.go.requirements.navigation.selector.compound.child;

import com.yandex.go.summary.analytics.SummaryAnalytics$ModalCloseReason;
import com.yandex.go.summary.analytics.SummaryAnalytics$ModalType;
import defpackage.agd;
import defpackage.gmw0;
import defpackage.hob;
import defpackage.iob;
import defpackage.jl40;
import defpackage.job;
import defpackage.lpb;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rob;
import defpackage.sob;
import defpackage.sue0;
import defpackage.tcc;
import defpackage.tob;
import defpackage.tse;
import defpackage.uob;
import defpackage.vcv0;
import defpackage.vob;
import defpackage.w511;
import defpackage.wls;
import defpackage.wob;
import defpackage.xob;
import defpackage.yfd;
import defpackage.yob;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.navigation.selector.compound.child.ChildCompoundOptionSelectRouter$content$1$1$1", f = "ChildCompoundOptionSelectRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ChildCompoundOptionSelectRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ xob $action;
    final /* synthetic */ yob $actionInteractor;
    final /* synthetic */ job $innerNavigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChildCompoundOptionSelectRouter$content$1$1$1(yob yobVar, xob xobVar, job jobVar, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.$actionInteractor = yobVar;
        this.$action = xobVar;
        this.$innerNavigator = jobVar;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChildCompoundOptionSelectRouter$content$1$1$1(this.$actionInteractor, this.$action, this.$innerNavigator, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChildCompoundOptionSelectRouter$content$1$1$1 childCompoundOptionSelectRouter$content$1$1$1 = (ChildCompoundOptionSelectRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        childCompoundOptionSelectRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        yob yobVar = this.$actionInteractor;
        xob xobVar = this.$action;
        job jobVar = this.$innerNavigator;
        Object obj3 = ((agd) this.$this_buildContent).a;
        gmw0 gmw0Var = ((iob) obj3).b;
        mi31 mi31Var = ((iob) obj3).a;
        if (xobVar instanceof sob) {
            sue0 sue0Var = yobVar.b;
            SummaryAnalytics$ModalType summaryAnalytics$ModalType = SummaryAnalytics$ModalType.ChildSeats;
            String str = gmw0Var.c;
            sob sobVar = (sob) xobVar;
            boolean z = sobVar.a;
            sue0Var.k(summaryAnalytics$ModalType, str, sobVar.b, !z, sobVar.c, mi31Var.f, mi31Var.b, mi31Var.g);
            yobVar.a.a(gmw0Var, sobVar.c, z ? sobVar.b : null);
        } else if (xobVar instanceof vob) {
            sue0 sue0Var2 = yobVar.b;
            SummaryAnalytics$ModalType summaryAnalytics$ModalType2 = SummaryAnalytics$ModalType.ChildSeats;
            String str2 = gmw0Var.c;
            ArrayList arrayList = ((vob) xobVar).a.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList3 = ((lpb) it.next()).c;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((hob) it2.next()).a);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : arrayList3) {
                    if (!((hob) obj4).e) {
                        arrayList5.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(((hob) it3.next()).a);
                }
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it4.next();
                    if (((hob) obj2).d) {
                        break;
                    }
                }
                hob hobVar = (hob) obj2;
                arrayList2.add(new vcv0(hobVar != null ? hobVar.a : null, arrayList4, arrayList6));
            }
            sue0Var2.j(summaryAnalytics$ModalType2, str2, arrayList2, mi31Var.f, mi31Var.b, mi31Var.g);
        } else {
            yobVar.getClass();
            if (jl40.l(xobVar, rob.a)) {
                jobVar.a(SummaryAnalytics$ModalCloseReason.BackButton);
            } else if (jl40.l(xobVar, uob.a)) {
                jobVar.a(SummaryAnalytics$ModalCloseReason.CloseButton);
            } else if (jl40.l(xobVar, tob.a)) {
                jobVar.a(SummaryAnalytics$ModalCloseReason.TapOutside);
            } else {
                if (!jl40.l(xobVar, wob.a)) {
                    w511.b();
                    return null;
                }
                jobVar.a(SummaryAnalytics$ModalCloseReason.SystemBack);
            }
        }
        return zy11.a;
    }
}
