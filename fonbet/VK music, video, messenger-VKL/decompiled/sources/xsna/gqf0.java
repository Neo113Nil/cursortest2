package xsna;

import android.os.DeadObjectException;
import android.os.Parcelable;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import com.vk.push.core.utils.ResultExtensionsKt;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* compiled from: RegisterPushTokenComponentImpl.kt */
/* loaded from: classes5.dex */
public final class gqf0 implements fqf0 {
    public final yvj a;
    public final PackagesRepository b;
    public final bk10 c;
    public final t3x d;
    public final GetCallingAppInfoUseCase e;
    public final AnalyticsSender f;
    public final bpn0 g;

    /* compiled from: RegisterPushTokenComponentImpl.kt */
    public static final class a extends Lambda implements gzs<Logger> {
        final /* synthetic */ Logger $logger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Logger logger) {
            super(0);
            this.$logger = logger;
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            return this.$logger.createLogger("PushesIPC");
        }
    }

    /* compiled from: RegisterPushTokenComponentImpl.kt */
    @b6l(c = "com.vk.push.pushsdk.domain.component.RegisterPushTokenComponentImpl$registerForPushes$1", f = "RegisterPushTokenComponentImpl.kt", l = {39, 41}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ CallingAppIds $callingAppIds;
        final /* synthetic */ izs<AidlResult<? extends Parcelable>, s3q0> $onResult;
        final /* synthetic */ String $projectId;
        final /* synthetic */ String $pushToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(CallingAppIds callingAppIds, String str, String str2, izs<? super AidlResult<? extends Parcelable>, s3q0> izsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$callingAppIds = callingAppIds;
            this.$pushToken = str;
            this.$projectId = str2;
            this.$onResult = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return gqf0.this.new b(this.$callingAppIds, this.$pushToken, this.$projectId, this.$onResult, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        
            if (r8 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:
        
            if (r1.d(r8, r7) == r0) goto L15;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object c;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                gqf0 gqf0Var = gqf0.this;
                bk10 bk10Var = gqf0Var.c;
                String packageName = gqf0Var.b.getPackageName();
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    c = ((Result) obj).d();
                    gqf0 gqf0Var2 = gqf0.this;
                    CallingAppIds callingAppIds = this.$callingAppIds;
                    String str2 = this.$pushToken;
                    AnalyticsSender analyticsSender = gqf0Var2.f;
                    Object m97invokeIoAF18A = gqf0Var2.e.m97invokeIoAF18A(callingAppIds);
                    if (m97invokeIoAF18A instanceof Result.Failure) {
                        m97invokeIoAF18A = null;
                    }
                    AppInfo appInfo = (AppInfo) m97invokeIoAF18A;
                    if (appInfo == null || (str = appInfo.getPackageName()) == null) {
                        str = "unknown";
                    }
                    analyticsSender.send(new c1h0(c, str, str2));
                    AidlResult<?> aidlResult = ResultExtensionsKt.toAidlResult(c);
                    if (aidlResult.isSuccess()) {
                        Logger.DefaultImpls.info$default((Logger) gqf0.this.g.getValue(), "Register for pushes is successful", null, 2, null);
                    } else {
                        ((Logger) gqf0.this.g.getValue()).warn("Register for pushes has failed", aidlResult.exceptionOrNull());
                    }
                    try {
                        this.$onResult.invoke(aidlResult);
                    } catch (DeadObjectException e) {
                        ((Logger) gqf0.this.g.getValue()).error("Return registerForPushes result by ipc has failed", e);
                    }
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            t3x t3xVar = gqf0.this.d;
            CallingAppIds callingAppIds2 = this.$callingAppIds;
            String str3 = this.$pushToken;
            String str4 = this.$projectId;
            this.label = 2;
            c = t3xVar.c(callingAppIds2, str3, str4, this);
        }
    }

    public gqf0(yvj yvjVar, PackagesRepository packagesRepository, bk10 bk10Var, t3x t3xVar, GetCallingAppInfoUseCase getCallingAppInfoUseCase, AnalyticsSender analyticsSender, Logger logger) {
        this.a = yvjVar;
        this.b = packagesRepository;
        this.c = bk10Var;
        this.d = t3xVar;
        this.e = getCallingAppInfoUseCase;
        this.f = analyticsSender;
        this.g = new bpn0(new a(logger));
    }

    @Override // xsna.fqf0
    public final void a(CallingAppIds callingAppIds, String str, String str2, izs<? super AidlResult<? extends Parcelable>, s3q0> izsVar) {
        myc0.h(this.a, null, null, new b(callingAppIds, str, str2, izsVar, null), 3);
    }
}
