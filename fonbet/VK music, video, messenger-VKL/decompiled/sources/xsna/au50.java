package xsna;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: Tagged.kt */
/* loaded from: classes8.dex */
public abstract class au50 implements Decoder, ssi {
    public final ArrayList<String> b = new ArrayList<>();
    public boolean c;

    @Override // xsna.ssi
    public final Decoder A(ebd0 ebd0Var, int i) {
        return L(R(ebd0Var, i), ebd0Var.h(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final int B() {
        return M(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder C(SerialDescriptor serialDescriptor) {
        return L(S(), serialDescriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final float D() {
        return K(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean E() {
        return a(S());
    }

    @Override // xsna.ssi
    public final boolean F(SerialDescriptor serialDescriptor, int i) {
        return a(R(serialDescriptor, i));
    }

    public abstract char H(String str);

    public abstract double I(String str);

    public abstract int J(String str, SerialDescriptor serialDescriptor);

    public abstract float K(String str);

    public abstract Decoder L(String str, SerialDescriptor serialDescriptor);

    public abstract int M(String str);

    public abstract long N(String str);

    public abstract short O(String str);

    public abstract String P(String str);

    public String Q(SerialDescriptor serialDescriptor, int i) {
        return serialDescriptor.d(i);
    }

    public final String R(SerialDescriptor serialDescriptor, int i) {
        String Q = Q(serialDescriptor, i);
        return Q;
    }

    public final String S() {
        ArrayList<String> arrayList = this.b;
        String remove = arrayList.remove(e43.h(arrayList));
        this.c = true;
        return remove;
    }

    public final String T() {
        ArrayList<String> arrayList = this.b;
        return arrayList.isEmpty() ? "$" : j5g.g0(arrayList, ".", "$.", null, 0, null, 60);
    }

    public abstract boolean a(String str);

    public abstract byte b(String str);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final double g() {
        return I(S());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract <T> T h(a3m<? extends T> a3mVar);

    @Override // xsna.ssi
    public final <T> T i(SerialDescriptor serialDescriptor, int i, a3m<? extends T> a3mVar, T t) {
        this.b.add(R(serialDescriptor, i));
        T t2 = (a3mVar.getDescriptor().b() || G()) ? (T) h(a3mVar) : null;
        if (!this.c) {
            S();
        }
        this.c = false;
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final int j(SerialDescriptor serialDescriptor) {
        return J(S(), serialDescriptor);
    }

    @Override // xsna.ssi
    public final byte k(ebd0 ebd0Var, int i) {
        return b(R(ebd0Var, i));
    }

    @Override // xsna.ssi
    public final float n(SerialDescriptor serialDescriptor, int i) {
        return K(R(serialDescriptor, i));
    }

    @Override // xsna.ssi
    public final double o(SerialDescriptor serialDescriptor, int i) {
        return I(R(serialDescriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final byte p() {
        return b(S());
    }

    @Override // xsna.ssi
    public final char q(ebd0 ebd0Var, int i) {
        return H(R(ebd0Var, i));
    }

    @Override // xsna.ssi
    public final long r(SerialDescriptor serialDescriptor, int i) {
        return N(R(serialDescriptor, i));
    }

    @Override // xsna.ssi
    public final int s(SerialDescriptor serialDescriptor, int i) {
        return M(R(serialDescriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final long t() {
        return N(S());
    }

    @Override // xsna.ssi
    public final String u(SerialDescriptor serialDescriptor, int i) {
        return P(R(serialDescriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final short v() {
        return O(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final char w() {
        return H(S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public final String x() {
        return P(S());
    }

    @Override // xsna.ssi
    public final <T> T y(SerialDescriptor serialDescriptor, int i, a3m<? extends T> a3mVar, T t) {
        this.b.add(R(serialDescriptor, i));
        T t2 = (T) h(a3mVar);
        if (!this.c) {
            S();
        }
        this.c = false;
        return t2;
    }

    @Override // xsna.ssi
    public final short z(ebd0 ebd0Var, int i) {
        return O(R(ebd0Var, i));
    }
}
