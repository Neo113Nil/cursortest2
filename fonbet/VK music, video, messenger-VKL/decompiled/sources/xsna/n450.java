package xsna;

import org.json.JSONObject;

/* compiled from: MusicRestrictedEvent.kt */
/* loaded from: classes.dex */
public final class n450 implements yj40 {
    public final String a;
    public final String b;

    /* compiled from: JsonParser.kt */
    /* loaded from: classes3.dex */
    public static final class a extends aay<n450> {
        @Override // xsna.aay
        public final n450 a(JSONObject jSONObject) {
            return new n450(jSONObject);
        }
    }

    static {
        new a();
    }

    public n450(JSONObject jSONObject) {
        String string = jSONObject.getString("uuid");
        String string2 = jSONObject.getString("device_name");
        this.a = string;
        this.b = string2;
    }

    @Override // xsna.yj40
    public final String a() {
        return "uuid=" + this.a + " deviceName=" + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n450)) {
            return false;
        }
        n450 n450Var = (n450) obj;
        return epx.f(this.a, n450Var.a) && epx.f(this.b, n450Var.b);
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicRestrictedEvent";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicRestrictedEvent(uuid=");
        sb.append(this.a);
        sb.append(", deviceName=");
        return ho8.a(sb, this.b, ')');
    }
}
