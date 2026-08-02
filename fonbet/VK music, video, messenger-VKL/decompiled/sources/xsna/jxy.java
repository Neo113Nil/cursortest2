package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dak0;

/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
/* loaded from: classes11.dex */
public final class jxy implements oty {
    public final /* synthetic */ uxy a;
    public final /* synthetic */ Orientation b;
    public final /* synthetic */ yry c;
    public final /* synthetic */ gzs<uwy> d;
    public final /* synthetic */ u890 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ yvj g;
    public final /* synthetic */ kdu h;

    public jxy(uxy uxyVar, Orientation orientation, yry yryVar, rcy rcyVar, u890 u890Var, float f, yvj yvjVar, kdu kduVar) {
        this.a = uxyVar;
        this.b = orientation;
        this.c = yryVar;
        this.d = rcyVar;
        this.e = u890Var;
        this.f = f;
        this.g = yvjVar;
        this.h = kduVar;
    }

    @Override // xsna.oty
    public final dp10 a(qty qtyVar, long j) {
        float f;
        float f2;
        float s;
        sxy sxyVar;
        long j2;
        int c;
        ztm0 ztm0Var = qtyVar.c;
        u890 u890Var = this.e;
        float f3 = u890Var.d;
        float f4 = u890Var.b;
        uxy uxyVar = this.a;
        uxyVar.v.getValue();
        boolean z = uxyVar.a || ztm0Var.z1();
        Orientation orientation = this.b;
        rdi.n(j, orientation);
        sxy a = this.c.a(qtyVar, j);
        boolean z2 = orientation == Orientation.Vertical;
        uwy invoke = this.d.invoke();
        LayoutDirection layoutDirection = ztm0Var.getLayoutDirection();
        int[] iArr = ixy.$EnumSwitchMapping$0;
        int i = iArr[orientation.ordinal()];
        if (i == 1) {
            f = f4;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = s200.s(u890Var, layoutDirection);
        }
        int r0 = ztm0Var.r0(f);
        LayoutDirection layoutDirection2 = ztm0Var.getLayoutDirection();
        int i2 = iArr[orientation.ordinal()];
        if (i2 == 1) {
            f2 = f3;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = s200.r(u890Var, layoutDirection2);
        }
        int r02 = ztm0Var.r0(f2);
        LayoutDirection layoutDirection3 = ztm0Var.getLayoutDirection();
        int i3 = iArr[orientation.ordinal()];
        if (i3 == 1) {
            s = s200.s(u890Var, layoutDirection3);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            s = f4;
        }
        int r03 = ztm0Var.r0(s);
        int h = ((z2 ? o6j.h(j) : o6j.i(j)) - r0) - r02;
        if (z2) {
            j2 = (r03 << 32) | (r0 & 4294967295L);
            sxyVar = a;
        } else {
            sxyVar = a;
            j2 = (r0 << 32) | (r03 & 4294967295L);
        }
        long j3 = j2;
        int r04 = ztm0Var.r0(s200.r(u890Var, ztm0Var.getLayoutDirection()) + s200.s(u890Var, ztm0Var.getLayoutDirection()));
        int r05 = ztm0Var.r0(f3 + f4);
        List<Integer> a2 = usy.a(invoke, uxyVar.s, uxyVar.k);
        long b = o6j.b(s6j.g(r04, j), j, 0, s6j.f(r05, j), 0, 10);
        int r06 = ztm0Var.r0(this.f);
        boolean z1 = ztm0Var.z1();
        lxy lxyVar = uxyVar.b;
        exy exyVar = new exy(uxyVar, a2, invoke, sxyVar, b, z2, qtyVar, h, j3, r0, r02, r06, this.g, z, lxyVar != null ? lxyVar.m : null, this.h);
        pxy pxyVar = uxyVar.c;
        int[] iArr2 = pxyVar.b;
        Object obj = pxyVar.g;
        Integer R = rl3.R(0, iArr2);
        int f5 = ine0.f(R != null ? R.intValue() : 0, invoke, obj);
        if (!rl3.E(f5, iArr2)) {
            pxyVar.h.c(f5);
            dak0 a3 = dak0.a.a();
            izs<Object, s3q0> e = a3 != null ? a3.e() : null;
            dak0 b2 = dak0.a.b(a3);
            try {
                iArr2 = (int[]) pxyVar.a.invoke(Integer.valueOf(f5), Integer.valueOf(iArr2.length));
                dak0.a.d(a3, b2, e);
                pxyVar.b = iArr2;
                ((wak0) pxyVar.c).C(pxy.a(iArr2));
            } catch (Throwable th) {
                dak0.a.d(a3, b2, e);
                throw th;
            }
        }
        int[] iArr3 = pxyVar.d;
        int length = iArr2.length;
        int i4 = exyVar.s;
        if (length != i4) {
            bxy bxyVar = exyVar.r;
            bxyVar.g();
            int[] iArr4 = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                if (i5 >= iArr2.length || (c = iArr2[i5]) == -1) {
                    if (i5 == 0) {
                        c = 0;
                    } else {
                        c = hxy.c((0 << 32) | (i5 & 4294967295L), iArr4) + 1;
                        iArr4[i5] = c;
                        bxyVar.i(c, i5);
                    }
                }
                iArr4[i5] = c;
                bxyVar.i(c, i5);
            }
            iArr2 = iArr4;
        }
        if (iArr3.length != i4) {
            int[] iArr5 = new int[i4];
            int i6 = 0;
            while (i6 < i4) {
                iArr5[i6] = i6 < iArr3.length ? iArr3[i6] : i6 == 0 ? 0 : iArr5[i6 - 1];
                i6++;
            }
            iArr3 = iArr5;
        }
        lxy d = hxy.d(exyVar, Math.round((z1 || !uxyVar.a) ? uxyVar.o : ((Number) ((zak0) uxyVar.w.b.c).getValue()).floatValue()), iArr2, iArr3, true);
        uxyVar.f(d, ztm0Var.z1(), false);
        return d;
    }
}
