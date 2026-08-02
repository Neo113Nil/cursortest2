package yads;

import android.location.Location;
import java.util.Iterator;
import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class fi1 {
    public final ai1 a = new ai1();

    public final Location a(List list) {
        Iterator it = list.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            this.a.getClass();
            if (location != null) {
                long time = location2.getTime() - location.getTime();
                long j = ai1.a;
                boolean z = time > j;
                boolean z2 = time < (-j);
                boolean z3 = time > 0;
                int accuracy = (int) (location2.getAccuracy() - location.getAccuracy());
                boolean z4 = accuracy > 0;
                boolean z5 = accuracy < 0;
                boolean z6 = ((long) accuracy) > 200;
                boolean f = epx.f(location2.getProvider(), location.getProvider());
                if (!z) {
                    if (!z2) {
                        if (!z5) {
                            if (z3) {
                                if (!z4) {
                                }
                            }
                            if (z3 && !z6 && f) {
                            }
                        }
                    }
                }
            }
            location = location2;
        }
        return location;
    }
}
