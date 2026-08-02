package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class pz5 extends keo {
    public final String c;
    public final int d;

    public pz5(String str, int i) {
        super("biometry_signature_error", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка формирования подписи: " + str + ", error_code = " + i), new Pair(CRLReasonCodeExtension.REASON, str), new Pair("error_code", String.valueOf(i))));
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz5)) {
            return false;
        }
        pz5 pz5Var = (pz5) obj;
        return jl40.l(this.c, pz5Var.c) && this.d == pz5Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.d, "BiometrySignatureErrorWithCode(error=", this.c, ", errorCode=", Extension.C_BRAKE);
    }
}
