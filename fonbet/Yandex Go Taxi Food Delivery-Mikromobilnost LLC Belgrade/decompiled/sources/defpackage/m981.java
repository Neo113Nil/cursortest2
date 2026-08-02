package defpackage;

import java.nio.ByteBuffer;
import yads.xj;

/* loaded from: classes7.dex */
public final class m981 extends xm61 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[ADDED_TO_REGION, LOOP:4: B:33:0x00b0->B:34:0x00b2, LOOP_START, PHI: r0
      0x00b0: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0034, B:34:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.lv81
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
                        ny61.k();
                        return;
                    }
                }
                ByteBuffer c = c(i2);
                i = this.b.c;
                if (i == 3) {
                    while (position < limit) {
                        c.put((byte) 0);
                        c.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i == 4) {
                    while (position < limit) {
                        float f = byteBuffer.getFloat(position);
                        int i4 = rf71.a;
                        short max = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                        c.put((byte) (max & 255));
                        c.put((byte) ((max >> 8) & 255));
                        position += 4;
                    }
                } else if (i == 268435456) {
                    while (position < limit) {
                        c.put(byteBuffer.get(position + 1));
                        c.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i == 536870912) {
                    while (position < limit) {
                        c.put(byteBuffer.get(position + 1));
                        c.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i != 805306368) {
                        ny61.k();
                        return;
                    }
                    while (position < limit) {
                        c.put(byteBuffer.get(position + 2));
                        c.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                c.flip();
            }
            i2 /= 2;
            ByteBuffer c2 = c(i2);
            i = this.b.c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            c2.flip();
        }
        i2 *= 2;
        ByteBuffer c22 = c(i2);
        i = this.b.c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        c22.flip();
    }

    @Override // defpackage.xm61
    public final mp81 d(mp81 mp81Var) {
        int i = mp81Var.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new mp81(mp81Var.a, mp81Var.b, 2) : mp81.e;
        }
        throw new xj(mp81Var);
    }
}
