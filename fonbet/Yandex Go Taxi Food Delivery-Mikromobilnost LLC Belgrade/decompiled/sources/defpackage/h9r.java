package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes10.dex */
public abstract class h9r {
    public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, g9r g9rVar) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, 0, g9rVar, null);
    }

    public static FingerprintManager b(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static boolean c(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean d(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static FingerprintManager.CryptoObject e(jdj jdjVar) {
        if (jdjVar == null) {
            return null;
        }
        Mac mac = (Mac) jdjVar.w;
        Signature signature = (Signature) jdjVar.c;
        Cipher cipher = (Cipher) jdjVar.b;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }
}
