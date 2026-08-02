package xsna;

import android.view.View;
import android.widget.Magnifier;
import xsna.vta0;

/* compiled from: PlatformMagnifier.android.kt */
/* loaded from: classes11.dex */
public final class wta0 implements uta0 {
    public static final wta0 a = new wta0();

    /* compiled from: PlatformMagnifier.android.kt */
    public static final class a extends vta0.a {
        @Override // xsna.vta0.a, xsna.tta0
        public final void b(long j, long j2, float f) {
            boolean isNaN = Float.isNaN(f);
            Magnifier magnifier = this.a;
            if (!isNaN) {
                magnifier.setZoom(f);
            }
            if ((9223372034707292159L & j2) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
    }

    @Override // xsna.uta0
    public final boolean a() {
        return true;
    }

    @Override // xsna.uta0
    public final tta0 b(View view, boolean z, long j, float f, float f2, boolean z2, azl azlVar, float f3) {
        if (z) {
            return new a(new Magnifier(view));
        }
        long p1 = azlVar.p1(j);
        float I0 = azlVar.I0(f);
        float I02 = azlVar.I0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (p1 != 9205357640488583168L) {
            builder.setSize(an10.b(Float.intBitsToFloat((int) (p1 >> 32))), an10.b(Float.intBitsToFloat((int) (p1 & 4294967295L))));
        }
        if (!Float.isNaN(I0)) {
            builder.setCornerRadius(I0);
        }
        if (!Float.isNaN(I02)) {
            builder.setElevation(I02);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new a(builder.build());
    }
}
