package com.ybsdk.feature.pin.internal.domain;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.ybsdk.feature.pinstorage.internal.data.c;
import defpackage.ny61;
import defpackage.oe91;
import defpackage.tzn;
import defpackage.uza;
import defpackage.zy11;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.Cipher.GostCipher;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes3.dex */
public final class a {
    public static final String d;
    public final c a;
    public final Object b = new Object();
    public volatile boolean c = true;

    static {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (oe91.b[i] ^ oe91.a[i % 8]);
        }
        d = new String(bArr, uza.a);
    }

    public a(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Cipher cipher, ContinuationImpl continuationImpl) {
        PinCryptographyManager$decryptPin$1 pinCryptographyManager$decryptPin$1;
        int i;
        Object b;
        if (continuationImpl instanceof PinCryptographyManager$decryptPin$1) {
            pinCryptographyManager$decryptPin$1 = (PinCryptographyManager$decryptPin$1) continuationImpl;
            int i2 = pinCryptographyManager$decryptPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinCryptographyManager$decryptPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinCryptographyManager$decryptPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinCryptographyManager$decryptPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinCryptographyManager$decryptPin$1.L$0 = cipher;
                    pinCryptographyManager$decryptPin$1.label = 1;
                    b = this.a.b(pinCryptographyManager$decryptPin$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cipher = (Cipher) pinCryptographyManager$decryptPin$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                tzn tznVar = (tzn) b;
                return Base64.encodeToString(cipher.doFinal(tznVar != null ? tznVar.a : null), 1);
            }
        }
        pinCryptographyManager$decryptPin$1 = new PinCryptographyManager$decryptPin$1(this, continuationImpl);
        Object obj2 = pinCryptographyManager$decryptPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinCryptographyManager$decryptPin$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        tzn tznVar2 = (tzn) b;
        return Base64.encodeToString(cipher.doFinal(tznVar2 != null ? tznVar2.a : null), 1);
    }

    public final Object b(String str, Cipher cipher, ContinuationImpl continuationImpl) {
        Object z = this.a.z(new tzn(cipher.doFinal(Base64.decode(str, 1)), cipher.getIV()), continuationImpl);
        return z == CoroutineSingletons.COROUTINE_SUSPENDED ? z : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PinCryptographyManager$getInitializedCipherForDecryption$1 pinCryptographyManager$getInitializedCipherForDecryption$1;
        int i;
        Key d2;
        Cipher cipher;
        Cipher cipher2;
        int i2;
        Object obj;
        int i3;
        if (continuationImpl instanceof PinCryptographyManager$getInitializedCipherForDecryption$1) {
            pinCryptographyManager$getInitializedCipherForDecryption$1 = (PinCryptographyManager$getInitializedCipherForDecryption$1) continuationImpl;
            int i4 = pinCryptographyManager$getInitializedCipherForDecryption$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pinCryptographyManager$getInitializedCipherForDecryption$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = pinCryptographyManager$getInitializedCipherForDecryption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinCryptographyManager$getInitializedCipherForDecryption$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Cipher cipher3 = Cipher.getInstance("AES/GCM/NoPadding");
                    d2 = d();
                    pinCryptographyManager$getInitializedCipherForDecryption$1.L$0 = cipher3;
                    pinCryptographyManager$getInitializedCipherForDecryption$1.L$1 = cipher3;
                    pinCryptographyManager$getInitializedCipherForDecryption$1.L$2 = d2;
                    pinCryptographyManager$getInitializedCipherForDecryption$1.I$0 = 2;
                    pinCryptographyManager$getInitializedCipherForDecryption$1.I$1 = 128;
                    pinCryptographyManager$getInitializedCipherForDecryption$1.label = 1;
                    Object b = this.a.b(pinCryptographyManager$getInitializedCipherForDecryption$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cipher = cipher3;
                    cipher2 = cipher;
                    i2 = 2;
                    obj = b;
                    i3 = 128;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = pinCryptographyManager$getInitializedCipherForDecryption$1.I$1;
                    i2 = pinCryptographyManager$getInitializedCipherForDecryption$1.I$0;
                    d2 = (Key) pinCryptographyManager$getInitializedCipherForDecryption$1.L$2;
                    cipher2 = (Cipher) pinCryptographyManager$getInitializedCipherForDecryption$1.L$1;
                    cipher = (Cipher) pinCryptographyManager$getInitializedCipherForDecryption$1.L$0;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                tzn tznVar = (tzn) obj;
                cipher2.init(i2, d2, new GCMParameterSpec(i3, tznVar != null ? tznVar.b : null));
                return cipher;
            }
        }
        pinCryptographyManager$getInitializedCipherForDecryption$1 = new PinCryptographyManager$getInitializedCipherForDecryption$1(this, continuationImpl);
        Object obj22 = pinCryptographyManager$getInitializedCipherForDecryption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinCryptographyManager$getInitializedCipherForDecryption$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        tzn tznVar2 = (tzn) obj;
        cipher2.init(i2, d2, new GCMParameterSpec(i3, tznVar2 != null ? tznVar2.b : null));
        return cipher;
    }

    public final SecretKey d() {
        synchronized (this.b) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            String str = d;
            Key key = keyStore.getKey(str, null);
            if (key != null) {
                return (SecretKey) key;
            }
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 3);
            builder.setBlockModes(GostCipher.STR_GCM_MODE);
            builder.setEncryptionPaddings("NoPadding");
            builder.setKeySize(256);
            builder.setUserAuthenticationRequired(this.c);
            this.c = true;
            KeyGenParameterSpec build = builder.build();
            KeyGenerator keyGenerator = KeyGenerator.getInstance(JCSP.AES_NAME, "AndroidKeyStore");
            keyGenerator.init(build);
            return keyGenerator.generateKey();
        }
    }
}
