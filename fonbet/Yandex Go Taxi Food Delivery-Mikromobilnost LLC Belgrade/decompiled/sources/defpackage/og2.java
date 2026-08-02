package defpackage;

import androidx.compose.animation.tooling.ComposeAnimation;

/* loaded from: classes10.dex */
public final class og2 implements eup0 {
    public final zx01 a;
    public final zx01 b;

    public og2(zx01 zx01Var) {
        this.a = zx01Var;
        this.b = zx01Var;
        ((Boolean) zx01Var.d.getValue()).getClass();
        ((Boolean) zx01Var.d.getValue()).getClass();
    }

    @Override // defpackage.eup0
    public final ComposeAnimation I() {
        zx01 zx01Var = this.a;
        String str = zx01Var.c;
        return new kg2(zx01Var);
    }

    @Override // defpackage.eup0
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.eup0
    public final rfd b(ComposeAnimation composeAnimation, v5c0 v5c0Var) {
        ((sxe0) v5c0Var.b).a.invoke();
        jg2 jg2Var = new jg2((kg2) composeAnimation);
        jg2Var.b();
        return jg2Var;
    }

    @Override // defpackage.eup0
    public final String getLabel() {
        String str = this.a.c;
        return str == null ? "AnimatedVisibility" : str;
    }
}
