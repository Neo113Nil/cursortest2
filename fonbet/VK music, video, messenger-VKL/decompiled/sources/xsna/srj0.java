package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import xsna.tra0;

/* compiled from: MeasureScope.kt */
/* loaded from: classes11.dex */
public final class srj0 extends tra0.a {
    public final int c;
    public final LayoutDirection d;
    public final float e;
    public final float f;

    public srj0(int i, LayoutDirection layoutDirection, float f, float f2) {
        this.c = i;
        this.d = layoutDirection;
        this.e = f;
        this.f = f2;
    }

    @Override // xsna.tra0.a, xsna.azl
    public final float getDensity() {
        return this.e;
    }

    @Override // xsna.tra0.a, xsna.azl
    public final float getFontScale() {
        return this.f;
    }

    @Override // xsna.tra0.a
    public final LayoutDirection k() {
        return this.d;
    }

    @Override // xsna.tra0.a
    public final int p() {
        return this.c;
    }
}
