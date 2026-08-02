package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.UUID;
import xsna.rqi;

/* loaded from: classes10.dex */
public abstract class fm2 {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = rqi.a(uuidArr.length, 16, 4, length);
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? C.DEFAULT_MUXED_BUFFER_SIZE : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static em2 a(byte[] bArr) {
        kc2 kc2Var = new kc2(bArr);
        if (kc2Var.c < 32) {
            return null;
        }
        kc2Var.e(0);
        if (kc2Var.b() != (kc2Var.c - kc2Var.b) + 4 || kc2Var.b() != 1886614376) {
            return null;
        }
        int b = (kc2Var.b() >> 24) & 255;
        if (b > 1) {
            lg1.a("Unsupported pssh version: ", b, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(kc2Var.i(), kc2Var.i());
        if (b == 1) {
            kc2Var.e(kc2Var.b + (kc2Var.p() * 16));
        }
        int p = kc2Var.p();
        if (p != kc2Var.c - kc2Var.b) {
            return null;
        }
        byte[] bArr2 = new byte[p];
        kc2Var.a(bArr2, 0, p);
        return new em2(uuid, b, bArr2);
    }
}
