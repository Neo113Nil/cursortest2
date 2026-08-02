package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: NotificationsRestore.kt */
/* loaded from: classes15.dex */
public final class ak70 extends xsg0 {
    public ak70(UserId userId, boolean z) {
        super(z ? "podcasts.subscribe" : "podcasts.unsubscribe");
        F(userId, "owner_id");
    }
}
