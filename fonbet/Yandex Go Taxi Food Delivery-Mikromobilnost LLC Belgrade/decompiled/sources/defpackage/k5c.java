package defpackage;

import kotlinx.coroutines.a;

/* loaded from: classes10.dex */
public final class k5c implements AutoCloseable, tse {
    public final fse a;

    public k5c(fse fseVar) {
        this.a = fseVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a.e(this.a, null);
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.a;
    }
}
