package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: classes10.dex */
public final class ji6 implements ii6, b851 {
    public static final ji6 a = new ji6();
    public static final ji6 b = new ji6();

    @Override // defpackage.ii6
    public Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }

    @Override // defpackage.b851
    public w751 c(Activity activity, gwi gwiVar) {
        ii6.Y0.getClass();
        return new w751(new hi6(h2b1.e().a(activity)), gwiVar.b(activity));
    }

    @Override // defpackage.ii6
    public Rect d(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
    }

    @Override // defpackage.b851
    public w751 j(Activity activity, gwi gwiVar) {
        ii6.Y0.getClass();
        return new w751(new hi6(h2b1.e().d(activity)), gwiVar.b(activity));
    }

    @Override // defpackage.b851
    public w751 k(Context context, gwi gwiVar) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        return new w751(windowManager.getCurrentWindowMetrics().getBounds(), context.getResources().getDisplayMetrics().density);
    }
}
