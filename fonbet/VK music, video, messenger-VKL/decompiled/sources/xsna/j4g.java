package xsna;

import com.vk.voip.ui.dumps.CollectDumpDuration;

/* compiled from: CollectDumpState.kt */
/* loaded from: classes7.dex */
public final class j4g {
    public final boolean a;
    public final boolean b;
    public final CollectDumpDuration c;
    public final boolean d;

    public j4g() {
        this(0);
    }

    public static j4g a(j4g j4gVar, boolean z, boolean z2, CollectDumpDuration collectDumpDuration, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = j4gVar.a;
        }
        if ((i & 2) != 0) {
            z2 = j4gVar.b;
        }
        if ((i & 4) != 0) {
            collectDumpDuration = j4gVar.c;
        }
        if ((i & 8) != 0) {
            z3 = j4gVar.d;
        }
        j4gVar.getClass();
        return new j4g(z, z2, collectDumpDuration, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4g)) {
            return false;
        }
        j4g j4gVar = (j4g) obj;
        return this.a == j4gVar.a && this.b == j4gVar.b && this.c == j4gVar.c && this.d == j4gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectDumpState(audio=");
        sb.append(this.a);
        sb.append(", video=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", isInProgress=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public j4g(boolean z, boolean z2, CollectDumpDuration collectDumpDuration, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = collectDumpDuration;
        this.d = z3;
    }

    public /* synthetic */ j4g(int i) {
        this(true, false, CollectDumpDuration.DURATION_30S, false);
    }
}
