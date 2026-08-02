package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class e77 implements cpg, yd70, b891 {
    public final ByteBuffer a;

    public e77(ByteBuffer byteBuffer, int i) {
        switch (i) {
            case 2:
                this.a = byteBuffer.slice();
                break;
            default:
                this.a = byteBuffer;
                break;
        }
    }

    @Override // defpackage.b891
    public void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            slice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // defpackage.yd70
    public void b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putInt(num.intValue()).array());
        }
    }

    @Override // defpackage.cpg
    public void cleanup() {
    }

    @Override // defpackage.cpg
    public Object d() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.b891
    public long zza() {
        return this.a.capacity();
    }

    public e77() {
        this.a = ByteBuffer.allocate(4);
    }
}
