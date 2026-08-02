package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La9e;", "Lj530;", "Lb9e;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a9e extends j530 {
    public final tls a;
    public final tls b;

    public a9e(tls tlsVar, tls tlsVar2) {
        this.a = tlsVar;
        this.b = tlsVar2;
    }

    @Override // defpackage.j530
    public final e530 a() {
        b9e b9eVar = new b9e();
        b9eVar.c = this.a;
        return b9eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9e) && ((a9e) obj).a == this.a;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        b9e b9eVar = (b9e) e530Var;
        tls tlsVar = b9eVar.c;
        tls tlsVar2 = this.a;
        if (tlsVar2 != tlsVar) {
            b9eVar.c = tlsVar2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
