package xsna;

import java.util.Calendar;
import org.shredzone.commons.suncalc.param.TimeResultParameter$Unit;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: BaseBuilder.java */
/* loaded from: classes8.dex */
public class o76<T> implements xto0<T>, Cloneable {
    public double b = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    public double c = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    public Calendar d = Calendar.getInstance();
    public final TimeResultParameter$Unit e = TimeResultParameter$Unit.MINUTES;

    @Override // xsna.xto0
    public final o76 b(int i, int i2, int i3) {
        this.d.clear();
        this.d.set(i, i2 - 1, i3);
        return this;
    }

    public final o76 c(double d, double d2) {
        if (d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("Latitude out of range, -90.0 <= " + d + " <= 90.0");
        }
        this.b = d;
        if (d2 >= -180.0d && d2 <= 180.0d) {
            this.c = d2;
            return this;
        }
        throw new IllegalArgumentException("Longitude out of range, -180.0 <= " + d2 + " <= 180.0");
    }

    public final Object clone() throws CloneNotSupportedException {
        o76 o76Var = (o76) super.clone();
        o76Var.d = (Calendar) this.d.clone();
        return o76Var;
    }
}
