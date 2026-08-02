package defpackage;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.reprov.array.normalizer.Normalizer;

/* loaded from: classes10.dex */
public final class crr implements gl40, brr {
    public final boolean a;
    public final h43 b;
    public final k43 c;
    public final float d;
    public final vtb1 e;
    public final float f;
    public final int g;
    public final zqr h;

    public crr(boolean z, h43 h43Var, k43 k43Var, float f, vtb1 vtb1Var, float f2, int i, zqr zqrVar) {
        this.a = z;
        this.b = h43Var;
        this.c = k43Var;
        this.d = f;
        this.e = vtb1Var;
        this.f = f2;
        this.g = i;
        this.h = zqrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11, types: [T, androidx.compose.ui.layout.o] */
    /* JADX WARN: Type inference failed for: r6v42, types: [T, androidx.compose.ui.layout.o] */
    @Override // defpackage.gl40
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        x910 x910Var;
        x910 x910Var2;
        float f;
        s5w s5wVar;
        tqr tqrVar;
        sqr sqrVar;
        int i;
        int i2;
        int i3;
        char c;
        ArrayList arrayList;
        int i4;
        int height;
        int width;
        x910 x910Var3;
        x910 x910Var4;
        long j2;
        s5w s5wVar2;
        int i5;
        s5w s5wVar3;
        s5w s5wVar4;
        tqr tqrVar2;
        sqr sqrVar2;
        long a;
        long a2;
        aa10 w2;
        final crr crrVar = this;
        final int i6 = 0;
        if (crrVar.g != 0 && !((ArrayList) list).isEmpty()) {
            int h = n8e.h(j);
            final zqr zqrVar = crrVar.h;
            if (h != 0 || zqrVar.a == FlowLayoutOverflow$OverflowType.Visible) {
                List list2 = (List) a.P(list);
                if (list2.isEmpty()) {
                    w2 = kVar.w(0, 0, b.f(), new p0u(5));
                    return w2;
                }
                final int i7 = 1;
                List list3 = (List) a.S(1, list);
                x910 x910Var5 = list3 != null ? (x910) a.R(list3) : null;
                List list4 = (List) a.S(2, list);
                x910 x910Var6 = list4 != null ? (x910) a.R(list4) : null;
                list2.size();
                zqrVar.getClass();
                boolean z = crrVar.a;
                LayoutOrientation layoutOrientation = z ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
                long g = id00.g(id00.d(10, id00.c(j, layoutOrientation)), layoutOrientation);
                if (x910Var5 != null) {
                    vqr.e(x910Var5, crrVar, g, new tls() { // from class: xqr
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            int i8;
                            int i9;
                            int i10 = i6;
                            zy11 zy11Var = zy11.a;
                            int i11 = 0;
                            crr crrVar2 = crrVar;
                            zqr zqrVar2 = zqrVar;
                            o oVar = (o) obj;
                            switch (i10) {
                                case 0:
                                    if (oVar != null) {
                                        i11 = crrVar2.h(oVar);
                                        i8 = crrVar2.d(oVar);
                                    } else {
                                        i8 = 0;
                                    }
                                    zqrVar2.f = new s5w(s5w.a(i11, i8));
                                    zqrVar2.c = oVar;
                                    break;
                                default:
                                    if (oVar != null) {
                                        i11 = crrVar2.h(oVar);
                                        i9 = crrVar2.d(oVar);
                                    } else {
                                        i9 = 0;
                                    }
                                    zqrVar2.g = new s5w(s5w.a(i11, i9));
                                    zqrVar2.e = oVar;
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    zqrVar.b = x910Var5;
                }
                if (x910Var6 != null) {
                    vqr.e(x910Var6, crrVar, g, new tls() { // from class: xqr
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            int i8;
                            int i9;
                            int i10 = i7;
                            zy11 zy11Var = zy11.a;
                            int i11 = 0;
                            crr crrVar2 = crrVar;
                            zqr zqrVar2 = zqrVar;
                            o oVar = (o) obj;
                            switch (i10) {
                                case 0:
                                    if (oVar != null) {
                                        i11 = crrVar2.h(oVar);
                                        i8 = crrVar2.d(oVar);
                                    } else {
                                        i8 = 0;
                                    }
                                    zqrVar2.f = new s5w(s5w.a(i11, i8));
                                    zqrVar2.c = oVar;
                                    break;
                                default:
                                    if (oVar != null) {
                                        i11 = crrVar2.h(oVar);
                                        i9 = crrVar2.d(oVar);
                                    } else {
                                        i9 = 0;
                                    }
                                    zqrVar2.g = new s5w(s5w.a(i11, i9));
                                    zqrVar2.e = oVar;
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    zqrVar.d = x910Var6;
                }
                Iterator it = list2.iterator();
                long c2 = id00.c(j, z ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
                wz40 wz40Var = new wz40(new aa10[16]);
                int i8 = n8e.i(c2);
                int k = n8e.k(c2);
                int h2 = n8e.h(c2);
                wx40 a3 = y5w.a();
                ArrayList arrayList2 = new ArrayList();
                int ceil = (int) Math.ceil(kVar.w0(crrVar.d));
                int ceil2 = (int) Math.ceil(kVar.w0(crrVar.f));
                long a4 = p8e.a(0, i8, 0, h2);
                ArrayList arrayList3 = arrayList2;
                long g2 = id00.g(id00.d(14, a4), z ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                if (it.hasNext()) {
                    try {
                        x910Var = (x910) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        x910Var = null;
                    }
                    x910Var2 = x910Var;
                } else {
                    x910Var2 = null;
                }
                if (x910Var2 != null) {
                    if (cva1.c(cva1.b(x910Var2)) == 0.0f) {
                        cva1.b(x910Var2);
                        f = 0.0f;
                        ?? l0 = x910Var2.l0(g2);
                        ref$ObjectRef.element = l0;
                        a2 = s5w.a(crrVar.h(l0), crrVar.d(l0));
                    } else {
                        f = 0.0f;
                        int e0 = z ? x910Var2.e0(Integer.MAX_VALUE) : x910Var2.V(Integer.MAX_VALUE);
                        a2 = s5w.a(e0, z ? x910Var2.V(e0) : x910Var2.e0(e0));
                    }
                    s5wVar = new s5w(a2);
                } else {
                    f = 0.0f;
                    s5wVar = null;
                }
                Integer valueOf = s5wVar != null ? Integer.valueOf((int) (s5wVar.a >> 32)) : null;
                wz40 wz40Var2 = wz40Var;
                Integer valueOf2 = s5wVar != null ? Integer.valueOf((int) (s5wVar.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) : null;
                s5w s5wVar5 = s5wVar;
                vx40 vx40Var = new vx40((Object) null);
                x910 x910Var7 = x910Var2;
                vx40 vx40Var2 = new vx40((Object) null);
                Integer num = valueOf;
                xx40 xx40Var = new xx40((Object) null);
                int i9 = crrVar.g;
                zqr zqrVar2 = crrVar.h;
                uqr uqrVar = new uqr(i9, zqrVar2, c2, ceil, ceil2);
                tqr b = uqrVar.b(it.hasNext(), 0, s5w.a(i8, h2), s5wVar5, 0, 0, 0, false, false);
                if (b.b) {
                    tqrVar = b;
                    sqrVar = uqrVar.a(tqrVar, s5wVar5 != null, -1, 0, i8, 0);
                } else {
                    tqrVar = b;
                    sqrVar = null;
                }
                Integer num2 = valueOf2;
                int i10 = k;
                int i11 = i8;
                int i12 = ceil;
                tqr tqrVar3 = tqrVar;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = h2;
                x910 x910Var8 = x910Var7;
                crr crrVar2 = crrVar;
                while (!tqrVar3.b && x910Var8 != null) {
                    int intValue = num.intValue();
                    int intValue2 = num2.intValue();
                    xx40 xx40Var2 = xx40Var;
                    int i20 = i15 + intValue;
                    int max = Math.max(i13, intValue2);
                    int i21 = i11 - intValue;
                    int i22 = i14 + 1;
                    zqrVar2.getClass();
                    sqr sqrVar3 = sqrVar;
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(x910Var8);
                    a3.i(i14, ref$ObjectRef.element);
                    x910Var8.a();
                    int i23 = i22 - i16;
                    if (it.hasNext()) {
                        try {
                            x910Var3 = (x910) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            x910Var3 = null;
                        }
                        x910Var4 = x910Var3;
                    } else {
                        x910Var4 = null;
                    }
                    ref$ObjectRef.element = null;
                    if (x910Var4 != null) {
                        if (cva1.c(cva1.b(x910Var4)) == f) {
                            cva1.b(x910Var4);
                            ?? l02 = x910Var4.l0(g2);
                            ref$ObjectRef.element = l02;
                            j2 = g2;
                            a = s5w.a(crrVar2.h(l02), crrVar2.d(l02));
                        } else {
                            j2 = g2;
                            int e02 = z ? x910Var4.e0(Integer.MAX_VALUE) : x910Var4.V(Integer.MAX_VALUE);
                            a = s5w.a(e02, z ? x910Var4.V(e02) : x910Var4.e0(e02));
                        }
                        s5wVar2 = new s5w(a);
                    } else {
                        j2 = g2;
                        s5wVar2 = null;
                    }
                    Integer valueOf3 = s5wVar2 != null ? Integer.valueOf(((int) (s5wVar2.a >> 32)) + i12) : null;
                    Integer valueOf4 = s5wVar2 != null ? Integer.valueOf((int) (s5wVar2.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) : null;
                    boolean hasNext = it.hasNext();
                    long a5 = s5w.a(i21, i19);
                    if (s5wVar2 == null) {
                        i5 = i21;
                        s5wVar3 = s5wVar2;
                        s5wVar4 = null;
                    } else {
                        i5 = i21;
                        s5wVar3 = s5wVar2;
                        s5wVar4 = new s5w(s5w.a(valueOf3.intValue(), valueOf4.intValue()));
                    }
                    tqr b2 = uqrVar.b(hasNext, i23, a5, s5wVar4, i17, i18, max, false, false);
                    int i24 = max;
                    if (b2.a) {
                        i10 = Math.min(Math.max(i10, i20), i8);
                        int i25 = i18 + i24;
                        int i26 = i17;
                        sqrVar2 = uqrVar.a(b2, s5wVar3 != null, i26, i25, i5, i23);
                        tqrVar2 = b2;
                        vx40Var2.c(i24);
                        i19 = (h2 - i25) - ceil2;
                        vx40Var.c(i22);
                        i17 = i26 + 1;
                        i18 = i25 + ceil2;
                        i11 = i8;
                        num = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - i12) : null;
                        i16 = i22;
                        i24 = 0;
                        i15 = 0;
                    } else {
                        tqrVar2 = b2;
                        num = valueOf3;
                        sqrVar2 = sqrVar3;
                        i11 = i5;
                        i15 = i20;
                    }
                    i13 = i24;
                    tqrVar3 = tqrVar2;
                    x910Var8 = x910Var4;
                    i14 = i22;
                    arrayList3 = arrayList4;
                    xx40Var = xx40Var2;
                    sqrVar = sqrVar2;
                    num2 = valueOf4;
                    g2 = j2;
                    crrVar2 = this;
                }
                sqr sqrVar4 = sqrVar;
                xx40 xx40Var3 = xx40Var;
                ArrayList arrayList5 = arrayList3;
                if (sqrVar4 != null) {
                    long j3 = sqrVar4.c;
                    arrayList5.add(sqrVar4.a);
                    a3.i(arrayList5.size() - 1, sqrVar4.b);
                    int i27 = vx40Var.b - 1;
                    if (sqrVar4.d) {
                        vx40Var2.f(i27, Math.max(vx40Var2.a(i27), (int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                        vx40Var.f(i27, vx40Var.b() + 1);
                    } else {
                        vx40Var2.c((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        vx40Var.c(vx40Var.b() + 1);
                    }
                }
                int size = arrayList5.size();
                o[] oVarArr = new o[size];
                for (int i28 = 0; i28 < size; i28++) {
                    oVarArr[i28] = a3.b(i28);
                }
                int i29 = vx40Var.b;
                int[] iArr = new int[i29];
                int[] iArr2 = new int[i29];
                int[] iArr3 = vx40Var.a;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                while (i31 < i29) {
                    int i33 = iArr3[i31];
                    int a6 = vx40Var2.a(i31);
                    xx40 xx40Var4 = xx40Var3;
                    if (xx40Var4.c(i31)) {
                        arrayList = arrayList5;
                        i4 = i10;
                        c = Normalizer.DONE;
                    } else {
                        int h3 = n8e.h(a4);
                        c = Normalizer.DONE;
                        if (h3 == Integer.MAX_VALUE) {
                            arrayList = arrayList5;
                            i4 = i10;
                            a6 = Integer.MAX_VALUE;
                        } else {
                            a6 = n8e.h(a4) - i32;
                            arrayList = arrayList5;
                            i4 = i10;
                        }
                    }
                    xx40Var3 = xx40Var4;
                    vx40 vx40Var3 = vx40Var2;
                    int i34 = i12;
                    wz40 wz40Var3 = wz40Var2;
                    int[] iArr4 = iArr3;
                    aa10 b3 = jva1.b(this, i4, n8e.j(a4), n8e.i(a4), a6, i34, kVar, arrayList, oVarArr, i30, i33, iArr, i31);
                    int i35 = i4;
                    if (z) {
                        height = b3.getWidth();
                        width = b3.getHeight();
                    } else {
                        height = b3.getHeight();
                        width = b3.getWidth();
                    }
                    iArr2[i31] = width;
                    i32 += width;
                    int max2 = Math.max(i35, height);
                    wz40Var3.b(b3);
                    i31++;
                    i10 = max2;
                    arrayList5 = arrayList;
                    i30 = i33;
                    wz40Var2 = wz40Var3;
                    iArr3 = iArr4;
                    vx40Var2 = vx40Var3;
                    i12 = i34;
                }
                int i36 = i10;
                wz40 wz40Var4 = wz40Var2;
                if (wz40Var4.c == 0) {
                    i2 = 0;
                    i = 0;
                } else {
                    i = i36;
                    i2 = i32;
                }
                if (z) {
                    k43 k43Var = this.c;
                    int d = g8e.d(wz40Var4.c, 1, kVar.f0(k43Var.b()), i2);
                    int j4 = n8e.j(c2);
                    i3 = n8e.h(c2);
                    if (d < j4) {
                        d = j4;
                    }
                    if (d <= i3) {
                        i3 = d;
                    }
                    k43Var.m(kVar, i3, iArr2, iArr);
                } else {
                    h43 h43Var = this.b;
                    int d2 = g8e.d(wz40Var4.c, 1, kVar.f0(h43Var.b()), i2);
                    int j5 = n8e.j(c2);
                    int h4 = n8e.h(c2);
                    if (d2 < j5) {
                        d2 = j5;
                    }
                    if (d2 > h4) {
                        d2 = h4;
                    }
                    h43Var.u(kVar, d2, iArr2, kVar.getLayoutDirection(), iArr);
                    i3 = d2;
                }
                int k2 = n8e.k(c2);
                int i37 = n8e.i(c2);
                if (i < k2) {
                    i = k2;
                }
                if (i <= i37) {
                    i37 = i;
                }
                if (z) {
                    int i38 = i3;
                    i3 = i37;
                    i37 = i38;
                }
                return kVar.w(i3, i37, b.f(), new s1r(8, wz40Var4));
            }
        }
        w = kVar.w(0, 0, b.f(), new p0u(5));
        return w;
    }

    @Override // defpackage.gl40
    public final int e(yuw yuwVar, List list, int i) {
        List list2 = (List) a.S(1, list);
        x910 x910Var = list2 != null ? (x910) a.R(list2) : null;
        List list3 = (List) a.S(2, list);
        this.h.b(x910Var, list3 != null ? (x910) a.R(list3) : null, this.a, p8e.b(0, 0, 0, i, 7));
        boolean z = this.a;
        float f = this.d;
        List list4 = EmptyList.a;
        if (!z) {
            List list5 = (List) a.R(list);
            return k(list5 == null ? list4 : list5, i, yuwVar.f0(f), yuwVar.f0(this.f), this.g, this.h);
        }
        List list6 = (List) a.R(list);
        if (list6 != null) {
            list4 = list6;
        }
        return l(i, yuwVar.f0(f), list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crr)) {
            return false;
        }
        crr crrVar = (crr) obj;
        return this.a == crrVar.a && this.b.equals(crrVar.b) && this.c.equals(crrVar.c) && y7m.b(this.d, crrVar.d) && this.e.equals(crrVar.e) && y7m.b(this.f, crrVar.f) && this.g == crrVar.g && jl40.l(this.h, crrVar.h);
    }

    @Override // defpackage.gl40
    public final int f(yuw yuwVar, List list, int i) {
        List list2 = (List) a.S(1, list);
        x910 x910Var = list2 != null ? (x910) a.R(list2) : null;
        List list3 = (List) a.S(2, list);
        this.h.b(x910Var, list3 != null ? (x910) a.R(list3) : null, this.a, p8e.b(0, 0, 0, i, 7));
        boolean z = this.a;
        float f = this.f;
        float f2 = this.d;
        List list4 = EmptyList.a;
        if (z) {
            List list5 = (List) a.R(list);
            return m(list5 == null ? list4 : list5, i, yuwVar.f0(f2), yuwVar.f0(f), this.g, this.h);
        }
        List list6 = (List) a.R(list);
        if (list6 != null) {
            list4 = list6;
        }
        return k(list4, i, yuwVar.f0(f2), yuwVar.f0(f), this.g, this.h);
    }

    @Override // defpackage.gl40
    public final int g(yuw yuwVar, List list, int i) {
        List list2 = (List) a.S(1, list);
        x910 x910Var = list2 != null ? (x910) a.R(list2) : null;
        List list3 = (List) a.S(2, list);
        this.h.b(x910Var, list3 != null ? (x910) a.R(list3) : null, this.a, p8e.b(0, i, 0, 0, 13));
        boolean z = this.a;
        float f = this.d;
        List list4 = EmptyList.a;
        if (z) {
            List list5 = (List) a.R(list);
            return k(list5 == null ? list4 : list5, i, yuwVar.f0(f), yuwVar.f0(this.f), this.g, this.h);
        }
        List list6 = (List) a.R(list);
        if (list6 != null) {
            list4 = list6;
        }
        return l(i, yuwVar.f0(f), list4);
    }

    public final int hashCode() {
        return this.h.hashCode() + oyr.b(Integer.MAX_VALUE, oyr.b(this.g, g8e.c(this.f, (this.e.hashCode() + g8e.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // defpackage.gl40
    public final int i(yuw yuwVar, List list, int i) {
        List list2 = (List) a.S(1, list);
        x910 x910Var = list2 != null ? (x910) a.R(list2) : null;
        List list3 = (List) a.S(2, list);
        this.h.b(x910Var, list3 != null ? (x910) a.R(list3) : null, this.a, p8e.b(0, i, 0, 0, 13));
        boolean z = this.a;
        float f = this.f;
        float f2 = this.d;
        List list4 = EmptyList.a;
        if (z) {
            List list5 = (List) a.R(list);
            return k(list5 == null ? list4 : list5, i, yuwVar.f0(f2), yuwVar.f0(f), this.g, this.h);
        }
        List list6 = (List) a.R(list);
        if (list6 != null) {
            list4 = list6;
        }
        return m(list4, i, yuwVar.f0(f2), yuwVar.f0(f), this.g, this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int k(List list, int i, int i2, int i3, int i4, zqr zqrVar) {
        int i5;
        long a;
        int i6;
        int i7 = 0;
        if (list.isEmpty()) {
            a = s5w.a(0, 0);
        } else {
            int i8 = Integer.MAX_VALUE;
            uqr uqrVar = new uqr(i4, zqrVar, p8e.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            x910 x910Var = (x910) a.S(0, list);
            boolean z = this.a;
            int V = x910Var != null ? z ? x910Var.V(i) : x910Var.e0(i) : 0;
            int e0 = x910Var != null ? z ? x910Var.e0(V) : x910Var.V(V) : 0;
            boolean z2 = true;
            if (list.size() > 1) {
                i5 = 1;
            } else {
                i5 = 1;
                z2 = false;
            }
            int i9 = 0;
            if (uqrVar.b(z2, 0, s5w.a(i, Integer.MAX_VALUE), x910Var == null ? null : new s5w(s5w.a(e0, V)), 0, 0, 0, false, false).b) {
                s5w a2 = zqrVar.a(0, 0, x910Var != null ? i5 : 0);
                a = s5w.a(a2 != null ? (int) (a2.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) : 0, 0);
            } else {
                int size = list.size();
                int i10 = i;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    int i16 = i10 - e0;
                    int i17 = i11 + 1;
                    int max = Math.max(i15, V);
                    x910 x910Var2 = (x910) a.S(i17, list);
                    int V2 = x910Var2 != null ? z ? x910Var2.V(i) : x910Var2.e0(i) : i7;
                    if (x910Var2 != null) {
                        i6 = (z ? x910Var2.e0(V2) : x910Var2.V(V2)) + i2;
                    } else {
                        i6 = i7;
                    }
                    int i18 = i17 - i13;
                    boolean z3 = i11 + 2 < list.size() ? i5 : i7;
                    int i19 = i14;
                    int i20 = V2;
                    int i21 = i6;
                    tqr b = uqrVar.b(z3, i18, s5w.a(i16, i8), x910Var2 == null ? null : new s5w(s5w.a(i6, V2)), i19, i9, max, false, false);
                    if (b.a) {
                        int i22 = max + i3 + i9;
                        sqr a3 = uqrVar.a(b, x910Var2 != null, i19, i22, i16, i18);
                        int i23 = i21 - i2;
                        i14 = i19 + 1;
                        if (b.b) {
                            if (a3 != null) {
                                long j = a3.c;
                                if (!a3.d) {
                                    i22 += ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + i3;
                                }
                            }
                            i9 = i22;
                            i12 = i17;
                        } else {
                            i13 = i17;
                            i9 = i22;
                            e0 = i23;
                            i15 = 0;
                            i10 = i;
                        }
                    } else {
                        e0 = i21;
                        i10 = i16;
                        i14 = i19;
                        i15 = max;
                    }
                    i11 = i17;
                    i12 = i11;
                    V = i20;
                    i8 = Integer.MAX_VALUE;
                    i7 = 0;
                    i5 = 1;
                }
                a = s5w.a(i9 - i3, i12);
            }
        }
        return (int) (a >> 32);
    }

    public final int l(int i, int i2, List list) {
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            x910 x910Var = (x910) list.get(i3);
            int k0 = (this.a ? x910Var.k0(i) : x910Var.y(i)) + i2;
            int i7 = i3 + 1;
            if (i7 - i5 == this.g || i7 == list.size()) {
                i4 = Math.max(i4, (i6 + k0) - i2);
                i6 = 0;
                i5 = i3;
            } else {
                i6 += k0;
            }
            i3 = i7;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x006e, code lost:
    
        if (r40.a == androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[LOOP:1: B:27:0x007e->B:28:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0231 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(List list, int i, int i2, int i3, int i4, zqr zqrVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long a;
        int i12;
        int i13;
        int i14;
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType;
        int i15 = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        List list2 = list;
        int size3 = list2.size();
        for (int i16 = 0; i16 < size3; i16++) {
            x910 x910Var = (x910) list.get(i16);
            boolean z = this.a;
            int e0 = z ? x910Var.e0(i) : x910Var.V(i);
            iArr[i16] = e0;
            iArr2[i16] = z ? x910Var.V(e0) : x910Var.e0(e0);
        }
        int i17 = Integer.MAX_VALUE;
        int i18 = 1;
        if (Integer.MAX_VALUE >= list.size() || ((flowLayoutOverflow$OverflowType = zqrVar.a) != FlowLayoutOverflow$OverflowType.ExpandIndicator && flowLayoutOverflow$OverflowType != FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator)) {
            if (Integer.MAX_VALUE >= list.size()) {
                zqrVar.getClass();
            }
            i5 = 0;
            int min = Math.min(Integer.MAX_VALUE - i5, list.size());
            int i19 = 0;
            for (i6 = 0; i6 < size; i6++) {
                i19 += iArr[i6];
            }
            int size4 = ((list.size() - 1) * i2) + i19;
            if (size2 != 0) {
                ny61.p();
                return 0;
            }
            int i20 = iArr2[0];
            int i21 = size2 - 1;
            if (1 <= i21) {
                int i22 = 1;
                while (true) {
                    int i23 = iArr2[i22];
                    if (i20 < i23) {
                        i20 = i23;
                    }
                    if (i22 == i21) {
                        break;
                    }
                    i22++;
                }
            }
            if (size == 0) {
                ny61.p();
                return 0;
            }
            int i24 = iArr[0];
            int i25 = size - 1;
            if (1 <= i25) {
                int i26 = 1;
                while (true) {
                    int i27 = iArr[i26];
                    if (i24 < i27) {
                        i24 = i27;
                    }
                    if (i26 == i25) {
                        break;
                    }
                    i26++;
                }
            }
            int i28 = i24;
            int i29 = size4;
            while (i28 <= i29 && i20 != i) {
                int i30 = (i28 + i29) / 2;
                if (list.isEmpty()) {
                    a = s5w.a(i15, i15);
                    i7 = i28;
                    i8 = i29;
                    i9 = i30;
                } else {
                    i7 = i28;
                    i8 = i29;
                    uqr uqrVar = new uqr(i4, zqrVar, p8e.a(i15, i30, i15, i17), i2, i3);
                    x910 x910Var2 = (x910) a.S(i15, list);
                    int i31 = x910Var2 != null ? iArr2[i15] : i15;
                    int i32 = x910Var2 != null ? iArr[i15] : i15;
                    i9 = i30;
                    int i33 = 0;
                    int i34 = 0;
                    if (uqrVar.b(list.size() > i18 ? i18 : i15, 0, s5w.a(i30, i17), x910Var2 == null ? null : new s5w(s5w.a(i32, i31)), 0, 0, 0, false, false).b) {
                        s5w a2 = zqrVar.a(i15, i15, x910Var2 != null ? i18 : i15);
                        a = s5w.a(a2 != null ? (int) (a2.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) : i15, i15);
                    } else {
                        int size5 = list2.size();
                        int i35 = i15;
                        int i36 = i35;
                        int i37 = i36;
                        int i38 = 0;
                        int i39 = i9;
                        while (true) {
                            int i40 = i34;
                            if (i35 >= size5) {
                                i10 = i15;
                                i11 = i36;
                                break;
                            }
                            i39 -= i32;
                            i11 = i35 + 1;
                            i34 = Math.max(i40, i31);
                            x910 x910Var3 = (x910) a.S(i11, list);
                            int i41 = x910Var3 != null ? iArr2[i11] : i15;
                            if (x910Var3 != null) {
                                i10 = i15;
                                i15 = iArr[i11] + i2;
                            } else {
                                i10 = i15;
                            }
                            int i42 = i11 - i37;
                            int i43 = i38;
                            tqr b = uqrVar.b(i35 + 2 < list.size() ? 1 : i10, i42, s5w.a(i39, i17), x910Var3 == null ? null : new s5w(s5w.a(i15, i41)), i43, i33, i34, false, false);
                            if (b.a) {
                                int i44 = i34 + i3 + i33;
                                sqr a3 = uqrVar.a(b, x910Var3 != null ? 1 : i10, i43, i44, i39, i42);
                                i15 -= i2;
                                i38 = i43 + 1;
                                if (b.b) {
                                    if (a3 != null) {
                                        long j = a3.c;
                                        if (!a3.d) {
                                            i44 = ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + i3 + i44;
                                        }
                                    }
                                    i33 = i44;
                                } else {
                                    i37 = i11;
                                    i33 = i44;
                                    i39 = i9;
                                    i34 = i10;
                                }
                            } else {
                                i38 = i43;
                            }
                            i35 = i11;
                            i36 = i35;
                            i31 = i41;
                            i32 = i15;
                            i15 = i10;
                            i17 = Integer.MAX_VALUE;
                        }
                        a = s5w.a(i33 - i3, i11);
                        i12 = (int) (a >> 32);
                        int i45 = (int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        if (i12 <= i || i45 < min) {
                            i13 = i9 + 1;
                            i14 = i8;
                            if (i13 <= i14) {
                                return i13;
                            }
                            i20 = i12;
                            i28 = i13;
                            i29 = i14;
                        } else {
                            if (i12 >= i) {
                                return i9;
                            }
                            i29 = i9 - 1;
                            i20 = i12;
                            i28 = i7;
                        }
                        size4 = i9;
                        i15 = i10;
                        i17 = Integer.MAX_VALUE;
                        i18 = 1;
                    }
                }
                i10 = i15;
                i12 = (int) (a >> 32);
                int i452 = (int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                if (i12 <= i) {
                }
                i13 = i9 + 1;
                i14 = i8;
                if (i13 <= i14) {
                }
            }
            return size4;
        }
        i5 = 1;
        int min2 = Math.min(Integer.MAX_VALUE - i5, list.size());
        int i192 = 0;
        while (i6 < size) {
        }
        int size42 = ((list.size() - 1) * i2) + i192;
        if (size2 != 0) {
        }
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.a + ", horizontalArrangement=" + this.b + ", verticalArrangement=" + this.c + ", mainAxisSpacing=" + ((Object) y7m.c(this.d)) + ", crossAxisAlignment=" + this.e + ", crossAxisArrangementSpacing=" + ((Object) y7m.c(this.f)) + ", maxItemsInMainAxis=" + this.g + ", maxLines=2147483647, overflow=" + this.h + ')';
    }
}
