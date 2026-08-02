package defpackage;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes.dex */
public final class m610 {
    public final String a;

    public m610(String str, Object obj) {
        this.a = str;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
        String str = this.a;
        sb.append(str);
        sb.append(", isKeyStoreBacked=");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            z = keyStore.containsAlias(str);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            z = false;
        }
        return x4e.i(sb, z, "}");
    }
}
