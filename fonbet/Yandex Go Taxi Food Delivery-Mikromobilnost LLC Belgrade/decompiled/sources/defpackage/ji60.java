package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ji60 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public ji60(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji60)) {
            return false;
        }
        ji60 ji60Var = (ji60) obj;
        return this.a.equals(ji60Var.a) && this.b.equals(ji60Var.b) && this.c.equals(ji60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationMessages(allMessagesForNotification=");
        sb.append(this.a);
        sb.append(", newMessages=");
        sb.append(this.b);
        sb.append(", newMessagesForSeparateNotification=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
