package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AudioChunkMetric.kt */
/* loaded from: classes3.dex */
public final class am4 {
    public final int a;
    public final UserId b;
    public final String c;
    public String d = "fragment_loaded";
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i;

    public am4(int i, UserId userId, String str) {
        this.a = i;
        this.b = userId;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am4)) {
            return false;
        }
        am4 am4Var = (am4) obj;
        return this.a == am4Var.a && epx.f(this.b, am4Var.b) && epx.f(this.c, am4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioChunkMetric(audioId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", originalUrl=");
        return ho8.a(sb, this.c, ')');
    }
}
