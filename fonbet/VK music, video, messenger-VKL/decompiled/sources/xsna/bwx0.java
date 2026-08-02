package xsna;

import android.os.Bundle;
import androidx.work.Data;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import com.vk.push.core.utils.AidlExtensionsKt;
import com.vk.push.core.work.WorkExecutor;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkResult;
import com.vk.push.pushsdk.VkpnsPushConfig;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkManagerExecutorStubImpl.kt */
/* loaded from: classes5.dex */
public final class bwx0 extends WorkExecutor.Stub {
    public final bpn0 a = new bpn0(b.i);
    public final bpn0 b = new bpn0(c.i);
    public final hpj e;

    /* compiled from: WorkManagerExecutorStubImpl.kt */
    @b6l(c = "com.vk.push.pushsdk.work.multiprocess.ipc.WorkManagerExecutorStubImpl$executeWork$1", f = "WorkManagerExecutorStubImpl.kt", l = {60}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ Bundle $params;
        final /* synthetic */ xvj $worker;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AsyncCallback asyncCallback, xvj xvjVar, Bundle bundle, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$callback = asyncCallback;
            this.$worker = xvjVar;
            this.$params = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$callback, this.$worker, this.$params, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AidlResult<AidlException> failure;
            AidlResult.Companion companion;
            Object failure2;
            AidlResult.Companion companion2;
            WorkResult workResult;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
            } catch (Exception e) {
                failure = AidlResult.Companion.failure(e);
            }
            if (i == 0) {
                kotlin.a.a(obj);
                xvj xvjVar = this.$worker;
                Bundle bundle = this.$params;
                companion = AidlResult.Companion;
                if (xvjVar != null) {
                    int i2 = bundle.getInt("retry_attempt_count");
                    Object obj2 = null;
                    try {
                        byte[] byteArray = bundle.getByteArray("input_data");
                        failure2 = byteArray != null ? Data.a(byteArray) : null;
                    } catch (Throwable th) {
                        failure2 = new Result.Failure(th);
                    }
                    if (!(failure2 instanceof Result.Failure)) {
                        obj2 = failure2;
                    }
                    Data data = (Data) obj2;
                    if (data == null) {
                        data = Data.b;
                    }
                    this.L$0 = companion;
                    this.label = 1;
                    obj = xvjVar.a(i2, data, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    companion2 = companion;
                }
                workResult = WorkResult.FAILURE;
                companion2 = companion;
                failure = companion2.success(workResult);
                this.$callback.onResult(failure);
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion2 = (AidlResult.Companion) this.L$0;
            kotlin.a.a(obj);
            workResult = (WorkResult) obj;
            if (workResult == null) {
                companion = companion2;
                workResult = WorkResult.FAILURE;
                companion2 = companion;
            }
            failure = companion2.success(workResult);
            this.$callback.onResult(failure);
            return s3q0.a;
        }
    }

    /* compiled from: WorkManagerExecutorStubImpl.kt */
    public static final class b extends Lambda implements gzs<Logger> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final Logger invoke() {
            yhe0 yhe0Var;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            return (vkpnsPushConfig == null || (yhe0Var = vkpnsPushConfig.c) == null) ? new DefaultLogger("VkpnsPushProviderSdk") : yhe0Var;
        }
    }

    /* compiled from: WorkManagerExecutorStubImpl.kt */
    public static final class c extends Lambda implements gzs<gzx0> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final gzx0 invoke() {
            Logger logger = v6g0.a;
            return (gzx0) v6g0.t.getValue();
        }
    }

    public bwx0() {
        bdn bdnVar = bdn.a;
        this.e = zvj.a(wgl.c);
    }

    @Override // com.vk.push.core.work.WorkExecutor
    public final void executeWork(WorkModel workModel, AsyncCallback asyncCallback) {
        bpn0 bpn0Var = this.a;
        Logger.DefaultImpls.info$default((Logger) bpn0Var.getValue(), "WorkManagerExecutorStubImpl registering " + workModel, null, 2, null);
        String workName = workModel != null ? workModel.getWorkName() : null;
        Bundle params = workModel != null ? workModel.getParams() : null;
        if (workName == null || params == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("workModel is null"), (Logger) bpn0Var.getValue());
            }
        } else if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("RegisterWork called with push provider sdk not being initialized"), (Logger) bpn0Var.getValue());
            }
        } else {
            if (asyncCallback == null) {
                return;
            }
            Lazy<xvj> lazy = ((gzx0) this.b.getValue()).c.get(workName);
            myc0.h(this.e, null, null, new a(asyncCallback, lazy != null ? lazy.getValue() : null, params, null), 3);
        }
    }
}
