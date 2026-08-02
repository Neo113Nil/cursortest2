package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class f751 extends e751 {
    public f751(n751 n751Var, WindowInsets windowInsets) {
        super(n751Var, windowInsets);
    }

    @Override // defpackage.k751
    public n751 a() {
        return n751.h(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.d751, defpackage.k751
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f751)) {
            return false;
        }
        f751 f751Var = (f751) obj;
        return Objects.equals(this.c, f751Var.c) && Objects.equals(this.g, f751Var.g) && d751.B(this.h, f751Var.h);
    }

    @Override // defpackage.k751
    public bzj f() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new bzj(displayCutout);
    }

    @Override // defpackage.k751
    public int hashCode() {
        return this.c.hashCode();
    }

    public f751(n751 n751Var, f751 f751Var) {
        super(n751Var, f751Var);
    }
}
