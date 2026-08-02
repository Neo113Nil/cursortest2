package xsna;

import org.json.JSONObject;

/* compiled from: ChannelWSMessageEvent.kt */
/* loaded from: classes2.dex */
public final class zdb extends sxp {
    public final boolean b;
    public final JSONObject c;

    public zdb(JSONObject jSONObject, boolean z) {
        this.b = z;
        this.c = jSONObject;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdb)) {
            return false;
        }
        zdb zdbVar = (zdb) obj;
        return this.b == zdbVar.b && epx.f(this.c, zdbVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31;
    }

    public final String toString() {
        return "ChannelWSMessageEvent(isIncoming=" + this.b + ", json=" + this.c + ", changerTag=null)";
    }
}
