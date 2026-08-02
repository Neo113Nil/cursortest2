package xsna;

import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;

/* compiled from: DisplayCompat.java */
/* loaded from: classes.dex */
public final class men {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r2 = r2.getRoundedCorner(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tog0 a(Display display, int i) {
        RoundedCorner roundedCorner;
        int position;
        int i2;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(lhg.a(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i2 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new tog0(i2, radius, center);
    }
}
