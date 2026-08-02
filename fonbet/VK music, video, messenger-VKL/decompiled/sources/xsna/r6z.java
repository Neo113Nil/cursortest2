package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: LikesAdd.kt */
/* loaded from: classes15.dex */
public final class r6z extends xsg0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6z(int i, long j, UserId userId, String str, String str2) {
        super("likes.add");
        str2 = (i & 16) != 0 ? null : str2;
        K("type", str);
        F(userId, "owner_id");
        D(j, "item_id");
        K("ref", str2);
    }

    public r6z(UserId userId, boolean z) {
        super(z ? "video.liveSubscribe" : "video.liveUnsubscribe");
        F(userId, "owner_id");
    }

    public r6z(int i, UserId userId, boolean z) {
        this(userId, z);
        C(i, "video_id");
    }
}
