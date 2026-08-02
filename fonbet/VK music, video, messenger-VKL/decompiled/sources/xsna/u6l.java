package xsna;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import java.util.HashMap;

/* compiled from: DebugOverlayViewer.kt */
/* loaded from: classes11.dex */
public final class u6l {
    public static Application a;
    public static WindowManager b;
    public static final bpn0 c;

    static {
        new HashMap();
        c = new bpn0(new sw1(5));
    }

    public static final void a(Activity activity, Context context) {
        Snackbar h = Snackbar.h(activity.findViewById(R.id.content), context.getResources().getString(com.vkontakte.android.R.string.give_permission));
        h.i(context.getResources().getString(com.vkontakte.android.R.string.give_permission_btn), new s6l(context, 0));
        BaseTransientBottomBar.g c2 = h.c();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c2.getLayoutParams();
        marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.vkontakte.android.R.dimen.debug_view_snackbar_margin) + marginLayoutParams.bottomMargin;
        c2.setLayoutParams(marginLayoutParams);
        h.j();
    }
}
