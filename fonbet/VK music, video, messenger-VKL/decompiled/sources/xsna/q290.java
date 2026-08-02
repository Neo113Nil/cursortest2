package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: OverlayHelper.kt */
/* loaded from: classes7.dex */
public final class q290 {
    public static final List<String> b = Collections.singletonList(SessionRoomsDialog.DialogKind.ADMIN_ROOMS_CONFIGURE.name());
    public final Handler a = new Handler(Looper.getMainLooper());

    public final void a(Context context, n0 n0Var) {
        boolean z;
        FragmentManager supportFragmentManager;
        Context context2 = context;
        while (true) {
            z = context2 instanceof FragmentActivity;
            if (z || !(context2 instanceof ContextWrapper)) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context2 : null);
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            List<String> list = b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (supportFragmentManager.H((String) it.next()) != null) {
                        this.a.postDelayed(new i09(this, context, n0Var, 3), 300L);
                        return;
                    }
                }
            }
        }
        n0Var.invoke();
    }
}
