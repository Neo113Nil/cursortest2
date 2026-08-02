package xsna;

import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import xsna.ikv0;

/* compiled from: SettingsGeneralFragment.java */
/* loaded from: classes7.dex */
public final class e2j0 implements gzs<s3q0> {
    public final /* synthetic */ SettingsGeneralFragment b;

    public e2j0(SettingsGeneralFragment settingsGeneralFragment) {
        this.b = settingsGeneralFragment;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        SettingsGeneralFragment settingsGeneralFragment = this.b;
        ikv0.a aVar = new ikv0.a(settingsGeneralFragment.requireContext());
        aVar.u = new ikv0.d(settingsGeneralFragment.requireContext().getString(R.string.sync_contacts_success), (String) null, (ikv0.d.a) null);
        aVar.n();
        settingsGeneralFragment.jo();
        settingsGeneralFragment.qo();
        return s3q0.a;
    }
}
