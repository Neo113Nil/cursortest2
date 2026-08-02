package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: PrivacyTypes.kt */
/* loaded from: classes4.dex */
public final class qfd0 {
    public static final void a(ListBuilder listBuilder, PostingSettings postingSettings, PrivacyPostType privacyPostType) {
        if (postingSettings.o.isEmpty()) {
            return;
        }
        PrivacyPostType.SingleDonutLevel singleDonutLevel = privacyPostType instanceof PrivacyPostType.SingleDonutLevel ? (PrivacyPostType.SingleDonutLevel) privacyPostType : null;
        listBuilder.add(new PrivacyPostType.SingleDonutLevel(singleDonutLevel != null ? singleDonutLevel.b : null));
    }

    public static final List<PrivacyPostType> b(UserId userId, PostingSettings postingSettings, PrivacyPostType privacyPostType, cpc0 cpc0Var) {
        boolean z = postingSettings.m;
        if (fkq0.b(userId)) {
            if (!z) {
                return EmptyList.b;
            }
            ListBuilder e = e43.e();
            e.add(PrivacyPostType.AllUsers.b);
            e.add(PrivacyPostType.AllDonuts.b);
            a(e, postingSettings, privacyPostType);
            return e.g();
        }
        ListBuilder e2 = e43.e();
        e2.add(PrivacyPostType.AllUsers.b);
        e2.add(PrivacyPostType.FriendsOnly.b);
        e2.add(PrivacyPostType.BestFriends.b);
        List<DonutLevel> list = postingSettings.o;
        if (z) {
            if (!cpc0Var.k()) {
                a(e2, postingSettings, privacyPostType);
            } else if (list.size() == 1) {
                e2.add(new PrivacyPostType.SingleDonutLevel((DonutLevel) j5g.Y(list)));
            } else {
                a(e2, postingSettings, privacyPostType);
            }
        }
        return e2.g();
    }
}
