package defpackage;

import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class kz5 extends keo {
    public static final kz5 c = new kz5("biometry_public_key_exists", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Публичный ключ существует"));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kz5);
    }

    public final int hashCode() {
        return 1466140162;
    }

    public final String toString() {
        return "BiometryPublicKeyExists";
    }
}
