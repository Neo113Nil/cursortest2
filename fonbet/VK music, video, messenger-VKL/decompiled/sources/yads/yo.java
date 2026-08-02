package yads;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class yo extends sa0 {
    public long j;
    public int k;
    public int l;

    public yo() {
        super(2);
        this.l = 32;
    }

    public final boolean a(sa0 sa0Var) {
        ByteBuffer byteBuffer;
        if (sa0Var.b(1073741824)) {
            throw new IllegalArgumentException();
        }
        if (sa0Var.b(268435456)) {
            throw new IllegalArgumentException();
        }
        if (sa0Var.b(4)) {
            throw new IllegalArgumentException();
        }
        int i = this.k;
        if (i > 0) {
            if (i >= this.l || sa0Var.b(Integer.MIN_VALUE) != b(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = sa0Var.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.k;
        this.k = i2 + 1;
        if (i2 == 0) {
            this.f = sa0Var.f;
            if (sa0Var.b(1)) {
                this.b = 1;
            }
        }
        if (sa0Var.b(Integer.MIN_VALUE)) {
            this.b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = sa0Var.d;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.j = sa0Var.f;
        return true;
    }

    @Override // yads.sa0
    public final void b() {
        super.b();
        this.k = 0;
    }
}
