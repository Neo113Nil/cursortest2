package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class m8d0 {
    public static final l8d0 Companion = new l8d0();
    public final String a;

    public /* synthetic */ m8d0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, k8d0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8d0) && jl40.l(this.a, ((m8d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("PlusPayAcquisitionNameDto(name="), this.a, ')');
    }
}
