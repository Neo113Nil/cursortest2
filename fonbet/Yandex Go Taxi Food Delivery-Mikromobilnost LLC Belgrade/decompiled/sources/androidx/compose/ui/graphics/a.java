package androidx.compose.ui.graphics;

import androidx.compose.ui.node.s;
import defpackage.e530;
import defpackage.j530;
import defpackage.qje;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/a;", "Lj530;", "Landroidx/compose/ui/graphics/b;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class a extends j530 {
    public final tls a;

    public a(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new b(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        s sVar;
        b bVar = (b) e530Var;
        tls tlsVar = this.a;
        bVar.a = tlsVar;
        if (bVar.getNode().isAttached() && (sVar = qje.N(bVar, 2).J) != null) {
            sVar.A1(tlsVar, true);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
