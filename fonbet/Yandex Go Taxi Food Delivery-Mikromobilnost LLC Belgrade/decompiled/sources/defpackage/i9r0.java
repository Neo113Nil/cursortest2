package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.settings.api.data.SettingDto;
import com.ybsdk.feature.settings.internal.network.dto.SettingsCategoryDto;
import com.ybsdk.feature.settings.internal.network.dto.SettingsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class i9r0 {
    public static final v7r0 a(SettingsResponseDto settingsResponseDto) {
        String title = settingsResponseDto.getTitle();
        String description = settingsResponseDto.getDescription();
        List<SettingsCategoryDto> settings = settingsResponseDto.getSettings();
        ArrayList arrayList = new ArrayList(tcc.n(settings, 10));
        for (SettingsCategoryDto settingsCategoryDto : settings) {
            String key = settingsCategoryDto.getKey();
            Text.Constant i = g8e.i(Text.Companion, settingsCategoryDto.getTitle());
            List<SettingDto> settings2 = settingsCategoryDto.getSettings();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = settings2.iterator();
            while (it.hasNext()) {
                o8r0 a = j9r0.a((SettingDto) it.next(), null);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            arrayList.add(new j59(key, i, arrayList2));
        }
        return new v7r0(title, description, arrayList);
    }
}
