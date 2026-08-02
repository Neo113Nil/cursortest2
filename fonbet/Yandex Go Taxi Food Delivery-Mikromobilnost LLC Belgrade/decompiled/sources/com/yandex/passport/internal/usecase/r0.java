package com.yandex.passport.internal.usecase;

import android.security.keystore.KeyGenParameterSpec;
import com.yandex.passport.internal.report.s6;
import com.yandex.passport.internal.report.yd;
import defpackage.uza;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.Result;
import ru.CryptoPro.JCSP.Cipher.GostCipher;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes8.dex */
public final class r0 {
    public static final Charset d = uza.a;
    public final com.yandex.passport.internal.report.reporters.w a;
    public SecretKey b;
    public final KeyGenParameterSpec c = new KeyGenParameterSpec.Builder("_passport_security_master_key_", 3).setBlockModes(GostCipher.STR_GCM_MODE).setEncryptionPaddings("NoPadding").setKeySize(256).build();

    public r0(com.yandex.passport.internal.report.reporters.w wVar) {
        this.a = wVar;
    }

    public final Serializable a(String str, String str2) {
        Object failure;
        try {
            failure = b();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            com.yandex.passport.internal.report.reporters.w wVar = this.a;
            wVar.getClass();
            wVar.f(s6.w, new yd(a), new com.yandex.passport.internal.report.i(str, 6, false), new yd(str2, 14, false));
        }
        return (Serializable) failure;
    }

    public final SecretKey b() {
        SecretKey secretKey;
        SecretKey secretKey2 = this.b;
        if (secretKey2 != null) {
            return secretKey2;
        }
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyGenParameterSpec keyGenParameterSpec = this.c;
        if (keyStore.containsAlias(keyGenParameterSpec.getKeystoreAlias())) {
            secretKey = ((KeyStore.SecretKeyEntry) keyStore.getEntry(keyGenParameterSpec.getKeystoreAlias(), null)).getSecretKey();
        } else {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(JCSP.AES_NAME, "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
            secretKey = ((KeyStore.SecretKeyEntry) keyStore.getEntry(keyGenParameterSpec.getKeystoreAlias(), null)).getSecretKey();
        }
        this.b = secretKey;
        return secretKey;
    }
}
