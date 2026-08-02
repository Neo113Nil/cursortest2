package androidx.compose.ui.layout;

import androidx.compose.ui.layout.o;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class m extends o.a {
    public final AndroidComposeView b;

    public m(AndroidComposeView androidComposeView) {
        this.b = androidComposeView;
    }

    @Override // androidx.compose.ui.layout.o.a
    public final LayoutDirection d() {
        return this.b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.o.a
    public final int e() {
        return this.b.getRoot().v();
    }

    @Override // androidx.compose.ui.layout.o.a, defpackage.fwi
    public final float getDensity() {
        return this.b.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.o.a, defpackage.fwi
    public final float u0() {
        return this.b.getDensity().u0();
    }
}
