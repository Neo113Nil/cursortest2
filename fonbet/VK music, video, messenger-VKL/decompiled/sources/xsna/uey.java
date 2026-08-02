package xsna;

/* compiled from: KeyboardActions.kt */
/* loaded from: classes11.dex */
public final class uey {
    public static final uey d = new uey(null, null, null, 63);
    public final izs<tey, s3q0> a;
    public final izs<tey, s3q0> b;
    public final izs<tey, s3q0> c;

    public uey() {
        this(null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uey)) {
            return false;
        }
        uey ueyVar = (uey) obj;
        return this.a == ueyVar.a && this.b == ueyVar.b && this.c == ueyVar.c;
    }

    public final int hashCode() {
        izs<tey, s3q0> izsVar = this.a;
        int hashCode = (izsVar != null ? izsVar.hashCode() : 0) * 961;
        izs<tey, s3q0> izsVar2 = this.b;
        int hashCode2 = (hashCode + (izsVar2 != null ? izsVar2.hashCode() : 0)) * 961;
        izs<tey, s3q0> izsVar3 = this.c;
        return (hashCode2 + (izsVar3 != null ? izsVar3.hashCode() : 0)) * 31;
    }

    public uey(izs izsVar, izs izsVar2, izs izsVar3, int i) {
        izsVar = (i & 1) != 0 ? null : izsVar;
        izsVar2 = (i & 4) != 0 ? null : izsVar2;
        izsVar3 = (i & 16) != 0 ? null : izsVar3;
        this.a = izsVar;
        this.b = izsVar2;
        this.c = izsVar3;
    }
}
