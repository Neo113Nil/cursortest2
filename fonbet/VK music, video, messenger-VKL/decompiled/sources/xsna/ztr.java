package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes8.dex */
public final class ztr implements ksr<Object> {
    public final /* synthetic */ ksr b;
    public final /* synthetic */ ksr c;
    public final /* synthetic */ Object d;

    public ztr(ksr ksrVar, ksr ksrVar2, yzs yzsVar) {
        this.b = ksrVar;
        this.c = ksrVar2;
        this.d = yzsVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xsna.yzs] */
    @Override // xsna.ksr
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        Object a = t9g.a(spjVar, lsrVar, bur.b, new aur(this.d, null), new ksr[]{this.b, this.c});
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }
}
