package defpackage;

import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class d4p extends keo {
    public static final d4p c = new d4p("external_oauth_token_initialized", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Инициализирован внешний OAuth токен"));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d4p);
    }

    public final int hashCode() {
        return 1210214833;
    }

    public final String toString() {
        return "ExternalTokenInitialized";
    }
}
