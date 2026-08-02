package xsna;

import java.io.File;
import java.util.List;

/* compiled from: Config.kt */
/* loaded from: classes8.dex */
public final class dxi {
    public final File a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final List<Long> f;

    public dxi(File file, String str, boolean z, long j, long j2, List<Long> list) {
        this.a = file;
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxi)) {
            return false;
        }
        dxi dxiVar = (dxi) obj;
        return epx.f(this.a, dxiVar.a) && epx.f(this.b, dxiVar.b) && this.c == dxiVar.c && this.d == dxiVar.d && this.e == dxiVar.e && epx.f(this.f, dxiVar.f);
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        List<Long> list = this.f;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(filesDir=");
        sb.append(this.a);
        sb.append(", product=");
        sb.append(this.b);
        sb.append(", forceSend=");
        sb.append(this.c);
        sb.append(", telemetryInterval=");
        sb.append(this.d);
        tj0.d(sb, ", heartBeatInterval=", this.e, ", watchedNTimePoints=");
        return vp.b(")", sb, this.f);
    }
}
