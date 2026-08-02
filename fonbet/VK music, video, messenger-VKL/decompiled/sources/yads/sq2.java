package yads;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class sq2 extends Cdo {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[ADDED_TO_REGION, LOOP:4: B:33:0x00b4->B:34:0x00b6, LOOP_START, PHI: r0
      0x00b4: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0036, B:34:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // yads.bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 == 536870912) {
                        i2 /= 3;
                    } else if (i3 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer a = a(i2);
                i = this.b.c;
                if (i == 3) {
                    while (position < limit) {
                        a.put((byte) 0);
                        a.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i == 4) {
                    while (position < limit) {
                        float f = byteBuffer.getFloat(position);
                        int i4 = mc3.a;
                        short max = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                        a.put((byte) (max & 255));
                        a.put((byte) ((max >> 8) & 255));
                        position += 4;
                    }
                } else if (i == 268435456) {
                    while (position < limit) {
                        a.put(byteBuffer.get(position + 1));
                        a.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i == 536870912) {
                    while (position < limit) {
                        a.put(byteBuffer.get(position + 1));
                        a.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        a.put(byteBuffer.get(position + 2));
                        a.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                a.flip();
            }
            i2 /= 2;
            ByteBuffer a2 = a(i2);
            i = this.b.c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            a2.flip();
        }
        i2 *= 2;
        ByteBuffer a22 = a(i2);
        i = this.b.c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        a22.flip();
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) {
        int i = zkVar.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new zk(zkVar.a, zkVar.b, 2) : zk.e;
        }
        throw new al(zkVar);
    }
}
