package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Aes128DataSource.java */
/* loaded from: classes12.dex */
public final class e51 implements androidx.media3.datasource.a {
    public final androidx.media3.datasource.a a;
    public final byte[] b;
    public final byte[] c;

    @Nullable
    public CipherInputStream d;

    public e51(androidx.media3.datasource.a aVar, byte[] bArr, byte[] bArr2) {
        this.a = aVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        mjp0Var.getClass();
        this.a.addTransferListener(mjp0Var);
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws IOException {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                bvk bvkVar = new bvk(this.a, evkVar);
                this.d = new CipherInputStream(bvkVar, cipher);
                if (bvkVar.e) {
                    return -1L;
                }
                bvkVar.b.open(bvkVar.c);
                bvkVar.e = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
