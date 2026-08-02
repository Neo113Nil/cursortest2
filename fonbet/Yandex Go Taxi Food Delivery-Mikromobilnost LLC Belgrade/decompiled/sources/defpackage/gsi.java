package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.delivery.extracted_delivery_form.models.data.PaymentType;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySkipAlertCondition;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;
import ru.yandex.taxi.delivery.models.data.experiment.SkipAlertCondition;

/* loaded from: classes5.dex */
public final class gsi implements qqo {
    public static final LinkedHashSet f = new LinkedHashSet();
    public final /* synthetic */ qqo a;
    public final w7i b;
    public final net c;
    public final cii d;
    public final dqe0 e;

    public gsi(rqo rqoVar, w7i w7iVar, net netVar, cii ciiVar, dqe0 dqe0Var) {
        kfi.Companion.getClass();
        this.a = ((jbh) rqoVar).c(kfi.u);
        this.b = w7iVar;
        this.c = netVar;
        this.d = ciiVar;
        this.e = dqe0Var;
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final kfi b() {
        return (kfi) this.a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0479 A[LOOP:13: B:236:0x0473->B:238:0x0479, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0331 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vsi e(String str) {
        Object obj;
        String str2;
        Iterator it;
        Object obj2;
        mle mleVar;
        int i;
        DeliverySkipAlertCondition deliverySkipAlertCondition;
        bai baiVar;
        swh swhVar;
        EmptyList emptyList;
        String str3;
        ysi ysiVar;
        Iterator it2;
        String str4;
        DeliveryFormType deliveryFormType;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        DeliveryFormStepType deliveryFormStepType;
        String str5;
        w7i w7iVar = this.b;
        kfi b = b();
        List f2 = f(str);
        cii ciiVar = this.d;
        PaymentType a = ciiVar.a(this.e.a.c());
        lv90 e = this.e.a.e();
        PaymentType a2 = e != null ? ciiVar.a(e) : null;
        w7iVar.getClass();
        String str6 = b.e.a;
        Iterator it3 = f2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (jl40.l(((lmw0) obj).getName(), str6)) {
                break;
            }
        }
        lmw0 lmw0Var = (lmw0) obj;
        ArrayList arrayList = new ArrayList();
        Iterator it4 = b.i.iterator();
        while (it4.hasNext()) {
            xn0 xn0Var = (xn0) it4.next();
            Map map = xn0Var.e.a;
            Object obj7 = map.get(uae0.class);
            if (!(obj7 instanceof uae0)) {
                obj7 = null;
            }
            uae0 uae0Var = (uae0) obj7;
            if (uae0Var == null) {
                ny61.r("Porch not found!");
                return null;
            }
            Object obj8 = map.get(u4m.class);
            if (!(obj8 instanceof u4m)) {
                obj8 = null;
            }
            u4m u4mVar = (u4m) obj8;
            if (u4mVar == null) {
                ny61.r("Door Phone not found!");
                return null;
            }
            Object obj9 = map.get(seb0.class);
            if (!(obj9 instanceof seb0)) {
                obj9 = null;
            }
            seb0 seb0Var = (seb0) obj9;
            if (seb0Var == null) {
                ny61.r("Phone not found!");
                return null;
            }
            agb0 agb0Var = seb0Var.b;
            Object obj10 = map.get(dmc.class);
            Iterator it5 = it4;
            if (!(obj10 instanceof dmc)) {
                obj10 = null;
            }
            dmc dmcVar = (dmc) obj10;
            if (dmcVar == null) {
                ny61.r("Comment not found!");
                return null;
            }
            Object obj11 = map.get(im2.class);
            if (!(obj11 instanceof im2)) {
                obj11 = null;
            }
            im2 im2Var = (im2) obj11;
            if (im2Var == null) {
                ny61.r("Apartment not found!");
                return null;
            }
            Iterator it6 = agb0Var.e.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj6 = null;
                    break;
                }
                obj6 = it6.next();
                Iterator it7 = it6;
                if (jl40.l(((ofb0) obj6).a, str)) {
                    break;
                }
                it6 = it7;
            }
            ofb0 ofb0Var = (ofb0) obj6;
            lmw0 lmw0Var2 = lmw0Var;
            String str7 = xn0Var.d;
            String str8 = xn0Var.c;
            int i2 = v7i.b[xn0Var.a.ordinal()];
            if (i2 == 1) {
                deliveryFormStepType = DeliveryFormStepType.SOURCE;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                deliveryFormStepType = DeliveryFormStepType.DESTINATION;
            }
            DeliveryFormStepType deliveryFormStepType2 = deliveryFormStepType;
            String str9 = seb0Var.a;
            String str10 = agb0Var.a;
            if (ofb0Var == null || (str5 = ofb0Var.b) == null) {
                str5 = agb0Var.d;
            }
            arrayList.add(new b6i(str7, str8, deliveryFormStepType2, str9, str10, str5, agb0Var.c, im2Var.b, im2Var.a, dmcVar.a, uae0Var.a, u4mVar.a));
            it4 = it5;
            lmw0Var = lmw0Var2;
        }
        lmw0 lmw0Var3 = lmw0Var;
        List list = b.k.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj12 : list) {
            if (jl40.l(((vjl0) obj12).a.a, str)) {
                arrayList2.add(obj12);
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            vjl0 vjl0Var = (vjl0) it8.next();
            kxd kxdVar = vjl0Var.a;
            mxd mxdVar = new mxd(kxdVar.a, kxdVar.b, kxdVar.c);
            List<xpn> list2 = vjl0Var.b;
            ArrayList arrayList4 = new ArrayList(tcc.n(list2, 10));
            for (xpn xpnVar : list2) {
                if (xpnVar instanceof qpn) {
                    qpn qpnVar = (qpn) xpnVar;
                    obj5 = new rpn(qpnVar.a, qpnVar.b);
                } else if (xpnVar instanceof upn) {
                    upn upnVar = (upn) xpnVar;
                    obj5 = new vpn(upnVar.a, upnVar.b);
                } else {
                    if (!jl40.l(xpnVar, wpn.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    obj5 = bei.D;
                }
                arrayList4.add(obj5);
            }
            arrayList3.add(new wjl0(mxdVar, arrayList4));
        }
        swh swhVar2 = new swh(arrayList3);
        ArrayList a3 = w7i.a(b, f2, str, a, a2);
        tfr0 tfr0Var = b.s;
        jpi jpiVar = new jpi(tfr0Var.a, tfr0Var.b, tfr0Var.c, tfr0Var.d);
        ArrayList o0 = a.o0(b.r, b.e);
        ArrayList arrayList5 = new ArrayList();
        Iterator it9 = o0.iterator();
        while (it9.hasNext()) {
            Object next = it9.next();
            Iterator it10 = ((nmi) next).b.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it10.next();
                if (jl40.l(((adj0) obj4).a, str)) {
                    break;
                }
            }
            adj0 adj0Var = (adj0) obj4;
            if (adj0Var != null && adj0Var.b) {
                List list3 = adj0Var.d;
                if (!(list3 == null ? true : (a2 == null || list3.contains(a2.getTypeName())) ? list3.contains(a.getTypeName()) : false)) {
                }
            }
            arrayList5.add(next);
        }
        ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
        Iterator it11 = arrayList5.iterator();
        while (it11.hasNext()) {
            arrayList6.add(((nmi) it11.next()).a);
        }
        boolean booleanValue = ((Boolean) w7iVar.b.a.b()).booleanValue();
        boolean booleanValue2 = ((Boolean) w7iVar.d.a.b()).booleanValue();
        List list4 = b.g;
        if (list4 != null) {
            ListIterator listIterator = list4.listIterator(list4.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj3 = null;
                    break;
                }
                obj3 = listIterator.previous();
                if (((xiz0) obj3).b.contains(str)) {
                    break;
                }
            }
            xiz0 xiz0Var = (xiz0) obj3;
            if (xiz0Var != null) {
                str2 = xiz0Var.a;
                String str11 = b.f;
                p1i p1iVar = b.j;
                it = p1iVar.e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((mle) obj2).a, str)) {
                        break;
                    }
                }
                mleVar = (mle) obj2;
                if (mleVar != null || (r6 = mleVar.b) == null) {
                    SkipAlertCondition skipAlertCondition = SkipAlertCondition.NEVER;
                }
                String str12 = p1iVar.a;
                String str13 = p1iVar.b;
                String str14 = p1iVar.c;
                String str15 = p1iVar.d;
                i = v7i.a[skipAlertCondition.ordinal()];
                if (i != 1) {
                    deliverySkipAlertCondition = DeliverySkipAlertCondition.REQUIREMENT_NOT_SELECTED;
                } else if (i == 2) {
                    deliverySkipAlertCondition = DeliverySkipAlertCondition.NEVER;
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    deliverySkipAlertCondition = DeliverySkipAlertCondition.ALWAYS;
                }
                m1i m1iVar = new m1i(str12, str13, str14, str15, deliverySkipAlertCondition);
                baiVar = w7iVar.e;
                if (((z9i) baiVar.a.b()).b) {
                    swhVar = swhVar2;
                    emptyList = EmptyList.a;
                } else {
                    List list5 = ((z9i) baiVar.a.b()).c;
                    ArrayList arrayList7 = new ArrayList(tcc.n(list5, 10));
                    Iterator it12 = list5.iterator();
                    while (it12.hasNext()) {
                        zjl0 zjl0Var = (zjl0) it12.next();
                        txd txdVar = zjl0Var.a;
                        Iterator it13 = it12;
                        swh swhVar3 = swhVar2;
                        mxd mxdVar2 = new mxd(txdVar.a, txdVar.b, txdVar.c);
                        int i3 = aai.a[zjl0Var.b.ordinal()];
                        if (i3 == 1) {
                            deliveryFormType = DeliveryFormType.REDUCED;
                        } else if (i3 == 2) {
                            deliveryFormType = DeliveryFormType.FULL;
                        } else if (i3 == 3) {
                            deliveryFormType = DeliveryFormType.SHORT;
                        } else if (i3 == 4) {
                            deliveryFormType = DeliveryFormType.MINIMAL;
                        } else {
                            if (i3 != 5) {
                                w511.b();
                                return null;
                            }
                            deliveryFormType = DeliveryFormType.FULL;
                        }
                        arrayList7.add(new z6s(mxdVar2, deliveryFormType));
                        it12 = it13;
                        swhVar2 = swhVar3;
                    }
                    swhVar = swhVar2;
                    emptyList = arrayList7;
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj13 : emptyList) {
                    if (jl40.l(((z6s) obj13).a.a, str)) {
                        arrayList8.add(obj13);
                    }
                }
                obi obiVar = new obi(arrayList8);
                String str16 = b.l;
                h7i h7iVar = b.m;
                String str17 = h7iVar == null ? h7iVar.a : null;
                String str18 = h7iVar == null ? h7iVar.b : null;
                boolean z = b.q;
                if (lmw0Var3 == null) {
                    str3 = str16;
                    ysiVar = new ysi(lmw0Var3.getName(), lmw0Var3.getLabel(), lmw0Var3.getDescription());
                } else {
                    str3 = str16;
                    ysiVar = null;
                }
                boolean G = a.G(a3, lmw0Var3);
                ArrayList arrayList9 = new ArrayList(tcc.n(a3, 10));
                for (it2 = a3.iterator(); it2.hasNext(); it2 = it2) {
                    lmw0 lmw0Var4 = (lmw0) it2.next();
                    arrayList9.add(new ysi(lmw0Var4.getName(), lmw0Var4.getLabel(), lmw0Var4.getDescription()));
                }
                DeliveryFormType deliveryFormType2 = !b.d.contains(str) ? DeliveryFormType.SHORT : DeliveryFormType.FULL;
                aji ajiVar = w7iVar.a;
                yii yiiVar = new yii(ajiVar.b().d, ajiVar.b().f, ajiVar.b().e, !ajiVar.b().b && ajiVar.b().c.contains(str));
                pex0 m = ((k) w7iVar.c).m();
                return new vsi(str11, str2, jpiVar, arrayList, m1iVar, swhVar, obiVar, str3, str17, str18, arrayList6, z, ysiVar, G, arrayList9, deliveryFormType2, yiiVar, booleanValue, (m != null || (str4 = m.l) == null) ? null : d6z.j(str4), booleanValue2);
            }
        }
        str2 = null;
        String str112 = b.f;
        p1i p1iVar2 = b.j;
        it = p1iVar2.e.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        mleVar = (mle) obj2;
        if (mleVar != null) {
        }
        SkipAlertCondition skipAlertCondition2 = SkipAlertCondition.NEVER;
        String str122 = p1iVar2.a;
        String str132 = p1iVar2.b;
        String str142 = p1iVar2.c;
        String str152 = p1iVar2.d;
        i = v7i.a[skipAlertCondition2.ordinal()];
        if (i != 1) {
        }
        m1i m1iVar2 = new m1i(str122, str132, str142, str152, deliverySkipAlertCondition);
        baiVar = w7iVar.e;
        if (((z9i) baiVar.a.b()).b) {
        }
        ArrayList arrayList82 = new ArrayList();
        while (r5.hasNext()) {
        }
        obi obiVar2 = new obi(arrayList82);
        String str162 = b.l;
        h7i h7iVar2 = b.m;
        if (h7iVar2 == null) {
        }
        if (h7iVar2 == null) {
        }
        boolean z2 = b.q;
        if (lmw0Var3 == null) {
        }
        boolean G2 = a.G(a3, lmw0Var3);
        ArrayList arrayList92 = new ArrayList(tcc.n(a3, 10));
        while (it2.hasNext()) {
        }
        if (!b.d.contains(str)) {
        }
        aji ajiVar2 = w7iVar.a;
        yii yiiVar2 = new yii(ajiVar2.b().d, ajiVar2.b().f, ajiVar2.b().e, !ajiVar2.b().b && ajiVar2.b().c.contains(str));
        pex0 m2 = ((k) w7iVar.c).m();
        return new vsi(str112, str2, jpiVar, arrayList, m1iVar2, swhVar, obiVar2, str3, str17, str18, arrayList6, z2, ysiVar, G2, arrayList92, deliveryFormType2, yiiVar2, booleanValue, (m2 != null || (str4 = m2.l) == null) ? null : d6z.j(str4), booleanValue2);
    }

    public final List f(String str) {
        pex0 m;
        List f2;
        net netVar = this.c;
        mi31 d = b8r.d(netVar.b, str, "", 4);
        if (d == null || (m = d.a) == null) {
            m = ((k) netVar.a).m();
        }
        return (m == null || (f2 = m.f()) == null) ? EmptyList.a : f2;
    }

    public final boolean g(String str) {
        if (!b().b || !b().c.contains(str)) {
            return false;
        }
        try {
            e(str);
            return true;
        } catch (Throwable th) {
            fsi fsiVar = new fsi(b(), f(str));
            LinkedHashSet linkedHashSet = f;
            if (linkedHashSet.contains(fsiVar)) {
                return false;
            }
            linkedHashSet.add(fsiVar);
            jst.e.k(th, "Logistics.DeliveryStepsExperimentProvider.Error");
            return false;
        }
    }
}
