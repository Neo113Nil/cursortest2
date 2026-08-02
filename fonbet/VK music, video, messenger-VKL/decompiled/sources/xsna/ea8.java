package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: BoundsHelper.kt */
/* loaded from: classes12.dex */
public final class ea8 implements ba8 {
    public static final ea8 b = new ea8();

    @Override // xsna.ba8
    public final Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
