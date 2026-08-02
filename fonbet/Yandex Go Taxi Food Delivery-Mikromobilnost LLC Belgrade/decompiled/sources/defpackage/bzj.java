package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bzj {
    public final DisplayCutout a;

    public bzj(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final u1w a() {
        return Build.VERSION.SDK_INT >= 30 ? u1w.d(qr6.f(this.a)) : u1w.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bzj.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((bzj) obj).a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
