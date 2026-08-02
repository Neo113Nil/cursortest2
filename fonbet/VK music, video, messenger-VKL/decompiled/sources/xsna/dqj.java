package xsna;

import com.vk.fullscreenvideo.a;

/* compiled from: ControlIcon.kt */
/* loaded from: classes16.dex */
public final class dqj {
    public final lg90 a;
    public final long b;
    public final a.d c;

    public dqj(lg90 lg90Var, long j, a.d dVar) {
        this.a = lg90Var;
        this.b = j;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqj)) {
            return false;
        }
        dqj dqjVar = (dqj) obj;
        return epx.f(this.a, dqjVar.a) && l5g.d(this.b, dqjVar.b) && epx.f(this.c, dqjVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = l5g.l;
        return this.c.hashCode() + bh10.a(hashCode, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlIcon(painter=");
        sb.append(this.a);
        sb.append(", tint=");
        dn.h(this.b, ", action=", sb);
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
