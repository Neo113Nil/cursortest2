package xsna;

/* compiled from: ClipsOwnerSwipeFeatureFactoryResult.kt */
/* loaded from: classes17.dex */
public final class ioe {
    public final goe a;
    public final poe b;

    public ioe(goe goeVar, poe poeVar) {
        this.a = goeVar;
        this.b = poeVar;
    }

    public final goe a() {
        return this.a;
    }

    public final poe b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioe)) {
            return false;
        }
        ioe ioeVar = (ioe) obj;
        return epx.f(this.a, ioeVar.a) && epx.f(this.b, ioeVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClipsOwnerSwipeFeatureFactoryResult(feature=" + this.a + ", immediateViewState=" + this.b + ')';
    }
}
