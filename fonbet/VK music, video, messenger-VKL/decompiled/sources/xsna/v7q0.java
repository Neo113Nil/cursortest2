package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import java.util.ListIterator;
import kotlin.Result;

/* compiled from: UpdateButtonRunnable.kt */
/* loaded from: classes4.dex */
public final class v7q0 implements Runnable {
    public final Activity b;
    public final boolean c;

    public v7q0(Activity activity, boolean z) {
        this.b = activity;
        this.c = z;
    }

    public static Fragment a(FragmentManager fragmentManager) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        Fragment a;
        Fragment previous;
        Dialog dialog;
        List<Fragment> f = fragmentManager.c.f();
        ListIterator<Fragment> listIterator = f.listIterator(f.size());
        while (true) {
            fragment = null;
            if (!listIterator.hasPrevious()) {
                break;
            }
            previous = listIterator.previous();
            Fragment fragment2 = previous;
            if (!fragment2.isVisible()) {
                androidx.fragment.app.d dVar = fragment2 instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) fragment2 : null;
                if (dVar != null && (dialog = dVar.s) != null && dialog.isShowing()) {
                    break;
                }
            } else {
                break;
            }
        }
        fragment = previous;
        Fragment fragment3 = fragment;
        return (fragment3 == null || (childFragmentManager = fragment3.getChildFragmentManager()) == null || (a = a(childFragmentManager)) == null) ? fragment3 : a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object failure;
        WindowManager windowManager;
        FragmentManager supportFragmentManager;
        Activity activity = this.b;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        Fragment a = (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) ? null : a(supportFragmentManager);
        x290 x290Var = x290.a;
        if (!x290.i.getEnabled() || activity.isFinishing() || !x290.b.invoke(activity, Integer.valueOf(x290.c), a).booleanValue()) {
            x290.f.c(activity, false);
            return;
        }
        err errVar = x290.f;
        if (!this.c) {
            FrameLayout frameLayout = errVar.b;
            if ((frameLayout != null ? frameLayout.getParent() : null) != null) {
                return;
            }
        }
        errVar.c(null, false);
        try {
            Activity b = x290.b();
            windowManager = b != null ? b.getWindowManager() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (windowManager == null) {
            throw new IllegalStateException("Required value was null.");
        }
        FrameLayout a2 = errVar.a();
        windowManager.addView(a2, err.b());
        errVar.b = a2;
        failure = s3q0.a;
        Throwable a3 = Result.a(failure);
        if (a3 != null) {
            l370 l370Var = x290.k;
            (l370Var != null ? l370Var : null).v(a3);
        }
    }
}
