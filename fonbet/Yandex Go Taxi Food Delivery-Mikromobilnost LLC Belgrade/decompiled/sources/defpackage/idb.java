package defpackage;

import com.yandex.messaging.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class idb {
    public final ChatRequest a;
    public final int b;
    public final long c;

    public idb(ChatRequest chatRequest, int i, long j) {
        this.a = chatRequest;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idb)) {
            return false;
        }
        idb idbVar = (idb) obj;
        return jl40.l(this.a, idbVar.a) && this.b == idbVar.b && this.c == idbVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatUnreadMessageCount(chatRequest=");
        sb.append(this.a);
        sb.append(", unread=");
        sb.append(this.b);
        sb.append(", total=");
        return oyr.n(this.c, Extension.C_BRAKE, sb);
    }
}
