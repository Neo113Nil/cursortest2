package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AccountSetPushSettings.kt */
/* loaded from: classes14.dex */
public final class is extends xsg0 {
    public is(UserId userId, int i, int i2) {
        super("photos.removeTag");
        F(userId, "owner_id");
        C(i, "photo_id");
        C(i2, "tag_id");
    }
}
