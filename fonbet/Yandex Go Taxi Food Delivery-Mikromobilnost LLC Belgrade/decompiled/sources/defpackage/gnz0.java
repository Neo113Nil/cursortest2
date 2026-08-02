package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class gnz0 extends keo {
    public final long c;
    public final boolean d;
    public final boolean e;
    public final Long f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gnz0(long j, boolean z, Long l) {
        super("token_generation_performance", r0.j());
        MapBuilder y = qv10.y(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Время генерации токена");
        y.put("duration_ms", String.valueOf(j));
        y.put("is_drop_token_forced", String.valueOf(true));
        y.put("is_success", String.valueOf(z));
        y.put("uid", String.valueOf(l.longValue()));
        this.c = j;
        this.d = true;
        this.e = z;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnz0)) {
            return false;
        }
        gnz0 gnz0Var = (gnz0) obj;
        return this.c == gnz0Var.c && this.d == gnz0Var.d && this.e == gnz0Var.e && jl40.l(this.f, gnz0Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(Long.hashCode(this.c) * 31, 31, this.d), 31, this.e);
        Long l = this.f;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "TokenGenerationPerformance(durationMs=" + this.c + ", isDropTokenForced=" + this.d + ", isSuccess=" + this.e + ", uid=" + this.f + Extension.C_BRAKE;
    }
}
