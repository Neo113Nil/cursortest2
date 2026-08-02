package xsna;

import java.io.File;

/* compiled from: VideoReverter.kt */
/* loaded from: classes16.dex */
public final class tdt0 {
    public final File a;
    public final File b;
    public final File c;
    public final File d;

    public tdt0(File file, File file2, File file3, File file4) {
        this.a = file;
        this.b = file2;
        this.c = file3;
        this.d = file4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdt0)) {
            return false;
        }
        tdt0 tdt0Var = (tdt0) obj;
        return epx.f(this.a, tdt0Var.a) && epx.f(this.b, tdt0Var.b) && epx.f(this.c, tdt0Var.c) && epx.f(this.d, tdt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Config(inputFile=" + this.a + ", outputFile=" + this.b + ", tempZeroKeyFrameFile=" + this.c + ", tempReversedResultFile=" + this.d + ')';
    }
}
