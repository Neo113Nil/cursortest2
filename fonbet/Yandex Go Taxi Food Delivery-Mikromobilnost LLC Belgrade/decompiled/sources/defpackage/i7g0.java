package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.QrGenerationFeatureData;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class i7g0 {
    public final String a;
    public final dfr b;

    public i7g0(String str) {
        this.a = str;
        byte[] bArr = tje.x1;
        byte[] bArr2 = new byte[26];
        for (int i = 0; i < 26; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        this.b = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, QrGenerationFeatureData.class), new CommonExperiment(new QrGenerationFeatureData(false, str.concat("web/p/merchant-qr")), ExperimentApplyType.LATEST));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7g0) && this.a.equals(((i7g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("QrGenerationFeatureDefault(payUrl=", this.a, Extension.C_BRAKE);
    }
}
