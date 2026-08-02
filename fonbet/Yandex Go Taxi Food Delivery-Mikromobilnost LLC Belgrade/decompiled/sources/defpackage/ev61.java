package defpackage;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes4.dex */
public final class ev61 implements AlgorithmParameterSpec {
    public ev61(int i, int i2, byte[] bArr) {
        rq61.a(i);
        rq61.a(i2);
        if (bArr.length == 48) {
            return;
        }
        ny61.g("Encoded secret is not exactly 48 bytes");
        throw null;
    }
}
