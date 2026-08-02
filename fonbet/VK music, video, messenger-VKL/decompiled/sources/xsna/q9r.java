package xsna;

import java.io.File;
import java.util.List;

/* compiled from: FilePathComponents.kt */
/* loaded from: classes8.dex */
public final class q9r {
    public final File a;
    public final List<File> b;

    /* JADX WARN: Multi-variable type inference failed */
    public q9r(File file, List<? extends File> list) {
        this.a = file;
        this.b = list;
    }

    public final File a() {
        return this.a;
    }

    public final List<File> b() {
        return this.b;
    }

    public final int c() {
        return this.b.size();
    }

    public final File d(int i) {
        if (i >= 0) {
            List<File> list = this.b;
            if (i <= list.size()) {
                return new File(j5g.g0(list.subList(0, i), File.separator, null, null, 0, null, 62));
            }
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9r)) {
            return false;
        }
        q9r q9rVar = (q9r) obj;
        return epx.f(this.a, q9rVar.a) && epx.f(this.b, q9rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.a);
        sb.append(", segments=");
        return ms9.a(')', sb, this.b);
    }
}
