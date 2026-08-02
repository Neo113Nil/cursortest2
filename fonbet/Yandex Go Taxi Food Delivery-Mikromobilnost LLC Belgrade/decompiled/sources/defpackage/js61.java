package defpackage;

import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCP.Key.SpecKey;

/* loaded from: classes7.dex */
public final class js61 extends CipherInputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ js61(Object obj, InputStream inputStream, Cipher cipher, int i) {
        super(inputStream, cipher);
        this.a = i;
        this.b = obj;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    super.close();
                } catch (Exception unused) {
                }
                SecretKey secretKey = (SecretKey) ((rr41) obj).c;
                if (secretKey != null) {
                    ((SpecKey) secretKey).clear();
                    break;
                }
                break;
            default:
                try {
                    super.close();
                } catch (Exception unused2) {
                }
                SecretKey secretKey2 = (SecretKey) ((a441) obj).c;
                if (secretKey2 != null) {
                    ((SpecKey) secretKey2).clear();
                    break;
                }
                break;
        }
    }
}
