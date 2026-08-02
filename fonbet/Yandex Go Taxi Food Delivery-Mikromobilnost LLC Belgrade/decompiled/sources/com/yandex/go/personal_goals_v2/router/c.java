package com.yandex.go.personal_goals_v2.router;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.go.personal_goals_v2.data.model.PersonalGoalAcceptResponse;
import com.yandex.go.personal_goals_v2.ui.PersonalGoalsNotification;
import defpackage.a4b0;
import defpackage.a850;
import defpackage.b4b0;
import defpackage.bvf0;
import defpackage.bze;
import defpackage.e4b0;
import defpackage.f4b0;
import defpackage.i4b0;
import defpackage.mu5;
import defpackage.ny61;
import defpackage.opf0;
import defpackage.pgd;
import defpackage.ppf0;
import defpackage.qn5;
import defpackage.qpf0;
import defpackage.qu;
import defpackage.rpf0;
import defpackage.tcc;
import defpackage.tj60;
import defpackage.u4b0;
import defpackage.umv0;
import defpackage.v4b0;
import defpackage.w030;
import defpackage.w7b0;
import defpackage.wfd;
import defpackage.y50;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;
import ru.yandex.taxi.summary.promotions.repository.e;

/* loaded from: classes13.dex */
public final class c extends pgd {
    public final Context F;
    public final w030 G;
    public final y50 H;
    public final e4b0 I;
    public final com.yandex.go.personal_goals_v2.data.b J;
    public final com.yandex.go.personal_goals_v2.data.a K;
    public final a850 L;
    public final u4b0 M;
    public final f4b0 N;
    public final e O;
    public final r0 P;
    public final mu5 Q;

    public c(Context context, w030 w030Var, y50 y50Var, e4b0 e4b0Var, com.yandex.go.personal_goals_v2.data.b bVar, com.yandex.go.personal_goals_v2.data.a aVar, a850 a850Var, u4b0 u4b0Var, f4b0 f4b0Var, e eVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = y50Var;
        this.I = e4b0Var;
        this.J = bVar;
        this.K = aVar;
        this.L = a850Var;
        this.M = u4b0Var;
        this.N = f4b0Var;
        this.O = eVar;
        this.P = bvf0.c(new v4b0((String) null, (String) null, (ArrayList) null, (String) null, (String) null, 63));
        this.Q = new mu5(new i4b0(0, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(c cVar, a4b0 a4b0Var, ContinuationImpl continuationImpl) {
        PersonalGoalsRouterImpl$processAcceptError$1 personalGoalsRouterImpl$processAcceptError$1;
        int i;
        f4b0 f4b0Var;
        String str;
        String str2;
        cVar.getClass();
        if (continuationImpl instanceof PersonalGoalsRouterImpl$processAcceptError$1) {
            personalGoalsRouterImpl$processAcceptError$1 = (PersonalGoalsRouterImpl$processAcceptError$1) continuationImpl;
            int i2 = personalGoalsRouterImpl$processAcceptError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalGoalsRouterImpl$processAcceptError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalGoalsRouterImpl$processAcceptError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalGoalsRouterImpl$processAcceptError$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f4b0Var = cVar.N;
                    PersonalGoalAcceptResponse personalGoalAcceptResponse = a4b0Var.a;
                    String str3 = personalGoalAcceptResponse != null ? personalGoalAcceptResponse.a : null;
                    String str4 = personalGoalAcceptResponse != null ? personalGoalAcceptResponse.b : null;
                    com.yandex.go.personal_goals_v2.data.a aVar = cVar.K;
                    String str5 = personalGoalAcceptResponse != null ? personalGoalAcceptResponse.c : null;
                    personalGoalsRouterImpl$processAcceptError$1.L$0 = null;
                    personalGoalsRouterImpl$processAcceptError$1.L$1 = f4b0Var;
                    personalGoalsRouterImpl$processAcceptError$1.L$2 = str3;
                    personalGoalsRouterImpl$processAcceptError$1.L$3 = str4;
                    personalGoalsRouterImpl$processAcceptError$1.label = 1;
                    Object a = aVar.a(str5, personalGoalsRouterImpl$processAcceptError$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str3;
                    str2 = str4;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str6 = (String) personalGoalsRouterImpl$processAcceptError$1.L$3;
                    String str7 = (String) personalGoalsRouterImpl$processAcceptError$1.L$2;
                    f4b0Var = (f4b0) personalGoalsRouterImpl$processAcceptError$1.L$1;
                    kotlin.b.b(obj);
                    str2 = str6;
                    str = str7;
                }
                tj60 tj60Var = f4b0Var.b;
                PersonalGoalsNotification personalGoalsNotification = new PersonalGoalsNotification("personal-goal-notification", str, str2, (Bitmap) obj, true, f4b0Var.a);
                personalGoalsNotification.startExpiresTimer(5000L);
                personalGoalsNotification.setExpiresListener(new qn5(12, f4b0Var, personalGoalsNotification));
                tj60Var.e(personalGoalsNotification);
                cVar.W(false);
                return zy11.a;
            }
        }
        personalGoalsRouterImpl$processAcceptError$1 = new PersonalGoalsRouterImpl$processAcceptError$1(cVar, continuationImpl);
        Object obj2 = personalGoalsRouterImpl$processAcceptError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalGoalsRouterImpl$processAcceptError$1.label;
        if (i != 0) {
        }
        tj60 tj60Var2 = f4b0Var.b;
        PersonalGoalsNotification personalGoalsNotification2 = new PersonalGoalsNotification("personal-goal-notification", str, str2, (Bitmap) obj2, true, f4b0Var.a);
        personalGoalsNotification2.startExpiresTimer(5000L);
        personalGoalsNotification2.setExpiresListener(new qn5(12, f4b0Var, personalGoalsNotification2));
        tj60Var2.e(personalGoalsNotification2);
        cVar.W(false);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0218 A[LOOP:1: B:24:0x013a->B:29:0x0218, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0167 A[EDGE_INSN: B:30:0x0167->B:31:0x0167 BREAK  A[LOOP:1: B:24:0x013a->B:29:0x0218], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String, opf0] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V(c cVar, w7b0 w7b0Var, b4b0 b4b0Var, String str, ContinuationImpl continuationImpl) {
        PersonalGoalsRouterImpl$processAcceptSuccess$1 personalGoalsRouterImpl$processAcceptSuccess$1;
        int i;
        String str2;
        f4b0 f4b0Var;
        String str3;
        String str4;
        w7b0 w7b0Var2;
        String str5;
        int i2;
        int i3;
        Iterator it;
        ?? r9;
        r0 r0Var;
        Object value;
        Map map;
        ppf0 ppf0Var;
        String str6;
        String str7;
        Object value2;
        Map map2;
        ppf0 ppf0Var2;
        Iterator it2;
        cVar.getClass();
        if (continuationImpl instanceof PersonalGoalsRouterImpl$processAcceptSuccess$1) {
            personalGoalsRouterImpl$processAcceptSuccess$1 = (PersonalGoalsRouterImpl$processAcceptSuccess$1) continuationImpl;
            int i4 = personalGoalsRouterImpl$processAcceptSuccess$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                personalGoalsRouterImpl$processAcceptSuccess$1.label = i4 - Integer.MIN_VALUE;
                Object obj = personalGoalsRouterImpl$processAcceptSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalGoalsRouterImpl$processAcceptSuccess$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f4b0 f4b0Var2 = cVar.N;
                    PersonalGoalAcceptResponse personalGoalAcceptResponse = b4b0Var.a;
                    String str8 = personalGoalAcceptResponse.a;
                    String str9 = personalGoalAcceptResponse.b;
                    com.yandex.go.personal_goals_v2.data.a aVar = cVar.K;
                    String str10 = personalGoalAcceptResponse.c;
                    personalGoalsRouterImpl$processAcceptSuccess$1.L$0 = w7b0Var;
                    personalGoalsRouterImpl$processAcceptSuccess$1.L$1 = null;
                    str2 = str;
                    personalGoalsRouterImpl$processAcceptSuccess$1.L$2 = str2;
                    personalGoalsRouterImpl$processAcceptSuccess$1.L$3 = f4b0Var2;
                    personalGoalsRouterImpl$processAcceptSuccess$1.L$4 = str8;
                    personalGoalsRouterImpl$processAcceptSuccess$1.L$5 = str9;
                    personalGoalsRouterImpl$processAcceptSuccess$1.label = 1;
                    Object a = aVar.a(str10, personalGoalsRouterImpl$processAcceptSuccess$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f4b0Var = f4b0Var2;
                    obj = a;
                    str3 = str8;
                    str4 = str9;
                    w7b0Var2 = w7b0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str11 = (String) personalGoalsRouterImpl$processAcceptSuccess$1.L$5;
                    String str12 = (String) personalGoalsRouterImpl$processAcceptSuccess$1.L$4;
                    f4b0Var = (f4b0) personalGoalsRouterImpl$processAcceptSuccess$1.L$3;
                    String str13 = (String) personalGoalsRouterImpl$processAcceptSuccess$1.L$2;
                    w7b0Var2 = (w7b0) personalGoalsRouterImpl$processAcceptSuccess$1.L$0;
                    kotlin.b.b(obj);
                    str4 = str11;
                    str3 = str12;
                    str2 = str13;
                }
                Bitmap bitmap = (Bitmap) obj;
                tj60 tj60Var = f4b0Var.b;
                PersonalGoalsNotification personalGoalsNotification = new PersonalGoalsNotification("personal-goal-notification", str3, str4, bitmap, false, f4b0Var.a);
                personalGoalsNotification.startExpiresTimer(5000L);
                personalGoalsNotification.setExpiresListener(new qn5(12, f4b0Var, personalGoalsNotification));
                tj60Var.e(personalGoalsNotification);
                e eVar = cVar.O;
                str5 = w7b0Var2.h;
                i2 = w7b0Var2.d;
                i3 = w7b0Var2.e;
                r0 r0Var2 = eVar.p;
                qpf0 qpf0Var = eVar.k;
                umv0 umv0Var = (umv0) r0Var2.getValue();
                SummaryPromotionsResponse summaryPromotionsResponse = umv0Var.a;
                Set singleton = Collections.singleton(str2);
                List list = summaryPromotionsResponse.a.a.a;
                CommunicationItem.a aVar2 = new CommunicationItem.a(null, new bze(str5, i2, i3), 191);
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    SummaryPromotionsResponse.a aVar3 = (SummaryPromotionsResponse.a) it.next();
                    String str14 = aVar3.a;
                    if (singleton.isEmpty() || singleton.contains(str14)) {
                        it2 = it;
                        aVar3 = SummaryPromotionsResponse.a.a(aVar3, null, null, aVar2, 65503);
                    } else {
                        it2 = it;
                    }
                    arrayList.add(aVar3);
                    it = it2;
                }
                SummaryPromotionsResponse.b bVar = summaryPromotionsResponse.a;
                umv0 a2 = umv0.a(umv0Var, new SummaryPromotionsResponse(new SummaryPromotionsResponse.b(new SummaryPromotionsResponse.d(arrayList, bVar.a.b), bVar.b)), 2);
                r9 = 0;
                r0Var2.m(null, a2);
                rpf0 rpf0Var = (rpf0) qpf0Var;
                rpf0Var.getClass();
                r0Var = rpf0Var.a;
                while (true) {
                    value = r0Var.getValue();
                    map = (Map) value;
                    ppf0Var = (ppf0) map.get(str2);
                    if (ppf0Var == null) {
                        ppf0Var = new ppf0(r9, r9, r9);
                    }
                    if (!r0Var.k(value, kotlin.collections.b.o(map, new Pair(str2, ppf0.a(ppf0Var, r9, r9, new opf0(str5, i2, i3), 3))))) {
                        break;
                    }
                    r9 = 0;
                }
                str6 = w7b0Var2.i;
                str7 = w7b0Var2.j;
                r0 r0Var3 = eVar.p;
                umv0 umv0Var2 = (umv0) r0Var3.getValue();
                SummaryPromotionsResponse summaryPromotionsResponse2 = umv0Var2.a;
                Set singleton2 = Collections.singleton(str2);
                List<SummaryPromotionsResponse.a> list3 = summaryPromotionsResponse2.a.a.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                for (SummaryPromotionsResponse.a aVar4 : list3) {
                    String str15 = aVar4.a;
                    if (singleton2.isEmpty() || singleton2.contains(str15)) {
                        aVar4 = SummaryPromotionsResponse.a.a(aVar4, e.f(str6, aVar4.c), e.f(str7, aVar4.d), null, 65523);
                    }
                    arrayList2.add(aVar4);
                }
                SummaryPromotionsResponse.b bVar2 = summaryPromotionsResponse2.a;
                r0Var3.m(null, umv0.a(umv0Var2, new SummaryPromotionsResponse(new SummaryPromotionsResponse.b(new SummaryPromotionsResponse.d(arrayList2, bVar2.a.b), bVar2.b)), 2));
                do {
                    value2 = r0Var.getValue();
                    map2 = (Map) value2;
                    ppf0Var2 = (ppf0) map2.get(str2);
                    if (ppf0Var2 == null) {
                        ppf0Var2 = new ppf0(null, null, null);
                    }
                } while (!r0Var.k(value2, kotlin.collections.b.o(map2, new Pair(str2, ppf0.a(ppf0Var2, str6, str7, null, 4)))));
                cVar.r(new qu(9));
                return zy11.a;
            }
        }
        personalGoalsRouterImpl$processAcceptSuccess$1 = new PersonalGoalsRouterImpl$processAcceptSuccess$1(cVar, continuationImpl);
        Object obj2 = personalGoalsRouterImpl$processAcceptSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalGoalsRouterImpl$processAcceptSuccess$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        tj60 tj60Var2 = f4b0Var.b;
        PersonalGoalsNotification personalGoalsNotification2 = new PersonalGoalsNotification("personal-goal-notification", str3, str4, bitmap2, false, f4b0Var.a);
        personalGoalsNotification2.startExpiresTimer(5000L);
        personalGoalsNotification2.setExpiresListener(new qn5(12, f4b0Var, personalGoalsNotification2));
        tj60Var2.e(personalGoalsNotification2);
        e eVar2 = cVar.O;
        str5 = w7b0Var2.h;
        i2 = w7b0Var2.d;
        i3 = w7b0Var2.e;
        r0 r0Var22 = eVar2.p;
        qpf0 qpf0Var2 = eVar2.k;
        umv0 umv0Var3 = (umv0) r0Var22.getValue();
        SummaryPromotionsResponse summaryPromotionsResponse3 = umv0Var3.a;
        Set singleton3 = Collections.singleton(str2);
        List list4 = summaryPromotionsResponse3.a.a.a;
        CommunicationItem.a aVar22 = new CommunicationItem.a(null, new bze(str5, i2, i3), 191);
        List list22 = list4;
        ArrayList arrayList3 = new ArrayList(tcc.n(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        SummaryPromotionsResponse.b bVar3 = summaryPromotionsResponse3.a;
        umv0 a22 = umv0.a(umv0Var3, new SummaryPromotionsResponse(new SummaryPromotionsResponse.b(new SummaryPromotionsResponse.d(arrayList3, bVar3.a.b), bVar3.b)), 2);
        r9 = 0;
        r0Var22.m(null, a22);
        rpf0 rpf0Var2 = (rpf0) qpf0Var2;
        rpf0Var2.getClass();
        r0Var = rpf0Var2.a;
        while (true) {
            value = r0Var.getValue();
            map = (Map) value;
            ppf0Var = (ppf0) map.get(str2);
            if (ppf0Var == null) {
            }
            if (!r0Var.k(value, kotlin.collections.b.o(map, new Pair(str2, ppf0.a(ppf0Var, r9, r9, new opf0(str5, i2, i3), 3))))) {
            }
            r9 = 0;
        }
        str6 = w7b0Var2.i;
        str7 = w7b0Var2.j;
        r0 r0Var32 = eVar2.p;
        umv0 umv0Var22 = (umv0) r0Var32.getValue();
        SummaryPromotionsResponse summaryPromotionsResponse22 = umv0Var22.a;
        Set singleton22 = Collections.singleton(str2);
        List<SummaryPromotionsResponse.a> list32 = summaryPromotionsResponse22.a.a.a;
        ArrayList arrayList22 = new ArrayList(tcc.n(list32, 10));
        while (r5.hasNext()) {
        }
        SummaryPromotionsResponse.b bVar22 = summaryPromotionsResponse22.a;
        r0Var32.m(null, umv0.a(umv0Var22, new SummaryPromotionsResponse(new SummaryPromotionsResponse.b(new SummaryPromotionsResponse.d(arrayList22, bVar22.a.b), bVar22.b)), 2));
        do {
            value2 = r0Var.getValue();
            map2 = (Map) value2;
            ppf0Var2 = (ppf0) map2.get(str2);
            if (ppf0Var2 == null) {
            }
        } while (!r0Var.k(value2, kotlin.collections.b.o(map2, new Pair(str2, ppf0.a(ppf0Var2, str6, str7, null, 4)))));
        cVar.r(new qu(9));
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.L.d("personal_goals");
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.L.i("personal_goals", false);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.Q;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    public final void W(boolean z) {
        while (true) {
            r0 r0Var = this.P;
            Object value = r0Var.getValue();
            v4b0 v4b0Var = (v4b0) value;
            boolean z2 = z;
            if (r0Var.k(value, new v4b0(v4b0Var.a, v4b0Var.b, v4b0Var.d, v4b0Var.e, v4b0Var.c, z2))) {
                return;
            } else {
                z = z2;
            }
        }
    }
}
