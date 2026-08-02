package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.EmptyList;
import xsna.o6j;
import xsna.v4s;

/* compiled from: TextMeasurer.kt */
/* loaded from: classes11.dex */
public final class wjo0 {
    public final v4s.a a;
    public final azl b;
    public final LayoutDirection c;
    public final rw0 d;

    public wjo0(v4s.a aVar, azl azlVar, LayoutDirection layoutDirection, int i) {
        this.a = aVar;
        this.b = azlVar;
        this.c = layoutDirection;
        this.d = i > 0 ? new rw0(i) : null;
    }

    public static ljo0 a(wjo0 wjo0Var, String str, nmo0 nmo0Var, int i, long j, int i2) {
        int i3 = (i2 & 4) != 0 ? 1 : 2;
        int i4 = (i2 & 16) != 0 ? Integer.MAX_VALUE : i;
        long b = (i2 & 32) != 0 ? s6j.b(0, 0, 0, 0, 15) : j;
        LayoutDirection layoutDirection = wjo0Var.c;
        azl azlVar = wjo0Var.b;
        v4s.a aVar = wjo0Var.a;
        wjo0Var.getClass();
        return b(wjo0Var, new us2(str), nmo0Var, i3, true, i4, b, layoutDirection, azlVar, aVar, 32);
    }

    public static ljo0 b(wjo0 wjo0Var, us2 us2Var, nmo0 nmo0Var, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, azl azlVar, v4s.a aVar, int i3) {
        ljo0 ljo0Var;
        EmptyList emptyList = EmptyList.b;
        LayoutDirection layoutDirection2 = (i3 & 128) != 0 ? wjo0Var.c : layoutDirection;
        azl azlVar2 = (i3 & 256) != 0 ? wjo0Var.b : azlVar;
        v4s.a aVar2 = (i3 & 512) != 0 ? wjo0Var.a : aVar;
        rw0 rw0Var = wjo0Var.d;
        azl azlVar3 = azlVar2;
        v4s.a aVar3 = aVar2;
        kjo0 kjo0Var = new kjo0(us2Var, nmo0Var, emptyList, i2, z, i, azlVar3, layoutDirection2, aVar3, j);
        ljo0 ljo0Var2 = null;
        if (rw0Var != null) {
            vx8 vx8Var = new vx8(kjo0Var);
            m900 m900Var = (m900) rw0Var.a;
            if (m900Var != null) {
                ljo0Var = (ljo0) m900Var.get(vx8Var);
            } else if (epx.f((vx8) rw0Var.b, vx8Var)) {
                ljo0Var = (ljo0) rw0Var.c;
            }
            if (ljo0Var != null && !ljo0Var.b.a.b()) {
                ljo0Var2 = ljo0Var;
            }
        }
        if (ljo0Var2 != null) {
            return new ljo0(kjo0Var, ljo0Var2.b, s6j.d(j, (((int) Math.ceil(r14.e)) & 4294967295L) | (((int) Math.ceil(r14.d)) << 32)));
        }
        n540 n540Var = new n540(us2Var, tmo0.a(nmo0Var, layoutDirection2), emptyList, azlVar3, aVar3);
        int k = o6j.k(j);
        int i4 = ((z || i == 2 || i == 4 || i == 5) && o6j.e(j)) ? o6j.i(j) : Integer.MAX_VALUE;
        int i5 = (z || !(i == 2 || i == 4 || i == 5)) ? i2 : 1;
        if (k != i4) {
            i4 = swe0.g((int) Math.ceil(n540Var.a()), k, i4);
        }
        ljo0 ljo0Var3 = new ljo0(kjo0Var, new m540(n540Var, o6j.a.b(0, i4, 0, o6j.h(j)), i5, i), s6j.d(j, (((int) Math.ceil(r0.e)) & 4294967295L) | (((int) Math.ceil(r0.d)) << 32)));
        if (rw0Var != null) {
            m900 m900Var2 = (m900) rw0Var.a;
            if (m900Var2 != null) {
                m900Var2.put(new vx8(kjo0Var), ljo0Var3);
                return ljo0Var3;
            }
            rw0Var.b = new vx8(kjo0Var);
            rw0Var.c = ljo0Var3;
        }
        return ljo0Var3;
    }
}
