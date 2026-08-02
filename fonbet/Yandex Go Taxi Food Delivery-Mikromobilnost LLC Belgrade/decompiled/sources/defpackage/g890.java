package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.d;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;

/* loaded from: classes10.dex */
public final class g890 implements vk6 {
    public final d b;
    public final vk6 c;
    public final LayoutDirection d;

    public g890(d dVar, vk6 vk6Var, LayoutDirection layoutDirection) {
        this.b = dVar;
        this.c = vk6Var;
        this.d = layoutDirection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r8 + r9) > r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x001b, code lost:
    
        if (r8 <= 1.0f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r3 = true;
     */
    @Override // defpackage.vk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3) {
        int i;
        int q;
        int i2;
        float a = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            Map map = jx31.a;
        }
        float abs = Math.abs(a);
        LayoutDirection layoutDirection = this.d;
        d dVar = this.b;
        if (abs != 0.0f && z) {
            if (layoutDirection == LayoutDirection.Rtl && dVar.n().e == Orientation.Horizontal) {
                i2 = dVar.q() + (-dVar.f);
            } else {
                i2 = dVar.f;
            }
            float f5 = i2 * (-1.0f);
            while (a > 0.0f && f5 < a) {
                f5 += dVar.q();
            }
            while (a < 0.0f && f5 > a) {
                f5 -= dVar.q();
            }
            return f5;
        }
        if (Math.abs(dVar.f) < 1.0E-6d) {
            return 0.0f;
        }
        LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
        if (layoutDirection == layoutDirection2 && dVar.n().e == Orientation.Horizontal) {
            i = dVar.q() + (-dVar.f);
        } else {
            i = dVar.f;
        }
        float f6 = i * (-1.0f);
        if (layoutDirection == layoutDirection2 && dVar.n().e == Orientation.Horizontal) {
            if (!dVar.m()) {
                q = dVar.q();
                f6 += q;
            }
            return y6i0.c(f6, -f3, f3);
        }
        if (dVar.m()) {
            q = dVar.q();
            f6 += q;
        }
        return y6i0.c(f6, -f3, f3);
    }
}
