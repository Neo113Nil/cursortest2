package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DialogsGetByIdArgs.kt */
/* loaded from: classes2.dex */
public final class sqm {
    public final List<Peer> a;
    public final Source b;
    public final boolean c;
    public final Object d;
    public final int e;

    public sqm() {
        this(null, null, false, null, 0, 31);
    }

    public static sqm a(sqm sqmVar, Source source) {
        return new sqm(sqmVar.a, source, sqmVar.c, sqmVar.d, sqmVar.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqm)) {
            return false;
        }
        sqm sqmVar = (sqm) obj;
        return epx.f(this.a, sqmVar.a) && this.b == sqmVar.b && this.c == sqmVar.c && epx.f(this.d, sqmVar.d) && this.e == sqmVar.e;
    }

    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Object obj = this.d;
        return Integer.hashCode(this.e) + ((b + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsGetByIdArgs(peers=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        sb.append(this.c);
        sb.append(", changerTag=");
        sb.append(this.d);
        sb.append(", folderId=");
        return vu5.b(sb, this.e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sqm(List<? extends Peer> list, Source source, boolean z, Object obj, int i) {
        this.a = list;
        this.b = source;
        this.c = z;
        this.d = obj;
        this.e = i;
        if (i != -1 && source == Source.NETWORK) {
            throw new RuntimeException("Network load of conversation by id from folders is not supported");
        }
    }

    public sqm(Peer peer, Source source, boolean z, Object obj, int i) {
        this((List<? extends Peer>) Collections.singletonList(peer), (i & 2) != 0 ? Source.CACHE : source, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : obj, -1);
    }

    public sqm(List list, Source source, boolean z, Object obj, int i, int i2) {
        this((List<? extends Peer>) ((i2 & 1) != 0 ? EmptyList.b : list), (i2 & 2) != 0 ? Source.CACHE : source, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : obj, (i2 & 16) != 0 ? -1 : i);
    }
}
