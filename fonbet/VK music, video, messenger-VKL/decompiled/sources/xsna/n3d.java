package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class n3d implements ClipItemViewEvent {
    public final int b;
    public final Integer c;
    public final UserId d;

    public n3d(int i, Integer num, UserId userId) {
        this.b = i;
        this.c = num;
        this.d = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3d)) {
            return false;
        }
        n3d n3dVar = (n3d) obj;
        return this.b == n3dVar.b && epx.f(this.c, n3dVar.c) && epx.f(this.d, n3dVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Integer num = this.c;
        return Long.hashCode(this.d.b) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentClicked(id=");
        sb.append(this.b);
        sb.append(", parentCommentId=");
        sb.append(this.c);
        sb.append(", userId=");
        return gp.b(sb, this.d, ')');
    }
}
