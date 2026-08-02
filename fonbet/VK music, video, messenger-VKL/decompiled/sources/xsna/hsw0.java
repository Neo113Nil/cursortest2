package xsna;

import com.vk.voip.media.mute.model.VoipMediaMuteOption;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.media_options.MediaOption;

/* compiled from: VoipMediaMuteOption.kt */
/* loaded from: classes7.dex */
public final class hsw0 {

    /* compiled from: VoipMediaMuteOption.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaOption.values().length];
            try {
                iArr[MediaOption.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaOption.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaOption.SCREEN_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaOption.MOVIE_SHARING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final VoipMediaMuteOption a(MediaOption mediaOption) {
        int i = a.$EnumSwitchMapping$0[mediaOption.ordinal()];
        if (i == 1) {
            return VoipMediaMuteOption.CAMERA;
        }
        if (i == 2) {
            return VoipMediaMuteOption.MICROPHONE;
        }
        if (i == 3) {
            return VoipMediaMuteOption.SCREEN_SHARING;
        }
        if (i == 4) {
            return VoipMediaMuteOption.MOVIE_SHARING;
        }
        throw new NoWhenBranchMatchedException();
    }
}
