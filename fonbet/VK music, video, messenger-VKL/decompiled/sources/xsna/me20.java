package xsna;

import java.util.List;

/* compiled from: MessagesGetChangedObjectsApiCmd.kt */
/* loaded from: classes2.dex */
public final class me20 implements dux0 {
    public final long a;
    public final List<Long> b;
    public final List<Long> c;
    public final boolean d;
    public final wak e;
    public final f1e0 f;

    public me20(long j, List<Long> list, List<Long> list2, boolean z, wak wakVar, f1e0 f1e0Var) {
        this.a = j;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = wakVar;
        this.f = f1e0Var;
    }

    @Override // xsna.dux0
    public final f1e0 c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me20)) {
            return false;
        }
        me20 me20Var = (me20) obj;
        return this.a == me20Var.a && epx.f(this.b, me20Var.b) && epx.f(this.c, me20Var.c) && this.d == me20Var.d && epx.f(this.e, me20Var.e) && epx.f(this.f, me20Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(fw3.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        wak wakVar = this.e;
        return this.f.hashCode() + ((b + (wakVar == null ? 0 : wakVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Response(contactsLastUpdate=" + this.a + ", items=" + this.b + ", deleteItems=" + this.c + ", dropContacts=" + this.d + ", edu=" + this.e + ", requestedProfiles=" + this.f + ')';
    }
}
