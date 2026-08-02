package xsna;

import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AttachmentsContext.kt */
/* loaded from: classes4.dex */
public final class e84 {
    public final NewsEntry a;
    public final NewsEntry b;
    public final ArrayList c;
    public final xah0 d;
    public final String e;

    public e84(NewsEntry newsEntry, NewsEntry newsEntry2, ArrayList arrayList, xah0 xah0Var, String str) {
        this.a = newsEntry;
        this.b = newsEntry2;
        this.c = arrayList;
        this.d = xah0Var;
        this.e = str;
    }

    public final NewsEntry a() {
        return this.a;
    }

    public final NewsEntry b() {
        return this.b;
    }

    public final List<Attachment> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e84)) {
            return false;
        }
        e84 e84Var = (e84) obj;
        return epx.f(this.a, e84Var.a) && epx.f(this.b, e84Var.b) && this.c.equals(e84Var.c) && epx.f(this.d, e84Var.d) && epx.f(this.e, e84Var.e);
    }

    public final int hashCode() {
        int a = qr.a(this.c, e630.b(this.a.hashCode() * 31, 31, this.b), 31);
        xah0 xah0Var = this.d;
        int hashCode = (a + (xah0Var == null ? 0 : xah0Var.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachmentsContext(entry=");
        sb.append(this.a);
        sb.append(", rootEntry=");
        sb.append(this.b);
        sb.append(", thumbAttachments=");
        sb.append(this.c);
        sb.append(", screen=");
        sb.append(this.d);
        sb.append(", referer=");
        return ho8.a(sb, this.e, ')');
    }
}
