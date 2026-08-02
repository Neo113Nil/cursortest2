package xsna;

import android.content.Context;
import com.vk.voip.dto.AudioDevice;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* compiled from: AudioDevice.kt */
/* loaded from: classes7.dex */
public final class um4 {

    /* compiled from: AudioDevice.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AudioDevice.values().length];
            try {
                iArr[AudioDevice.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioDevice.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioDevice.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioDevice.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioDevice.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CallsAudioManager.AudioDeviceType.values().length];
            try {
                iArr2[CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.EARPIECE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.SPEAKER_PHONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CallsAudioManager.AudioDeviceType.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int a(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        int i = a.$EnumSwitchMapping$0[c(callsAudioDeviceInfo.getDeviceType()).ordinal()];
        if (i == 1) {
            return R.drawable.vk_icon_volume_outline_28;
        }
        if (i == 2) {
            return R.drawable.headphones_outline_28;
        }
        if (i == 3) {
            return R.drawable.vk_icon_phone_outline_28;
        }
        if (i == 4) {
            return R.drawable.ic_bluetooth_outline_28;
        }
        if (i == 5) {
            return R.drawable.vk_icon_error_outline_28;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(CallsAudioDeviceInfo callsAudioDeviceInfo, Context context) {
        int i;
        if (a.$EnumSwitchMapping$1[callsAudioDeviceInfo.getDeviceType().ordinal()] == 1) {
            return context.getString(R.string.audiomanager_bluetooth);
        }
        AudioDevice c = c(callsAudioDeviceInfo.getDeviceType());
        String name = callsAudioDeviceInfo.getName();
        int i2 = a.$EnumSwitchMapping$0[c.ordinal()];
        if (i2 == 1) {
            return context.getString(R.string.audiomanager_speaker);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return context.getString(R.string.audiomanager_earpiece);
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return context.getString(R.string.error);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (name.length() != 0 && !drm0.N(name)) {
                if (name.length() > 0 ? !Character.isDigit(name.charAt(0)) : false) {
                    return name;
                }
            }
            return context.getString(R.string.audiomanager_bluetooth);
        }
        int hashCode = name.hashCode();
        if (hashCode == -1973397274) {
            if (name.equals(CallsAudioDeviceInfo.WIRED_HEADPHONES)) {
                i = R.string.voip_call_wired_headphones;
            }
            i = R.string.audiomanager_wired_headset;
        } else if (hashCode != -1220329498) {
            if (hashCode == -874598431 && name.equals(CallsAudioDeviceInfo.WIRED_HEADSET)) {
                i = R.string.voip_call_wired_headset;
            }
            i = R.string.audiomanager_wired_headset;
        } else {
            if (name.equals(CallsAudioDeviceInfo.USB_HEADSET)) {
                i = R.string.voip_call_usb_headset;
            }
            i = R.string.audiomanager_wired_headset;
        }
        return context.getString(i);
    }

    public static final AudioDevice c(CallsAudioManager.AudioDeviceType audioDeviceType) {
        switch (a.$EnumSwitchMapping$1[audioDeviceType.ordinal()]) {
            case 1:
            case 2:
                return AudioDevice.BLUETOOTH;
            case 3:
                return AudioDevice.WIRED_HEADSET;
            case 4:
                return AudioDevice.EARPIECE;
            case 5:
                return AudioDevice.SPEAKER_PHONE;
            case 6:
                return AudioDevice.NONE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
