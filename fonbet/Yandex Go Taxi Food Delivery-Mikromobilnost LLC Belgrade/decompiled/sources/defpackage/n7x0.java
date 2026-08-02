package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes9.dex */
public abstract class n7x0 implements Decoder, sjd {
    public final ArrayList a = new ArrayList();
    public boolean b;

    @Override // defpackage.sjd
    public final Object A(SerialDescriptor serialDescriptor, int i, myi myiVar, Object obj) {
        this.a.add(T(serialDescriptor, i));
        Object B = B(myiVar);
        if (!this.b) {
            U();
        }
        this.b = false;
        return B;
    }

    @Override // defpackage.sjd
    public final boolean C(SerialDescriptor serialDescriptor, int i) {
        return G(T(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean D() {
        Object b0 = a.b0(this.a);
        if (b0 == null) {
            return false;
        }
        return P(b0);
    }

    @Override // defpackage.sjd
    public final double E(SerialDescriptor serialDescriptor, int i) {
        return J(T(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte F() {
        return H(U());
    }

    public boolean G(Object obj) {
        S();
        throw null;
    }

    public byte H(Object obj) {
        S();
        throw null;
    }

    public char I(Object obj) {
        S();
        throw null;
    }

    public double J(Object obj) {
        S();
        throw null;
    }

    public int K(Object obj, SerialDescriptor serialDescriptor) {
        S();
        throw null;
    }

    public float L(Object obj) {
        S();
        throw null;
    }

    public Decoder M(Object obj, SerialDescriptor serialDescriptor) {
        this.a.add(obj);
        return this;
    }

    public int N(Object obj) {
        S();
        throw null;
    }

    public long O(Object obj) {
        S();
        throw null;
    }

    public boolean P(Object obj) {
        return true;
    }

    public short Q(Object obj) {
        S();
        throw null;
    }

    public String R(Object obj) {
        S();
        throw null;
    }

    public final void S() {
        throw new SerializationException(qoi0.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract String T(SerialDescriptor serialDescriptor, int i);

    public final Object U() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(scc.f(arrayList));
        this.b = true;
        return remove;
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.sjd
    public kf5 a() {
        return itq0.a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public sjd b(SerialDescriptor serialDescriptor) {
        return this;
    }

    public void c(SerialDescriptor serialDescriptor) {
    }

    @Override // defpackage.sjd
    public final Decoder e(c2f0 c2f0Var, int i) {
        return M(T(c2f0Var, i), c2f0Var.d(i));
    }

    @Override // defpackage.sjd
    public final long f(SerialDescriptor serialDescriptor, int i) {
        return O(T(serialDescriptor, i));
    }

    @Override // defpackage.sjd
    public final byte g(c2f0 c2f0Var, int i) {
        return H(T(c2f0Var, i));
    }

    @Override // defpackage.sjd
    public final int h(SerialDescriptor serialDescriptor, int i) {
        return N(T(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Void i() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long j() {
        return O(U());
    }

    @Override // defpackage.sjd
    public final String k(SerialDescriptor serialDescriptor, int i) {
        return R(T(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short l() {
        return Q(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double m() {
        return J(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char n() {
        return I(U());
    }

    @Override // defpackage.sjd
    public final short o(c2f0 c2f0Var, int i) {
        return Q(T(c2f0Var, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String p() {
        return R(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int q(SerialDescriptor serialDescriptor) {
        return K(U(), serialDescriptor);
    }

    @Override // defpackage.sjd
    public final char r(c2f0 c2f0Var, int i) {
        return I(T(c2f0Var, i));
    }

    @Override // defpackage.sjd
    public final Object s(SerialDescriptor serialDescriptor, int i, myi myiVar, Object obj) {
        this.a.add(T(serialDescriptor, i));
        Object B = (myiVar.getDescriptor().b() || D()) ? B(myiVar) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return B;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int u() {
        return N(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder w(SerialDescriptor serialDescriptor) {
        return M(U(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float x() {
        return L(U());
    }

    @Override // defpackage.sjd
    public final float y(SerialDescriptor serialDescriptor, int i) {
        return L(T(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean z() {
        return G(U());
    }
}
