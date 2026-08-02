package xsna;

/* compiled from: ClipsOwnerSwipeState.kt */
/* loaded from: classes17.dex */
public final class dpe {
    public final boolean a;
    public final boolean b;
    public final doe c;

    public dpe() {
        this(0);
    }

    public static dpe a(dpe dpeVar, boolean z, boolean z2, doe doeVar, int i) {
        if ((i & 1) != 0) {
            z = dpeVar.a;
        }
        if ((i & 2) != 0) {
            z2 = dpeVar.b;
        }
        if ((i & 4) != 0) {
            doeVar = dpeVar.c;
        }
        return new dpe(z, z2, doeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpe)) {
            return false;
        }
        dpe dpeVar = (dpe) obj;
        return this.a == dpeVar.a && this.b == dpeVar.b && epx.f(this.c, dpeVar.c);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        doe doeVar = this.c;
        return b + (doeVar == null ? 0 : doeVar.hashCode());
    }

    public final String toString() {
        return "ClipsOwnerSwipeState(isShowingOwner=" + this.a + ", isSwipeToAuthorAvailableForTab=" + this.b + ", ownerInfo=" + this.c + ')';
    }

    public /* synthetic */ dpe(int i) {
        this(false, false, null);
    }

    public dpe(boolean z, boolean z2, doe doeVar) {
        this.a = z;
        this.b = z2;
        this.c = doeVar;
    }
}
