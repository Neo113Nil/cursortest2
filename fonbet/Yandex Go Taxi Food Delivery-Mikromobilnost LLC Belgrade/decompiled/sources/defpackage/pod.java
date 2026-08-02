package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class pod {
    public static final ood Companion = new ood();
    public final String a;

    public /* synthetic */ pod(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, nod.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pod) && jl40.l(this.a, ((pod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OptionName(name="), this.a, ')');
    }
}
