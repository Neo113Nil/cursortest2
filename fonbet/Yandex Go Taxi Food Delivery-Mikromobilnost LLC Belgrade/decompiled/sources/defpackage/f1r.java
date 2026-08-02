package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class f1r implements wbi0 {
    public final File a;
    public final btq0 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public f1r(File file, btq0 btq0Var) {
        this.a = file;
        this.b = btq0Var;
    }

    @Override // defpackage.j5c
    public final void close() {
        this.c.set(true);
    }
}
