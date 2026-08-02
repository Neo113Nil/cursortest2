package ru.ok.android.webrtc.stat.call.methods.call_stat;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class FilteredStatMap {
    public final Map a;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredStatMap() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> getStatMap() {
        return this.a;
    }

    public final void putIfNotZero(String str, Long l) {
        if (l == null || l.longValue() == 0) {
            return;
        }
        this.a.put(str, String.valueOf(l.longValue()));
    }

    public final void set(String str, String str2) {
        if (str2 == null) {
            return;
        }
        this.a.put(str, str2);
    }

    public FilteredStatMap(Map<String, String> map) {
        this.a = map;
    }

    public final void set(String str, Long l) {
        if (l == null) {
            return;
        }
        this.a.put(str, String.valueOf(l.longValue()));
    }

    public final void putIfNotZero(String str, Integer num) {
        if (num == null || num.intValue() == 0) {
            return;
        }
        this.a.put(str, String.valueOf(num.intValue()));
    }

    public final void set(String str, Integer num) {
        if (num == null) {
            return;
        }
        this.a.put(str, String.valueOf(num.intValue()));
    }

    public /* synthetic */ FilteredStatMap(Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? new HashMap() : map);
    }

    public final void set(String str, Float f) {
        if (f == null) {
            return;
        }
        this.a.put(str, String.valueOf(f.floatValue()));
    }

    public final void putIfNotZero(String str, Double d) {
        if (d == null || epx.b(d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
            return;
        }
        this.a.put(str, String.valueOf(d.doubleValue()));
    }

    public final void set(String str, Double d) {
        if (d == null) {
            return;
        }
        this.a.put(str, String.valueOf(d.doubleValue()));
    }

    public final void putIfNotZero(String str, Float f) {
        if (f == null || epx.d(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return;
        }
        this.a.put(str, String.valueOf(f.floatValue()));
    }
}
