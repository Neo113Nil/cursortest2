package xsna;

import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import xsna.v9w0;
import xsna.yv3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class p9w0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ p9w0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new v9w0.c.b(((VmojiCharacterModel) obj).l);
            case 1:
                return new VoipActionsFeatureState.e(((CallEffectsDependency.DynamicLibsState) obj).h());
            case 2:
                VoipViewModelState voipViewModelState = (VoipViewModelState) obj;
                int i = VoipCallActivity.P;
                return Boolean.valueOf(voipViewModelState != VoipViewModelState.Idle);
            case 3:
                return Boolean.valueOf(((yv3.d) obj).b);
            default:
                return Boolean.FALSE;
        }
    }
}
