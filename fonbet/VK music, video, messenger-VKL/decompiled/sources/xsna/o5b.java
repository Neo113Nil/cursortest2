package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChannelMsgSearchResult.kt */
/* loaded from: classes16.dex */
public final class o5b {
    public final List<Msg> a;
    public final Integer b;
    public final boolean c;

    public o5b() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5b)) {
            return false;
        }
        o5b o5bVar = (o5b) obj;
        return epx.f(this.a, o5bVar.a) && epx.f(this.b, o5bVar.b) && this.c == o5bVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMsgSearchResult(messages=");
        sb.append(this.a);
        sb.append(", nextFrom=");
        sb.append(this.b);
        sb.append(", hasMore=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public o5b(Integer num, List list, boolean z) {
        this.a = list;
        this.b = num;
        this.c = z;
    }

    public o5b(int i) {
        this(null, EmptyList.b, false);
    }
}
