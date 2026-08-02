package defpackage;

import com.yandex.messaging.PushPriority;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class l7c {
    public final Map a;
    public final PushPriority b;
    public final PushPriority c;

    public l7c(Map map, PushPriority pushPriority, PushPriority pushPriority2) {
        this.a = map;
        this.b = pushPriority;
        this.c = pushPriority2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7c)) {
            return false;
        }
        l7c l7cVar = (l7c) obj;
        return this.a.equals(l7cVar.a) && this.b == l7cVar.b && this.c == l7cVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CloudMessage(data=" + this.a + ", priority=" + this.b + ", originalPriority=" + this.c + Extension.C_BRAKE;
    }
}
