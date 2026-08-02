package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.os.Build;
import android.view.Window;
import android.view.WindowInsetsController;
import com.lightside.slab.SlotView;
import com.yandex.passport.api.AccountListBranding;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.AccountListProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.VisualProperties;
import com.yandex.passport.internal.report.j2;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.u4;
import com.yandex.passport.internal.report.v4;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.r2;
import com.yandex.passport.internal.ui.bouncer.model.s2;
import com.yandex.passport.internal.ui.bouncer.model.t2;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import defpackage.bvf0;
import defpackage.gw00;
import defpackage.jt11;
import defpackage.kum;
import defpackage.li91;
import defpackage.nns0;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.rs11;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uc20;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class v extends com.lightside.slab.a {
    public static final int O = (int) (528.0f * uc20.a.density);
    public final BouncerActivity E;
    public final r F;
    public final q G;
    public final m H;
    public final e I;
    public final com.yandex.passport.internal.ui.bouncer.t J;
    public final com.yandex.passport.internal.report.reporters.n K;
    public final com.yandex.passport.internal.report.reporters.l L;
    public final com.lightside.slab.c M;
    public final jt11 N;

    public v(BouncerActivity bouncerActivity, r rVar, q qVar, m mVar, e eVar, com.yandex.passport.internal.ui.bouncer.t tVar, com.yandex.passport.internal.report.reporters.n nVar, com.yandex.passport.internal.report.reporters.l lVar) {
        this.E = bouncerActivity;
        this.F = rVar;
        this.G = qVar;
        this.H = mVar;
        this.I = eVar;
        this.J = tVar;
        this.K = nVar;
        this.L = lVar;
        this.M = new com.lightside.slab.c(new SlotView(bouncerActivity, null, 0, 0, 14, null));
        this.N = new jt11(bouncerActivity, 1, this);
    }

    public static ArrayList n(List list) {
        String valueOf;
        List<t2> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (t2 t2Var : list2) {
            if (t2Var instanceof r2) {
                valueOf = String.valueOf(((r2) t2Var).a.getUid().getValue());
            } else {
                if (!(t2Var instanceof s2)) {
                    w511.b();
                    return null;
                }
                valueOf = String.valueOf(((s2) t2Var).a.getValue());
            }
            arrayList.add(valueOf);
        }
        return arrayList;
    }

    @Override // com.lightside.slab.a, defpackage.ins0, defpackage.lns0
    public final void a() {
        com.yandex.passport.internal.ui.c.y(this.E);
        super.a();
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x032b, code lost:
    
        if (r2 == r4) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r22v1, types: [fse, java.lang.Object, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    @Override // com.lightside.slab.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(y1 y1Var, Continuation continuation) {
        RoundaboutSlab$performBind$1 roundaboutSlab$performBind$1;
        Object obj;
        int i;
        String str;
        Object obj2;
        String str2;
        Object k0;
        v vVar;
        y1 y1Var2;
        v vVar2 = this;
        y1 y1Var3 = y1Var;
        if (continuation instanceof RoundaboutSlab$performBind$1) {
            roundaboutSlab$performBind$1 = (RoundaboutSlab$performBind$1) continuation;
            int i2 = roundaboutSlab$performBind$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roundaboutSlab$performBind$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = roundaboutSlab$performBind$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roundaboutSlab$performBind$1.label;
                Object obj4 = null;
                Object obj5 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    LoginProperties loginProperties = y1Var3.a;
                    List list = y1Var3.b;
                    AccountListProperties accountListProperties = loginProperties.getVisualProperties().getAccountListProperties();
                    ArrayList n = n(list);
                    List<t2> list2 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : list2) {
                        if (obj6 instanceof s2) {
                            arrayList.add(obj6);
                        }
                    }
                    ArrayList n2 = n(arrayList);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (t2 t2Var : list2) {
                        Uid a = t2Var.a();
                        Object obj7 = obj4;
                        Object obj8 = obj5;
                        if (a == null || (str2 = new Long(a.getValue()).toString()) == null) {
                            str2 = "other";
                        }
                        Object obj9 = linkedHashMap.get(str2);
                        if (obj9 == null) {
                            obj9 = qv10.w(str2, linkedHashMap);
                        }
                        ((List) obj9).add(String.valueOf(t2Var.b().getValue()));
                        obj4 = obj7;
                        obj5 = obj8;
                    }
                    ?? r22 = obj4;
                    Object obj10 = obj5;
                    com.yandex.passport.internal.report.reporters.n nVar = vVar2.K;
                    ArrayList f = nVar.c.a().f();
                    ArrayList arrayList2 = new ArrayList(tcc.n(f, 10));
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.valueOf(((ModernAccount) it.next()).getUid().getValue()));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!n.contains((String) next)) {
                            arrayList3.add(next);
                        }
                    }
                    v4 v4Var = v4.w;
                    MapBuilder mapBuilder = new MapBuilder();
                    mapBuilder.put("uids_shown", n.toString());
                    mapBuilder.put("uids_shown_count", String.valueOf(n.size()));
                    mapBuilder.put("imaginary_members", n2.toString());
                    mapBuilder.put("group_by_muid", linkedHashMap);
                    mapBuilder.put("uids_hidden", arrayList3.toString());
                    mapBuilder.put("uids_hidden_count", String.valueOf(arrayList3.size()));
                    mapBuilder.put("account_list_show_mode", accountListProperties.getShowMode().toString());
                    AccountListBranding branding = accountListProperties.getBranding();
                    if (branding instanceof AccountListBranding.Custom) {
                        str = "Custom";
                    } else {
                        if (!branding.equals(AccountListBranding.Yandex.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        str = "Yandex";
                    }
                    mapBuilder.put("account_list_branding", str);
                    mapBuilder.put("show_close_button", String.valueOf(accountListProperties.getShowCloseButton()));
                    mapBuilder.put("mark_plus_users", String.valueOf(accountListProperties.getMarkPlusUsers()));
                    nVar.b(v4Var, mapBuilder.j());
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj11 : list2) {
                        if (((t2) obj11) instanceof r2) {
                            arrayList4.add(obj11);
                        } else {
                            arrayList5.add(obj11);
                        }
                    }
                    List list3 = (List) new Pair(arrayList4, arrayList5).getFirst();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj12 : list3) {
                        if (obj12 instanceof r2) {
                            arrayList6.add(obj12);
                        }
                    }
                    int d = gw00.d(tcc.n(arrayList6, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                    Iterator it3 = arrayList6.iterator();
                    while (it3.hasNext()) {
                        r2 r2Var = (r2) it3.next();
                        String valueOf = String.valueOf(r2Var.a.getUid().getValue());
                        List list4 = r2Var.b;
                        ArrayList arrayList7 = new ArrayList(tcc.n(list4, 10));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            arrayList7.add(((com.yandex.passport.internal.badges.a) it4.next()).a);
                        }
                        linkedHashMap2.put(valueOf, arrayList7);
                    }
                    com.yandex.passport.internal.report.reporters.l lVar = vVar2.L;
                    lVar.getClass();
                    j2 j2Var = j2.w;
                    ArrayList arrayList8 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        arrayList8.add(new jd((String) entry.getKey(), (List) entry.getValue()));
                    }
                    lVar.e(j2Var, arrayList8);
                    int i3 = t.a[accountListProperties.getShowMode().ordinal()];
                    com.lightside.slab.c cVar = vVar2.M;
                    r rVar = vVar2.F;
                    q qVar = vVar2.G;
                    BouncerActivity bouncerActivity = vVar2.E;
                    m mVar = vVar2.H;
                    if (i3 == 1) {
                        VisualProperties visualProperties = y1Var3.a.getVisualProperties();
                        roundaboutSlab$performBind$1.L$0 = vVar2;
                        roundaboutSlab$performBind$1.L$1 = y1Var3;
                        roundaboutSlab$performBind$1.label = 1;
                        qVar.c.b(new kum(new nns0(bouncerActivity, 0)));
                        mVar.c.b(rVar);
                        cVar.b(new kum(mVar));
                        li91.e(new RoundaboutSlab$setupBottomsSheet$2(visualProperties, vVar2, r22), mVar.getRoot());
                        tje.N(bvf0.a(roundaboutSlab$performBind$1.get_context()), r22, r22, new RoundaboutSlab$setupBottomsSheet$3(vVar2, r22), 3);
                        obj2 = obj10;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return r22;
                        }
                        mVar.c.b(new kum(new nns0(bouncerActivity, 0)));
                        qVar.c.b(rVar);
                        cVar.b(new kum(qVar));
                        obj2 = obj10;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y1Var2 = (y1) roundaboutSlab$performBind$1.L$1;
                        vVar = (v) roundaboutSlab$performBind$1.L$0;
                        kotlin.b.b(obj3);
                        obj2 = obj5;
                        vVar.F.c(y1Var2);
                        return obj2;
                    }
                    y1 y1Var4 = (y1) roundaboutSlab$performBind$1.L$1;
                    v vVar3 = (v) roundaboutSlab$performBind$1.L$0;
                    kotlin.b.b(obj3);
                    y1Var3 = y1Var4;
                    vVar2 = vVar3;
                    obj2 = obj5;
                }
                e eVar = vVar2.I;
                roundaboutSlab$performBind$1.L$0 = vVar2;
                roundaboutSlab$performBind$1.L$1 = y1Var3;
                roundaboutSlab$performBind$1.label = 2;
                k0 = tje.k0(((com.yandex.passport.common.coroutine.b) eVar.a).b, new RoundaboutAccountProcessing$process$2(eVar, y1Var3, null), roundaboutSlab$performBind$1);
                if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    k0 = obj2;
                }
                if (k0 != obj) {
                    y1 y1Var5 = y1Var3;
                    vVar = vVar2;
                    y1Var2 = y1Var5;
                    vVar.F.c(y1Var2);
                    return obj2;
                }
                return obj;
            }
        }
        roundaboutSlab$performBind$1 = new RoundaboutSlab$performBind$1(vVar2, (ContinuationImpl) continuation);
        Object obj32 = roundaboutSlab$performBind$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roundaboutSlab$performBind$1.label;
        Object obj42 = null;
        Object obj52 = zy11.a;
        if (i != 0) {
        }
        e eVar2 = vVar2.I;
        roundaboutSlab$performBind$1.L$0 = vVar2;
        roundaboutSlab$performBind$1.L$1 = y1Var3;
        roundaboutSlab$performBind$1.label = 2;
        k0 = tje.k0(((com.yandex.passport.common.coroutine.b) eVar2.a).b, new RoundaboutAccountProcessing$process$2(eVar2, y1Var3, null), roundaboutSlab$performBind$1);
        if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
        }
        if (k0 != obj) {
        }
        return obj;
    }

    @Override // com.lightside.slab.a, defpackage.ins0, defpackage.lns0
    public final void onDetach() {
        WindowInsetsController insetsController;
        BouncerActivity bouncerActivity = this.E;
        if ((bouncerActivity.getResources().getConfiguration().uiMode & 48) == 32) {
            com.yandex.passport.internal.ui.c.y(bouncerActivity);
        } else if (Build.VERSION.SDK_INT >= 30) {
            insetsController = bouncerActivity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(8, 8);
            }
        } else {
            Window window = bouncerActivity.getWindow();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        }
        super.onDetach();
        com.yandex.passport.internal.report.reporters.n nVar = this.K;
        nVar.getClass();
        nVar.h(u4.w);
    }
}
