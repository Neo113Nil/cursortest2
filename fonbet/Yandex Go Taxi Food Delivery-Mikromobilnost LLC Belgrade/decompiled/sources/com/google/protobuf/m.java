package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import defpackage.evf0;
import defpackage.gp50;
import defpackage.ny61;
import defpackage.pyo;
import defpackage.qxs;
import defpackage.rxs;
import defpackage.som0;
import defpackage.syo;
import defpackage.uyo;
import defpackage.wt10;
import defpackage.yci0;
import defpackage.yxq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m extends syo {
    @Override // defpackage.syo
    public final rxs a(pyo pyoVar, wt10 wt10Var, int i) {
        return pyoVar.a(i, wt10Var);
    }

    @Override // defpackage.syo
    public final yxq b(Object obj) {
        return ((GeneratedMessageLite.a) obj).f();
    }

    @Override // defpackage.syo
    public final Object c(Object obj, i iVar, rxs rxsVar, pyo pyoVar, yxq yxqVar, Object obj2, s sVar) {
        Object g;
        ArrayList arrayList;
        int c = rxsVar.c();
        qxs qxsVar = rxsVar.c;
        Object obj3 = null;
        if (qxsVar.e() && qxsVar.d()) {
            switch (uyo.a[rxsVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    iVar.m(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    iVar.u(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    iVar.A(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    iVar.T(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    iVar.y(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    iVar.s(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    iVar.q(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    iVar.i(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    iVar.R(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    iVar.E(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    iVar.G(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    iVar.I(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    iVar.K(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    iVar.o(arrayList);
                    obj2 = r.k(obj, c, arrayList, qxsVar.a(), obj2, sVar);
                    break;
                default:
                    yci0.t(qxsVar.b(), "Type cannot be packed: ");
                    return null;
            }
            yxqVar.r(qxsVar, arrayList);
            return obj2;
        }
        if (rxsVar.a() != WireFormat$FieldType.ENUM) {
            switch (uyo.a[rxsVar.a().ordinal()]) {
                case 1:
                    obj3 = Double.valueOf(iVar.l());
                    break;
                case 2:
                    obj3 = Float.valueOf(iVar.t());
                    break;
                case 3:
                    obj3 = Long.valueOf(iVar.z());
                    break;
                case 4:
                    obj3 = Long.valueOf(iVar.S());
                    break;
                case 5:
                    obj3 = Integer.valueOf(iVar.x());
                    break;
                case 6:
                    obj3 = Long.valueOf(iVar.r());
                    break;
                case 7:
                    obj3 = Integer.valueOf(iVar.p());
                    break;
                case 8:
                    obj3 = Boolean.valueOf(iVar.h());
                    break;
                case 9:
                    obj3 = Integer.valueOf(iVar.Q());
                    break;
                case 10:
                    obj3 = Integer.valueOf(iVar.D());
                    break;
                case 11:
                    obj3 = Long.valueOf(iVar.F());
                    break;
                case 12:
                    obj3 = Integer.valueOf(iVar.H());
                    break;
                case 13:
                    obj3 = Long.valueOf(iVar.J());
                    break;
                case 14:
                    ny61.r("Shouldn't reach here.");
                    return null;
                case 15:
                    obj3 = iVar.j();
                    break;
                case 16:
                    obj3 = iVar.L();
                    break;
                case 17:
                    if (!rxsVar.d()) {
                        Object g2 = yxqVar.g(qxsVar);
                        if (g2 instanceof GeneratedMessageLite) {
                            evf0 evf0Var = evf0.c;
                            evf0Var.getClass();
                            som0 a = evf0Var.a(g2.getClass());
                            if (!((GeneratedMessageLite) g2).isMutable()) {
                                Object d = a.d();
                                a.b(d, g2);
                                yxqVar.r(qxsVar, d);
                                g2 = d;
                            }
                            iVar.d(g2, a, pyoVar);
                            return obj2;
                        }
                    }
                    obj3 = iVar.v(rxsVar.b().getClass(), pyoVar);
                    break;
                case 18:
                    if (!rxsVar.d()) {
                        Object g3 = yxqVar.g(qxsVar);
                        if (g3 instanceof GeneratedMessageLite) {
                            evf0 evf0Var2 = evf0.c;
                            evf0Var2.getClass();
                            som0 a2 = evf0Var2.a(g3.getClass());
                            if (!((GeneratedMessageLite) g3).isMutable()) {
                                Object d2 = a2.d();
                                a2.b(d2, g3);
                                yxqVar.r(qxsVar, d2);
                                g3 = d2;
                            }
                            iVar.f(g3, a2, pyoVar);
                            return obj2;
                        }
                    }
                    obj3 = iVar.B(rxsVar.b().getClass(), pyoVar);
                    break;
            }
        } else {
            int x = iVar.x();
            if (qxsVar.a().findValueByNumber(x) == null) {
                return r.n(obj, c, x, obj2, sVar);
            }
            obj3 = Integer.valueOf(x);
        }
        if (rxsVar.d()) {
            yxqVar.a(qxsVar, obj3);
            return obj2;
        }
        int i = uyo.a[rxsVar.a().ordinal()];
        if ((i == 17 || i == 18) && (g = yxqVar.g(qxsVar)) != null) {
            obj3 = ((wt10) g).toBuilder().mergeFrom((wt10) obj3).buildPartial();
        }
        yxqVar.r(qxsVar, obj3);
        return obj2;
    }

    @Override // defpackage.syo
    public final void d(gp50 gp50Var, Map.Entry entry) {
        l lVar = (l) gp50Var.b;
        qxs qxsVar = (qxs) entry.getKey();
        if (qxsVar.e()) {
            switch (uyo.a[qxsVar.b().ordinal()]) {
                case 1:
                    r.q(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 2:
                    r.u(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 3:
                    r.x(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 4:
                    r.F(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 5:
                    r.w(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 6:
                    r.t(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 7:
                    r.s(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 8:
                    r.o(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 9:
                    r.E(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 10:
                    r.z(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 11:
                    r.A(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 12:
                    r.B(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 13:
                    r.C(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 14:
                    r.w(qxsVar.c(), (List) entry.getValue(), gp50Var, qxsVar.d());
                    break;
                case 15:
                    r.p(qxsVar.c(), (List) entry.getValue(), gp50Var);
                    break;
                case 16:
                    r.D(qxsVar.c(), (List) entry.getValue(), gp50Var);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        r.v(qxsVar.c(), (List) entry.getValue(), gp50Var, evf0.c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        r.y(qxsVar.c(), (List) entry.getValue(), gp50Var, evf0.c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (uyo.a[qxsVar.b().ordinal()]) {
            case 1:
                int c = qxsVar.c();
                double doubleValue = ((Double) entry.getValue()).doubleValue();
                lVar.getClass();
                lVar.o(c, Double.doubleToRawLongBits(doubleValue));
                break;
            case 2:
                int c2 = qxsVar.c();
                float floatValue = ((Float) entry.getValue()).floatValue();
                lVar.getClass();
                lVar.m(c2, Float.floatToRawIntBits(floatValue));
                break;
            case 3:
                gp50Var.T(qxsVar.c(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                lVar.y(qxsVar.c(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                gp50Var.S(qxsVar.c(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                gp50Var.Q(qxsVar.c(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                gp50Var.P(qxsVar.c(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                lVar.k(qxsVar.c(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                lVar.w(qxsVar.c(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                lVar.m(qxsVar.c(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                lVar.o(qxsVar.c(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                int c3 = qxsVar.c();
                int intValue = ((Integer) entry.getValue()).intValue();
                lVar.w(c3, (intValue >> 31) ^ (intValue << 1));
                break;
            case 13:
                int c4 = qxsVar.c();
                long longValue = ((Long) entry.getValue()).longValue();
                lVar.y(c4, (longValue >> 63) ^ (longValue << 1));
                break;
            case 14:
                gp50Var.S(qxsVar.c(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                gp50Var.O(qxsVar.c(), (ByteString) entry.getValue());
                break;
            case 16:
                lVar.u(qxsVar.c(), (String) entry.getValue());
                break;
            case 17:
                gp50Var.R(qxsVar.c(), entry.getValue(), evf0.c.a(entry.getValue().getClass()));
                break;
            case 18:
                gp50Var.U(qxsVar.c(), entry.getValue(), evf0.c.a(entry.getValue().getClass()));
                break;
        }
    }
}
