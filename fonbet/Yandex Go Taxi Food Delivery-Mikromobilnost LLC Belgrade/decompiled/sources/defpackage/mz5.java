package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class mz5 extends keo {
    public final Map c;
    public final String d;

    public mz5(Map map, String str) {
        super("biometry_send_public_key", b.n(b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Отправка публичного ключа"), new Pair("device_pubkey", str)), map));
        this.c = map;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz5)) {
            return false;
        }
        mz5 mz5Var = (mz5) obj;
        return jl40.l(this.c, mz5Var.c) && jl40.l(this.d, mz5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "BiometrySendPublicKey(analyticsParams=" + this.c + ", devicePubkey=" + this.d + Extension.C_BRAKE;
    }
}
