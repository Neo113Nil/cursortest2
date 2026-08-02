package xsna;

import xsna.xzs;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes11.dex */
public final class ck<T extends xzs<? extends Boolean>> {
    public final String a;
    public final T b;

    public ck(String str, T t) {
        this.a = str;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return epx.f(this.a, ckVar.a) && epx.f(this.b, ckVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.b;
        return hashCode + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
