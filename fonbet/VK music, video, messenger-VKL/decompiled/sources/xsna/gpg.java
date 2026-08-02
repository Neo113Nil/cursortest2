package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import xsna.xrh;

/* compiled from: CommunityActionButtonsItemModel.kt */
/* loaded from: classes5.dex */
public final class gpg extends s4h {
    public final UserId b;
    public final ArrayList c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final xrh.d.a h;

    public gpg(UserId userId, ArrayList arrayList, int i, int i2, int i3, boolean z, xrh.d.a aVar) {
        this.b = userId;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.h = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpg)) {
            return false;
        }
        gpg gpgVar = (gpg) obj;
        return epx.f(this.b, gpgVar.b) && epx.f(this.c, gpgVar.c) && this.d == gpgVar.d && this.e == gpgVar.e && this.f == gpgVar.f && this.g == gpgVar.g && epx.f(this.h, gpgVar.h);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.f, shy.a(this.e, shy.a(this.d, qr.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31), 31), 31), 31, this.g);
        xrh.d.a aVar = this.h;
        return b + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "CommunityActionButtonsItemModel(communityId=" + this.b + ", buttons=" + this.c + ", friendStatus=" + this.d + ", groupType=" + this.e + ", groupAccess=" + this.f + ", currentUserIsAdmin=" + this.g + ", onboarding=" + this.h + ')';
    }
}
