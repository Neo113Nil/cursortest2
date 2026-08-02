package xsna;

import androidx.room.RoomDatabase;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: RoomDatabase.android.kt */
/* loaded from: classes12.dex */
public final /* synthetic */ class bmg0 {
    public static final Object a(RoomDatabase roomDatabase, izs izsVar, ContinuationImpl continuationImpl) {
        wip0 wip0Var = null;
        amg0 amg0Var = new amg0(new zlg0(roomDatabase, izsVar, null), null);
        uip0 uip0Var = (uip0) continuationImpl.getContext().get(uip0.d);
        kotlin.coroutines.c cVar = uip0Var != null ? uip0Var.b : null;
        if (cVar != null) {
            return myc0.k(cVar, amg0Var, continuationImpl);
        }
        kotlin.coroutines.d context = continuationImpl.getContext();
        lq9 lq9Var = new lq9(1, s7s0.c(continuationImpl));
        lq9Var.o();
        try {
            wip0 wip0Var2 = roomDatabase.e;
            if (wip0Var2 != null) {
                wip0Var = wip0Var2;
            }
            wip0Var.execute(new ylg0(context, lq9Var, roomDatabase, amg0Var));
        } catch (RejectedExecutionException e) {
            lq9Var.z(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }
}
