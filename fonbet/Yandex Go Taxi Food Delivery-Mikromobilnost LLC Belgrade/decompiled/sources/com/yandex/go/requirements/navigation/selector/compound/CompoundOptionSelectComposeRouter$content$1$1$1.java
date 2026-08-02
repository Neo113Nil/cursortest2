package com.yandex.go.requirements.navigation.selector.compound;

import com.yandex.go.summary.analytics.SummaryAnalytics$ModalCloseReason;
import com.yandex.go.summary.analytics.SummaryAnalytics$ModalType;
import defpackage.agd;
import defpackage.avd;
import defpackage.bvd;
import defpackage.cvd;
import defpackage.dvd;
import defpackage.evd;
import defpackage.gmw0;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.qud;
import defpackage.rud;
import defpackage.sk7;
import defpackage.sue0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vcv0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wud;
import defpackage.yfd;
import defpackage.yud;
import defpackage.zud;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.navigation.selector.compound.CompoundOptionSelectComposeRouter$content$1$1$1", f = "CompoundOptionSelectComposeRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CompoundOptionSelectComposeRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ dvd $action;
    final /* synthetic */ qud $innerNavigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ rud this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompoundOptionSelectComposeRouter$content$1$1$1(rud rudVar, dvd dvdVar, qud qudVar, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rudVar;
        this.$action = dvdVar;
        this.$innerNavigator = qudVar;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompoundOptionSelectComposeRouter$content$1$1$1(this.this$0, this.$action, this.$innerNavigator, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CompoundOptionSelectComposeRouter$content$1$1$1 compoundOptionSelectComposeRouter$content$1$1$1 = (CompoundOptionSelectComposeRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        compoundOptionSelectComposeRouter$content$1$1$1.invokeSuspend(zy11Var);
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
        p1b p1bVar = this.this$0.G;
        dvd dvdVar = this.$action;
        qud qudVar = this.$innerNavigator;
        Object obj3 = ((agd) this.$this_buildContent).a;
        gmw0 gmw0Var = ((wud) obj3).b;
        mi31 mi31Var = ((wud) obj3).a;
        int i = ((wud) obj3).d;
        if (dvdVar instanceof avd) {
            sue0 sue0Var = (sue0) p1bVar.b;
            SummaryAnalytics$ModalType summaryAnalytics$ModalType = SummaryAnalytics$ModalType.Default;
            String str = gmw0Var.c;
            avd avdVar = (avd) dvdVar;
            boolean z = avdVar.b;
            sue0Var.k(summaryAnalytics$ModalType, str, avdVar.a, !z, 0, mi31Var.f, mi31Var.b, mi31Var.g);
            ((sk7) p1bVar.a).a(gmw0Var, i, z ? avdVar.a : null);
            qudVar.a(SummaryAnalytics$ModalCloseReason.OptionSelection);
        } else if (dvdVar instanceof bvd) {
            sue0 sue0Var2 = (sue0) p1bVar.b;
            SummaryAnalytics$ModalType summaryAnalytics$ModalType2 = SummaryAnalytics$ModalType.Default;
            String str2 = gmw0Var.c;
            List list = ((bvd) dvdVar).a.c.a;
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((evd) it.next()).a);
            }
            List list3 = list;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list3) {
                if (!((evd) obj4).f) {
                    arrayList2.add(obj4);
                }
            }
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((evd) it2.next()).a);
            }
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (((evd) obj2).e) {
                    break;
                }
            }
            evd evdVar = (evd) obj2;
            sue0Var2.j(summaryAnalytics$ModalType2, str2, Collections.singletonList(new vcv0(evdVar != null ? evdVar.a : null, arrayList, arrayList3)), mi31Var.f, mi31Var.b, mi31Var.g);
        } else {
            p1bVar.getClass();
            if (jl40.l(dvdVar, yud.a)) {
                qudVar.a(SummaryAnalytics$ModalCloseReason.CloseButton);
            } else if (jl40.l(dvdVar, zud.a)) {
                qudVar.a(SummaryAnalytics$ModalCloseReason.TapOutside);
            } else {
                if (!jl40.l(dvdVar, cvd.a)) {
                    w511.b();
                    return null;
                }
                qudVar.a(SummaryAnalytics$ModalCloseReason.SystemBack);
            }
        }
        return zy11.a;
    }
}
