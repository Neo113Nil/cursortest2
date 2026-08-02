package com.google.android.material.carousel;

import com.google.android.material.carousel.CarouselStrategy;
import defpackage.alx;
import defpackage.b64;
import defpackage.blx;
import defpackage.mj2;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.zkx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class b {
    public final blx a;
    public final List b;
    public final List c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public b(blx blxVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = blxVar;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(arrayList2);
        float f = ((blx) unr0.k(1, arrayList)).b().a - blxVar.b().a;
        this.f = f;
        float f2 = blxVar.d().a - ((blx) unr0.k(1, arrayList2)).d().a;
        this.g = f2;
        this.d = d(f, arrayList, true);
        this.e = d(f2, arrayList2, false);
    }

    public static float[] d(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            blx blxVar = (blx) arrayList.get(i2);
            blx blxVar2 = (blx) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? blxVar2.b().a - blxVar.b().a : blxVar.d().a - blxVar2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public static blx e(blx blxVar, int i, int i2, float f, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(blxVar.c);
        arrayList.add(i2, (alx) arrayList.remove(i));
        zkx zkxVar = new zkx(blxVar.a, i5);
        float f2 = f;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            alx alxVar = (alx) arrayList.get(i6);
            float f3 = alxVar.d;
            zkxVar.b((f3 / 2.0f) + f2, alxVar.c, f3, i6 >= i3 && i6 <= i4, alxVar.e, alxVar.f, 0.0f, 0.0f);
            f2 += alxVar.d;
            i6++;
        }
        return zkxVar.d();
    }

    public static blx f(blx blxVar, float f, int i, boolean z, float f2, CarouselStrategy.StrategyType strategyType) {
        int i2 = blxVar.e;
        int i3 = blxVar.d;
        float f3 = blxVar.a;
        List list = blxVar.c;
        if (a.a[strategyType.ordinal()] != 1) {
            ArrayList arrayList = new ArrayList(list);
            zkx zkxVar = new zkx(f3, i);
            int size = z ? 0 : arrayList.size() - 1;
            int i4 = 0;
            while (i4 < arrayList.size()) {
                alx alxVar = (alx) arrayList.get(i4);
                boolean z2 = alxVar.e;
                if (z2 && i4 == size) {
                    zkxVar.b(alxVar.b, alxVar.c, alxVar.d, false, true, alxVar.f, 0.0f, 0.0f);
                } else {
                    float f4 = alxVar.b;
                    float f5 = z ? f4 + f : f4 - f;
                    float f6 = z ? f : 0.0f;
                    float f7 = z ? 0.0f : f;
                    boolean z3 = i4 >= i3 && i4 <= i2;
                    float f8 = f5;
                    float f9 = alxVar.c;
                    float f10 = alxVar.d;
                    zkxVar.b(f8, f9, f10, z3, z2, Math.abs(z ? Math.max(0.0f, ((f10 / 2.0f) + f8) - i) : Math.min(0.0f, f8 - (f10 / 2.0f))), f6, f7);
                }
                i4++;
            }
            return zkxVar.d();
        }
        ArrayList arrayList2 = new ArrayList(list);
        zkx zkxVar2 = new zkx(f3, i);
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (((alx) it.next()).e) {
                i5++;
            }
        }
        float size2 = f / (list.size() - i5);
        float f11 = z ? f : 0.0f;
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            alx alxVar2 = (alx) arrayList2.get(i6);
            if (alxVar2.e) {
                zkxVar2.b(alxVar2.b, alxVar2.c, alxVar2.d, false, true, alxVar2.f, 0.0f, 0.0f);
            } else {
                boolean z4 = i6 >= i3 && i6 <= i2;
                float f12 = alxVar2.d - size2;
                float a = CarouselStrategy.a(f12, f3, f2);
                float f13 = (f12 / 2.0f) + f11;
                float abs = Math.abs(f13 - alxVar2.b);
                zkxVar2.b(f13, a, f12, z4, false, alxVar2.f, z ? abs : 0.0f, z ? 0.0f : abs);
                f11 += f12;
            }
            i6++;
        }
        return zkxVar2.d();
    }

    public final blx a() {
        return (blx) b64.c(1, this.c);
    }

    public final blx b(float f, float f2, float f3) {
        float b;
        List list;
        float[] fArr;
        float[] fArr2;
        float f4 = this.f;
        float f5 = f2 + f4;
        float f6 = this.g;
        float f7 = f3 - f6;
        float f8 = c().a().g;
        float f9 = a().a().h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            b = mj2.b(1.0f, 0.0f, f2, f5, f);
            list = this.b;
            fArr = this.d;
        } else {
            if (f <= f7) {
                return this.a;
            }
            b = mj2.b(0.0f, 1.0f, f7, f3, f);
            list = this.c;
            fArr = this.e;
        }
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f11 = fArr[i];
            if (b <= f11) {
                fArr2 = new float[]{mj2.b(0.0f, 1.0f, f10, f11, b), i - 1, i};
                break;
            }
            i++;
            f10 = f11;
        }
        blx blxVar = (blx) list.get((int) fArr2[1]);
        blx blxVar2 = (blx) list.get((int) fArr2[2]);
        float f12 = fArr2[0];
        float f13 = blxVar.a;
        List list2 = blxVar.c;
        if (f13 != blxVar2.a) {
            ny61.g("Keylines being linearly interpolated must have the same item size.");
            return null;
        }
        List list3 = blxVar2.c;
        if (list2.size() != list3.size()) {
            ny61.g("Keylines being linearly interpolated must have the same number of keylines.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            alx alxVar = (alx) list2.get(i2);
            alx alxVar2 = (alx) list3.get(i2);
            arrayList.add(new alx(mj2.a(alxVar.a, alxVar2.a, f12), mj2.a(alxVar.b, alxVar2.b, f12), mj2.a(alxVar.c, alxVar2.c, f12), mj2.a(alxVar.d, alxVar2.d, f12), 0.0f, 0.0f, 0.0f, false));
        }
        return new blx(blxVar.a, arrayList, mj2.c(blxVar.d, blxVar2.d, f12), mj2.c(blxVar.e, blxVar2.e, f12), blxVar.f);
    }

    public final blx c() {
        return (blx) b64.c(1, this.b);
    }
}
