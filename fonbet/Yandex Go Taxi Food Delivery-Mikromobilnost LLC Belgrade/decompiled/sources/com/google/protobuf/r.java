package com.google.protobuf;

import defpackage.bor;
import defpackage.d5m;
import defpackage.fqw;
import defpackage.g72;
import defpackage.gp50;
import defpackage.hqw;
import defpackage.i7y;
import defpackage.i96;
import defpackage.o5w;
import defpackage.oqw;
import defpackage.qlz;
import defpackage.som0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class r {
    public static final Class a;
    public static final s b;
    public static final u c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Class cls3 = g72.a;
        s sVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            Class cls4 = g72.a;
            try {
                cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                sVar = (s) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = sVar;
        c = new u();
    }

    public static void A(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qlz;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = l.b;
                i3 += 8;
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qlz qlzVar = (qlz) list;
        if (!z) {
            while (i2 < qlzVar.size()) {
                lVar.o(i, qlzVar.g(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qlzVar.size(); i6++) {
            qlzVar.g(i6);
            Logger logger2 = l.b;
            i5 += 8;
        }
        lVar.x(i5);
        while (i2 < qlzVar.size()) {
            lVar.p(qlzVar.g(i2));
            i2++;
        }
    }

    public static void B(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof o5w;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    lVar.w(i, (intValue >> 31) ^ (intValue << 1));
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += l.c(((Integer) list.get(i4)).intValue());
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                lVar.x((intValue2 >> 31) ^ (intValue2 << 1));
                i2++;
            }
            return;
        }
        o5w o5wVar = (o5w) list;
        if (!z) {
            while (i2 < o5wVar.c) {
                int e = o5wVar.e(i2);
                lVar.w(i, (e >> 31) ^ (e << 1));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < o5wVar.c; i6++) {
            i5 += l.c(o5wVar.e(i6));
        }
        lVar.x(i5);
        while (i2 < o5wVar.c) {
            int e2 = o5wVar.e(i2);
            lVar.x((e2 >> 31) ^ (e2 << 1));
            i2++;
        }
    }

    public static void C(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qlz;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    lVar.y(i, (longValue >> 63) ^ (longValue << 1));
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += l.d(((Long) list.get(i4)).longValue());
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                lVar.z((longValue2 >> 63) ^ (longValue2 << 1));
                i2++;
            }
            return;
        }
        qlz qlzVar = (qlz) list;
        if (!z) {
            while (i2 < qlzVar.size()) {
                long g = qlzVar.g(i2);
                lVar.y(i, (g >> 63) ^ (g << 1));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qlzVar.size(); i6++) {
            i5 += l.d(qlzVar.g(i6));
        }
        lVar.x(i5);
        while (i2 < qlzVar.size()) {
            long g2 = qlzVar.g(i2);
            lVar.z((g2 >> 63) ^ (g2 << 1));
            i2++;
        }
    }

    public static void D(int i, List list, gp50 gp50Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!(list instanceof i7y)) {
            while (i2 < list.size()) {
                lVar.u(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        i7y i7yVar = (i7y) list;
        while (i2 < list.size()) {
            Object v = i7yVar.v();
            if (v instanceof String) {
                lVar.u(i, (String) v);
            } else {
                lVar.l(i, (ByteString) v);
            }
            i2++;
        }
    }

    public static void E(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof o5w;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.w(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += l.g(((Integer) list.get(i4)).intValue());
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.x(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o5w o5wVar = (o5w) list;
        if (!z) {
            while (i2 < o5wVar.c) {
                lVar.w(i, o5wVar.e(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < o5wVar.c; i6++) {
            i5 += l.g(o5wVar.e(i6));
        }
        lVar.x(i5);
        while (i2 < o5wVar.c) {
            lVar.x(o5wVar.e(i2));
            i2++;
        }
    }

    public static void F(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qlz;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += l.h(((Long) list.get(i4)).longValue());
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qlz qlzVar = (qlz) list;
        if (!z) {
            while (i2 < qlzVar.size()) {
                lVar.y(i, qlzVar.g(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qlzVar.size(); i6++) {
            i5 += l.h(qlzVar.g(i6));
        }
        lVar.x(i5);
        while (i2 < qlzVar.size()) {
            lVar.z(qlzVar.g(i2));
            i2++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o5w)) {
            int i2 = 0;
            while (i < size) {
                i2 += l.h(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        o5w o5wVar = (o5w) list;
        int i3 = 0;
        while (i < size) {
            i3 += l.h(o5wVar.e(i));
            i++;
        }
        return i3;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.f(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.f(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o5w)) {
            int i2 = 0;
            while (i < size) {
                i2 += l.h(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        o5w o5wVar = (o5w) list;
        int i3 = 0;
        while (i < size) {
            i3 += l.h(o5wVar.e(i));
            i++;
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qlz)) {
            int i2 = 0;
            while (i < size) {
                i2 += l.h(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        qlz qlzVar = (qlz) list;
        int i3 = 0;
        while (i < size) {
            i3 += l.h(qlzVar.g(i));
            i++;
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o5w)) {
            int i2 = 0;
            while (i < size) {
                i2 += l.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        o5w o5wVar = (o5w) list;
        int i3 = 0;
        while (i < size) {
            i3 += l.c(o5wVar.e(i));
            i++;
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qlz)) {
            int i2 = 0;
            while (i < size) {
                i2 += l.d(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        qlz qlzVar = (qlz) list;
        int i3 = 0;
        while (i < size) {
            i3 += l.d(qlzVar.g(i));
            i++;
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o5w)) {
            int i2 = 0;
            while (i < size) {
                i2 += l.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        o5w o5wVar = (o5w) list;
        int i3 = 0;
        while (i < size) {
            i3 += l.g(o5wVar.e(i));
            i++;
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qlz)) {
            int i2 = 0;
            while (i < size) {
                i2 += l.h(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        qlz qlzVar = (qlz) list;
        int i3 = 0;
        while (i < size) {
            i3 += l.h(qlzVar.g(i));
            i++;
        }
        return i3;
    }

    public static Object j(Object obj, int i, oqw oqwVar, hqw hqwVar, Object obj2, s sVar) {
        if (hqwVar == null) {
            return obj2;
        }
        if (oqwVar == null) {
            Iterator it = oqwVar.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!hqwVar.isInRange(intValue)) {
                    obj2 = n(obj, i, intValue, obj2, sVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = oqwVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) oqwVar.get(i3);
            int intValue2 = num.intValue();
            if (hqwVar.isInRange(intValue2)) {
                if (i3 != i2) {
                    oqwVar.set(i2, num);
                }
                i2++;
            } else {
                obj2 = n(obj, i, intValue2, obj2, sVar);
            }
        }
        if (i2 != size) {
            oqwVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object k(Object obj, int i, AbstractList abstractList, fqw fqwVar, Object obj2, s sVar) {
        if (fqwVar == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int intValue = num.intValue();
            if (fqwVar.findValueByNumber(intValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = n(obj, i, intValue, obj2, sVar);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void l(s sVar, Object obj, Object obj2) {
        ((u) sVar).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        t tVar = generatedMessageLite.unknownFields;
        t tVar2 = ((GeneratedMessageLite) obj2).unknownFields;
        t tVar3 = t.f;
        if (!tVar3.equals(tVar2)) {
            if (tVar3.equals(tVar)) {
                tVar = t.e(tVar, tVar2);
            } else {
                tVar.getClass();
                if (!tVar2.equals(tVar3)) {
                    tVar.a();
                    int i = tVar.a + tVar2.a;
                    tVar.b(i);
                    System.arraycopy(tVar2.b, 0, tVar.b, tVar.a, tVar2.a);
                    System.arraycopy(tVar2.c, 0, tVar.c, tVar.a, tVar2.a);
                    tVar.a = i;
                }
            }
        }
        generatedMessageLite.unknownFields = tVar;
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object n(Object obj, int i, int i2, Object obj2, s sVar) {
        if (obj2 == null) {
            obj2 = sVar.a(obj);
        }
        ((u) sVar).getClass();
        ((t) obj2).f(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void o(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof i96;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.k(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                Logger logger = l.b;
                i3++;
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        i96 i96Var = (i96) list;
        if (!z) {
            while (i2 < i96Var.size()) {
                lVar.k(i, i96Var.f(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < i96Var.size(); i6++) {
            i96Var.f(i6);
            Logger logger2 = l.b;
            i5++;
        }
        lVar.x(i5);
        while (i2 < i96Var.size()) {
            lVar.j(i96Var.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void p(int i, List list, gp50 gp50Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((l) gp50Var.b).l(i, (ByteString) list.get(i2));
        }
    }

    public static void q(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof d5m;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    lVar.getClass();
                    lVar.o(i, Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                Logger logger = l.b;
                i3 += 8;
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        d5m d5mVar = (d5m) list;
        if (!z) {
            while (i2 < d5mVar.size()) {
                double g = d5mVar.g(i2);
                lVar.getClass();
                lVar.o(i, Double.doubleToRawLongBits(g));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < d5mVar.size(); i6++) {
            d5mVar.g(i6);
            Logger logger2 = l.b;
            i5 += 8;
        }
        lVar.x(i5);
        while (i2 < d5mVar.size()) {
            lVar.p(Double.doubleToRawLongBits(d5mVar.g(i2)));
            i2++;
        }
    }

    public static void r(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof o5w;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += l.h(((Integer) list.get(i4)).intValue());
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o5w o5wVar = (o5w) list;
        if (!z) {
            while (i2 < o5wVar.c) {
                lVar.q(i, o5wVar.e(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < o5wVar.c; i6++) {
            i5 += l.h(o5wVar.e(i6));
        }
        lVar.x(i5);
        while (i2 < o5wVar.c) {
            lVar.r(o5wVar.e(i2));
            i2++;
        }
    }

    public static void s(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof o5w;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = l.b;
                i3 += 4;
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o5w o5wVar = (o5w) list;
        if (!z) {
            while (i2 < o5wVar.c) {
                lVar.m(i, o5wVar.e(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < o5wVar.c; i6++) {
            o5wVar.e(i6);
            Logger logger2 = l.b;
            i5 += 4;
        }
        lVar.x(i5);
        while (i2 < o5wVar.c) {
            lVar.n(o5wVar.e(i2));
            i2++;
        }
    }

    public static void t(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qlz;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = l.b;
                i3 += 8;
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qlz qlzVar = (qlz) list;
        if (!z) {
            while (i2 < qlzVar.size()) {
                lVar.o(i, qlzVar.g(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qlzVar.size(); i6++) {
            qlzVar.g(i6);
            Logger logger2 = l.b;
            i5 += 8;
        }
        lVar.x(i5);
        while (i2 < qlzVar.size()) {
            lVar.p(qlzVar.g(i2));
            i2++;
        }
    }

    public static void u(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof bor;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    lVar.getClass();
                    lVar.m(i, Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                Logger logger = l.b;
                i3 += 4;
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        bor borVar = (bor) list;
        if (!z) {
            while (i2 < borVar.size()) {
                float g = borVar.g(i2);
                lVar.getClass();
                lVar.m(i, Float.floatToRawIntBits(g));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < borVar.size(); i6++) {
            borVar.g(i6);
            Logger logger2 = l.b;
            i5 += 4;
        }
        lVar.x(i5);
        while (i2 < borVar.size()) {
            lVar.n(Float.floatToRawIntBits(borVar.g(i2)));
            i2++;
        }
    }

    public static void v(int i, List list, gp50 gp50Var, som0 som0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            gp50Var.R(i, list.get(i2), som0Var);
        }
    }

    public static void w(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof o5w;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += l.h(((Integer) list.get(i4)).intValue());
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o5w o5wVar = (o5w) list;
        if (!z) {
            while (i2 < o5wVar.c) {
                lVar.q(i, o5wVar.e(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < o5wVar.c; i6++) {
            i5 += l.h(o5wVar.e(i6));
        }
        lVar.x(i5);
        while (i2 < o5wVar.c) {
            lVar.r(o5wVar.e(i2));
            i2++;
        }
    }

    public static void x(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof qlz;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += l.h(((Long) list.get(i4)).longValue());
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qlz qlzVar = (qlz) list;
        if (!z) {
            while (i2 < qlzVar.size()) {
                lVar.y(i, qlzVar.g(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qlzVar.size(); i6++) {
            i5 += l.h(qlzVar.g(i6));
        }
        lVar.x(i5);
        while (i2 < qlzVar.size()) {
            lVar.z(qlzVar.g(i2));
            i2++;
        }
    }

    public static void y(int i, List list, gp50 gp50Var, som0 som0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            gp50Var.U(i, list.get(i2), som0Var);
        }
    }

    public static void z(int i, List list, gp50 gp50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof o5w;
        l lVar = (l) gp50Var.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    lVar.m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            lVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = l.b;
                i3 += 4;
            }
            lVar.x(i3);
            while (i2 < list.size()) {
                lVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o5w o5wVar = (o5w) list;
        if (!z) {
            while (i2 < o5wVar.c) {
                lVar.m(i, o5wVar.e(i2));
                i2++;
            }
            return;
        }
        lVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < o5wVar.c; i6++) {
            o5wVar.e(i6);
            Logger logger2 = l.b;
            i5 += 4;
        }
        lVar.x(i5);
        while (i2 < o5wVar.c) {
            lVar.n(o5wVar.e(i2));
            i2++;
        }
    }
}
