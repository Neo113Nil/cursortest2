package defpackage;

import com.yandex.go.taxi.order.chat.api.data.model.Message;
import com.yandex.go.taxi.order.chat.api.data.model.Sender;
import com.yandex.go.taxi.order.chat.api.data.model.Translation;
import java.util.Calendar;

/* loaded from: classes14.dex */
public final class drq0 {
    public final long a;
    public final Message b;
    public final boolean c;

    public drq0(long j, String str, Sender sender, zzs zzsVar, String str2, String str3, Translation translation, Calendar calendar, Message.Action action, boolean z) {
        this.a = j;
        this.b = new Message(str, sender, zzsVar, str2, str3, translation, calendar, action);
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof drq0) {
            return this.a == ((drq0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SentMessage{id=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        return xra1.a(sb, ", isRead=", this.c, "}");
    }

    public drq0(long j, Message message) {
        this.a = j;
        this.b = message;
        this.c = false;
    }
}
