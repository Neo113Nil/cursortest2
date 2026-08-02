package xsna;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: GridCore.java */
/* loaded from: classes11.dex */
public final class jfu extends androidx.constraintlayout.core.widgets.i {
    public androidx.constraintlayout.core.widgets.d I0;
    public ConstraintWidget[] J0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public float P0;
    public float Q0;
    public String R0;
    public String S0;
    public String T0;
    public String U0;
    public int V0;
    public int W0;
    public boolean[][] X0;
    public int[][] Z0;
    public int a1;
    public int[][] b1;
    public boolean K0 = false;
    public final HashSet Y0 = new HashSet();
    public int c1 = 0;

    public jfu() {
        int[][] k0;
        int[][] k02;
        boolean[][] zArr;
        this.W0 = 0;
        m0();
        int[][] iArr = this.Z0;
        boolean z = iArr != null && iArr.length == this.w0 && (zArr = this.X0) != null && zArr.length == this.L0 && zArr[0].length == this.N0;
        if (!z) {
            i0();
        }
        if (z) {
            for (int i = 0; i < this.X0.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr2 = this.X0;
                    if (i2 < zArr2[0].length) {
                        zArr2[i][i2] = true;
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.Z0.length; i3++) {
                int i4 = 0;
                while (true) {
                    int[][] iArr2 = this.Z0;
                    if (i4 < iArr2[0].length) {
                        iArr2[i3][i4] = -1;
                        i4++;
                    }
                }
            }
        }
        this.W0 = 0;
        String str = this.U0;
        if (str != null && !str.trim().isEmpty() && (k02 = k0(this.U0, false)) != null) {
            g0(k02);
        }
        String str2 = this.T0;
        if (str2 == null || str2.trim().isEmpty() || (k0 = k0(this.T0, true)) == null) {
            return;
        }
        h0(k0);
    }

    public static void c0(ConstraintWidget constraintWidget) {
        constraintWidget.o0[1] = -1.0f;
        constraintWidget.L.j();
        constraintWidget.N.j();
        constraintWidget.O.j();
    }

    public static float[] l0(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] split = str.split(StringUtils.COMMA);
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < split.length) {
                try {
                    fArr[i2] = Float.parseFloat(split[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + split[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // androidx.constraintlayout.core.widgets.i
    public final void a0(int i, int i2, int i3, int i4) {
        int[][] k0;
        this.I0 = (androidx.constraintlayout.core.widgets.d) this.W;
        if (this.L0 >= 1 && this.N0 >= 1) {
            this.W0 = 0;
            String str = this.U0;
            if (str != null && !str.trim().isEmpty() && (k0 = k0(this.U0, false)) != null) {
                g0(k0);
            }
            String str2 = this.T0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.b1 = k0(this.T0, true);
            }
            int max = Math.max(this.L0, this.N0);
            ConstraintWidget[] constraintWidgetArr = this.J0;
            if (constraintWidgetArr == null) {
                this.J0 = new ConstraintWidget[max];
                int i5 = 0;
                while (true) {
                    ConstraintWidget[] constraintWidgetArr2 = this.J0;
                    if (i5 >= constraintWidgetArr2.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget = new ConstraintWidget();
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    dimensionBehaviourArr[0] = dimensionBehaviour;
                    dimensionBehaviourArr[1] = dimensionBehaviour;
                    constraintWidget.k = String.valueOf(constraintWidget.hashCode());
                    constraintWidgetArr2[i5] = constraintWidget;
                    i5++;
                }
            } else if (max != constraintWidgetArr.length) {
                ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[max];
                for (int i6 = 0; i6 < max; i6++) {
                    ConstraintWidget[] constraintWidgetArr4 = this.J0;
                    if (i6 < constraintWidgetArr4.length) {
                        constraintWidgetArr3[i6] = constraintWidgetArr4[i6];
                    } else {
                        ConstraintWidget constraintWidget2 = new ConstraintWidget();
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget2.V;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        dimensionBehaviourArr2[0] = dimensionBehaviour2;
                        dimensionBehaviourArr2[1] = dimensionBehaviour2;
                        constraintWidget2.k = String.valueOf(constraintWidget2.hashCode());
                        constraintWidgetArr3[i6] = constraintWidget2;
                    }
                }
                while (true) {
                    ConstraintWidget[] constraintWidgetArr5 = this.J0;
                    if (max >= constraintWidgetArr5.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget3 = constraintWidgetArr5[max];
                    this.I0.v0.remove(constraintWidget3);
                    constraintWidget3.H();
                    max++;
                }
                this.J0 = constraintWidgetArr3;
            }
            int[][] iArr = this.b1;
            if (iArr != null) {
                h0(iArr);
            }
        }
        androidx.constraintlayout.core.widgets.d dVar = this.I0;
        ConstraintWidget[] constraintWidgetArr6 = this.J0;
        dVar.getClass();
        for (ConstraintWidget constraintWidget4 : constraintWidgetArr6) {
            dVar.c(constraintWidget4);
        }
    }

    public final void d0(ConstraintWidget constraintWidget, int i, int i2, int i3, int i4) {
        constraintWidget.K.a(this.J0[i2].K, 0);
        constraintWidget.L.a(this.J0[i].L, 0);
        constraintWidget.M.a(this.J0[(i2 + i4) - 1].M, 0);
        constraintWidget.N.a(this.J0[(i + i3) - 1].N, 0);
    }

    public final int e0(int i) {
        return this.V0 == 1 ? i / this.L0 : i % this.N0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void f(@Nullable androidx.constraintlayout.core.c cVar, boolean z) {
        int i;
        int i2;
        int[][] iArr;
        int i3;
        super.f(cVar, z);
        int max = Math.max(this.L0, this.N0);
        ConstraintWidget constraintWidget = this.J0[0];
        float[] l0 = l0(this.L0, this.R0);
        int i4 = this.L0;
        ConstraintAnchor constraintAnchor = this.N;
        ConstraintAnchor constraintAnchor2 = this.L;
        if (i4 == 1) {
            c0(constraintWidget);
            constraintWidget.L.a(constraintAnchor2, 0);
            constraintWidget.N.a(constraintAnchor, 0);
        } else {
            int i5 = 0;
            while (true) {
                i = this.L0;
                if (i5 >= i) {
                    break;
                }
                ConstraintWidget constraintWidget2 = this.J0[i5];
                c0(constraintWidget2);
                ConstraintAnchor constraintAnchor3 = constraintWidget2.N;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.L;
                if (l0 != null) {
                    constraintWidget2.o0[1] = l0[i5];
                }
                if (i5 > 0) {
                    constraintAnchor4.a(this.J0[i5 - 1].N, 0);
                } else {
                    constraintAnchor4.a(constraintAnchor2, 0);
                }
                if (i5 < this.L0 - 1) {
                    constraintAnchor3.a(this.J0[i5 + 1].L, 0);
                } else {
                    constraintAnchor3.a(constraintAnchor, 0);
                }
                if (i5 > 0) {
                    constraintAnchor4.g = (int) this.Q0;
                }
                i5++;
            }
            while (i < max) {
                ConstraintWidget constraintWidget3 = this.J0[i];
                c0(constraintWidget3);
                constraintWidget3.L.a(constraintAnchor2, 0);
                constraintWidget3.N.a(constraintAnchor, 0);
                i++;
            }
        }
        int max2 = Math.max(this.L0, this.N0);
        ConstraintWidget constraintWidget4 = this.J0[0];
        float[] l02 = l0(this.N0, this.S0);
        int i6 = this.N0;
        ConstraintAnchor constraintAnchor5 = this.M;
        ConstraintAnchor constraintAnchor6 = this.K;
        if (i6 == 1) {
            constraintWidget4.o0[0] = -1.0f;
            constraintWidget4.K.j();
            constraintWidget4.M.j();
            constraintWidget4.K.a(constraintAnchor6, 0);
            constraintWidget4.M.a(constraintAnchor5, 0);
        } else {
            int i7 = 0;
            while (true) {
                i2 = this.N0;
                if (i7 >= i2) {
                    break;
                }
                ConstraintWidget constraintWidget5 = this.J0[i7];
                constraintWidget5.o0[0] = -1.0f;
                constraintWidget5.K.j();
                constraintWidget5.M.j();
                ConstraintAnchor constraintAnchor7 = constraintWidget5.M;
                ConstraintAnchor constraintAnchor8 = constraintWidget5.K;
                if (l02 != null) {
                    constraintWidget5.o0[0] = l02[i7];
                }
                if (i7 > 0) {
                    constraintAnchor8.a(this.J0[i7 - 1].M, 0);
                } else {
                    constraintAnchor8.a(constraintAnchor6, 0);
                }
                if (i7 < this.N0 - 1) {
                    constraintAnchor7.a(this.J0[i7 + 1].K, 0);
                } else {
                    constraintAnchor7.a(constraintAnchor5, 0);
                }
                if (i7 > 0) {
                    constraintAnchor8.g = (int) this.P0;
                }
                i7++;
            }
            while (i2 < max2) {
                ConstraintWidget constraintWidget6 = this.J0[i2];
                constraintWidget6.o0[0] = -1.0f;
                constraintWidget6.K.j();
                constraintWidget6.M.j();
                constraintWidget6.K.a(constraintAnchor6, 0);
                constraintWidget6.M.a(constraintAnchor5, 0);
                i2++;
            }
        }
        for (int i8 = 0; i8 < this.w0; i8++) {
            if (!this.Y0.contains(this.v0[i8].k)) {
                boolean z2 = false;
                int i9 = 0;
                while (true) {
                    if (z2) {
                        break;
                    }
                    i9 = this.W0;
                    if (i9 >= this.L0 * this.N0) {
                        i9 = -1;
                        break;
                    }
                    int f0 = f0(i9);
                    int e0 = e0(this.W0);
                    boolean[] zArr = this.X0[f0];
                    if (zArr[e0]) {
                        zArr[e0] = false;
                        z2 = true;
                    }
                    this.W0++;
                }
                int f02 = f0(i9);
                int e02 = e0(i9);
                if (i9 == -1) {
                    return;
                }
                if ((this.a1 & 2) > 0 && (iArr = this.b1) != null && (i3 = this.c1) < iArr.length) {
                    int[] iArr2 = iArr[i3];
                    if (iArr2[0] == i9) {
                        this.X0[f02][e02] = true;
                        if (j0(f02, e02, iArr2[1], iArr2[2])) {
                            ConstraintWidget constraintWidget7 = this.v0[i8];
                            int[] iArr3 = this.b1[this.c1];
                            d0(constraintWidget7, f02, e02, iArr3[1], iArr3[2]);
                            this.c1++;
                        }
                    }
                }
                d0(this.v0[i8], f02, e02, 1, 1);
            }
        }
    }

    public final int f0(int i) {
        return this.V0 == 1 ? i % this.L0 : i / this.N0;
    }

    public final void g0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!j0(f0(iArr2[0]), e0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void h0(int[][] iArr) {
        if ((this.a1 & 2) > 0) {
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            int f0 = f0(iArr[i][0]);
            int e0 = e0(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!j0(f0, e0, iArr2[1], iArr2[2])) {
                break;
            }
            ConstraintWidget constraintWidget = this.v0[i];
            int[] iArr3 = iArr[i];
            d0(constraintWidget, f0, e0, iArr3[1], iArr3[2]);
            this.Y0.add(this.v0[i].k);
        }
    }

    public final void i0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.L0, this.N0);
        this.X0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.w0;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.Z0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean j0(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.X0;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ee, code lost:
    
        if (r11.K0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
    
        r13 = r11.N0 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r13 <= 50) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
    
        if (r11.O0 != r13) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        r11.O0 = r13;
        m0();
        i0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[][] k0(String str, boolean z) {
        int i;
        try {
            String[] split = str.split(StringUtils.COMMA);
            Arrays.sort(split, new ifu(0));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, split.length, 3);
            if (this.L0 != 1 && this.N0 != 1) {
                for (int i2 = 0; i2 < split.length; i2++) {
                    String[] split2 = split[i2].trim().split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    String[] split3 = split2[1].split("x");
                    iArr[i2][0] = Integer.parseInt(split2[0]);
                    if ((this.a1 & 1) > 0) {
                        iArr[i2][1] = Integer.parseInt(split3[1]);
                        iArr[i2][2] = Integer.parseInt(split3[0]);
                    } else {
                        iArr[i2][1] = Integer.parseInt(split3[0]);
                        iArr[i2][2] = Integer.parseInt(split3[1]);
                    }
                }
                return iArr;
            }
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < split.length; i5++) {
                String[] split4 = split[i5].trim().split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                iArr[i5][0] = Integer.parseInt(split4[0]);
                int[] iArr2 = iArr[i5];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.N0 == 1) {
                    iArr2[1] = Integer.parseInt(split4[1]);
                    i3 += iArr[i5][1];
                    if (z) {
                        i3--;
                    }
                }
                if (this.L0 == 1) {
                    iArr[i5][2] = Integer.parseInt(split4[1]);
                    i4 += iArr[i5][2];
                    if (z) {
                        i4--;
                    }
                }
            }
            if (i3 != 0 && !this.K0 && (i = this.L0 + i3) <= 50 && this.M0 != i) {
                this.M0 = i;
                m0();
                i0();
            }
            this.K0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void m0() {
        int i;
        int i2 = this.M0;
        if (i2 != 0 && (i = this.O0) != 0) {
            this.L0 = i2;
            this.N0 = i;
            return;
        }
        int i3 = this.O0;
        if (i3 > 0) {
            this.N0 = i3;
            this.L0 = ((this.w0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.L0 = i2;
            this.N0 = ((this.w0 + i2) - 1) / i2;
        } else {
            int sqrt = (int) (Math.sqrt(this.w0) + 1.5d);
            this.L0 = sqrt;
            this.N0 = ((this.w0 + sqrt) - 1) / sqrt;
        }
    }
}
