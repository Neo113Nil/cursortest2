package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class ky61 extends x3 {
    public long c;
    public long[] w;
    public long[] x;

    public ky61() {
        super(18, new np81());
        this.c = -9223372036854775807L;
        this.w = new long[0];
        this.x = new long[0];
    }

    public static Serializable Ug(int i, dl81 dl81Var) {
        if (i == 8) {
            return Vg(dl81Var);
        }
        if (i == 10) {
            int v = dl81Var.v();
            ArrayList arrayList = new ArrayList(v);
            for (int i2 = 0; i2 < v; i2++) {
                Serializable Ug = Ug(dl81Var.s(), dl81Var);
                if (Ug != null) {
                    arrayList.add(Ug);
                }
            }
            return arrayList;
        }
        if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(dl81Var.o()));
            dl81Var.m(dl81Var.b + 2);
            return date;
        }
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(dl81Var.o()));
        }
        if (i == 1) {
            return Boolean.valueOf(dl81Var.s() == 1);
        }
        if (i == 2) {
            return Wg(dl81Var);
        }
        if (i != 3) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String Wg = Wg(dl81Var);
            int s = dl81Var.s();
            if (s == 9) {
                return hashMap;
            }
            Serializable Ug2 = Ug(s, dl81Var);
            if (Ug2 != null) {
                hashMap.put(Wg, Ug2);
            }
        }
    }

    public static HashMap Vg(dl81 dl81Var) {
        int v = dl81Var.v();
        HashMap hashMap = new HashMap(v);
        for (int i = 0; i < v; i++) {
            String Wg = Wg(dl81Var);
            Serializable Ug = Ug(dl81Var.s(), dl81Var);
            if (Ug != null) {
                hashMap.put(Wg, Ug);
            }
        }
        return hashMap;
    }

    public static String Wg(dl81 dl81Var) {
        int x = dl81Var.x();
        int i = dl81Var.b;
        dl81Var.m(i + x);
        return new String(dl81Var.a, i, x);
    }
}
