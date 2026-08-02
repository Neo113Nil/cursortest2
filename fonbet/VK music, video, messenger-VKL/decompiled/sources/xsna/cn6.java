package xsna;

import com.vk.contacts.ContactsManager;
import com.vk.dto.common.id.UserId;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class cn6 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cn6(int i, Object obj, Object obj2) {
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
                BaseSharingExternalActivity.e eVar = (BaseSharingExternalActivity.e) obj3;
                BaseSharingExternalActivity.Q2(eVar.l, (UserId) obj2, eVar.e, (List) obj);
                break;
            default:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj3;
                int i2 = SettingsGeneralFragment.z0;
                settingsGeneralFragment.getClass();
                settingsGeneralFragment.po(((ContactsManager) obj2).H0(), ((List) obj).stream().anyMatch(new v1j0()));
                break;
        }
    }
}
