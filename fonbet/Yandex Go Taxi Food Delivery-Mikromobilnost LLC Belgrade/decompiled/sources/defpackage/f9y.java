package defpackage;

import androidx.compose.foundation.text.input.internal.a;
import androidx.compose.foundation.text.selection.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf9y;", "Lj530;", "Lg9y;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class f9y extends j530 {
    public final w9y a;
    public final oay b;
    public final j c;

    public f9y(w9y w9yVar, oay oayVar, j jVar) {
        this.a = w9yVar;
        this.b = oayVar;
        this.c = jVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new g9y(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9y)) {
            return false;
        }
        f9y f9yVar = (f9y) obj;
        return jl40.l(this.a, f9yVar.a) && jl40.l(this.b, f9yVar.b) && jl40.l(this.c, f9yVar.c);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        g9y g9yVar = (g9y) e530Var;
        if (g9yVar.isAttached()) {
            ((a) g9yVar.a).a();
            g9yVar.a.j(g9yVar);
        }
        g9yVar.a = this.a;
        if (g9yVar.isAttached()) {
            w9y w9yVar = g9yVar.a;
            if (w9yVar.a != null) {
                lxv.c("Expected textInputModifierNode to be null");
            }
            w9yVar.a = g9yVar;
        }
        g9yVar.b = this.b;
        g9yVar.c = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
