package xsna;

import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PrivacySettingsExtensions.kt */
/* loaded from: classes7.dex */
public final class zed0 {
    public static final ArrayList a(List list) {
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f((PrivacySetting.PrivacyRule) obj2, PrivacyRules.m)) {
                break;
            }
        }
        if (((PrivacySetting.PrivacyRule) obj2) != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((PrivacySetting.PrivacyRule) next) instanceof PrivacyRules.Include) {
                    obj = next;
                    break;
                }
            }
            PrivacySetting.PrivacyRule privacyRule = (PrivacySetting.PrivacyRule) obj;
            if (privacyRule != null) {
                ((PrivacyRules.Include) privacyRule).Fb(new UserId(2000000028L));
            } else {
                PrivacyRules.Include include = new PrivacyRules.Include();
                include.Fb(new UserId(2000000028L));
                arrayList.add(include);
            }
            arrayList.remove(PrivacyRules.m);
        }
        return arrayList;
    }
}
