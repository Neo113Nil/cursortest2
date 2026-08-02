package xsna;

import android.view.Surface;
import androidx.preference.Preference;
import com.ironsource.X3;
import com.vk.contacts.ContactsManager;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManagerAdaptersKt;
import xsna.ub9;
import xsna.zjn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cod0 implements VkCheckboxItem.a, Preference.c, io.reactivex.rxjava3.core.d, ub9.c, Optional.Action {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cod0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.b).lambda$onMobileIdDescriptorChanged$37((VerificationApi.VerificationStateDescriptor) this.c, (VerificationListener) obj);
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(final ub9.a aVar) {
        qoo0 qoo0Var = (qoo0) this.b;
        Surface surface = (Surface) this.c;
        qoo0Var.g.a(surface, xo9.g(), new o7j() { // from class: xsna.ooo0
            @Override // xsna.o7j
            public final void accept(Object obj) {
                ub9.a.this.b((zjn0.f) obj);
            }
        });
        return "provideSurface[request=" + qoo0Var.g + " surface=" + surface + X3.j.e;
    }

    @Override // com.vk.core.view.components.checkbox.VkCheckboxItem.a
    public void b(boolean z) {
        tnd0 tnd0Var = (tnd0) this.b;
        dod0 dod0Var = (dod0) this.c;
        tnd0Var.h(Boolean.valueOf(z));
        dod0Var.l.invoke(tnd0Var);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.b;
        ContactsManager contactsManager = (ContactsManager) this.c;
        int i = SettingsGeneralFragment.z0;
        contactsManager.N0(settingsGeneralFragment.kn(), false, ContactsPermissionMessage.DEFAULT, null, new d2j0(settingsGeneralFragment), new e2j0(settingsGeneralFragment));
        return true;
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        StereoRoomManagerAdaptersKt.grantAdmin$lambda$0((StereoRoomManager) this.b, (ParticipantId) this.c, bVar);
    }
}
