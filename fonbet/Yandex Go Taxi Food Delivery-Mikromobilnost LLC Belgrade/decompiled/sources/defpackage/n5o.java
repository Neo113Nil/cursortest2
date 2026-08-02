package defpackage;

import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class n5o {
    public final omk a;
    public final c b;

    public n5o(omk omkVar, c cVar) {
        this.a = omkVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5o)) {
            return false;
        }
        n5o n5oVar = (n5o) obj;
        if (jl40.l(this.a.b, n5oVar.a.b)) {
            return jl40.l(this.b, n5oVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }
}
