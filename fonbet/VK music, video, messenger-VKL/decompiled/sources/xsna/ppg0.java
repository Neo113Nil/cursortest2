package xsna;

import java.util.LinkedHashMap;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class ppg0 extends b7r {
    public final String a;
    public final boolean b;
    public final LinkedHashMap<String, b7r> c;

    public ppg0(String str, LinkedHashMap linkedHashMap, boolean z) {
        this.a = str;
        this.b = z;
        this.c = linkedHashMap;
    }

    @Override // xsna.b7r
    public final boolean b() {
        return this.b;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppg0)) {
            return false;
        }
        ppg0 ppg0Var = (ppg0) obj;
        return epx.f(this.a, ppg0Var.a) && this.b == ppg0Var.b && epx.f(this.c, ppg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RowField(id=" + this.a + ", affectsPrice=" + this.b + ", fields=" + this.c + ')';
    }
}
