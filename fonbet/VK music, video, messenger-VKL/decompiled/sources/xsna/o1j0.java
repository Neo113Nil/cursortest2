package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsDomainFragment;
import xsna.n3r0;

/* compiled from: SettingsDomainFragment.java */
/* loaded from: classes7.dex */
public final class o1j0 extends rpj0<n3r0.a> {
    public final /* synthetic */ SettingsDomainFragment d;

    public o1j0(SettingsDomainFragment settingsDomainFragment) {
        this.d = settingsDomainFragment;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        n3r0.a aVar = (n3r0.a) obj;
        SettingsDomainFragment settingsDomainFragment = this.d;
        settingsDomainFragment.g0 = null;
        settingsDomainFragment.qo();
        if (aVar.b) {
            settingsDomainFragment.c0.setText(R.string.domain_available);
            settingsDomainFragment.oo(2);
        } else {
            settingsDomainFragment.c0.setText(aVar.a);
            settingsDomainFragment.oo(1);
        }
        settingsDomainFragment.h0 = aVar.b;
        settingsDomainFragment.invalidateOptionsMenu();
        settingsDomainFragment.po(aVar.c, aVar.b);
    }

    @Override // xsna.rpj0, xsna.q76, xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        super.e(vKApiExecutionException);
        int i = SettingsDomainFragment.j0;
        SettingsDomainFragment settingsDomainFragment = this.d;
        settingsDomainFragment.qo();
        settingsDomainFragment.c0.setText(R.string.error);
        settingsDomainFragment.oo(1);
        settingsDomainFragment.g0 = null;
    }
}
