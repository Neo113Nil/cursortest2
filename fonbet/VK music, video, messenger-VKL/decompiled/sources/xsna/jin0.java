package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public class jin0 extends Fragment {
    public final a001 h = new a001(this);

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        ClassLoader classLoader = jin0.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        a001 a001Var = this.h;
        a001Var.g = activity;
        a001Var.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            a001 a001Var = this.h;
            a001Var.getClass();
            a001Var.d(bundle, new xmz0(a001Var, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        a001 a001Var = this.h;
        a001Var.getClass();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        a001Var.d(bundle, new rnz0(a001Var, frameLayout, layoutInflater, viewGroup, bundle));
        if (a001Var.a == null) {
            esl.b(frameLayout);
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        a001 a001Var = this.h;
        l4z l4zVar = a001Var.a;
        if (l4zVar != null) {
            l4zVar.onDestroy();
        } else {
            a001Var.c(1);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        a001 a001Var = this.h;
        l4z l4zVar = a001Var.a;
        if (l4zVar != null) {
            l4zVar.onDestroyView();
        } else {
            a001Var.c(2);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        a001 a001Var = this.h;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            a001Var.g = activity;
            a001Var.e();
            GoogleMapOptions b = GoogleMapOptions.b(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", b);
            a001Var.d(bundle, new tlz0(a001Var, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        l4z l4zVar = this.h.a;
        if (l4zVar != null) {
            l4zVar.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        a001 a001Var = this.h;
        l4z l4zVar = a001Var.a;
        if (l4zVar != null) {
            l4zVar.onPause();
        } else {
            a001Var.c(5);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        a001 a001Var = this.h;
        a001Var.getClass();
        a001Var.d(null, new ioz0(a001Var));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        ClassLoader classLoader = jin0.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        a001 a001Var = this.h;
        l4z l4zVar = a001Var.a;
        if (l4zVar != null) {
            l4zVar.b(bundle);
            return;
        }
        Bundle bundle2 = a001Var.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        a001 a001Var = this.h;
        a001Var.getClass();
        a001Var.d(null, new eoz0(a001Var));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        a001 a001Var = this.h;
        l4z l4zVar = a001Var.a;
        if (l4zVar != null) {
            l4zVar.onStop();
        } else {
            a001Var.c(4);
        }
        super.onStop();
    }
}
