package defpackage;

import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerTabs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class eab {
    public final ChatThreadsContainerTabs a;
    public final int b;
    public final boolean c;

    public eab(ChatThreadsContainerTabs chatThreadsContainerTabs, int i, boolean z) {
        this.a = chatThreadsContainerTabs;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eab)) {
            return false;
        }
        eab eabVar = (eab) obj;
        return this.a == eabVar.a && this.b == eabVar.b && this.c == eabVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatThreadsContainerTabItem(type=");
        sb.append(this.a);
        sb.append(", badgeCount=");
        sb.append(this.b);
        sb.append(", hasMentions=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
