package com.yandex.bricks;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.lightside.slab.SlabHookResultFragment;
import defpackage.egh0;
import defpackage.w511;

/* loaded from: classes11.dex */
public abstract class e {
    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        w511.q();
        return null;
    }

    public static HookResultFragment b(Context context) {
        Activity a = a(context);
        if (!(a instanceof FragmentActivity)) {
            return null;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) a).getSupportFragmentManager();
        Fragment F = supportFragmentManager.F(SlabHookResultFragment.FRAGMENT_TAG);
        if (F instanceof HookResultFragment) {
            return (HookResultFragment) F;
        }
        HookResultFragment hookResultFragment = new HookResultFragment();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(0, hookResultFragment, SlabHookResultFragment.FRAGMENT_TAG, 1);
        aVar.n();
        return hookResultFragment;
    }

    public static WindowEventsHookView c(Activity activity) {
        WindowEventsHookView windowEventsHookView = (WindowEventsHookView) activity.findViewById(egh0.bricks_window_events_hook_view);
        if (windowEventsHookView != null) {
            return windowEventsHookView;
        }
        WindowEventsHookView windowEventsHookView2 = new WindowEventsHookView(activity);
        windowEventsHookView2.setId(egh0.bricks_window_events_hook_view);
        activity.addContentView(windowEventsHookView2, new FrameLayout.LayoutParams(0, 0));
        return windowEventsHookView2;
    }
}
