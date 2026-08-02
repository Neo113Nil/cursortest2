package xsna;

import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;

/* compiled from: VideoPrivacyUtil.kt */
/* loaded from: classes16.dex */
public final class m6t0 {
    public static final Integer a(List<? extends PrivacySetting.PrivacyRule> list) {
        PrivacySetting.PrivacyRule privacyRule = (PrivacySetting.PrivacyRule) j5g.a0(list);
        List<String> zb = privacyRule != null ? privacyRule.zb() : null;
        if (zb == null || zb.equals(Collections.singletonList(PrivacyRules.a.d))) {
            return null;
        }
        return (zb.equals(Collections.singletonList(PrivacyRules.b.d)) || zb.equals(Collections.singletonList(PrivacyRules.c.d))) ? Integer.valueOf(R.drawable.vk_icon_lock_16) : zb.equals(Collections.singletonList(PrivacyRules.e.d)) ? Integer.valueOf(R.drawable.vk_icon_linked_16) : zb.equals(Collections.singletonList(PrivacyRules.f.d)) ? Integer.valueOf(R.drawable.vk_icon_donut_outline_16) : zb.equals(Collections.singletonList(PrivacyRules.g.d)) ? Integer.valueOf(R.drawable.vk_icon_user_16) : Integer.valueOf(R.drawable.vk_icon_users_16);
    }
}
