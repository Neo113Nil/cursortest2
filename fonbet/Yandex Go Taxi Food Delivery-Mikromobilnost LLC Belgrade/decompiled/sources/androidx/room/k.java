package androidx.room;

import defpackage.dsq0;
import defpackage.dvw;
import defpackage.he01;
import defpackage.hwk0;
import defpackage.j18;
import defpackage.jse;
import defpackage.tje;
import defpackage.tls;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public abstract class k {
    public static final Object a(RoomDatabase roomDatabase, tls tlsVar, Continuation continuation) {
        if ((!roomDatabase.I0() || !roomDatabase.N0() || !roomDatabase.J0()) && continuation.get_context().get(hwk0.b) != null) {
            dsq0 dsq0Var = null;
            RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(tlsVar, null);
            he01 he01Var = (he01) continuation.get_context().get(he01.b);
            jse jseVar = he01Var != null ? he01Var.a : null;
            if (jseVar != null) {
                return tje.k0(jseVar, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, continuation);
            }
            j18 j18Var = new j18(1, dvw.b(continuation));
            j18Var.u();
            try {
                dsq0 dsq0Var2 = roomDatabase.d;
                if (dsq0Var2 != null) {
                    dsq0Var = dsq0Var2;
                }
                dsq0Var.execute(new l(j18Var, roomDatabase, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1));
            } catch (RejectedExecutionException e) {
                j18Var.b(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
            }
            Object s = j18Var.s();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s;
        }
        return tlsVar.invoke(continuation);
    }
}
