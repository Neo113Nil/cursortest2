package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class ao90 extends keo {
    public final String c;

    public ao90(String str) {
        super("exchange_oauth_token_failure", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Выдача авторизационного токена для конкретного пользователя"), new Pair(CRLReasonCodeExtension.REASON, str)));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao90) && jl40.l(this.c, ((ao90) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("Failure(reason=", this.c, Extension.C_BRAKE);
    }
}
