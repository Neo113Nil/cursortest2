package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class co90 extends keo {
    public final boolean c;
    public final String d;

    public co90(boolean z, String str) {
        super("exchange_oauth_token_failure", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Выдача авторизационного токена для конкретного пользователя"), new Pair("is_drop_token_forced", String.valueOf(z)), new Pair(CRLReasonCodeExtension.REASON, str)));
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co90)) {
            return false;
        }
        co90 co90Var = (co90) obj;
        return this.c == co90Var.c && jl40.l(this.d, co90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Boolean.hashCode(this.c) * 31);
    }

    public final String toString() {
        return xvz.m("Failure(isDropTokenForced=", this.c, ", reason=", this.d, Extension.C_BRAKE);
    }
}
