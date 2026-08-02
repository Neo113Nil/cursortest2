package xsna;

import com.vk.antispam.SpamAction;

/* compiled from: SpamActionState.kt */
/* loaded from: classes14.dex */
public final class lhk0 {
    public final SpamAction a;
    public final boolean b;

    public lhk0(SpamAction spamAction, boolean z) {
        this.a = spamAction;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhk0)) {
            return false;
        }
        lhk0 lhk0Var = (lhk0) obj;
        return epx.f(this.a, lhk0Var.a) && this.b == lhk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpamActionState(action=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
