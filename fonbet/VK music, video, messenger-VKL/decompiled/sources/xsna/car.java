package xsna;

import androidx.annotation.NonNull;
import java.io.File;

/* compiled from: FileResource.java */
/* loaded from: classes12.dex */
public final class car implements hag0<File> {
    public final File b;

    public car(File file) {
        nr2.r(file, "Argument must not be null");
        this.b = file;
    }

    @Override // xsna.hag0
    @NonNull
    public final Class<File> b() {
        return this.b.getClass();
    }

    @Override // xsna.hag0
    @NonNull
    public final File get() {
        return this.b;
    }

    @Override // xsna.hag0
    public final int getSize() {
        return 1;
    }

    @Override // xsna.hag0
    public final void a() {
    }
}
