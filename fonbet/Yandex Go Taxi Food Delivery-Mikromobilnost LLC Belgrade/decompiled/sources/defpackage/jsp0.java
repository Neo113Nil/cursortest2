package defpackage;

import com.adjust.sdk.Constants;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class jsp0 {
    public static final String a;
    public static final Set b;

    static {
        byte[] bArr = tje.k1;
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        a = str;
        b = j73.f0(new String[]{"ybapp", Constants.SCHEME, str});
    }

    public static String a() {
        return a;
    }
}
