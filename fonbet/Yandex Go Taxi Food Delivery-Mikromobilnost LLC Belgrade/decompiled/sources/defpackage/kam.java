package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkam;", "Lj530;", "Ljam;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class kam extends j530 {
    public final tls a;

    public kam(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        jam jamVar = new jam();
        jamVar.a = this.a;
        return jamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kam) {
            return this.a == ((kam) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((jam) e530Var).a = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
