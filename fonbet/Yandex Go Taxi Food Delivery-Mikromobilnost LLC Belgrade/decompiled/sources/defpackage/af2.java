package defpackage;

import androidx.compose.animation.tooling.ComposeAnimation;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class af2 extends xz4 {
    @Override // defpackage.eup0
    public final ComposeAnimation I() {
        xe2 xe2Var;
        Object c;
        zx01 zx01Var = (zx01) this.a;
        if (xe2.b && (c = zx01Var.c()) != null) {
            Object[] enumConstants = c.getClass().getEnumConstants();
            if (enumConstants != null) {
                j73.f0(enumConstants);
            } else {
                Collections.singleton(c);
            }
            getLabel();
            xe2Var = new xe2(zx01Var);
        } else {
            xe2Var = null;
        }
        return xe2Var;
    }

    @Override // defpackage.eup0
    public final rfd b(ComposeAnimation composeAnimation, v5c0 v5c0Var) {
        return new jg2((xe2) composeAnimation);
    }

    @Override // defpackage.eup0
    public final String getLabel() {
        String str = ((zx01) this.a).c;
        return str == null ? "AnimatedContent" : str;
    }
}
