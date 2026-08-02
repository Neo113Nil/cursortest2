package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class eo90 extends keo {
    public eo90() {
        super("exchange_oauth_token_success", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Выдача авторизационного токена для конкретного пользователя"), new Pair("is_drop_token_forced", String.valueOf(false))));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eo90);
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    public final String toString() {
        return "Success(isDropTokenForced=false)";
    }
}
