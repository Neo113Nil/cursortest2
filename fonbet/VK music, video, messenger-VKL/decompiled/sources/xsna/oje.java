package xsna;

import org.json.JSONObject;

/* compiled from: ClipsLinkRefresherTokens.kt */
/* loaded from: classes16.dex */
public final class oje {
    public static final oje b = new oje(null);
    public final String a;

    /* compiled from: ClipsLinkRefresherTokens.kt */
    public static final class a {
        public static oje a(JSONObject jSONObject) {
            String optString = jSONObject.optString("feed_items_token", "");
            if (epx.f(optString, "")) {
                optString = null;
            }
            return new oje(optString);
        }
    }

    public oje(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oje) && epx.f(this.a, ((oje) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ClipsLinkRefresherTokens(feedItemsToken="), this.a, ')');
    }
}
