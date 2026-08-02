package xsna;

import com.vk.superapp.api.dto.app.catalog.CustomItem;
import java.util.List;

/* compiled from: PageChunk.kt */
/* loaded from: classes6.dex */
public final class y890 {
    public final int a;
    public final List<CustomItem> b;

    public y890(int i, List<CustomItem> list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y890)) {
            return false;
        }
        y890 y890Var = (y890) obj;
        return this.a == y890Var.a && epx.f(this.b, y890Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageChunk(pageIndex=");
        sb.append(this.a);
        sb.append(", data=");
        return ms9.a(')', sb, this.b);
    }
}
