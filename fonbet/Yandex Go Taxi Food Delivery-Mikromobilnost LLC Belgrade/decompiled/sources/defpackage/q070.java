package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq070;", "Lj530;", "Lr070;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class q070 extends j530 {
    public final tls a;

    public q070(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new r070(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q070) {
            return this.a == ((q070) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        r070 r070Var = (r070) e530Var;
        r070Var.a = this.a;
        r070Var.c = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
