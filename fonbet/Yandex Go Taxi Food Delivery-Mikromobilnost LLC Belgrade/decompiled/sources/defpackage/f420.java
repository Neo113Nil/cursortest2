package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class f420 implements t1b0 {
    public final /* synthetic */ t1b0 a;
    public final j5z b;

    public f420(rqo rqoVar, j5z j5zVar) {
        e420.Companion.getClass();
        this.a = ((jbh) rqoVar).e(e420.g);
        this.b = j5zVar;
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (e420) this.a.c();
    }

    public final String d() {
        if (!((e420) c()).b || !((e420) c()).f) {
            return null;
        }
        this.b.getClass();
        return j5z.e().getLanguage();
    }
}
