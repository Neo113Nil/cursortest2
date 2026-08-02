package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class fo90 extends keo {
    public final boolean c;

    public fo90(boolean z) {
        super("exchange_oauth_token_success", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Выдача авторизационного токена для конкретного пользователя"), new Pair("is_drop_token_forced", String.valueOf(z))));
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fo90) && this.c == ((fo90) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public final String toString() {
        return nzs.b("Success(isDropTokenForced=", Extension.C_BRAKE, this.c);
    }
}
