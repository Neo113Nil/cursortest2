package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.List;

/* compiled from: ContactListCheckInChatCmdArgs.kt */
/* loaded from: classes2.dex */
public final class w8j {
    public final Peer a;
    public final Source b;
    public final List<Peer> c;

    /* JADX WARN: Multi-variable type inference failed */
    public w8j(Peer peer, Source source, List<? extends Peer> list) {
        this.a = peer;
        this.b = source;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8j)) {
            return false;
        }
        w8j w8jVar = (w8j) obj;
        return epx.f(this.a, w8jVar.a) && this.b == w8jVar.b && epx.f(this.c, w8jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactListCheckInChatCmdArgs(dialogId=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", memberList=");
        return ms9.a(')', sb, this.c);
    }
}
