package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.List;

/* compiled from: DialogGetMembersArgs.kt */
/* loaded from: classes2.dex */
public final class aem {
    public final Peer a;
    public final Source b;
    public final boolean c;
    public final List<Peer> d;

    public aem() {
        throw null;
    }

    public aem(Peer peer, Source source, List list) {
        this.a = peer;
        this.b = source;
        this.c = true;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aem)) {
            return false;
        }
        aem aemVar = (aem) obj;
        return epx.f(this.a, aemVar.a) && this.b == aemVar.b && this.c == aemVar.c && epx.f(this.d, aemVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.a.b) * 31, 31, this.b), 961, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogGetMembersArgs(peer=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        sb.append(this.c);
        sb.append(", changerTag=null, memberIds=");
        return ms9.a(')', sb, this.d);
    }
}
