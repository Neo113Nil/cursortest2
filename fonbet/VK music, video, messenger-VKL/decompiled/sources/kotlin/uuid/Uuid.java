package kotlin.uuid;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.brm0;
import xsna.u2i0;

/* compiled from: Uuid.kt */
/* loaded from: classes8.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {
    public static final Uuid b = new Uuid(0, 0);
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    /* compiled from: Uuid.kt */
    public static final class a {
        public static Uuid a() {
            byte[] bArr = new byte[16];
            u2i0.a.nextBytes(bArr);
            byte b = (byte) (bArr[6] & AmfConstants.TYPE_XML_DOCUMENT_MARKER);
            bArr[6] = b;
            bArr[6] = (byte) (b | 64);
            byte b2 = (byte) (bArr[8] & CharsetEncoder.DEFAULT_REPLACEMENT);
            bArr[8] = b2;
            bArr[8] = (byte) (b2 | 128);
            long b3 = kotlin.uuid.a.b(0, bArr);
            long b4 = kotlin.uuid.a.b(8, bArr);
            return (b3 == 0 && b4 == 0) ? Uuid.b : new Uuid(b3, b4);
        }
    }

    public Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new c(this.mostSignificantBits, this.leastSignificantBits);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Uuid uuid) {
        Uuid uuid2 = uuid;
        long j = this.mostSignificantBits;
        long j2 = uuid2.mostSignificantBits;
        return j != j2 ? Long.compareUnsigned(j, j2) : Long.compareUnsigned(this.leastSignificantBits, uuid2.leastSignificantBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final String h() {
        byte[] bArr = new byte[36];
        kotlin.uuid.a.a(this.mostSignificantBits, 0, 0, 4, bArr);
        bArr[8] = 45;
        kotlin.uuid.a.a(this.mostSignificantBits, 9, 4, 6, bArr);
        bArr[13] = 45;
        kotlin.uuid.a.a(this.mostSignificantBits, 14, 6, 8, bArr);
        bArr[18] = 45;
        kotlin.uuid.a.a(this.leastSignificantBits, 19, 0, 2, bArr);
        bArr[23] = 45;
        kotlin.uuid.a.a(this.leastSignificantBits, 24, 2, 8, bArr);
        return brm0.u(bArr);
    }

    public final int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public final String toString() {
        return h();
    }
}
