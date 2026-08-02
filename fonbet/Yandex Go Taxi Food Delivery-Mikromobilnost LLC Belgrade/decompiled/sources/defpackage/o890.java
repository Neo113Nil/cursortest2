package defpackage;

import androidx.compose.foundation.lazy.layout.a;

/* loaded from: classes10.dex */
public final class o890 extends a {
    public final tls a;
    public final by40 b;

    public o890(bms bmsVar, tls tlsVar, int i) {
        this.a = tlsVar;
        by40 by40Var = new by40();
        by40Var.a(i, new m890(tlsVar, bmsVar));
        this.b = by40Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.a
    public final by40 d() {
        return this.b;
    }
}
