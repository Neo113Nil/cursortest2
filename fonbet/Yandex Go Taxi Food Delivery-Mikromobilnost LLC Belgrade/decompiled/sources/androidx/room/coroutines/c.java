package androidx.room.coroutines;

import androidx.room.Transactor$SQLiteTransactionType;
import defpackage.a9i0;
import defpackage.gwk0;
import defpackage.mg01;
import defpackage.ny61;
import defpackage.oll0;
import defpackage.rp90;
import defpackage.sp90;
import defpackage.tls;
import defpackage.ull0;
import defpackage.vez0;
import defpackage.w511;
import defpackage.wls;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public final class c implements mg01, a9i0 {
    public final wls a;
    public final oll0 b;
    public final AtomicInteger c = new AtomicInteger(0);
    public Transactor$SQLiteTransactionType d;

    public c(wls wlsVar, oll0 oll0Var) {
        this.a = wlsVar;
        this.b = oll0Var;
    }

    @Override // defpackage.a9i0
    public final oll0 a() {
        return this.b;
    }

    @Override // defpackage.mg01
    public final Object b(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, wls wlsVar, SuspendLambda suspendLambda) {
        Object invoke = this.a.invoke(new PassthroughConnection$withTransaction$2(this, transactor$SQLiteTransactionType, wlsVar, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return invoke;
    }

    @Override // defpackage.mg01
    public final Boolean c(Continuation continuation) {
        return Boolean.valueOf(this.d != null || this.b.A());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004b, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.d6e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, tls tlsVar, ContinuationImpl continuationImpl) {
        PassthroughConnection$usePrepared$1 passthroughConnection$usePrepared$1;
        Object obj;
        int i;
        if (continuationImpl instanceof PassthroughConnection$usePrepared$1) {
            passthroughConnection$usePrepared$1 = (PassthroughConnection$usePrepared$1) continuationImpl;
            int i2 = passthroughConnection$usePrepared$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passthroughConnection$usePrepared$1.label = i2 - Integer.MIN_VALUE;
                obj = passthroughConnection$usePrepared$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passthroughConnection$usePrepared$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    passthroughConnection$usePrepared$1.L$0 = str;
                    passthroughConnection$usePrepared$1.L$1 = tlsVar;
                    passthroughConnection$usePrepared$1.label = 1;
                    obj = c(passthroughConnection$usePrepared$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tlsVar = (tls) passthroughConnection$usePrepared$1.L$1;
                    str = (String) passthroughConnection$usePrepared$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    PassthroughConnection$usePrepared$2 passthroughConnection$usePrepared$2 = new PassthroughConnection$usePrepared$2(this, str, tlsVar, null);
                    passthroughConnection$usePrepared$1.L$0 = null;
                    passthroughConnection$usePrepared$1.L$1 = null;
                    passthroughConnection$usePrepared$1.label = 2;
                    Object invoke = this.a.invoke(passthroughConnection$usePrepared$2, passthroughConnection$usePrepared$1);
                    return invoke == obj2 ? obj2 : invoke;
                }
                ull0 T0 = this.b.T0(str);
                try {
                    Object invoke2 = tlsVar.invoke(T0);
                    gwk0.m(T0, null);
                    return invoke2;
                } finally {
                }
            }
        }
        passthroughConnection$usePrepared$1 = new PassthroughConnection$usePrepared$1(this, continuationImpl);
        obj = passthroughConnection$usePrepared$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passthroughConnection$usePrepared$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, wls wlsVar, ContinuationImpl continuationImpl) {
        PassthroughConnection$transaction$1 passthroughConnection$transaction$1;
        int i;
        AtomicInteger atomicInteger;
        int i2;
        try {
            if (continuationImpl instanceof PassthroughConnection$transaction$1) {
                passthroughConnection$transaction$1 = (PassthroughConnection$transaction$1) continuationImpl;
                int i3 = passthroughConnection$transaction$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    passthroughConnection$transaction$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = passthroughConnection$transaction$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = passthroughConnection$transaction$1.label;
                    atomicInteger = this.c;
                    i2 = 1;
                    oll0 oll0Var = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        int i4 = sp90.a[transactor$SQLiteTransactionType.ordinal()];
                        if (i4 == 1) {
                            vez0.s(oll0Var, "BEGIN DEFERRED TRANSACTION");
                        } else if (i4 == 2) {
                            vez0.s(oll0Var, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (i4 != 3) {
                                w511.b();
                                return null;
                            }
                            vez0.s(oll0Var, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                        if (atomicInteger.incrementAndGet() > 0) {
                            this.d = transactor$SQLiteTransactionType;
                        }
                        Object rp90Var = new rp90(this);
                        passthroughConnection$transaction$1.I$0 = 1;
                        passthroughConnection$transaction$1.label = 1;
                        obj = wlsVar.invoke(rp90Var, passthroughConnection$transaction$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = passthroughConnection$transaction$1.I$0;
                        kotlin.b.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    if (i2 == 0) {
                        vez0.s(oll0Var, "END TRANSACTION");
                        return obj;
                    }
                    vez0.s(oll0Var, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i != 0) {
            }
            if (atomicInteger.decrementAndGet() == 0) {
            }
            if (i2 == 0) {
            }
        } finally {
        }
        passthroughConnection$transaction$1 = new PassthroughConnection$transaction$1(this, continuationImpl);
        Object obj3 = passthroughConnection$transaction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passthroughConnection$transaction$1.label;
        atomicInteger = this.c;
        i2 = 1;
        oll0 oll0Var2 = this.b;
    }
}
