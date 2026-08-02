package xsna;

import com.vk.dto.common.data.PrivacySetting;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LivesUserSettingsCacheImpl.kt */
/* loaded from: classes17.dex */
public final class goz implements foz {
    public ArrayList a;

    @Override // xsna.foz
    public final void a(PrivacySetting privacySetting) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            int i = 0;
            int i2 = -1;
            for (Object obj : arrayList) {
                int i3 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((PrivacySetting) obj).b, privacySetting.b)) {
                    i2 = i;
                }
                i = i3;
            }
            if (i2 != -1) {
                arrayList.set(i2, privacySetting);
            }
        }
    }

    @Override // xsna.foz
    public final void b(List<? extends PrivacySetting> list) {
        this.a = list != null ? new ArrayList(list) : null;
    }

    @Override // xsna.foz
    public final ArrayList c() {
        return this.a;
    }
}
