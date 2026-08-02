package xsna;

/* compiled from: FeedTopBar.kt */
/* loaded from: classes18.dex */
public final class u4r {
    public final v4r a;
    public final v4r b;
    public final v4r c;

    public u4r(v4r v4rVar, v4r v4rVar2, v4r v4rVar3) {
        this.a = v4rVar;
        this.b = v4rVar2;
        this.c = v4rVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4r)) {
            return false;
        }
        u4r u4rVar = (u4r) obj;
        return epx.f(this.a, u4rVar.a) && epx.f(this.b, u4rVar.b) && epx.f(this.c, u4rVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v4r v4rVar = this.b;
        int hashCode2 = (hashCode + (v4rVar == null ? 0 : v4rVar.hashCode())) * 31;
        v4r v4rVar2 = this.c;
        return hashCode2 + (v4rVar2 != null ? v4rVar2.hashCode() : 0);
    }

    public final String toString() {
        return "DefaultAfter(mainIcon=" + this.a + ", extraIcon=" + this.b + ", secondExtraIcon=" + this.c + ')';
    }
}
