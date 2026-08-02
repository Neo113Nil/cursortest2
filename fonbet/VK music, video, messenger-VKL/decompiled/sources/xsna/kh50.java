package xsna;

import android.graphics.Rect;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: MutablePostsSnapshot.kt */
/* loaded from: classes14.dex */
public final class kh50 implements x6c0 {
    public final NewsEntry a;
    public final int b;
    public final int c;
    public final int d;
    public boolean e;
    public final jh50 f = new jh50();
    public final bpn0 g = new bpn0(new x750(this, 1));
    public final Rect h = new Rect();
    public int i;
    public int j;

    public kh50(NewsEntry newsEntry, int i, int i2, int i3) {
        this.a = newsEntry;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // xsna.x6c0
    public final int a() {
        return this.d;
    }

    @Override // xsna.x6c0
    public final NewsEntry b() {
        return this.a;
    }

    @Override // xsna.x6c0
    public final Rect c() {
        return this.h;
    }

    @Override // xsna.x6c0
    public final int d() {
        return this.i;
    }

    @Override // xsna.x6c0
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh50)) {
            return false;
        }
        kh50 kh50Var = (kh50) obj;
        return epx.f(this.a, kh50Var.a) && this.b == kh50Var.b && this.c == kh50Var.c && this.d == kh50Var.d;
    }

    @Override // xsna.x6c0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final SortedSet<gi50> f() {
        return (SortedSet) this.g.getValue();
    }

    @Override // xsna.x6c0
    public final int getFullHeight() {
        Iterator<T> it = f().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((gi50) it.next()).e;
        }
        int max = Math.max(this.j, i);
        this.j = max;
        return max;
    }

    @Override // xsna.x6c0
    public final int getPosition() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutablePostProjection(post=");
        sb.append(this.a);
        sb.append(", adsHash=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", blockCount=");
        return vu5.b(sb, this.d, ')');
    }
}
