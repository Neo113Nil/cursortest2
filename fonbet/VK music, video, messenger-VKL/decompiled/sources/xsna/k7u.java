package xsna;

import com.vk.dto.common.Good;
import java.util.List;
import kotlin.Pair;

/* compiled from: GoodPreviewContent.kt */
/* loaded from: classes18.dex */
public final class k7u {
    public final Good a;
    public final List<Pair<String, String>> b;

    public k7u(Good good, List<Pair<String, String>> list) {
        this.a = good;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k7u.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k7u k7uVar = (k7u) obj;
        Good good = this.a;
        if (!good.c.equals(k7uVar.a.c)) {
            return false;
        }
        long j = good.b;
        Good good2 = k7uVar.a;
        return j == good2.b && good.J == good2.J;
    }

    public final int hashCode() {
        Good good = this.a;
        return Boolean.hashCode(good.J) + bh10.a(Long.hashCode(good.c.b) * 31, 31, good.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodPreviewWrapper(good=");
        sb.append(this.a);
        sb.append(", variants=");
        return ms9.a(')', sb, this.b);
    }
}
