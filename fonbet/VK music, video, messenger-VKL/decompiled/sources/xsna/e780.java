package xsna;

/* compiled from: ManagedGroupEngineEvent.kt */
/* loaded from: classes2.dex */
public final class e780 extends wh00 {
    public final dsa b;
    public final boolean c;

    public e780(dsa dsaVar, boolean z) {
        this.b = dsaVar;
        this.c = z;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e780)) {
            return false;
        }
        e780 e780Var = (e780) obj;
        return epx.f(this.b, e780Var.b) && this.c == e780Var.c;
    }

    public final int hashCode() {
        dsa dsaVar = this.b;
        if (dsaVar != null) {
            dsaVar.hashCode();
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnManagedGroupMutedEngineEvent(changerTag=");
        sb.append(this.b);
        sb.append(", group=null, isMuted=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
