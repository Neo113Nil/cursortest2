package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PodcastEvents.kt */
/* loaded from: classes3.dex */
public final class tjb0 implements yj40 {
    public final UserId a;
    public final String b;

    public tjb0(UserId userId) {
        this.a = userId;
        this.b = b4q.b(userId, "PodcastUnsubscribe ownerId=");
    }

    @Override // xsna.yj40
    public final String a() {
        return "";
    }

    public final UserId b() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return this.b;
    }
}
