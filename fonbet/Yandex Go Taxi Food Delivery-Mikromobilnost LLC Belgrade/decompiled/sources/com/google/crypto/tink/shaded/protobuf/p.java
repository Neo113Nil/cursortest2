package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import defpackage.h7y;
import defpackage.n5w;
import defpackage.plz;
import defpackage.qqw;
import defpackage.rom0;
import defpackage.t3y;
import defpackage.vt10;
import defpackage.w511;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class p {
    public static final Class a;
    public static final q b;
    public static final q c;
    public static final s d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = w(false);
        c = w(true);
        d = new s();
    }

    public static void A(int i, List list, h hVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            g gVar = hVar.a;
            ByteString byteString = (ByteString) list.get(i2);
            gVar.s(i, 2);
            gVar.t(byteString.size());
            ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
            gVar.m(literalByteString.bytes, literalByteString.k(), literalByteString.size());
        }
    }

    public static void B(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                gVar.getClass();
                gVar.p(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = g.e;
            i3 += 8;
        }
        gVar.t(i3);
        while (i2 < list.size()) {
            gVar.q(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void C(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                gVar.s(i, 0);
                gVar.r(intValue);
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g.f(((Integer) list.get(i4)).intValue());
        }
        gVar.t(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            gVar.r(((Integer) list.get(i5)).intValue());
        }
    }

    public static void D(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                gVar.n(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = g.e;
            i3 += 4;
        }
        gVar.t(i3);
        while (i2 < list.size()) {
            gVar.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void E(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                gVar.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = g.e;
            i3 += 8;
        }
        gVar.t(i3);
        while (i2 < list.size()) {
            gVar.q(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void F(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                gVar.getClass();
                gVar.n(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = g.e;
            i3 += 4;
        }
        gVar.t(i3);
        while (i2 < list.size()) {
            gVar.o(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void G(int i, List list, h hVar, rom0 rom0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hVar.h(i, list.get(i2), rom0Var);
        }
    }

    public static void H(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                gVar.s(i, 0);
                gVar.r(intValue);
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g.f(((Integer) list.get(i4)).intValue());
        }
        gVar.t(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            gVar.r(((Integer) list.get(i5)).intValue());
        }
    }

    public static void I(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                gVar.u(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g.k(((Long) list.get(i4)).longValue());
        }
        gVar.t(i3);
        while (i2 < list.size()) {
            gVar.v(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void J(int i, List list, h hVar, rom0 rom0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hVar.k(i, list.get(i2), rom0Var);
        }
    }

    public static void K(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                gVar.n(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = g.e;
            i3 += 4;
        }
        gVar.t(i3);
        while (i2 < list.size()) {
            gVar.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void L(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                gVar.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = g.e;
            i3 += 8;
        }
        gVar.t(i3);
        while (i2 < list.size()) {
            gVar.q(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void M(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                gVar.s(i, 0);
                gVar.t((intValue >> 31) ^ (intValue << 1));
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += g.j((intValue2 >> 31) ^ (intValue2 << 1));
        }
        gVar.t(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue3 = ((Integer) list.get(i5)).intValue();
            gVar.t((intValue3 >> 31) ^ (intValue3 << 1));
        }
    }

    public static void N(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                gVar.u(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += g.k((longValue2 >> 63) ^ (longValue2 << 1));
        }
        gVar.t(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            gVar.v((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void O(int i, List list, h hVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        if (!(list instanceof h7y)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                gVar.s(i, 2);
                int i3 = gVar.c;
                byte[] bArr = gVar.b;
                int i4 = gVar.d;
                try {
                    int j = g.j(str.length() * 3);
                    int j2 = g.j(str.length());
                    if (j2 == j) {
                        int i5 = i4 + j2;
                        gVar.d = i5;
                        int t = u.a.t(i5, i3 - i5, str, bArr);
                        gVar.d = i4;
                        gVar.t((t - i4) - j2);
                        gVar.d = t;
                    } else {
                        gVar.t(u.b(str));
                        int i6 = gVar.d;
                        gVar.d = u.a.t(i6, i3 - i6, str, bArr);
                    }
                } catch (Utf8$UnpairedSurrogateException e) {
                    gVar.d = i4;
                    g.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(qqw.a);
                    try {
                        gVar.t(bytes.length);
                        gVar.m(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new CodedOutputStream$OutOfSpaceException(e2);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    throw new CodedOutputStream$OutOfSpaceException(e3);
                }
            }
            return;
        }
        h7y h7yVar = (h7y) list;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object m2 = h7yVar.m2(i7);
            if (m2 instanceof String) {
                String str2 = (String) m2;
                gVar.s(i, 2);
                int i8 = gVar.c;
                byte[] bArr2 = gVar.b;
                int i9 = gVar.d;
                try {
                    int j3 = g.j(str2.length() * 3);
                    int j4 = g.j(str2.length());
                    if (j4 == j3) {
                        int i10 = i9 + j4;
                        gVar.d = i10;
                        int t2 = u.a.t(i10, i8 - i10, str2, bArr2);
                        gVar.d = i9;
                        gVar.t((t2 - i9) - j4);
                        gVar.d = t2;
                    } else {
                        gVar.t(u.b(str2));
                        int i11 = gVar.d;
                        gVar.d = u.a.t(i11, i8 - i11, str2, bArr2);
                    }
                } catch (Utf8$UnpairedSurrogateException e4) {
                    gVar.d = i9;
                    g.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                    byte[] bytes2 = str2.getBytes(qqw.a);
                    try {
                        gVar.t(bytes2.length);
                        gVar.m(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e5) {
                        throw new CodedOutputStream$OutOfSpaceException(e5);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    throw new CodedOutputStream$OutOfSpaceException(e6);
                }
            } else {
                ByteString byteString = (ByteString) m2;
                gVar.s(i, 2);
                gVar.t(byteString.size());
                ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
                gVar.m(literalByteString.bytes, literalByteString.k(), literalByteString.size());
            }
        }
    }

    public static void P(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                gVar.s(i, 0);
                gVar.t(intValue);
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g.j(((Integer) list.get(i4)).intValue());
        }
        gVar.t(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            gVar.t(((Integer) list.get(i5)).intValue());
        }
    }

    public static void Q(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                gVar.u(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += g.k(((Long) list.get(i4)).longValue());
        }
        gVar.t(i3);
        while (i2 < list.size()) {
            gVar.v(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = g.i(i) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            i2 += g.b((ByteString) list.get(i3));
        }
        return i2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g.i(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n5w)) {
            int i2 = 0;
            while (i < size) {
                i2 += g.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        n5w n5wVar = (n5w) list;
        int i3 = 0;
        while (i < size) {
            i3 += g.f(n5wVar.d(i));
            i++;
        }
        return i3;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g.c(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g.d(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g.i(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n5w)) {
            int i2 = 0;
            while (i < size) {
                i2 += g.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        n5w n5wVar = (n5w) list;
        int i3 = 0;
        while (i < size) {
            i3 += g.f(n5wVar.d(i));
            i++;
        }
        return i3;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (g.i(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof plz)) {
            int i2 = 0;
            while (i < size) {
                i2 += g.k(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        plz plzVar = (plz) list;
        int i3 = 0;
        while (i < size) {
            i3 += g.k(plzVar.d(i));
            i++;
        }
        return i3;
    }

    public static int l(int i, Object obj, rom0 rom0Var) {
        if (obj instanceof t3y) {
            return g.g((t3y) obj) + g.i(i);
        }
        int i2 = g.i(i);
        int b2 = ((a) ((vt10) obj)).b(rom0Var);
        return g.j(b2) + b2 + i2;
    }

    public static int m(int i, List list, rom0 rom0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = g.i(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof t3y) {
                i2 = g.g((t3y) obj) + i2;
            } else {
                int b2 = ((a) ((vt10) obj)).b(rom0Var);
                i2 = g.j(b2) + b2 + i2;
            }
        }
        return i2;
    }

    public static int n(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g.i(i) * size) + o(list);
    }

    public static int o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n5w)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += g.j((intValue >> 31) ^ (intValue << 1));
                i++;
            }
            return i2;
        }
        n5w n5wVar = (n5w) list;
        int i3 = 0;
        while (i < size) {
            int d2 = n5wVar.d(i);
            i3 += g.j((d2 >> 31) ^ (d2 << 1));
            i++;
        }
        return i3;
    }

    public static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g.i(i) * size) + q(list);
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof plz)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += g.k((longValue >> 63) ^ (longValue << 1));
                i++;
            }
            return i2;
        }
        plz plzVar = (plz) list;
        int i3 = 0;
        while (i < size) {
            long d2 = plzVar.d(i);
            i3 += g.k((d2 >> 63) ^ (d2 << 1));
            i++;
        }
        return i3;
    }

    public static int r(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = g.i(i) * size;
        if (!(list instanceof h7y)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof ByteString) {
                    int size2 = ((ByteString) obj).size();
                    i3 = g.j(size2) + size2 + i3;
                } else {
                    i3 = g.h((String) obj) + i3;
                }
                i2++;
            }
            return i3;
        }
        h7y h7yVar = (h7y) list;
        while (i2 < size) {
            Object m2 = h7yVar.m2(i2);
            if (m2 instanceof ByteString) {
                int size3 = ((ByteString) m2).size();
                i3 = g.j(size3) + size3 + i3;
            } else {
                i3 = g.h((String) m2) + i3;
            }
            i2++;
        }
        return i3;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g.i(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n5w)) {
            int i2 = 0;
            while (i < size) {
                i2 += g.j(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        n5w n5wVar = (n5w) list;
        int i3 = 0;
        while (i < size) {
            i3 += g.j(n5wVar.d(i));
            i++;
        }
        return i3;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g.i(i) * size) + v(list);
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof plz)) {
            int i2 = 0;
            while (i < size) {
                i2 += g.k(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        plz plzVar = (plz) list;
        int i3 = 0;
        while (i < size) {
            i3 += g.k(plzVar.d(i));
            i++;
        }
        return i3;
    }

    public static q w(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (q) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void x(q qVar, Object obj, Object obj2) {
        ((s) qVar).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        r rVar = generatedMessageLite.unknownFields;
        r rVar2 = ((GeneratedMessageLite) obj2).unknownFields;
        r rVar3 = r.f;
        if (!rVar3.equals(rVar2)) {
            if (rVar3.equals(rVar)) {
                int i = rVar.a + rVar2.a;
                int[] copyOf = Arrays.copyOf(rVar.b, i);
                System.arraycopy(rVar2.b, 0, copyOf, rVar.a, rVar2.a);
                Object[] copyOf2 = Arrays.copyOf(rVar.c, i);
                System.arraycopy(rVar2.c, 0, copyOf2, rVar.a, rVar2.a);
                rVar = new r(i, copyOf, copyOf2, true);
            } else {
                rVar.getClass();
                if (!rVar2.equals(rVar3)) {
                    if (!rVar.e) {
                        w511.u();
                        return;
                    }
                    int i2 = rVar.a + rVar2.a;
                    rVar.a(i2);
                    System.arraycopy(rVar2.b, 0, rVar.b, rVar.a, rVar2.a);
                    System.arraycopy(rVar2.c, 0, rVar.c, rVar.a, rVar2.a);
                    rVar.a = i2;
                }
            }
        }
        generatedMessageLite.unknownFields = rVar;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(int i, List list, h hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g gVar = hVar.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                gVar.s(i, 0);
                gVar.l(booleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        gVar.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = g.e;
            i3++;
        }
        gVar.t(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            gVar.l(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }
}
