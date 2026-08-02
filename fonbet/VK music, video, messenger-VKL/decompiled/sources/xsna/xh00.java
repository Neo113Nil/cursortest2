package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.groups.ManagedGroup;

/* compiled from: ManagedGroupItem.kt */
/* loaded from: classes3.dex */
public final class xh00 implements hfz {
    public final Peer.Group b;
    public final String c;
    public final String d;
    public final ImageList e;
    public final int f;
    public final ManagedGroup.Type g;
    public final boolean h;

    public xh00(ManagedGroup managedGroup) {
        Peer.Group group = managedGroup.a;
        String str = managedGroup.b;
        String str2 = managedGroup.i;
        ImageList imageList = managedGroup.e;
        int i = managedGroup.h;
        ManagedGroup.Type type = managedGroup.c;
        boolean z = managedGroup.g;
        this.b = group;
        this.c = str;
        this.d = str2;
        this.e = imageList;
        this.f = i;
        this.g = type;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh00)) {
            return false;
        }
        xh00 xh00Var = (xh00) obj;
        return epx.f(this.b, xh00Var.b) && epx.f(this.c, xh00Var.c) && epx.f(this.d, xh00Var.d) && epx.f(this.e, xh00Var.e) && this.f == xh00Var.f && this.g == xh00Var.g && this.h == xh00Var.h;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + shy.a(this.f, fw3.a(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedGroupItem(peer=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", activity=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", unreadConversationsCount=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(this.g);
        sb.append(", isMuted=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
