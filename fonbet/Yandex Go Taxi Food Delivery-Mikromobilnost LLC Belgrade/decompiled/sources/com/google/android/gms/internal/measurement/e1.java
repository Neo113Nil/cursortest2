package com.google.android.gms.internal.measurement;

import defpackage.a7b1;
import defpackage.dq91;
import defpackage.dxf0;
import defpackage.i9b1;
import defpackage.iva1;
import defpackage.jza1;
import defpackage.l2b1;
import defpackage.ly3;
import defpackage.n7b1;
import defpackage.nxa1;
import defpackage.oo31;
import defpackage.p3b1;
import defpackage.p5b1;
import defpackage.rra1;
import defpackage.w511;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e1 {
    public static final dq91 a;

    static {
        a7b1 a7b1Var = a7b1.c;
        a = new dq91(7);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        a1 a1Var = (a1) obj;
        i9b1 i9b1Var = a1Var.zzc;
        i9b1 i9b1Var2 = ((a1) obj2).zzc;
        i9b1 i9b1Var3 = i9b1.f;
        if (!i9b1Var3.equals(i9b1Var2)) {
            if (i9b1Var3.equals(i9b1Var)) {
                int i = i9b1Var.a + i9b1Var2.a;
                int[] copyOf = Arrays.copyOf(i9b1Var.b, i);
                System.arraycopy(i9b1Var2.b, 0, copyOf, i9b1Var.a, i9b1Var2.a);
                Object[] copyOf2 = Arrays.copyOf(i9b1Var.c, i);
                System.arraycopy(i9b1Var2.c, 0, copyOf2, i9b1Var.a, i9b1Var2.a);
                i9b1Var = new i9b1(i, copyOf, copyOf2, true);
            } else {
                i9b1Var.getClass();
                if (!i9b1Var2.equals(i9b1Var3)) {
                    if (!i9b1Var.e) {
                        w511.u();
                        return;
                    }
                    int i2 = i9b1Var.a + i9b1Var2.a;
                    i9b1Var.e(i2);
                    System.arraycopy(i9b1Var2.b, 0, i9b1Var.b, i9b1Var.a, i9b1Var2.a);
                    System.arraycopy(i9b1Var2.c, 0, i9b1Var.c, i9b1Var.a, i9b1Var2.a);
                    i9b1Var.a = i2;
                }
            }
        }
        a1Var.zzc = i9b1Var;
    }

    public static void c(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        if (list instanceof iva1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            y0Var.c(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                y0Var.h(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        y0Var.n(i3);
        while (i2 < list.size()) {
            y0Var.q(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void d(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        if (list instanceof nxa1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            y0Var.c(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                y0Var.f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        y0Var.n(i3);
        while (i2 < list.size()) {
            y0Var.o(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void e(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof p3b1)) {
            if (!z) {
                while (i2 < list.size()) {
                    y0Var.g(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y0.a(((Long) list.get(i4)).longValue());
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                y0Var.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p3b1 p3b1Var = (p3b1) list;
        if (!z) {
            while (i2 < p3b1Var.size()) {
                y0Var.g(i, p3b1Var.b(i2));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < p3b1Var.size(); i6++) {
            i5 += y0.a(p3b1Var.b(i6));
        }
        y0Var.n(i5);
        while (i2 < p3b1Var.size()) {
            y0Var.p(p3b1Var.b(i2));
            i2++;
        }
    }

    public static void f(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof p3b1)) {
            if (!z) {
                while (i2 < list.size()) {
                    y0Var.g(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y0.a(((Long) list.get(i4)).longValue());
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                y0Var.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p3b1 p3b1Var = (p3b1) list;
        if (!z) {
            while (i2 < p3b1Var.size()) {
                y0Var.g(i, p3b1Var.b(i2));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < p3b1Var.size(); i6++) {
            i5 += y0.a(p3b1Var.b(i6));
        }
        y0Var.n(i5);
        while (i2 < p3b1Var.size()) {
            y0Var.p(p3b1Var.b(i2));
            i2++;
        }
    }

    public static void g(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof p3b1)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    y0Var.g(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += y0.a((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                y0Var.p((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        p3b1 p3b1Var = (p3b1) list;
        if (!z) {
            while (i2 < p3b1Var.size()) {
                long b = p3b1Var.b(i2);
                y0Var.g(i, (b >> 63) ^ (b + b));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < p3b1Var.size(); i6++) {
            long b2 = p3b1Var.b(i6);
            i5 += y0.a((b2 >> 63) ^ (b2 + b2));
        }
        y0Var.n(i5);
        while (i2 < p3b1Var.size()) {
            long b3 = p3b1Var.b(i2);
            y0Var.p((b3 >> 63) ^ (b3 + b3));
            i2++;
        }
    }

    public static void h(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof p3b1)) {
            if (!z) {
                while (i2 < list.size()) {
                    y0Var.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                y0Var.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p3b1 p3b1Var = (p3b1) list;
        if (!z) {
            while (i2 < p3b1Var.size()) {
                y0Var.h(i, p3b1Var.b(i2));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < p3b1Var.size(); i6++) {
            p3b1Var.b(i6);
            i5 += 8;
        }
        y0Var.n(i5);
        while (i2 < p3b1Var.size()) {
            y0Var.q(p3b1Var.b(i2));
            i2++;
        }
    }

    public static void i(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof p3b1)) {
            if (!z) {
                while (i2 < list.size()) {
                    y0Var.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                y0Var.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p3b1 p3b1Var = (p3b1) list;
        if (!z) {
            while (i2 < p3b1Var.size()) {
                y0Var.h(i, p3b1Var.b(i2));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < p3b1Var.size(); i6++) {
            p3b1Var.b(i6);
            i5 += 8;
        }
        y0Var.n(i5);
        while (i2 < p3b1Var.size()) {
            y0Var.q(p3b1Var.b(i2));
            i2++;
        }
    }

    public static void j(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof jza1)) {
            if (!z) {
                while (i2 < list.size()) {
                    y0Var.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y0.a(((Integer) list.get(i4)).intValue());
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                y0Var.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jza1 jza1Var = (jza1) list;
        if (!z) {
            while (i2 < jza1Var.c) {
                y0Var.d(i, jza1Var.d(i2));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jza1Var.c; i6++) {
            i5 += y0.a(jza1Var.d(i6));
        }
        y0Var.n(i5);
        while (i2 < jza1Var.c) {
            y0Var.m(jza1Var.d(i2));
            i2++;
        }
    }

    public static void k(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof jza1)) {
            if (!z) {
                while (i2 < list.size()) {
                    y0Var.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y0.t(((Integer) list.get(i4)).intValue());
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                y0Var.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jza1 jza1Var = (jza1) list;
        if (!z) {
            while (i2 < jza1Var.c) {
                y0Var.e(i, jza1Var.d(i2));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jza1Var.c; i6++) {
            i5 += y0.t(jza1Var.d(i6));
        }
        y0Var.n(i5);
        while (i2 < jza1Var.c) {
            y0Var.n(jza1Var.d(i2));
            i2++;
        }
    }

    public static void l(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof jza1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    y0Var.e(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += y0.t((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                y0Var.n((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        jza1 jza1Var = (jza1) list;
        if (!z) {
            while (i2 < jza1Var.c) {
                int d = jza1Var.d(i2);
                y0Var.e(i, (d >> 31) ^ (d + d));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jza1Var.c; i6++) {
            int d2 = jza1Var.d(i6);
            i5 += y0.t((d2 >> 31) ^ (d2 + d2));
        }
        y0Var.n(i5);
        while (i2 < jza1Var.c) {
            int d3 = jza1Var.d(i2);
            y0Var.n((d3 >> 31) ^ (d3 + d3));
            i2++;
        }
    }

    public static void m(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof jza1)) {
            if (!z) {
                while (i2 < list.size()) {
                    y0Var.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                y0Var.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jza1 jza1Var = (jza1) list;
        if (!z) {
            while (i2 < jza1Var.c) {
                y0Var.f(i, jza1Var.d(i2));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jza1Var.c; i6++) {
            jza1Var.d(i6);
            i5 += 4;
        }
        y0Var.n(i5);
        while (i2 < jza1Var.c) {
            y0Var.o(jza1Var.d(i2));
            i2++;
        }
    }

    public static void n(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof jza1)) {
            if (!z) {
                while (i2 < list.size()) {
                    y0Var.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                y0Var.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jza1 jza1Var = (jza1) list;
        if (!z) {
            while (i2 < jza1Var.c) {
                y0Var.f(i, jza1Var.d(i2));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jza1Var.c; i6++) {
            jza1Var.d(i6);
            i5 += 4;
        }
        y0Var.n(i5);
        while (i2 < jza1Var.c) {
            y0Var.o(jza1Var.d(i2));
            i2++;
        }
    }

    public static void o(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        int i2 = 0;
        if (!(list instanceof jza1)) {
            if (!z) {
                while (i2 < list.size()) {
                    y0Var.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            y0Var.c(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += y0.a(((Integer) list.get(i4)).intValue());
            }
            y0Var.n(i3);
            while (i2 < list.size()) {
                y0Var.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jza1 jza1Var = (jza1) list;
        if (!z) {
            while (i2 < jza1Var.c) {
                y0Var.d(i, jza1Var.d(i2));
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jza1Var.c; i6++) {
            i5 += y0.a(jza1Var.d(i6));
        }
        y0Var.n(i5);
        while (i2 < jza1Var.c) {
            y0Var.m(jza1Var.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, dxf0 dxf0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y0 y0Var = (y0) dxf0Var.a;
        if (list instanceof rra1) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            y0Var.c(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                y0Var.n(i << 3);
                y0Var.l(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        y0Var.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        y0Var.n(i3);
        while (i2 < list.size()) {
            y0Var.l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p3b1)) {
            int i2 = 0;
            while (i < size) {
                i2 += y0.a(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        p3b1 p3b1Var = (p3b1) list;
        int i3 = 0;
        while (i < size) {
            i3 += y0.a(p3b1Var.b(i));
            i++;
        }
        return i3;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p3b1)) {
            int i2 = 0;
            while (i < size) {
                i2 += y0.a(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        p3b1 p3b1Var = (p3b1) list;
        int i3 = 0;
        while (i < size) {
            i3 += y0.a(p3b1Var.b(i));
            i++;
        }
        return i3;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p3b1)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += y0.a((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        p3b1 p3b1Var = (p3b1) list;
        int i3 = 0;
        while (i < size) {
            long b = p3b1Var.b(i);
            i3 += y0.a((b >> 63) ^ (b + b));
            i++;
        }
        return i3;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jza1)) {
            int i2 = 0;
            while (i < size) {
                i2 += y0.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        jza1 jza1Var = (jza1) list;
        int i3 = 0;
        while (i < size) {
            i3 += y0.a(jza1Var.d(i));
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jza1)) {
            int i2 = 0;
            while (i < size) {
                i2 += y0.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        jza1 jza1Var = (jza1) list;
        int i3 = 0;
        while (i < size) {
            i3 += y0.a(jza1Var.d(i));
            i++;
        }
        return i3;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jza1)) {
            int i2 = 0;
            while (i < size) {
                i2 += y0.t(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        jza1 jza1Var = (jza1) list;
        int i3 = 0;
        while (i < size) {
            i3 += y0.t(jza1Var.d(i));
            i++;
        }
        return i3;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jza1)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += y0.t((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        jza1 jza1Var = (jza1) list;
        int i3 = 0;
        while (i < size) {
            int d = jza1Var.d(i);
            i3 += y0.t((d >> 31) ^ (d + d));
            i++;
        }
        return i3;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y0.t(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y0.t(i << 3) + 8) * size;
    }

    public static int z(int i, Object obj, n7b1 n7b1Var) {
        int i2 = i << 3;
        if (!(obj instanceof l2b1)) {
            int t = y0.t(i2);
            int e = ((w0) ((p5b1) obj)).e(n7b1Var);
            return oo31.r(e, e, t);
        }
        l2b1 l2b1Var = (l2b1) obj;
        int t2 = y0.t(i2);
        int length = l2b1Var.b != null ? ((zzlg) l2b1Var.b).zza.length : l2b1Var.a != null ? ((a1) l2b1Var.a).m() : 0;
        return oo31.r(length, length, t2);
    }
}
