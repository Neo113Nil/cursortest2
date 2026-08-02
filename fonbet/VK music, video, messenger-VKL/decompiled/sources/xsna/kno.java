package xsna;

import java.io.File;
import xsna.bi9;

/* compiled from: DuetEffectInfo.kt */
/* loaded from: classes3.dex */
public final class kno {
    public final File a;
    public final boolean b;
    public final int c;
    public final int d;
    public final gzs<s3q0> e;

    public kno(File file, boolean z, int i, int i2, bi9.b bVar) {
        this.a = file;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kno)) {
            return false;
        }
        kno knoVar = (kno) obj;
        return epx.f(this.a, knoVar.a) && this.b == knoVar.b && this.c == knoVar.c && this.d == knoVar.d && epx.f(this.e, knoVar.e);
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31), 31);
        gzs<s3q0> gzsVar = this.e;
        return a + (gzsVar == null ? 0 : gzsVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuetEffectInfo(duetFile=");
        sb.append(this.a);
        sb.append(", isAudioRestricted=");
        sb.append(this.b);
        sb.append(", videoWidth=");
        sb.append(this.c);
        sb.append(", videoHeight=");
        sb.append(this.d);
        sb.append(", firstFrameCallback=");
        return uf3.d(sb, this.e, ')');
    }
}
