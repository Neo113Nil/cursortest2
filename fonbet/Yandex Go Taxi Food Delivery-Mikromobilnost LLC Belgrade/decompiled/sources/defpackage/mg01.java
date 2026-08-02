package defpackage;

import androidx.room.Transactor$SQLiteTransactionType;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public interface mg01 extends d6e0 {
    Object b(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, wls wlsVar, SuspendLambda suspendLambda);

    Boolean c(Continuation continuation);
}
