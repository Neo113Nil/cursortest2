package defpackage;

import com.yandex.messaging.internal.MessageStatus;
import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m8t {
    public final CharSequence a;
    public final Date b;
    public final MessageStatus c;
    public final Integer d;
    public final boolean e;

    public m8t(CharSequence charSequence, Date date, MessageStatus messageStatus, Integer num, boolean z) {
        this.a = charSequence;
        this.b = date;
        this.c = messageStatus;
        this.d = num;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8t)) {
            return false;
        }
        m8t m8tVar = (m8t) obj;
        return jl40.l(this.a, m8tVar.a) && jl40.l(this.b, m8tVar.b) && this.c == m8tVar.c && jl40.l(this.d, m8tVar.d) && this.e == m8tVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Date date = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (date == null ? 0 : date.hashCode())) * 31)) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewResult(lastMessage=");
        sb.append((Object) this.a);
        sb.append(", lastMessageDate=");
        sb.append(this.b);
        sb.append(", lastMessageStatus=");
        sb.append(this.c);
        sb.append(", lastMessageIconRes=");
        sb.append(this.d);
        sb.append(", isMissedCall=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
