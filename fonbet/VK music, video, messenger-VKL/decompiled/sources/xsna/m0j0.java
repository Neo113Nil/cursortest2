package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;

/* compiled from: SettingsAccountInnerFragment.java */
/* loaded from: classes7.dex */
public final class m0j0 extends rpj0<Boolean> {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ SettingsAccountInnerFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0j0(SettingsAccountInnerFragment settingsAccountInnerFragment, FragmentActivity fragmentActivity, boolean z) {
        super(fragmentActivity);
        this.e = settingsAccountInnerFragment;
        this.d = z;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        q6r0.f().f(m6r0.M, Boolean.valueOf(this.d));
        SettingsAccountInnerFragment settingsAccountInnerFragment = this.e;
        if (settingsAccountInnerFragment.getActivity() != null) {
            settingsAccountInnerFragment.io();
        }
    }

    @Override // xsna.rpj0, xsna.q76, xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        if (this.e.getActivity() != null) {
            super.e(vKApiExecutionException);
        }
    }
}
