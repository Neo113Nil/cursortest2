package xsna;

import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.EnumSet;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* compiled from: SelectDevice.kt */
/* loaded from: classes7.dex */
public final class g7i0 {
    public static final EnumSet<CallsAudioManager.AudioDeviceType> a = EnumSet.of(CallsAudioManager.AudioDeviceType.EARPIECE, CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);

    public static final void a(CallsAudioDeviceInfo callsAudioDeviceInfo, gvw0 gvw0Var) {
        if (callsAudioDeviceInfo == null) {
            return;
        }
        if (callsAudioDeviceInfo.getDeviceType() != CallsAudioManager.AudioDeviceType.BLUETOOTH_INTENT) {
            com.vk.voip.ui.a.a.getClass();
            CallsAudioManager.setAudioDeviceAsync$default(com.vk.voip.ui.a.d.a(), callsAudioDeviceInfo, null, new fm0(callsAudioDeviceInfo, 11), 2, null);
        } else {
            if (gvw0Var == null || gvw0Var.e()) {
                return;
            }
            y84 y84Var = new y84(23);
            gvw0.a(gvw0Var.a);
            gvw0Var.f = true;
            PermissionHelper.f(PermissionHelper.a, gvw0Var.a, new String[]{"android.permission.BLUETOOTH_CONNECT"}, R.string.voip_permissions_bluetooth, 0, new eg1(21, gvw0Var, y84Var), new q9i0(gvw0Var, 19), 8);
        }
    }
}
