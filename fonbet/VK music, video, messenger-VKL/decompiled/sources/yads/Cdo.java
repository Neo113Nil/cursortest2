package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: yads.do, reason: invalid class name */
/* loaded from: classes10.dex */
public abstract class Cdo implements bl {
    public zk b;
    public zk c;
    public zk d;
    public zk e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public Cdo() {
        ByteBuffer byteBuffer = bl.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        zk zkVar = zk.e;
        this.d = zkVar;
        this.e = zkVar;
        this.b = zkVar;
        this.c = zkVar;
    }

    @Override // yads.bl
    public final zk a(zk zkVar) {
        this.d = zkVar;
        this.e = b(zkVar);
        return isActive() ? this.e : zk.e;
    }

    public abstract zk b(zk zkVar);

    @Override // yads.bl
    public final void b() {
        this.h = true;
        d();
    }

    @Override // yads.bl
    public final void flush() {
        this.g = bl.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        c();
    }

    @Override // yads.bl
    public boolean isActive() {
        return this.e != zk.e;
    }

    @Override // yads.bl
    public boolean isEnded() {
        return this.h && this.g == bl.a;
    }

    @Override // yads.bl
    public final void reset() {
        flush();
        this.f = bl.a;
        zk zkVar = zk.e;
        this.d = zkVar;
        this.e = zkVar;
        this.b = zkVar;
        this.c = zkVar;
        e();
    }

    @Override // yads.bl
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = bl.a;
        return byteBuffer;
    }

    public final ByteBuffer a(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
