package xsna;

import com.vk.contacts.ContactsManager;
import com.vkontakte.android.fragments.SettingsGeneralFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pv implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pv(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((fw) obj3).c.e((com.vk.core.view.components.spinner.c) obj2, null);
                break;
            default:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj3;
                int i2 = SettingsGeneralFragment.z0;
                settingsGeneralFragment.getClass();
                settingsGeneralFragment.po(((ContactsManager) obj2).H0(), false);
                break;
        }
    }
}
