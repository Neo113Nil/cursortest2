package xsna;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.a;
import com.vk.music.player.core.helper.moosic.VkMusicOfflineCipher;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: EncryptedFileDataSource.kt */
/* loaded from: classes3.dex */
public final class ljp extends gc6 {
    public final String r;
    public final evk s;
    public final VkMusicOfflineCipher t;
    public CipherInputStream u;
    public Long v;

    /* compiled from: EncryptedFileDataSource.kt */
    public static final class a implements a.InterfaceC0045a {
        public final String a;
        public final evk b;
        public final VkMusicOfflineCipher c;

        public a(String str, evk evkVar, VkMusicOfflineCipher vkMusicOfflineCipher) {
            this.a = str;
            this.b = evkVar;
            this.c = vkMusicOfflineCipher;
        }

        @Override // androidx.media3.datasource.a.InterfaceC0045a
        public final androidx.media3.datasource.a createDataSource() {
            return new ljp(this.a, this.b, this.c);
        }
    }

    public ljp(String str, evk evkVar, VkMusicOfflineCipher vkMusicOfflineCipher) {
        super(true);
        this.r = str;
        this.s = evkVar;
        this.t = vkMusicOfflineCipher;
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        CipherInputStream cipherInputStream = this.u;
        if (cipherInputStream != null) {
            cipherInputStream.close();
        }
        this.u = null;
    }

    @Override // androidx.media3.datasource.a
    public final Uri getUri() {
        return this.s.a;
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) {
        evk evkVar2 = this.s;
        long j = evkVar2.h;
        if (j != -1) {
            this.v = Long.valueOf(j);
        } else {
            this.v = Long.valueOf(j);
            if (j == 2147483647L) {
                this.v = -1L;
            }
        }
        FileInputStream fileInputStream = new FileInputStream(evkVar2.a.getPath());
        String str = evkVar2.i;
        byte[] bArr = evkVar2.d;
        VkMusicOfflineCipher vkMusicOfflineCipher = this.t;
        vkMusicOfflineCipher.getClass();
        SecretKey secretKey = vkMusicOfflineCipher.b;
        String str2 = this.r;
        if (secretKey == null || !epx.f(vkMusicOfflineCipher.c, str2)) {
            vkMusicOfflineCipher.c = str2;
            File file = new File(vkMusicOfflineCipher.a.a, zr.a("key.", str2, ".json"));
            if (file.exists()) {
                vkMusicOfflineCipher.d = nbr.r(file, emb.b);
            }
            String str3 = vkMusicOfflineCipher.d;
            if (str3 == null || str3.length() == 0) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                SecretKey generateKey = keyGenerator.generateKey();
                vkMusicOfflineCipher.b = generateKey;
                String encodeToString = generateKey != null ? Base64.encodeToString(generateKey.getEncoded(), 0) : null;
                vkMusicOfflineCipher.d = encodeToString;
                nbr.w(file, encodeToString, emb.b);
            } else {
                vkMusicOfflineCipher.b = new SecretKeySpec(Base64.decode(vkMusicOfflineCipher.d, 0), "AES");
                if (!file.exists()) {
                    nbr.w(file, vkMusicOfflineCipher.d, emb.b);
                }
            }
        }
        Key secretKeySpec = str != null ? new SecretKeySpec(Base64.decode(str, 0), "AES") : vkMusicOfflineCipher.b;
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr));
        this.u = new CipherInputStream(fileInputStream, cipher);
        long j2 = evkVar.g;
        if (j2 > 0) {
            byte[] bArr2 = new byte[16384];
            long j3 = j2;
            while (j3 > 0) {
                j3 -= this.u.read(bArr2, 0, (int) Math.min(j3, 16384));
            }
            Long l = this.v;
            this.v = l != null ? Long.valueOf(l.longValue() - j2) : null;
        }
        return this.v.longValue();
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        CipherInputStream cipherInputStream = this.u;
        if (cipherInputStream == null) {
            throw new IOException("No open file");
        }
        if (this.v.longValue() <= 0) {
            return -1;
        }
        try {
            int read = cipherInputStream.read(bArr, i, i2);
            if (read > 0) {
                this.v = Long.valueOf(this.v.longValue() - read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSource.FileDataSourceException(e, 2000);
        }
    }
}
