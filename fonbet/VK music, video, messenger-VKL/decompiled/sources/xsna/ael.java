package xsna;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ElevationOverlay.kt */
/* loaded from: classes11.dex */
public final class ael implements gbp {
    public static final ael a = new ael();

    @Override // xsna.gbp
    public final long a(long j, float f, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-1687113661);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1687113661, i, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
        }
        k9g k9gVar = (k9g) aVar.r(l9g.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (pco.a(f, 0) <= 0 || k9gVar.d()) {
            aVar.K(-1095489470);
            aVar.j();
        } else {
            aVar.K(-1095627978);
            int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            iyk0 iyk0Var = hbp.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1613340891, i2, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:85)");
            }
            long c = l5g.c(14, l9g.a(i & 14, j, aVar), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = f870.i(c, j);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }
}
