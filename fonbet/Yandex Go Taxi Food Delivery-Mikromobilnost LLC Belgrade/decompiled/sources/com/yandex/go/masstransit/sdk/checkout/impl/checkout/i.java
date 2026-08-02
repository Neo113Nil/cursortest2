package com.yandex.go.masstransit.sdk.checkout.impl.checkout;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutButtonAction;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.i;
import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import defpackage.alb;
import defpackage.amb;
import defpackage.anb;
import defpackage.ao21;
import defpackage.ao60;
import defpackage.avj0;
import defpackage.b311;
import defpackage.bge;
import defpackage.blb;
import defpackage.bnb;
import defpackage.bo21;
import defpackage.byh0;
import defpackage.c1q0;
import defpackage.c311;
import defpackage.cg60;
import defpackage.clq0;
import defpackage.cnb;
import defpackage.co21;
import defpackage.cot;
import defpackage.d521;
import defpackage.dfu0;
import defpackage.dge;
import defpackage.dhu0;
import defpackage.efu0;
import defpackage.eg01;
import defpackage.el1;
import defpackage.elb1;
import defpackage.eo21;
import defpackage.f2k0;
import defpackage.flj;
import defpackage.g8e;
import defpackage.glj;
import defpackage.gwk0;
import defpackage.hlb;
import defpackage.i3y;
import defpackage.ilb;
import defpackage.jl40;
import defpackage.jlb;
import defpackage.kfv;
import defpackage.khu0;
import defpackage.llb;
import defpackage.llj;
import defpackage.lub1;
import defpackage.mja1;
import defpackage.mlb;
import defpackage.ncp0;
import defpackage.nib;
import defpackage.nlb;
import defpackage.nnb;
import defpackage.nvo;
import defpackage.ny61;
import defpackage.oib;
import defpackage.olb;
import defpackage.p2u;
import defpackage.plb;
import defpackage.pmb;
import defpackage.q6o;
import defpackage.qlj;
import defpackage.qmb;
import defpackage.r1a0;
import defpackage.rib;
import defpackage.rmb;
import defpackage.s2h0;
import defpackage.scc;
import defpackage.sda0;
import defpackage.sib;
import defpackage.slb;
import defpackage.sls;
import defpackage.smb;
import defpackage.t0f;
import defpackage.tcc;
import defpackage.tib;
import defpackage.tlb;
import defpackage.tmb;
import defpackage.tnb;
import defpackage.uib;
import defpackage.ulb;
import defpackage.umb;
import defpackage.unb;
import defpackage.vib;
import defpackage.vlb;
import defpackage.vmb;
import defpackage.vnb;
import defpackage.w511;
import defpackage.w9q0;
import defpackage.wib;
import defpackage.wlb;
import defpackage.wmb;
import defpackage.wnb;
import defpackage.x9q0;
import defpackage.xdf;
import defpackage.xlb;
import defpackage.xmb;
import defpackage.xnb;
import defpackage.y6i0;
import defpackage.yfe;
import defpackage.ykb;
import defpackage.ylb;
import defpackage.ymb;
import defpackage.zfe;
import defpackage.zkb;
import defpackage.zlb;
import defpackage.zlq0;
import defpackage.zmb;
import defpackage.znb;
import defpackage.zrm;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class i {
    public final zuj0 a;
    public final ru.yandex.taxi.widget.c b;
    public final cot c;
    public final i3y d;
    public final i3y e;

    public i(zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar, cot cotVar) {
        this.a = zuj0Var;
        this.b = cVar;
        this.c = cotVar;
        final int i = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: ynb
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                i iVar = this.b;
                switch (i2) {
                    case 0:
                        return new dge(cge.a, new yfe(new zfe(((avj0) iVar.a).h(byh0.mt_checkout_loading), rib.a, false, true)));
                    default:
                        return new wnb((dge) iVar.d.getValue(), elb1.c());
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.a.a(new sls(this) { // from class: ynb
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                i iVar = this.b;
                switch (i22) {
                    case 0:
                        return new dge(cge.a, new yfe(new zfe(((avj0) iVar.a).h(byh0.mt_checkout_loading), rib.a, false, true)));
                    default:
                        return new wnb((dge) iVar.d.getValue(), elb1.c());
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static wib a(pmb pmbVar, ncp0 ncp0Var, boolean z) {
        ?? r3;
        if (ncp0Var instanceof dhu0) {
            dhu0 dhu0Var = (dhu0) ncp0Var;
            String str = dhu0Var.e;
            ArrayList<dfu0> arrayList = dhu0Var.g;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (dfu0 dfu0Var : arrayList) {
                arrayList2.add(new efu0(dfu0Var.b, dfu0Var.c, dfu0Var.a, !jl40.l(dfu0Var.d, Boolean.FALSE)));
            }
            String str2 = dhu0Var.c;
            if (str2 == null) {
                str2 = dhu0Var.b;
            }
            khu0 khu0Var = new khu0(str2, arrayList2, null, str);
            String str3 = pmbVar.a;
            String str4 = pmbVar.l;
            return new tib(khu0Var, z, new clq0(str, z, str3, str4), new nnb(CheckoutButtonAction.StopSelector, str3, str4, str));
        }
        if (!(ncp0Var instanceof llj)) {
            return null;
        }
        llj lljVar = (llj) ncp0Var;
        String str5 = lljVar.f;
        List list = lljVar.b;
        if (list != null) {
            List<flj> list2 = list;
            r3 = new ArrayList(tcc.n(list2, 10));
            for (flj fljVar : list2) {
                r3.add(new glj(fljVar.a, fljVar.b));
            }
        } else {
            r3 = EmptyList.a;
        }
        qlj qljVar = new qlj(lljVar.e, r3, str5);
        String str6 = pmbVar.a;
        String str7 = pmbVar.l;
        return new sib(qljVar, z, new clq0(str5, z, str6, str7), new nnb(CheckoutButtonAction.DirectionSelector, str6, str7, str5));
    }

    public static boolean b(plb plbVar) {
        return jl40.l(plbVar, llb.a) || (plbVar instanceof olb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v16, types: [x9q0] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [eg01] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, znb] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v4, types: [t0f] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pmb pmbVar, r1a0 r1a0Var, Map map, boolean z, boolean z2, plb plbVar, boolean z3, ContinuationImpl continuationImpl) {
        CheckoutUiStateMapper$mapContent$1 checkoutUiStateMapper$mapContent$1;
        int i;
        Object next;
        wib a;
        wib a2;
        ArrayList arrayList;
        i iVar;
        pmb pmbVar2;
        Pair pair;
        dge dgeVar;
        FormattedText formattedText;
        r1a0 r1a0Var2;
        boolean z4;
        boolean z5;
        c311 c311Var;
        plb plbVar2;
        el1 el1Var;
        c311 c311Var2;
        CoroutineSingletons coroutineSingletons;
        c311 c311Var3;
        CheckoutUiStateMapper$mapContent$1 checkoutUiStateMapper$mapContent$12;
        ArrayList arrayList2;
        zlq0 zlq0Var;
        Iterable iterable;
        glj gljVar;
        CharSequence charSequence;
        nvo a3;
        glj gljVar2;
        efu0 efu0Var;
        efu0 efu0Var2;
        CharSequence charSequence2;
        nvo a4;
        efu0 efu0Var3;
        znb znbVar;
        blb blbVar;
        String name;
        String name2;
        String str;
        blb blbVar2;
        znb znbVar2;
        i iVar2 = this;
        pmb pmbVar3 = pmbVar;
        if (continuationImpl instanceof CheckoutUiStateMapper$mapContent$1) {
            checkoutUiStateMapper$mapContent$1 = (CheckoutUiStateMapper$mapContent$1) continuationImpl;
            int i2 = checkoutUiStateMapper$mapContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutUiStateMapper$mapContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutUiStateMapper$mapContent$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutUiStateMapper$mapContent$1.label;
                boolean z6 = true;
                kfv kfvVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList3 = pmbVar3.d;
                    String str2 = pmbVar3.l;
                    String str3 = pmbVar3.a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        ncp0 ncp0Var = (ncp0) obj2;
                        if (ncp0Var.a() != null) {
                            if (ncp0Var instanceof dhu0) {
                                if (((dhu0) ncp0Var).f == null) {
                                    arrayList4.add(obj2);
                                }
                            } else if (ncp0Var instanceof llj) {
                                if (((llj) ncp0Var).h == null) {
                                    arrayList4.add(obj2);
                                }
                            } else if ((ncp0Var instanceof ao60) && ((ao60) ncp0Var).g == null) {
                                arrayList4.add(obj2);
                            }
                        }
                    }
                    Iterator it = arrayList4.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int i3 = ((ncp0) next).a().b;
                            while (true) {
                                Object next2 = it.next();
                                int i4 = ((ncp0) next2).a().b;
                                if (i3 > i4) {
                                    next = next2;
                                    i3 = i4;
                                }
                                if (!it.hasNext()) {
                                    break;
                                }
                                coroutineSingletons2 = coroutineSingletons2;
                                kfvVar = kfvVar;
                                z6 = z6;
                            }
                        }
                    } else {
                        next = null;
                    }
                    ncp0 ncp0Var2 = (ncp0) next;
                    ?? znbVar3 = (ncp0Var2 == null || (a = a(pmbVar3, ncp0Var2, false)) == null || (a2 = a(pmbVar3, ncp0Var2, z6)) == null) ? kfvVar : new znb(ncp0Var2.a().b, ncp0Var2.a().a, a, a2);
                    amb ambVar = pmbVar3.f;
                    c311 c311Var4 = new c311(ambVar != null ? new eg01(mja1.a(ambVar.c, kfvVar, 6)) : kfvVar, new b311(ambVar != null ? ambVar.a : kfvVar, ambVar != null ? ambVar.b : kfvVar));
                    boolean b = b(plbVar);
                    ArrayList arrayList5 = pmbVar3.d;
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it2 = arrayList5.iterator();
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        ?? r26 = kfvVar;
                        zuj0 zuj0Var = iVar2.a;
                        boolean z7 = z6;
                        wib wibVar = rib.a;
                        if (hasNext) {
                            ncp0 ncp0Var3 = (ncp0) it2.next();
                            Iterator it3 = it2;
                            boolean z8 = ncp0Var3 instanceof p2u;
                            if (!z8) {
                                boolean z9 = ncp0Var3 instanceof d521;
                                if (!z9) {
                                    if (ncp0Var3 instanceof ao60) {
                                        ao60 ao60Var = (ao60) ncp0Var3;
                                        Integer num = ao60Var.b;
                                        int intValue = num != null ? num.intValue() : 0;
                                        Integer num2 = ao60Var.c;
                                        int intValue2 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
                                        coroutineSingletons = coroutineSingletons2;
                                        Long l = ao60Var.g;
                                        int f = l != null ? (int) y6i0.f(l.longValue(), intValue, intValue2) : intValue;
                                        eo21 eo21Var = (eo21) map.get(ao60Var.f);
                                        Integer valueOf = eo21Var instanceof bo21 ? Integer.valueOf(((bo21) eo21Var).b) : r26;
                                        if (valueOf != null) {
                                            f = valueOf.intValue();
                                        }
                                        int i5 = f;
                                        String str4 = ao60Var.d;
                                        c311Var3 = c311Var4;
                                        checkoutUiStateMapper$mapContent$12 = checkoutUiStateMapper$mapContent$1;
                                        arrayList2 = arrayList6;
                                        zlq0Var = new t0f(str4 == null ? "" : str4, i5, intValue, intValue2, ao60Var.f, ao60Var.e, b, pmbVar3.a, pmbVar3.l);
                                    } else {
                                        coroutineSingletons = coroutineSingletons2;
                                        if (ncp0Var3 instanceof dhu0) {
                                            dhu0 dhu0Var = (dhu0) ncp0Var3;
                                            ArrayList arrayList8 = dhu0Var.g;
                                            dfu0 dfu0Var = dhu0Var.f;
                                            String str5 = dhu0Var.e;
                                            ArrayList arrayList9 = new ArrayList(tcc.n(arrayList8, 10));
                                            Iterator it4 = arrayList8.iterator();
                                            while (it4.hasNext()) {
                                                dfu0 dfu0Var2 = (dfu0) it4.next();
                                                arrayList9.add(new efu0(dfu0Var2.b, dfu0Var2.c, dfu0Var2.a, !jl40.l(dfu0Var2.d, Boolean.FALSE)));
                                                it4 = it4;
                                                c311Var4 = c311Var4;
                                                checkoutUiStateMapper$mapContent$1 = checkoutUiStateMapper$mapContent$1;
                                            }
                                            c311Var3 = c311Var4;
                                            checkoutUiStateMapper$mapContent$12 = checkoutUiStateMapper$mapContent$1;
                                            eo21 eo21Var2 = (eo21) map.get(str5);
                                            String str6 = eo21Var2 instanceof co21 ? ((co21) eo21Var2).b : r26;
                                            if (str6 != null) {
                                                Iterator it5 = arrayList9.iterator();
                                                while (true) {
                                                    if (!it5.hasNext()) {
                                                        efu0Var3 = r26;
                                                        break;
                                                    }
                                                    efu0Var3 = it5.next();
                                                    if (jl40.l(((efu0) efu0Var3).a, str6)) {
                                                        break;
                                                    }
                                                }
                                                efu0Var = efu0Var3;
                                            } else {
                                                efu0Var = r26;
                                            }
                                            if (dfu0Var != null) {
                                                arrayList2 = arrayList6;
                                                efu0Var2 = new efu0(dfu0Var.b, dfu0Var.c, dfu0Var.a, !jl40.l(dfu0Var.d, Boolean.FALSE));
                                            } else {
                                                arrayList2 = arrayList6;
                                                efu0Var2 = r26;
                                            }
                                            boolean z10 = (znbVar3 == 0 || (a4 = dhu0Var.a()) == null || a4.b <= znbVar3.a) ? false : z7;
                                            String str7 = dhu0Var.b;
                                            String str8 = str7 == null ? "" : str7;
                                            if (efu0Var == null || (charSequence2 = efu0Var.b) == null) {
                                                charSequence2 = dfu0Var != null ? dfu0Var.b : str7 != null ? str7 : "";
                                            }
                                            String str9 = dhu0Var.c;
                                            if (str9 != null) {
                                                str7 = str9;
                                            }
                                            zlq0Var = new zlq0(charSequence2, str8, new tib(new khu0(str7, arrayList9, efu0Var2, str5), z7, new clq0(str5, z7, str3, str2), new nnb(CheckoutButtonAction.StopSelector, str3, str2, str5)), (b || jl40.l(dhu0Var.d, Boolean.TRUE) || z10) ? false : true);
                                        } else {
                                            c311Var3 = c311Var4;
                                            checkoutUiStateMapper$mapContent$12 = checkoutUiStateMapper$mapContent$1;
                                            arrayList2 = arrayList6;
                                            if (ncp0Var3 instanceof llj) {
                                                llj lljVar = (llj) ncp0Var3;
                                                List list = lljVar.b;
                                                String str10 = lljVar.f;
                                                if (list != null) {
                                                    List<flj> list2 = list;
                                                    iterable = new ArrayList(tcc.n(list2, 10));
                                                    for (flj fljVar : list2) {
                                                        iterable.add(new glj(fljVar.a, fljVar.b));
                                                    }
                                                } else {
                                                    iterable = EmptyList.a;
                                                }
                                                eo21 eo21Var3 = (eo21) map.get(str10);
                                                String str11 = eo21Var3 instanceof co21 ? ((co21) eo21Var3).b : r26;
                                                if (str11 != null) {
                                                    Iterator it6 = iterable.iterator();
                                                    while (true) {
                                                        if (!it6.hasNext()) {
                                                            gljVar2 = r26;
                                                            break;
                                                        }
                                                        gljVar2 = it6.next();
                                                        if (jl40.l(((glj) gljVar2).a, str11)) {
                                                            break;
                                                        }
                                                    }
                                                    gljVar = gljVar2;
                                                } else {
                                                    gljVar = r26;
                                                }
                                                boolean z11 = (znbVar3 == 0 || (a3 = lljVar.a()) == null || a3.b <= znbVar3.a) ? false : true;
                                                String str12 = lljVar.c;
                                                String str13 = str12 == null ? "" : str12;
                                                if (gljVar == null || (charSequence = gljVar.b) == null) {
                                                    flj fljVar2 = lljVar.h;
                                                    if (fljVar2 != null) {
                                                        charSequence = fljVar2.b;
                                                    } else {
                                                        charSequence = lljVar.d;
                                                        if (charSequence == null) {
                                                            charSequence = str12 != null ? str12 : "";
                                                        }
                                                    }
                                                }
                                                zlq0Var = new zlq0(charSequence, str13, new sib(new qlj(lljVar.e, iterable, str10), true, new clq0(str10, true, str3, str2), new nnb(CheckoutButtonAction.DirectionSelector, str3, str2, str10)), (b || jl40.l(lljVar.g, Boolean.TRUE) || z11) ? false : true);
                                            } else if (ncp0Var3 instanceof f2k0) {
                                                f2k0 f2k0Var = (f2k0) ncp0Var3;
                                                String str14 = f2k0Var.b;
                                                eo21 eo21Var4 = (eo21) map.get(str14);
                                                Boolean valueOf2 = eo21Var4 instanceof ao21 ? Boolean.valueOf(((ao21) eo21Var4).b) : r26;
                                                if (valueOf2 == null) {
                                                    valueOf2 = f2k0Var.c;
                                                }
                                                avj0 avj0Var = (avj0) zuj0Var;
                                                w9q0 w9q0Var = new w9q0("with_return", avj0Var.h(byh0.mt_checkout_return_trip_with_return), !b ? new vib(str14, true) : wibVar);
                                                String h = avj0Var.h(byh0.mt_checkout_return_trip_one_way);
                                                if (!b) {
                                                    wibVar = new vib(str14, false);
                                                }
                                                w9q0 w9q0Var2 = new w9q0("one_way", h, wibVar);
                                                List g = scc.g(w9q0Var, w9q0Var2);
                                                if (!valueOf2.equals(Boolean.TRUE)) {
                                                    w9q0Var = w9q0Var2;
                                                }
                                                zlq0Var = new x9q0(g, w9q0Var);
                                            } else {
                                                if (!z8 && !z9) {
                                                    w511.b();
                                                    return r26;
                                                }
                                                zlq0Var = r26;
                                            }
                                        }
                                    }
                                    if (zlq0Var != null) {
                                        arrayList7.add(zlq0Var);
                                    }
                                    iVar2 = this;
                                    pmbVar3 = pmbVar;
                                    c311Var4 = c311Var3;
                                    checkoutUiStateMapper$mapContent$1 = checkoutUiStateMapper$mapContent$12;
                                    arrayList6 = arrayList2;
                                    kfvVar = r26;
                                    it2 = it3;
                                    coroutineSingletons2 = coroutineSingletons;
                                    z6 = true;
                                }
                            } else if (!arrayList7.isEmpty()) {
                                arrayList6.add(new c1q0(kotlin.collections.a.J0(arrayList7)));
                                arrayList7 = new ArrayList();
                                kfvVar = r26;
                                z6 = z7;
                                it2 = it3;
                            }
                            c311Var3 = c311Var4;
                            checkoutUiStateMapper$mapContent$12 = checkoutUiStateMapper$mapContent$1;
                            coroutineSingletons = coroutineSingletons2;
                            arrayList2 = arrayList6;
                            iVar2 = this;
                            pmbVar3 = pmbVar;
                            c311Var4 = c311Var3;
                            checkoutUiStateMapper$mapContent$1 = checkoutUiStateMapper$mapContent$12;
                            arrayList6 = arrayList2;
                            kfvVar = r26;
                            it2 = it3;
                            coroutineSingletons2 = coroutineSingletons;
                            z6 = true;
                        } else {
                            c311 c311Var5 = c311Var4;
                            CheckoutUiStateMapper$mapContent$1 checkoutUiStateMapper$mapContent$13 = checkoutUiStateMapper$mapContent$1;
                            CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                            ArrayList arrayList10 = arrayList6;
                            if (arrayList7.isEmpty()) {
                                arrayList = arrayList10;
                            } else {
                                arrayList = arrayList10;
                                arrayList.add(new c1q0(kotlin.collections.a.J0(arrayList7)));
                            }
                            boolean z12 = z3 || z2;
                            boolean b2 = b(plbVar);
                            if (z12) {
                                iVar = this;
                                dgeVar = (dge) iVar.d.getValue();
                            } else {
                                iVar = this;
                                if (b2) {
                                    dgeVar = new dge(e(pmbVar), new yfe(new zfe(((avj0) zuj0Var).h(byh0.mt_checkout_order_processing), wibVar, false, true)));
                                } else {
                                    pmbVar2 = pmbVar;
                                    boolean z13 = pmbVar2.j != null;
                                    String h2 = ((avj0) zuj0Var).h(byh0.mt_checkout_pay);
                                    if (znbVar3 != 0) {
                                        pair = new Pair(znbVar3.b, znbVar3.d);
                                    } else {
                                        String str15 = pmbVar2.i;
                                        if (str15 != null) {
                                            if (str15.length() <= 0) {
                                                str15 = r26;
                                            }
                                            if (str15 != null) {
                                                h2 = str15;
                                            }
                                        }
                                        pair = new Pair(h2, new oib(str3, new nnb(CheckoutButtonAction.PaymentButton, str3, str2, r26)));
                                    }
                                    dgeVar = new dge(e(pmbVar), new yfe(new zfe((String) pair.getFirst(), (wib) pair.getSecond(), !z13, z13)));
                                    formattedText = pmbVar2.h;
                                    if (formattedText == null) {
                                        checkoutUiStateMapper$mapContent$13.L$0 = pmbVar2;
                                        r1a0Var2 = r1a0Var;
                                        checkoutUiStateMapper$mapContent$13.L$1 = r1a0Var2;
                                        checkoutUiStateMapper$mapContent$13.L$2 = null;
                                        checkoutUiStateMapper$mapContent$13.L$3 = plbVar;
                                        checkoutUiStateMapper$mapContent$13.L$4 = znbVar3;
                                        checkoutUiStateMapper$mapContent$13.L$5 = c311Var5;
                                        checkoutUiStateMapper$mapContent$13.L$6 = arrayList;
                                        checkoutUiStateMapper$mapContent$13.L$7 = dgeVar;
                                        checkoutUiStateMapper$mapContent$13.L$8 = null;
                                        z4 = z;
                                        checkoutUiStateMapper$mapContent$13.Z$0 = z4;
                                        z5 = z2;
                                        checkoutUiStateMapper$mapContent$13.Z$1 = z5;
                                        checkoutUiStateMapper$mapContent$13.Z$2 = z3;
                                        checkoutUiStateMapper$mapContent$13.label = 1;
                                        Object h3 = iVar.h(formattedText, checkoutUiStateMapper$mapContent$13);
                                        if (h3 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        c311Var2 = c311Var5;
                                        plbVar2 = plbVar;
                                        obj = h3;
                                        znbVar2 = znbVar3;
                                    } else {
                                        r1a0Var2 = r1a0Var;
                                        z4 = z;
                                        z5 = z2;
                                        c311Var = c311Var5;
                                        plbVar2 = plbVar;
                                        el1Var = null;
                                        znbVar = znbVar3;
                                    }
                                }
                            }
                            pmbVar2 = pmbVar;
                            formattedText = pmbVar2.h;
                            if (formattedText == null) {
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z14 = checkoutUiStateMapper$mapContent$1.Z$1;
                    boolean z15 = checkoutUiStateMapper$mapContent$1.Z$0;
                    dgeVar = (dge) checkoutUiStateMapper$mapContent$1.L$7;
                    ?? r3 = (List) checkoutUiStateMapper$mapContent$1.L$6;
                    c311Var2 = (c311) checkoutUiStateMapper$mapContent$1.L$5;
                    znb znbVar4 = (znb) checkoutUiStateMapper$mapContent$1.L$4;
                    plbVar2 = (plb) checkoutUiStateMapper$mapContent$1.L$3;
                    r1a0 r1a0Var3 = (r1a0) checkoutUiStateMapper$mapContent$1.L$1;
                    pmb pmbVar4 = (pmb) checkoutUiStateMapper$mapContent$1.L$0;
                    kotlin.b.b(obj);
                    z5 = z14;
                    z4 = z15;
                    arrayList = r3;
                    pmbVar2 = pmbVar4;
                    znbVar2 = znbVar4;
                    r1a0Var2 = r1a0Var3;
                }
                el1Var = (el1) obj;
                c311Var = c311Var2;
                znbVar = znbVar2;
                ArrayList arrayList11 = arrayList;
                r1a0 r1a0Var4 = r1a0Var2;
                dge dgeVar2 = dgeVar;
                if (plbVar2 instanceof olb) {
                    if (z4) {
                        blbVar = new zkb(String.valueOf(pmbVar2.b));
                    } else if (znbVar != null) {
                        wib wibVar2 = znbVar.c;
                        if (wibVar2 instanceof tib) {
                            name2 = wibVar2.getClass().getName();
                            str = ((tib) wibVar2).a.d;
                        } else if (wibVar2 instanceof sib) {
                            name2 = wibVar2.getClass().getName();
                            str = ((sib) wibVar2).a.c;
                        } else {
                            name = wibVar2.getClass().getName();
                            blbVar = new ykb(name, wibVar2);
                        }
                        name = g8e.p(name2, ":", str);
                        blbVar = new ykb(name, wibVar2);
                    } else {
                        ArrayList arrayList12 = pmbVar2.d;
                        if (!arrayList12.isEmpty()) {
                            Iterator it7 = arrayList12.iterator();
                            while (it7.hasNext()) {
                                if (((ncp0) it7.next()).a() != null) {
                                    blbVar = new zkb("all_filled");
                                    break;
                                }
                            }
                        }
                        blbVar = null;
                    }
                    blbVar2 = blbVar;
                } else {
                    blbVar2 = new alb(((olb) plbVar2).a);
                }
                cg60 cg60Var = pmbVar2.e;
                return new unb(c311Var, arrayList11, dgeVar2, new sda0(pmbVar2.k.b, z5, !b(r0)), el1Var, cg60Var == null ? new tnb(String.valueOf(pmbVar2.b), cg60Var.a, cg60Var.b, cg60Var.c) : null, r1a0Var4, new nib(new nnb(CheckoutButtonAction.Back, pmbVar2.a, pmbVar2.l, null)), blbVar2, b(plbVar2));
            }
        }
        checkoutUiStateMapper$mapContent$1 = new CheckoutUiStateMapper$mapContent$1(iVar2, continuationImpl);
        Object obj3 = checkoutUiStateMapper$mapContent$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutUiStateMapper$mapContent$1.label;
        boolean z62 = true;
        kfv kfvVar2 = null;
        if (i != 0) {
        }
        el1Var = (el1) obj3;
        c311Var = c311Var2;
        znbVar = znbVar2;
        ArrayList arrayList112 = arrayList;
        r1a0 r1a0Var42 = r1a0Var2;
        dge dgeVar22 = dgeVar;
        if (plbVar2 instanceof olb) {
        }
        cg60 cg60Var2 = pmbVar2.e;
        if (cg60Var2 == null) {
        }
        return new unb(c311Var, arrayList112, dgeVar22, new sda0(pmbVar2.k.b, z5, !b(r0)), el1Var, cg60Var2 == null ? new tnb(String.valueOf(pmbVar2.b), cg60Var2.a, cg60Var2.b, cg60Var2.c) : null, r1a0Var42, new nib(new nnb(CheckoutButtonAction.Back, pmbVar2.a, pmbVar2.l, null)), blbVar2, b(plbVar2));
    }

    public final vnb d(zlb zlbVar) {
        int i = s2h0.ic_error_ticket;
        int i2 = byh0.mt_checkout_error_title;
        avj0 avj0Var = (avj0) this.a;
        return new vnb(new q6o(i, avj0Var.h(i2), avj0Var.h(byh0.mt_checkout_error_subtitle), zlbVar != null ? new zrm(11, avj0Var.h(byh0.mt_checkout_retry), new uib(zlbVar, new nnb(CheckoutButtonAction.ErrorButton, null, null, null))) : null), elb1.c(), new zkb(zlbVar != null ? zlbVar.getClass().getName() : "no-action"));
    }

    public final bge e(pmb pmbVar) {
        String str;
        String str2;
        hlb hlbVar = pmbVar.g;
        if (hlbVar == null || (str = hlbVar.b) == null) {
            str = hlbVar != null ? hlbVar.a : null;
        }
        String str3 = (hlbVar != null ? hlbVar.b : null) != null ? hlbVar.a : null;
        String str4 = "";
        cot cotVar = this.c;
        if (str != null) {
            CurrencyRulesDto currencyRulesDto = hlbVar != null ? hlbVar.c : null;
            if (str.length() == 0) {
                cotVar.getClass();
                str2 = "";
            } else {
                str2 = ((xdf) cotVar.b).a(currencyRulesDto != null ? gwk0.h(lub1.h(currencyRulesDto)) : null, str, false, true);
            }
        } else {
            str2 = null;
        }
        if (str3 != null) {
            hlb hlbVar2 = pmbVar.g;
            CurrencyRulesDto currencyRulesDto2 = hlbVar2 != null ? hlbVar2.c : null;
            if (str3.length() == 0) {
                cotVar.getClass();
            } else {
                str4 = ((xdf) cotVar.b).a(currencyRulesDto2 != null ? gwk0.h(lub1.h(currencyRulesDto2)) : null, str3, false, true);
            }
        } else {
            str4 = null;
        }
        if (str2 != null) {
            return new bge(str2, str4);
        }
        return null;
    }

    public final vnb f(tlb tlbVar) {
        int i = s2h0.ic_error_ticket;
        int i2 = byh0.mt_checkout_payment_declined_error_title;
        avj0 avj0Var = (avj0) this.a;
        return new vnb(new q6o(i, avj0Var.h(i2), avj0Var.h(byh0.mt_checkout_payment_declined_error_subtitle), new zrm(11, avj0Var.h(byh0.mt_checkout_back), new uib(tlbVar, new nnb(CheckoutButtonAction.ErrorButton, null, null, null)))), elb1.c(), new zkb(tlb.class.getName()));
    }

    public final Object g(cnb cnbVar, Map map, boolean z, plb plbVar, boolean z2, Continuation continuation) {
        if (plbVar instanceof ilb) {
            return d(new slb(((ilb) plbVar).a));
        }
        if (plbVar instanceof jlb) {
            jlb jlbVar = (jlb) plbVar;
            return d(new ylb(jlbVar.a, jlbVar.b));
        }
        if (plbVar instanceof nlb) {
            return f(new tlb(((nlb) plbVar).a));
        }
        if (plbVar instanceof mlb) {
            return d(null);
        }
        if (cnbVar instanceof wmb) {
            wmb wmbVar = (wmb) cnbVar;
            Object c = c(wmbVar.a, wmbVar.c, map, wmbVar.d, z2, plbVar, z, (ContinuationImpl) continuation);
            return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : (xnb) c;
        }
        if (cnbVar instanceof zmb) {
            return d(new vlb(((zmb) cnbVar).a));
        }
        if (cnbVar instanceof bnb) {
            return d(new vlb(((bnb) cnbVar).a));
        }
        if (cnbVar instanceof umb) {
            return d(new vlb(((umb) cnbVar).a));
        }
        if (cnbVar instanceof tmb) {
            return f(new tlb(((tmb) cnbVar).a));
        }
        if (cnbVar instanceof vmb) {
            return d(new xlb(((vmb) cnbVar).a));
        }
        if (cnbVar instanceof xmb) {
            return d(new tlb(((xmb) cnbVar).a));
        }
        if (cnbVar instanceof ymb) {
            return d(new ulb(((ymb) cnbVar).a));
        }
        if (cnbVar instanceof anb) {
            return d(new ulb(((anb) cnbVar).a));
        }
        if (cnbVar instanceof smb) {
            return d(wlb.a);
        }
        if (jl40.l(cnbVar, qmb.a) || (cnbVar instanceof rmb)) {
            return (wnb) this.e.getValue();
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(FormattedText formattedText, ContinuationImpl continuationImpl) {
        CheckoutUiStateMapper$mapUserAgreement$1 checkoutUiStateMapper$mapUserAgreement$1;
        int i;
        if (continuationImpl instanceof CheckoutUiStateMapper$mapUserAgreement$1) {
            checkoutUiStateMapper$mapUserAgreement$1 = (CheckoutUiStateMapper$mapUserAgreement$1) continuationImpl;
            int i2 = checkoutUiStateMapper$mapUserAgreement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkoutUiStateMapper$mapUserAgreement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkoutUiStateMapper$mapUserAgreement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkoutUiStateMapper$mapUserAgreement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    checkoutUiStateMapper$mapUserAgreement$1.L$0 = null;
                    checkoutUiStateMapper$mapUserAgreement$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.b, formattedText, null, checkoutUiStateMapper$mapUserAgreement$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new el1((CharSequence) obj);
            }
        }
        checkoutUiStateMapper$mapUserAgreement$1 = new CheckoutUiStateMapper$mapUserAgreement$1(this, continuationImpl);
        Object obj2 = checkoutUiStateMapper$mapUserAgreement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkoutUiStateMapper$mapUserAgreement$1.label;
        if (i != 0) {
        }
        return new el1((CharSequence) obj2);
    }
}
