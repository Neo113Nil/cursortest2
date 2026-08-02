package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SnippetPlayInfo.kt */
/* loaded from: classes3.dex */
public final class ack0 {
    public final MusicTrack a;
    public final List<String> b;

    public ack0(MusicTrack musicTrack, ArrayList arrayList) {
        this.a = musicTrack;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ack0)) {
            return false;
        }
        ack0 ack0Var = (ack0) obj;
        return epx.f(this.a, ack0Var.a) && epx.f(this.b, ack0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnippetPlayInfo(trackToPlay=");
        sb.append(this.a);
        sb.append(", audioIds=");
        return ms9.a(')', sb, this.b);
    }
}
