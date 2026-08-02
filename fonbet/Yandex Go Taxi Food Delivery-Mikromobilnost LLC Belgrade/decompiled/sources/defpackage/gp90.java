package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class gp90 extends keo {
    public final long c;
    public final boolean d;

    public gp90(long j, boolean z) {
        super("passport_token_performance", b.i(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Общее время получения токена из Passport"), new Pair("duration_ms", String.valueOf(j)), new Pair("is_success", String.valueOf(z))));
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp90)) {
            return false;
        }
        gp90 gp90Var = (gp90) obj;
        return this.c == gp90Var.c && this.d == gp90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "PassportTokenLoading(durationMs=" + this.c + ", isSuccess=" + this.d + Extension.C_BRAKE;
    }
}
