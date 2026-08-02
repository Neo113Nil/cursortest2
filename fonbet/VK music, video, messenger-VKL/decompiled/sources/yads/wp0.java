package yads;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class wp0 implements w53 {
    public final p20 a = new p20();
    public final a63 b = new a63();
    public final ArrayDeque c = new ArrayDeque();
    public int d;
    public boolean e;

    public wp0() {
        for (int i = 0; i < 2; i++) {
            this.c.addFirst(new up0(this));
        }
        this.d = 0;
    }

    @Override // yads.w53
    public final void a(long j) {
    }

    @Override // yads.oa0
    public final Object b() {
        if (this.e) {
            throw new IllegalStateException();
        }
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.b;
    }

    @Override // yads.oa0
    public final void flush() {
        if (this.e) {
            throw new IllegalStateException();
        }
        this.b.b();
        this.d = 0;
    }

    @Override // yads.oa0
    public final void release() {
        this.e = true;
    }

    @Override // yads.oa0
    public final Object a() {
        if (this.e) {
            throw new IllegalStateException();
        }
        if (this.d != 2 || this.c.isEmpty()) {
            return null;
        }
        b63 b63Var = (b63) this.c.removeFirst();
        if (this.b.b(4)) {
            b63Var.b |= 4;
        } else {
            a63 a63Var = this.b;
            long j = a63Var.f;
            p20 p20Var = this.a;
            ByteBuffer byteBuffer = a63Var.d;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            p20Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            vp0 vp0Var = new vp0(j, yq.a(o20.t, parcelableArrayList));
            b63Var.c = this.b.f;
            b63Var.d = vp0Var;
            b63Var.e = 0L;
        }
        this.b.b();
        this.d = 0;
        return b63Var;
    }

    @Override // yads.oa0
    public final void a(a63 a63Var) {
        if (!this.e) {
            if (this.d == 1) {
                if (this.b == a63Var) {
                    this.d = 2;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void a(b63 b63Var) {
        if (this.c.size() < 2) {
            if (!this.c.contains(b63Var)) {
                b63Var.b = 0;
                b63Var.d = null;
                this.c.addFirst(b63Var);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }
}
