package xsna;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;

/* compiled from: AnnexBUtils.java */
/* loaded from: classes12.dex */
public final class ts2 {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005a, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0073, code lost:
    
        if (r5 == 1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.common.collect.g a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            ImmutableList.b bVar = ImmutableList.c;
            return com.google.common.collect.g.f;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        int b = b(asReadOnlyBuffer.position(), asReadOnlyBuffer) + 3;
        ImmutableList.a aVar = new ImmutableList.a();
        int i = b;
        boolean z = true;
        while (b < asReadOnlyBuffer.limit()) {
            if (!z) {
                int b2 = b(b, asReadOnlyBuffer);
                if (b2 == asReadOnlyBuffer.limit()) {
                    break;
                }
                i = b2 + 3;
                z = true;
                b = i;
            } else {
                while (true) {
                    if (b <= asReadOnlyBuffer.limit() - 4) {
                        int i2 = asReadOnlyBuffer.getInt(b);
                        int i3 = i2 & (-256);
                        if (i3 == 0 || i3 == 256) {
                            break;
                        }
                        int i4 = 16777215 & i2;
                        if (i4 == 0 || i4 == 1) {
                            break;
                        }
                        b = (65535 & i2) == 0 ? b + 2 : (i2 & 255) == 0 ? b + 3 : b + 4;
                    } else {
                        if (b == asReadOnlyBuffer.limit() - 3) {
                            short s = asReadOnlyBuffer.getShort(b);
                            byte b3 = asReadOnlyBuffer.get(b + 2);
                            if (s == 0) {
                                if (b3 != 0) {
                                }
                            }
                        }
                        b = asReadOnlyBuffer.limit();
                    }
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.position(i);
                duplicate.limit((b - i) + i);
                aVar.c(duplicate.slice());
                z = false;
            }
        }
        return aVar.g();
    }

    public static int b(int i, ByteBuffer byteBuffer) {
        while (true) {
            if (i > byteBuffer.limit() - 4) {
                if (i <= byteBuffer.limit() - 3) {
                    fxc0.A(byteBuffer.getShort(i) == 0, "Invalid NAL units");
                    byte b = byteBuffer.get(i + 2);
                    if (b != 1) {
                        fxc0.A(b == 0, "Invalid NAL units");
                    }
                } else {
                    while (i < byteBuffer.limit()) {
                        fxc0.A(byteBuffer.get(i) == 0, "Invalid NAL units");
                        i++;
                    }
                }
                return byteBuffer.limit();
            }
            int i2 = byteBuffer.getInt(i);
            int i3 = i2 & (-256);
            if (i3 == 256) {
                break;
            }
            fxc0.A(i3 == 0, "Invalid Nal units");
            int i4 = i2 & 255;
            if (i4 == 1) {
                return i + 1;
            }
            if (i4 == 0) {
                r1 = true;
            }
            fxc0.A(r1, "Invalid Nal units");
            i++;
        }
        return i;
    }
}
