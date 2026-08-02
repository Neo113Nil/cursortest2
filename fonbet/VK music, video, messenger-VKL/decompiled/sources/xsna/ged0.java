package xsna;

import com.vk.dto.common.data.PrivacySetting;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PrivacyOptionItem.kt */
/* loaded from: classes5.dex */
public final class ged0 {
    public static final int a(ArrayList arrayList, PrivacySetting.PrivacyRule privacyRule) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (epx.f(((fed0) it.next()).a, privacyRule)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
