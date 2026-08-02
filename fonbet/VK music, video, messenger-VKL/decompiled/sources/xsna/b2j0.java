package xsna;

import android.content.DialogInterface;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;

/* compiled from: SettingsGeneralFragment.java */
/* loaded from: classes7.dex */
public final class b2j0 implements Preference.b {
    public final /* synthetic */ dev0 b;
    public final /* synthetic */ SwitchPreferenceCompat c;
    public final /* synthetic */ SettingsGeneralFragment d;

    public b2j0(SettingsGeneralFragment settingsGeneralFragment, dev0 dev0Var, SwitchPreferenceCompat switchPreferenceCompat) {
        this.d = settingsGeneralFragment;
        this.b = dev0Var;
        this.c = switchPreferenceCompat;
    }

    @Override // androidx.preference.Preference.b
    public final boolean Sl(Preference preference, Object obj) {
        if (this.b.isEnabled() || !((Boolean) obj).booleanValue()) {
            o260 o260Var = d260.a;
            if (o260Var == null) {
                o260Var = null;
            }
            o260Var.h().disable();
            this.c.O(this.b.isEnabled());
            return false;
        }
        com.vk.core.view.components.spinner.c cVar = new com.vk.core.view.components.spinner.c(this.d.getActivity());
        cVar.n(this.d.getString(R.string.loading));
        final SwitchPreferenceCompat switchPreferenceCompat = this.c;
        final dev0 dev0Var = this.b;
        cVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.z1j0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SwitchPreferenceCompat.this.O(dev0Var.isEnabled());
            }
        });
        u1u0.o(cVar);
        asu0.a.getClass();
        asu0.q().execute(new cy3(7, this.b, cVar));
        return false;
    }
}
