package xsna;

import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.mno0;
import xsna.mto0;

/* compiled from: CommonUtils.kt */
/* loaded from: classes16.dex */
public final class hng {
    public static final Integer a(List<? extends PrivacySetting.PrivacyRule> list) {
        PrivacySetting.PrivacyRule privacyRule;
        List O0 = (list == null || (privacyRule = (PrivacySetting.PrivacyRule) j5g.a0(list)) == null) ? null : j5g.O0(privacyRule.zb());
        if (O0 == null || O0.equals(Collections.singletonList(PrivacyRules.a.d))) {
            return null;
        }
        return (O0.equals(Collections.singletonList(PrivacyRules.b.d)) || O0.equals(Collections.singletonList(PrivacyRules.c.d))) ? Integer.valueOf(R.drawable.vk_icon_lock_16) : O0.equals(Collections.singletonList(PrivacyRules.e.d)) ? Integer.valueOf(R.drawable.vk_icon_linked_16) : O0.equals(Collections.singletonList(PrivacyRules.f.d)) ? Integer.valueOf(R.drawable.vk_icon_donut_outline_16) : O0.equals(Collections.singletonList(PrivacyRules.g.d)) ? Integer.valueOf(R.drawable.vk_icon_user_16) : Integer.valueOf(R.drawable.vk_icon_users_16);
    }

    public static final mno0 b(Integer num) {
        long millis = TimeUnit.SECONDS.toMillis(num.intValue());
        if (qni0.a() - millis < tni.l()) {
            return new mno0.g(R.string.video_album_updated_right_now);
        }
        StringBuffer stringBuffer = new StringBuffer();
        mto0.a(millis, stringBuffer, mto0.a.C3369a.g);
        return new mno0.h(R.string.video_album_updated, Collections.singletonList(stringBuffer));
    }
}
