package xsna;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesKsParamException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes13.dex */
public final class d61 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static SecretKey a(Boolean bool, String str) throws AesKsParamException {
        c2f0.a("GCMKS");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
            if (!bool.booleanValue()) {
                return null;
            }
            c2f0.a("GCMKS");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
            return keyGenerator.generateKey();
        } catch (IOException e) {
            c2f0.b("GCMKS", "IOException : " + e.getMessage());
            throw new AesKsParamException("IOException : " + e.getMessage());
        } catch (InvalidAlgorithmParameterException e2) {
            c2f0.b("GCMKS", "InvalidAlgorithmParameterException : " + e2.getMessage());
            throw new AesKsParamException("InvalidAlgorithmParameterException : " + e2.getMessage());
        } catch (KeyStoreException e3) {
            c2f0.b("GCMKS", "KeyStoreException : " + e3.getMessage());
            throw new AesKsParamException("KeyStoreException : " + e3.getMessage());
        } catch (NoSuchAlgorithmException e4) {
            c2f0.b("GCMKS", "NoSuchAlgorithmException : " + e4.getMessage());
            throw new AesKsParamException("NoSuchAlgorithmException : " + e4.getMessage());
        } catch (NoSuchProviderException e5) {
            c2f0.b("GCMKS", "NoSuchProviderException : " + e5.getMessage());
            throw new AesKsParamException("NoSuchProviderException : " + e5.getMessage());
        } catch (UnrecoverableKeyException e6) {
            c2f0.b("GCMKS", "UnrecoverableKeyException : " + e6.getMessage());
            throw new AesKsParamException("UnrecoverableKeyException : " + e6.getMessage());
        } catch (CertificateException e7) {
            c2f0.b("GCMKS", "CertificateException : " + e7.getMessage());
            throw new AesKsParamException("CertificateException : " + e7.getMessage());
        } catch (Exception e8) {
            c2f0.b("GCMKS", "Exception: " + e8.getMessage());
            throw new AesKsParamException(cqi.b(e8, new StringBuilder("Exception : ")));
        }
    }

    public static SecretKey b(Boolean bool, String str) throws AesKsParamException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = a;
        if (((SecretKey) concurrentHashMap.get(str)) == null) {
            synchronized (d61.class) {
                try {
                    if (((SecretKey) concurrentHashMap.get(str)) == null) {
                        SecretKey a2 = a(bool, str);
                        if (a2 == null) {
                            c2f0.b("GCMKS", "AES GCM is decrypt,but alias is null");
                            throw new AesKsParamException("AES GCM is decrypt,but alias is null");
                        }
                        concurrentHashMap.put(str, a2);
                    }
                } finally {
                }
            }
        }
        return (SecretKey) concurrentHashMap.get(str);
    }

    public static String c(String str, String str2) throws AesKsParamException {
        if (TextUtils.isEmpty(str)) {
            c2f0.b("GCMKS", "decrypt alias is empty.");
            throw new AesKsParamException("decrypt alias is empty.");
        }
        if (TextUtils.isEmpty(str2)) {
            c2f0.b("GCMKS", "decrypt content is empty.");
            throw new AesKsParamException("decrypt content is empty.");
        }
        try {
            return new String(d(str, zq70.y(str2)), C.UTF8_NAME);
        } catch (UnsupportedEncodingException unused) {
            c2f0.b("GCMKS", "decrypt content getBytes with utf-8 error.");
            throw new AesKsParamException("decrypt content getBytes with utf-8 error.");
        }
    }

    public static byte[] d(String str, byte[] bArr) throws AesKsParamException {
        if (TextUtils.isEmpty(str)) {
            c2f0.b("GCMKS", "decrypt alias is empty.");
            throw new AesKsParamException("decrypt alias is empty.");
        }
        if (bArr.length == 0) {
            c2f0.b("GCMKS", "decrypt content byte is empty.");
            throw new AesKsParamException("decrypt content byte is empty.");
        }
        if (bArr.length <= 12) {
            c2f0.b("GCMKS", "decrypt content length is less than iv len.");
            throw new AesKsParamException("decrypt content length is less than iv len.");
        }
        SecretKey b = b(Boolean.FALSE, str);
        if (b == null) {
            c2f0.b("GCMKS", "decrypt secretKey is empty.");
            throw new AesKsParamException("decrypt secretKey is empty.");
        }
        if (bArr.length == 0) {
            c2f0.b("GCMKS", "decrypt content is empty.");
            throw new AesKsParamException("decrypt content is empty.");
        }
        if (bArr.length <= 12) {
            c2f0.b("GCMKS", "decrypt content length is less than iv len.");
            throw new AesKsParamException("decrypt content length is less than iv len.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, b, new GCMParameterSpec(128, copyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e) {
            c2f0.b("GCMKS", "InvalidAlgorithmParameterException : " + e.getMessage());
            throw new AesKsParamException("InvalidAlgorithmParameterException : " + e.getMessage());
        } catch (InvalidKeyException e2) {
            c2f0.b("GCMKS", "InvalidKeyException : " + e2.getMessage());
            throw new AesKsParamException("InvalidKeyException : " + e2.getMessage());
        } catch (NoSuchAlgorithmException e3) {
            c2f0.b("GCMKS", "NoSuchAlgorithmException : " + e3.getMessage());
            throw new AesKsParamException("NoSuchAlgorithmException : " + e3.getMessage());
        } catch (BadPaddingException e4) {
            c2f0.b("GCMKS", "BadPaddingException : " + e4.getMessage());
            throw new AesKsParamException("BadPaddingException : " + e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            c2f0.b("GCMKS", "IllegalBlockSizeException : " + e5.getMessage());
            throw new AesKsParamException("IllegalBlockSizeException : " + e5.getMessage());
        } catch (NoSuchPaddingException e6) {
            c2f0.b("GCMKS", "NoSuchPaddingException : " + e6.getMessage());
            throw new AesKsParamException("NoSuchPaddingException : " + e6.getMessage());
        } catch (Exception e7) {
            c2f0.b("GCMKS", "Exception: " + e7.getMessage());
            throw new AesKsParamException(cqi.b(e7, new StringBuilder("Exception: ")));
        }
    }

    public static String e(String str, String str2) throws AesKsParamException {
        if (TextUtils.isEmpty(str)) {
            c2f0.b("GCMKS", "encrypt alias is empty.");
            throw new AesKsParamException("encrypt alias is empty.");
        }
        if (TextUtils.isEmpty(str2)) {
            c2f0.b("GCMKS", "encrypt content is empty.");
            throw new AesKsParamException("encrypt content is empty.");
        }
        try {
            return zq70.l(f(str, str2.getBytes(C.UTF8_NAME)));
        } catch (UnsupportedEncodingException unused) {
            c2f0.b("GCMKS", "encrypt content getBytes with utf-8 error.");
            throw new AesKsParamException("encrypt content getBytes with utf-8 error.");
        }
    }

    public static byte[] f(String str, byte[] bArr) throws AesKsParamException {
        if (TextUtils.isEmpty(str)) {
            c2f0.b("GCMKS", "encrypt alias is empty.");
            throw new AesKsParamException("encrypt alias is empty.");
        }
        if (bArr == null || bArr.length == 0) {
            c2f0.b("GCMKS", "encrypt content is empty.");
            throw new AesKsParamException("encrypt content is empty.");
        }
        SecretKey b = b(Boolean.TRUE, str);
        if (bArr.length == 0) {
            c2f0.b("GCMKS", "encrypt content is empty.");
            throw new AesKsParamException("encrypt content is empty.");
        }
        if (b == null) {
            c2f0.b("GCMKS", "encrypt secretKey is empty.");
            throw new AesKsParamException("encrypt secretKey is empty.");
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, b);
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv == null || iv.length != 12) {
                c2f0.b("GCMKS", "encrypt content iv is invalid.");
                throw new AesKsParamException("encrypt content iv is invalid.");
            }
            byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
            System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
            return copyOf;
        } catch (InvalidKeyException e) {
            c2f0.b("GCMKS", "InvalidKeyException : " + e.getMessage());
            throw new AesKsParamException("InvalidKeyException : " + e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            c2f0.b("GCMKS", "NoSuchAlgorithmException : " + e2.getMessage());
            throw new AesKsParamException("NoSuchAlgorithmException : " + e2.getMessage());
        } catch (BadPaddingException e3) {
            c2f0.b("GCMKS", "BadPaddingException : " + e3.getMessage());
            throw new AesKsParamException("BadPaddingException : " + e3.getMessage());
        } catch (IllegalBlockSizeException e4) {
            c2f0.b("GCMKS", "IllegalBlockSizeException : " + e4.getMessage());
            throw new AesKsParamException("IllegalBlockSizeException : " + e4.getMessage());
        } catch (NoSuchPaddingException e5) {
            c2f0.b("GCMKS", "NoSuchPaddingException : " + e5.getMessage());
            throw new AesKsParamException("NoSuchPaddingException : " + e5.getMessage());
        } catch (Exception e6) {
            c2f0.b("GCMKS", "Exception: " + e6.getMessage());
            throw new AesKsParamException(cqi.b(e6, new StringBuilder("Exception : ")));
        }
    }
}
