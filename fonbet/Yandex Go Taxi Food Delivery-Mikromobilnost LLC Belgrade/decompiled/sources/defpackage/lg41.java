package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.WebCookieAuthorizationScheme;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class lg41 {
    public final String a;
    public final dfr b;

    public lg41(String str) {
        this.a = str;
        byte[] bArr = tje.V;
        byte[] bArr2 = new byte[36];
        for (int i = 0; i < 36; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        this.b = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, WebCookieAuthorizationScheme.class), new CommonExperiment(new WebCookieAuthorizationScheme(str.concat("webview-sdk/api/setSession")), ExperimentApplyType.LATEST));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg41) && this.a.equals(((lg41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("WebCookieAuthorizationSchemeDefault(frontendUrl=", this.a, Extension.C_BRAKE);
    }
}
