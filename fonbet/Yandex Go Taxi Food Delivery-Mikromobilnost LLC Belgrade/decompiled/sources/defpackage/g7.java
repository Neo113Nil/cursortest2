package defpackage;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes9.dex */
public abstract class g7 implements Decoder, sjd {
    @Override // defpackage.sjd
    public Object A(SerialDescriptor serialDescriptor, int i, myi myiVar, Object obj) {
        return B(myiVar);
    }

    @Override // defpackage.sjd
    public final boolean C(SerialDescriptor serialDescriptor, int i) {
        return z();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean D() {
        return true;
    }

    @Override // defpackage.sjd
    public final double E(SerialDescriptor serialDescriptor, int i) {
        return m();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte F() {
        G();
        throw null;
    }

    public final void G() {
        throw new SerializationException(qoi0.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public sjd b(SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // defpackage.sjd
    public void c(SerialDescriptor serialDescriptor) {
    }

    @Override // defpackage.sjd
    public final Decoder e(c2f0 c2f0Var, int i) {
        return w(c2f0Var.d(i));
    }

    @Override // defpackage.sjd
    public final long f(SerialDescriptor serialDescriptor, int i) {
        return j();
    }

    @Override // defpackage.sjd
    public final byte g(c2f0 c2f0Var, int i) {
        return F();
    }

    @Override // defpackage.sjd
    public final int h(SerialDescriptor serialDescriptor, int i) {
        return u();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Void i() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long j() {
        G();
        throw null;
    }

    @Override // defpackage.sjd
    public final String k(SerialDescriptor serialDescriptor, int i) {
        return p();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short l() {
        G();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double m() {
        G();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char n() {
        G();
        throw null;
    }

    @Override // defpackage.sjd
    public final short o(c2f0 c2f0Var, int i) {
        return l();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String p() {
        G();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int q(SerialDescriptor serialDescriptor) {
        G();
        throw null;
    }

    @Override // defpackage.sjd
    public final char r(c2f0 c2f0Var, int i) {
        return n();
    }

    @Override // defpackage.sjd
    public final Object s(SerialDescriptor serialDescriptor, int i, myi myiVar, Object obj) {
        return (myiVar.getDescriptor().b() || D()) ? B(myiVar) : i();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int u() {
        G();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder w(SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float x() {
        G();
        throw null;
    }

    @Override // defpackage.sjd
    public final float y(SerialDescriptor serialDescriptor, int i) {
        return x();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean z() {
        G();
        throw null;
    }
}
