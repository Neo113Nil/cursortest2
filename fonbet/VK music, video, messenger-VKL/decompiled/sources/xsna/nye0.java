package xsna;

import org.json.JSONObject;

/* compiled from: LpMsgParser.kt */
/* loaded from: classes2.dex */
public final class nye0 {
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final JSONObject f;
    public final JSONObject g;
    public final int h;
    public final int i;
    public final long j;

    public nye0(long j, int i, int i2, long j2, String str, JSONObject jSONObject, JSONObject jSONObject2, int i3, int i4, long j3) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = str;
        this.f = jSONObject;
        this.g = jSONObject2;
        this.h = i3;
        this.i = i4;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nye0)) {
            return false;
        }
        nye0 nye0Var = (nye0) obj;
        return this.a == nye0Var.a && this.b == nye0Var.b && this.c == nye0Var.c && this.d == nye0Var.d && epx.f(this.e, nye0Var.e) && epx.f(this.f, nye0Var.f) && epx.f(this.g, nye0Var.g) && this.h == nye0Var.h && this.i == nye0Var.i && this.j == nye0Var.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + shy.a(this.i, shy.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + urd0.a(bh10.a(shy.a(this.c, shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawMsgStruct(dialogId=");
        sb.append(this.a);
        sb.append(", msgVkId=");
        sb.append(this.b);
        sb.append(", flags=");
        sb.append(this.c);
        sb.append(", time=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", extra=");
        sb.append(this.f);
        sb.append(", cludges=");
        sb.append(this.g);
        sb.append(", randomId=");
        sb.append(this.h);
        sb.append(", cnvMsgId=");
        sb.append(this.i);
        sb.append(", editTime=");
        return vu5.a(')', this.j, sb);
    }
}
