package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import xsna.ba8;

/* compiled from: WindowMetricsCompatHelper.kt */
/* loaded from: classes12.dex */
public final class jrx0 implements irx0 {
    public static final jrx0 a = new jrx0();

    @Override // xsna.irx0
    public final frx0 a(Context context, bzl bzlVar) {
        return new frx0(context.getResources().getDisplayMetrics().density, ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds());
    }

    @Override // xsna.irx0
    public final frx0 b(Activity activity, bzl bzlVar) {
        ba8.a.getClass();
        return new frx0(new aa8(ba8.a.a().a(activity)), bzlVar.a(activity));
    }
}
