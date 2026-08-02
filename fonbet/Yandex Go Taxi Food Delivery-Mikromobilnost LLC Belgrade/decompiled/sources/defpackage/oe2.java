package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.animation.tooling.ComposeAnimation;

/* loaded from: classes10.dex */
public final class oe2 implements eup0 {
    public final a a;
    public final jj2 b;
    public final c1x0 c;
    public final a w;

    public oe2(a aVar, jj2 jj2Var, c1x0 c1x0Var) {
        this.a = aVar;
        this.b = jj2Var;
        this.c = c1x0Var;
        this.w = aVar;
    }

    @Override // defpackage.eup0
    public final ComposeAnimation I() {
        ne2 ne2Var;
        if (ne2.d) {
            a aVar = this.a;
            if (aVar.e() != null) {
                ne2Var = new ne2((ztz0) this.c.a, this.b, aVar);
                return ne2Var;
            }
        }
        ne2Var = null;
        return ne2Var;
    }

    @Override // defpackage.eup0
    public final Object a() {
        return this.w;
    }

    @Override // defpackage.eup0
    public final rfd b(ComposeAnimation composeAnimation, v5c0 v5c0Var) {
        return new me2((ne2) composeAnimation);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oe2) {
            oe2 oe2Var = (oe2) obj;
            return this.a == oe2Var.a && this.b.equals(oe2Var.b) && this.c == oe2Var.c;
        }
        return false;
    }

    @Override // defpackage.eup0
    public final String getLabel() {
        return this.a.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AnimateXAsStateSearchInfo(animatable=" + this.a + ", animationSpec=" + this.b + ", toolingOverride=" + this.c + ')';
    }
}
