package com.yandex.div.internal.widget.indicator;

import defpackage.asv;
import defpackage.b6w;
import defpackage.bb1;
import defpackage.c6w;
import defpackage.ffx;
import defpackage.jb7;
import defpackage.mhs0;
import defpackage.qrv;
import defpackage.r5c;
import defpackage.sb2;
import defpackage.scc;
import defpackage.srv;
import defpackage.tcc;
import defpackage.tls;
import defpackage.trv;
import defpackage.urv;
import defpackage.vrv;
import defpackage.w511;
import defpackage.wrv;
import defpackage.y6i0;
import defpackage.ycc;
import defpackage.zrv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class a {
    public final zrv a;
    public final mhs0 b;
    public final qrv c;
    public final PagerIndicatorView d;
    public int f;
    public int g;
    public float h;
    public float i;
    public int k;
    public int l;
    public int m;
    public float n;
    public final jb7 e = new jb7(this);
    public float j = 1.0f;

    public a(zrv zrvVar, mhs0 mhs0Var, qrv qrvVar, PagerIndicatorView pagerIndicatorView) {
        this.a = zrvVar;
        this.b = mhs0Var;
        this.c = qrvVar;
        this.d = pagerIndicatorView;
        this.h = zrvVar.c.t().u();
    }

    public final void a(float f, int i) {
        boolean z;
        float f2;
        float f3;
        float f4;
        Throwable th;
        int i2;
        asv asvVar;
        boolean z2;
        float f5;
        int i3;
        jb7 jb7Var = this.e;
        ArrayList arrayList = (ArrayList) jb7Var.b;
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) jb7Var.c;
        arrayList2.clear();
        a aVar = (a) jb7Var.w;
        int i4 = aVar.f;
        PagerIndicatorView pagerIndicatorView = aVar.d;
        if (i4 <= 0) {
            return;
        }
        b6w M = ffx.M(0, i4, pagerIndicatorView);
        int i5 = M.a;
        c6w it = M.iterator();
        while (true) {
            z = true;
            f2 = 2.0f;
            f3 = 1.0f;
            if (!it.c) {
                break;
            }
            int nextInt = it.nextInt();
            qrv qrvVar = aVar.c;
            bb1 f6 = qrvVar.f(nextInt);
            float f7 = aVar.j;
            bb1 bb1Var = f6;
            if (f7 != 1.0f) {
                boolean z3 = f6 instanceof wrv;
                bb1Var = f6;
                if (z3) {
                    wrv wrvVar = (wrv) f6;
                    wrv p0 = wrv.p0(wrvVar, wrvVar.f * f7, 0.0f, 6);
                    qrvVar.d(p0.f);
                    bb1Var = p0;
                }
            }
            bb1 bb1Var2 = bb1Var;
            arrayList.add(new asv(nextInt, nextInt == i, nextInt == i5 ? bb1Var2.u() / 2.0f : ((asv) kotlin.collections.a.Z(arrayList)).c + aVar.i, bb1Var2, 1.0f));
        }
        int size = arrayList.size();
        int i6 = aVar.g;
        int i7 = aVar.k;
        if (size <= i6) {
            asv asvVar2 = (asv) kotlin.collections.a.Z(arrayList);
            f4 = (i7 / 2.0f) - (((asvVar2.d.u() / 2.0f) + asvVar2.c) / 2.0f);
        } else {
            float f8 = i7 / 2.0f;
            if (ffx.W(pagerIndicatorView)) {
                f4 = (aVar.i * f) + (f8 - (i == -1 ? 0.0f : ((asv) arrayList.get((arrayList.size() - 1) - i)).c));
            } else {
                f4 = (f8 - (i == -1 ? 0.0f : ((asv) arrayList.get(i)).c)) - (aVar.i * f);
            }
            if (aVar.g % 2 == 0) {
                f4 += aVar.i / 2.0f;
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            th = null;
            if (!it2.hasNext()) {
                break;
            }
            asv asvVar3 = (asv) it2.next();
            arrayList3.add(asv.a(asvVar3, asvVar3.c + f4, null, 0.0f, 27));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        if (arrayList4.size() > aVar.g) {
            final r5c r5cVar = new r5c(0.0f, aVar.k);
            asv asvVar4 = (asv) kotlin.collections.a.P(arrayList4);
            if (r5cVar.b(Float.valueOf(asvVar4.c - (asvVar4.d.u() / 2.0f)))) {
                asv asvVar5 = (asv) kotlin.collections.a.P(arrayList4);
                float f9 = -(asvVar5.c - (asvVar5.d.u() / 2.0f));
                Iterator it3 = arrayList4.iterator();
                int i8 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        scc.m();
                        throw null;
                    }
                    asv asvVar6 = (asv) next;
                    arrayList4.set(i8, asv.a(asvVar6, asvVar6.c + f9, null, 0.0f, 27));
                    i8 = i9;
                }
            } else {
                asv asvVar7 = (asv) kotlin.collections.a.Z(arrayList4);
                if (r5cVar.b(Float.valueOf((asvVar7.d.u() / 2.0f) + asvVar7.c))) {
                    float f10 = aVar.k;
                    asv asvVar8 = (asv) kotlin.collections.a.Z(arrayList4);
                    float u = f10 - ((asvVar8.d.u() / 2.0f) + asvVar8.c);
                    Iterator it4 = arrayList4.iterator();
                    int i10 = 0;
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            scc.m();
                            throw null;
                        }
                        asv asvVar9 = (asv) next2;
                        arrayList4.set(i10, asv.a(asvVar9, asvVar9.c + u, null, 0.0f, 27));
                        i10 = i11;
                        f2 = f2;
                    }
                }
            }
            float f11 = f2;
            ycc.w(arrayList4, new tls() { // from class: com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer$IndicatorsRibbon$relayoutVisibleItems$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(!r5cVar.b(Float.valueOf(((asv) obj).c)));
                }
            }, true);
            if (!arrayList4.isEmpty()) {
                float f12 = aVar.n;
                sb2 sb2Var = aVar.a.d;
                boolean z4 = aVar.g == 3 && !((f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1)) == 0 && ((i3 = aVar.m) == 0 || i3 == aVar.f - 1));
                Iterator it5 = arrayList4.iterator();
                int i12 = 0;
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        scc.m();
                        throw th;
                    }
                    asv asvVar10 = (asv) next3;
                    if (z4 && (i12 == 0 || i12 == scc.f(arrayList4))) {
                        z2 = z;
                        f5 = f3;
                    } else {
                        float f13 = asvVar10.c;
                        z2 = z;
                        float f14 = aVar.i + 0.0f;
                        if (f13 > f14) {
                            float f15 = aVar.k - f13;
                            f13 = f15 > f14 ? f14 : f15;
                        }
                        float c = f13 > f14 ? f3 : y6i0.c(f13 / (f14 - 0.0f), 0.0f, f3);
                        int i14 = asvVar10.a;
                        if (i14 == 0 || i14 == aVar.f - 1 || asvVar10.b) {
                            f5 = f3;
                            th = null;
                            asvVar10 = asv.a(asvVar10, 0.0f, null, c, 15);
                        } else {
                            bb1 bb1Var3 = asvVar10.d;
                            float u2 = bb1Var3.u() * c;
                            f5 = f3;
                            if (u2 <= sb2Var.t().u()) {
                                asvVar10 = asv.a(asvVar10, 0.0f, sb2Var.t(), c, 7);
                            } else if (u2 < bb1Var3.u()) {
                                if (bb1Var3 instanceof wrv) {
                                    wrv wrvVar2 = (wrv) bb1Var3;
                                    asvVar10 = asv.a(asvVar10, 0.0f, wrv.p0(wrvVar2, u2, (u2 / wrvVar2.f) * wrvVar2.g, 4), c, 7);
                                } else {
                                    if (!(bb1Var3 instanceof vrv)) {
                                        w511.b();
                                        return;
                                    }
                                    asvVar10 = asv.a(asvVar10, 0.0f, vrv.p0((bb1Var3.u() * c) / f11), c, 7);
                                }
                            }
                            th = null;
                        }
                        arrayList4.set(i12, asvVar10);
                    }
                    i12 = i13;
                    z = z2;
                    f3 = f5;
                }
                float f16 = f3;
                Iterator it6 = arrayList4.iterator();
                int i15 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i15 = -1;
                        break;
                    } else if (((asv) it6.next()).e == f16) {
                        break;
                    } else {
                        i15++;
                    }
                }
                Integer valueOf = Integer.valueOf(i15);
                if (i15 < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    ListIterator listIterator = arrayList4.listIterator(arrayList4.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            i2 = -1;
                            break;
                        } else if (((asv) listIterator.previous()).e == f16) {
                            i2 = listIterator.nextIndex();
                            break;
                        }
                    }
                    Integer valueOf2 = Integer.valueOf(i2);
                    if (i2 < 0) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        int i16 = intValue - 1;
                        int intValue2 = valueOf2.intValue() + 1;
                        Iterator it7 = arrayList4.iterator();
                        int i17 = 0;
                        while (it7.hasNext()) {
                            Object next4 = it7.next();
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                scc.m();
                                throw null;
                            }
                            asv asvVar11 = (asv) next4;
                            if (i17 < i16) {
                                asv asvVar12 = (asv) kotlin.collections.a.S(i16, arrayList4);
                                if (asvVar12 != null) {
                                    arrayList4.set(i17, asv.a(asvVar11, asvVar11.c - (aVar.i * (f16 - asvVar12.e)), null, 0.0f, 27));
                                }
                                i17 = i18;
                            }
                            if (i17 > intValue2 && (asvVar = (asv) kotlin.collections.a.S(intValue2, arrayList4)) != null) {
                                arrayList4.set(i17, asv.a(asvVar11, asvVar11.c + (aVar.i * (f16 - asvVar.e)), null, 0.0f, 27));
                                i17 = i18;
                            }
                            i17 = i18;
                        }
                    }
                }
            }
        }
        arrayList2.addAll(arrayList4);
    }

    public final void b() {
        int b;
        urv urvVar = this.a.e;
        if (urvVar instanceof srv) {
            b = (int) (this.k / ((srv) urvVar).a);
        } else {
            if (!(urvVar instanceof trv)) {
                w511.b();
                return;
            }
            b = ((trv) urvVar).b();
        }
        int i = this.f;
        if (b > i) {
            b = i;
        }
        this.g = b;
    }

    public final void c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.k = i;
        this.l = i2;
        b();
        zrv zrvVar = this.a;
        urv urvVar = zrvVar.e;
        if (urvVar instanceof srv) {
            this.i = ((srv) urvVar).a;
            this.j = 1.0f;
        } else if (urvVar instanceof trv) {
            trv trvVar = (trv) urvVar;
            float a = (trvVar.a() + this.k) / this.g;
            this.i = a;
            this.j = (a - trvVar.a()) / zrvVar.b.t().u();
        }
        this.c.a(this.i);
        this.h = i2 / 2.0f;
        a(this.n, this.m);
    }
}
