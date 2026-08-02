package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class bo90 extends keo {
    public final String c;

    public bo90(String str) {
        super("exchange_oauth_token_failure", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Выдача авторизационного токена для конкретного пользователя"), new Pair("is_drop_token_forced", String.valueOf(false)), new Pair(CRLReasonCodeExtension.REASON, str)));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bo90) && jl40.l(this.c, ((bo90) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return oyr.p("Failure(isDropTokenForced=false, reason=", this.c, Extension.C_BRAKE);
    }
}
