package xsna;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.vuk0;
import xsna.yhq;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes12.dex */
public final class mzg0 {
    public final l900<ady, String> a = new l900<>(1000);
    public final yhq.c b = yhq.a(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    public class a implements yhq.b<b> {
        @Override // xsna.yhq.b
        public final b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    public static final class b implements yhq.d {
        public final MessageDigest b;
        public final vuk0.a c = new vuk0.a();

        public b(MessageDigest messageDigest) {
            this.b = messageDigest;
        }

        @Override // xsna.yhq.d
        @NonNull
        public final vuk0.a h() {
            return this.c;
        }
    }

    public final String a(ady adyVar) {
        String a2;
        synchronized (this.a) {
            a2 = this.a.a(adyVar);
        }
        if (a2 == null) {
            b bVar = (b) this.b.c();
            try {
                adyVar.b(bVar.b);
                byte[] digest = bVar.b.digest();
                char[] cArr = s2r0.b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b2 = digest[i];
                        int i2 = i * 2;
                        char[] cArr2 = s2r0.a;
                        cArr[i2] = cArr2[(b2 & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER];
                    }
                    a2 = new String(cArr);
                }
            } finally {
                this.b.a(bVar);
            }
        }
        synchronized (this.a) {
            this.a.d(adyVar, a2);
        }
        return a2;
    }
}
