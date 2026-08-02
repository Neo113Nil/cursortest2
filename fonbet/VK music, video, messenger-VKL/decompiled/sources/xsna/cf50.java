package xsna;

import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;
import com.vk.music.bottomsheets.settings.presentation.LoadMixSettingsStateValue;

/* compiled from: MusicVkMixSettingsState.kt */
/* loaded from: classes3.dex */
public final class cf50 implements km50 {
    public final LoadMixSettingsStateValue b;
    public final String c;
    public final MixSettings d;
    public final MusicBottomSheetLaunchPoint e;

    public cf50(LoadMixSettingsStateValue loadMixSettingsStateValue, String str, MixSettings mixSettings, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
        this.b = loadMixSettingsStateValue;
        this.c = str;
        this.d = mixSettings;
        this.e = musicBottomSheetLaunchPoint;
    }

    public static cf50 a(cf50 cf50Var, LoadMixSettingsStateValue loadMixSettingsStateValue, MixSettings mixSettings) {
        String str = cf50Var.c;
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = cf50Var.e;
        cf50Var.getClass();
        return new cf50(loadMixSettingsStateValue, str, mixSettings, musicBottomSheetLaunchPoint);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf50)) {
            return false;
        }
        cf50 cf50Var = (cf50) obj;
        return this.b == cf50Var.b && epx.f(this.c, cf50Var.c) && epx.f(this.d, cf50Var.d) && epx.f(this.e, cf50Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(this.b.hashCode() * 31, 31, this.c);
        MixSettings mixSettings = this.d;
        return this.e.hashCode() + ((a + (mixSettings == null ? 0 : mixSettings.hashCode())) * 31);
    }

    public final String toString() {
        return "MusicVkMixSettingsState(loadState=" + this.b + ", mixId=" + this.c + ", settings=" + this.d + ", launchPoint=" + this.e + ')';
    }
}
