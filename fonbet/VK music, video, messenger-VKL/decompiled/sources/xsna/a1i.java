package xsna;

import xsna.r0i;

/* compiled from: CommunityScheduledClipsGridState.kt */
/* loaded from: classes5.dex */
public final class a1i implements km50 {
    public final boolean b;
    public final boolean c;
    public final p0i d;
    public final r0i e;

    public a1i() {
        this(0);
    }

    public static a1i a(a1i a1iVar, boolean z, r0i r0iVar) {
        p0i p0iVar = a1iVar.d;
        a1iVar.getClass();
        return new a1i(z, false, p0iVar, r0iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1i)) {
            return false;
        }
        a1i a1iVar = (a1i) obj;
        return this.b == a1iVar.b && this.c == a1iVar.c && epx.f(this.d, a1iVar.d) && epx.f(this.e, a1iVar.e);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        p0i p0iVar = this.d;
        p0iVar.getClass();
        return this.e.hashCode() + ((System.identityHashCode(p0iVar) + b) * 31);
    }

    public final String toString() {
        return "CommunityScheduledClipsGridState(isLoading=" + this.b + ", isError=" + this.c + ", content=" + this.d + ", overlay=" + this.e + ')';
    }

    public a1i(boolean z, boolean z2, p0i p0iVar, r0i r0iVar) {
        this.b = z;
        this.c = z2;
        this.d = p0iVar;
        this.e = r0iVar;
    }

    public /* synthetic */ a1i(int i) {
        this(true, false, new p0i(null, 3), r0i.b.a);
    }
}
