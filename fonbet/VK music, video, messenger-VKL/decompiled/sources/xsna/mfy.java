package xsna;

import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.FragmentActivity;

/* compiled from: KeyboardDelegate.kt */
/* loaded from: classes18.dex */
public final class mfy {
    public boolean a;

    public static void b(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().getDecorView().setOnApplyWindowInsetsListener(null);
    }

    public final void a(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xsna.lfy
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                mfy.this.a = bqx0.h(view, windowInsets).a.u(8);
                return view.onApplyWindowInsets(windowInsets);
            }
        });
    }
}
