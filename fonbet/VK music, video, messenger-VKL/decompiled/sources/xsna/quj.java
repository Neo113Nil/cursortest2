package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CornerBasedShape.kt */
/* loaded from: classes11.dex */
public abstract class quj implements r5j0 {
    public final vuj a;
    public final vuj b;
    public final vuj c;
    public final vuj d;

    public quj(vuj vujVar, vuj vujVar2, vuj vujVar3, vuj vujVar4) {
        this.a = vujVar;
        this.b = vujVar2;
        this.c = vujVar3;
        this.d = vujVar4;
    }

    public static /* synthetic */ quj c(quj qujVar, vuj vujVar, vuj vujVar2, vuj vujVar3, vuj vujVar4, int i) {
        if ((i & 1) != 0) {
            vujVar = qujVar.a;
        }
        if ((i & 2) != 0) {
            vujVar2 = qujVar.b;
        }
        if ((i & 4) != 0) {
            vujVar3 = qujVar.c;
        }
        if ((i & 8) != 0) {
            vujVar4 = qujVar.d;
        }
        return qujVar.b(vujVar, vujVar2, vujVar3, vujVar4);
    }

    @Override // xsna.r5j0
    public final androidx.compose.ui.graphics.c a(long j, LayoutDirection layoutDirection, azl azlVar) {
        float a = this.a.a(j, azlVar);
        float a2 = this.b.a(j, azlVar);
        float a3 = this.c.a(j, azlVar);
        float a4 = this.d.a(j, azlVar);
        float c = mxj0.c(j);
        float f = a + a4;
        if (f > c) {
            float f2 = c / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > c) {
            float f4 = c / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || a2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || a3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || a4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            StringBuilder a5 = bxj0.a("Corner size in Px can't be negative(topStart = ", a, ", topEnd = ", a2, ", bottomEnd = ");
            a5.append(a3);
            a5.append(", bottomStart = ");
            a5.append(a4);
            a5.append(")!");
            xzw.a(a5.toString());
        }
        return d(j, a, a2, a3, a4, layoutDirection);
    }

    public abstract uog0 b(vuj vujVar, vuj vujVar2, vuj vujVar3, vuj vujVar4);

    public abstract androidx.compose.ui.graphics.c d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);
}
