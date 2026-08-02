package xsna;

import xsna.tlo0;

/* compiled from: SnackbarData.kt */
/* loaded from: classes4.dex */
public final class tjc {
    public final tlo0.f a;
    public final tlo0.f b;
    public final kj50 c;

    public tjc(tlo0.f fVar, tlo0.f fVar2, kj50 kj50Var) {
        this.a = fVar;
        this.b = fVar2;
        this.c = kj50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjc)) {
            return false;
        }
        tjc tjcVar = (tjc) obj;
        return this.a.equals(tjcVar.a) && this.b.equals(tjcVar.b) && this.c.equals(tjcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "ClickableMessage(textSource=" + this.a + ", messageSource=" + this.b + ", messageAction=" + this.c + ')';
    }
}
