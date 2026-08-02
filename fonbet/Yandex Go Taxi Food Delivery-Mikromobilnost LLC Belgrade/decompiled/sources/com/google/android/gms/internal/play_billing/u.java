package com.google.android.gms.internal.play_billing;

import defpackage.dxf0;
import defpackage.ly3;
import defpackage.m9a1;
import defpackage.n4a1;
import defpackage.n6a1;
import defpackage.ofa1;
import defpackage.oo31;
import defpackage.pia1;
import defpackage.px91;
import defpackage.q1a1;
import defpackage.saa1;
import defpackage.w511;
import defpackage.xea1;
import defpackage.xp91;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u {
    public static final xp91 a;

    static {
        xea1 xea1Var = xea1.c;
        a = new xp91(6);
    }

    public static void a(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof n6a1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    nVar.l(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            nVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += n.q((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            nVar.m(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                nVar.m((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        n6a1 n6a1Var = (n6a1) list;
        if (!z) {
            while (i2 < n6a1Var.size()) {
                int d = n6a1Var.d(i2);
                nVar.l(i, (d >> 31) ^ (d + d));
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n6a1Var.size(); i6++) {
            int d2 = n6a1Var.d(i6);
            i5 += n.q((d2 >> 31) ^ (d2 + d2));
        }
        nVar.m(i5);
        while (i2 < n6a1Var.size()) {
            int d3 = n6a1Var.d(i2);
            nVar.m((d3 >> 31) ^ (d3 + d3));
            i2++;
        }
    }

    public static void b(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        if (list instanceof saa1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            nVar.k(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                nVar.n(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += n.a((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        nVar.m(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            nVar.o((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public static void c(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof n6a1)) {
            if (!z) {
                while (i2 < list.size()) {
                    nVar.l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += n.q(((Integer) list.get(i4)).intValue());
            }
            nVar.m(i3);
            while (i2 < list.size()) {
                nVar.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n6a1 n6a1Var = (n6a1) list;
        if (!z) {
            while (i2 < n6a1Var.size()) {
                nVar.l(i, n6a1Var.d(i2));
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n6a1Var.size(); i6++) {
            i5 += n.q(n6a1Var.d(i6));
        }
        nVar.m(i5);
        while (i2 < n6a1Var.size()) {
            nVar.m(n6a1Var.d(i2));
            i2++;
        }
    }

    public static void d(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        if (list instanceof saa1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            nVar.k(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += n.a(((Long) list.get(i4)).longValue());
        }
        nVar.m(i3);
        while (i2 < list.size()) {
            nVar.o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n6a1)) {
            int i2 = 0;
            while (i < size) {
                i2 += n.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        n6a1 n6a1Var = (n6a1) list;
        int i3 = 0;
        while (i < size) {
            i3 += n.a(n6a1Var.d(i));
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.q(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.q(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n6a1)) {
            int i2 = 0;
            while (i < size) {
                i2 += n.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        n6a1 n6a1Var = (n6a1) list;
        int i3 = 0;
        while (i < size) {
            i3 += n.a(n6a1Var.d(i));
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof saa1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += n.a(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(int i, Object obj, ofa1 ofa1Var) {
        int i2 = i << 3;
        if (!(obj instanceof m9a1)) {
            int q = n.q(i2);
            int b = ((m) obj).b(ofa1Var);
            return oo31.a(b, b, q);
        }
        m9a1 m9a1Var = (m9a1) obj;
        int q2 = n.q(i2);
        int length = m9a1Var.b != null ? ((zzgi) m9a1Var.b).zza.length : m9a1Var.a != null ? ((p) m9a1Var.a).h() : 0;
        return oo31.a(length, length, q2);
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n6a1)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += n.q((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        n6a1 n6a1Var = (n6a1) list;
        int i3 = 0;
        while (i < size) {
            int d = n6a1Var.d(i);
            i3 += n.q((d >> 31) ^ (d + d));
            i++;
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof saa1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += n.a((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n6a1)) {
            int i2 = 0;
            while (i < size) {
                i2 += n.q(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        n6a1 n6a1Var = (n6a1) list;
        int i3 = 0;
        while (i < size) {
            i3 += n.q(n6a1Var.d(i));
            i++;
        }
        return i3;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof saa1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += n.a(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void p(Object obj, Object obj2) {
        p pVar = (p) obj;
        pia1 pia1Var = pVar.zzc;
        pia1 pia1Var2 = ((p) obj2).zzc;
        pia1 pia1Var3 = pia1.f;
        if (!pia1Var3.equals(pia1Var2)) {
            if (pia1Var3.equals(pia1Var)) {
                int i = pia1Var.a + pia1Var2.a;
                int[] copyOf = Arrays.copyOf(pia1Var.b, i);
                System.arraycopy(pia1Var2.b, 0, copyOf, pia1Var.a, pia1Var2.a);
                Object[] copyOf2 = Arrays.copyOf(pia1Var.c, i);
                System.arraycopy(pia1Var2.c, 0, copyOf2, pia1Var.a, pia1Var2.a);
                pia1Var = new pia1(i, copyOf, copyOf2, true);
            } else {
                pia1Var.getClass();
                if (!pia1Var2.equals(pia1Var3)) {
                    if (!pia1Var.e) {
                        w511.u();
                        return;
                    }
                    int i2 = pia1Var.a + pia1Var2.a;
                    pia1Var.e(i2);
                    System.arraycopy(pia1Var2.b, 0, pia1Var.b, pia1Var.a, pia1Var2.a);
                    System.arraycopy(pia1Var2.c, 0, pia1Var.c, pia1Var.a, pia1Var2.a);
                    pia1Var.a = i2;
                }
            }
        }
        pVar.zzc = pia1Var;
    }

    public static void q(int i, List list, dxf0 dxf0Var, boolean z) {
        int i2;
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        if (list instanceof px91) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            nVar.k(i, 2);
            throw null;
        }
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i3)).booleanValue();
                nVar.m(i << 3);
                int i4 = nVar.d;
                try {
                    int i5 = i4 + 1;
                    try {
                        nVar.b[i4] = booleanValue;
                        nVar.d = i5;
                        i3++;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i4 = i5;
                        throw new zzgp(i4, nVar.c, 1, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            return;
        }
        nVar.k(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        nVar.m(i6);
        while (i3 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i3)).booleanValue();
            int i8 = nVar.d;
            try {
                i2 = i8 + 1;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
            }
            try {
                nVar.b[i8] = booleanValue2;
                nVar.d = i2;
                i3++;
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
                i8 = i2;
                throw new zzgp(i8, nVar.c, 1, e);
            }
        }
    }

    public static void r(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        if (list instanceof q1a1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            nVar.k(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        nVar.m(i3);
        while (i2 < list.size()) {
            nVar.g(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void s(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof n6a1)) {
            if (!z) {
                while (i2 < list.size()) {
                    nVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += n.a(((Integer) list.get(i4)).intValue());
            }
            nVar.m(i3);
            while (i2 < list.size()) {
                nVar.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n6a1 n6a1Var = (n6a1) list;
        if (!z) {
            while (i2 < n6a1Var.size()) {
                nVar.h(i, n6a1Var.d(i2));
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n6a1Var.size(); i6++) {
            i5 += n.a(n6a1Var.d(i6));
        }
        nVar.m(i5);
        while (i2 < n6a1Var.size()) {
            nVar.i(n6a1Var.d(i2));
            i2++;
        }
    }

    public static void t(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof n6a1)) {
            if (!z) {
                while (i2 < list.size()) {
                    nVar.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            nVar.m(i3);
            while (i2 < list.size()) {
                nVar.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n6a1 n6a1Var = (n6a1) list;
        if (!z) {
            while (i2 < n6a1Var.size()) {
                nVar.d(i, n6a1Var.d(i2));
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n6a1Var.size(); i6++) {
            n6a1Var.d(i6);
            i5 += 4;
        }
        nVar.m(i5);
        while (i2 < n6a1Var.size()) {
            nVar.e(n6a1Var.d(i2));
            i2++;
        }
    }

    public static void u(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        if (list instanceof saa1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            nVar.k(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        nVar.m(i3);
        while (i2 < list.size()) {
            nVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void v(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        if (list instanceof n4a1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            nVar.k(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        nVar.m(i3);
        while (i2 < list.size()) {
            nVar.e(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void w(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof n6a1)) {
            if (!z) {
                while (i2 < list.size()) {
                    nVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += n.a(((Integer) list.get(i4)).intValue());
            }
            nVar.m(i3);
            while (i2 < list.size()) {
                nVar.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n6a1 n6a1Var = (n6a1) list;
        if (!z) {
            while (i2 < n6a1Var.size()) {
                nVar.h(i, n6a1Var.d(i2));
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n6a1Var.size(); i6++) {
            i5 += n.a(n6a1Var.d(i6));
        }
        nVar.m(i5);
        while (i2 < n6a1Var.size()) {
            nVar.i(n6a1Var.d(i2));
            i2++;
        }
    }

    public static void x(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        if (list instanceof saa1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            nVar.k(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += n.a(((Long) list.get(i4)).longValue());
        }
        nVar.m(i3);
        while (i2 < list.size()) {
            nVar.o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void y(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof n6a1)) {
            if (!z) {
                while (i2 < list.size()) {
                    nVar.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            nVar.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            nVar.m(i3);
            while (i2 < list.size()) {
                nVar.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        n6a1 n6a1Var = (n6a1) list;
        if (!z) {
            while (i2 < n6a1Var.size()) {
                nVar.d(i, n6a1Var.d(i2));
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < n6a1Var.size(); i6++) {
            n6a1Var.d(i6);
            i5 += 4;
        }
        nVar.m(i5);
        while (i2 < n6a1Var.size()) {
            nVar.e(n6a1Var.d(i2));
            i2++;
        }
    }

    public static void z(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) dxf0Var.a;
        if (list instanceof saa1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            nVar.k(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                nVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        nVar.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        nVar.m(i3);
        while (i2 < list.size()) {
            nVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
