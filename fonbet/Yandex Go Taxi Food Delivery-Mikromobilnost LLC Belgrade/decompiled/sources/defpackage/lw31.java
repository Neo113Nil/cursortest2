package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import io.flutter.embedding.engine.FlutterEngine;

/* loaded from: classes11.dex */
public final class lw31 {
    public static void a(Context context, gw31 gw31Var) {
        Activity b = b(context);
        if (b != null) {
            y751.a.getClass();
            z751 z751Var = x751.b;
            int i = Build.VERSION.SDK_INT;
            hi6 hi6Var = (i >= 34 ? hwi.b : i >= 30 ? ji6.b : zoy0.x).j(b, z751Var.b).a;
            ((FlutterEngine) gw31Var).a.updateDisplayMetrics(0, hi6Var.c().width(), hi6Var.c().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean c(View view, jw31 jw31Var) {
        if (view != null) {
            if (jw31Var.i(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (c(viewGroup.getChildAt(i), jw31Var)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
