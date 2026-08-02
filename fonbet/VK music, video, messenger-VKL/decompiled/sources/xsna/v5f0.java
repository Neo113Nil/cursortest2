package xsna;

import android.view.View;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: ReactionsOnClickParams.kt */
/* loaded from: classes5.dex */
public final class v5f0 {
    public final View a;
    public final p2f0 b;
    public final c6z c;
    public final Object d;
    public final String e;
    public final String f;

    public v5f0(View view, p2f0 p2f0Var, c6z c6zVar, NewsEntry newsEntry, String str, String str2) {
        this.a = view;
        this.b = p2f0Var;
        this.c = c6zVar;
        this.d = newsEntry;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5f0)) {
            return false;
        }
        v5f0 v5f0Var = (v5f0) obj;
        return epx.f(this.a, v5f0Var.a) && epx.f(this.b, v5f0Var.b) && this.c.equals(v5f0Var.c) && epx.f(this.d, v5f0Var.d) && epx.f(this.e, v5f0Var.e) && epx.f(this.f, v5f0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Object obj = this.d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.e;
        int b = qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, true);
        String str2 = this.f;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsOnClickParams(view=");
        sb.append(this.a);
        sb.append(", viewHolder=");
        sb.append(this.b);
        sb.append(", item=");
        sb.append(this.c);
        sb.append(", rootEntry=");
        sb.append(this.d);
        sb.append(", ref=");
        sb.append(this.e);
        sb.append(", isReactionsAvailable=true, actionTrigger=");
        return ho8.a(sb, this.f, ')');
    }
}
