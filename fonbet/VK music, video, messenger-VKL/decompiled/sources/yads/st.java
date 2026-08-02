package yads;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class st extends Cdo {
    public int[] i;
    public int[] j;

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a = a(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                a.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        a.flip();
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) {
        int[] iArr = this.i;
        if (iArr == null) {
            return zk.e;
        }
        if (zkVar.c != 2) {
            throw new al(zkVar);
        }
        boolean z = zkVar.b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= zkVar.b) {
                throw new al(zkVar);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new zk(zkVar.a, iArr.length, 2) : zk.e;
    }

    @Override // yads.Cdo
    public final void c() {
        this.j = this.i;
    }

    @Override // yads.Cdo
    public final void e() {
        this.j = null;
        this.i = null;
    }
}
