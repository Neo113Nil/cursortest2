package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;

/* compiled from: ClipsFeedFeatureConfig.kt */
/* loaded from: classes17.dex */
public final class v6e {
    public final kwc a;
    public final ClipFeedTab b;

    public v6e(kwc kwcVar, ClipFeedTab clipFeedTab) {
        this.a = kwcVar;
        this.b = clipFeedTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6e)) {
            return false;
        }
        v6e v6eVar = (v6e) obj;
        return epx.f(this.a, v6eVar.a) && epx.f(this.b, v6eVar.b);
    }

    public final int hashCode() {
        kwc kwcVar = this.a;
        return (this.b.hashCode() + ((kwcVar == null ? 0 : kwcVar.hashCode()) * 31)) * 31;
    }

    public final String toString() {
        return "ClipsFeedFeatureConfig(initialData=" + this.a + ", tab=" + this.b + ", loadData=null)";
    }
}
