package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityStrikesController.kt */
/* loaded from: classes17.dex */
public interface o2i {
    boolean a(Throwable th);

    boolean b(Context context, UserId userId, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType strikeRestrictionType);

    boolean d(Throwable th, boolean z);
}
