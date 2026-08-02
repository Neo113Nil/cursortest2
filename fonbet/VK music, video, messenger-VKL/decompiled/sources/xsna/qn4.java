package xsna;

import java.io.File;

/* compiled from: AudioExtractorConfig.kt */
/* loaded from: classes3.dex */
public final class qn4 {
    public final File a;
    public final File b;
    public final long c;

    public qn4(File file, File file2, long j) {
        this.a = file;
        this.b = file2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn4)) {
            return false;
        }
        qn4 qn4Var = (qn4) obj;
        return epx.f(this.a, qn4Var.a) && epx.f(this.b, qn4Var.b) && this.c == qn4Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioExtractorConfig(inputFile=");
        sb.append(this.a);
        sb.append(", outputFile=");
        sb.append(this.b);
        sb.append(", duration=");
        return vu5.a(')', this.c, sb);
    }
}
