package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class inz0 extends keo {
    public final long c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public inz0(long j) {
        super("passport_token_request_performance", r0.j());
        MapBuilder y = qv10.y(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Время получения нового токена");
        y.put("duration_ms", String.valueOf(j));
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inz0) && this.c == ((inz0) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return qv10.k(this.c, "TokenRequestPerformance(durationMs=", Extension.C_BRAKE);
    }
}
