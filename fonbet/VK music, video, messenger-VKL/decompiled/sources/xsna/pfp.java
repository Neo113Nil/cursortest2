package xsna;

/* compiled from: EmptyCropParams.kt */
/* loaded from: classes4.dex */
public final class pfp implements zhk {
    public final e4p a;
    public final boolean b = true;
    public final jik c = jik.a;

    public pfp(e4p e4pVar) {
        this.a = e4pVar;
    }

    @Override // xsna.g5p
    public final boolean I() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return obj instanceof pfp;
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return this.c;
    }

    public final int hashCode() {
        e4p e4pVar = this.a;
        if (e4pVar != null) {
            return e4pVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "EmptyCropParams(basedOnImageLink=" + this.a + ")";
    }
}
