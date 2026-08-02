package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;

/* compiled from: SakStatEvent.kt */
/* loaded from: classes11.dex */
public final class e0h0 implements rrk0 {
    public final SchemeStatSak$EventScreen a;
    public final SchemeStatSak$TypeAction b;
    public final boolean c;

    public e0h0(SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$TypeAction schemeStatSak$TypeAction, boolean z) {
        this.a = schemeStatSak$EventScreen;
        this.b = schemeStatSak$TypeAction;
        this.c = z;
    }

    @Override // xsna.rrk0
    public final boolean a() {
        return this.c;
    }

    @Override // xsna.rrk0
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0h0)) {
            return false;
        }
        e0h0 e0h0Var = (e0h0) obj;
        return this.a == e0h0Var.a && this.b.equals(e0h0Var.b) && this.c == e0h0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SakStatEvent(screen=");
        sb.append(this.a);
        sb.append(", event=");
        sb.append(this.b);
        sb.append(", storeImmediately=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
