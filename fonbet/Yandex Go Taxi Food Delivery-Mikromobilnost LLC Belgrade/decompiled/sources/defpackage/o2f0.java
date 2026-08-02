package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class o2f0 implements SerialDescriptor {
    public final String a;
    public final h2f0 b;

    public o2f0(String str, h2f0 h2f0Var) {
        this.a = str;
        this.b = h2f0Var;
    }

    public final void a() {
        throw new IllegalStateException(oyr.t(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2f0)) {
            return false;
        }
        o2f0 o2f0Var = (o2f0) obj;
        return this.a.equals(o2f0Var.a) && jl40.l(this.b, o2f0Var.b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final jl40 getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        a();
        throw null;
    }

    public final String toString() {
        return b64.p(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
