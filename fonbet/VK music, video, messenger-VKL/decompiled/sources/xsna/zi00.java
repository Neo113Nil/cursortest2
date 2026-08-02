package xsna;

import com.vk.api.generated.messages.dto.MessagesCountersDto;
import com.vk.api.generated.messages.dto.MessagesCountersFilterDto;
import com.vk.api.generated.messages.dto.MessagesGroupsFolderCountersDto;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collections;

/* compiled from: ManagedGroupsUnreadCountApiCmd.kt */
/* loaded from: classes2.dex */
public final class zi00 extends nx2<fi00> {
    public final boolean b;

    public zi00(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi00) && this.b == ((zi00) obj).b;
    }

    @Override // xsna.nx2
    public final fi00 f(l7r0 l7r0Var) {
        MessagesCountersDto messagesCountersDto = (MessagesCountersDto) bz2.l(sg20.d(new vg20(), Collections.singletonList(MessagesCountersFilterDto.GROUPS_FOLDER), null, null, 14), this.b);
        if (messagesCountersDto.g() == null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"ManagedGroups", "groupFolderDto is null"});
            }
        }
        MessagesGroupsFolderCountersDto g = messagesCountersDto.g();
        int f = g != null ? g.f() : 0;
        MessagesGroupsFolderCountersDto g2 = messagesCountersDto.g();
        int d = g2 != null ? g2.d() : 0;
        MessagesGroupsFolderCountersDto g3 = messagesCountersDto.g();
        return new fi00(f, d, g3 != null ? g3.e() : 0);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ManagedGroupsUnreadCountApiCmd(isAwaitNetwork="), this.b, ')');
    }
}
