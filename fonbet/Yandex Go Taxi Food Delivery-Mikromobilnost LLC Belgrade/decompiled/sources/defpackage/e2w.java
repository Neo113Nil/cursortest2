package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.fragment.NavHostFragment;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final class e2w extends FragmentManager.a {
    public final boolean a;
    public final gau b;

    public e2w(boolean z, gau gauVar) {
        this.a = z;
        this.b = gauVar;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (!this.a || !(fragment instanceof NavHostFragment)) {
            WeakHashMap weakHashMap = b.a;
            np31.c(view);
        } else {
            View view2 = ((NavHostFragment) fragment).getView();
            if (view2 != null) {
                this.b.invoke(view2);
            }
        }
    }
}
