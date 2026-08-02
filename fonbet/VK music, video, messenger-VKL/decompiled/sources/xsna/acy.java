package xsna;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.security.auth.x500.X500Principal;
import one.video.calls.sdk_private.f;

/* compiled from: CertificateAuthoritiesExtension.java */
/* loaded from: classes8.dex */
public final class acy extends pt50 {
    public final ArrayList a = new ArrayList();

    public acy(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.j {
        int a = a(byteBuffer, f.c.certificate_authorities.k, 2);
        int i = byteBuffer.getShort();
        if (a != i + 2) {
            throw new one.video.calls.sdk_private.j("inconsistent length fields");
        }
        while (i > 0) {
            if (i < 2) {
                throw new one.video.calls.sdk_private.j("inconsistent length fields");
            }
            int i2 = i - 2;
            int i3 = byteBuffer.getShort() & 65535;
            if (i3 > i2) {
                throw new one.video.calls.sdk_private.j("inconsistent length fields");
            }
            if (i3 > byteBuffer.remaining()) {
                throw new one.video.calls.sdk_private.j("inconsistent length fields");
            }
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            i = i2 - i3;
            try {
                this.a.add(new X500Principal(bArr));
            } catch (IllegalArgumentException unused) {
                throw new one.video.calls.sdk_private.j("authority not in DER format");
            }
        }
    }

    @Override // xsna.pt50
    public final byte[] b() {
        ArrayList arrayList = this.a;
        int sum = arrayList.stream().mapToInt(new xby()).sum() + (arrayList.size() << 1);
        final ByteBuffer allocate = ByteBuffer.allocate(sum + 6);
        allocate.putShort(f.c.certificate_authorities.k);
        allocate.putShort((short) (sum + 2));
        allocate.putShort((short) sum);
        arrayList.stream().forEach(new Consumer() { // from class: xsna.yby
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                X500Principal x500Principal = (X500Principal) obj;
                short length = (short) x500Principal.getEncoded().length;
                ByteBuffer byteBuffer = allocate;
                byteBuffer.putShort(length);
                byteBuffer.put(x500Principal.getEncoded());
            }
        });
        return allocate.array();
    }
}
