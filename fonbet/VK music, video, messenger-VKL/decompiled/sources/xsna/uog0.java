package xsna;

import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RoundedCornerShape.kt */
/* loaded from: classes11.dex */
public final class uog0 extends quj {
    @Override // xsna.quj
    public final uog0 b(vuj vujVar, vuj vujVar2, vuj vujVar3, vuj vujVar4) {
        return new uog0(vujVar, vujVar2, vujVar3, vujVar4);
    }

    @Override // xsna.quj
    public final androidx.compose.ui.graphics.c d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new c.b(p490.e(0L, j));
        }
        zhf0 e = p490.e(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        float f6 = layoutDirection == layoutDirection2 ? f2 : f;
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        float f7 = layoutDirection == layoutDirection2 ? f3 : f4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
        float f8 = layoutDirection == layoutDirection2 ? f4 : f3;
        return new c.C0013c(ne7.e(e, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uog0)) {
            return false;
        }
        uog0 uog0Var = (uog0) obj;
        return epx.f(this.a, uog0Var.a) && epx.f(this.b, uog0Var.b) && epx.f(this.c, uog0Var.c) && epx.f(this.d, uog0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
