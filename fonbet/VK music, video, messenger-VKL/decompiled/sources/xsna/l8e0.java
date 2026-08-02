package xsna;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* compiled from: ProtectionSpecificHeader.java */
/* loaded from: classes13.dex */
public abstract class l8e0 {
    public static final HashMap a = new HashMap();

    public abstract ByteBuffer a();

    public abstract void b(ByteBuffer byteBuffer);

    public final boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtectionSpecificHeader{data=");
        ByteBuffer duplicate = a().duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        sb.append(skd.c(0, bArr));
        sb.append('}');
        return sb.toString();
    }
}
