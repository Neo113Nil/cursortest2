package defpackage;

import java.io.Closeable;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class a931 implements Closeable, tse {
    public final fse a;

    public a931(fse fseVar) {
        this.a = fseVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a.e(this.a, null);
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.a;
    }
}
