package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public abstract class o7x0 implements Encoder, yjd {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.yjd
    public final void A(int i, int i2, SerialDescriptor serialDescriptor) {
        N(i2, U(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void B(char c) {
        I(V(), c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void C() {
        a.Z(this.a);
    }

    @Override // defpackage.yjd
    public final void D(c2f0 c2f0Var, int i, char c) {
        I(U(c2f0Var, i), c);
    }

    @Override // defpackage.yjd
    public final void E(SerialDescriptor serialDescriptor, int i, double d) {
        J(U(serialDescriptor, i), d);
    }

    public void G(Object obj, boolean z) {
        S(obj, Boolean.valueOf(z));
    }

    public void H(Object obj, byte b) {
        S(obj, Byte.valueOf(b));
    }

    public void I(Object obj, char c) {
        S(obj, Character.valueOf(c));
    }

    public void J(Object obj, double d) {
        S(obj, Double.valueOf(d));
    }

    public void K(Object obj, SerialDescriptor serialDescriptor, int i) {
        S(obj, Integer.valueOf(i));
    }

    public void L(float f, Object obj) {
        S(obj, Float.valueOf(f));
    }

    public Encoder M(Object obj, SerialDescriptor serialDescriptor) {
        this.a.add(obj);
        return this;
    }

    public void N(int i, Object obj) {
        S(obj, Integer.valueOf(i));
    }

    public void O(long j, Object obj) {
        S(obj, Long.valueOf(j));
    }

    public void P(Object obj) {
        throw new SerializationException("null is not supported");
    }

    public void Q(Object obj, short s) {
        S(obj, Short.valueOf(s));
    }

    public void R(Object obj, String str) {
        S(obj, str);
    }

    public void S(Object obj, Object obj2) {
        throw new SerializationException("Non-serializable " + qoi0.a(obj2.getClass()) + " is not supported by " + qoi0.a(getClass()) + " encoder");
    }

    public void T() {
    }

    public abstract String U(SerialDescriptor serialDescriptor, int i);

    public final Object V() {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(scc.f(arrayList));
        }
        yci0.m("No tag in stack for requested element");
        return null;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public kf5 a() {
        return itq0.a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public yjd b(SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // defpackage.yjd
    public final void c(SerialDescriptor serialDescriptor) {
        if (!this.a.isEmpty()) {
            V();
        }
        T();
    }

    @Override // defpackage.yjd
    public final void e(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        this.a.add(U(serialDescriptor, i));
        j(obj, kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b) {
        H(V(), b);
    }

    @Override // defpackage.yjd
    public final void f(c2f0 c2f0Var, int i, byte b) {
        H(U(c2f0Var, i), b);
    }

    public void g(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        this.a.add(U(serialDescriptor, i));
        if (kSerializer.getDescriptor().b()) {
            j(obj, kSerializer);
        } else if (obj == null) {
            y();
        } else {
            C();
            j(obj, kSerializer);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void h(SerialDescriptor serialDescriptor, int i) {
        K(V(), serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder i(SerialDescriptor serialDescriptor) {
        return M(V(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void k(short s) {
        Q(V(), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void l(boolean z) {
        G(V(), z);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(float f) {
        L(f, V());
    }

    @Override // defpackage.yjd
    public final void n(SerialDescriptor serialDescriptor, int i, boolean z) {
        G(U(serialDescriptor, i), z);
    }

    @Override // defpackage.yjd
    public final void o(SerialDescriptor serialDescriptor, int i, String str) {
        R(U(serialDescriptor, i), str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void q(int i) {
        N(i, V());
    }

    @Override // defpackage.yjd
    public final void s(SerialDescriptor serialDescriptor, int i, long j) {
        O(j, U(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void t(String str) {
        R(V(), str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void u(double d) {
        J(V(), d);
    }

    @Override // defpackage.yjd
    public final void v(c2f0 c2f0Var, int i, short s) {
        Q(U(c2f0Var, i), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void w(long j) {
        O(j, V());
    }

    @Override // defpackage.yjd
    public final Encoder x(c2f0 c2f0Var, int i) {
        return M(U(c2f0Var, i), c2f0Var.d(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void y() {
        P(V());
    }

    @Override // defpackage.yjd
    public final void z(SerialDescriptor serialDescriptor, int i, float f) {
        L(f, U(serialDescriptor, i));
    }
}
