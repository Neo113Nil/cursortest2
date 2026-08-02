package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: BoundsHelper.kt */
/* loaded from: classes12.dex */
public interface ba8 {
    public static final a a = a.a;

    /* compiled from: BoundsHelper.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public static ba8 a() {
            int i = Build.VERSION.SDK_INT;
            return i >= 30 ? ea8.b : i >= 29 ? da8.b : ca8.b;
        }
    }

    Rect a(Activity activity);
}
