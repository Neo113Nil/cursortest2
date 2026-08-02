package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import defpackage.au50;
import defpackage.b64;
import defpackage.cor;
import defpackage.cxs0;
import defpackage.e5m;
import defpackage.fvf0;
import defpackage.j7y;
import defpackage.j96;
import defpackage.ly3;
import defpackage.p5w;
import defpackage.pqw;
import defpackage.rlz;
import defpackage.tom0;
import defpackage.tyo;
import defpackage.w511;
import defpackage.xt10;
import defpackage.zxq;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class p {
    public static final Class a;
    public static final q b;
    public static final s c;

    static {
        Class<?> cls;
        Class<?> cls2;
        fvf0 fvf0Var = fvf0.c;
        q qVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            fvf0 fvf0Var2 = fvf0.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                qVar = (q) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = qVar;
        c = new s();
    }

    public static void A(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof p5w) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                iVar.z(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += i.e((intValue2 >> 31) ^ (intValue2 << 1));
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            iVar.A((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void B(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof rlz) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                iVar.B(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += i.f((longValue2 >> 63) ^ (longValue2 << 1));
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            iVar.C((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void C(int i, List list, au50 au50Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        int i2 = 0;
        if (!(list instanceof j7y)) {
            while (i2 < list.size()) {
                iVar.w(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        j7y j7yVar = (j7y) list;
        while (i2 < list.size()) {
            Object v = j7yVar.v();
            if (v instanceof String) {
                iVar.w(i, (String) v);
            } else {
                iVar.k(i, (ByteString) v);
            }
            i2++;
        }
    }

    public static void D(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof p5w) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.e(((Integer) list.get(i4)).intValue());
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.A(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void E(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof rlz) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.f(((Long) list.get(i4)).longValue());
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.C(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof p5w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.f(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.d(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i.d(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof p5w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.f(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof rlz) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.f(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof p5w)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    i += i.e((intValue >> 31) ^ (intValue << 1));
                }
                return i;
            }
            b64.D(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof rlz)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    i += i.f((longValue >> 63) ^ (longValue << 1));
                }
                return i;
            }
            b64.D(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof p5w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.e(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof rlz) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += i.f(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static Object j(Object obj, int i, pqw pqwVar, Object obj2, q qVar) {
        return obj2;
    }

    public static void k(tyo tyoVar, Object obj, Object obj2) {
        ((j) tyoVar).getClass();
        cxs0 cxs0Var = ((GeneratedMessageLite.a) obj2).extensions.a;
        if (cxs0Var.isEmpty()) {
            return;
        }
        GeneratedMessageLite.a aVar = (GeneratedMessageLite.a) obj;
        zxq zxqVar = aVar.extensions;
        if (zxqVar.b) {
            aVar.extensions = zxqVar.clone();
        }
        aVar.extensions.getClass();
        if (cxs0Var.a.size() > 0) {
            Map.Entry c2 = cxs0Var.c(0);
            b64.D(c2.getKey());
            c2.getValue();
            throw null;
        }
        Iterator it = cxs0Var.d().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b64.D(entry.getKey());
            entry.getValue();
            throw null;
        }
    }

    public static void l(q qVar, Object obj, Object obj2) {
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

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void n(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof j96) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.i(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = i.b;
            i3++;
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void o(int i, List list, au50 au50Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        au50Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((i) au50Var.b).k(i, (ByteString) list.get(i2));
        }
    }

    public static void p(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof e5m) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                iVar.getClass();
                iVar.o(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = i.b;
            i3 += 8;
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void q(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof p5w) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.f(((Integer) list.get(i4)).intValue());
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void r(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof p5w) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = i.b;
            i3 += 4;
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void s(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof rlz) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = i.b;
            i3 += 8;
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void t(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof cor) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                iVar.getClass();
                iVar.m(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = i.b;
            i3 += 4;
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void u(int i, List list, au50 au50Var, tom0 tom0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        au50Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            au50Var.m(i, list.get(i2), tom0Var);
        }
    }

    public static void v(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof p5w) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.f(((Integer) list.get(i4)).intValue());
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void w(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof rlz) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += i.f(((Long) list.get(i4)).longValue());
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.C(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, au50 au50Var, tom0 tom0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        au50Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((i) au50Var.b).s(i, (xt10) list.get(i2), tom0Var);
        }
    }

    public static void y(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof p5w) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = i.b;
            i3 += 4;
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, au50 au50Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i iVar = (i) au50Var.b;
        if (list instanceof rlz) {
            ly3.D(list);
            if (!z) {
                throw null;
            }
            iVar.y(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                iVar.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        iVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = i.b;
            i3 += 8;
        }
        iVar.A(i3);
        while (i2 < list.size()) {
            iVar.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
