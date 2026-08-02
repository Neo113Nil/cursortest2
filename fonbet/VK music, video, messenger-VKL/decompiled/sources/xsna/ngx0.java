package xsna;

import java.util.ArrayList;

/* compiled from: WebGroupMessageStatus.kt */
/* loaded from: classes6.dex */
public final class ngx0 {
    public final boolean a;
    public final ArrayList b;

    public ngx0(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngx0)) {
            return false;
        }
        ngx0 ngx0Var = (ngx0) obj;
        return this.a == ngx0Var.a && this.b.equals(ngx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebGroupMessageStatus(isAllowed=");
        sb.append(this.a);
        sb.append(", intents=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
