package xsna;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: AbstractAlgorithm.java */
/* loaded from: classes13.dex */
public abstract class nc implements ys1, Encoder, cti {
    public Object b;

    public nc(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                this.b = new ArrayList();
                break;
            default:
                this.b = new ReentrantReadWriteLock();
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void A(byte b) {
        V(h0(), b);
    }

    public abstract void B(mmi0 mmi0Var, Object obj);

    @Override // kotlinx.serialization.encoding.Encoder
    public void C(float f) {
        Z(h0(), f);
    }

    @Override // xsna.cti
    public Encoder D(ebd0 ebd0Var, int i) {
        return a0(g0(ebd0Var, i), ebd0Var.h(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public cti F(SerialDescriptor serialDescriptor) {
        return d(serialDescriptor);
    }

    @Override // xsna.cti
    public void G(ebd0 ebd0Var, int i, short s) {
        d0(g0(ebd0Var, i), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void H(double d) {
        X(h0(), d);
    }

    @Override // xsna.cti
    public void M(int i, int i2, SerialDescriptor serialDescriptor) {
        b0(i2, g0(serialDescriptor, i));
    }

    @Override // xsna.cti
    public void O(ebd0 ebd0Var, int i, char c) {
        W(g0(ebd0Var, i), c);
    }

    @Override // xsna.cti
    public void Q(SerialDescriptor serialDescriptor, int i, double d) {
        X(g0(serialDescriptor, i), d);
    }

    public abstract wny S();

    public abstract String T(SerialDescriptor serialDescriptor, int i);

    public abstract void U(Object obj, boolean z);

    public abstract void V(Object obj, byte b);

    public abstract void W(Object obj, char c);

    public abstract void X(Object obj, double d);

    public abstract void Y(Object obj, SerialDescriptor serialDescriptor, int i);

    public abstract void Z(Object obj, float f);

    public abstract Encoder a0(Object obj, SerialDescriptor serialDescriptor);

    public abstract void b0(int i, Object obj);

    public abstract void c0(long j, Object obj);

    public abstract void d0(Object obj, short s);

    @Override // xsna.cti
    public void e(SerialDescriptor serialDescriptor) {
        if (!((ArrayList) this.b).isEmpty()) {
            h0();
        }
        f0();
    }

    public abstract void e0(Object obj, String str);

    public abstract void f0();

    public String g0(SerialDescriptor serialDescriptor, int i) {
        String T = T(serialDescriptor, i);
        return T;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void h(SerialDescriptor serialDescriptor, int i) {
        Y(h0(), serialDescriptor, i);
    }

    public Object h0() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(e43.h(arrayList));
    }

    public Encoder i(SerialDescriptor serialDescriptor) {
        return a0(h0(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void j(short s) {
        d0(h0(), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void k(boolean z) {
        U(h0(), z);
    }

    @Override // xsna.cti
    public void l(SerialDescriptor serialDescriptor, int i, boolean z) {
        U(g0(serialDescriptor, i), z);
    }

    @Override // xsna.ys1
    public void lock() {
        ((ReentrantReadWriteLock) this.b).writeLock().lock();
    }

    @Override // xsna.cti
    public void m(SerialDescriptor serialDescriptor, int i, String str) {
        e0(g0(serialDescriptor, i), str);
    }

    @Override // xsna.cti
    public void n(SerialDescriptor serialDescriptor, int i, mmi0 mmi0Var, Object obj) {
        ((ArrayList) this.b).add(g0(serialDescriptor, i));
        B(mmi0Var, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(int i) {
        b0(i, h0());
    }

    @Override // xsna.cti
    public void p(ebd0 ebd0Var, int i, byte b) {
        V(g0(ebd0Var, i), b);
    }

    @Override // xsna.cti
    public void q(SerialDescriptor serialDescriptor, int i, long j) {
        c0(j, g0(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void r(String str) {
        e0(h0(), str);
    }

    public void s(SerialDescriptor serialDescriptor, int i, mmi0 mmi0Var, Object obj) {
        ((ArrayList) this.b).add(g0(serialDescriptor, i));
        if (mmi0Var.getDescriptor().b()) {
            B(mmi0Var, obj);
        } else if (obj == null) {
            J();
        } else {
            B(mmi0Var, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void u(long j) {
        c0(j, h0());
    }

    @Override // xsna.ys1
    public void unlock() {
        ((ReentrantReadWriteLock) this.b).writeLock().unlock();
    }

    @Override // xsna.cti
    public void w(SerialDescriptor serialDescriptor, int i, float f) {
        Z(g0(serialDescriptor, i), f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void y(char c) {
        W(h0(), c);
    }
}
