package defpackage;

import android.graphics.Bitmap;
import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gtk0 {
    public final Point a;
    public final Bitmap b;

    public gtk0(Point point, Bitmap bitmap) {
        this.a = point;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtk0)) {
            return false;
        }
        gtk0 gtk0Var = (gtk0) obj;
        return jl40.l(this.a, gtk0Var.a) && jl40.l(this.b, gtk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrafficLightObject(point=" + this.a + ", icon=" + this.b + Extension.C_BRAKE;
    }
}
