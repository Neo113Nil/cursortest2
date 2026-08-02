package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes10.dex */
public final class bf1 implements kpg {
    public final kpg a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream w;

    public bf1(kpg kpgVar, byte[] bArr, byte[] bArr2) {
        this.a = kpgVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
        cj01Var.getClass();
        this.a.addTransferListener(cj01Var);
    }

    @Override // defpackage.kpg
    public final void close() {
        if (this.w != null) {
            this.w = null;
            this.a.close();
        }
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.kpg
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, JCSP.AES_NAME), new IvParameterSpec(this.c));
                lpg lpgVar = new lpg(this.a, npgVar);
                this.w = new CipherInputStream(lpgVar, cipher);
                lpgVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                ny61.j(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            ny61.j(e2);
            return 0L;
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        this.w.getClass();
        int read = this.w.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
