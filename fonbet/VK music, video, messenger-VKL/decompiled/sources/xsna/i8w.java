package xsna;

import com.vk.dto.common.Peer;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ImItemsMeta.kt */
/* loaded from: classes2.dex */
public final class i8w {
    public static final bpn0 d = new bpn0(new wb1(15));
    public final Map<Peer, List<vh30>> a;
    public final Set<Peer> b;
    public final Set<Peer> c;

    /* JADX WARN: Multi-variable type inference failed */
    public i8w(Map<Peer, ? extends List<vh30>> map, Set<? extends Peer> set, Set<? extends Peer> set2) {
        this.a = map;
        this.b = set;
        this.c = set2;
    }

    public static i8w a(i8w i8wVar, Map map, Set set, Set set2, int i) {
        if ((i & 1) != 0) {
            map = i8wVar.a;
        }
        if ((i & 2) != 0) {
            set = i8wVar.b;
        }
        if ((i & 4) != 0) {
            set2 = i8wVar.c;
        }
        i8wVar.getClass();
        return new i8w(map, set, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8w)) {
            return false;
        }
        i8w i8wVar = (i8w) obj;
        return epx.f(this.a, i8wVar.a) && epx.f(this.b, i8wVar.b) && epx.f(this.c, i8wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImItemsMeta(composings=");
        sb.append(this.a);
        sb.append(", sendingMessages=");
        sb.append(this.b);
        sb.append(", failedMessages=");
        return ur.c(sb, this.c, ')');
    }
}
