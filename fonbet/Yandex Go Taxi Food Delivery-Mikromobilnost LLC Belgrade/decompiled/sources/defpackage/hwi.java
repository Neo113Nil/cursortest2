package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes10.dex */
public final class hwi implements gwi, b851 {
    public static final hwi a = new hwi();
    public static final hwi b = new hwi();

    @Override // defpackage.gwi
    public float b(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.b851
    public w751 c(Activity activity, gwi gwiVar) {
        ii6.Y0.getClass();
        return new w751(new hi6(h2b1.e().a(activity)), gwiVar.b(activity));
    }

    @Override // defpackage.b851
    public w751 j(Activity activity, gwi gwiVar) {
        ii6.Y0.getClass();
        return new w751(new hi6(h2b1.e().d(activity)), gwiVar.b(activity));
    }

    @Override // defpackage.b851
    public w751 k(Context context, gwi gwiVar) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        return new w751(windowManager.getCurrentWindowMetrics().getBounds(), windowManager.getCurrentWindowMetrics().getDensity());
    }
}
