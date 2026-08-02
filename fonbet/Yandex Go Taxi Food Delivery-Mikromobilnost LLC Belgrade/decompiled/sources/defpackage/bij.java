package defpackage;

import java.util.Calendar;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bij {
    public final MapBuilder a;
    public final Calendar b;

    public bij(MapBuilder mapBuilder, Calendar calendar) {
        this.a = mapBuilder;
        this.b = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bij)) {
            return false;
        }
        bij bijVar = (bij) obj;
        return this.a.equals(bijVar.a) && this.b.equals(bijVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffRateCalendarEntity(styleByDate=" + this.a + ", firstAvailableDate=" + this.b + Extension.C_BRAKE;
    }
}
