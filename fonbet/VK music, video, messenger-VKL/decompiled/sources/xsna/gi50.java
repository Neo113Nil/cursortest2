package xsna;

import android.graphics.Rect;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: MutablePostsSnapshot.kt */
/* loaded from: classes14.dex */
public final class gi50 implements x5u0 {
    public int a;
    public final NewsEntry b;
    public Rect c;
    public u1c0 d;
    public final int e;

    public gi50(int i, NewsEntry newsEntry, Rect rect, u1c0 u1c0Var, int i2) {
        this.a = i;
        this.b = newsEntry;
        this.c = rect;
        this.d = u1c0Var;
        this.e = i2;
    }

    @Override // xsna.x5u0
    public final u1c0 J0() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi50)) {
            return false;
        }
        gi50 gi50Var = (gi50) obj;
        return this.a == gi50Var.a && epx.f(this.b, gi50Var.b) && epx.f(this.c, gi50Var.c) && epx.f(this.d, gi50Var.d) && this.e == gi50Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + e630.b(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableVisualBlock(position=");
        sb.append(this.a);
        sb.append(", post=");
        sb.append(this.b);
        sb.append(", visibilityRect=");
        sb.append(this.c);
        sb.append(", postDisplayItem=");
        sb.append(this.d);
        sb.append(", height=");
        return vu5.b(sb, this.e, ')');
    }
}
