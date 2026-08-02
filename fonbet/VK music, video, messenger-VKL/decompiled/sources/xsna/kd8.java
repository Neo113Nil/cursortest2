package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BroadcastAuthorExt.kt */
/* loaded from: classes3.dex */
public final class kd8 {
    public static final UserId a(BroadcastAuthor broadcastAuthor) {
        if (broadcastAuthor instanceof BroadcastAuthor.CurrentUser) {
            return ((BroadcastAuthor.CurrentUser) broadcastAuthor).b.c;
        }
        if (broadcastAuthor instanceof BroadcastAuthor.Group) {
            return ((BroadcastAuthor.Group) broadcastAuthor).b.c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
