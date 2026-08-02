package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class o4u0 extends pa {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.pa
    public final boolean a(oa oaVar) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(bvf0.h);
        return true;
    }

    @Override // defpackage.pa
    public final Continuation[] b(oa oaVar) {
        this.a.set(null);
        return sb2.a;
    }
}
