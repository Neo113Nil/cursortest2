package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class enz0 extends keo {
    public final long c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public enz0(long j) {
        super("passport_token_drop_performance", r0.j());
        MapBuilder y = qv10.y(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Время дропа старого токена");
        y.put("duration_ms", String.valueOf(j));
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enz0) && this.c == ((enz0) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return qv10.k(this.c, "TokenDropPerformance(durationMs=", Extension.C_BRAKE);
    }
}
