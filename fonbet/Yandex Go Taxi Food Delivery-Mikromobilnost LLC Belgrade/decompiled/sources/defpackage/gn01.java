package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;

/* loaded from: classes3.dex */
public final class gn01 extends FragmentManager.a {
    public final /* synthetic */ TransferPhoneInputFragment a;

    public gn01(TransferPhoneInputFragment transferPhoneInputFragment) {
        this.a = transferPhoneInputFragment;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        fn01 fn01Var;
        if (fragment instanceof TransferReceiverNameFragment) {
            TransferPhoneInputFragment transferPhoneInputFragment = this.a;
            fn01Var = transferPhoneInputFragment.backPressSuppressor;
            fn01Var.h(false);
            fragmentManager.r0(this);
            transferPhoneInputFragment.nameReceiverResumedCallback = null;
        }
    }
}
