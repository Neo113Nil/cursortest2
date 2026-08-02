package xsna;

import com.vk.voip.ui.call_by_link.feature.VoipCallByLinkState;

/* compiled from: VoipCallByLinkMediaSettingDialogStateMapper.kt */
/* loaded from: classes7.dex */
public final class dgw0 {

    /* compiled from: VoipCallByLinkMediaSettingDialogStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoipCallByLinkState.Content.MediaSettingDialogState.Setting.values().length];
            try {
                iArr[VoipCallByLinkState.Content.MediaSettingDialogState.Setting.MICROPHONES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipCallByLinkState.Content.MediaSettingDialogState.Setting.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.values().length];
            try {
                iArr2[VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_ON_JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_PERMANENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
