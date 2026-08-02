package xsna;

import android.app.Activity;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/* compiled from: OrientationLocker.java */
/* loaded from: classes.dex */
public final class yy80 {
    public int a = -10;
    public boolean b = true;

    public final void a(Activity activity) {
        if (this.b && this.a == -10) {
            try {
                this.a = activity.getRequestedOrientation();
                WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                if (windowManager == null || windowManager.getDefaultDisplay() == null) {
                    return;
                }
                int rotation = windowManager.getDefaultDisplay().getRotation();
                int i = activity.getResources().getConfiguration().orientation;
                if (rotation == 3) {
                    if (i == 1) {
                        activity.setRequestedOrientation(1);
                        return;
                    } else {
                        activity.setRequestedOrientation(8);
                        return;
                    }
                }
                if (rotation == 1) {
                    if (i == 1) {
                        activity.setRequestedOrientation(9);
                        return;
                    } else {
                        activity.setRequestedOrientation(0);
                        return;
                    }
                }
                if (rotation == 0) {
                    if (i == 2) {
                        activity.setRequestedOrientation(0);
                        return;
                    } else {
                        activity.setRequestedOrientation(1);
                        return;
                    }
                }
                if (i == 2) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(9);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void b(@NonNull Activity activity) {
        if (this.b) {
            try {
                this.a = -10;
                activity.setRequestedOrientation(-1);
            } catch (Exception unused) {
            }
        }
    }
}
