package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dfs {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final int g;

    public dfs(int i, int i2, int i3, int i4, int i5, long j, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = j;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfs)) {
            return false;
        }
        dfs dfsVar = (dfs) obj;
        return this.a == dfsVar.a && this.b == dfsVar.b && this.c == dfsVar.c && this.d == dfsVar.d && this.e == dfsVar.e && this.f == dfsVar.f && this.g == dfsVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + qv10.c(oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "FrameRate(frameRate=", ", frameRateLite=", ", framesCount=");
        vfc.u(this.c, this.d, ", longFramesCount=", ", criticalFramesCount=", s);
        s.append(this.e);
        s.append(", longestFrameTime=");
        s.append(this.f);
        return b64.q(s, ", refreshRate=", this.g, Extension.C_BRAKE);
    }
}
