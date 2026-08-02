package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;

/* compiled from: ClipFeedListInfo.kt */
/* loaded from: classes17.dex */
public final class lyc {
    public final ClipFeedTab a;
    public final String b;

    public lyc(ClipFeedTab clipFeedTab, String str) {
        this.a = clipFeedTab;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyc)) {
            return false;
        }
        lyc lycVar = (lyc) obj;
        return epx.f(this.a, lycVar.a) && epx.f(this.b, lycVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipFeedListInfo(tabType=");
        sb.append(this.a);
        sb.append(", analyticRef=");
        return ho8.a(sb, this.b, ')');
    }
}
