package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class etz extends gtz {
    public final JSONObject a;

    public etz(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final JSONObject a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof etz) && this.a.equals(((etz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Embedded(json=" + this.a + ')';
    }
}
