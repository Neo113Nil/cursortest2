package defpackage;

import com.yandex.messaging.sdk.MessengerInviteLinkHandleFlag;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class l220 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final MessengerInviteLinkHandleFlag e;

    public l220(int i) {
        MessengerInviteLinkHandleFlag messengerInviteLinkHandleFlag = MessengerInviteLinkHandleFlag.HANDLE_CURRENT_ENVIRONMENT;
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = messengerInviteLinkHandleFlag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l220)) {
            return false;
        }
        l220 l220Var = (l220) obj;
        return this.a == l220Var.a && this.b == l220Var.b && this.c == l220Var.c && this.d == l220Var.d && this.e == l220Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = qv10.u("MessengerIntentConfiguration(shouldHandleChatOpenIntents=", ", shouldHandleSystemShareIntents=", ", shouldHandleDeeplinkIntents=", this.a, this.b);
        nnm.v(", shouldHandleCallIntents=", ", inviteLinkHandleFlag=", u, this.c, this.d);
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public l220() {
        this(0);
    }
}
