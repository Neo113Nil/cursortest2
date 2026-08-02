package xsna;

import android.graphics.Insets;
import android.graphics.Path;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: DisplayCutoutCompat.java */
/* loaded from: classes11.dex */
public final class nen {
    public final DisplayCutout a;

    /* compiled from: DisplayCutoutCompat.java */
    public static class a {
        public static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    public static class b {
        public static Path a(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    public nen(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public static nen f(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new nen(displayCutout);
    }

    public final int a() {
        return this.a.getSafeInsetBottom();
    }

    public final int b() {
        return this.a.getSafeInsetLeft();
    }

    public final int c() {
        return this.a.getSafeInsetRight();
    }

    public final int d() {
        return this.a.getSafeInsetTop();
    }

    public final h4x e() {
        return Build.VERSION.SDK_INT >= 30 ? h4x.e(a.a(this.a)) : h4x.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nen.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((nen) obj).a);
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
