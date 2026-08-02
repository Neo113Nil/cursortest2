package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.components.msg_search.vc.RightAction;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class uwm0 implements i0b {
    public final long b;
    public final ImageList c;
    public final CharSequence d;
    public final RightAction e;
    public final boolean f;
    public final String g;
    public final CharSequence h;
    public final String i;
    public final int j;
    public final boolean k;

    public uwm0(long j, ImageList imageList, String str, boolean z, String str2, CharSequence charSequence, String str3, int i, boolean z2) {
        RightAction rightAction = RightAction.NONE;
        this.b = j;
        this.c = imageList;
        this.d = str;
        this.e = rightAction;
        this.f = z;
        this.g = str2;
        this.h = charSequence;
        this.i = str3;
        this.j = i;
        this.k = z2;
    }

    @Override // xsna.i0b
    public final RightAction K9() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwm0)) {
            return false;
        }
        uwm0 uwm0Var = (uwm0) obj;
        return this.b == uwm0Var.b && epx.f(this.c, uwm0Var.c) && epx.f(this.d, uwm0Var.d) && this.e == uwm0Var.e && this.f == uwm0Var.f && epx.f(this.g, uwm0Var.g) && epx.f(this.h, uwm0Var.h) && epx.f(this.i, uwm0Var.i) && this.j == uwm0Var.j && this.k == uwm0Var.k;
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
        return Boolean.hashCode(this.k) + shy.a(this.j, (this.i.hashCode() + u11.c((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.h)) * 31, 31);
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
        StringBuilder sb = new StringBuilder("SubscribedChannelItem(id=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append((Object) this.d);
        sb.append(", rightAction=");
        sb.append(this.e);
        sb.append(", verified=");
        sb.append(this.f);
        sb.append(", trackCode=");
        sb.append(this.g);
        sb.append(", body=");
        sb.append((Object) this.h);
        sb.append(", timeText=");
        sb.append((Object) this.i);
        sb.append(", unreadCount=");
        sb.append(this.j);
        sb.append(", muted=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
