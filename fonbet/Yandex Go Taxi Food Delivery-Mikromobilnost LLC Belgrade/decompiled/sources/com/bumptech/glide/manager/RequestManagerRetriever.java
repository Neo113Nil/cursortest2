package com.bumptech.glide.manager;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import defpackage.egz;
import defpackage.f7u;
import defpackage.m7j0;
import defpackage.ny61;
import defpackage.ofs;
import defpackage.omy0;
import defpackage.r501;
import defpackage.w53;
import defpackage.wbz0;
import defpackage.wey;
import defpackage.z2a1;
import java.io.File;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes10.dex */
public class RequestManagerRetriever implements Handler.Callback {
    private static final m7j0 DEFAULT_FACTORY = new egz();
    static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
    private volatile RequestManager applicationManager;
    private final m7j0 factory;
    private final ofs frameWaiter;
    private final wey lifecycleRequestManagerRetriever;
    private final w53 tempViewToSupportFragment = new w53();

    public RequestManagerRetriever(m7j0 m7j0Var) {
        m7j0Var = m7j0Var == null ? DEFAULT_FACTORY : m7j0Var;
        this.factory = m7j0Var;
        this.lifecycleRequestManagerRetriever = new wey(m7j0Var);
        this.frameWaiter = buildFrameWaiter();
    }

    private static void assertNotDestroyed(Activity activity) {
        if (activity.isDestroyed()) {
            ny61.g("You cannot start a load for a destroyed activity");
        }
    }

    private static ofs buildFrameWaiter() {
        File file = f7u.e;
        return new r501(20);
    }

    private static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void findAllSupportFragmentsWithViews(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                findAllSupportFragmentsWithViews(fragment.getChildFragmentManager().c.f(), map);
            }
        }
    }

    private Fragment findSupportFragment(View view, FragmentActivity fragmentActivity) {
        this.tempViewToSupportFragment.clear();
        findAllSupportFragmentsWithViews(fragmentActivity.getSupportFragmentManager().c.f(), this.tempViewToSupportFragment);
        View findViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = (Fragment) this.tempViewToSupportFragment.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.tempViewToSupportFragment.clear();
        return fragment;
    }

    private RequestManager getApplicationManager(Context context) {
        if (this.applicationManager == null) {
            synchronized (this) {
                try {
                    if (this.applicationManager == null) {
                        Glide glide = Glide.get(context.getApplicationContext());
                        m7j0 m7j0Var = this.factory;
                        wbz0 wbz0Var = new wbz0();
                        omy0 omy0Var = new omy0();
                        Context applicationContext = context.getApplicationContext();
                        ((egz) m7j0Var).getClass();
                        this.applicationManager = new RequestManager(glide, wbz0Var, omy0Var, applicationContext);
                    }
                } finally {
                }
            }
        }
        return this.applicationManager;
    }

    private static boolean isActivityVisible(Context context) {
        Activity findActivity = findActivity(context);
        return findActivity == null || !findActivity.isFinishing();
    }

    public RequestManager get(View view) {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return get(view.getContext().getApplicationContext());
        }
        z2a1.d(view);
        z2a1.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity findActivity = findActivity(view.getContext());
        if (findActivity != null && (findActivity instanceof FragmentActivity)) {
            FragmentActivity fragmentActivity = (FragmentActivity) findActivity;
            Fragment findSupportFragment = findSupportFragment(view, fragmentActivity);
            return findSupportFragment != null ? get(findSupportFragment) : get(fragmentActivity);
        }
        return get(view.getContext().getApplicationContext());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @Deprecated
    public RequestManager get(Activity activity) {
        return get(activity.getApplicationContext());
    }

    public RequestManager get(Context context) {
        if (context != null) {
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return get((FragmentActivity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return get(contextWrapper.getBaseContext());
                    }
                }
            }
            return getApplicationManager(context);
        }
        ny61.g("You cannot start a load on a null Context");
        return null;
    }

    public RequestManager get(Fragment fragment) {
        z2a1.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return get(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            ofs ofsVar = this.frameWaiter;
            fragment.getActivity();
            ofsVar.getClass();
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.lifecycleRequestManagerRetriever.a(context, Glide.get(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    public RequestManager get(FragmentActivity fragmentActivity) {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return get(fragmentActivity.getApplicationContext());
        }
        assertNotDestroyed(fragmentActivity);
        this.frameWaiter.getClass();
        return this.lifecycleRequestManagerRetriever.a(fragmentActivity, Glide.get(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), isActivityVisible(fragmentActivity));
    }

    @Deprecated
    public RequestManager get(android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return get(fragment.getActivity().getApplicationContext());
        }
        ny61.g("You cannot start a load on a fragment before it is attached");
        return null;
    }
}
