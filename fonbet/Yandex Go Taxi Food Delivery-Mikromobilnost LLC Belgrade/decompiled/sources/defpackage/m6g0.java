package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerFragment;

/* loaded from: classes3.dex */
public final class m6g0 extends FragmentManager.a {
    public final /* synthetic */ QrContainerFragment a;

    public m6g0(QrContainerFragment qrContainerFragment) {
        this.a = qrContainerFragment;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        QrContainerFragment qrContainerFragment = this.a;
        qrContainerFragment.setStatusBarColor(fragment);
        qrContainerFragment.setNavBarColor(fragment);
        super.onFragmentResumed(fragmentManager, fragment);
    }
}
