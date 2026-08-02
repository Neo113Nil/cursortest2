package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GlobalSnapshotManager.android.kt */
@b6l(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {64}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class l2u extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ qta<s3q0> $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2u(qta<s3q0> qtaVar, spj<? super l2u> spjVar) {
        super(2, spjVar);
        this.$channel = qtaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new l2u(this.$channel, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((l2u) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:7:0x0036, B:9:0x003e, B:10:0x004c, B:17:0x005a, B:19:0x0029, B:23:0x005d, B:26:0x0062, B:27:0x0063, B:28:0x0064, B:34:0x0024, B:12:0x004d, B:14:0x0053), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[Catch: all -> 0x0015, TryCatch #1 {all -> 0x0015, blocks: (B:6:0x0011, B:7:0x0036, B:9:0x003e, B:10:0x004c, B:17:0x005a, B:19:0x0029, B:23:0x005d, B:26:0x0062, B:27:0x0063, B:28:0x0064, B:34:0x0024, B:12:0x004d, B:14:0x0053), top: B:2:0x0005 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0033 -> B:7:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b9f0 b9f0Var;
        o0b it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                b9f0Var = this.$channel;
                it = b9f0Var.iterator();
                this.L$0 = b9f0Var;
                this.L$1 = it;
                this.label = 1;
                obj = it.a(this);
                if (obj == coroutineSingletons) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (o0b) this.L$1;
                b9f0Var = (b9f0) this.L$0;
                kotlin.a.a(obj);
                if (((Boolean) obj).booleanValue()) {
                    boolean z = false;
                    n2u.b.set(false);
                    synchronized (qak0.c) {
                        qh50<muk0> qh50Var = qak0.j.h;
                        if (qh50Var != null && qh50Var.d()) {
                            z = true;
                        }
                    }
                    if (z) {
                        qak0.a();
                    }
                    this.L$0 = b9f0Var;
                    this.L$1 = it;
                    this.label = 1;
                    obj = it.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        s3q0 s3q0Var = s3q0.a;
                        b9f0Var.b(null);
                        return s3q0.a;
                    }
                }
            }
        } finally {
        }
    }
}
