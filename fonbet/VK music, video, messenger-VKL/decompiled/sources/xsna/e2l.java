package xsna;

import com.vk.im.engine.internal.storage.structure.Table;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: DbSchema.kt */
/* loaded from: classes.dex */
public final class e2l implements d2l {
    public static final e2l a = new e2l();

    public static final Object c(z9h0 z9h0Var, boolean z, z9h0 z9h0Var2, wzs wzsVar) {
        Object d8iVar;
        Object j0;
        try {
            if (wzsVar instanceof BaseContinuationImpl) {
                ttp0.d(2, wzsVar);
                d8iVar = wzsVar.invoke(z9h0Var2, z9h0Var);
            } else {
                kotlin.coroutines.d context = z9h0Var.getContext();
                spj intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.b ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(z9h0Var) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(z9h0Var, context);
                ttp0.d(2, wzsVar);
                d8iVar = wzsVar.invoke(z9h0Var2, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
            }
        } catch (DispatchException e) {
            z9h0Var.i0(new d8i(e.getCause(), false));
            throw e.getCause();
        } catch (Throwable th) {
            d8iVar = new d8i(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (d8iVar == coroutineSingletons || (j0 = z9h0Var.j0(d8iVar)) == tyx.b) {
            return coroutineSingletons;
        }
        z9h0Var.x0();
        if (!(j0 instanceof d8i)) {
            return tyx.d(j0);
        }
        if (!z) {
            Throwable th2 = ((d8i) j0).a;
            if ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).b == z9h0Var) {
                if (d8iVar instanceof d8i) {
                    throw ((d8i) d8iVar).a;
                }
                return d8iVar;
            }
        }
        throw ((d8i) j0).a;
    }

    @Override // xsna.d2l
    public void a(SQLiteDatabase sQLiteDatabase) {
        for (Table table : Table.values()) {
            table.a(sQLiteDatabase);
        }
    }

    @Override // xsna.d2l
    public void b(SQLiteDatabase sQLiteDatabase) {
        rdi.r(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    @Override // xsna.d2l
    public int getVersion() {
        return 1107;
    }
}
