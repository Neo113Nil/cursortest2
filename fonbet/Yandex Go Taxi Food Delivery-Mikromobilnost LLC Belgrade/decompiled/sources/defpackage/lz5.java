package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.internal.analytics.OperationType;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class lz5 extends keo {
    public final String c;
    public final OperationType d;

    public lz5(String str, OperationType operationType) {
        super("biometry_send_public_key", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Отправка публичного ключа"), new Pair("device_pubkey", str), new Pair("operation", operationType.getType())));
        this.c = str;
        this.d = operationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz5)) {
            return false;
        }
        lz5 lz5Var = (lz5) obj;
        return jl40.l(this.c, lz5Var.c) && this.d == lz5Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "BiometrySendPublicKey(devicePubkey=" + this.c + ", operation=" + this.d + Extension.C_BRAKE;
    }
}
