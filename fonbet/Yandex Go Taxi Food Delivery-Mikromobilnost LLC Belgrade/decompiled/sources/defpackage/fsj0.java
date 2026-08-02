package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class fsj0 {
    public static final double h = Math.sqrt(2.3703703703703702d);
    public final Size a;
    public final Rational b;
    public final Rational c;
    public final HashSet d;
    public final a0j e;
    public final ar7 f;
    public final HashMap g;

    public fsj0(br7 br7Var, HashSet hashSet) {
        Size g = lw01.g(br7Var.f().n());
        ar7 f = br7Var.f();
        a0j a0jVar = new a0j(f, g);
        this.g = new HashMap();
        this.a = g;
        Rational rational = ((double) g.getWidth()) / ((double) g.getHeight()) > h ? x83.c : x83.a;
        g.toString();
        Objects.toString(rational);
        sgb1.g(3, "ResolutionsMerger");
        this.b = rational;
        Rational rational2 = x83.a;
        if (rational.equals(rational2)) {
            rational2 = x83.c;
        } else if (!rational.equals(x83.c)) {
            kbs.f(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.c = rational2;
        this.f = f;
        this.d = hashSet;
        this.e = a0jVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational h2 = h(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational h3 = h(size);
        if (h2.floatValue() == h3.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (h2.floatValue() > h3.floatValue()) {
                float f = width;
                float floatValue = f / h2.floatValue();
                float f2 = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, floatValue + f2);
            } else {
                float f3 = height;
                float floatValue2 = h2.floatValue() * f3;
                float f4 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, floatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean d(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final ene0 b(xi21 xi21Var, Rect rect, int i, boolean z) {
        boolean z2;
        Size size;
        Size size2;
        Pair create;
        if (lw01.d(i)) {
            z2 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            Size g = lw01.g(rect);
            Iterator it = c(xi21Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    create = Pair.create(g, g);
                    break;
                }
                Size size3 = (Size) it.next();
                Size g2 = lw01.g(a(size3, g));
                if (!d(g2, g)) {
                    create = Pair.create(size3, g2);
                    break;
                }
            }
            size = (Size) create.first;
            size2 = (Size) create.second;
        } else {
            Size g3 = lw01.g(rect);
            List c = c(xi21Var);
            Iterator it2 = c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = c.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = g3;
                            break;
                        }
                        size = (Size) it3.next();
                        if (!d(size, g3)) {
                            break;
                        }
                    }
                } else {
                    Size size4 = (Size) it2.next();
                    Rational rational = x83.a;
                    Size size5 = vjs0.c;
                    if (!x83.a(g3, rational, size5)) {
                        rational = x83.c;
                        if (!x83.a(g3, rational, size5)) {
                            rational = h(g3);
                        }
                    }
                    if (!e(rational, size4) && !d(size4, g3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = a(g3, size);
            size2 = size;
        }
        return z2 ? new ene0(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new ene0(rect, size2, size);
    }

    public final List c(xi21 xi21Var) {
        Rational rational;
        if (!this.d.contains(xi21Var)) {
            kbs.f(xi21Var, "Invalid child config: ");
            return null;
        }
        HashMap hashMap = this.g;
        if (hashMap.containsKey(xi21Var)) {
            List list = (List) hashMap.get(xi21Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> b = this.e.b(xi21Var);
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : b) {
            Iterator it = hashMap2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it.next();
                Rational rational2 = x83.a;
                if (x83.a(size, rational, vjs0.c)) {
                    break;
                }
            }
            if (rational != null) {
                Size size2 = (Size) hashMap2.get(rational);
                Objects.requireNonNull(size2);
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = h(size);
            }
            arrayList.add(size);
            hashMap2.put(rational, size);
        }
        hashMap.put(xi21Var, arrayList);
        return arrayList;
    }

    public final boolean e(Rational rational, Size size) {
        Rational rational2 = this.b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = x83.a;
        Size size2 = vjs0.c;
        if (x83.a(size, rational, size2)) {
            return false;
        }
        float floatValue = rational2.floatValue();
        float floatValue2 = rational.floatValue();
        Rational rational4 = x83.a;
        if (!x83.a(size, rational4, size2)) {
            rational4 = x83.c;
            if (!x83.a(size, rational4, size2)) {
                rational4 = h(size);
            }
        }
        float floatValue3 = rational4.floatValue();
        if (floatValue == floatValue2 || floatValue2 == floatValue3) {
            return false;
        }
        return floatValue > floatValue2 ? floatValue2 < floatValue3 : floatValue2 > floatValue3;
    }

    public final ArrayList f(List list, boolean z) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = x83.a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = x83.c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list2 = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (x83.a(size, rational3, vjs0.c)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational h2 = h(size);
                    arrayList.add(h2);
                    hashMap.put(h2, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new pzo(1, h(this.a)));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(x83.c) && !rational4.equals(x83.a)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(g(rational4, list3, z));
            }
        }
        return arrayList3;
    }

    public final ArrayList g(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = x83.a;
            if (x83.a(size, rational, vjs0.c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new gvc(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            List<Size> c = c((xi21) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : c) {
                    if (!e(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                c = arrayList3;
            }
            if (c.isEmpty()) {
                return new ArrayList();
            }
            if (c.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = c.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!d((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (c.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = c.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (d((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
