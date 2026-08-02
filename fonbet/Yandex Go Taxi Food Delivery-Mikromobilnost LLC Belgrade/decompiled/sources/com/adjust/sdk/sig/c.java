package com.adjust.sdk.sig;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import defpackage.kbs;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes.dex */
public final class c {
    public final int a;

    public c(int i) {
        this.a = i;
    }

    public final byte[] a(Context context, byte[] bArr) {
        String str;
        Key secretKeySpec;
        Mac mac = Mac.getInstance("HmacSHA256");
        int i = this.a;
        if (i < 23) {
            if (i >= 18) {
                String string = context.getSharedPreferences("adjust_keys", 0).getString("encrypted_key", null);
                if (string != null) {
                    byte[] decode = Base64.decode(string, 0);
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry("key2", null);
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(2, privateKeyEntry.getPrivateKey());
                    secretKeySpec = new SecretKeySpec(cipher.doFinal(decode), JCSP.AES_NAME);
                } else {
                    str = "Failed to find encrypted key in SharedPreferences";
                }
            } else {
                str = "Unsupported version";
            }
            kbs.g(str);
            return null;
        }
        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
        keyStore2.load(null);
        secretKeySpec = keyStore2.getKey("key2", null);
        mac.init(secretKeySpec);
        mac.update(bArr);
        return mac.doFinal();
    }

    public final void b(Context context) {
        int i = this.a;
        if (i >= 23) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias("key2")) {
                return;
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("key2", 4).build());
            keyGenerator.generateKey();
            return;
        }
        if (i < 18) {
            throw new b();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("adjust_keys", 0);
        if (sharedPreferences.contains("encrypted_key")) {
            return;
        }
        Date time = Calendar.getInstance().getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, 1);
        KeyPairGeneratorSpec.Builder endDate = new KeyPairGeneratorSpec.Builder(context).setAlias("key2").setSubject(new X500Principal("CN=key2")).setSerialNumber(BigInteger.TEN).setStartDate(time).setEndDate(calendar.getTime());
        if (this.a >= 19) {
            endDate.setKeySize(1024);
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(endDate.build());
        keyPairGenerator.genKeyPair();
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
        keyStore2.load(null);
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore2.getEntry("key2", null);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, privateKeyEntry.getCertificate().getPublicKey());
        String encodeToString = Base64.encodeToString(cipher.doFinal(bArr), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("encrypted_key", encodeToString);
        edit.apply();
    }

    public final void a(Context context) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry("key2");
        context.getSharedPreferences("adjust_keys", 0).edit().remove("encrypted_key").apply();
    }
}
