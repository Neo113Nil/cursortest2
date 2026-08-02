package xsna;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: CencSampleEncryptionInformationGroupEntry.java */
/* loaded from: classes13.dex */
public final class lpa extends vju {
    public boolean a;
    public byte b;
    public UUID c;

    @Override // xsna.vju
    public final ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        aqw.v(this.a ? 1 : 0, allocate);
        if (this.a) {
            allocate.put((byte) (this.b & 255));
            allocate.put(k15.k(this.c));
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    @Override // xsna.vju
    public final String b() {
        return "seig";
    }

    @Override // xsna.vju
    public final void c(ByteBuffer byteBuffer) {
        this.a = crx0.v(byteBuffer) == 1;
        this.b = (byte) crx0.e(byteBuffer.get());
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.c = k15.j(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lpa.class != obj.getClass()) {
            return false;
        }
        lpa lpaVar = (lpa) obj;
        if (this.a != lpaVar.a || this.b != lpaVar.b) {
            return false;
        }
        UUID uuid = this.c;
        UUID uuid2 = lpaVar.c;
        return uuid == null ? uuid2 == null : uuid.equals(uuid2);
    }

    public final int hashCode() {
        int i = (((this.a ? 7 : 19) * 31) + this.b) * 31;
        UUID uuid = this.c;
        return i + (uuid != null ? uuid.hashCode() : 0);
    }

    public final String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.a + ", ivSize=" + ((int) this.b) + ", kid=" + this.c + '}';
    }
}
