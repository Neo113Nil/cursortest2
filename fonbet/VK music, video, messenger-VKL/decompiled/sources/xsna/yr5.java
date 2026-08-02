package xsna;

import com.vk.dto.common.Peer;
import java.util.List;

/* compiled from: AvatarProfile.kt */
/* loaded from: classes14.dex */
public final class yr5 {
    public final String a;
    public final List b;
    public final boolean c;
    public final Peer d;
    public final Integer e;

    public yr5(String str, List list, boolean z, Peer peer, Integer num) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = peer;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr5)) {
            return false;
        }
        yr5 yr5Var = (yr5) obj;
        return epx.f(this.a, yr5Var.a) && epx.f(this.b, yr5Var.b) && this.c == yr5Var.c && epx.f(this.d, yr5Var.d) && epx.f(this.e, yr5Var.e);
    }

    public final int hashCode() {
        int a = bh10.a(qoy.b(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d.b);
        Integer num = this.e;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarProfile(name=");
        sb.append(this.a);
        sb.append(", avatarImages=");
        mr.c(", isNft=", sb, this.b);
        sb.append(this.c);
        sb.append(", peer=");
        sb.append(this.d);
        sb.append(", forceBgColor=");
        return uqi.b(sb, this.e, ')');
    }
}
