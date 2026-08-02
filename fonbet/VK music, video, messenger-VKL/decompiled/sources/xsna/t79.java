package xsna;

import android.os.Bundle;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.actions.menu.fragments.CallParticipantSettingsFragment;
import com.vk.voip.ui.actions.menu.fragments.NoiseSuppressorModeSelectFragment;
import com.vk.voip.ui.menu.feature.VoipCallMainMenuComponentProvider;

/* compiled from: CallParticipantSettingsActionsBindings.kt */
/* loaded from: classes7.dex */
public final class t79 extends lcw0<x79, w79, v79> {
    public final u59 o;

    public t79(CallParticipantSettingsFragment callParticipantSettingsFragment, u59 u59Var) {
        super(callParticipantSettingsFragment, new com.vk.movika.sdk.base.ui.t(u59Var, 13), new sx0(u59Var, 10), new com.vk.movika.sdk.base.logic.interactor.b(u59Var, 10));
        this.o = u59Var;
    }

    @Override // xsna.lcw0
    public final v79 e() {
        v6 v6Var = new v6(this, 7);
        com.vk.voip.ui.c.b.getClass();
        l570 S = com.vk.voip.ui.c.S();
        CallEffectsDependency Q = com.vk.voip.ui.c.Q();
        gj9 y = com.vk.voip.ui.c.r.y();
        wot Z = com.vk.voip.ui.c.Z();
        rd9 rd9Var = new rd9();
        com.vk.voip.ui.actions.feature.c cVar = com.vk.voip.ui.c.e0;
        if (cVar == null) {
            cVar = null;
        }
        return new v79(v6Var, S, Q, y, Z, rd9Var, cVar);
    }

    @Override // xsna.lcw0
    public final void f() {
        int i = NoiseSuppressorModeSelectFragment.Q;
        NoiseSuppressorModeSelectFragment noiseSuppressorModeSelectFragment = new NoiseSuppressorModeSelectFragment();
        Bundle bundle = new Bundle();
        u59 u59Var = this.o;
        bundle.putParcelable("call_main_menu", new VoipCallMainMenuComponentProvider(u59Var));
        noiseSuppressorModeSelectFragment.setArguments(bundle);
        u59Var.c(noiseSuppressorModeSelectFragment, false);
    }
}
