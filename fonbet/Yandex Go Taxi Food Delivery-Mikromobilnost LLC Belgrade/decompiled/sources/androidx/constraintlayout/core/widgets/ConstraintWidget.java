package androidx.constraintlayout.core.widgets;

import android.view.View;
import defpackage.b64;
import defpackage.b7e;
import defpackage.g8e;
import defpackage.h8e;
import defpackage.i63;
import defpackage.ijy;
import defpackage.n89;
import defpackage.ny61;
import defpackage.oc20;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.ua7;
import defpackage.x4e;
import defpackage.z7t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final b7e J;
    public final b7e K;
    public final b7e L;
    public final b7e M;
    public final b7e N;
    public final b7e O;
    public final b7e P;
    public final b7e Q;
    public final b7e[] R;
    public final ArrayList S;
    public final boolean[] T;
    public DimensionBehaviour[] U;
    public ConstraintWidget V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public int a0;
    public n89 b;
    public int b0;
    public n89 c;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public View h0;
    public int i0;
    public String j;
    public boolean j0;
    public boolean k;
    public String k0;
    public boolean l;
    public int l0;
    public boolean m;
    public int m0;
    public boolean n;
    public final float[] n0;
    public int o;
    public final ConstraintWidget[] o0;
    public int p;
    public final ConstraintWidget[] p0;
    public int q;
    public ConstraintWidget q0;
    public int r;
    public ConstraintWidget r0;
    public int s;
    public int s0;
    public final int[] t;
    public int t0;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public androidx.constraintlayout.core.widgets.analyzer.e d = null;
    public androidx.constraintlayout.core.widgets.analyzer.g e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DimensionBehaviour {
        private static final /* synthetic */ DimensionBehaviour[] $VALUES;
        public static final DimensionBehaviour FIXED;
        public static final DimensionBehaviour MATCH_CONSTRAINT;
        public static final DimensionBehaviour MATCH_PARENT;
        public static final DimensionBehaviour WRAP_CONTENT;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            FIXED = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            WRAP_CONTENT = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            MATCH_CONSTRAINT = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            MATCH_PARENT = dimensionBehaviour4;
            $VALUES = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) $VALUES.clone();
        }
    }

    public ConstraintWidget() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        b7e b7eVar = new b7e(this, ConstraintAnchor$Type.LEFT);
        this.J = b7eVar;
        b7e b7eVar2 = new b7e(this, ConstraintAnchor$Type.TOP);
        this.K = b7eVar2;
        b7e b7eVar3 = new b7e(this, ConstraintAnchor$Type.RIGHT);
        this.L = b7eVar3;
        b7e b7eVar4 = new b7e(this, ConstraintAnchor$Type.BOTTOM);
        this.M = b7eVar4;
        b7e b7eVar5 = new b7e(this, ConstraintAnchor$Type.BASELINE);
        this.N = b7eVar5;
        b7e b7eVar6 = new b7e(this, ConstraintAnchor$Type.CENTER_X);
        this.O = b7eVar6;
        b7e b7eVar7 = new b7e(this, ConstraintAnchor$Type.CENTER_Y);
        this.P = b7eVar7;
        b7e b7eVar8 = new b7e(this, ConstraintAnchor$Type.CENTER);
        this.Q = b7eVar8;
        this.R = new b7e[]{b7eVar, b7eVar3, b7eVar2, b7eVar4, b7eVar5, b7eVar8};
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.T = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.U = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new float[]{-1.0f, -1.0f};
        this.o0 = new ConstraintWidget[]{null, null};
        this.p0 = new ConstraintWidget[]{null, null};
        this.q0 = null;
        this.r0 = null;
        this.s0 = -1;
        this.t0 = -1;
        arrayList.add(b7eVar);
        arrayList.add(b7eVar2);
        arrayList.add(b7eVar3);
        arrayList.add(b7eVar4);
        arrayList.add(b7eVar6);
        arrayList.add(b7eVar7);
        arrayList.add(b7eVar8);
        arrayList.add(b7eVar5);
    }

    public static void I(StringBuilder sb, int i, int i2, String str) {
        if (i == i2) {
            return;
        }
        b64.A(i, str, " :   ", ",\n", sb);
    }

    public static void J(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void q(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, DimensionBehaviour dimensionBehaviour) {
        sb.append(str);
        sb.append(" :  {\n");
        String obj = dimensionBehaviour.toString();
        if (!DimensionBehaviour.FIXED.toString().equals(obj)) {
            g8e.D(sb, "      behavior", " :   ", obj, ",\n");
        }
        I(sb, i, 0, "      size");
        I(sb, i2, 0, "      min");
        I(sb, i3, Integer.MAX_VALUE, "      max");
        I(sb, i4, 0, "      matchMin");
        I(sb, i5, 0, "      matchDef");
        J(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void r(StringBuilder sb, String str, b7e b7eVar) {
        if (b7eVar.f == null) {
            return;
        }
        x4e.C(sb, Extension.TAB_CHAR, str, " : [ '");
        sb.append(b7eVar.f);
        sb.append("'");
        if (b7eVar.h != Integer.MIN_VALUE || b7eVar.g != 0) {
            sb.append(",");
            sb.append(b7eVar.g);
            if (b7eVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(b7eVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        b7e b7eVar = this.K;
        b7e b7eVar2 = b7eVar.f;
        if (b7eVar2 != null && b7eVar2.f == b7eVar) {
            return true;
        }
        b7e b7eVar3 = this.M;
        b7e b7eVar4 = b7eVar3.f;
        return b7eVar4 != null && b7eVar4.f == b7eVar3;
    }

    public final boolean B() {
        return this.g && this.i0 != 8;
    }

    public boolean C() {
        if (this.k) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean D() {
        if (this.l) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public void E() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.V = null;
        this.D = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.U;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.h0 = null;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        float[] fArr = this.n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void F() {
        ConstraintWidget constraintWidget = this.V;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            ((d) constraintWidget).getClass();
        }
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b7e) arrayList.get(i)).j();
        }
    }

    public final void G() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b7e b7eVar = (b7e) arrayList.get(i);
            b7eVar.c = false;
            b7eVar.b = 0;
        }
    }

    public void H(ua7 ua7Var) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void K(int i) {
        this.c0 = i;
        this.E = i > 0;
    }

    public final void L(int i, int i2) {
        if (this.k) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        this.k = true;
    }

    public final void M(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        if (this.E) {
            this.N.l(i + this.c0);
        }
        this.l = true;
    }

    public final void N(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public final void O(DimensionBehaviour dimensionBehaviour) {
        this.U[0] = dimensionBehaviour;
    }

    public final void P(DimensionBehaviour dimensionBehaviour) {
        this.U[1] = dimensionBehaviour;
    }

    public final void Q(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void R(boolean z, boolean z2) {
        int i;
        int i2;
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.d;
        boolean z3 = z & eVar.g;
        androidx.constraintlayout.core.widgets.analyzer.g gVar = this.e;
        boolean z4 = z2 & gVar.g;
        int i3 = eVar.h.g;
        int i4 = gVar.h.g;
        int i5 = eVar.i.g;
        int i6 = gVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.a0 = i3;
        }
        if (z4) {
            this.b0 = i4;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z3) {
            if (this.U[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i10 = this.d0;
            if (i8 < i10) {
                this.W = i10;
            }
        }
        if (z4) {
            if (this.U[1] == DimensionBehaviour.FIXED && i9 < (i = this.X)) {
                i9 = i;
            }
            this.X = i9;
            int i11 = this.e0;
            if (i9 < i11) {
                this.X = i11;
            }
        }
    }

    public void S(ijy ijyVar, boolean z) {
        int i;
        int i2;
        androidx.constraintlayout.core.widgets.analyzer.g gVar;
        androidx.constraintlayout.core.widgets.analyzer.e eVar;
        ijyVar.getClass();
        int n = ijy.n(this.J);
        int n2 = ijy.n(this.K);
        int n3 = ijy.n(this.L);
        int n4 = ijy.n(this.M);
        if (z && (eVar = this.d) != null) {
            androidx.constraintlayout.core.widgets.analyzer.a aVar = eVar.h;
            if (aVar.j) {
                androidx.constraintlayout.core.widgets.analyzer.a aVar2 = eVar.i;
                if (aVar2.j) {
                    n = aVar.g;
                    n3 = aVar2.g;
                }
            }
        }
        if (z && (gVar = this.e) != null) {
            androidx.constraintlayout.core.widgets.analyzer.a aVar3 = gVar.h;
            if (aVar3.j) {
                androidx.constraintlayout.core.widgets.analyzer.a aVar4 = gVar.i;
                if (aVar4.j) {
                    n2 = aVar3.g;
                    n4 = aVar4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.a0 = n;
        this.b0 = n2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.U;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.W)) {
            i4 = i2;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i4;
        this.X = i5;
        int i6 = this.e0;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.d0;
        if (i4 < i7) {
            this.W = i7;
        }
        int i8 = this.v;
        if (i8 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && this.U[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void b(d dVar, ijy ijyVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            h.a(dVar, ijyVar, this);
            hashSet.remove(this);
            c(ijyVar, dVar.Y(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((b7e) it.next()).d.b(dVar, ijyVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((b7e) it2.next()).d.b(dVar, ijyVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((b7e) it3.next()).d.b(dVar, ijyVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((b7e) it4.next()).d.b(dVar, ijyVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((b7e) it5.next()).d.b(dVar, ijyVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r13 != 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0606, code lost:
    
        if (r60.i0 == r9) goto L384;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023c  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [int] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v46, types: [androidx.constraintlayout.core.widgets.d] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r60v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(ijy ijyVar, boolean z) {
        boolean z2;
        boolean z3;
        ?? r19;
        ?? r17;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        oc20 oc20Var;
        boolean[] zArr;
        b7e b7eVar;
        boolean[] zArr2;
        boolean[] zArr3;
        b7e b7eVar2;
        boolean z8;
        boolean z9;
        boolean z10;
        int i2;
        int i3;
        float f;
        z7t0 z7t0Var;
        int i4;
        int i5;
        int i6;
        boolean z11;
        int i7;
        boolean z12;
        DimensionBehaviour dimensionBehaviour;
        boolean z13;
        int i8;
        b7e b7eVar3;
        boolean z14;
        boolean z15;
        z7t0 z7t0Var2;
        DimensionBehaviour dimensionBehaviour2;
        z7t0 z7t0Var3;
        DimensionBehaviour dimensionBehaviour3;
        boolean z16;
        z7t0 z7t0Var4;
        boolean z17;
        boolean z18;
        int i9;
        b7e b7eVar4;
        boolean z19;
        z7t0 z7t0Var5;
        b7e b7eVar5;
        z7t0 z7t0Var6;
        b7e b7eVar6;
        int i10;
        boolean[] zArr4;
        z7t0 z7t0Var7;
        z7t0 z7t0Var8;
        z7t0 z7t0Var9;
        int i11;
        int i12;
        int i13;
        int i14;
        z7t0 z7t0Var10;
        z7t0 z7t0Var11;
        oc20 oc20Var2;
        ?? r27;
        androidx.constraintlayout.core.widgets.analyzer.g gVar;
        androidx.constraintlayout.core.widgets.analyzer.a aVar;
        ConstraintWidget constraintWidget3;
        boolean z20;
        androidx.constraintlayout.core.widgets.analyzer.e eVar;
        int i15;
        boolean z21;
        ?? r12;
        boolean A;
        androidx.constraintlayout.core.widgets.analyzer.e eVar2;
        boolean z22;
        ijy ijyVar2 = ijyVar;
        b7e b7eVar7 = this.J;
        z7t0 k = ijyVar2.k(b7eVar7);
        b7e b7eVar8 = this.L;
        z7t0 k2 = ijyVar2.k(b7eVar8);
        b7e b7eVar9 = this.K;
        z7t0 k3 = ijyVar2.k(b7eVar9);
        b7e b7eVar10 = this.M;
        z7t0 k4 = ijyVar2.k(b7eVar10);
        b7e b7eVar11 = this.N;
        z7t0 k5 = ijyVar2.k(b7eVar11);
        ConstraintWidget constraintWidget4 = this.V;
        if (constraintWidget4 != null) {
            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget4.U;
            r17 = 0;
            r17 = 0;
            z3 = false;
            r17 = 0;
            DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            DimensionBehaviour dimensionBehaviour5 = DimensionBehaviour.WRAP_CONTENT;
            z4 = dimensionBehaviour4 == dimensionBehaviour5;
            z5 = dimensionBehaviourArr[1] == dimensionBehaviour5;
            int i16 = this.q;
            if (i16 != 1) {
                boolean z23 = true;
                if (i16 != 2) {
                    z2 = z23;
                    r19 = z23;
                } else {
                    z4 = false;
                    r19 = z23;
                }
            } else {
                r19 = 1;
                z5 = false;
            }
            i = this.i0;
            boolean[] zArr5 = this.T;
            boolean z24 = z5;
            if (i == 8 || this.j0) {
                z6 = z4;
            } else {
                ArrayList arrayList = this.S;
                int size = arrayList.size();
                z6 = z4;
                int i17 = r17;
                while (true) {
                    if (i17 < size) {
                        int i18 = size;
                        HashSet hashSet = ((b7e) arrayList.get(i17)).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i17++;
                        size = i18;
                    } else if (!zArr5[r17] && !zArr5[r19]) {
                        return;
                    }
                }
            }
            z7 = this.k;
            if (!z7 || this.l) {
                if (z7) {
                    ijyVar2.d(k, this.a0);
                    ijyVar2.d(k2, this.a0 + this.W);
                    if (z6 && (constraintWidget2 = this.V) != null) {
                        d dVar = (d) constraintWidget2;
                        WeakReference weakReference = dVar.M0;
                        if (weakReference == null || weakReference.get() == null || b7eVar7.d() > ((b7e) dVar.M0.get()).d()) {
                            dVar.M0 = new WeakReference(b7eVar7);
                        }
                        WeakReference weakReference2 = dVar.O0;
                        if (weakReference2 == null || weakReference2.get() == null || b7eVar8.d() > ((b7e) dVar.O0.get()).d()) {
                            dVar.O0 = new WeakReference(b7eVar8);
                        }
                    }
                }
                if (this.l) {
                    ijyVar2.d(k3, this.b0);
                    ijyVar2.d(k4, this.b0 + this.X);
                    HashSet hashSet2 = b7eVar11.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        ijyVar2.d(k5, this.b0 + this.c0);
                    }
                    if (z24 && (constraintWidget = this.V) != null) {
                        d dVar2 = (d) constraintWidget;
                        WeakReference weakReference3 = dVar2.L0;
                        if (weakReference3 == null || weakReference3.get() == null || b7eVar9.d() > ((b7e) dVar2.L0.get()).d()) {
                            dVar2.L0 = new WeakReference(b7eVar9);
                        }
                        WeakReference weakReference4 = dVar2.N0;
                        if (weakReference4 == null || weakReference4.get() == null || b7eVar10.d() > ((b7e) dVar2.N0.get()).d()) {
                            dVar2.N0 = new WeakReference(b7eVar10);
                        }
                    }
                }
                if (this.k && this.l) {
                    boolean z25 = r17;
                    this.k = z25;
                    this.l = z25;
                    return;
                }
            }
            oc20Var = ijy.r;
            if (oc20Var != null) {
                oc20Var.h++;
            }
            zArr = this.f;
            if (z || (eVar2 = this.d) == null) {
                b7eVar = b7eVar11;
                zArr2 = zArr;
            } else {
                b7eVar = b7eVar11;
                androidx.constraintlayout.core.widgets.analyzer.g gVar2 = this.e;
                zArr2 = zArr;
                if (gVar2 != null) {
                    androidx.constraintlayout.core.widgets.analyzer.a aVar2 = eVar2.h;
                    zArr3 = zArr5;
                    if (aVar2.j && eVar2.i.j && gVar2.h.j && gVar2.i.j) {
                        if (oc20Var != null) {
                            oc20Var.d++;
                        }
                        ijyVar2.d(k, aVar2.g);
                        ijyVar2.d(k2, this.d.i.g);
                        ijyVar2.d(k3, this.e.h.g);
                        ijyVar2.d(k4, this.e.i.g);
                        ijyVar2.d(k5, this.e.k.g);
                        if (this.V != null) {
                            if (z6 && zArr2[0] && !z()) {
                                ijyVar2.f(ijyVar2.k(this.V.L), k2, 0, 8);
                            }
                            if (z24 && zArr2[r19] && !A()) {
                                z22 = false;
                                ijyVar2.f(ijyVar2.k(this.V.M), k4, 0, 8);
                                this.k = z22;
                                this.l = z22;
                                return;
                            }
                        }
                        z22 = false;
                        this.k = z22;
                        this.l = z22;
                        return;
                    }
                    if (oc20Var != null) {
                        oc20Var.e++;
                    }
                    if (this.V != null) {
                        if (y(0)) {
                            ((d) this.V).U(this, 0);
                            z21 = r19;
                            r12 = z21;
                        } else {
                            z21 = z();
                            r12 = r19;
                        }
                        if (y(r12)) {
                            ((d) this.V).U(this, r12);
                            A = true;
                        } else {
                            A = A();
                        }
                        if (!z21 && z6 && this.i0 != 8 && b7eVar7.f == null && b7eVar8.f == null) {
                            ijyVar2.f(ijyVar2.k(this.V.L), k2, 0, 1);
                        }
                        if (!A && z24 && this.i0 != 8 && b7eVar9.f == null && b7eVar10.f == null && b7eVar == null) {
                            ijyVar2.f(ijyVar2.k(this.V.M), k4, 0, 1);
                        }
                        boolean z26 = z21;
                        b7eVar2 = b7eVar8;
                        z8 = z24;
                        z10 = A;
                        z9 = z26;
                    } else {
                        b7eVar2 = b7eVar8;
                        z8 = z24;
                        z9 = false;
                        z10 = false;
                    }
                    i2 = this.W;
                    i3 = this.d0;
                    if (i2 >= i3) {
                        i3 = i2;
                    }
                    int i19 = this.X;
                    int i20 = this.e0;
                    int i21 = i19 < i20 ? i20 : i19;
                    DimensionBehaviour[] dimensionBehaviourArr2 = this.U;
                    DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[0];
                    boolean z27 = z8;
                    DimensionBehaviour dimensionBehaviour7 = DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z28 = dimensionBehaviour6 != dimensionBehaviour7;
                    DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr2[1];
                    boolean z29 = dimensionBehaviour8 != dimensionBehaviour7;
                    int i22 = this.Z;
                    this.A = i22;
                    f = this.Y;
                    this.B = f;
                    int i23 = this.r;
                    int i24 = this.s;
                    if (f > 0.0f) {
                        z7t0Var = k4;
                        if (this.i0 != 8) {
                            int i25 = (dimensionBehaviour6 == dimensionBehaviour7 && i23 == 0) ? 3 : i23;
                            int i26 = (dimensionBehaviour8 == dimensionBehaviour7 && i24 == 0) ? 3 : i24;
                            if (dimensionBehaviour6 == dimensionBehaviour7 && dimensionBehaviour8 == dimensionBehaviour7) {
                                b7e b7eVar12 = b7eVar2;
                                if (i25 == 3 && i26 == 3) {
                                    if (i22 == -1) {
                                        if (z28 && !z29) {
                                            this.A = 0;
                                        } else if (!z28 && z29) {
                                            this.A = 1;
                                            if (i22 == -1) {
                                                this.B = 1.0f / f;
                                            }
                                        }
                                    }
                                    if (this.A == 0 && (!b7eVar9.h() || !b7eVar10.h())) {
                                        this.A = 1;
                                    } else if (this.A == 1 && (!b7eVar7.h() || !b7eVar12.h())) {
                                        this.A = 0;
                                    }
                                    if (this.A == -1 && (!b7eVar9.h() || !b7eVar10.h() || !b7eVar7.h() || !b7eVar12.h())) {
                                        if (b7eVar9.h() && b7eVar10.h()) {
                                            this.A = 0;
                                        } else if (b7eVar7.h() && b7eVar12.h()) {
                                            this.B = 1.0f / this.B;
                                            this.A = 1;
                                        }
                                    }
                                    if (this.A == -1) {
                                        int i27 = this.u;
                                        if (i27 > 0 && this.x == 0) {
                                            this.A = 0;
                                        } else if (i27 == 0 && this.x > 0) {
                                            this.B = 1.0f / this.B;
                                            this.A = 1;
                                        }
                                    }
                                    i5 = i25;
                                    i6 = i26;
                                    i4 = i21;
                                    z11 = true;
                                    int[] iArr = this.t;
                                    iArr[0] = i5;
                                    iArr[1] = i6;
                                    if (z11) {
                                        int i28 = this.A;
                                        i7 = -1;
                                        if (i28 == 0 || i28 == -1) {
                                            z12 = true;
                                            boolean z30 = !z11 && ((i15 = this.A) == 1 || i15 == i7);
                                            DimensionBehaviour dimensionBehaviour9 = this.U[0];
                                            dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                                            z13 = dimensionBehaviour9 != dimensionBehaviour && (this instanceof d);
                                            i8 = !z13 ? 0 : i3;
                                            b7eVar3 = this.Q;
                                            z14 = !b7eVar3.h();
                                            z15 = zArr3[0];
                                            boolean z31 = zArr3[1];
                                            if (this.o != 2 && !this.k) {
                                                if (z || (eVar = this.d) == null) {
                                                    z20 = z12;
                                                } else {
                                                    androidx.constraintlayout.core.widgets.analyzer.a aVar3 = eVar.h;
                                                    z20 = z12;
                                                    if (aVar3.j && eVar.i.j) {
                                                        if (z) {
                                                            ijyVar2.d(k, aVar3.g);
                                                            ijyVar2.d(k2, this.d.i.g);
                                                            if (this.V != null && z6 && zArr2[0] && !z()) {
                                                                ijyVar2.f(ijyVar2.k(this.V.L), k2, 0, 8);
                                                            }
                                                        }
                                                    }
                                                }
                                                ConstraintWidget constraintWidget5 = this.V;
                                                z7t0 k6 = constraintWidget5 == null ? ijyVar2.k(constraintWidget5.L) : null;
                                                ConstraintWidget constraintWidget6 = this.V;
                                                z7t0 k7 = constraintWidget6 == null ? ijyVar2.k(constraintWidget6.J) : null;
                                                boolean z32 = zArr2[0];
                                                DimensionBehaviour[] dimensionBehaviourArr3 = this.U;
                                                z18 = z6;
                                                i9 = i5;
                                                i10 = i6;
                                                DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr3[0];
                                                z17 = z9;
                                                int i29 = this.a0;
                                                int i30 = this.d0;
                                                int i31 = this.C[0];
                                                float f2 = this.f0;
                                                boolean z33 = dimensionBehaviourArr3[1] != dimensionBehaviour7;
                                                boolean z34 = z14;
                                                dimensionBehaviour2 = dimensionBehaviour7;
                                                z7t0Var3 = k2;
                                                b7eVar4 = b7eVar;
                                                z19 = z27;
                                                z7t0Var5 = k3;
                                                b7eVar5 = b7eVar10;
                                                z7t0Var2 = k;
                                                z7t0Var6 = z7t0Var;
                                                dimensionBehaviour3 = dimensionBehaviour;
                                                z7t0Var4 = k5;
                                                b7eVar6 = b7eVar3;
                                                zArr4 = zArr2;
                                                ijyVar2 = ijyVar;
                                                e(ijyVar2, true, z18, z19, z32, k7, k6, dimensionBehaviour10, z13, this.J, this.L, i29, i8, i30, i31, f2, z20, z33, z17, z10, z15, i9, i10, this.u, this.v, this.w, z34);
                                                z16 = z34;
                                                if (z && (gVar = this.e) != null) {
                                                    aVar = gVar.h;
                                                    if (aVar.j && gVar.i.j) {
                                                        int i32 = aVar.g;
                                                        z7t0Var7 = z7t0Var5;
                                                        ijyVar2.d(z7t0Var7, i32);
                                                        z7t0Var8 = z7t0Var6;
                                                        ijyVar2.d(z7t0Var8, this.e.i.g);
                                                        z7t0Var9 = z7t0Var4;
                                                        ijyVar2.d(z7t0Var9, this.e.k.g);
                                                        constraintWidget3 = this.V;
                                                        if (constraintWidget3 == null && !z10 && z19) {
                                                            i13 = 1;
                                                            if (zArr4[1]) {
                                                                i11 = 0;
                                                                i12 = 8;
                                                                ijyVar2.f(ijyVar2.k(constraintWidget3.M), z7t0Var8, 0, 8);
                                                            } else {
                                                                i11 = 0;
                                                                i12 = 8;
                                                            }
                                                        } else {
                                                            i11 = 0;
                                                            i12 = 8;
                                                            i13 = 1;
                                                        }
                                                        i14 = i11;
                                                        if (this.p == 2) {
                                                            i14 = i11;
                                                        }
                                                        if (i14 != 0 || this.l) {
                                                            z7t0Var10 = z7t0Var7;
                                                            z7t0Var11 = z7t0Var8;
                                                        } else {
                                                            int i33 = (this.U[i13] == dimensionBehaviour3 && (this instanceof d)) ? i13 : i11;
                                                            int i34 = i33 != 0 ? i11 : i4;
                                                            ConstraintWidget constraintWidget7 = this.V;
                                                            z7t0 k8 = constraintWidget7 != null ? ijyVar2.k(constraintWidget7.M) : null;
                                                            ConstraintWidget constraintWidget8 = this.V;
                                                            z7t0 k9 = constraintWidget8 != null ? ijyVar2.k(constraintWidget8.K) : null;
                                                            int i35 = this.c0;
                                                            if (i35 <= 0) {
                                                                r27 = z16;
                                                            }
                                                            b7e b7eVar13 = b7eVar4;
                                                            if (b7eVar13.f != null) {
                                                                ijyVar2.e(z7t0Var9, z7t0Var7, i35, i12);
                                                                ijyVar2.e(z7t0Var9, ijyVar2.k(b7eVar13.f), b7eVar13.e(), i12);
                                                                if (z19) {
                                                                    ijyVar2.f(k8, ijyVar2.k(b7eVar5), i11, 5);
                                                                }
                                                                r27 = i11;
                                                            } else if (this.i0 == i12) {
                                                                ijyVar2.e(z7t0Var9, z7t0Var7, b7eVar13.e(), i12);
                                                                r27 = z16;
                                                            } else {
                                                                ijyVar2.e(z7t0Var9, z7t0Var7, i35, i12);
                                                                r27 = z16;
                                                            }
                                                            boolean z35 = zArr4[i13];
                                                            DimensionBehaviour[] dimensionBehaviourArr4 = this.U;
                                                            int i36 = i11;
                                                            int i37 = i13;
                                                            z7t0Var11 = z7t0Var8;
                                                            z7t0Var10 = z7t0Var7;
                                                            ijyVar2 = ijyVar;
                                                            e(ijyVar2, false, z19, z18, z35, k9, k8, dimensionBehaviourArr4[i13], i33, this.K, this.M, this.b0, i34, this.e0, this.C[i37], this.g0, z30, dimensionBehaviourArr4[i36] == dimensionBehaviour2 ? i37 : i36, z10, z17, z31, i10, i9, this.x, this.y, this.z, r27);
                                                        }
                                                        if (z11) {
                                                            int i38 = this.A;
                                                            float f3 = this.B;
                                                            if (i38 == 1) {
                                                                i63 l = ijyVar2.l();
                                                                l.d.g(z7t0Var11, -1.0f);
                                                                l.d.g(z7t0Var10, 1.0f);
                                                                l.d.g(z7t0Var3, f3);
                                                                l.d.g(z7t0Var2, -f3);
                                                                ijyVar2.c(l);
                                                            } else {
                                                                i63 l2 = ijyVar2.l();
                                                                l2.d.g(z7t0Var3, -1.0f);
                                                                l2.d.g(z7t0Var2, 1.0f);
                                                                l2.d.g(z7t0Var11, f3);
                                                                l2.d.g(z7t0Var10, -f3);
                                                                ijyVar2.c(l2);
                                                            }
                                                        }
                                                        if (b7eVar6.h()) {
                                                            b7e b7eVar14 = b7eVar6;
                                                            ConstraintWidget constraintWidget9 = b7eVar14.f.d;
                                                            float radians = (float) Math.toRadians(this.D + 90.0f);
                                                            int e = b7eVar14.e();
                                                            ConstraintAnchor$Type constraintAnchor$Type = ConstraintAnchor$Type.LEFT;
                                                            z7t0 k10 = ijyVar2.k(k(constraintAnchor$Type));
                                                            ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.TOP;
                                                            z7t0 k11 = ijyVar2.k(k(constraintAnchor$Type2));
                                                            ConstraintAnchor$Type constraintAnchor$Type3 = ConstraintAnchor$Type.RIGHT;
                                                            z7t0 k12 = ijyVar2.k(k(constraintAnchor$Type3));
                                                            ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.BOTTOM;
                                                            z7t0 k13 = ijyVar2.k(k(constraintAnchor$Type4));
                                                            z7t0 k14 = ijyVar2.k(constraintWidget9.k(constraintAnchor$Type));
                                                            z7t0 k15 = ijyVar2.k(constraintWidget9.k(constraintAnchor$Type2));
                                                            z7t0 k16 = ijyVar2.k(constraintWidget9.k(constraintAnchor$Type3));
                                                            z7t0 k17 = ijyVar2.k(constraintWidget9.k(constraintAnchor$Type4));
                                                            i63 l3 = ijyVar2.l();
                                                            double d = radians;
                                                            double sin = Math.sin(d);
                                                            double d2 = e;
                                                            l3.d.g(k15, 0.5f);
                                                            l3.d.g(k17, 0.5f);
                                                            l3.d.g(k11, -0.5f);
                                                            l3.d.g(k13, -0.5f);
                                                            l3.b = -((float) (sin * d2));
                                                            ijyVar2.c(l3);
                                                            i63 l4 = ijyVar2.l();
                                                            float cos = (float) (Math.cos(d) * d2);
                                                            l4.d.g(k14, 0.5f);
                                                            l4.d.g(k16, 0.5f);
                                                            l4.d.g(k10, -0.5f);
                                                            l4.d.g(k12, -0.5f);
                                                            l4.b = -cos;
                                                            ijyVar2.c(l4);
                                                        }
                                                        this.k = false;
                                                        this.l = false;
                                                        oc20Var2 = ijy.r;
                                                        if (oc20Var2 == null) {
                                                            oc20Var2.getClass();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                z7t0Var7 = z7t0Var5;
                                                z7t0Var8 = z7t0Var6;
                                                z7t0Var9 = z7t0Var4;
                                                i11 = 0;
                                                i12 = 8;
                                                i13 = 1;
                                                i14 = 1;
                                                if (this.p == 2) {
                                                }
                                                if (i14 != 0) {
                                                }
                                                z7t0Var10 = z7t0Var7;
                                                z7t0Var11 = z7t0Var8;
                                                if (z11) {
                                                }
                                                if (b7eVar6.h()) {
                                                }
                                                this.k = false;
                                                this.l = false;
                                                oc20Var2 = ijy.r;
                                                if (oc20Var2 == null) {
                                                }
                                            }
                                            z7t0Var2 = k;
                                            dimensionBehaviour2 = dimensionBehaviour7;
                                            z7t0Var3 = k2;
                                            dimensionBehaviour3 = dimensionBehaviour;
                                            z16 = z14;
                                            z7t0Var4 = k5;
                                            z17 = z9;
                                            z18 = z6;
                                            i9 = i5;
                                            b7eVar4 = b7eVar;
                                            z19 = z27;
                                            z7t0Var5 = k3;
                                            b7eVar5 = b7eVar10;
                                            z7t0Var6 = z7t0Var;
                                            b7eVar6 = b7eVar3;
                                            i10 = i6;
                                            zArr4 = zArr2;
                                            if (z) {
                                                aVar = gVar.h;
                                                if (aVar.j) {
                                                    int i322 = aVar.g;
                                                    z7t0Var7 = z7t0Var5;
                                                    ijyVar2.d(z7t0Var7, i322);
                                                    z7t0Var8 = z7t0Var6;
                                                    ijyVar2.d(z7t0Var8, this.e.i.g);
                                                    z7t0Var9 = z7t0Var4;
                                                    ijyVar2.d(z7t0Var9, this.e.k.g);
                                                    constraintWidget3 = this.V;
                                                    if (constraintWidget3 == null) {
                                                    }
                                                    i11 = 0;
                                                    i12 = 8;
                                                    i13 = 1;
                                                    i14 = i11;
                                                    if (this.p == 2) {
                                                    }
                                                    if (i14 != 0) {
                                                    }
                                                    z7t0Var10 = z7t0Var7;
                                                    z7t0Var11 = z7t0Var8;
                                                    if (z11) {
                                                    }
                                                    if (b7eVar6.h()) {
                                                    }
                                                    this.k = false;
                                                    this.l = false;
                                                    oc20Var2 = ijy.r;
                                                    if (oc20Var2 == null) {
                                                    }
                                                }
                                            }
                                            z7t0Var7 = z7t0Var5;
                                            z7t0Var8 = z7t0Var6;
                                            z7t0Var9 = z7t0Var4;
                                            i11 = 0;
                                            i12 = 8;
                                            i13 = 1;
                                            i14 = 1;
                                            if (this.p == 2) {
                                            }
                                            if (i14 != 0) {
                                            }
                                            z7t0Var10 = z7t0Var7;
                                            z7t0Var11 = z7t0Var8;
                                            if (z11) {
                                            }
                                            if (b7eVar6.h()) {
                                            }
                                            this.k = false;
                                            this.l = false;
                                            oc20Var2 = ijy.r;
                                            if (oc20Var2 == null) {
                                            }
                                        }
                                    } else {
                                        i7 = -1;
                                    }
                                    z12 = false;
                                    if (z11) {
                                    }
                                    DimensionBehaviour dimensionBehaviour92 = this.U[0];
                                    dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                                    if (dimensionBehaviour92 != dimensionBehaviour) {
                                    }
                                    if (!z13) {
                                    }
                                    b7eVar3 = this.Q;
                                    z14 = !b7eVar3.h();
                                    z15 = zArr3[0];
                                    boolean z312 = zArr3[1];
                                    if (this.o != 2) {
                                        if (z) {
                                        }
                                        z20 = z12;
                                        ConstraintWidget constraintWidget52 = this.V;
                                        if (constraintWidget52 == null) {
                                        }
                                        ConstraintWidget constraintWidget62 = this.V;
                                        if (constraintWidget62 == null) {
                                        }
                                        boolean z322 = zArr2[0];
                                        DimensionBehaviour[] dimensionBehaviourArr32 = this.U;
                                        z18 = z6;
                                        i9 = i5;
                                        i10 = i6;
                                        DimensionBehaviour dimensionBehaviour102 = dimensionBehaviourArr32[0];
                                        z17 = z9;
                                        int i292 = this.a0;
                                        int i302 = this.d0;
                                        int i312 = this.C[0];
                                        float f22 = this.f0;
                                        if (dimensionBehaviourArr32[1] != dimensionBehaviour7) {
                                        }
                                        boolean z342 = z14;
                                        dimensionBehaviour2 = dimensionBehaviour7;
                                        z7t0Var3 = k2;
                                        b7eVar4 = b7eVar;
                                        z19 = z27;
                                        z7t0Var5 = k3;
                                        b7eVar5 = b7eVar10;
                                        z7t0Var2 = k;
                                        z7t0Var6 = z7t0Var;
                                        dimensionBehaviour3 = dimensionBehaviour;
                                        z7t0Var4 = k5;
                                        b7eVar6 = b7eVar3;
                                        zArr4 = zArr2;
                                        ijyVar2 = ijyVar;
                                        e(ijyVar2, true, z18, z19, z322, k7, k6, dimensionBehaviour102, z13, this.J, this.L, i292, i8, i302, i312, f22, z20, z33, z17, z10, z15, i9, i10, this.u, this.v, this.w, z342);
                                        z16 = z342;
                                        if (z) {
                                        }
                                        z7t0Var7 = z7t0Var5;
                                        z7t0Var8 = z7t0Var6;
                                        z7t0Var9 = z7t0Var4;
                                        i11 = 0;
                                        i12 = 8;
                                        i13 = 1;
                                        i14 = 1;
                                        if (this.p == 2) {
                                        }
                                        if (i14 != 0) {
                                        }
                                        z7t0Var10 = z7t0Var7;
                                        z7t0Var11 = z7t0Var8;
                                        if (z11) {
                                        }
                                        if (b7eVar6.h()) {
                                        }
                                        this.k = false;
                                        this.l = false;
                                        oc20Var2 = ijy.r;
                                        if (oc20Var2 == null) {
                                        }
                                    }
                                    z7t0Var2 = k;
                                    dimensionBehaviour2 = dimensionBehaviour7;
                                    z7t0Var3 = k2;
                                    dimensionBehaviour3 = dimensionBehaviour;
                                    z16 = z14;
                                    z7t0Var4 = k5;
                                    z17 = z9;
                                    z18 = z6;
                                    i9 = i5;
                                    b7eVar4 = b7eVar;
                                    z19 = z27;
                                    z7t0Var5 = k3;
                                    b7eVar5 = b7eVar10;
                                    z7t0Var6 = z7t0Var;
                                    b7eVar6 = b7eVar3;
                                    i10 = i6;
                                    zArr4 = zArr2;
                                    if (z) {
                                    }
                                    z7t0Var7 = z7t0Var5;
                                    z7t0Var8 = z7t0Var6;
                                    z7t0Var9 = z7t0Var4;
                                    i11 = 0;
                                    i12 = 8;
                                    i13 = 1;
                                    i14 = 1;
                                    if (this.p == 2) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    z7t0Var10 = z7t0Var7;
                                    z7t0Var11 = z7t0Var8;
                                    if (z11) {
                                    }
                                    if (b7eVar6.h()) {
                                    }
                                    this.k = false;
                                    this.l = false;
                                    oc20Var2 = ijy.r;
                                    if (oc20Var2 == null) {
                                    }
                                }
                            }
                            if (dimensionBehaviour6 == dimensionBehaviour7 && i25 == 3) {
                                this.A = 0;
                                i3 = (int) (i19 * f);
                                if (dimensionBehaviour8 != dimensionBehaviour7) {
                                    i6 = i26;
                                    i4 = i21;
                                    i5 = 4;
                                    z11 = false;
                                    int[] iArr2 = this.t;
                                    iArr2[0] = i5;
                                    iArr2[1] = i6;
                                    if (z11) {
                                    }
                                    z12 = false;
                                    if (z11) {
                                    }
                                    DimensionBehaviour dimensionBehaviour922 = this.U[0];
                                    dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                                    if (dimensionBehaviour922 != dimensionBehaviour) {
                                    }
                                    if (!z13) {
                                    }
                                    b7eVar3 = this.Q;
                                    z14 = !b7eVar3.h();
                                    z15 = zArr3[0];
                                    boolean z3122 = zArr3[1];
                                    if (this.o != 2) {
                                    }
                                    z7t0Var2 = k;
                                    dimensionBehaviour2 = dimensionBehaviour7;
                                    z7t0Var3 = k2;
                                    dimensionBehaviour3 = dimensionBehaviour;
                                    z16 = z14;
                                    z7t0Var4 = k5;
                                    z17 = z9;
                                    z18 = z6;
                                    i9 = i5;
                                    b7eVar4 = b7eVar;
                                    z19 = z27;
                                    z7t0Var5 = k3;
                                    b7eVar5 = b7eVar10;
                                    z7t0Var6 = z7t0Var;
                                    b7eVar6 = b7eVar3;
                                    i10 = i6;
                                    zArr4 = zArr2;
                                    if (z) {
                                    }
                                    z7t0Var7 = z7t0Var5;
                                    z7t0Var8 = z7t0Var6;
                                    z7t0Var9 = z7t0Var4;
                                    i11 = 0;
                                    i12 = 8;
                                    i13 = 1;
                                    i14 = 1;
                                    if (this.p == 2) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    z7t0Var10 = z7t0Var7;
                                    z7t0Var11 = z7t0Var8;
                                    if (z11) {
                                    }
                                    if (b7eVar6.h()) {
                                    }
                                    this.k = false;
                                    this.l = false;
                                    oc20Var2 = ijy.r;
                                    if (oc20Var2 == null) {
                                    }
                                }
                                i5 = i25;
                                i6 = i26;
                                i4 = i21;
                                z11 = true;
                                int[] iArr22 = this.t;
                                iArr22[0] = i5;
                                iArr22[1] = i6;
                                if (z11) {
                                }
                                z12 = false;
                                if (z11) {
                                }
                                DimensionBehaviour dimensionBehaviour9222 = this.U[0];
                                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                                if (dimensionBehaviour9222 != dimensionBehaviour) {
                                }
                                if (!z13) {
                                }
                                b7eVar3 = this.Q;
                                z14 = !b7eVar3.h();
                                z15 = zArr3[0];
                                boolean z31222 = zArr3[1];
                                if (this.o != 2) {
                                }
                                z7t0Var2 = k;
                                dimensionBehaviour2 = dimensionBehaviour7;
                                z7t0Var3 = k2;
                                dimensionBehaviour3 = dimensionBehaviour;
                                z16 = z14;
                                z7t0Var4 = k5;
                                z17 = z9;
                                z18 = z6;
                                i9 = i5;
                                b7eVar4 = b7eVar;
                                z19 = z27;
                                z7t0Var5 = k3;
                                b7eVar5 = b7eVar10;
                                z7t0Var6 = z7t0Var;
                                b7eVar6 = b7eVar3;
                                i10 = i6;
                                zArr4 = zArr2;
                                if (z) {
                                }
                                z7t0Var7 = z7t0Var5;
                                z7t0Var8 = z7t0Var6;
                                z7t0Var9 = z7t0Var4;
                                i11 = 0;
                                i12 = 8;
                                i13 = 1;
                                i14 = 1;
                                if (this.p == 2) {
                                }
                                if (i14 != 0) {
                                }
                                z7t0Var10 = z7t0Var7;
                                z7t0Var11 = z7t0Var8;
                                if (z11) {
                                }
                                if (b7eVar6.h()) {
                                }
                                this.k = false;
                                this.l = false;
                                oc20Var2 = ijy.r;
                                if (oc20Var2 == null) {
                                }
                            } else {
                                if (dimensionBehaviour8 == dimensionBehaviour7 && i26 == 3) {
                                    this.A = 1;
                                    if (i22 == -1) {
                                        this.B = 1.0f / f;
                                    }
                                    i4 = (int) (this.B * i2);
                                    i5 = i25;
                                    if (dimensionBehaviour6 != dimensionBehaviour7) {
                                        i6 = 4;
                                        z11 = false;
                                        int[] iArr222 = this.t;
                                        iArr222[0] = i5;
                                        iArr222[1] = i6;
                                        if (z11) {
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                        DimensionBehaviour dimensionBehaviour92222 = this.U[0];
                                        dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                                        if (dimensionBehaviour92222 != dimensionBehaviour) {
                                        }
                                        if (!z13) {
                                        }
                                        b7eVar3 = this.Q;
                                        z14 = !b7eVar3.h();
                                        z15 = zArr3[0];
                                        boolean z312222 = zArr3[1];
                                        if (this.o != 2) {
                                        }
                                        z7t0Var2 = k;
                                        dimensionBehaviour2 = dimensionBehaviour7;
                                        z7t0Var3 = k2;
                                        dimensionBehaviour3 = dimensionBehaviour;
                                        z16 = z14;
                                        z7t0Var4 = k5;
                                        z17 = z9;
                                        z18 = z6;
                                        i9 = i5;
                                        b7eVar4 = b7eVar;
                                        z19 = z27;
                                        z7t0Var5 = k3;
                                        b7eVar5 = b7eVar10;
                                        z7t0Var6 = z7t0Var;
                                        b7eVar6 = b7eVar3;
                                        i10 = i6;
                                        zArr4 = zArr2;
                                        if (z) {
                                        }
                                        z7t0Var7 = z7t0Var5;
                                        z7t0Var8 = z7t0Var6;
                                        z7t0Var9 = z7t0Var4;
                                        i11 = 0;
                                        i12 = 8;
                                        i13 = 1;
                                        i14 = 1;
                                        if (this.p == 2) {
                                        }
                                        if (i14 != 0) {
                                        }
                                        z7t0Var10 = z7t0Var7;
                                        z7t0Var11 = z7t0Var8;
                                        if (z11) {
                                        }
                                        if (b7eVar6.h()) {
                                        }
                                        this.k = false;
                                        this.l = false;
                                        oc20Var2 = ijy.r;
                                        if (oc20Var2 == null) {
                                        }
                                    } else {
                                        i6 = i26;
                                        z11 = true;
                                        int[] iArr2222 = this.t;
                                        iArr2222[0] = i5;
                                        iArr2222[1] = i6;
                                        if (z11) {
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                        DimensionBehaviour dimensionBehaviour922222 = this.U[0];
                                        dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                                        if (dimensionBehaviour922222 != dimensionBehaviour) {
                                        }
                                        if (!z13) {
                                        }
                                        b7eVar3 = this.Q;
                                        z14 = !b7eVar3.h();
                                        z15 = zArr3[0];
                                        boolean z3122222 = zArr3[1];
                                        if (this.o != 2) {
                                        }
                                        z7t0Var2 = k;
                                        dimensionBehaviour2 = dimensionBehaviour7;
                                        z7t0Var3 = k2;
                                        dimensionBehaviour3 = dimensionBehaviour;
                                        z16 = z14;
                                        z7t0Var4 = k5;
                                        z17 = z9;
                                        z18 = z6;
                                        i9 = i5;
                                        b7eVar4 = b7eVar;
                                        z19 = z27;
                                        z7t0Var5 = k3;
                                        b7eVar5 = b7eVar10;
                                        z7t0Var6 = z7t0Var;
                                        b7eVar6 = b7eVar3;
                                        i10 = i6;
                                        zArr4 = zArr2;
                                        if (z) {
                                        }
                                        z7t0Var7 = z7t0Var5;
                                        z7t0Var8 = z7t0Var6;
                                        z7t0Var9 = z7t0Var4;
                                        i11 = 0;
                                        i12 = 8;
                                        i13 = 1;
                                        i14 = 1;
                                        if (this.p == 2) {
                                        }
                                        if (i14 != 0) {
                                        }
                                        z7t0Var10 = z7t0Var7;
                                        z7t0Var11 = z7t0Var8;
                                        if (z11) {
                                        }
                                        if (b7eVar6.h()) {
                                        }
                                        this.k = false;
                                        this.l = false;
                                        oc20Var2 = ijy.r;
                                        if (oc20Var2 == null) {
                                        }
                                    }
                                }
                                i5 = i25;
                                i6 = i26;
                                i4 = i21;
                                z11 = true;
                                int[] iArr22222 = this.t;
                                iArr22222[0] = i5;
                                iArr22222[1] = i6;
                                if (z11) {
                                }
                                z12 = false;
                                if (z11) {
                                }
                                DimensionBehaviour dimensionBehaviour9222222 = this.U[0];
                                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                                if (dimensionBehaviour9222222 != dimensionBehaviour) {
                                }
                                if (!z13) {
                                }
                                b7eVar3 = this.Q;
                                z14 = !b7eVar3.h();
                                z15 = zArr3[0];
                                boolean z31222222 = zArr3[1];
                                if (this.o != 2) {
                                }
                                z7t0Var2 = k;
                                dimensionBehaviour2 = dimensionBehaviour7;
                                z7t0Var3 = k2;
                                dimensionBehaviour3 = dimensionBehaviour;
                                z16 = z14;
                                z7t0Var4 = k5;
                                z17 = z9;
                                z18 = z6;
                                i9 = i5;
                                b7eVar4 = b7eVar;
                                z19 = z27;
                                z7t0Var5 = k3;
                                b7eVar5 = b7eVar10;
                                z7t0Var6 = z7t0Var;
                                b7eVar6 = b7eVar3;
                                i10 = i6;
                                zArr4 = zArr2;
                                if (z) {
                                }
                                z7t0Var7 = z7t0Var5;
                                z7t0Var8 = z7t0Var6;
                                z7t0Var9 = z7t0Var4;
                                i11 = 0;
                                i12 = 8;
                                i13 = 1;
                                i14 = 1;
                                if (this.p == 2) {
                                }
                                if (i14 != 0) {
                                }
                                z7t0Var10 = z7t0Var7;
                                z7t0Var11 = z7t0Var8;
                                if (z11) {
                                }
                                if (b7eVar6.h()) {
                                }
                                this.k = false;
                                this.l = false;
                                oc20Var2 = ijy.r;
                                if (oc20Var2 == null) {
                                }
                            }
                        }
                    } else {
                        z7t0Var = k4;
                    }
                    i4 = i21;
                    i5 = i23;
                    i6 = i24;
                    z11 = false;
                    int[] iArr222222 = this.t;
                    iArr222222[0] = i5;
                    iArr222222[1] = i6;
                    if (z11) {
                    }
                    z12 = false;
                    if (z11) {
                    }
                    DimensionBehaviour dimensionBehaviour92222222 = this.U[0];
                    dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour92222222 != dimensionBehaviour) {
                    }
                    if (!z13) {
                    }
                    b7eVar3 = this.Q;
                    z14 = !b7eVar3.h();
                    z15 = zArr3[0];
                    boolean z312222222 = zArr3[1];
                    if (this.o != 2) {
                    }
                    z7t0Var2 = k;
                    dimensionBehaviour2 = dimensionBehaviour7;
                    z7t0Var3 = k2;
                    dimensionBehaviour3 = dimensionBehaviour;
                    z16 = z14;
                    z7t0Var4 = k5;
                    z17 = z9;
                    z18 = z6;
                    i9 = i5;
                    b7eVar4 = b7eVar;
                    z19 = z27;
                    z7t0Var5 = k3;
                    b7eVar5 = b7eVar10;
                    z7t0Var6 = z7t0Var;
                    b7eVar6 = b7eVar3;
                    i10 = i6;
                    zArr4 = zArr2;
                    if (z) {
                    }
                    z7t0Var7 = z7t0Var5;
                    z7t0Var8 = z7t0Var6;
                    z7t0Var9 = z7t0Var4;
                    i11 = 0;
                    i12 = 8;
                    i13 = 1;
                    i14 = 1;
                    if (this.p == 2) {
                    }
                    if (i14 != 0) {
                    }
                    z7t0Var10 = z7t0Var7;
                    z7t0Var11 = z7t0Var8;
                    if (z11) {
                    }
                    if (b7eVar6.h()) {
                    }
                    this.k = false;
                    this.l = false;
                    oc20Var2 = ijy.r;
                    if (oc20Var2 == null) {
                    }
                }
            }
            zArr3 = zArr5;
            if (oc20Var != null) {
            }
            if (this.V != null) {
            }
            i2 = this.W;
            i3 = this.d0;
            if (i2 >= i3) {
            }
            int i192 = this.X;
            int i202 = this.e0;
            if (i192 < i202) {
            }
            DimensionBehaviour[] dimensionBehaviourArr22 = this.U;
            DimensionBehaviour dimensionBehaviour62 = dimensionBehaviourArr22[0];
            boolean z272 = z8;
            DimensionBehaviour dimensionBehaviour72 = DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour62 != dimensionBehaviour72) {
            }
            DimensionBehaviour dimensionBehaviour82 = dimensionBehaviourArr22[1];
            if (dimensionBehaviour82 != dimensionBehaviour72) {
            }
            int i222 = this.Z;
            this.A = i222;
            f = this.Y;
            this.B = f;
            int i232 = this.r;
            int i242 = this.s;
            if (f > 0.0f) {
            }
            i4 = i21;
            i5 = i232;
            i6 = i242;
            z11 = false;
            int[] iArr2222222 = this.t;
            iArr2222222[0] = i5;
            iArr2222222[1] = i6;
            if (z11) {
            }
            z12 = false;
            if (z11) {
            }
            DimensionBehaviour dimensionBehaviour922222222 = this.U[0];
            dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour922222222 != dimensionBehaviour) {
            }
            if (!z13) {
            }
            b7eVar3 = this.Q;
            z14 = !b7eVar3.h();
            z15 = zArr3[0];
            boolean z3122222222 = zArr3[1];
            if (this.o != 2) {
            }
            z7t0Var2 = k;
            dimensionBehaviour2 = dimensionBehaviour72;
            z7t0Var3 = k2;
            dimensionBehaviour3 = dimensionBehaviour;
            z16 = z14;
            z7t0Var4 = k5;
            z17 = z9;
            z18 = z6;
            i9 = i5;
            b7eVar4 = b7eVar;
            z19 = z272;
            z7t0Var5 = k3;
            b7eVar5 = b7eVar10;
            z7t0Var6 = z7t0Var;
            b7eVar6 = b7eVar3;
            i10 = i6;
            zArr4 = zArr2;
            if (z) {
            }
            z7t0Var7 = z7t0Var5;
            z7t0Var8 = z7t0Var6;
            z7t0Var9 = z7t0Var4;
            i11 = 0;
            i12 = 8;
            i13 = 1;
            i14 = 1;
            if (this.p == 2) {
            }
            if (i14 != 0) {
            }
            z7t0Var10 = z7t0Var7;
            z7t0Var11 = z7t0Var8;
            if (z11) {
            }
            if (b7eVar6.h()) {
            }
            this.k = false;
            this.l = false;
            oc20Var2 = ijy.r;
            if (oc20Var2 == null) {
            }
        } else {
            z2 = true;
            z3 = false;
        }
        z5 = z3 ? 1 : 0;
        z4 = z5;
        r17 = z3;
        r19 = z2;
        i = this.i0;
        boolean[] zArr52 = this.T;
        boolean z242 = z5;
        if (i == 8) {
        }
        z6 = z4;
        z7 = this.k;
        if (!z7) {
        }
        if (z7) {
        }
        if (this.l) {
        }
        if (this.k) {
            boolean z252 = r17;
            this.k = z252;
            this.l = z252;
            return;
        }
        oc20Var = ijy.r;
        if (oc20Var != null) {
        }
        zArr = this.f;
        if (z) {
        }
        b7eVar = b7eVar11;
        zArr2 = zArr;
        zArr3 = zArr52;
        if (oc20Var != null) {
        }
        if (this.V != null) {
        }
        i2 = this.W;
        i3 = this.d0;
        if (i2 >= i3) {
        }
        int i1922 = this.X;
        int i2022 = this.e0;
        if (i1922 < i2022) {
        }
        DimensionBehaviour[] dimensionBehaviourArr222 = this.U;
        DimensionBehaviour dimensionBehaviour622 = dimensionBehaviourArr222[0];
        boolean z2722 = z8;
        DimensionBehaviour dimensionBehaviour722 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour622 != dimensionBehaviour722) {
        }
        DimensionBehaviour dimensionBehaviour822 = dimensionBehaviourArr222[1];
        if (dimensionBehaviour822 != dimensionBehaviour722) {
        }
        int i2222 = this.Z;
        this.A = i2222;
        f = this.Y;
        this.B = f;
        int i2322 = this.r;
        int i2422 = this.s;
        if (f > 0.0f) {
        }
        i4 = i21;
        i5 = i2322;
        i6 = i2422;
        z11 = false;
        int[] iArr22222222 = this.t;
        iArr22222222[0] = i5;
        iArr22222222[1] = i6;
        if (z11) {
        }
        z12 = false;
        if (z11) {
        }
        DimensionBehaviour dimensionBehaviour9222222222 = this.U[0];
        dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour9222222222 != dimensionBehaviour) {
        }
        if (!z13) {
        }
        b7eVar3 = this.Q;
        z14 = !b7eVar3.h();
        z15 = zArr3[0];
        boolean z31222222222 = zArr3[1];
        if (this.o != 2) {
        }
        z7t0Var2 = k;
        dimensionBehaviour2 = dimensionBehaviour722;
        z7t0Var3 = k2;
        dimensionBehaviour3 = dimensionBehaviour;
        z16 = z14;
        z7t0Var4 = k5;
        z17 = z9;
        z18 = z6;
        i9 = i5;
        b7eVar4 = b7eVar;
        z19 = z2722;
        z7t0Var5 = k3;
        b7eVar5 = b7eVar10;
        z7t0Var6 = z7t0Var;
        b7eVar6 = b7eVar3;
        i10 = i6;
        zArr4 = zArr2;
        if (z) {
        }
        z7t0Var7 = z7t0Var5;
        z7t0Var8 = z7t0Var6;
        z7t0Var9 = z7t0Var4;
        i11 = 0;
        i12 = 8;
        i13 = 1;
        i14 = 1;
        if (this.p == 2) {
        }
        if (i14 != 0) {
        }
        z7t0Var10 = z7t0Var7;
        z7t0Var11 = z7t0Var8;
        if (z11) {
        }
        if (b7eVar6.h()) {
        }
        this.k = false;
        this.l = false;
        oc20Var2 = ijy.r;
        if (oc20Var2 == null) {
        }
    }

    public boolean d() {
        return this.i0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ijy ijyVar, boolean z, boolean z2, boolean z3, boolean z4, z7t0 z7t0Var, z7t0 z7t0Var2, DimensionBehaviour dimensionBehaviour, boolean z5, b7e b7eVar, b7e b7eVar2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        z7t0 k;
        z7t0 k2;
        b7e b7eVar3;
        z7t0 z7t0Var3;
        boolean z14;
        int i12;
        z7t0 z7t0Var4;
        z7t0 z7t0Var5;
        z7t0 z7t0Var6;
        z7t0 z7t0Var7;
        int i13;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ConstraintWidget constraintWidget;
        int i16;
        int i17;
        b7e b7eVar4;
        boolean z19;
        int i18;
        boolean z20;
        int i19;
        int i20;
        HashSet hashSet;
        boolean z21;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z22;
        boolean z23;
        int i27;
        ijy ijyVar2 = ijyVar;
        int i28 = i7;
        int i29 = i8;
        z7t0 k3 = ijyVar2.k(b7eVar);
        z7t0 k4 = ijyVar2.k(b7eVar2);
        z7t0 k5 = ijyVar2.k(b7eVar.f);
        z7t0 k6 = ijyVar2.k(b7eVar2.f);
        boolean h = b7eVar.h();
        boolean h2 = b7eVar2.h();
        boolean h3 = this.Q.h();
        int i30 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i30++;
        }
        int i31 = i30;
        int i32 = z6 ? 3 : i5;
        int ordinal = dimensionBehaviour.ordinal();
        boolean z24 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i32 == 4) ? false : true;
        int i33 = this.h;
        if (i33 != -1 && z) {
            this.h = -1;
            i2 = i33;
            z24 = false;
        }
        int i34 = this.i;
        if (i34 == -1 || z) {
            i34 = i2;
        } else {
            this.i = -1;
            z24 = false;
        }
        int i35 = i34;
        if (this.i0 == 8) {
            z24 = false;
            i9 = 0;
        } else {
            i9 = i35;
        }
        if (z11) {
            if (!h && !h2 && !h3) {
                ijyVar2.d(k3, i);
            } else if (h && !h2) {
                z12 = z24;
                i10 = 8;
                ijyVar2.e(k3, k5, b7eVar.e(), 8);
            }
            z12 = z24;
            i10 = 8;
        } else {
            z12 = z24;
            i10 = 8;
        }
        if (z12) {
            if (i31 == 2 || z6 || !(i32 == 1 || i32 == 0)) {
                if (i28 == -2) {
                    i28 = i9;
                }
                if (i29 == -2) {
                    i29 = i9;
                }
                if (i9 > 0 && i32 != 1) {
                    i9 = 0;
                }
                if (i28 > 0) {
                    ijyVar2.f(k4, k3, i28, 8);
                    i9 = Math.max(i9, i28);
                }
                if (i29 > 0) {
                    if (!z2 || i32 != 1) {
                        ijyVar2.g(k4, k3, i29, 8);
                    }
                    i9 = Math.min(i9, i29);
                }
                if (i32 == 1) {
                    if (z2) {
                        ijyVar2.e(k4, k3, i9, 8);
                    } else if (z8) {
                        ijyVar2.e(k4, k3, i9, 5);
                        ijyVar2.g(k4, k3, i9, 8);
                    } else {
                        ijyVar2.e(k4, k3, i9, 5);
                        ijyVar2.g(k4, k3, i9, 8);
                    }
                } else if (i32 == 2) {
                    ConstraintAnchor$Type constraintAnchor$Type = b7eVar.e;
                    ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.TOP;
                    if (constraintAnchor$Type == constraintAnchor$Type2 || constraintAnchor$Type == ConstraintAnchor$Type.BOTTOM) {
                        k = ijyVar2.k(this.V.k(constraintAnchor$Type2));
                        k2 = ijyVar2.k(this.V.k(ConstraintAnchor$Type.BOTTOM));
                    } else {
                        k = ijyVar2.k(this.V.k(ConstraintAnchor$Type.LEFT));
                        k2 = ijyVar2.k(this.V.k(ConstraintAnchor$Type.RIGHT));
                    }
                    i63 l = ijyVar2.l();
                    int i36 = i28;
                    l.d.g(k4, -1.0f);
                    l.d.g(k3, 1.0f);
                    l.d.g(k2, f2);
                    l.d.g(k, -f2);
                    ijyVar2.c(l);
                    if (z2) {
                        z12 = false;
                    }
                    z13 = z4;
                    i11 = i36;
                } else {
                    i11 = i28;
                    z13 = true;
                }
            } else {
                int max = Math.max(i28, i9);
                if (i29 > 0) {
                    max = Math.min(i29, max);
                }
                ijyVar2.e(k4, k3, max, 8);
                z13 = z4;
                i11 = i28;
                z12 = false;
            }
            if (z11 || z8) {
                boolean z25 = z13;
                if (i31 >= 2 && z2 && z25) {
                    ijyVar2.f(k3, z7t0Var, 0, 8);
                    b7e b7eVar5 = this.N;
                    boolean z26 = z || b7eVar5.f == null;
                    if (!z && (b7eVar3 = b7eVar5.f) != null) {
                        ConstraintWidget constraintWidget2 = b7eVar3.d;
                        if (constraintWidget2.Y != 0.0f) {
                            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.U;
                            DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                            DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                            if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                z26 = true;
                            }
                        }
                        z26 = false;
                    }
                    if (z26) {
                        ijyVar2.f(z7t0Var2, k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h2 && !h3) {
                b7eVar4 = b7eVar2;
                z7t0Var6 = k4;
                z14 = z13;
                z7t0Var3 = k6;
            } else if (!h || h2) {
                if (h || !h2) {
                    z7t0Var3 = k6;
                    if (h && h2) {
                        ConstraintWidget constraintWidget3 = b7eVar.f.d;
                        ConstraintWidget constraintWidget4 = b7eVar2.f.d;
                        z14 = z13;
                        ConstraintWidget constraintWidget5 = this.V;
                        int i37 = 6;
                        if (z12) {
                            if (i32 == 0) {
                                if (i29 != 0 || i11 != 0) {
                                    i25 = 5;
                                    i26 = 5;
                                    z22 = true;
                                    z23 = false;
                                    z16 = true;
                                } else if (k5.y && z7t0Var3.y) {
                                    ijyVar2.e(k3, k5, b7eVar.e(), 8);
                                    ijyVar2.e(k4, z7t0Var3, -b7eVar2.e(), 8);
                                    return;
                                } else {
                                    i25 = 8;
                                    i26 = 8;
                                    z22 = false;
                                    z23 = true;
                                    z16 = false;
                                }
                                if ((constraintWidget3 instanceof a) || (constraintWidget4 instanceof a)) {
                                    i14 = i25;
                                    z7t0Var7 = k5;
                                    ijyVar2 = ijyVar;
                                    i12 = i32;
                                    z7t0Var5 = k3;
                                    z7t0Var6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    z7t0Var4 = z7t0Var2;
                                    z15 = z22;
                                    i15 = 4;
                                    if (z16 || z7t0Var7 != z7t0Var3 || constraintWidget3 == constraintWidget5) {
                                        z18 = true;
                                    } else {
                                        z16 = false;
                                        z18 = false;
                                    }
                                    if (z15) {
                                        constraintWidget = constraintWidget4;
                                        i16 = i11;
                                        i17 = i12;
                                        b7eVar4 = b7eVar2;
                                        z19 = z2;
                                    } else {
                                        if (z12 || z7 || z9 || z7t0Var7 != z7t0Var || z7t0Var3 != z7t0Var4) {
                                            z19 = z2;
                                            z21 = z18;
                                            i21 = i14;
                                            i22 = i13;
                                        } else {
                                            i22 = 8;
                                            z19 = false;
                                            i21 = 8;
                                            z21 = false;
                                        }
                                        z7t0 z7t0Var8 = z7t0Var7;
                                        i16 = i11;
                                        i17 = i12;
                                        constraintWidget = constraintWidget4;
                                        b7eVar4 = b7eVar2;
                                        ijyVar2.b(z7t0Var5, z7t0Var8, b7eVar.e(), f, z7t0Var3, z7t0Var6, b7eVar2.e(), i22);
                                        z7t0Var7 = z7t0Var8;
                                        i14 = i21;
                                        z18 = z21;
                                    }
                                    if (this.i0 != 8 && ((hashSet = b7eVar4.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z16) {
                                        if (z19 && z7t0Var7 != z7t0Var3 && !z12 && ((constraintWidget3 instanceof a) || (constraintWidget instanceof a))) {
                                            i14 = 6;
                                        }
                                        ijyVar2.f(z7t0Var5, z7t0Var7, b7eVar.e(), i14);
                                        ijyVar2.g(z7t0Var6, z7t0Var3, -b7eVar4.e(), i14);
                                    }
                                    if (z19 || !z10 || (constraintWidget3 instanceof a) || (constraintWidget instanceof a) || constraintWidget == constraintWidget5) {
                                        i18 = i15;
                                        z20 = z18;
                                    } else {
                                        i18 = 6;
                                        i14 = 6;
                                        z20 = true;
                                    }
                                    if (z20) {
                                        if (z17 && (!z9 || z3)) {
                                            if (constraintWidget3 != constraintWidget5 && constraintWidget != constraintWidget5) {
                                                i37 = i18;
                                            }
                                            if ((constraintWidget3 instanceof g) || (constraintWidget instanceof g)) {
                                                i37 = 5;
                                            }
                                            if ((constraintWidget3 instanceof a) || (constraintWidget instanceof a)) {
                                                i37 = 5;
                                            }
                                            i18 = Math.max(z9 ? 5 : i37, i18);
                                        }
                                        if (z19) {
                                            i18 = Math.min(i14, i18);
                                            if (z6 && !z9 && (constraintWidget3 == constraintWidget5 || constraintWidget == constraintWidget5)) {
                                                i20 = 4;
                                                ijyVar2.e(z7t0Var5, z7t0Var7, b7eVar.e(), i20);
                                                ijyVar2.e(z7t0Var6, z7t0Var3, -b7eVar4.e(), i20);
                                            }
                                        }
                                        i20 = i18;
                                        ijyVar2.e(z7t0Var5, z7t0Var7, b7eVar.e(), i20);
                                        ijyVar2.e(z7t0Var6, z7t0Var3, -b7eVar4.e(), i20);
                                    }
                                    if (z19) {
                                        int e = z7t0Var == z7t0Var7 ? b7eVar.e() : 0;
                                        if (z7t0Var7 != z7t0Var) {
                                            ijyVar2.f(z7t0Var5, z7t0Var, e, 5);
                                        }
                                    }
                                    if (z19 && z12 && i3 == 0 && i16 == 0) {
                                        if (z12 || i17 != 3) {
                                            i19 = 5;
                                            ijyVar2.f(z7t0Var6, z7t0Var5, 0, 5);
                                        } else {
                                            ijyVar2.f(z7t0Var6, z7t0Var5, 0, 8);
                                        }
                                    }
                                    i19 = 5;
                                } else {
                                    i14 = i25;
                                    z7t0Var7 = k5;
                                    ijyVar2 = ijyVar;
                                    z7t0Var5 = k3;
                                    z7t0Var6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    z15 = z22;
                                    i15 = i26;
                                    i12 = i32;
                                    z7t0Var4 = z7t0Var2;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.i0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                        if (z12) {
                                        }
                                        i19 = 5;
                                        ijyVar2.f(z7t0Var6, z7t0Var5, 0, 5);
                                    }
                                    i19 = 5;
                                }
                            } else {
                                if (i32 == 2) {
                                    if ((constraintWidget3 instanceof a) || (constraintWidget4 instanceof a)) {
                                        ijyVar2 = ijyVar;
                                        i12 = i32;
                                        z7t0Var5 = k3;
                                        z7t0Var6 = k4;
                                        z7t0Var7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                    } else {
                                        ijyVar2 = ijyVar;
                                        i12 = i32;
                                        z7t0Var5 = k3;
                                        z7t0Var6 = k4;
                                        z7t0Var7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                        i15 = 5;
                                        z15 = true;
                                        z16 = true;
                                        z17 = false;
                                        z7t0Var4 = z7t0Var2;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.i0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                } else if (i32 == 1) {
                                    ijyVar2 = ijyVar;
                                    i12 = i32;
                                    z7t0Var5 = k3;
                                    z7t0Var6 = k4;
                                    z7t0Var7 = k5;
                                    i13 = 6;
                                    i14 = 8;
                                } else if (i32 == 3) {
                                    i12 = i32;
                                    if (this.A == -1) {
                                        if (z9) {
                                            ijyVar2 = ijyVar;
                                            z7t0Var4 = z7t0Var2;
                                            z7t0Var5 = k3;
                                            z7t0Var6 = k4;
                                            z7t0Var7 = k5;
                                            i13 = z2 ? 5 : 4;
                                        } else {
                                            ijyVar2 = ijyVar;
                                            z7t0Var4 = z7t0Var2;
                                            z7t0Var5 = k3;
                                            z7t0Var6 = k4;
                                            z7t0Var7 = k5;
                                            i13 = 8;
                                        }
                                        i14 = 8;
                                    } else {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i23 = 5;
                                                i24 = 4;
                                            } else {
                                                i23 = 8;
                                                i24 = 5;
                                            }
                                            i15 = i24;
                                            z7t0Var5 = k3;
                                            z7t0Var6 = k4;
                                            z7t0Var7 = k5;
                                            i13 = 6;
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            z7t0Var4 = z7t0Var2;
                                        } else if (i29 > 0) {
                                            ijyVar2 = ijyVar;
                                            z7t0Var4 = z7t0Var2;
                                            z7t0Var5 = k3;
                                            z7t0Var6 = k4;
                                            z7t0Var7 = k5;
                                            i13 = 6;
                                            i14 = 5;
                                        } else {
                                            if (i29 != 0 || i11 != 0) {
                                                ijyVar2 = ijyVar;
                                                z7t0Var4 = z7t0Var2;
                                                z7t0Var5 = k3;
                                                z7t0Var6 = k4;
                                                z7t0Var7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 4;
                                            } else if (z9) {
                                                i23 = (constraintWidget3 == constraintWidget5 || constraintWidget4 == constraintWidget5) ? 5 : 4;
                                                z7t0Var4 = z7t0Var2;
                                                z7t0Var5 = k3;
                                                z7t0Var6 = k4;
                                                z7t0Var7 = k5;
                                                i13 = 6;
                                                i15 = 4;
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                            } else {
                                                ijyVar2 = ijyVar;
                                                z7t0Var4 = z7t0Var2;
                                                z7t0Var5 = k3;
                                                z7t0Var6 = k4;
                                                z7t0Var7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 8;
                                            }
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            if (z16) {
                                            }
                                            z18 = true;
                                            if (z15) {
                                            }
                                            if (this.i0 != 8) {
                                            }
                                            if (z16) {
                                            }
                                            if (z19) {
                                            }
                                            i18 = i15;
                                            z20 = z18;
                                            if (z20) {
                                            }
                                            if (z19) {
                                            }
                                            if (z19) {
                                            }
                                            i19 = 5;
                                        }
                                        i14 = i23;
                                        ijyVar2 = ijyVar;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.i0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                    i15 = 5;
                                    z15 = true;
                                    z16 = true;
                                    z17 = true;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.i0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i19 = 5;
                                } else {
                                    i12 = i32;
                                    ijyVar2 = ijyVar;
                                    z7t0Var4 = z7t0Var2;
                                    z7t0Var5 = k3;
                                    z7t0Var6 = k4;
                                    z7t0Var7 = k5;
                                    i13 = 6;
                                    i14 = 5;
                                    i15 = 4;
                                    z15 = false;
                                    z16 = false;
                                }
                                i15 = 4;
                                z15 = true;
                                z16 = true;
                                z17 = false;
                                z7t0Var4 = z7t0Var2;
                                if (z16) {
                                }
                                z18 = true;
                                if (z15) {
                                }
                                if (this.i0 != 8) {
                                }
                                if (z16) {
                                }
                                if (z19) {
                                }
                                i18 = i15;
                                z20 = z18;
                                if (z20) {
                                }
                                if (z19) {
                                }
                                if (z19) {
                                }
                                i19 = 5;
                            }
                            i27 = i19;
                            if (z19 && z14) {
                                int e2 = b7eVar4.f != null ? b7eVar4.e() : 0;
                                if (z7t0Var3 != z7t0Var2) {
                                    ijyVar2.f(z7t0Var2, z7t0Var6, e2, i27);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i12 = i32;
                        if (k5.y && z7t0Var3.y) {
                            ijyVar.b(k3, k5, b7eVar.e(), f, z7t0Var3, k4, b7eVar2.e(), 8);
                            if (z2 && z14) {
                                int e3 = b7eVar2.f != null ? b7eVar2.e() : 0;
                                if (z7t0Var3 != z7t0Var2) {
                                    ijyVar.f(z7t0Var2, k4, e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ijyVar2 = ijyVar;
                        z7t0Var4 = z7t0Var2;
                        z7t0Var5 = k3;
                        z7t0Var6 = k4;
                        z7t0Var7 = k5;
                        i13 = 6;
                        i14 = 5;
                        i15 = 4;
                        z15 = true;
                        z16 = true;
                        z17 = false;
                        if (z16) {
                        }
                        z18 = true;
                        if (z15) {
                        }
                        if (this.i0 != 8) {
                        }
                        if (z16) {
                        }
                        if (z19) {
                        }
                        i18 = i15;
                        z20 = z18;
                        if (z20) {
                        }
                        if (z19) {
                        }
                        if (z19) {
                        }
                        i19 = 5;
                        i27 = i19;
                        if (z19) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    z7t0Var3 = k6;
                    ijyVar2.e(k4, z7t0Var3, -b7eVar2.e(), 8);
                    if (z2) {
                        ijyVar2.f(k3, z7t0Var, 0, 5);
                        b7eVar4 = b7eVar2;
                        i19 = 5;
                        z7t0Var6 = k4;
                        z14 = z13;
                        z19 = z2;
                        i27 = i19;
                        if (z19) {
                        }
                    }
                }
                b7eVar4 = b7eVar2;
                z7t0Var6 = k4;
                z14 = z13;
            } else {
                b7eVar4 = b7eVar2;
                z7t0Var6 = k4;
                z14 = z13;
                z7t0Var3 = k6;
                z19 = z2;
                i27 = (z2 && (b7eVar.f.d instanceof a)) ? 8 : 5;
                if (z19) {
                }
            }
            i19 = 5;
            z19 = z2;
            i27 = i19;
            if (z19) {
            }
        } else if (z5) {
            ijyVar2.e(k4, k3, 0, 3);
            if (i3 > 0) {
                ijyVar2.f(k4, k3, i3, i10);
            }
            if (i4 < Integer.MAX_VALUE) {
                ijyVar2.g(k4, k3, i4, i10);
            }
        } else {
            ijyVar2.e(k4, k3, i9, i10);
        }
        z13 = z4;
        i11 = i28;
        if (z11) {
        }
        boolean z252 = z13;
        if (i31 >= 2) {
        }
    }

    public final void f(b7e b7eVar, b7e b7eVar2, int i) {
        if (b7eVar.d == this) {
            g(b7eVar.e, b7eVar2.d, b7eVar2.e, i);
        }
    }

    public final void g(ConstraintAnchor$Type constraintAnchor$Type, ConstraintWidget constraintWidget, ConstraintAnchor$Type constraintAnchor$Type2, int i) {
        ConstraintAnchor$Type constraintAnchor$Type3;
        ConstraintAnchor$Type constraintAnchor$Type4;
        boolean z;
        ConstraintAnchor$Type constraintAnchor$Type5 = ConstraintAnchor$Type.CENTER;
        if (constraintAnchor$Type == constraintAnchor$Type5) {
            if (constraintAnchor$Type2 != constraintAnchor$Type5) {
                ConstraintAnchor$Type constraintAnchor$Type6 = ConstraintAnchor$Type.LEFT;
                if (constraintAnchor$Type2 == constraintAnchor$Type6 || constraintAnchor$Type2 == ConstraintAnchor$Type.RIGHT) {
                    g(constraintAnchor$Type6, constraintWidget, constraintAnchor$Type2, 0);
                    g(ConstraintAnchor$Type.RIGHT, constraintWidget, constraintAnchor$Type2, 0);
                    k(constraintAnchor$Type5).a(constraintWidget.k(constraintAnchor$Type2), 0);
                    return;
                }
                ConstraintAnchor$Type constraintAnchor$Type7 = ConstraintAnchor$Type.TOP;
                if (constraintAnchor$Type2 == constraintAnchor$Type7 || constraintAnchor$Type2 == ConstraintAnchor$Type.BOTTOM) {
                    g(constraintAnchor$Type7, constraintWidget, constraintAnchor$Type2, 0);
                    g(ConstraintAnchor$Type.BOTTOM, constraintWidget, constraintAnchor$Type2, 0);
                    k(constraintAnchor$Type5).a(constraintWidget.k(constraintAnchor$Type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor$Type constraintAnchor$Type8 = ConstraintAnchor$Type.LEFT;
            b7e k = k(constraintAnchor$Type8);
            ConstraintAnchor$Type constraintAnchor$Type9 = ConstraintAnchor$Type.RIGHT;
            b7e k2 = k(constraintAnchor$Type9);
            ConstraintAnchor$Type constraintAnchor$Type10 = ConstraintAnchor$Type.TOP;
            b7e k3 = k(constraintAnchor$Type10);
            ConstraintAnchor$Type constraintAnchor$Type11 = ConstraintAnchor$Type.BOTTOM;
            b7e k4 = k(constraintAnchor$Type11);
            boolean z2 = true;
            if ((k == null || !k.h()) && (k2 == null || !k2.h())) {
                g(constraintAnchor$Type8, constraintWidget, constraintAnchor$Type8, 0);
                g(constraintAnchor$Type9, constraintWidget, constraintAnchor$Type9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((k3 == null || !k3.h()) && (k4 == null || !k4.h())) {
                g(constraintAnchor$Type10, constraintWidget, constraintAnchor$Type10, 0);
                g(constraintAnchor$Type11, constraintWidget, constraintAnchor$Type11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                k(constraintAnchor$Type5).a(constraintWidget.k(constraintAnchor$Type5), 0);
                return;
            }
            if (z) {
                ConstraintAnchor$Type constraintAnchor$Type12 = ConstraintAnchor$Type.CENTER_X;
                k(constraintAnchor$Type12).a(constraintWidget.k(constraintAnchor$Type12), 0);
                return;
            } else {
                if (z2) {
                    ConstraintAnchor$Type constraintAnchor$Type13 = ConstraintAnchor$Type.CENTER_Y;
                    k(constraintAnchor$Type13).a(constraintWidget.k(constraintAnchor$Type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor$Type constraintAnchor$Type14 = ConstraintAnchor$Type.CENTER_X;
        if (constraintAnchor$Type == constraintAnchor$Type14 && (constraintAnchor$Type2 == (constraintAnchor$Type4 = ConstraintAnchor$Type.LEFT) || constraintAnchor$Type2 == ConstraintAnchor$Type.RIGHT)) {
            b7e k5 = k(constraintAnchor$Type4);
            b7e k6 = constraintWidget.k(constraintAnchor$Type2);
            b7e k7 = k(ConstraintAnchor$Type.RIGHT);
            k5.a(k6, 0);
            k7.a(k6, 0);
            k(constraintAnchor$Type14).a(k6, 0);
            return;
        }
        ConstraintAnchor$Type constraintAnchor$Type15 = ConstraintAnchor$Type.CENTER_Y;
        if (constraintAnchor$Type == constraintAnchor$Type15 && (constraintAnchor$Type2 == (constraintAnchor$Type3 = ConstraintAnchor$Type.TOP) || constraintAnchor$Type2 == ConstraintAnchor$Type.BOTTOM)) {
            b7e k8 = constraintWidget.k(constraintAnchor$Type2);
            k(constraintAnchor$Type3).a(k8, 0);
            k(ConstraintAnchor$Type.BOTTOM).a(k8, 0);
            k(constraintAnchor$Type15).a(k8, 0);
            return;
        }
        if (constraintAnchor$Type == constraintAnchor$Type14 && constraintAnchor$Type2 == constraintAnchor$Type14) {
            ConstraintAnchor$Type constraintAnchor$Type16 = ConstraintAnchor$Type.LEFT;
            k(constraintAnchor$Type16).a(constraintWidget.k(constraintAnchor$Type16), 0);
            ConstraintAnchor$Type constraintAnchor$Type17 = ConstraintAnchor$Type.RIGHT;
            k(constraintAnchor$Type17).a(constraintWidget.k(constraintAnchor$Type17), 0);
            k(constraintAnchor$Type14).a(constraintWidget.k(constraintAnchor$Type2), 0);
            return;
        }
        if (constraintAnchor$Type == constraintAnchor$Type15 && constraintAnchor$Type2 == constraintAnchor$Type15) {
            ConstraintAnchor$Type constraintAnchor$Type18 = ConstraintAnchor$Type.TOP;
            k(constraintAnchor$Type18).a(constraintWidget.k(constraintAnchor$Type18), 0);
            ConstraintAnchor$Type constraintAnchor$Type19 = ConstraintAnchor$Type.BOTTOM;
            k(constraintAnchor$Type19).a(constraintWidget.k(constraintAnchor$Type19), 0);
            k(constraintAnchor$Type15).a(constraintWidget.k(constraintAnchor$Type2), 0);
            return;
        }
        b7e k9 = k(constraintAnchor$Type);
        b7e k10 = constraintWidget.k(constraintAnchor$Type2);
        if (k9.i(k10)) {
            ConstraintAnchor$Type constraintAnchor$Type20 = ConstraintAnchor$Type.BASELINE;
            if (constraintAnchor$Type == constraintAnchor$Type20) {
                b7e k11 = k(ConstraintAnchor$Type.TOP);
                b7e k12 = k(ConstraintAnchor$Type.BOTTOM);
                if (k11 != null) {
                    k11.j();
                }
                if (k12 != null) {
                    k12.j();
                }
            } else if (constraintAnchor$Type == ConstraintAnchor$Type.TOP || constraintAnchor$Type == ConstraintAnchor$Type.BOTTOM) {
                b7e k13 = k(constraintAnchor$Type20);
                if (k13 != null) {
                    k13.j();
                }
                b7e k14 = k(constraintAnchor$Type5);
                if (k14.f != k10) {
                    k14.j();
                }
                b7e f = k(constraintAnchor$Type).f();
                b7e k15 = k(constraintAnchor$Type15);
                if (k15.h()) {
                    f.j();
                    k15.j();
                }
            } else if (constraintAnchor$Type == ConstraintAnchor$Type.LEFT || constraintAnchor$Type == ConstraintAnchor$Type.RIGHT) {
                b7e k16 = k(constraintAnchor$Type5);
                if (k16.f != k10) {
                    k16.j();
                }
                b7e f2 = k(constraintAnchor$Type).f();
                b7e k17 = k(constraintAnchor$Type14);
                if (k17.h()) {
                    f2.j();
                    k17.j();
                }
            }
            k9.a(k10, i);
        }
    }

    public void h(ConstraintWidget constraintWidget, HashMap hashMap) {
        this.o = constraintWidget.o;
        this.p = constraintWidget.p;
        this.r = constraintWidget.r;
        this.s = constraintWidget.s;
        int[] iArr = constraintWidget.t;
        int i = iArr[0];
        int[] iArr2 = this.t;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.u = constraintWidget.u;
        this.v = constraintWidget.v;
        this.x = constraintWidget.x;
        this.y = constraintWidget.y;
        this.z = constraintWidget.z;
        this.A = constraintWidget.A;
        this.B = constraintWidget.B;
        int[] iArr3 = constraintWidget.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = constraintWidget.D;
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.U = (DimensionBehaviour[]) Arrays.copyOf(this.U, 2);
        this.V = this.V == null ? null : (ConstraintWidget) hashMap.get(constraintWidget.V);
        this.W = constraintWidget.W;
        this.X = constraintWidget.X;
        this.Y = constraintWidget.Y;
        this.Z = constraintWidget.Z;
        this.a0 = constraintWidget.a0;
        this.b0 = constraintWidget.b0;
        this.c0 = constraintWidget.c0;
        this.d0 = constraintWidget.d0;
        this.e0 = constraintWidget.e0;
        this.f0 = constraintWidget.f0;
        this.g0 = constraintWidget.g0;
        this.h0 = constraintWidget.h0;
        this.i0 = constraintWidget.i0;
        this.j0 = constraintWidget.j0;
        this.k0 = constraintWidget.k0;
        this.l0 = constraintWidget.l0;
        this.m0 = constraintWidget.m0;
        float[] fArr = constraintWidget.n0;
        float f = fArr[0];
        float[] fArr2 = this.n0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.o0;
        ConstraintWidget constraintWidget2 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.o0;
        constraintWidgetArr2[0] = constraintWidget2;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.p0;
        ConstraintWidget constraintWidget3 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.p0;
        constraintWidgetArr4[0] = constraintWidget3;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget4 = constraintWidget.q0;
        this.q0 = constraintWidget4 == null ? null : (ConstraintWidget) hashMap.get(constraintWidget4);
        ConstraintWidget constraintWidget5 = constraintWidget.r0;
        this.r0 = constraintWidget5 != null ? (ConstraintWidget) hashMap.get(constraintWidget5) : null;
    }

    public final void i(ijy ijyVar) {
        ijyVar.k(this.J);
        ijyVar.k(this.K);
        ijyVar.k(this.L);
        ijyVar.k(this.M);
        if (this.c0 > 0) {
            ijyVar.k(this.N);
        }
    }

    public final void j() {
        if (this.d == null) {
            this.d = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        }
        if (this.e == null) {
            this.e = new androidx.constraintlayout.core.widgets.analyzer.g(this);
        }
    }

    public b7e k(ConstraintAnchor$Type constraintAnchor$Type) {
        switch (h8e.a[constraintAnchor$Type.ordinal()]) {
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                ny61.f(constraintAnchor$Type.name());
            case 9:
                return null;
        }
    }

    public final DimensionBehaviour l(int i) {
        if (i == 0) {
            return this.U[0];
        }
        if (i == 1) {
            return this.U[1];
        }
        return null;
    }

    public final int m() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final ConstraintWidget n(int i) {
        b7e b7eVar;
        b7e b7eVar2;
        if (i != 0) {
            if (i == 1 && (b7eVar2 = (b7eVar = this.M).f) != null && b7eVar2.f == b7eVar) {
                return b7eVar2.d;
            }
            return null;
        }
        b7e b7eVar3 = this.L;
        b7e b7eVar4 = b7eVar3.f;
        if (b7eVar4 == null || b7eVar4.f != b7eVar3) {
            return null;
        }
        return b7eVar4.d;
    }

    public final ConstraintWidget o(int i) {
        b7e b7eVar;
        b7e b7eVar2;
        if (i != 0) {
            if (i == 1 && (b7eVar2 = (b7eVar = this.K).f) != null && b7eVar2.f == b7eVar) {
                return b7eVar2.d;
            }
            return null;
        }
        b7e b7eVar3 = this.J;
        b7e b7eVar4 = b7eVar3.f;
        if (b7eVar4 == null || b7eVar4.f != b7eVar3) {
            return null;
        }
        return b7eVar4.d;
    }

    public void p(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.b0);
        sb.append("\n");
        r(sb, "left", this.J);
        r(sb, "top", this.K);
        r(sb, "right", this.L);
        r(sb, "bottom", this.M);
        r(sb, "baseline", this.N);
        r(sb, "centerX", this.O);
        r(sb, "centerY", this.P);
        int i = this.W;
        int i2 = this.d0;
        int i3 = this.C[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        DimensionBehaviour dimensionBehaviour = this.U[0];
        float[] fArr = this.n0;
        float f2 = fArr[0];
        q(sb, "    width", i, i2, i3, i4, i5, f, dimensionBehaviour);
        int i6 = this.X;
        int i7 = this.e0;
        int i8 = this.C[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        DimensionBehaviour dimensionBehaviour2 = this.U[1];
        float f4 = fArr[1];
        q(sb, "    height", i6, i7, i8, i9, i10, f3, dimensionBehaviour2);
        float f5 = this.Y;
        int i11 = this.Z;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        J(sb, "    horizontalBias", this.f0, 0.5f);
        J(sb, "    verticalBias", this.g0, 0.5f);
        I(sb, this.l0, 0, "    horizontalChainStyle");
        I(sb, this.m0, 0, "    verticalChainStyle");
        sb.append("  }");
    }

    public final int s() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int t() {
        ConstraintWidget constraintWidget = this.V;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.a0 : ((d) constraintWidget).C0 + this.a0;
    }

    public String toString() {
        StringBuilder t = qv10.t("");
        t.append(this.k0 != null ? oyr.t(new StringBuilder("id: "), this.k0, " ") : "");
        t.append(Extension.O_BRAKE);
        t.append(this.a0);
        t.append(Extension.FIX_SPACE);
        t.append(this.b0);
        t.append(") - (");
        t.append(this.W);
        t.append(" x ");
        return oyr.m(this.X, Extension.C_BRAKE, t);
    }

    public final int u() {
        ConstraintWidget constraintWidget = this.V;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.b0 : ((d) constraintWidget).D0 + this.b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(int i) {
        if (i == 0) {
            return (this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2;
        }
        if ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) < 2) {
        }
    }

    public final boolean w(int i, int i2) {
        b7e b7eVar;
        b7e b7eVar2;
        b7e b7eVar3;
        b7e b7eVar4;
        if (i == 0) {
            b7e b7eVar5 = this.J;
            b7e b7eVar6 = b7eVar5.f;
            if (b7eVar6 == null || !b7eVar6.c || (b7eVar4 = (b7eVar3 = this.L).f) == null || !b7eVar4.c) {
                return false;
            }
            return (b7eVar4.d() - b7eVar3.e()) - (b7eVar5.e() + b7eVar5.f.d()) >= i2;
        }
        b7e b7eVar7 = this.K;
        b7e b7eVar8 = b7eVar7.f;
        if (b7eVar8 == null || !b7eVar8.c || (b7eVar2 = (b7eVar = this.M).f) == null || !b7eVar2.c) {
            return false;
        }
        return (b7eVar2.d() - b7eVar.e()) - (b7eVar7.e() + b7eVar7.f.d()) >= i2;
    }

    public final void x(ConstraintAnchor$Type constraintAnchor$Type, ConstraintWidget constraintWidget, ConstraintAnchor$Type constraintAnchor$Type2, int i, int i2) {
        k(constraintAnchor$Type).b(constraintWidget.k(constraintAnchor$Type2), i, i2, true);
    }

    public final boolean y(int i) {
        b7e b7eVar;
        b7e b7eVar2;
        int i2 = i * 2;
        b7e[] b7eVarArr = this.R;
        b7e b7eVar3 = b7eVarArr[i2];
        b7e b7eVar4 = b7eVar3.f;
        return (b7eVar4 == null || b7eVar4.f == b7eVar3 || (b7eVar2 = (b7eVar = b7eVarArr[i2 + 1]).f) == null || b7eVar2.f != b7eVar) ? false : true;
    }

    public final boolean z() {
        b7e b7eVar = this.J;
        b7e b7eVar2 = b7eVar.f;
        if (b7eVar2 != null && b7eVar2.f == b7eVar) {
            return true;
        }
        b7e b7eVar3 = this.L;
        b7e b7eVar4 = b7eVar3.f;
        return b7eVar4 != null && b7eVar4.f == b7eVar3;
    }
}
