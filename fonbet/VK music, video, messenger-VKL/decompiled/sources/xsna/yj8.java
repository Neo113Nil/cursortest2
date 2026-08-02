package xsna;

import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BroadcastStreamExt.kt */
/* loaded from: classes3.dex */
public final class yj8 {
    public static final Integer a(BroadcastStream broadcastStream) {
        if (broadcastStream instanceof BroadcastStream.New) {
            return null;
        }
        if (broadcastStream instanceof BroadcastStream.Upcoming) {
            return Integer.valueOf(((BroadcastStream.Upcoming) broadcastStream).b.o0());
        }
        throw new NoWhenBranchMatchedException();
    }
}
