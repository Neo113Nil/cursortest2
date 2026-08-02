package defpackage;

import android.graphics.Paint;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class a0j {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public a0j(ar7 ar7Var, Size size) {
        Rational rational;
        this.c = ar7Var;
        this.a = ar7Var.m();
        this.b = ar7Var.d();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List r = ar7Var.r(256);
            if (r.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(r, new gvc());
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.d = rational;
        s4u s4uVar = new s4u();
        s4uVar.a = ar7Var.m();
        s4uVar.b = ar7Var.d();
        s4uVar.d = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        s4uVar.c = z;
        this.e = s4uVar;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x83.a);
        arrayList.add(x83.c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (x83.a(size, (Rational) it2.next(), vjs0.c)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static Rational c(int i, boolean z) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            return z ? x83.a : x83.b;
        }
        if (i == 1) {
            return z ? x83.c : x83.d;
        }
        sgb1.d("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static HashMap d(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = a(list).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (x83.a(size, rational, vjs0.c)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static List e(bsj0 bsj0Var, List list, Size size, int i, Rational rational, int i2, int i3) {
        s83 s83Var = bsj0Var.a;
        HashMap d = d(list);
        boolean z = rational == null || rational.getNumerator() >= rational.getDenominator();
        Rational c = c(s83Var.a, z);
        if (s83Var.b == 0) {
            Rational c2 = c(s83Var.a, z);
            Iterator it = new ArrayList(d.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational2 = (Rational) it.next();
                if (!rational2.equals(c2)) {
                    d.remove(rational2);
                }
            }
        }
        ArrayList arrayList = new ArrayList(d.keySet());
        Collections.sort(arrayList, new w83(c, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Rational rational3 = (Rational) it2.next();
            linkedHashMap.put(rational3, (List) d.get(rational3));
        }
        if (size != null) {
            Size size2 = vjs0.a;
            int height = size.getHeight() * size.getWidth();
            Iterator it3 = linkedHashMap.keySet().iterator();
            while (it3.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it3.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (vjs0.a(size3) <= height) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        csj0 csj0Var = bsj0Var.b;
        if (csj0Var != null) {
            Iterator it4 = linkedHashMap.keySet().iterator();
            while (it4.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it4.next());
                if (!list3.isEmpty()) {
                    int i4 = csj0Var.b;
                    if (csj0Var != csj0.c) {
                        Size size4 = csj0Var.a;
                        if (i4 == 0) {
                            boolean contains = list3.contains(size4);
                            list3.clear();
                            if (contains) {
                                list3.add(size4);
                            }
                        } else if (i4 == 1) {
                            f(list3, size4, true);
                        } else if (i4 == 2) {
                            f(list3, size4, false);
                        } else if (i4 == 3) {
                            g(list3, size4, true);
                        } else if (i4 == 4) {
                            g(list3, size4, false);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = linkedHashMap.values().iterator();
        while (it5.hasNext()) {
            for (Size size5 : (List) it5.next()) {
                if (!arrayList3.contains(size5)) {
                    arrayList3.add(size5);
                }
            }
        }
        xrj0 xrj0Var = bsj0Var.c;
        if (xrj0Var == null) {
            return arrayList3;
        }
        xdb1.c(xdb1.g(i), i2, i3 == 1);
        List a = xrj0Var.a(new ArrayList(arrayList3));
        if (arrayList3.containsAll(a)) {
            return a;
        }
        ny61.g("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
        return null;
    }

    public static void f(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void g(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List b(xi21 xi21Var) {
        Size[] sizeArr;
        Size size;
        int a;
        Size size2;
        Iterator it;
        Rational rational;
        ar7 ar7Var = (ar7) this.c;
        icv icvVar = (icv) xi21Var;
        List list = (List) icvVar.g(icv.z2, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null) {
            return arrayList;
        }
        bsj0 s = icvVar.s();
        List<Pair> list2 = (List) icvVar.g(icv.u2, null);
        int inputFormat = xi21Var.getInputFormat();
        if (list2 != null) {
            for (Pair pair : list2) {
                if (((Integer) pair.first).intValue() == inputFormat) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        List asList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (asList == null) {
            asList = ar7Var.r(inputFormat);
        }
        ArrayList arrayList2 = new ArrayList(asList);
        Collections.sort(arrayList2, new gvc(true));
        if (arrayList2.isEmpty()) {
            sgb1.g(5, "SupportedOutputSizesCollector");
        }
        if (s != null) {
            Size size3 = (Size) ((icv) xi21Var).g(icv.t2, null);
            int n = icvVar.n(0);
            if (!((Boolean) xi21Var.g(xi21.s4, Boolean.FALSE)).booleanValue()) {
                xi21Var.getInputFormat();
            }
            xi21Var.toString();
            arrayList2.toString();
            sgb1.g(3, "SupportedOutputSizesCollector");
            return e((bsj0) icvVar.f(icv.w2), arrayList2, size3, n, (Rational) this.d, this.a, this.b);
        }
        s4u s4uVar = (s4u) this.e;
        s4uVar.getClass();
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        Collections.sort(arrayList3, new gvc(true));
        ArrayList arrayList4 = new ArrayList();
        icv icvVar2 = (icv) xi21Var;
        Size size4 = (Size) icvVar2.g(icv.t2, null);
        Size size5 = (Size) arrayList3.get(0);
        if (size4 != null) {
            if (vjs0.a(size5) >= size4.getHeight() * size4.getWidth()) {
                size = size4;
                Size a2 = s4uVar.a(icvVar2);
                Size size6 = vjs0.c;
                a = vjs0.a(size6);
                if (vjs0.a(size) >= a) {
                    size6 = vjs0.a;
                } else if (a2 != null) {
                    if (a2.getHeight() * a2.getWidth() < a) {
                        size2 = a2;
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                            Size size7 = (Size) it.next();
                            if (vjs0.a(size7) <= size.getHeight() * size.getWidth()) {
                                if (size7.getHeight() * size7.getWidth() >= vjs0.a(size2) && !arrayList4.contains(size7)) {
                                    arrayList4.add(size7);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            s2u0.j("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = ", size2, "\nmaxSize = ", size, "\ninitial size list: ", arrayList3);
                            return null;
                        }
                        x34 x34Var = icv.m2;
                        if (icvVar2.d(x34Var)) {
                            rational = c(((Integer) icvVar2.f(x34Var)).intValue(), s4uVar.c);
                        } else {
                            Size a3 = s4uVar.a(icvVar2);
                            if (a3 != null) {
                                Iterator it2 = a(arrayList4).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        rational = new Rational(a3.getWidth(), a3.getHeight());
                                        break;
                                    }
                                    Rational rational2 = (Rational) it2.next();
                                    if (x83.a(a3, rational2, vjs0.c)) {
                                        rational = rational2;
                                        break;
                                    }
                                }
                            } else {
                                rational = null;
                            }
                        }
                        if (a2 == null) {
                            a2 = (Size) icvVar2.g(icv.s2, null);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        new HashMap();
                        if (rational == null) {
                            arrayList5.addAll(arrayList4);
                            if (a2 != null) {
                                f(arrayList5, a2, true);
                                return arrayList5;
                            }
                        } else {
                            HashMap d = d(arrayList4);
                            if (a2 != null) {
                                Iterator it3 = d.keySet().iterator();
                                while (it3.hasNext()) {
                                    f((List) d.get((Rational) it3.next()), a2, true);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList(d.keySet());
                            Collections.sort(arrayList6, new w83(rational, (Rational) s4uVar.d));
                            Iterator it4 = arrayList6.iterator();
                            while (it4.hasNext()) {
                                for (Size size8 : (List) d.get((Rational) it4.next())) {
                                    if (!arrayList5.contains(size8)) {
                                        arrayList5.add(size8);
                                    }
                                }
                            }
                        }
                        return arrayList5;
                    }
                }
                size2 = size6;
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                if (arrayList4.isEmpty()) {
                }
            }
        }
        size = size5;
        Size a22 = s4uVar.a(icvVar2);
        Size size62 = vjs0.c;
        a = vjs0.a(size62);
        if (vjs0.a(size) >= a) {
        }
        size2 = size62;
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        if (arrayList4.isEmpty()) {
        }
    }

    public a0j(zuj0 zuj0Var) {
        this.c = zuj0Var;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        this.a = ((avj0) zuj0Var).c(xrg0.destination_map_point_size);
        this.b = ((avj0) zuj0Var).a(xqg0.map_point_destination_color);
        int a = ((avj0) zuj0Var).a(xqg0.map_point_destination_color);
        this.b = a;
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint2.setColor(((avj0) zuj0Var).a(mqg0.component_white));
        paint2.setAntiAlias(true);
    }
}
