package xsna;

import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import xsna.ikv0;

/* compiled from: SettingsGeneralFragment.java */
/* loaded from: classes7.dex */
public final class d2j0 implements izs<List<String>, s3q0> {
    public final /* synthetic */ SettingsGeneralFragment b;

    public d2j0(SettingsGeneralFragment settingsGeneralFragment) {
        this.b = settingsGeneralFragment;
    }

    @Override // xsna.izs
    public final s3q0 invoke(List<String> list) {
        SettingsGeneralFragment settingsGeneralFragment = this.b;
        ikv0.a aVar = new ikv0.a(settingsGeneralFragment.requireContext());
        aVar.u = new ikv0.d(settingsGeneralFragment.requireContext().getString(R.string.sync_contacts_failed), (String) null, (ikv0.d.a) null);
        aVar.n();
        return s3q0.a;
    }
}
