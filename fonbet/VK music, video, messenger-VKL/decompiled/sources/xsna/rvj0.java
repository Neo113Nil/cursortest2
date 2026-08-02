package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SingleProcessCoordinator.kt */
/* loaded from: classes.dex */
public final class rvj0 implements uax {
    public final wi50 a = bay.a();
    public final s04 b = new s04();
    public final izg0 c = new izg0(new qvj0(2, null));

    @Override // xsna.uax
    public final Integer a() {
        return new Integer(this.b.a.incrementAndGet());
    }

    @Override // xsna.uax
    public final izg0 b() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.uax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(wzs wzsVar, ContinuationImpl continuationImpl) {
        pvj0 pvj0Var;
        int i;
        ui50 ui50Var;
        Throwable th;
        boolean z;
        if (continuationImpl instanceof pvj0) {
            pvj0Var = (pvj0) continuationImpl;
            int i2 = pvj0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pvj0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = pvj0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pvj0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    wi50 wi50Var = this.a;
                    boolean f = wi50Var.f();
                    try {
                        Boolean valueOf = Boolean.valueOf(f);
                        pvj0Var.L$0 = wi50Var;
                        pvj0Var.Z$0 = f;
                        pvj0Var.label = 1;
                        Object invoke = wzsVar.invoke(valueOf, pvj0Var);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ui50Var = wi50Var;
                        obj = invoke;
                        z = f;
                    } catch (Throwable th2) {
                        ui50Var = wi50Var;
                        th = th2;
                        z = f;
                        if (z) {
                            ui50Var.c(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = pvj0Var.Z$0;
                    ui50Var = (ui50) pvj0Var.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    ui50Var.c(null);
                }
                return obj;
            }
        }
        pvj0Var = new pvj0(this, continuationImpl);
        Object obj2 = pvj0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pvj0Var.label;
        if (i != 0) {
        }
        if (z) {
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r9.b(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v9, types: [xsna.ui50] */
    @Override // xsna.uax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(izs izsVar, ContinuationImpl continuationImpl) {
        ovj0 ovj0Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        wi50 wi50Var;
        Throwable th;
        ui50 ui50Var;
        Object invoke;
        try {
            if (continuationImpl instanceof ovj0) {
                ovj0Var = (ovj0) continuationImpl;
                int i2 = ovj0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ovj0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = ovj0Var.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ovj0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ovj0Var.L$0 = izsVar;
                        wi50Var = this.a;
                        ovj0Var.L$1 = wi50Var;
                        ovj0Var.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ui50Var = (ui50) ovj0Var.L$0;
                            try {
                                kotlin.a.a(obj);
                                ui50Var.c(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ui50Var.c(null);
                                throw th;
                            }
                        }
                        ?? r8 = (ui50) ovj0Var.L$1;
                        izs izsVar2 = (izs) ovj0Var.L$0;
                        kotlin.a.a(obj);
                        wi50Var = r8;
                        izsVar = izsVar2;
                    }
                    ovj0Var.L$0 = wi50Var;
                    ovj0Var.L$1 = null;
                    ovj0Var.label = 2;
                    invoke = izsVar.invoke(ovj0Var);
                    if (invoke != coroutineSingletons) {
                        wi50 wi50Var2 = wi50Var;
                        obj = invoke;
                        ui50Var = wi50Var2;
                        ui50Var.c(null);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            ovj0Var.L$0 = wi50Var;
            ovj0Var.L$1 = null;
            ovj0Var.label = 2;
            invoke = izsVar.invoke(ovj0Var);
            if (invoke != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            wi50 wi50Var3 = wi50Var;
            th = th3;
            ui50Var = wi50Var3;
            ui50Var.c(null);
            throw th;
        }
        ovj0Var = new ovj0(this, continuationImpl);
        Object obj2 = ovj0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ovj0Var.label;
        if (i != 0) {
        }
    }

    @Override // xsna.uax
    public final Integer getVersion() {
        return new Integer(this.b.a.get());
    }
}
