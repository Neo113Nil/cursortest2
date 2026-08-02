package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: OverflowFlowRow.kt */
/* loaded from: classes18.dex */
public final class x190 {
    public static final void a(final jai jaiVar, q630 q630Var, final int i, float f, float f2, final t190 t190Var, y190 y190Var, jai jaiVar2, androidx.compose.runtime.a aVar, final int i2) {
        final q630 q630Var2;
        int i3;
        float f3;
        float f4;
        y190 y190Var2;
        final jai jaiVar3;
        androidx.compose.runtime.a M = aVar.M(-470608339);
        if ((i2 & 48) == 0) {
            q630Var2 = q630Var;
            i3 = i2 | (M.J(q630Var2) ? 32 : 16);
        } else {
            q630Var2 = q630Var;
            i3 = i2;
        }
        int i4 = i3 | (M.o(i) ? 256 : 128);
        if ((i2 & 196608) == 0) {
            i4 |= M.J(t190Var) ? 131072 : 65536;
        }
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-470608339, i4, -1, "com.vk.donut.design.compose.banner.utils.OverflowFlowRowWithIndicator (OverflowFlowRow.kt:36)");
            }
            iyk0 iyk0Var = uvi.h;
            f3 = f;
            int r0 = ((azl) M.r(iyk0Var)).r0(f3);
            f4 = f2;
            int r02 = ((azl) M.r(iyk0Var)).r0(f4);
            LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
            boolean o = ((i4 & 896) == 256) | M.o(r0) | M.o(r02) | ((i4 & 458752) == 131072) | M.o(layoutDirection.ordinal());
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = new u190(i, new khk0(r0, r02), t190Var, layoutDirection);
                M.R(x);
            }
            u190 u190Var = (u190) x;
            q630 e = rte0.e(q630Var2);
            boolean J = M.J(u190Var);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                y190Var2 = y190Var;
                jaiVar3 = jaiVar2;
                x2 = new m8k(jaiVar3, u190Var, jaiVar, y190Var2);
                M.R(x2);
            } else {
                y190Var2 = y190Var;
                jaiVar3 = jaiVar2;
            }
            xtm0.a(e, (wzs) x2, M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            f3 = f;
            f4 = f2;
            y190Var2 = y190Var;
            jaiVar3 = jaiVar2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final y190 y190Var3 = y190Var2;
            final float f5 = f3;
            final float f6 = f4;
            s.d = new wzs() { // from class: xsna.v190
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x190.a(jai.this, q630Var2, i, f5, f6, t190Var, y190Var3, jaiVar3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
