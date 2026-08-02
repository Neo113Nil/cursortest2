package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class j0z0 implements vpr {
    public final Throwable a;

    public j0z0(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        throw this.a;
    }
}
