package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import java.util.List;

/* compiled from: VoipVideoToWatch.kt */
/* loaded from: classes7.dex */
public final class p3x0 {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final UserId e;
    public final String f;
    public final long g;
    public final List<Image> h;
    public final String i;

    public p3x0() {
        throw null;
    }

    public p3x0(long j, int i, String str, String str2, UserId userId, String str3, long j2, List list, String str4) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = userId;
        this.f = str3;
        this.g = j2;
        this.h = list;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p3x0) {
            p3x0 p3x0Var = (p3x0) obj;
            if (this.a == p3x0Var.a && this.b == p3x0Var.b && epx.f(this.c, p3x0Var.c) && epx.f(this.d, p3x0Var.d) && epx.f(this.e, p3x0Var.e) && epx.f(this.f, p3x0Var.f) && this.g == p3x0Var.g && epx.f(this.h, p3x0Var.h) && epx.f(this.i, p3x0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        int a2 = bh10.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.e.b);
        String str2 = this.f;
        int a3 = fw3.a(bh10.a((a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g), 31, this.h);
        String str3 = this.i;
        return a3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipVideoToWatch(oneVideoId=");
        sb.append((Object) hl80.a(this.a));
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", authorName=");
        sb.append(this.f);
        sb.append(", duration=");
        sb.append((Object) ("VideoDuration(value=" + this.g + ')'));
        sb.append(", images=");
        sb.append(this.h);
        sb.append(", imgUrl=");
        return ho8.a(sb, this.i, ')');
    }
}
