package xsna;

/* compiled from: DomainFeatureHolder.kt */
/* loaded from: classes4.dex */
public final class qvn {
    public final vou a;
    public final wb7 b;
    public final rj01 c;
    public final qs9 d;
    public final tkx e;
    public final jy90 f;
    public final mui0 g;
    public final h0h h;
    public final ibc0 i;
    public final gfc0 j;
    public final jgz k;

    public qvn(vou vouVar, wb7 wb7Var, rj01 rj01Var, qs9 qs9Var, tkx tkxVar, jy90 jy90Var, mui0 mui0Var, h0h h0hVar, ibc0 ibc0Var, gfc0 gfc0Var, jgz jgzVar) {
        this.a = vouVar;
        this.b = wb7Var;
        this.c = rj01Var;
        this.d = qs9Var;
        this.e = tkxVar;
        this.f = jy90Var;
        this.g = mui0Var;
        this.h = h0hVar;
        this.i = ibc0Var;
        this.j = gfc0Var;
        this.k = jgzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvn)) {
            return false;
        }
        qvn qvnVar = (qvn) obj;
        return epx.f(this.a, qvnVar.a) && epx.f(this.b, qvnVar.b) && epx.f(this.c, qvnVar.c) && epx.f(this.d, qvnVar.d) && epx.f(this.e, qvnVar.e) && epx.f(this.f, qvnVar.f) && epx.f(this.g, qvnVar.g) && epx.f(this.h, qvnVar.h) && epx.f(this.i, qvnVar.i) && epx.f(this.j, qvnVar.j) && epx.f(this.k, qvnVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DomainFeatureHolder(placesInteractor=" + this.a + ", settingsInteractor=" + this.b + ", photoTagInteractor=" + this.c + ", accountPrivacyInteractor=" + this.d + ", draftsRepository=" + this.e + ", permissionsRepository=" + this.f + ", sessionReadOnlyRepository=" + this.g + ", communityCreationOnboardingStateStorage=" + this.h + ", postingAnalytics=" + this.i + ", filesCopier=" + this.j + ", groupsInteractor=" + this.k + ')';
    }
}
