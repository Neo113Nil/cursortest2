package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkix;", "Lj530;", "Lmix;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class kix extends j530 {
    public final tls a;
    public final tls b;

    public kix(tls tlsVar, tls tlsVar2) {
        this.a = tlsVar;
        this.b = tlsVar2;
    }

    @Override // defpackage.j530
    public final e530 a() {
        mix mixVar = new mix();
        mixVar.a = this.a;
        mixVar.b = this.b;
        return mixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kix)) {
            return false;
        }
        kix kixVar = (kix) obj;
        return this.a == kixVar.a && this.b == kixVar.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        mix mixVar = (mix) e530Var;
        mixVar.a = this.a;
        mixVar.b = this.b;
    }

    public final int hashCode() {
        tls tlsVar = this.a;
        int hashCode = (tlsVar != null ? tlsVar.hashCode() : 0) * 31;
        tls tlsVar2 = this.b;
        return hashCode + (tlsVar2 != null ? tlsVar2.hashCode() : 0);
    }
}
