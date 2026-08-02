package yads;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class ca3 extends Cdo {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = mc3.f;
    public int n;
    public long o;

    @Override // yads.Cdo, yads.bl
    public final ByteBuffer a() {
        int i;
        if (super.isEnded() && (i = this.n) > 0) {
            a(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        ByteBuffer byteBuffer = this.g;
        this.g = bl.a;
        return byteBuffer;
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) {
        if (zkVar.c != 2) {
            throw new al(zkVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? zk.e : zkVar;
    }

    @Override // yads.Cdo
    public final void c() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // yads.Cdo
    public final void d() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // yads.Cdo
    public final void e() {
        this.m = mc3.f;
    }

    @Override // yads.Cdo, yads.bl
    public final boolean isEnded() {
        return super.isEnded() && this.n == 0;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer a = a(length);
        int i3 = this.n;
        int i4 = mc3.a;
        int max = Math.max(0, Math.min(length, i3));
        a.put(this.m, 0, max);
        int max2 = Math.max(0, Math.min(length - max, i2));
        byteBuffer.limit(byteBuffer.position() + max2);
        a.put(byteBuffer);
        byteBuffer.limit(limit);
        int i5 = i2 - max2;
        int i6 = this.n - max;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, max, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        a.flip();
    }
}
