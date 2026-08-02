package xsna;

import java.util.HashMap;

/* compiled from: WebAuthAnswer.kt */
/* loaded from: classes6.dex */
public final class yfx0 {
    public final String a;
    public final HashMap b;

    public yfx0(String str, HashMap hashMap) {
        this.a = str;
        this.b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfx0)) {
            return false;
        }
        yfx0 yfx0Var = (yfx0) obj;
        return this.a.equals(yfx0Var.a) && this.b.equals(yfx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAuthAnswer(accessToken=" + this.a + ", allParams=" + this.b + ')';
    }
}
