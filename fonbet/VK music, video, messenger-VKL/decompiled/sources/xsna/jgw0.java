package xsna;

import com.vk.voip.ui.call_by_link.feature.VoipCallByLinkState;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dgw0;

/* compiled from: VoipCallByLinkReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class jgw0 extends FunctionReferenceImpl implements izs<VoipCallByLinkState, VoipCallByLinkViewState.MediaSettingDialog> {
    @Override // xsna.izs
    public final VoipCallByLinkViewState.MediaSettingDialog invoke(VoipCallByLinkState voipCallByLinkState) {
        VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting setting;
        VoipCallByLinkViewState.MediaSettingDialog.Visible.SelectedOption selectedOption;
        VoipCallByLinkState voipCallByLinkState2 = voipCallByLinkState;
        ((dgw0) this.receiver).getClass();
        if (voipCallByLinkState2 instanceof VoipCallByLinkState.a) {
            return VoipCallByLinkViewState.MediaSettingDialog.a.a;
        }
        if (voipCallByLinkState2 instanceof VoipCallByLinkState.b) {
            return VoipCallByLinkViewState.MediaSettingDialog.a.a;
        }
        if (!(voipCallByLinkState2 instanceof VoipCallByLinkState.Content)) {
            throw new NoWhenBranchMatchedException();
        }
        VoipCallByLinkState.Content.MediaSettingDialogState mediaSettingDialogState = ((VoipCallByLinkState.Content) voipCallByLinkState2).j;
        if (mediaSettingDialogState instanceof VoipCallByLinkState.Content.MediaSettingDialogState.a) {
            return VoipCallByLinkViewState.MediaSettingDialog.a.a;
        }
        if (!(mediaSettingDialogState instanceof VoipCallByLinkState.Content.MediaSettingDialogState.b)) {
            throw new NoWhenBranchMatchedException();
        }
        VoipCallByLinkState.Content.MediaSettingDialogState.b bVar = (VoipCallByLinkState.Content.MediaSettingDialogState.b) mediaSettingDialogState;
        int i = dgw0.a.$EnumSwitchMapping$0[bVar.a.ordinal()];
        if (i == 1) {
            setting = VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting.MICROPHONES;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            setting = VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting.VIDEO;
        }
        int i2 = dgw0.a.$EnumSwitchMapping$1[bVar.b.ordinal()];
        if (i2 == 1) {
            selectedOption = VoipCallByLinkViewState.MediaSettingDialog.Visible.SelectedOption.ENABLED;
        } else if (i2 == 2) {
            selectedOption = VoipCallByLinkViewState.MediaSettingDialog.Visible.SelectedOption.DISABLED_ON_JOIN;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            selectedOption = VoipCallByLinkViewState.MediaSettingDialog.Visible.SelectedOption.DISABLED_PERMANENT;
        }
        return new VoipCallByLinkViewState.MediaSettingDialog.Visible(setting, selectedOption);
    }
}
