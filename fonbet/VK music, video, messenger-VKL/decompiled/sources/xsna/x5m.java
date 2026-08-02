package xsna;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: DeviceId.kt */
/* loaded from: classes7.dex */
public final class x5m {
    public static final io.reactivex.rxjava3.internal.observers.d<String> a = new io.reactivex.rxjava3.internal.observers.d<>(1);

    public static byte[] a(long j) {
        String str = Build.FINGERPRINT;
        byte[] bArr = new byte[40];
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 40);
        wrap.position(32);
        wrap.putLong(j);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes(emb.b));
        for (int i = 32; i < 40; i++) {
            messageDigest.update(wrap.get(i));
        }
        messageDigest.digest(bArr, 0, 32);
        return bArr;
    }
}
