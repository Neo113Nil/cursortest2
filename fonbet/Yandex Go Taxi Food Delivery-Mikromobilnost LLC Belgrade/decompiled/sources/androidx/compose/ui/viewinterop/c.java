package androidx.compose.ui.viewinterop;

import defpackage.e530;
import defpackage.j530;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/viewinterop/c;", "Lj530;", "Landroidx/compose/ui/viewinterop/d;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends j530 {
    public final tls a;

    public c(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new d(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.a == ((c) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        d dVar = (d) e530Var;
        tls tlsVar = this.a;
        dVar.a = tlsVar;
        if (dVar.isAttached()) {
            ((AndroidViewHolder$layoutNode$1$coreModifier$4) tlsVar).invoke(dVar.b);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
