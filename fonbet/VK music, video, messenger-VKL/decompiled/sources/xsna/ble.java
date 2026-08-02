package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsMarkNavMenuBadgeViewed.kt */
/* loaded from: classes14.dex */
public final class ble extends xsg0 {
    public ble(UserId userId, long j, int i) {
        super("reports.add");
        K("type", "friend_request");
        C(i, "reason");
        F(userId, "owner_id");
        D(j, "item_id");
    }
}
