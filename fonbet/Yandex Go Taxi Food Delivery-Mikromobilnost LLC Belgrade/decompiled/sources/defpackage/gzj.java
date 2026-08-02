package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import java.util.Locale;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public final class gzj {
    public static final Size e = new Size(1920, 1080);
    public static final Size f = new Size(320, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
    public static final Size g = new Size(640, 480);
    public static final Object h = new Object();
    public static volatile gzj i;
    public final DisplayManager a;
    public volatile Size b = null;
    public final t810 c = new t810();
    public final m0k d = new m0k();

    public gzj(Context context) {
        this.a = (DisplayManager) context.getSystemService("display");
    }

    public static gzj b(Context context) {
        if (i == null) {
            synchronized (h) {
                try {
                    if (i == null) {
                        i = new gzj(context);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public static Display d(Display[] displayArr, boolean z) {
        Display display = null;
        int i2 = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i3 = point.x * point.y;
                if (i3 > i2) {
                    display = display2;
                    i2 = i3;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size e2;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = vjs0.a;
        if (size.getHeight() * size.getWidth() < vjs0.a(f)) {
            size = this.d.a != null ? (Size) SmallDisplaySizeQuirk.a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (this.c.a != null && (e2 = ExtraCroppingQuirk.e(SurfaceConfig$ConfigType.PRIV)) != null) {
            if (e2.getHeight() * e2.getWidth() > size.getHeight() * size.getWidth()) {
                return e2;
            }
        }
        return size;
    }

    public final Display c(boolean z) {
        Display[] displays = this.a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d = d(displays, z);
        if (d == null && z) {
            d = d(displays, false);
        }
        if (d != null) {
            return d;
        }
        ny61.g("No display can be found from the input display manager!");
        return null;
    }

    public final Size e() {
        if (this.b != null) {
            return this.b;
        }
        this.b = a();
        return this.b;
    }
}
