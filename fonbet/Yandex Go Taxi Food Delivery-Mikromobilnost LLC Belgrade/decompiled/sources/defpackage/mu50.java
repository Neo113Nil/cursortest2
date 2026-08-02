package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class mu50 {
    public static final lu50 Companion = new lu50();
    public final String a;

    public /* synthetic */ mu50(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ku50.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu50) && jl40.l(this.a, ((mu50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("NetworkGenericErrorModel(code="), this.a, ')');
    }
}
