package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import yads.t31;

/* loaded from: classes7.dex */
public final class hs81 extends wk81 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final SparseArray J;
    public final SparseBooleanArray K;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public hs81(Context context) {
        Point point;
        Point point2;
        String[] split;
        DisplayManager displayManager;
        CaptioningManager captioningManager;
        int i = rf71.a;
        if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.p = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.o = t31.n(i >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Display display = (i < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && rf71.y(context)) {
            String w = i < 28 ? rf71.w("sys.display-size") : rf71.w("vendor.display-size");
            if (!TextUtils.isEmpty(w)) {
                try {
                    split = w.trim().split(RemoteBioParameters.X, -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point2 = new Point(parseInt, parseInt2);
                        int i2 = point2.x;
                        int i3 = point2.y;
                        this.e = i2;
                        this.f = i3;
                        this.g = true;
                        this.J = new SparseArray();
                        this.K = new SparseBooleanArray();
                        a();
                    }
                }
                nba1.c("Util", "Invalid display size: " + w);
            }
            if ("Sony".equals(rf71.c) && rf71.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                point2 = point;
                int i22 = point2.x;
                int i32 = point2.y;
                this.e = i22;
                this.f = i32;
                this.g = true;
                this.J = new SparseArray();
                this.K = new SparseBooleanArray();
                a();
            }
        }
        point = new Point();
        if (i >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        point2 = point;
        int i222 = point2.x;
        int i322 = point2.y;
        this.e = i222;
        this.f = i322;
        this.g = true;
        this.J = new SparseArray();
        this.K = new SparseBooleanArray();
        a();
    }

    public final void a() {
        this.w = true;
        this.x = false;
        this.y = true;
        this.z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = false;
        this.I = true;
    }

    public hs81() {
        this.J = new SparseArray();
        this.K = new SparseBooleanArray();
        a();
    }
}
