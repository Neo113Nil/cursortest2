package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PersonEvents.kt */
/* loaded from: classes3.dex */
public final class v490 implements yj40 {
    public final String a;

    public v490(UserId userId, boolean z) {
        this.a = "ownerId=" + userId.b + " isFollowed=" + z;
    }

    @Override // xsna.yj40
    public final String a() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "OwnerFollowed";
    }
}
