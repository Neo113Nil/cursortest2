package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import java.util.List;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class z3d implements ClipItemViewEvent {
    public final List<mih0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public z3d(List<? extends mih0> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3d) && epx.f(this.b, ((z3d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MoreClicked(badges="), this.b);
    }
}
