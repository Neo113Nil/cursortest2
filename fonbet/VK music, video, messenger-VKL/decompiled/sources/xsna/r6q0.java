package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.components.msg_search.vc.RightAction;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class r6q0 implements i0b {
    public final long b;
    public final ImageList c;
    public final CharSequence d;
    public final RightAction e;
    public final boolean f;
    public final String g;
    public final int h;
    public final VerifyInfo i;

    public r6q0(int i, long j, VerifyInfo verifyInfo, ImageList imageList, RightAction rightAction, String str, String str2, boolean z) {
        this.b = j;
        this.c = imageList;
        this.d = str;
        this.e = rightAction;
        this.f = z;
        this.g = str2;
        this.h = i;
        this.i = verifyInfo;
    }

    @Override // xsna.i0b
    public final RightAction K9() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6q0)) {
            return false;
        }
        r6q0 r6q0Var = (r6q0) obj;
        return this.b == r6q0Var.b && epx.f(this.c, r6q0Var.c) && epx.f(this.d, r6q0Var.d) && this.e == r6q0Var.e && this.f == r6q0Var.f && epx.f(this.g, r6q0Var.g) && this.h == r6q0Var.h && epx.f(this.i, r6q0Var.i);
    }

    @Override // xsna.i0b
    public final long getId() {
        return this.b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b);
    }

    @Override // xsna.i0b
    public final CharSequence getName() {
        return this.d;
    }

    public final int hashCode() {
        int b = qoy.b((this.e.hashCode() + u11.c(fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d)) * 31, 31, this.f);
        String str = this.g;
        return this.i.hashCode() + shy.a(this.h, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // xsna.i0b
    public final ImageList i() {
        return this.c;
    }

    @Override // xsna.i0b
    public final String r() {
        return this.g;
    }

    @Override // xsna.i0b
    public final boolean s6() {
        return this.f;
    }

    public final String toString() {
        return "UnsubscribedChannelItem(id=" + this.b + ", avatar=" + this.c + ", name=" + ((Object) this.d) + ", rightAction=" + this.e + ", verified=" + this.f + ", trackCode=" + this.g + ", subscribersCount=" + this.h + ", verifyInfo=" + this.i + ')';
    }
}
