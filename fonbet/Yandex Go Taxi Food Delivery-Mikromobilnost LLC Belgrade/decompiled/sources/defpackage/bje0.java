package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class bje0 implements cje0 {
    public static final aje0 Companion = new aje0();
    public final String a;

    public /* synthetic */ bje0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, zie0.a.getDescriptor());
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
        return (obj instanceof bje0) && jl40.l(this.a, ((bje0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("StringValue(value="), this.a, ')');
    }

    public bje0(String str) {
        this.a = str;
    }
}
