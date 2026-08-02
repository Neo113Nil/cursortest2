package xsna;

import xsna.jio0;

/* compiled from: FontData.kt */
/* loaded from: classes4.dex */
public final class t4s {
    public final jio0.a a;
    public final float b;

    public t4s(jio0.a aVar, float f) {
        this.a = aVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4s)) {
            return false;
        }
        t4s t4sVar = (t4s) obj;
        return epx.f(this.a, t4sVar.a) && Float.compare(this.b, t4sVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FontData(fontInfo=" + this.a + ", size=" + this.b + ")";
    }
}
