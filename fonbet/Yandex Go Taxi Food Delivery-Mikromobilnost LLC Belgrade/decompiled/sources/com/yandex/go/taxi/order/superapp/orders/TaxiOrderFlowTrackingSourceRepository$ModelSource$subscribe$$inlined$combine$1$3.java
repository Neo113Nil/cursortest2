package com.yandex.go.taxi.order.superapp.orders;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.api.models.PromoPlaqueItem$DisplayOnType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.CheckInAction;
import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.RatingDisplayPolicy;
import com.yandex.go.taxi.order.models.api.response.TravelCompanion;
import com.yandex.go.taxi.order.models.api.response.UiConfig;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxExperiment;
import defpackage.ad11;
import defpackage.an91;
import defpackage.b980;
import defpackage.bdc;
import defpackage.e401;
import defpackage.e58;
import defpackage.f501;
import defpackage.g301;
import defpackage.ifb1;
import defpackage.j0e;
import defpackage.jl40;
import defpackage.jpz;
import defpackage.jsq0;
import defpackage.kfb1;
import defpackage.kpz;
import defpackage.lpf0;
import defpackage.m6y0;
import defpackage.mvg;
import defpackage.n6y0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o6y0;
import defpackage.p6y0;
import defpackage.q180;
import defpackage.q48;
import defpackage.q6y0;
import defpackage.ufu;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xng0;
import defpackage.yfb;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.checkin.CheckInButtonState;
import ru.yandex.taxi.checkin.CheckInStateActionType;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.ConfigurationType;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.styling.ButtonType;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3", f = "TaxiOrderFlowTrackingSourceRepository.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3(Continuation continuation, n nVar) {
        super(3, continuation);
        this.this$0 = nVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3 taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3 = new TaxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3.L$0 = (vpr) obj;
        taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return taxiOrderFlowTrackingSourceRepository$ModelSource$subscribe$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0321 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        q6y0 q6y0Var;
        List list;
        boolean z;
        Iterator it;
        Iterator it2;
        boolean z2;
        o2y0 o2y0Var;
        boolean z3;
        n6y0 n6y0Var;
        Iterator it3;
        Object obj3;
        boolean z4;
        yfb yfbVar;
        TravelCompanion travelCompanion;
        OrderStatusInfo.SearchEstimates searchEstimates;
        boolean z5;
        Object obj4;
        Iterator it4;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj5 = objArr[0];
            Object obj6 = objArr[1];
            Object obj7 = objArr[2];
            Object obj8 = objArr[3];
            Object obj9 = objArr[4];
            Object obj10 = objArr[5];
            Object obj11 = objArr[6];
            Object obj12 = objArr[7];
            Object obj13 = objArr[8];
            Object obj14 = objArr[9];
            p6y0 p6y0Var = (p6y0) objArr[10];
            g301 g301Var = (g301) obj14;
            e58 e58Var = (e58) obj13;
            ((Boolean) obj12).getClass();
            boolean booleanValue = ((Boolean) obj11).booleanValue();
            boolean booleanValue2 = ((Boolean) obj10).booleanValue();
            List list2 = (List) obj9;
            CheckInButtonState checkInButtonState = (CheckInButtonState) obj8;
            boolean booleanValue3 = ((Boolean) obj7).booleanValue();
            List list3 = (List) obj6;
            b980 b980Var = (b980) obj5;
            n nVar = this.this$0;
            DriveState c = nVar.b.c();
            if (c == DriveState.CANCELLED || c == DriveState.FAILED) {
                q6y0 q6y0Var2 = nVar.q;
                if (q6y0Var2 != null) {
                    obj2 = null;
                    q6y0Var = q6y0.c(q6y0Var2, null, 33546239);
                } else {
                    obj2 = null;
                    q6y0Var = null;
                }
            } else {
                q180 q180Var = nVar.d;
                o2y0 o2y0Var2 = nVar.b;
                q180Var.getClass();
                DriveState c2 = o2y0Var2.c();
                OrderStatusInfo V = o2y0Var2.b().V();
                FeedbackDto h = V.h();
                if (h != null) {
                    RatingDisplayPolicy ratingDisplayPolicy = h.d;
                    jsq0 a = ratingDisplayPolicy != null ? ratingDisplayPolicy.getA() : null;
                    if (a != null) {
                        list = list3;
                        z = a.contains(RatingDisplayPolicy.DisplayOnType.MULTIORDER);
                        m6y0 m6y0Var = new m6y0(z, ((com.yandex.go.taxi.order.feedback.domain.b) q180Var.a).b(o2y0Var2.b().a).i);
                        boolean z6 = c2 != DriveState.SEARCH || c2 == DriveState.PREORDER;
                        q48 q48Var = !an91.i(c2) ? null : b980Var.e;
                        OrderStatusInfo.SearchEstimates searchEstimates2 = V.c0;
                        boolean z7 = z6;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj15 : list2) {
                            m6y0 m6y0Var2 = m6y0Var;
                            q48 q48Var2 = q48Var;
                            jsq0 jsq0Var = ((CommunicationItem) obj15).j;
                            OrderStatusInfo.SearchEstimates searchEstimates3 = searchEstimates2;
                            if (jsq0Var != null ? jsq0Var.contains(CommunicationItem.DisplayOnType.MULTIORDER) : true) {
                                arrayList.add(obj15);
                            }
                            m6y0Var = m6y0Var2;
                            q48Var = q48Var2;
                            searchEstimates2 = searchEstimates3;
                        }
                        m6y0 m6y0Var3 = m6y0Var;
                        q48 q48Var3 = q48Var;
                        OrderStatusInfo.SearchEstimates searchEstimates4 = searchEstimates2;
                        jpz jpzVar = (jpz) q180Var.f.get();
                        LootBoxExperiment j = V.j();
                        kpz kpzVar = (kpz) jpzVar;
                        kpzVar.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        boolean z8 = j.b;
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList3 = arrayList;
                            CommunicationItem communicationItem = (CommunicationItem) it.next();
                            boolean z9 = z8;
                            CommunicationItem.a aVar = communicationItem.g;
                            List list4 = aVar != null ? aVar.e : null;
                            if (list4 == null) {
                                list4 = EmptyList.a;
                            }
                            Iterator it5 = list4.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it5.next();
                                Iterator it6 = it5;
                                if (((ActionButton) obj4).e instanceof ru.yandex.taxi.communications.model.widgets.g) {
                                    break;
                                }
                                it5 = it6;
                            }
                            ActionButton actionButton = (ActionButton) obj4;
                            ru.yandex.taxi.communications.model.widgets.g gVar = actionButton != null ? (ru.yandex.taxi.communications.model.widgets.g) actionButton.e : null;
                            if (gVar == null || !z9) {
                                it4 = it;
                            } else {
                                it4 = it;
                                if (gVar instanceof ActionButton.g) {
                                    com.yandex.go.lootbox.impl.domain.interactors.animation.e eVar = kpzVar.a;
                                    String str = ((ActionButton.g) gVar).b;
                                    if (eVar.e(str) != null && eVar.i(str)) {
                                        arrayList2.add(communicationItem);
                                    }
                                } else {
                                    arrayList2.add(communicationItem);
                                }
                            }
                            z8 = z9;
                            arrayList = arrayList3;
                            it = it4;
                        }
                        ArrayList arrayList4 = arrayList;
                        ArrayList arrayList5 = new ArrayList();
                        it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            CommunicationItem communicationItem2 = (CommunicationItem) next;
                            Iterator it7 = it2;
                            CommunicationItem.a aVar2 = communicationItem2.g;
                            boolean z10 = booleanValue2;
                            ConfigurationType a2 = communicationItem2.i.a();
                            o2y0 o2y0Var3 = o2y0Var2;
                            if ((aVar2.equals(CommunicationItem.a.j) || aVar2.a != null || aVar2.c != null || aVar2.f != null || aVar2.h != null || !aVar2.e.isEmpty()) && !arrayList2.contains(communicationItem2) && (a2 == ConfigurationType.LIST || a2 == ConfigurationType.BUBBLE)) {
                                arrayList5.add(next);
                            }
                            it2 = it7;
                            booleanValue2 = z10;
                            o2y0Var2 = o2y0Var3;
                        }
                        z2 = booleanValue2;
                        o2y0Var = o2y0Var2;
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.addAll(arrayList5);
                        arrayList6.addAll(arrayList2);
                        if (p6y0Var instanceof o6y0) {
                            z3 = false;
                            if (p6y0Var instanceof n6y0) {
                                n6y0Var = (n6y0) p6y0Var;
                                lpf0 lpf0Var = q180Var.g;
                                PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType = PromoPlaqueItem$DisplayOnType.MULTI_ORDER;
                                lpf0Var.getClass();
                                ArrayList a3 = lpf0.a(arrayList6, promoPlaqueItem$DisplayOnType);
                                it3 = arrayList4.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it3.next();
                                    if (((CommunicationItem) obj3).i.a() == ConfigurationType.DIALOGUE) {
                                        break;
                                    }
                                }
                                CommunicationItem communicationItem3 = (CommunicationItem) obj3;
                                e401 e401Var = communicationItem3 != null ? new e401(communicationItem3.b, communicationItem3.d, ((ufu) q180Var.b).a(new bdc(xng0.bgTransparent), ((j0e) communicationItem3.i).a)) : null;
                                TaxiOrder b = o2y0Var.b();
                                z4 = c2 == DriveState.CHECK_IN ? true : z3;
                                CheckInInfo checkInInfo = b.V().a0;
                                if (z4 || checkInInfo == null) {
                                    yfbVar = yfb.j;
                                } else {
                                    UiConfig uiConfig = checkInInfo.c;
                                    kfb1 b2 = ifb1.b(checkInInfo);
                                    CheckInAction checkInAction = uiConfig.a;
                                    String str2 = checkInAction.a;
                                    String str3 = checkInAction.b;
                                    CheckInStateActionType a4 = ifb1.a(checkInInfo);
                                    CheckInAction checkInAction2 = uiConfig.a;
                                    yfbVar = new yfb(checkInButtonState, true, b2, a4, str2, str3, checkInAction2.c, checkInAction2.d, q180Var.c.d(b.M(), b.x()).a.a(ButtonType.DEFAULT));
                                }
                                yfb yfbVar2 = yfbVar;
                                travelCompanion = (TravelCompanion) kotlin.collections.a.R(V.g0);
                                ad11 ad11Var = ad11.g;
                                if (travelCompanion != null) {
                                    Screen b3 = q180Var.e.b();
                                    ad11Var = q180Var.d.a(travelCompanion, (b3 == Screen.ORDERS_LIST || b3 == Screen.ORDER_TRACKING) ? true : z3);
                                }
                                ad11 ad11Var2 = ad11Var;
                                if (!z2 || booleanValue3) {
                                    searchEstimates = searchEstimates4;
                                    z5 = true;
                                } else {
                                    searchEstimates = searchEstimates4;
                                    z5 = z3;
                                }
                                boolean z11 = (V.l0 == null || jl40.l(o2y0Var.b().V(), OrderStatusInfo.y0)) ? z3 : true;
                                long j2 = o2y0Var.b().b.L;
                                String str4 = b980Var.a;
                                CharSequence charSequence = b980Var.c;
                                DriveState c3 = o2y0Var.c();
                                TaxiOrder b4 = o2y0Var.b();
                                Long l = b4.k;
                                q6y0Var = new q6y0(f501.a, g301Var, o2y0Var, j2, e58Var, str4, z7, charSequence, list, m6y0Var3, q48Var3, c3, l != null ? l.longValue() : b4.c, booleanValue3, z5, z11, searchEstimates != null ? Long.valueOf(searchEstimates.a()) : null, b980Var.b, yfbVar2, a3, e401Var, n6y0Var, b980Var.h, ad11Var2, booleanValue);
                                nVar.q = q6y0Var;
                                obj2 = null;
                            } else if (p6y0Var != null) {
                                w511.b();
                                return null;
                            }
                        } else {
                            z3 = false;
                            arrayList6.add(0, ((o6y0) p6y0Var).a);
                        }
                        n6y0Var = null;
                        lpf0 lpf0Var2 = q180Var.g;
                        PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType2 = PromoPlaqueItem$DisplayOnType.MULTI_ORDER;
                        lpf0Var2.getClass();
                        ArrayList a32 = lpf0.a(arrayList6, promoPlaqueItem$DisplayOnType2);
                        it3 = arrayList4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                            }
                        }
                        CommunicationItem communicationItem32 = (CommunicationItem) obj3;
                        if (communicationItem32 != null) {
                        }
                        TaxiOrder b5 = o2y0Var.b();
                        if (c2 == DriveState.CHECK_IN) {
                        }
                        CheckInInfo checkInInfo2 = b5.V().a0;
                        if (z4) {
                        }
                        yfbVar = yfb.j;
                        yfb yfbVar22 = yfbVar;
                        travelCompanion = (TravelCompanion) kotlin.collections.a.R(V.g0);
                        ad11 ad11Var3 = ad11.g;
                        if (travelCompanion != null) {
                        }
                        ad11 ad11Var22 = ad11Var3;
                        if (z2) {
                        }
                        searchEstimates = searchEstimates4;
                        z5 = true;
                        if (V.l0 == null) {
                        }
                        long j22 = o2y0Var.b().b.L;
                        String str42 = b980Var.a;
                        CharSequence charSequence2 = b980Var.c;
                        DriveState c32 = o2y0Var.c();
                        TaxiOrder b42 = o2y0Var.b();
                        Long l2 = b42.k;
                        if (searchEstimates != null) {
                        }
                        q6y0Var = new q6y0(f501.a, g301Var, o2y0Var, j22, e58Var, str42, z7, charSequence2, list, m6y0Var3, q48Var3, c32, l2 != null ? l2.longValue() : b42.c, booleanValue3, z5, z11, searchEstimates != null ? Long.valueOf(searchEstimates.a()) : null, b980Var.b, yfbVar22, a32, e401Var, n6y0Var, b980Var.h, ad11Var22, booleanValue);
                        nVar.q = q6y0Var;
                        obj2 = null;
                    }
                }
                list = list3;
                z = c2 == DriveState.TRANSPORTING || c2 == DriveState.COMPLETE;
                m6y0 m6y0Var4 = new m6y0(z, ((com.yandex.go.taxi.order.feedback.domain.b) q180Var.a).b(o2y0Var2.b().a).i);
                if (c2 != DriveState.SEARCH) {
                }
                if (!an91.i(c2)) {
                }
                OrderStatusInfo.SearchEstimates searchEstimates22 = V.c0;
                boolean z72 = z6;
                ArrayList arrayList7 = new ArrayList();
                while (r11.hasNext()) {
                }
                m6y0 m6y0Var32 = m6y0Var4;
                q48 q48Var32 = q48Var;
                OrderStatusInfo.SearchEstimates searchEstimates42 = searchEstimates22;
                jpz jpzVar2 = (jpz) q180Var.f.get();
                LootBoxExperiment j3 = V.j();
                kpz kpzVar2 = (kpz) jpzVar2;
                kpzVar2.getClass();
                ArrayList arrayList22 = new ArrayList();
                boolean z82 = j3.b;
                it = arrayList7.iterator();
                while (it.hasNext()) {
                }
                ArrayList arrayList42 = arrayList7;
                ArrayList arrayList52 = new ArrayList();
                it2 = arrayList42.iterator();
                while (it2.hasNext()) {
                }
                z2 = booleanValue2;
                o2y0Var = o2y0Var2;
                ArrayList arrayList62 = new ArrayList();
                arrayList62.addAll(arrayList52);
                arrayList62.addAll(arrayList22);
                if (p6y0Var instanceof o6y0) {
                }
                n6y0Var = null;
                lpf0 lpf0Var22 = q180Var.g;
                PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType22 = PromoPlaqueItem$DisplayOnType.MULTI_ORDER;
                lpf0Var22.getClass();
                ArrayList a322 = lpf0.a(arrayList62, promoPlaqueItem$DisplayOnType22);
                it3 = arrayList42.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                    }
                }
                CommunicationItem communicationItem322 = (CommunicationItem) obj3;
                if (communicationItem322 != null) {
                }
                TaxiOrder b52 = o2y0Var.b();
                if (c2 == DriveState.CHECK_IN) {
                }
                CheckInInfo checkInInfo22 = b52.V().a0;
                if (z4) {
                }
                yfbVar = yfb.j;
                yfb yfbVar222 = yfbVar;
                travelCompanion = (TravelCompanion) kotlin.collections.a.R(V.g0);
                ad11 ad11Var32 = ad11.g;
                if (travelCompanion != null) {
                }
                ad11 ad11Var222 = ad11Var32;
                if (z2) {
                }
                searchEstimates = searchEstimates42;
                z5 = true;
                if (V.l0 == null) {
                }
                long j222 = o2y0Var.b().b.L;
                String str422 = b980Var.a;
                CharSequence charSequence22 = b980Var.c;
                DriveState c322 = o2y0Var.c();
                TaxiOrder b422 = o2y0Var.b();
                Long l22 = b422.k;
                if (searchEstimates != null) {
                }
                q6y0Var = new q6y0(f501.a, g301Var, o2y0Var, j222, e58Var, str422, z72, charSequence22, list, m6y0Var32, q48Var32, c322, l22 != null ? l22.longValue() : b422.c, booleanValue3, z5, z11, searchEstimates != null ? Long.valueOf(searchEstimates.a()) : null, b980Var.b, yfbVar222, a322, e401Var, n6y0Var, b980Var.h, ad11Var222, booleanValue);
                nVar.q = q6y0Var;
                obj2 = null;
            }
            this.L$0 = obj2;
            this.L$1 = obj2;
            this.label = 1;
            if (vprVar.emit(q6y0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
