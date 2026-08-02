package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnly0;", "Lj530;", "Loly0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class nly0 extends j530 {
    public final atz0 a;
    public final tls b;
    public final tls c;
    public final tls w;

    public nly0(atz0 atz0Var, tls tlsVar, tls tlsVar2, tls tlsVar3) {
        this.a = atz0Var;
        this.b = tlsVar;
        this.c = tlsVar2;
        this.w = tlsVar3;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new oly0(this.a, this.b, this.c, this.w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nly0)) {
            return false;
        }
        nly0 nly0Var = (nly0) obj;
        return this.a == nly0Var.a && this.b == nly0Var.b && this.c == nly0Var.c && this.w == nly0Var.w;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        oly0 oly0Var = (oly0) e530Var;
        oly0Var.c.a = null;
        atz0 atz0Var = this.a;
        oly0Var.c = atz0Var;
        atz0Var.a = oly0Var;
        atz0Var.b = oly0Var.isAttached() ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached;
        oly0Var.w = this.b;
        oly0Var.x = this.c;
        oly0Var.y = this.w;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tls tlsVar = this.b;
        int hashCode2 = (hashCode + (tlsVar != null ? tlsVar.hashCode() : 0)) * 31;
        tls tlsVar2 = this.c;
        return this.w.hashCode() + ((hashCode2 + (tlsVar2 != null ? tlsVar2.hashCode() : 0)) * 31);
    }
}
