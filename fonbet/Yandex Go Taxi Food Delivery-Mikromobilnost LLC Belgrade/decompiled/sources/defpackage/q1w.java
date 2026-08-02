package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes.dex */
public final class q1w {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility c = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public static final wc2 d = new wc2(3);
    public final SecretKeySpec a;
    public final boolean b;

    public q1w(byte[] bArr) {
        if (!c.a()) {
            kbs.v("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        d131.a(bArr.length);
        this.a = new SecretKeySpec(bArr, JCSP.AES_NAME);
        this.b = true;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        int i = rw21.a;
        Integer b = !Objects.equals(System.getProperty(Platform.STR_VENDOR_PROPERTY), "The Android Project") ? null : nbb1.b();
        return (b == null || b.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, length) : new IvParameterSpec(bArr, 0, length);
    }
}
