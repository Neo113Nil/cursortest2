package xsna;

import androidx.compose.material.DrawerValue;

/* compiled from: Drawer.kt */
/* loaded from: classes11.dex */
public final class klo {
    public final c12<DrawerValue> a;

    public klo(DrawerValue drawerValue, izs<? super DrawerValue, Boolean> izsVar) {
        this.a = new c12<>(drawerValue, new vfk(this, 6), new ecm(this, 4), jlo.c, izsVar);
    }

    public final azl a() {
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }
}
