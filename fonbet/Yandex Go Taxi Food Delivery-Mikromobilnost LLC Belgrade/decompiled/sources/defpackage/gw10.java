package defpackage;

import com.yandex.messaging.internal.view.timeline.common.MessageSendStatus;
import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class gw10 {
    public MessageSendStatus a;
    public boolean b;
    public int c;
    public int d;
    public Date e;

    public gw10(int i) {
        this.a = MessageSendStatus.Pending;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw10)) {
            return false;
        }
        gw10 gw10Var = (gw10) obj;
        return this.a == gw10Var.a && this.b == gw10Var.b && this.c == gw10Var.c && this.d == gw10Var.d && jl40.l(this.e, gw10Var.e);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, oyr.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31), 31);
        Date date = this.e;
        return b + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        MessageSendStatus messageSendStatus = this.a;
        boolean z = this.b;
        int i = this.c;
        int i2 = this.d;
        Date date = this.e;
        StringBuilder sb = new StringBuilder("MessageStatus(sentStatus=");
        sb.append(messageSendStatus);
        sb.append(", isEdited=");
        sb.append(z);
        sb.append(", forwardsCount=");
        vfc.u(i, i2, ", viewsCount=", ", sentTime=", sb);
        sb.append(date);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public gw10() {
        this(0);
    }
}
