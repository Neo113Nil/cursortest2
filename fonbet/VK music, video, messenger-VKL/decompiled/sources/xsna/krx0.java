package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import xsna.ba8;

/* compiled from: WindowMetricsCompatHelper.kt */
/* loaded from: classes12.dex */
public final class krx0 implements irx0 {
    public static final krx0 a = new krx0();

    @Override // xsna.irx0
    public final frx0 a(Context context, bzl bzlVar) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        return new frx0(windowManager.getCurrentWindowMetrics().getDensity(), windowManager.getCurrentWindowMetrics().getBounds());
    }

    @Override // xsna.irx0
    public final frx0 b(Activity activity, bzl bzlVar) {
        ba8.a.getClass();
        return new frx0(new aa8(ba8.a.a().a(activity)), bzlVar.a(activity));
    }
}
