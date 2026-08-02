package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class q6d implements ClipItemViewEvent {
    public final List<SubtitleRenderItem> b;

    /* JADX WARN: Multi-variable type inference failed */
    public q6d(List<? extends SubtitleRenderItem> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6d) && epx.f(this.b, ((q6d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("OnSubtitleRenderItemsReceived(renderItems="), this.b);
    }
}
