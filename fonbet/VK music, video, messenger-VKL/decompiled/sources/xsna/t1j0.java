package xsna;

import androidx.preference.Preference;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManagerAdaptersKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class t1j0 implements Preference.c, io.reactivex.rxjava3.core.d, yads.ng1, yads.uq2 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1j0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // yads.uq2
    public void a(yads.mn3 mn3Var) {
        yads.qf1.a((String) this.b, (izs) this.c, mn3Var);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.b;
        Preference preference2 = (Preference) this.c;
        SettingsGeneralFragment.ro("ClearCacheClicked");
        settingsGeneralFragment.m0.b(settingsGeneralFragment.s0.ic().c(settingsGeneralFragment.kn()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new oo20(preference2, 21)));
        return true;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        yads.kb0.c((yads.ye) this.b, (yads.pa0) this.c, (yads.af) obj);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        StereoRoomManagerAdaptersKt.rejectPromotionRequest$lambda$0((StereoRoomManager) this.b, (ParticipantId) this.c, bVar);
    }
}
