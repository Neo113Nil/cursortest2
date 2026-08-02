package xsna;

import com.vk.dto.common.im.ImageList;

/* compiled from: RecommendedChannelItem.kt */
/* loaded from: classes16.dex */
public final class mcf0 implements hfz {
    public final long b;
    public final ImageList c;
    public final String d;
    public final CharSequence e;
    public final String f;

    public mcf0(long j, ImageList imageList, String str, CharSequence charSequence, String str2) {
        this.b = j;
        this.c = imageList;
        this.d = str;
        this.e = charSequence;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcf0)) {
            return false;
        }
        mcf0 mcf0Var = (mcf0) obj;
        return this.b == mcf0Var.b && this.c.equals(mcf0Var.c) && this.d.equals(mcf0Var.d) && epx.f(this.e, mcf0Var.e) && epx.f(this.f, mcf0Var.f);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        int c = u11.c((this.d.hashCode() + fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b)) * 31, 31, this.e);
        String str = this.f;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedChannelItem(id=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append((Object) this.d);
        sb.append(", body=");
        sb.append((Object) this.e);
        sb.append(", trackCode=");
        return ho8.a(sb, this.f, ')');
    }
}
