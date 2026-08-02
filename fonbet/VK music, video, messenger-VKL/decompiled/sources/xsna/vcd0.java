package xsna;

import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import java.util.Collections;
import java.util.List;

/* compiled from: PrivacyDo.kt */
/* loaded from: classes7.dex */
public final class vcd0 {
    public static final PrivacyDo a(PrivacyDo privacyDo, UserId userId, List<String> list) {
        List<PrivacySetting.PrivacyRule> list2 = privacyDo.b;
        PrivacySetting.PrivacyRule privacyRule = (PrivacySetting.PrivacyRule) j5g.a0(list2);
        String str = privacyRule != null ? (String) j5g.a0(privacyRule.zb()) : null;
        if (fkq0.b(userId) && str != null && !list.contains(str)) {
            list2 = Collections.singletonList(PrivacyRules.d);
        }
        return PrivacyDo.a(privacyDo, list2, list, null, 4);
    }
}
