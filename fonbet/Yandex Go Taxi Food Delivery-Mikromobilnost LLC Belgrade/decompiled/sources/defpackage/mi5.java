package defpackage;

import android.net.Uri;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mi5 {
    public final Uri a;
    public final Map b;
    public final long c;
    public final long d;

    public mi5(Uri uri, Map map, JSONObject jSONObject, long j, long j2) {
        this.a = uri;
        this.b = map;
        this.c = j;
        this.d = j2;
    }

    public final String toString() {
        return "BeaconItem{url=" + this.a + ", headers=" + this.b + ", addTimestamp=" + this.c;
    }
}
