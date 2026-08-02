package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class cz5 extends keo {
    public final String c;

    public cz5(String str) {
        super("biometry_generate_key_pair_error", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка генерации ключевой пары: ".concat(str)), new Pair(CRLReasonCodeExtension.REASON, str)));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz5) && jl40.l(this.c, ((cz5) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("BiometryGenerateKeyPairError(error=", this.c, Extension.C_BRAKE);
    }
}
