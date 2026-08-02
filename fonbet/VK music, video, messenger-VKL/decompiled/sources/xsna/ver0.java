package xsna;

import android.app.Activity;
import android.content.Context;
import com.vkontakte.android.VKActivity;

/* compiled from: VKRxExt.kt */
/* loaded from: classes.dex */
public final class ver0 {
    public static final void a(io.reactivex.rxjava3.disposables.c cVar) {
        c63 c63Var = c63.a;
        c63.a(new wgn(cVar));
    }

    public static final void b(Activity activity, io.reactivex.rxjava3.disposables.c cVar) {
        if (activity.isFinishing()) {
            cVar.dispose();
        } else {
            activity.getApplication().registerActivityLifecycleCallbacks(new ter0(activity, cVar));
        }
    }

    public static final void c(Context context, io.reactivex.rxjava3.disposables.c cVar) {
        VKActivity vKActivity = context instanceof VKActivity ? (VKActivity) context : null;
        if (vKActivity != null) {
            vKActivity.p.b(cVar);
        }
    }
}
