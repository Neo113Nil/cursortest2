package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;

/* compiled from: VoipCallByLinkGroup.kt */
/* loaded from: classes7.dex */
public final class cgw0 {
    public final UserId a;
    public final String b;
    public final ImageList c;
    public final boolean d;

    public cgw0(UserId userId, String str, ImageList imageList, boolean z) {
        this.a = userId;
        this.b = str;
        this.c = imageList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgw0)) {
            return false;
        }
        cgw0 cgw0Var = (cgw0) obj;
        return epx.f(this.a, cgw0Var.a) && epx.f(this.b, cgw0Var.b) && epx.f(this.c, cgw0Var.c) && this.d == cgw0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fw3.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipCallByLinkGroup(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", imageIsNft=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
