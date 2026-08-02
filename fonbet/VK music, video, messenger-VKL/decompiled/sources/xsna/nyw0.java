package xsna;

import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;

/* compiled from: VoipScheduledCallSettingsViewStateMapper.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class nyw0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ScheduledAudioMuteOption.values().length];
        try {
            iArr[ScheduledAudioMuteOption.Enabled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScheduledAudioMuteOption.MutedOnJoin.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScheduledAudioMuteOption.MutedPermanent.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ScheduledVideoMuteOption.values().length];
        try {
            iArr2[ScheduledVideoMuteOption.Enabled.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScheduledVideoMuteOption.DisabledOnJoin.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ScheduledVideoMuteOption.DisabledPermanent.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
