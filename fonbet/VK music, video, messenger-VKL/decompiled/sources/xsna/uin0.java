package xsna;

import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SupportSQLiteConnectionPool.android.kt */
/* loaded from: classes.dex */
public final class uin0 implements Transactor, hye0 {
    public final qin0 a;

    /* compiled from: SupportSQLiteConnectionPool.android.kt */
    public final class a<T> implements zip0<T>, hye0 {
        public a() {
        }

        @Override // xsna.hye0
        public final hyg0 a() {
            return uin0.this.a;
        }

        @Override // xsna.nvb0
        public final Object b(String str, izs izsVar, ContinuationImpl continuationImpl) {
            return uin0.this.b(str, izsVar, continuationImpl);
        }
    }

    /* compiled from: SupportSQLiteConnectionPool.android.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public uin0(qin0 qin0Var) {
        this.a = qin0Var;
    }

    @Override // xsna.hye0
    public final hyg0 a() {
        return this.a;
    }

    @Override // xsna.nvb0
    public final Object b(String str, izs izsVar, ContinuationImpl continuationImpl) {
        yin0 V0 = this.a.V0(str);
        try {
            Object invoke = izsVar.invoke(V0);
            yfb.d(V0, null);
            return invoke;
        } finally {
        }
    }

    @Override // androidx.room.Transactor
    public final Object c(SuspendLambda suspendLambda) {
        return Boolean.valueOf(this.a.b.inTransaction());
    }

    @Override // androidx.room.Transactor
    public final Object d(Transactor.SQLiteTransactionType sQLiteTransactionType, wzs wzsVar, SuspendLambda suspendLambda) {
        return e(sQLiteTransactionType, wzsVar, suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Transactor.SQLiteTransactionType sQLiteTransactionType, wzs wzsVar, ContinuationImpl continuationImpl) {
        vin0 vin0Var;
        int i;
        Throwable th;
        sin0 sin0Var;
        uin0 uin0Var;
        ConnectionPool.RollbackException e;
        if (continuationImpl instanceof vin0) {
            vin0Var = (vin0) continuationImpl;
            int i2 = vin0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vin0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = vin0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vin0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    sin0 sin0Var2 = this.a.b;
                    sin0Var2.inTransaction();
                    int i3 = b.$EnumSwitchMapping$0[sQLiteTransactionType.ordinal()];
                    if (i3 == 1) {
                        sin0Var2.beginTransactionReadOnly();
                    } else if (i3 == 2) {
                        sin0Var2.beginTransactionNonExclusive();
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sin0Var2.beginTransaction();
                    }
                    try {
                        a aVar = new a();
                        vin0Var.L$0 = this;
                        vin0Var.L$1 = sin0Var2;
                        vin0Var.label = 1;
                        Object invoke = wzsVar.invoke(aVar, vin0Var);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = invoke;
                        sin0Var = sin0Var2;
                        uin0Var = this;
                    } catch (ConnectionPool.RollbackException e2) {
                        e = e2;
                        sin0Var = sin0Var2;
                        uin0Var = this;
                        Object d = e.d();
                        sin0Var.endTransaction();
                        if (!sin0Var.inTransaction()) {
                        }
                        return d;
                    } catch (Throwable th2) {
                        th = th2;
                        sin0Var = sin0Var2;
                        uin0Var = this;
                        sin0Var.endTransaction();
                        if (!sin0Var.inTransaction()) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sin0Var = (sin0) vin0Var.L$1;
                    uin0Var = (uin0) vin0Var.L$0;
                    try {
                        try {
                            kotlin.a.a(obj);
                        } catch (ConnectionPool.RollbackException e3) {
                            e = e3;
                            Object d2 = e.d();
                            sin0Var.endTransaction();
                            if (!sin0Var.inTransaction()) {
                                uin0Var.getClass();
                            }
                            return d2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sin0Var.endTransaction();
                        if (!sin0Var.inTransaction()) {
                            uin0Var.getClass();
                        }
                        throw th;
                    }
                }
                sin0Var.setTransactionSuccessful();
                sin0Var.endTransaction();
                if (!sin0Var.inTransaction()) {
                    uin0Var.getClass();
                }
                return obj;
            }
        }
        vin0Var = new vin0(this, continuationImpl);
        Object obj2 = vin0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vin0Var.label;
        if (i != 0) {
        }
        sin0Var.setTransactionSuccessful();
        sin0Var.endTransaction();
        if (!sin0Var.inTransaction()) {
        }
        return obj2;
    }
}
