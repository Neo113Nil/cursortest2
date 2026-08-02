package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import xsna.yo60;

/* compiled from: NewsfeedListEvent.kt */
/* loaded from: classes4.dex */
public final class gp60 implements yo60.c {
    public final NewsEntry a;
    public final int b;
    public final String c;

    public gp60(NewsEntry newsEntry, int i, String str) {
        this.a = newsEntry;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp60)) {
            return false;
        }
        gp60 gp60Var = (gp60) obj;
        return epx.f(this.a, gp60Var.a) && this.b == gp60Var.b && epx.f(this.c, gp60Var.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenReportScreen(item=");
        sb.append(this.a);
        sb.append(", listItemPosition=");
        sb.append(this.b);
        sb.append(", ref=");
        return ho8.a(sb, this.c, ')');
    }
}
