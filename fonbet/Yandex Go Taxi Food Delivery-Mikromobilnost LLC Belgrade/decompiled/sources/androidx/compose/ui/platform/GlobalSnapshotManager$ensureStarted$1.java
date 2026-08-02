package androidx.compose.ui.platform;

import defpackage.bkt;
import defpackage.ci9;
import defpackage.iz40;
import defpackage.jq6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q2t0;
import defpackage.tfi0;
import defpackage.tse;
import defpackage.uh6;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {64}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements wls {
    final /* synthetic */ ci9 $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(ci9 ci9Var, Continuation continuation) {
        super(2, continuation);
        this.$channel = ci9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GlobalSnapshotManager$ensureStarted$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:6:0x0012, B:7:0x0035, B:9:0x003d, B:10:0x004b, B:17:0x0059, B:19:0x0028, B:23:0x005c, B:26:0x0061, B:27:0x0062, B:34:0x0023, B:12:0x004c, B:14:0x0052), top: B:2:0x0006, inners: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0032 -> B:7:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tfi0 tfi0Var;
        jq6 it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tfi0Var = this.$channel;
                it = tfi0Var.iterator();
                this.L$0 = tfi0Var;
                this.L$1 = it;
                this.label = 1;
                obj = it.a(this);
                if (obj == coroutineSingletons) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (jq6) this.L$1;
                tfi0Var = (tfi0) this.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    boolean z = false;
                    bkt.b.set(false);
                    synchronized (q2t0.c) {
                        iz40 iz40Var = q2t0.j.h;
                        if (iz40Var != null && iz40Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        q2t0.a();
                    }
                    this.L$0 = tfi0Var;
                    this.L$1 = it;
                    this.label = 1;
                    obj = it.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        tfi0Var.a(null);
                        return zy11.a;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CancellationException cancellationException = th instanceof CancellationException ? th : null;
                if (cancellationException == null) {
                    cancellationException = uh6.b("Channel was consumed, consumer had failed", th);
                }
                tfi0Var.a(cancellationException);
                throw th2;
            }
        }
    }
}
