package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PsshAtomUtil.java */
/* loaded from: classes12.dex */
public final class xae0 {

    /* compiled from: PsshAtomUtil.java */
    public static final class a {
        public final UUID a;

        public a(UUID uuid, int i, byte[] bArr, @Nullable UUID[] uuidArr) {
            this.a = uuid;
        }
    }

    public static byte[] a(UUID uuid, @Nullable byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
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
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    @Nullable
    public static a c(byte[] bArr) {
        UUID[] uuidArr;
        xi90 xi90Var = new xi90(bArr);
        if (xi90Var.c < 32) {
            return null;
        }
        xi90Var.P(0);
        int a2 = xi90Var.a();
        int p = xi90Var.p();
        if (p != a2) {
            ahn.F("Advertised atom size (" + p + ") does not match buffer size: " + a2);
            return null;
        }
        int p2 = xi90Var.p();
        if (p2 != 1886614376) {
            sn.d(p2, "Atom type is not pssh: ");
            return null;
        }
        int e = oa8.e(xi90Var.p());
        if (e > 1) {
            sn.d(e, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(xi90Var.w(), xi90Var.w());
        if (e == 1) {
            int G = xi90Var.G();
            uuidArr = new UUID[G];
            for (int i = 0; i < G; i++) {
                uuidArr[i] = new UUID(xi90Var.w(), xi90Var.w());
            }
        } else {
            uuidArr = null;
        }
        int G2 = xi90Var.G();
        int a3 = xi90Var.a();
        if (G2 == a3) {
            byte[] bArr2 = new byte[G2];
            xi90Var.n(bArr2, 0, G2);
            return new a(uuid, e, bArr2, uuidArr);
        }
        ahn.F("Atom data size (" + G2 + ") does not match the bytes left: " + a3);
        return null;
    }
}
