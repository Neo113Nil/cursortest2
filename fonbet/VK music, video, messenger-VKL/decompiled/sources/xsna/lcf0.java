package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.components.msg_search.vc.RightAction;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class lcf0 implements i0b {
    public final long b;
    public final ImageList c;
    public final String d;
    public final int e;
    public final VerifyInfo f;
    public final boolean g;
    public final RightAction h;
    public final String i;

    public lcf0(int i, long j, VerifyInfo verifyInfo, ImageList imageList, RightAction rightAction, String str, String str2, boolean z) {
        this.b = j;
        this.c = imageList;
        this.d = str;
        this.e = i;
        this.f = verifyInfo;
        this.g = z;
        this.h = rightAction;
        this.i = str2;
    }

    @Override // xsna.i0b
    public final RightAction K9() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcf0)) {
            return false;
        }
        lcf0 lcf0Var = (lcf0) obj;
        return this.b == lcf0Var.b && this.c.equals(lcf0Var.c) && this.d.equals(lcf0Var.d) && this.e == lcf0Var.e && this.f.equals(lcf0Var.f) && this.g == lcf0Var.g && this.h == lcf0Var.h && epx.f(this.i, lcf0Var.i);
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
        int hashCode = (this.h.hashCode() + qoy.b((this.f.hashCode() + shy.a(this.e, (this.d.hashCode() + fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b)) * 31, 31)) * 31, 31, this.g)) * 31;
        String str = this.i;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // xsna.i0b
    public final ImageList i() {
        return this.c;
    }

    @Override // xsna.i0b
    public final String r() {
        return this.i;
    }

    @Override // xsna.i0b
    public final boolean s6() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedChannelItem(id=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append((Object) this.d);
        sb.append(", subscribersCount=");
        sb.append(this.e);
        sb.append(", verifyInfo=");
        sb.append(this.f);
        sb.append(", verified=");
        sb.append(this.g);
        sb.append(", rightAction=");
        sb.append(this.h);
        sb.append(", trackCode=");
        return ho8.a(sb, this.i, ')');
    }
}
