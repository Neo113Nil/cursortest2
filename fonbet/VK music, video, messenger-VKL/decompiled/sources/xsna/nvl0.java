package xsna;

import com.vk.api.generated.recomSettings.dto.RecomSettingsSubRecomThemeDto;
import com.vk.dto.stories.model.StoryEntry;
import java.util.List;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nvl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Set c;

    public /* synthetic */ nvl0(int i, Set set) {
        this.b = i;
        this.c = set;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(this.c.contains((StoryEntry) obj));
            default:
                RecomSettingsSubRecomThemeDto recomSettingsSubRecomThemeDto = (RecomSettingsSubRecomThemeDto) obj;
                List<Integer> e = recomSettingsSubRecomThemeDto.e();
                if (!this.c.containsAll(e)) {
                    e = null;
                }
                if (e != null) {
                    return k9q0.s(recomSettingsSubRecomThemeDto);
                }
                return null;
        }
    }
}
