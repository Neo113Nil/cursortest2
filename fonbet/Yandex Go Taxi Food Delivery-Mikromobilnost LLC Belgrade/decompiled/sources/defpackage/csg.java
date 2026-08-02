package defpackage;

import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlinx.datetime.Clock;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.UtcOffset;
import kotlinx.datetime.format.Padding;

/* loaded from: classes4.dex */
public abstract class csg {
    static {
        LocalTime.Companion.getClass();
        u4z u4zVar = new u4z(new oz2());
        Padding padding = Padding.ZERO;
        u4zVar.c(new xd5(new xsu(padding)));
        ooc.f(u4zVar, ':');
        u4zVar.c(new xd5(new qi20(padding)));
        u4zVar.build();
    }

    public static int a() {
        boolean z;
        TimeZone timeZone;
        Instant now = Clock.System.INSTANCE.now();
        int i = TimeZone.b;
        ZoneId systemDefault = ZoneId.systemDefault();
        if (systemDefault instanceof ZoneOffset) {
            timeZone = new oer(new UtcOffset((ZoneOffset) systemDefault).getZoneOffset());
        } else {
            try {
                z = systemDefault.getRules().isFixedOffset();
            } catch (ArrayIndexOutOfBoundsException unused) {
                z = false;
            }
            if (z) {
                timeZone = new oer(systemDefault);
            } else {
                timeZone = new TimeZone(systemDefault);
            }
        }
        return r8z0.toLocalDateTime(now, timeZone).b();
    }
}
