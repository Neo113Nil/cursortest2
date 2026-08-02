package xsna;

import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import java.util.List;
import java.util.Map;

/* compiled from: AdsAnalyticsAction.kt */
/* loaded from: classes17.dex */
public final class zt0 {
    public final String a;
    public final Map<AdStatPixel.Type, List<AdStatPixel>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public zt0(String str, Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt0)) {
            return false;
        }
        zt0 zt0Var = (zt0) obj;
        return epx.f(this.a, zt0Var.a) && epx.f(this.b, zt0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<AdStatPixel.Type, List<AdStatPixel>> map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsAnalyticsActionModel(trackCode=");
        sb.append(this.a);
        sb.append(", pixels=");
        return cjl0.a(sb, this.b, ')');
    }
}
