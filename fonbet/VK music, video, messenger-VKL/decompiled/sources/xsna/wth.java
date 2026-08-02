package xsna;

/* compiled from: CommunityProfileSideEffectDelegateParams.kt */
/* loaded from: classes5.dex */
public final class wth {
    public final b7h a;
    public final iax b;
    public final nrh c;

    public wth(b7h b7hVar, iax iaxVar, nrh nrhVar) {
        this.a = b7hVar;
        this.b = iaxVar;
        this.c = nrhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wth)) {
            return false;
        }
        wth wthVar = (wth) obj;
        return epx.f(this.a, wthVar.a) && epx.f(this.b, wthVar.b) && epx.f(this.c, wthVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CommunityProfileSideEffectDelegateParams(leaveDelegate=" + this.a + ", searchResultsDelegate=" + this.b + ", messengerDelegate=" + this.c + ')';
    }
}
