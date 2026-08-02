package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public class c4z {

    @NonNull
    protected final t4z mLifecycleFragment;

    public c4z(@NonNull t4z t4zVar) {
        this.mLifecycleFragment = t4zVar;
    }

    @NonNull
    public static t4z getFragment(@NonNull Activity activity) {
        return getFragment(new y3z(activity));
    }

    @NonNull
    public Activity getActivity() {
        Activity O6 = this.mLifecycleFragment.O6();
        exc0.i(O6);
        return O6;
    }

    @NonNull
    public static t4z getFragment(@NonNull y3z y3zVar) {
        hsz0 hsz0Var;
        k601 k601Var;
        Activity activity = y3zVar.a;
        if (!(activity instanceof FragmentActivity)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = hsz0.c;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (hsz0Var = (hsz0) weakReference.get()) != null) {
                return hsz0Var;
            }
            try {
                hsz0 hsz0Var2 = (hsz0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (hsz0Var2 == null || hsz0Var2.isRemoving()) {
                    hsz0Var2 = new hsz0();
                    activity.getFragmentManager().beginTransaction().add(hsz0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(hsz0Var2));
                return hsz0Var2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        WeakHashMap weakHashMap2 = k601.i;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        WeakHashMap weakHashMap3 = k601.i;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(fragmentActivity);
        if (weakReference2 != null && (k601Var = (k601) weakReference2.get()) != null) {
            return k601Var;
        }
        try {
            k601 k601Var2 = (k601) supportFragmentManager.H("SLifecycleFragmentImpl");
            if (k601Var2 == null || k601Var2.isRemoving()) {
                k601Var2 = new k601();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f(0, k601Var2, "SLifecycleFragmentImpl", 1);
                aVar.k(true);
            }
            weakHashMap3.put(fragmentActivity, new WeakReference(k601Var2));
            return k601Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onCreate(@Nullable Bundle bundle) {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @NonNull
    public static t4z getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }
}
