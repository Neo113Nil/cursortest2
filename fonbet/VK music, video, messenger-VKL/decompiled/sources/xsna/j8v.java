package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithId;

/* compiled from: HistoryClip.kt */
/* loaded from: classes2.dex */
public final class j8v {
    public final int a;
    public final long b;
    public final AttachWithId c;
    public final long d;
    public final int e;
    public final boolean f;
    public final int g;

    public j8v(int i, long j, AttachWithId attachWithId, long j2, int i2, boolean z, int i3) {
        this.a = i;
        this.b = j;
        this.c = attachWithId;
        this.d = j2;
        this.e = i2;
        this.f = z;
        this.g = i3;
    }

    public final Attach a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8v)) {
            return false;
        }
        j8v j8vVar = (j8v) obj;
        return this.a == j8vVar.a && this.b == j8vVar.b && this.c.equals(j8vVar.c) && this.d == j8vVar.d && this.e == j8vVar.e && this.f == j8vVar.f && this.g == j8vVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + qoy.b(shy.a(this.e, bh10.a((this.c.hashCode() + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryClip(cnvMsgId=");
        sb.append(this.a);
        sb.append(", fromId=");
        sb.append(this.b);
        sb.append(", attach=");
        sb.append(this.c);
        sb.append(", date=");
        sb.append(this.d);
        sb.append(", msgId=");
        sb.append(this.e);
        sb.append(", wasPlayed=");
        sb.append(this.f);
        sb.append(", position=");
        return vu5.b(sb, this.g, ')');
    }
}
