package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.messages.MsgFromChannel;

/* compiled from: RecommendedChannel.kt */
/* loaded from: classes16.dex */
public final class dcf0 implements btx0 {
    public final long b;
    public final ImageList c;
    public final String d;
    public final int e;
    public final boolean f;
    public final MsgFromChannel g;
    public final String h;

    public dcf0(long j, ImageList imageList, String str, int i, boolean z, MsgFromChannel msgFromChannel, String str2) {
        this.b = j;
        this.c = imageList;
        this.d = str;
        this.e = i;
        this.f = z;
        this.g = msgFromChannel;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcf0)) {
            return false;
        }
        dcf0 dcf0Var = (dcf0) obj;
        return this.b == dcf0Var.b && this.c.equals(dcf0Var.c) && this.d.equals(dcf0Var.d) && this.e == dcf0Var.e && this.f == dcf0Var.f && epx.f(this.g, dcf0Var.g) && epx.f(this.h, dcf0Var.h);
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.e, (this.d.hashCode() + fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b)) * 31, 31), 31, this.f);
        MsgFromChannel msgFromChannel = this.g;
        int hashCode = (b + (msgFromChannel == null ? 0 : msgFromChannel.hashCode())) * 31;
        String str = this.h;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedChannel(id=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append((Object) this.d);
        sb.append(", subscribersCount=");
        sb.append(this.e);
        sb.append(", isVerified=");
        sb.append(this.f);
        sb.append(", latestMsg=");
        sb.append(this.g);
        sb.append(", trackCode=");
        return ho8.a(sb, this.h, ')');
    }
}
