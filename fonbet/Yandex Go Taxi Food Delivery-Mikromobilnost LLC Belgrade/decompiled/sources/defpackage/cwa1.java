package defpackage;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.zzbk;
import com.yandex.mapkit.geometry.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class cwa1 {
    public static final lyy a(Typeface typeface) {
        return new lyy(new ddf(16, typeface));
    }

    public static final Point d(zzs zzsVar) {
        return new Point(zzsVar.a, zzsVar.b);
    }

    public static void e(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        s2u0.d(i, str, " operation requires ", " parameters found ", list.size());
    }

    public static void f(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        s2u0.d(i, str, " operation requires at least ", " parameters found ", list.size());
    }

    public static void g(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        s2u0.d(i, str, " operation requires at most ", " parameters found ", arrayList.size());
    }

    public static boolean h(r691 r691Var) {
        if (r691Var == null) {
            return false;
        }
        Double zzd = r691Var.zzd();
        return !zzd.isNaN() && zzd.doubleValue() >= 0.0d && zzd.equals(Double.valueOf(Math.floor(zzd.doubleValue())));
    }

    public static zzbk i(String str) {
        zzbk a = (str == null || str.isEmpty()) ? null : zzbk.a(Integer.parseInt(str));
        if (a != null) {
            return a;
        }
        ny61.g(g8e.o("Unsupported commandId ", str));
        return null;
    }

    public static boolean j(r691 r691Var, r691 r691Var2) {
        if (!r691Var.getClass().equals(r691Var2.getClass())) {
            return false;
        }
        if ((r691Var instanceof g791) || (r691Var instanceof l691)) {
            return true;
        }
        if (!(r691Var instanceof n591)) {
            return r691Var instanceof a791 ? r691Var.zzc().equals(r691Var2.zzc()) : r691Var instanceof b591 ? r691Var.zze().equals(r691Var2.zze()) : r691Var == r691Var2;
        }
        if (Double.isNaN(r691Var.zzd().doubleValue()) || Double.isNaN(r691Var2.zzd().doubleValue())) {
            return false;
        }
        return r691Var.zzd().equals(r691Var2.zzd());
    }

    public static int k(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static double l(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static Object m(r691 r691Var) {
        if (r691.A5.equals(r691Var)) {
            return null;
        }
        if (r691.z5.equals(r691Var)) {
            return "";
        }
        if (r691Var instanceof i691) {
            return n((i691) r691Var);
        }
        if (!(r691Var instanceof w491)) {
            return !r691Var.zzd().isNaN() ? r691Var.zzd() : r691Var.zzc();
        }
        ArrayList arrayList = new ArrayList();
        w491 w491Var = (w491) r691Var;
        int i = 0;
        while (i < w491Var.j()) {
            if (i >= w491Var.j()) {
                w511.i(unr0.m(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object m = m(w491Var.k(i));
            if (m != null) {
                arrayList.add(m);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap n(i691 i691Var) {
        HashMap hashMap = new HashMap();
        Iterator it = new ArrayList(i691Var.a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object m = m(i691Var.a(str));
            if (m != null) {
                hashMap.put(str, m);
            }
        }
        return hashMap;
    }

    public static void o(cr71 cr71Var) {
        int k = k(cr71Var.q("runtime.counter").zzd().doubleValue() + 1.0d);
        if (k <= 1000000) {
            cr71Var.o("runtime.counter", new n591(Double.valueOf(k)));
        } else {
            ny61.r("Instructions allowed exceeded");
        }
    }

    public boolean b(lnl0 lnl0Var) {
        return true;
    }

    public abstract void c(String str);
}
