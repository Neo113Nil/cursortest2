package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class bz5 extends keo {
    public final boolean c;

    public bz5(boolean z) {
        super("biometry_available_on_device", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Доступна ли биометрия на устройстве: ".concat(z ? "доступна" : "не доступна")), new Pair("value", String.valueOf(z))));
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz5) && this.c == ((bz5) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public final String toString() {
        return nzs.b("BiometryAvailableOnDevice(isAvailable=", Extension.C_BRAKE, this.c);
    }
}
