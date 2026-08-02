package sg.bigo.ads.common.utils;

import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes9.dex */
public final class p {
    private static final byte[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final byte[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, AmfConstants.TYPE_TYPED_OBJECT_MARKER, 17, 18, 19, 20, 21, 22};

    @Nullable
    public static String a(@NonNull String str, @NonNull String str2) {
        return b(str, str2);
    }

    @Nullable
    private static String b(@NonNull String str, @NonNull String str2) {
        try {
            return r.a(a(str.getBytes(C.UTF8_NAME), r.c(str2)));
        } catch (UnsupportedEncodingException e) {
            a((ValueCallback<Exception>) null, e);
            return null;
        }
    }

    public static String a(@NonNull String str, @NonNull String str2, @Nullable ValueCallback<Exception> valueCallback) {
        try {
            byte[] b2 = b(str, str2, valueCallback);
            if (b2 != null) {
                return new String(b2, C.UTF8_NAME);
            }
            return null;
        } catch (Exception e) {
            a(valueCallback, e);
            sg.bigo.ads.bn.a.a(0, "SDKCipher", "Failed to decrypt data: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Nullable
    public static byte[] b(@NonNull String str, @NonNull String str2, @Nullable ValueCallback<Exception> valueCallback) {
        try {
            return a(r.c(str), r.c(str2), valueCallback);
        } catch (Exception e) {
            a(valueCallback, e);
            sg.bigo.ads.bn.a.a(0, "SDKCipher", "Failed to decrypt data: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static void a(ValueCallback<Exception> valueCallback, Exception exc) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(exc);
        }
    }

    @Nullable
    public static byte[] b(byte[] bArr) {
        return a(bArr, b, (ValueCallback<Exception>) null);
    }

    @Nullable
    public static byte[] a(byte[] bArr) {
        return a(bArr, b);
    }

    @Nullable
    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a);
            try {
                Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                a((ValueCallback<Exception>) null, e);
                if (e instanceof NoSuchAlgorithmException) {
                    sg.bigo.ads.bn.a.a(0, "SDKCipher", "sdk cipher.encrypt failed, no such algorithm");
                    return bArr;
                }
                sg.bigo.ads.bn.a.a(0, "SDKCipher", "sdk cipher.encrypt failed");
            }
        }
        return null;
    }

    @Nullable
    private static byte[] a(byte[] bArr, byte[] bArr2, ValueCallback<Exception> valueCallback) {
        if (bArr != null && bArr2 != null) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a);
            try {
                Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                cipher.init(2, secretKeySpec, ivParameterSpec);
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                a(valueCallback, e);
                sg.bigo.ads.bn.a.a(0, "SDKCipher", "sdk cipher.decrypt new key failed,input len:" + bArr.length + ",input data:" + Arrays.toString(bArr));
                if (e instanceof NoSuchAlgorithmException) {
                    return bArr;
                }
            }
        }
        return null;
    }
}
