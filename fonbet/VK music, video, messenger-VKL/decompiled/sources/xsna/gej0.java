package xsna;

import com.vk.dto.common.actions.Action;

/* compiled from: ShopConditionParams.kt */
/* loaded from: classes18.dex */
public final class gej0 {
    public final String a;
    public final Action b;
    public final boolean c;

    public gej0(String str, Action action, boolean z) {
        this.a = str;
        this.b = action;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gej0)) {
            return false;
        }
        gej0 gej0Var = (gej0) obj;
        return epx.f(this.a, gej0Var.a) && epx.f(this.b, gej0Var.b) && this.c == gej0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShopConditionButton(title=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", isEditable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
