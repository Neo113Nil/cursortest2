package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class lke0 implements hle0 {
    public static final kke0 Companion = new kke0();
    public final String a;

    public /* synthetic */ lke0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, jke0.a.getDescriptor());
            throw null;
        }
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lke0) && jl40.l(this.a, ((lke0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("IsNull(argName="), this.a, ')');
    }

    public lke0(String str) {
        this.a = str;
    }
}
