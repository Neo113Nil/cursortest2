package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: LazyListSnapLayoutInfoProvider.kt */
/* loaded from: classes11.dex */
public final class qvy implements v9k0 {
    public final /* synthetic */ xvy a;
    public final /* synthetic */ x9k0 b;

    public qvy(xvy xvyVar, x9k0 x9k0Var) {
        this.a = xvyVar;
        this.b = x9k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (java.lang.Math.abs(r9) <= java.lang.Math.abs(r8)) goto L41;
     */
    @Override // xsna.v9k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        xvy xvyVar = this.a;
        List<xuy> f2 = xvyVar.j().f();
        int size = f2.size();
        float f3 = Float.POSITIVE_INFINITY;
        float f4 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            xuy xuyVar = f2.get(i);
            rty rtyVar = xuyVar instanceof rty ? (rty) xuyVar : null;
            if (rtyVar == null || !rtyVar.g()) {
                fvy j = xvyVar.j();
                int a = (int) (j.getOrientation() == Orientation.Vertical ? j.a() & 4294967295L : j.a() >> 32);
                int b = xvyVar.j().b();
                int c = xvyVar.j().c();
                int size2 = xuyVar.getSize();
                int offset = xuyVar.getOffset();
                xvyVar.j().d();
                float d = offset - this.b.d(a, size2, b, c);
                if (d <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && d > f4) {
                    f4 = d;
                }
                if (d >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && d < f3) {
                    f3 = d;
                }
            }
        }
        char c2 = Math.abs(f) >= ((hvy) ((zak0) xvyVar.f).getValue()).i.I0(r9k0.a) ? f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (char) 1 : (char) 2 : (char) 0;
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
                    f4 = 0.0f;
                }
            }
            f4 = f3;
        }
        return (f4 == Float.POSITIVE_INFINITY || f4 == Float.NEGATIVE_INFINITY) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f4;
    }

    @Override // xsna.v9k0
    public final float b(float f, float f2) {
        float abs = Math.abs(f2);
        fvy j = this.a.j();
        int i = 0;
        if (!j.f().isEmpty()) {
            int size = j.f().size();
            List<xuy> f3 = j.f();
            int size2 = f3.size();
            int i2 = 0;
            while (i < size2) {
                i2 += f3.get(i).getSize();
                i++;
            }
            i = i2 / size;
        }
        float f4 = abs - i;
        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 = 0.0f;
        }
        return Math.signum(f2) * f4;
    }
}
