package xsna;

import android.content.Context;
import android.os.Build;
import androidx.work.b;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WorkerWrapper.kt */
@b6l(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {300, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class zyx0 extends SuspendLambda implements wzs<yvj, spj<? super b.a>, Object> {
    final /* synthetic */ v7s $foregroundUpdater;
    final /* synthetic */ androidx.work.b $worker;
    int label;
    final /* synthetic */ uyx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyx0(uyx0 uyx0Var, androidx.work.b bVar, v7s v7sVar, spj<? super zyx0> spjVar) {
        super(2, spjVar);
        this.this$0 = uyx0Var;
        this.$worker = bVar;
        this.$foregroundUpdater = v7sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zyx0(this.this$0, this.$worker, this.$foregroundUpdater, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super b.a> spjVar) {
        return ((zyx0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r11 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            uyx0 uyx0Var = this.this$0;
            Context context = uyx0Var.b;
            fxx0 fxx0Var = uyx0Var.a;
            androidx.work.b bVar = this.$worker;
            v7s v7sVar = this.$foregroundUpdater;
            hwx0 hwx0Var = uyx0Var.e;
            this.label = 1;
            int i2 = qvx0.a;
            if (!fxx0Var.q || Build.VERSION.SDK_INT >= 31) {
                obj2 = s3q0.a;
            } else {
                obj2 = myc0.k(qu5.b(hwx0Var.d), new pvx0(bVar, fxx0Var, v7sVar, context, null), this);
                if (obj2 != obj3) {
                    obj2 = s3q0.a;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
        }
        String str = bzx0.a;
        uyx0 uyx0Var2 = this.this$0;
        m100 c = m100.c();
        fxx0 fxx0Var2 = uyx0Var2.a;
        c.getClass();
        ugz<b.a> startWork = this.$worker.startWork();
        androidx.work.b bVar2 = this.$worker;
        this.label = 2;
        Object a = bzx0.a(startWork, bVar2, this);
        return a == obj3 ? obj3 : a;
    }
}
