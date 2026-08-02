package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import java.util.List;
import xsna.mih0;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class v3d implements ClipItemViewEvent {
    public final mih0.e b;
    public final List<mih0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public v3d(mih0.e eVar, List<? extends mih0> list) {
        this.b = eVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3d)) {
            return false;
        }
        v3d v3dVar = (v3d) obj;
        return epx.f(this.b, v3dVar.b) && epx.f(this.c, v3dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b.i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupClicked(header=");
        sb.append(this.b);
        sb.append(", modalItems=");
        return ms9.a(')', sb, this.c);
    }
}
