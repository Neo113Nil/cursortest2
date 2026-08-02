package xsna;

import android.app.ActivityManager;
import android.content.DialogInterface;
import androidx.preference.Preference;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.fragments.SettingsGeneralFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lub implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lub(SettingsGeneralFragment settingsGeneralFragment, Preference preference, DialogInterface dialogInterface) {
        this.c = preference;
        this.d = dialogInterface;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((mub) obj3).q(new b7(4, (Dialog) obj, (io.reactivex.rxjava3.core.q) obj2));
                break;
            default:
                int i2 = SettingsGeneralFragment.z0;
                ((ActivityManager) ((Preference) obj3).h().getSystemService("activity")).clearApplicationUserData();
                ((DialogInterface) obj2).dismiss();
                break;
        }
    }

    public /* synthetic */ lub(mub mubVar, io.reactivex.rxjava3.core.q qVar) {
        this.c = mubVar;
        this.d = qVar;
    }
}
