package xsna;

import androidx.annotation.NonNull;
import java.util.List;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes.dex */
public final class ll5 extends j5k.e.d.a.b.AbstractC3100d {
    public final String a;
    public final int b;
    public final List<j5k.e.d.a.b.AbstractC3100d.AbstractC3101a> c;

    public ll5() {
        throw null;
    }

    public ll5(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3100d
    @NonNull
    public final List<j5k.e.d.a.b.AbstractC3100d.AbstractC3101a> a() {
        return this.c;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3100d
    public final int b() {
        return this.b;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3100d
    @NonNull
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.a.b.AbstractC3100d)) {
            return false;
        }
        j5k.e.d.a.b.AbstractC3100d abstractC3100d = (j5k.e.d.a.b.AbstractC3100d) obj;
        return this.a.equals(abstractC3100d.c()) && this.b == abstractC3100d.b() && this.c.equals(abstractC3100d.a());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        return vp.b("}", sb, this.c);
    }
}
