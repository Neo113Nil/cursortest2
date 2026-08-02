package xsna;

import com.vk.voip.api.dto.VoipCallOnStartAction;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: MediaMuteMapper.kt */
/* loaded from: classes7.dex */
public final class ws10 {

    /* compiled from: MediaMuteMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.values().length];
            try {
                iArr[VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.UNMUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.UNMUTED_BUT_MUTED_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipCallOnStartAction.SetupMediaOptions.MediaOptionState.MUTED_PERMANENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MediaOptionState a(VoipCallOnStartAction.SetupMediaOptions.MediaOptionState mediaOptionState) {
        int i = a.$EnumSwitchMapping$0[mediaOptionState.ordinal()];
        if (i == 1) {
            return MediaOptionState.UNMUTED;
        }
        if (i == 2) {
            return MediaOptionState.UNMUTED_BUT_MUTED_ONCE;
        }
        if (i == 3) {
            return MediaOptionState.MUTED_PERMANENT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
