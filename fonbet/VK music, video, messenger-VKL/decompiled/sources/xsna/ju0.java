package xsna;

import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import java.util.List;
import java.util.Map;

/* compiled from: SdkAdsViewerClick.kt */
/* loaded from: classes17.dex */
public final class ju0 {
    public final String a;
    public final Map<AdStatPixel.Type, List<AdStatPixel>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ju0(String str, Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju0)) {
            return false;
        }
        ju0 ju0Var = (ju0) obj;
        return epx.f(this.a, ju0Var.a) && epx.f(this.b, ju0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<AdStatPixel.Type, List<AdStatPixel>> map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsAnalyticsModel(trackCode=");
        sb.append(this.a);
        sb.append(", pixels=");
        return cjl0.a(sb, this.b, ')');
    }
}
