package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.messenger.domain.MessengerChatOwner;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"La250;", "", "Companion", "y150", "z150", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class a250 {
    public static final z150 Companion = new z150();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new d540(16))};
    public final String a;
    public final MessengerChatOwner b;

    public /* synthetic */ a250(int i, String str, MessengerChatOwner messengerChatOwner) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = messengerChatOwner;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a250)) {
            return false;
        }
        a250 a250Var = (a250) obj;
        return jl40.l(this.a, a250Var.a) && this.b == a250Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MessengerChatOwner messengerChatOwner = this.b;
        return hashCode + (messengerChatOwner == null ? 0 : messengerChatOwner.hashCode());
    }

    public final String toString() {
        return "NamespaceDefinition(namespace=" + this.a + ", messengerChatOwner=" + this.b + Extension.C_BRAKE;
    }

    public a250() {
        this.a = "";
        this.b = null;
    }
}
