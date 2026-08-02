package xsna;

import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClipScrollableContainer.kt */
/* loaded from: classes11.dex */
public final class cpr0 implements r5j0 {
    public static final cpr0 a = new cpr0();

    @Override // xsna.r5j0
    public final androidx.compose.ui.graphics.c a(long j, LayoutDirection layoutDirection, azl azlVar) {
        float r0 = azlVar.r0(ubd.a);
        return new c.b(new zhf0(-r0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (j >> 32)) + r0, Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
