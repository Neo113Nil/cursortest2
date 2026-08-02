package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;

/* compiled from: RecommendedChannelVkMeItem.kt */
/* loaded from: classes16.dex */
public final class pcf0 implements hfz {
    public final long b;
    public final ImageList c;
    public final String d;
    public final int e;
    public final VerifyInfo f;

    public pcf0(long j, ImageList imageList, String str, int i, VerifyInfo verifyInfo) {
        this.b = j;
        this.c = imageList;
        this.d = str;
        this.e = i;
        this.f = verifyInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcf0)) {
            return false;
        }
        pcf0 pcf0Var = (pcf0) obj;
        return this.b == pcf0Var.b && this.c.equals(pcf0Var.c) && this.d.equals(pcf0Var.d) && this.e == pcf0Var.e && this.f.equals(pcf0Var.f);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        return this.f.hashCode() + shy.a(this.e, (this.d.hashCode() + fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b)) * 31, 31);
    }

    public final String toString() {
        return "RecommendedChannelVkMeItem(id=" + this.b + ", avatar=" + this.c + ", name=" + ((Object) this.d) + ", subscribersCount=" + this.e + ", verifyInfo=" + this.f + ')';
    }
}
