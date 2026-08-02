package xsna;

import android.content.SharedPreferences;
import com.vk.clips.viewer.api.domain.subs.ClipsSubsSetting;

/* compiled from: ClipsSubtitlesRepository.kt */
/* loaded from: classes17.dex */
public final class l5f {
    public final bpn0 a = new bpn0(new ml7(2));

    public final ClipsSubsSetting a() {
        ClipsSubsSetting clipsSubsSetting = null;
        String string = ((SharedPreferences) this.a.getValue()).getString("subs-setting", null);
        if (string != null) {
            ClipsSubsSetting.Companion.getClass();
            ClipsSubsSetting[] values = ClipsSubsSetting.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                ClipsSubsSetting clipsSubsSetting2 = values[i];
                if (epx.f(clipsSubsSetting2.h(), string)) {
                    clipsSubsSetting = clipsSubsSetting2;
                    break;
                }
                i++;
            }
        }
        return clipsSubsSetting == null ? ClipsSubsSetting.SOUND_OFF : clipsSubsSetting;
    }
}
