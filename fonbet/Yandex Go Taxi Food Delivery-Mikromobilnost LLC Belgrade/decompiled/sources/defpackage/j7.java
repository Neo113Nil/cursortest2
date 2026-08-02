package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public abstract class j7 implements Encoder, yjd {
    @Override // defpackage.yjd
    public final void A(int i, int i2, SerialDescriptor serialDescriptor) {
        G(serialDescriptor, i);
        q(i2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void B(char c) {
        H(Character.valueOf(c));
    }

    @Override // defpackage.yjd
    public final void D(c2f0 c2f0Var, int i, char c) {
        G(c2f0Var, i);
        B(c);
    }

    @Override // defpackage.yjd
    public final void E(SerialDescriptor serialDescriptor, int i, double d) {
        G(serialDescriptor, i);
        u(d);
    }

    public void G(SerialDescriptor serialDescriptor, int i) {
    }

    public void H(Object obj) {
        throw new SerializationException("Non-serializable " + qoi0.a(obj.getClass()) + " is not supported by " + qoi0.a(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public yjd b(SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // defpackage.yjd
    public void c(SerialDescriptor serialDescriptor) {
    }

    @Override // defpackage.yjd
    public final void e(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        G(serialDescriptor, i);
        j(obj, kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b) {
        H(Byte.valueOf(b));
    }

    @Override // defpackage.yjd
    public final void f(c2f0 c2f0Var, int i, byte b) {
        G(c2f0Var, i);
        encodeByte(b);
    }

    @Override // defpackage.yjd
    public void g(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        G(serialDescriptor, i);
        if (kSerializer.getDescriptor().b()) {
            j(obj, kSerializer);
        } else if (obj == null) {
            y();
        } else {
            j(obj, kSerializer);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void h(SerialDescriptor serialDescriptor, int i) {
        H(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder i(SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void k(short s) {
        H(Short.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void l(boolean z) {
        H(Boolean.valueOf(z));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void m(float f) {
        H(Float.valueOf(f));
    }

    @Override // defpackage.yjd
    public final void n(SerialDescriptor serialDescriptor, int i, boolean z) {
        G(serialDescriptor, i);
        l(z);
    }

    @Override // defpackage.yjd
    public final void o(SerialDescriptor serialDescriptor, int i, String str) {
        G(serialDescriptor, i);
        t(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void q(int i) {
        H(Integer.valueOf(i));
    }

    @Override // defpackage.yjd
    public final void s(SerialDescriptor serialDescriptor, int i, long j) {
        G(serialDescriptor, i);
        w(j);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void t(String str) {
        H(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void u(double d) {
        H(Double.valueOf(d));
    }

    @Override // defpackage.yjd
    public final void v(c2f0 c2f0Var, int i, short s) {
        G(c2f0Var, i);
        k(s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void w(long j) {
        H(Long.valueOf(j));
    }

    @Override // defpackage.yjd
    public final Encoder x(c2f0 c2f0Var, int i) {
        G(c2f0Var, i);
        return i(c2f0Var.d(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void y() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // defpackage.yjd
    public final void z(SerialDescriptor serialDescriptor, int i, float f) {
        G(serialDescriptor, i);
        m(f);
    }
}
