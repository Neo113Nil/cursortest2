package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public interface j571 {
    static long a(j571 j571Var) {
        byte[] bArr = (byte[]) ((g581) j571Var).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
