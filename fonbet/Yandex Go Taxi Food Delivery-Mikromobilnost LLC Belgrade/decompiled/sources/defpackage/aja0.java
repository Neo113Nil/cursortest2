package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes3.dex */
public final class aja0 extends FragmentManager.a {
    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        view.setFitsSystemWindows(false);
    }
}
