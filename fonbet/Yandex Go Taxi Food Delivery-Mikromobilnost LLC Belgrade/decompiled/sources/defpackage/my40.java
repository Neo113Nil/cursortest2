package defpackage;

import com.yandex.messaging.core.net.entities.proto.NotificationMeta;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.ReplyData;
import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class my40 {
    public final Date a;
    public final long b;
    public final boolean c;
    public final Long d;
    public final String e;
    public final ReplyData f;
    public final MessageData g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final NotificationMeta m;
    public final Boolean n;
    public final Boolean o;
    public final String p;

    public my40(Date date, long j, boolean z, Long l, String str, ReplyData replyData, MessageData messageData, String str2, boolean z2, boolean z3, boolean z4, String str3, NotificationMeta notificationMeta, Boolean bool, Boolean bool2, String str4) {
        this.a = date;
        this.b = j;
        this.c = z;
        this.d = l;
        this.e = str;
        this.f = replyData;
        this.g = messageData;
        this.h = str2;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = str3;
        this.m = notificationMeta;
        this.n = bool;
        this.o = bool2;
        this.p = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my40)) {
            return false;
        }
        my40 my40Var = (my40) obj;
        return this.a.equals(my40Var.a) && this.b == my40Var.b && this.c == my40Var.c && jl40.l(this.d, my40Var.d) && jl40.l(this.e, my40Var.e) && jl40.l(this.f, my40Var.f) && this.g.equals(my40Var.g) && this.h.equals(my40Var.h) && this.i == my40Var.i && this.j == my40Var.j && this.k == my40Var.k && jl40.l(this.l, my40Var.l) && jl40.l(this.m, my40Var.m) && this.n.equals(my40Var.n) && this.o.equals(my40Var.o) && jl40.l(this.p, my40Var.p);
    }

    public final int hashCode() {
        int e = unr0.e(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ReplyData replyData = this.f;
        int e2 = unr0.e(unr0.e(unr0.e(unr0.b((this.g.hashCode() + ((hashCode2 + (replyData == null ? 0 : replyData.hashCode())) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str2 = this.l;
        int hashCode3 = (e2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NotificationMeta notificationMeta = this.m;
        int hashCode4 = (this.o.hashCode() + ((this.n.hashCode() + ((hashCode3 + (notificationMeta == null ? 0 : notificationMeta.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.p;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableMessageDataWrapper(date=");
        sb.append(this.a);
        sb.append(", historyId=");
        sb.append(this.b);
        sb.append(", isForwarded=");
        sb.append(this.c);
        sb.append(", hostMessageHistoryId=");
        sb.append(this.d);
        sb.append(", originalMessageChatId=");
        sb.append(this.e);
        sb.append(", replyData=");
        sb.append(this.f);
        sb.append(", data=");
        sb.append(this.g);
        sb.append(", authorId=");
        sb.append(this.h);
        n.z(", isMessageSent=", ", isMessageSeen=", sb, this.i, this.j);
        sb.append(", hasForwards=");
        sb.append(this.k);
        sb.append(", forwardedAuthorId=");
        sb.append(this.l);
        sb.append(", notificationMeta=");
        sb.append(this.m);
        sb.append(", isStarred=");
        sb.append(this.n);
        sb.append(", isEphemeral=");
        sb.append(this.o);
        sb.append(", translatedText=");
        sb.append(this.p);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
