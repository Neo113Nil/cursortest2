package xsna;

import com.vk.voip.media.mute.model.VoipMediaMuteOptionState;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: VoipMediaMuteOptionState.kt */
/* loaded from: classes7.dex */
public final class isw0 {

    /* compiled from: VoipMediaMuteOptionState.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaOptionState.values().length];
            try {
                iArr[MediaOptionState.MUTED_PERMANENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaOptionState.UNMUTED_BUT_MUTED_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaOptionState.UNMUTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final VoipMediaMuteOptionState a(MediaOptionState mediaOptionState) {
        int i = a.$EnumSwitchMapping$0[mediaOptionState.ordinal()];
        if (i == 1) {
            return VoipMediaMuteOptionState.MUTED_PERMANENT;
        }
        if (i == 2) {
            return VoipMediaMuteOptionState.UNMUTED_BUT_MUTED_ONCE;
        }
        if (i == 3) {
            return VoipMediaMuteOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE;
        }
        if (i == 4) {
            return VoipMediaMuteOptionState.UNMUTED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
