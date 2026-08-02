package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import xsna.ba8;

/* compiled from: WindowMetricsCompatHelper.kt */
/* loaded from: classes12.dex */
public final class lrx0 implements irx0 {
    public static final lrx0 a = new lrx0();

    @Override // xsna.irx0
    public final frx0 a(Context context, bzl bzlVar) {
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = context;
                break;
            }
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
        }
        if (context2 instanceof Activity) {
            return b((Activity) context2, bzlVar);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new frx0(bzlVar.a(context), new Rect(0, 0, point.x, point.y));
    }

    @Override // xsna.irx0
    public final frx0 b(Activity activity, bzl bzlVar) {
        ba8.a.getClass();
        return new frx0(new aa8(ba8.a.a().a(activity)), bzlVar.a(activity));
    }
}
