package defpackage;

import com.google.android.gms.internal.play_billing.m;

/* loaded from: classes11.dex */
public final class d2a1 {
    public final Object a;
    public final int b;

    public d2a1(m mVar, int i) {
        this.a = mVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d2a1)) {
            return false;
        }
        d2a1 d2a1Var = (d2a1) obj;
        return this.a == d2a1Var.a && this.b == d2a1Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
