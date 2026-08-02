package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import xsna.xrh;

/* compiled from: CommunityInternalMenuItemModel.kt */
/* loaded from: classes5.dex */
public final class o5h extends s4h {
    public final ArrayList b;
    public final UserId c;
    public final boolean d;
    public final xrh.c.b e;

    public o5h(ArrayList arrayList, UserId userId, boolean z, xrh.c.b bVar) {
        this.b = arrayList;
        this.c = userId;
        this.d = z;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5h)) {
            return false;
        }
        o5h o5hVar = (o5h) obj;
        return epx.f(this.b, o5hVar.b) && epx.f(this.c, o5hVar.c) && this.d == o5hVar.d && epx.f(this.e, o5hVar.e);
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d);
        xrh.c.b bVar = this.e;
        return b + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "CommunityInternalMenuItemModel(items=" + this.b + ", communityId=" + this.c + ", isAdmin=" + this.d + ", onboarding=" + this.e + ')';
    }
}
