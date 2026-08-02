package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class hu0 implements m0 {
    public final String a;
    public final List b;

    public hu0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu0)) {
            return false;
        }
        hu0 hu0Var = (hu0) obj;
        return epx.f(this.a, hu0Var.a) && epx.f(this.b, hu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackAction(actionType=" + this.a + ", items=" + this.b + ")";
    }
}
