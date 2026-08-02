package xsna;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileBinaryResource.kt */
/* loaded from: classes12.dex */
public final class x7r implements t27 {
    public final File b;

    /* compiled from: FileBinaryResource.kt */
    public static final class a {
        public static x7r a(File file) {
            return new x7r(file);
        }
    }

    public x7r(File file) {
        this.b = file;
    }

    public final File a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x7r)) {
            return false;
        }
        return epx.f(this.b, ((x7r) obj).b);
    }

    @Override // xsna.t27
    public final InputStream f() throws IOException {
        return new FileInputStream(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.t27
    public final long size() {
        return this.b.length();
    }
}
