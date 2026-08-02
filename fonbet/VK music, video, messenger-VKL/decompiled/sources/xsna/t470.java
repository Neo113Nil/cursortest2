package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.q630;

/* compiled from: HitPathTracker.kt */
/* loaded from: classes11.dex */
public final class t470 extends g570 {
    public final q630.c c;
    public final ywk d;
    public final x500<xlb0> e;
    public androidx.compose.ui.node.o f;
    public plb0 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public t470(q630.c cVar) {
        this.c = cVar;
        ywk ywkVar = new ywk(2);
        ywkVar.c = new long[2];
        this.d = ywkVar;
        this.e = new x500<>(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // xsna.g570
    public final boolean a(x500<xlb0> x500Var, tny tnyVar, rkx rkxVar, boolean z) {
        x500<xlb0> x500Var2;
        ywk ywkVar;
        Object obj;
        boolean z2;
        boolean z3;
        plb0 plb0Var;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        xlb0 xlb0Var;
        List<w7v> list;
        tny tnyVar2 = tnyVar;
        boolean a = super.a(x500Var, tnyVar, rkxVar, z);
        ytl ytlVar = this.c;
        boolean z6 = true;
        if (ytlVar.o) {
            ?? r8 = 0;
            while (ytlVar != 0) {
                if (ytlVar instanceof cmb0) {
                    this.f = itl.d((cmb0) ytlVar, 16);
                } else if ((ytlVar.d & 16) != 0 && (ytlVar instanceof ytl)) {
                    q630.c cVar = ytlVar.q;
                    int i5 = 0;
                    ytlVar = ytlVar;
                    r8 = r8;
                    while (cVar != null) {
                        if ((cVar.d & 16) != 0) {
                            i5++;
                            r8 = r8;
                            if (i5 == 1) {
                                ytlVar = cVar;
                            } else {
                                if (r8 == 0) {
                                    r8 = new ci50(new q630.c[16]);
                                }
                                if (ytlVar != 0) {
                                    r8.b(ytlVar);
                                    ytlVar = 0;
                                }
                                r8.b(cVar);
                            }
                        }
                        cVar = cVar.g;
                        ytlVar = ytlVar;
                        r8 = r8;
                    }
                    if (i5 == 1) {
                    }
                }
                ytlVar = itl.b(r8);
            }
            if (this.f != null) {
                int size = x500Var.size();
                int i6 = 0;
                while (true) {
                    x500Var2 = this.e;
                    ywkVar = this.d;
                    if (i6 >= size) {
                        break;
                    }
                    long keyAt = x500Var.keyAt(i6);
                    xlb0 valueAt = x500Var.valueAt(i6);
                    if (ywkVar.e(keyAt)) {
                        boolean z7 = z6;
                        long j = valueAt.g;
                        long j2 = valueAt.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            ArrayList arrayList = new ArrayList(valueAt.b().size());
                            List<w7v> b = valueAt.b();
                            z4 = a;
                            int size2 = b.size();
                            i3 = size;
                            int i7 = 0;
                            while (i7 < size2) {
                                int i8 = size2;
                                w7v w7vVar = b.get(i7);
                                long j3 = keyAt;
                                long j4 = w7vVar.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    xlb0Var = valueAt;
                                    list = b;
                                    i4 = i7;
                                    arrayList.add(new w7v(w7vVar.a, this.f.S(tnyVar2, j4), w7vVar.d, w7vVar.c, w7vVar.e));
                                } else {
                                    i4 = i7;
                                    xlb0Var = valueAt;
                                    list = b;
                                }
                                i7 = i4 + 1;
                                b = list;
                                size2 = i8;
                                keyAt = j3;
                                valueAt = xlb0Var;
                            }
                            long j5 = keyAt;
                            xlb0 xlb0Var2 = new xlb0(valueAt.a, valueAt.b, this.f.S(tnyVar2, j2), valueAt.d, valueAt.e, valueAt.f, this.f.S(tnyVar2, j), valueAt.h, valueAt.i, arrayList, valueAt.j, valueAt.k, valueAt.l, valueAt.n);
                            xlb0 xlb0Var3 = valueAt.q;
                            if (xlb0Var3 == null) {
                                xlb0Var3 = valueAt;
                            }
                            xlb0Var2.q = xlb0Var3;
                            xlb0 xlb0Var4 = valueAt.q;
                            if (xlb0Var4 != null) {
                                valueAt = xlb0Var4;
                            }
                            xlb0Var2.q = valueAt;
                            x500Var2.put(j5, xlb0Var2);
                        } else {
                            z4 = a;
                            i3 = size;
                            z5 = z7;
                        }
                    } else {
                        z4 = a;
                        i3 = size;
                        z5 = z6;
                    }
                    i6++;
                    tnyVar2 = tnyVar;
                    size = i3;
                    z6 = z5;
                    a = z4;
                }
                boolean z8 = a;
                boolean z9 = z6;
                if (x500Var2.isEmpty()) {
                    ywkVar.b = 0;
                    this.a.g();
                    return z9;
                }
                int i9 = ywkVar.b;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    if (!x500Var.containsKey(((long[]) ywkVar.c)[i9]) && i9 < (i2 = ywkVar.b)) {
                        int i10 = i2 - 1;
                        int i11 = i9;
                        while (i11 < i10) {
                            long[] jArr = (long[]) ywkVar.c;
                            int i12 = i11 + 1;
                            jArr[i11] = jArr[i12];
                            i11 = i12;
                        }
                        ywkVar.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(x500Var2.size());
                int size3 = x500Var2.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    arrayList2.add(x500Var2.valueAt(i13));
                }
                plb0 plb0Var2 = new plb0(arrayList2, rkxVar);
                int size4 = arrayList2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i14);
                    if (rkxVar.a(((xlb0) obj).a)) {
                        break;
                    }
                    i14++;
                }
                xlb0 xlb0Var5 = (xlb0) obj;
                if (xlb0Var5 != null) {
                    boolean z10 = xlb0Var5.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z10 || xlb0Var5.h)) {
                            long j6 = this.f.d;
                            long j7 = xlb0Var5.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                            int i15 = (int) (j6 >> 32);
                            this.i = !((intBitsToFloat2 > ((float) ((int) (j6 & 4294967295L))) ? z9 : false) | (intBitsToFloat > ((float) i15) ? z9 : false) | (intBitsToFloat < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? z9 : false) | (intBitsToFloat2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z11 = this.i;
                    boolean z12 = this.h;
                    if (z11 == z12 || !((i = plb0Var2.f) == 3 || i == 4 || i == 5)) {
                        int i16 = plb0Var2.f;
                        if (i16 == 4 && z12 && !this.j) {
                            plb0Var2.f = 3;
                        } else if (i16 == 5 && z11 && z10) {
                            plb0Var2.f = 3;
                        }
                    } else {
                        plb0Var2.f = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && plb0Var2.f == 3 && (plb0Var = this.g) != null) {
                    List<xlb0> list2 = plb0Var.a;
                    int size5 = list2.size();
                    List<xlb0> list3 = plb0Var2.a;
                    if (size5 == list3.size()) {
                        int size6 = list3.size();
                        for (?? r6 = z2; r6 < size6; r6++) {
                            if (ov70.c(list2.get(r6).c, list3.get(r6).c)) {
                            }
                        }
                        z3 = z2;
                        this.g = plb0Var2;
                        return z3;
                    }
                }
                z3 = z9;
                this.g = plb0Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // xsna.g570
    public final void b(rkx rkxVar) {
        super.b(rkxVar);
        plb0 plb0Var = this.g;
        if (plb0Var == null) {
            return;
        }
        this.h = this.i;
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            xlb0 xlb0Var = list.get(i);
            boolean z = xlb0Var.d;
            long j = xlb0Var.a;
            boolean a = rkxVar.a(j);
            boolean z2 = this.i;
            if ((!z && !a) || (!z && !z2)) {
                this.d.g(j);
            }
        }
        this.i = false;
        this.j = plb0Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [xsna.ci50] */
    public final void c() {
        ci50<t470> ci50Var = this.a;
        t470[] t470VarArr = ci50Var.b;
        int i = ci50Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            t470VarArr[i2].c();
        }
        ytl ytlVar = this.c;
        ?? r3 = 0;
        while (ytlVar != 0) {
            if (ytlVar instanceof cmb0) {
                ((cmb0) ytlVar).h1();
            } else if ((ytlVar.d & 16) != 0 && (ytlVar instanceof ytl)) {
                q630.c cVar = ytlVar.q;
                int i3 = 0;
                ytlVar = ytlVar;
                r3 = r3;
                while (cVar != null) {
                    if ((cVar.d & 16) != 0) {
                        i3++;
                        r3 = r3;
                        if (i3 == 1) {
                            ytlVar = cVar;
                        } else {
                            if (r3 == 0) {
                                r3 = new ci50(new q630.c[16]);
                            }
                            if (ytlVar != 0) {
                                r3.b(ytlVar);
                                ytlVar = 0;
                            }
                            r3.b(cVar);
                        }
                    }
                    cVar = cVar.g;
                    ytlVar = ytlVar;
                    r3 = r3;
                }
                if (i3 == 1) {
                }
            }
            ytlVar = itl.b(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(rkx rkxVar) {
        Object[] objArr;
        LayoutNode layoutNode;
        x500<xlb0> x500Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (!x500Var.isEmpty()) {
            q630.c cVar = this.c;
            if (cVar.o) {
                androidx.compose.ui.node.o oVar = cVar.i;
                if ((oVar == null || (layoutNode = oVar.q) == null) ? false : layoutNode.g()) {
                    plb0 plb0Var = this.g;
                    long j = this.f.d;
                    q630.c cVar2 = cVar;
                    ci50 ci50Var = null;
                    while (cVar2 != null) {
                        if (cVar2 instanceof cmb0) {
                            ((cmb0) cVar2).H(plb0Var, PointerEventPass.Final, j);
                            objArr = false;
                        } else {
                            objArr = true;
                        }
                        if (objArr != false) {
                            if (((cVar2.d & 16) != 0) != false && (cVar2 instanceof ytl)) {
                                int i = 0;
                                for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                    if (((cVar3.d & 16) != 0) != false) {
                                        i++;
                                        if (i == 1) {
                                            cVar2 = cVar3;
                                        } else {
                                            if (ci50Var == null) {
                                                ci50Var = new ci50(new q630.c[16]);
                                            }
                                            if (cVar2 != null) {
                                                ci50Var.b(cVar2);
                                                cVar2 = null;
                                            }
                                            ci50Var.b(cVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                        }
                        cVar2 = itl.b(ci50Var);
                    }
                    if (cVar.o) {
                        ci50<t470> ci50Var2 = this.a;
                        t470[] t470VarArr = ci50Var2.b;
                        int i2 = ci50Var2.d;
                        for (int i3 = 0; i3 < i2; i3++) {
                            t470VarArr[i3].d(rkxVar);
                        }
                    }
                    z = true;
                }
            }
        }
        b(rkxVar);
        x500Var.clear();
        this.f = null;
        return z;
    }

    public final boolean e(rkx rkxVar, boolean z) {
        boolean z2;
        boolean z3;
        LayoutNode layoutNode;
        if (!this.e.isEmpty()) {
            q630.c cVar = this.c;
            if (cVar.o) {
                androidx.compose.ui.node.o oVar = cVar.i;
                if ((oVar == null || (layoutNode = oVar.q) == null) ? false : layoutNode.g()) {
                    plb0 plb0Var = this.g;
                    long j = this.f.d;
                    q630.c cVar2 = cVar;
                    ci50 ci50Var = null;
                    while (cVar2 != null) {
                        if (cVar2 instanceof cmb0) {
                            ((cmb0) cVar2).H(plb0Var, PointerEventPass.Initial, j);
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            if (((cVar2.d & 16) != 0) && (cVar2 instanceof ytl)) {
                                int i = 0;
                                for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                    if ((cVar3.d & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar2 = cVar3;
                                        } else {
                                            if (ci50Var == null) {
                                                ci50Var = new ci50(new q630.c[16]);
                                            }
                                            if (cVar2 != null) {
                                                ci50Var.b(cVar2);
                                                cVar2 = null;
                                            }
                                            ci50Var.b(cVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                        }
                        cVar2 = itl.b(ci50Var);
                    }
                    if (cVar.o) {
                        ci50<t470> ci50Var2 = this.a;
                        t470[] t470VarArr = ci50Var2.b;
                        int i2 = ci50Var2.d;
                        for (int i3 = 0; i3 < i2; i3++) {
                            t470VarArr[i3].e(rkxVar, z);
                        }
                    }
                    if (cVar.o) {
                        ci50 ci50Var3 = null;
                        while (cVar != null) {
                            if (cVar instanceof cmb0) {
                                ((cmb0) cVar).H(plb0Var, PointerEventPass.Main, j);
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (((cVar.d & 16) != 0) && (cVar instanceof ytl)) {
                                    int i4 = 0;
                                    for (q630.c cVar4 = ((ytl) cVar).q; cVar4 != null; cVar4 = cVar4.g) {
                                        if ((cVar4.d & 16) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                cVar = cVar4;
                                            } else {
                                                if (ci50Var3 == null) {
                                                    ci50Var3 = new ci50(new q630.c[16]);
                                                }
                                                if (cVar != null) {
                                                    ci50Var3.b(cVar);
                                                    cVar = null;
                                                }
                                                ci50Var3.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                            }
                            cVar = itl.b(ci50Var3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, fh50<t470> fh50Var) {
        ywk ywkVar = this.d;
        if (ywkVar.e(j) && !fh50Var.b(this)) {
            ywkVar.g(j);
            this.e.remove(j);
        }
        ci50<t470> ci50Var = this.a;
        t470[] t470VarArr = ci50Var.b;
        int i = ci50Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            t470VarArr[i2].f(j, fh50Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
