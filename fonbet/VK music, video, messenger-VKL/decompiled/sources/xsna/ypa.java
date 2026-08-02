package xsna;

import android.graphics.Path;

/* compiled from: CenterGuidesPathData.kt */
/* loaded from: classes16.dex */
public final class ypa {
    public final Path a;
    public final Path b;
    public final Path c;
    public final Path d;

    public ypa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypa)) {
            return false;
        }
        ypa ypaVar = (ypa) obj;
        return epx.f(this.a, ypaVar.a) && epx.f(this.b, ypaVar.b) && epx.f(this.c, ypaVar.c) && epx.f(this.d, ypaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CenterGuidesPathData(pathToTop=" + this.a + ", pathToBottom=" + this.b + ", pathToLeft=" + this.c + ", pathToRight=" + this.d + ')';
    }

    public ypa(int i) {
        Path path = new Path();
        Path path2 = new Path();
        Path path3 = new Path();
        Path path4 = new Path();
        this.a = path;
        this.b = path2;
        this.c = path3;
        this.d = path4;
    }
}
