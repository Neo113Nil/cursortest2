package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.List;

/* compiled from: ClipsWrapperTabsState.kt */
/* loaded from: classes17.dex */
public final class duf {
    public final List<ClipFeedTab> a;
    public final int b;

    public duf() {
        this(0);
    }

    public final List<ClipFeedTab> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duf)) {
            return false;
        }
        duf dufVar = (duf) obj;
        return epx.f(this.a, dufVar.a) && this.b == dufVar.b;
    }

    public final int hashCode() {
        List<ClipFeedTab> list = this.a;
        return Integer.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsWrapperTabsState(tabs=");
        sb.append(this.a);
        sb.append(", activeTabIndex=");
        return vu5.b(sb, this.b, ')');
    }

    public /* synthetic */ duf(int i) {
        this(null, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public duf(List<? extends ClipFeedTab> list, int i) {
        this.a = list;
        this.b = i;
    }
}
