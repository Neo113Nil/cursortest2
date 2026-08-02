package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class br50 implements dr50 {
    public static final ar50 Companion = new ar50();
    public final String a;

    public /* synthetic */ br50(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, zq50.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br50) && jl40.l(this.a, ((br50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("NetworkCornerHalfModel(type="), this.a, ')');
    }
}
