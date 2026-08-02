package xsna;

import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: VkStatEvent.kt */
/* loaded from: classes11.dex */
public final class qrk0 extends agr0 {
    public final SchemeStat$TypeDevNullItem a;
    public final boolean b;

    public qrk0(SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem, boolean z) {
        this.a = schemeStat$TypeDevNullItem;
        this.b = z;
    }

    @Override // xsna.rrk0
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrk0)) {
            return false;
        }
        qrk0 qrk0Var = (qrk0) obj;
        return epx.f(this.a, qrk0Var.a) && this.b == qrk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatDevNullEvent(event=");
        sb.append(this.a);
        sb.append(", storeImmediately=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
