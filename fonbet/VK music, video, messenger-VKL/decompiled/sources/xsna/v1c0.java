package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.data.PostInteract;
import java.util.Objects;

/* compiled from: PostDisplayItemEntryContext.kt */
/* loaded from: classes4.dex */
public final class v1c0 {
    public final NewsEntry a;
    public final NewsEntry b;
    public final String c;
    public final String d;
    public final PostInteract e;
    public final boolean f;

    public v1c0(NewsEntry newsEntry, NewsEntry newsEntry2, String str, String str2, PostInteract postInteract, boolean z) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = str;
        this.d = str2;
        this.e = postInteract;
        this.f = z;
    }

    public final NewsEntry a() {
        return this.a;
    }

    public final boolean b() {
        return this.f;
    }

    public final NewsEntry c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v1c0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        v1c0 v1c0Var = (v1c0) obj;
        return Objects.equals(this.a, v1c0Var.a) && Objects.equals(this.b, v1c0Var.b) && Objects.equals(this.c, v1c0Var.c) && Objects.equals(this.d, v1c0Var.d) && Boolean.valueOf(this.f).equals(Boolean.valueOf(v1c0Var.f));
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Boolean.valueOf(this.f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostDisplayItemEntryContext(entry=");
        sb.append(this.a);
        sb.append(", rootEntry=");
        sb.append(this.b);
        sb.append(", ref=");
        sb.append(this.c);
        sb.append(", listRef=");
        sb.append(this.d);
        sb.append(", postInteract=");
        sb.append(this.e);
        sb.append(", fromList=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
