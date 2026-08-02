package ru.rustore.sdk.pushclient.internal.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.domain.repository.PackagesRepository;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.pushclient.m.h;
import ru.rustore.sdk.pushclient.m.p;
import xsna.aaz0;
import xsna.b6l;
import xsna.bdn;
import xsna.bpn0;
import xsna.gzs;
import xsna.myc0;
import xsna.s101;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xll;
import xsna.yvj;

/* loaded from: classes9.dex */
public final class DeletePushTokenIfNoHostsWorker extends CoroutineWorker {
    public final bpn0 b;
    public final bpn0 c;

    public static final class b extends Lambda implements gzs<ru.rustore.sdk.pushclient.s.c> {
        public static final b i = new b();

        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final ru.rustore.sdk.pushclient.s.c invoke() {
            Logger logger = p.a;
            return new ru.rustore.sdk.pushclient.s.c(h.c(), (PackagesRepository) h.i.getValue(), h.b());
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker", f = "DeletePushTokenIfNoHostsWorker.kt", l = {33}, m = "doWork")
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(spj<? super c> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return DeletePushTokenIfNoHostsWorker.this.doWork(this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker$doWork$2", f = "DeletePushTokenIfNoHostsWorker.kt", l = {46}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super b.a>, Object> {
        public int a;

        public d(spj<? super d> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return DeletePushTokenIfNoHostsWorker.this.new d(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super b.a> spjVar) {
            return DeletePushTokenIfNoHostsWorker.this.new d(spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                a.a(obj);
                String str = null;
                if (!SdkInitAwaiter.awaitInitialization$default(ru.rustore.sdk.pushclient.a.h.w, 0L, 1, null)) {
                    return new b.a.C0093b();
                }
                Logger.DefaultImpls.info$default((Logger) DeletePushTokenIfNoHostsWorker.this.b.getValue(), "DeletePushTokenWorker start work, runAttemptCount = " + DeletePushTokenIfNoHostsWorker.this.getRunAttemptCount(), null, 2, null);
                if (DeletePushTokenIfNoHostsWorker.this.getRunAttemptCount() >= 10) {
                    Logger.DefaultImpls.info$default((Logger) DeletePushTokenIfNoHostsWorker.this.b.getValue(), "Max attempt count is reached, finish worker", null, 2, null);
                    return new b.a.c();
                }
                DeletePushTokenIfNoHostsWorker deletePushTokenIfNoHostsWorker = DeletePushTokenIfNoHostsWorker.this;
                String d = deletePushTokenIfNoHostsWorker.getInputData().d("push_token_key");
                if (d == null) {
                    Logger.DefaultImpls.warn$default((Logger) deletePushTokenIfNoHostsWorker.b.getValue(), "Invalid input push token data", null, 2, null);
                } else {
                    str = d;
                }
                if (str == null) {
                    return new b.a.C0092a();
                }
                ru.rustore.sdk.pushclient.s.c cVar = (ru.rustore.sdk.pushclient.s.c) DeletePushTokenIfNoHostsWorker.this.c.getValue();
                this.a = 1;
                a = cVar.a(str, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                a = ((Result) obj).d();
            }
            return !(a instanceof Result.Failure) ? new b.a.c() : new b.a.C0093b();
        }
    }

    public static final class e extends Lambda implements gzs<Logger> {
        public static final e i = new e();

        public e() {
            super(0);
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            Logger defaultLogger;
            aaz0 aaz0Var = s101.f;
            if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsClientSdk");
            }
            return defaultLogger.createLogger("DeleteTokenWorker");
        }
    }

    public DeletePushTokenIfNoHostsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = new bpn0(e.i);
        this.c = new bpn0(b.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(spj<? super b.a> spjVar) {
        c cVar;
        int i;
        if (spjVar instanceof c) {
            cVar = (c) spjVar;
            int i2 = cVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.c = i2 - Integer.MIN_VALUE;
                Object obj = cVar.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                    return obj;
                }
                a.a(obj);
                xll xllVar = bdn.b;
                d dVar = new d(null);
                cVar.c = 1;
                Object k = myc0.k(xllVar, dVar, cVar);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
        }
        cVar = new c(spjVar);
        Object obj2 = cVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.c;
        if (i == 0) {
        }
    }
}
