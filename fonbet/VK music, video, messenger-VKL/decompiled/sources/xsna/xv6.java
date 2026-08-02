package xsna;

import android.net.Uri;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: BeaconItem.kt */
/* loaded from: classes7.dex */
public abstract class xv6 {
    public final Uri a;
    public final Map<String, String> b;
    public final long c;

    public xv6(Uri uri, Map<String, String> map, JSONObject jSONObject, long j) {
        this.a = uri;
        this.b = map;
        this.c = j;
    }

    public abstract a a();

    public final String toString() {
        return "BeaconItem{url=" + this.a + ", headers=" + this.b + ", addTimestamp=" + this.c;
    }

    /* compiled from: BeaconItem.kt */
    public static final class a extends xv6 {
        public final long d;

        public a(Uri uri, Map<String, String> map, JSONObject jSONObject, long j, long j2) {
            super(uri, map, jSONObject, j);
            this.d = j2;
        }

        @Override // xsna.xv6
        public final a a() {
            return this;
        }
    }
}
