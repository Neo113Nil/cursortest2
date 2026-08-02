package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import xsna.tra0;

/* compiled from: Placeable.kt */
/* loaded from: classes11.dex */
public final class v090 extends tra0.a {
    public final androidx.compose.ui.node.p c;

    public v090(androidx.compose.ui.node.p pVar) {
        this.c = pVar;
    }

    @Override // xsna.tra0.a, xsna.azl
    public final float getDensity() {
        return this.c.getDensity().getDensity();
    }

    @Override // xsna.tra0.a, xsna.azl
    public final float getFontScale() {
        return this.c.getDensity().getFontScale();
    }

    @Override // xsna.tra0.a
    public final LayoutDirection k() {
        return this.c.getLayoutDirection();
    }

    @Override // xsna.tra0.a
    public final int p() {
        return this.c.getRoot().H.p.b;
    }
}
