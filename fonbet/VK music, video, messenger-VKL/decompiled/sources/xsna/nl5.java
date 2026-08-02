package xsna;

import androidx.annotation.NonNull;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* loaded from: classes.dex */
public final class nl5 extends j5k.e.d.a.c {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    public static final class a extends j5k.e.d.a.c.AbstractC3103a {
        public String a;
        public int b;
        public int c;
        public boolean d;
        public byte e;

        public final nl5 a() {
            String str;
            if (this.e == 7 && (str = this.a) != null) {
                return new nl5(str, this.b, this.c, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" processName");
            }
            if ((this.e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }
    }

    public nl5(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // xsna.j5k.e.d.a.c
    public final int a() {
        return this.c;
    }

    @Override // xsna.j5k.e.d.a.c
    public final int b() {
        return this.b;
    }

    @Override // xsna.j5k.e.d.a.c
    @NonNull
    public final String c() {
        return this.a;
    }

    @Override // xsna.j5k.e.d.a.c
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.a.c)) {
            return false;
        }
        j5k.e.d.a.c cVar = (j5k.e.d.a.c) obj;
        return this.a.equals(cVar.c()) && this.b == cVar.b() && this.c == cVar.a() && this.d == cVar.d();
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return n23.b(sb, this.d, "}");
    }
}
