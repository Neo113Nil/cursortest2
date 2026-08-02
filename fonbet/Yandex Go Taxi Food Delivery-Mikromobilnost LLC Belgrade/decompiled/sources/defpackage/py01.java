package defpackage;

import androidx.compose.animation.tooling.ComposeAnimation;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class py01 extends xz4 {
    @Override // defpackage.eup0
    public final ComposeAnimation I() {
        ey01 ey01Var;
        zx01 zx01Var = (zx01) this.a;
        Object c = zx01Var.c();
        if (c != null) {
            Object[] enumConstants = c.getClass().getEnumConstants();
            if (enumConstants != null) {
                j73.f0(enumConstants);
            } else {
                Collections.singleton(c);
            }
            getLabel();
            ey01Var = new ey01(zx01Var);
        } else {
            ey01Var = null;
        }
        return ey01Var;
    }

    @Override // defpackage.eup0
    public final rfd b(ComposeAnimation composeAnimation, v5c0 v5c0Var) {
        return new jg2((ey01) composeAnimation);
    }

    @Override // defpackage.eup0
    public final String getLabel() {
        zx01 zx01Var = (zx01) this.a;
        String str = zx01Var.c;
        if (str == null) {
            Object value = zx01Var.d.getValue();
            if (value == null) {
                value = null;
            }
            str = value != null ? qoi0.a(value.getClass()).d() : null;
            if (str == null) {
                return "updateTransition";
            }
        }
        return str;
    }
}
