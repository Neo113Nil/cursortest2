package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class eqp0 {
    public static final eqp0 i;
    public final boolean a;
    public final String b;
    public final List c;
    public final boolean d;
    public final int e;
    public final List f;
    public final int g;
    public final List h;

    static {
        byte[] bArr = y5e.K;
        byte[] bArr2 = new byte[21];
        for (int i2 = 0; i2 < 21; i2++) {
            bArr2[i2] = (byte) (bArr[i2] ^ y5e.c[i2 % 8]);
        }
        i = new eqp0(true, new String(bArr2, uza.a), EmptyList.a, true, 500, scc.g(Constants.KEY_EXCEPTION, "name", "exceptionMessage", Constants.KEY_MESSAGE, "payload"), 40, scc.g("errorType", AuthSdkActivity.RESPONSE_TYPE_CODE, "traceId", "metricaUuid", "deviceId", "passportUid", "retryPolicyId"));
    }

    public eqp0(boolean z, String str, List list, boolean z2, int i2, List list2, int i3, List list3) {
        this.a = z;
        this.b = str;
        this.c = list;
        this.d = z2;
        this.e = i2;
        this.f = list2;
        this.g = i3;
        this.h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqp0)) {
            return false;
        }
        eqp0 eqp0Var = (eqp0) obj;
        return this.a == eqp0Var.a && jl40.l(this.b, eqp0Var.b) && this.c.equals(eqp0Var.c) && this.d == eqp0Var.d && this.e == eqp0Var.e && jl40.l(this.f, eqp0Var.f) && this.g == eqp0Var.g && jl40.l(this.h, eqp0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + oyr.b(this.g, unr0.c(oyr.b(this.e, unr0.e(unr0.c(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("SdkRtmConfig(isEnabled=", ", projectName=", this.b, ", blackList=", this.a);
        nzs.p(v, this.c, ", trimAdditionalEnabled=", this.d, ", maxAdditionalLength=");
        v.append(this.e);
        v.append(", additionalToTrim=");
        v.append(this.f);
        v.append(", truncatedSize=");
        v.append(this.g);
        v.append(", importantFields=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
