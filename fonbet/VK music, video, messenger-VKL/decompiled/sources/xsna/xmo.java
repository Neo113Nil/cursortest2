package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;

/* compiled from: InternalDropdown.kt */
/* loaded from: classes17.dex */
public final class xmo implements fxb0 {
    public final long b;
    public final azl c;
    public final o21 d;

    public xmo() {
        throw null;
    }

    public xmo(long j, azl azlVar, o21 o21Var) {
        this.b = j;
        this.c = azlVar;
        this.d = o21Var;
    }

    @Override // xsna.fxb0
    public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
        uki0 D;
        Object obj;
        Object obj2;
        float f = lqu0.a;
        azl azlVar = this.c;
        int r0 = azlVar.r0(f);
        long j3 = this.b;
        int r02 = azlVar.r0(rco.a(j3));
        int r03 = azlVar.r0(rco.b(j3));
        int i = l9xVar.a;
        int i2 = l9xVar.b;
        int i3 = i + r02;
        int i4 = l9xVar.c;
        int i5 = (int) (j2 >> 32);
        int i6 = (i4 - r02) - i5;
        int i7 = (int) (j >> 32);
        int i8 = i7 - i5;
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer valueOf = Integer.valueOf(i3);
            Integer valueOf2 = Integer.valueOf(i6);
            if (i < 0) {
                i8 = 0;
            }
            D = rl3.D(new Integer[]{valueOf, valueOf2, Integer.valueOf(i8)});
        } else {
            Integer valueOf3 = Integer.valueOf(i6);
            Integer valueOf4 = Integer.valueOf(i3);
            if (i4 <= i7) {
                i8 = 0;
            }
            D = rl3.D(new Integer[]{valueOf3, valueOf4, Integer.valueOf(i8)});
        }
        Iterator it = D.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue >= 0 && intValue + i5 <= i7) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            i6 = num.intValue();
        }
        int max = Math.max(l9xVar.d + r03, r0);
        int i9 = (int) (j2 & 4294967295L);
        int i10 = (i2 - r03) - i9;
        int i11 = (int) (j & 4294967295L);
        Iterator it2 = rl3.D(new Integer[]{Integer.valueOf(max), Integer.valueOf(i10), Integer.valueOf(i2 - (i9 / 2)), Integer.valueOf((i11 - i9) - r0)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= r0 && intValue2 + i9 <= i11 - r0) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            i10 = num2.intValue();
        }
        o21 o21Var = this.d;
        izs izsVar = (izs) o21Var.c;
        wh50 wh50Var = (wh50) o21Var.d;
        boolean z = i2 > i10;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(z));
        }
        wh50Var.setValue(Boolean.valueOf(z));
        s3q0 s3q0Var = s3q0.a;
        return (i6 << 32) | (i10 & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xmo) {
            xmo xmoVar = (xmo) obj;
            if (this.b == xmoVar.b && epx.f(this.c, xmoVar.c) && epx.f(this.d, xmoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(0, (this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) rco.d(this.b)) + ", density=" + this.c + ", horizontalSafeZone=0, onPositionCalculated=" + this.d + ')';
    }
}
