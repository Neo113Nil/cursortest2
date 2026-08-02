package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.List;

/* compiled from: ChannelPinnedMsgsUpdate.kt */
/* loaded from: classes2.dex */
public final class o8b extends sxp {
    public final long b;
    public final List<Msg> c;
    public final Object d;

    public /* synthetic */ o8b(long j, List list) {
        this(j, list, null);
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8b)) {
            return false;
        }
        o8b o8bVar = (o8b) obj;
        return this.b == o8bVar.b && epx.f(this.c, o8bVar.c) && epx.f(this.d, o8bVar.d);
    }

    public final int hashCode() {
        int a = fw3.a(Long.hashCode(this.b) * 31, 31, this.c);
        Object obj = this.d;
        return a + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelPinnedMsgsUpdate(channelId=");
        sb.append(this.b);
        sb.append(", pinnedMsgs=");
        sb.append(this.c);
        sb.append(", changerTag=");
        return k73.c(sb, this.d, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o8b(long j, List<? extends Msg> list, Object obj) {
        this.b = j;
        this.c = list;
        this.d = obj;
    }
}
