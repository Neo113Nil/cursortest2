package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.ui.components.contacts.SortOrder;
import java.util.LinkedHashSet;

/* compiled from: ContactListCmdArgs.kt */
/* loaded from: classes2.dex */
public final class x8j {
    public final Source a;
    public final SortOrder b;
    public final boolean c;
    public final LinkedHashSet d;
    public final Peer e;
    public final boolean f;

    public x8j(Source source, SortOrder sortOrder, boolean z, LinkedHashSet linkedHashSet, Peer peer, boolean z2) {
        this.a = source;
        this.b = sortOrder;
        this.c = z;
        this.d = linkedHashSet;
        this.e = peer;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8j)) {
            return false;
        }
        x8j x8jVar = (x8j) obj;
        return this.a == x8jVar.a && this.b == x8jVar.b && this.c == x8jVar.c && this.d.equals(x8jVar.d) && epx.f(this.e, x8jVar.e) && this.f == x8jVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        Peer peer = this.e;
        return Boolean.hashCode(this.f) + bh10.a((hashCode + (peer == null ? 0 : Long.hashCode(peer.b))) * 31, 31, 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactListCmdArgs(source=");
        sb.append(this.a);
        sb.append(", order=");
        sb.append(this.b);
        sb.append(", updateHints=");
        sb.append(this.c);
        sb.append(", extraMembers=");
        sb.append(this.d);
        sb.append(", rootDialogPeer=");
        sb.append(this.e);
        sb.append(", importContactsStartTimeMs=0, isForChannelCreation=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
