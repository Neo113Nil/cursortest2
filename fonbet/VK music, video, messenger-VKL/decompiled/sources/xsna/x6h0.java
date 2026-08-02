package xsna;

import androidx.preference.Preference;
import com.vk.dto.common.data.VKList;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.Set;
import xsna.h7u0;
import xsna.l7h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class x6h0 implements io.reactivex.rxjava3.functions.l, Preference.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x6h0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (l7h0.b) ((hb40) this.c).invoke(obj);
            case 1:
            default:
                return (VoipActionsFeatureState.g) ((pcw0) this.c).invoke(obj);
            case 2:
                return (Set) ((dl70) this.c).invoke(obj);
            case 3:
                return (Boolean) ((dl70) this.c).invoke(obj);
            case 4:
                return (VKList) ((dl70) this.c).invoke(obj);
            case 5:
                return (String) ((dnh0) this.c).invoke(obj);
            case 6:
                return (com.vk.music.player.playback.e) ((dnh0) this.c).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
        int i = SettingsGeneralFragment.z0;
        h7u0.a aVar = new h7u0.a(settingsGeneralFragment.getActivity());
        aVar.g0(R.string.confirm);
        aVar.U(R.string.clear_audio_cache_confirm);
        aVar.c0(R.string.yes, new exa(settingsGeneralFragment, 2));
        aVar.W(R.string.no, null);
        aVar.m();
        return true;
    }
}
