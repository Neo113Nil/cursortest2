package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
public final class ot10 implements Closeable {
    public final boolean a;
    public final yp6 b = new yp6();
    public Inflater c;
    public usv w;

    public ot10(boolean z) {
        this.a = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        usv usvVar = this.w;
        if (usvVar != null) {
            usvVar.close();
        }
        this.w = null;
        this.c = null;
    }
}
