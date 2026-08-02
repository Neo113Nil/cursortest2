package xsna;

import android.os.PowerManager;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WakeLockHolder.kt */
@b6l(c = "com.vk.push.pushsdk.wakelock.WakeLockHolder$releaseWakeLockDelayed$2", f = "WakeLockHolder.kt", l = {54, 56}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class t8x0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ u8x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8x0(u8x0 u8x0Var, spj<? super t8x0> spjVar) {
        super(2, spjVar);
        this.this$0 = u8x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        t8x0 t8x0Var = new t8x0(this.this$0, spjVar);
        t8x0Var.L$0 = obj;
        return t8x0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return ((t8x0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r8 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (xsna.qsl.b(r5, r7) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            obj2 = new Result.Failure(th);
        }
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            long j = u8x0.g;
            this.L$0 = yvjVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                if (wakeLock != null) {
                    wakeLock.release();
                    obj2 = s3q0.a;
                }
                return new Result(obj2);
            }
            kotlin.a.a(obj);
        }
        u8x0 u8x0Var = this.this$0;
        this.L$0 = null;
        this.label = 2;
        int i2 = u8x0.h;
        obj = u8x0Var.b(this);
    }
}
