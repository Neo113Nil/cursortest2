package defpackage;

import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerTabs;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cab {
    public final ChatThreadsContainerTabs a;
    public final List b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ cab(int i) {
        this(r5, scc.g(new eab(r5, 0, false), new eab(ChatThreadsContainerTabs.THREADS, 0, false)), true, false);
        ChatThreadsContainerTabs chatThreadsContainerTabs = ChatThreadsContainerTabs.CHATS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cab)) {
            return false;
        }
        cab cabVar = (cab) obj;
        return this.a == cabVar.a && jl40.l(this.b, cabVar.b) && this.c == cabVar.c && this.d == cabVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatThreadsContainerState(currentTab=");
        sb.append(this.a);
        sb.append(", tabs=");
        sb.append(this.b);
        sb.append(", isTabsBarVisible=");
        return smw0.k(", isInCustomFolder=", Extension.C_BRAKE, sb, this.c, this.d);
    }

    public cab(ChatThreadsContainerTabs chatThreadsContainerTabs, List list, boolean z, boolean z2) {
        this.a = chatThreadsContainerTabs;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public cab() {
        this(0);
    }
}
