package xsna;

import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.core.auth.AuthTokenResult;
import com.vk.push.core.auth.AuthorizedResult;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import com.vk.push.core.utils.ResultExtensionsKt;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b4w0;

/* compiled from: AuthTokenIPCInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class q65 implements n65 {
    public final GetCallingAppInfoUseCase a;
    public final wpt b;
    public final p55 c;
    public final y55 d;
    public final yvj e;
    public final AnalyticsSender f;
    public final AnalyticsTimingsStore g;
    public final bpn0 h;

    /* compiled from: AuthTokenIPCInteractorImpl.kt */
    @b6l(c = "com.vk.push.authsdk.ipc.AuthTokenIPCInteractorImpl$getIntermediateToken$1", f = "AuthTokenIPCInteractorImpl.kt", l = {39, 44}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ CallingAppIds $callingAppIds;
        Object L$0;
        int label;
        final /* synthetic */ q65 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AsyncCallback asyncCallback, CallingAppIds callingAppIds, q65 q65Var, spj spjVar) {
            super(2, spjVar);
            this.this$0 = q65Var;
            this.$callback = asyncCallback;
            this.$callingAppIds = callingAppIds;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$callback, this.$callingAppIds, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AidlResult<AidlException> failure;
            AidlResult<AidlException> aidlResult;
            AidlResult.Companion companion;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
            } catch (Exception e) {
                failure = AidlResult.Companion.failure(e);
            }
            if (i == 0) {
                kotlin.a.a(obj);
                q65 q65Var = this.this$0;
                CallingAppIds callingAppIds = this.$callingAppIds;
                AidlResult.Companion companion2 = AidlResult.Companion;
                this.L$0 = companion2;
                this.label = 1;
                obj = q65.h(q65Var, callingAppIds, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                companion = companion2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aidlResult = (AidlResult) this.L$0;
                    kotlin.a.a(obj);
                    ((Logger) this.this$0.h.getValue()).error("Getting intermediate token has failed", aidlResult.exceptionOrNull());
                    failure = aidlResult;
                    try {
                        this.$callback.onResult(failure);
                    } catch (RemoteException e2) {
                        ((Logger) this.this$0.h.getValue()).error("Return intermediate token by ipc has failed", e2);
                    }
                    return s3q0.a;
                }
                companion = (AidlResult.Companion) this.L$0;
                kotlin.a.a(obj);
            }
            failure = companion.success((AuthTokenResult) obj);
            if (failure.isSuccess()) {
                Logger.DefaultImpls.info$default((Logger) this.this$0.h.getValue(), "Getting intermediate token is successful", null, 2, null);
                this.$callback.onResult(failure);
                return s3q0.a;
            }
            y55 y55Var = this.this$0.d;
            this.L$0 = failure;
            this.label = 2;
            Object clear = y55Var.a.a.clear(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (clear != coroutineSingletons2) {
                clear = s3q0.a;
            }
            if (clear != coroutineSingletons2) {
                clear = s3q0.a;
            }
            if (clear != coroutineSingletons) {
                aidlResult = failure;
                ((Logger) this.this$0.h.getValue()).error("Getting intermediate token has failed", aidlResult.exceptionOrNull());
                failure = aidlResult;
                this.$callback.onResult(failure);
                return s3q0.a;
            }
            return coroutineSingletons;
        }
    }

    /* compiled from: AuthTokenIPCInteractorImpl.kt */
    @b6l(c = "com.vk.push.authsdk.ipc.AuthTokenIPCInteractorImpl$isUserAuthorized$1", f = "AuthTokenIPCInteractorImpl.kt", l = {58}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ CallingAppIds $callingAppIds;
        int label;
        final /* synthetic */ q65 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AsyncCallback asyncCallback, CallingAppIds callingAppIds, q65 q65Var, spj spjVar) {
            super(2, spjVar);
            this.this$0 = q65Var;
            this.$callingAppIds = callingAppIds;
            this.$callback = asyncCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            q65 q65Var = this.this$0;
            return new b(this.$callback, this.$callingAppIds, q65Var, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object g;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                q65 q65Var = this.this$0;
                CallingAppIds callingAppIds = this.$callingAppIds;
                this.label = 1;
                g = q65.g(q65Var, callingAppIds, this);
                if (g == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                g = ((Result) obj).d();
            }
            if (!(g instanceof Result.Failure)) {
                g = new AuthorizedResult(!drm0.N((String) g));
            }
            boolean z = g instanceof Result.Failure;
            if (!z) {
                Object obj2 = z ? null : g;
                Logger.DefaultImpls.info$default((Logger) this.this$0.h.getValue(), "User is authorized: " + ((AuthorizedResult) obj2), null, 2, null);
            }
            try {
                this.$callback.onResult(ResultExtensionsKt.toAidlResult(g));
            } catch (RemoteException e) {
                ((Logger) this.this$0.h.getValue()).error("Return isUserAuthorized by ipc has failed", e);
            }
            return s3q0.a;
        }
    }

    public q65(GetCallingAppInfoUseCase getCallingAppInfoUseCase, wpt wptVar, p55 p55Var, y55 y55Var, hpj hpjVar, AnalyticsSender analyticsSender, AnalyticsTimingsStore analyticsTimingsStore) {
        b4w0.b bVar = b4w0.E;
        yhe0 yhe0Var = b4w0.b.a().d;
        this.a = getCallingAppInfoUseCase;
        this.b = wptVar;
        this.c = p55Var;
        this.d = y55Var;
        this.e = hpjVar;
        this.f = analyticsSender;
        this.g = analyticsTimingsStore;
        this.h = new bpn0(new r65(yhe0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable g(q65 q65Var, CallingAppIds callingAppIds, ContinuationImpl continuationImpl) {
        o65 o65Var;
        int i;
        q65Var.getClass();
        if (continuationImpl instanceof o65) {
            o65Var = (o65) continuationImpl;
            int i2 = o65Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o65Var.label = i2 - Integer.MIN_VALUE;
                Object obj = o65Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = o65Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Object m97invokeIoAF18A = q65Var.a.m97invokeIoAF18A(callingAppIds);
                    if (m97invokeIoAF18A instanceof Result.Failure) {
                        return (Serializable) m97invokeIoAF18A;
                    }
                    wpt wptVar = q65Var.b;
                    String packageName = ((AppInfo) m97invokeIoAF18A).getPackageName();
                    o65Var.label = 1;
                    obj = wptVar.b(packageName, o65Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((y25) obj).b;
            }
        }
        o65Var = new o65(q65Var, continuationImpl);
        Object obj2 = o65Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = o65Var.label;
        if (i != 0) {
        }
        return ((y25) obj2).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r12 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(q65 q65Var, CallingAppIds callingAppIds, ContinuationImpl continuationImpl) {
        p65 p65Var;
        int i;
        AppInfo appInfo;
        y25 y25Var;
        q65 q65Var2;
        y25 y25Var2;
        Object obj;
        q65Var.getClass();
        if (continuationImpl instanceof p65) {
            p65Var = (p65) continuationImpl;
            int i2 = p65Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p65Var.label = i2 - Integer.MIN_VALUE;
                p65 p65Var2 = p65Var;
                Object obj2 = p65Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = p65Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    Object m97invokeIoAF18A = q65Var.a.m97invokeIoAF18A(callingAppIds);
                    kotlin.a.a(m97invokeIoAF18A);
                    appInfo = (AppInfo) m97invokeIoAF18A;
                    wpt wptVar = q65Var.b;
                    String packageName = appInfo.getPackageName();
                    p65Var2.L$0 = q65Var;
                    p65Var2.L$1 = appInfo;
                    p65Var2.label = 1;
                    obj2 = wptVar.b(packageName, p65Var2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y25Var2 = (y25) p65Var2.L$2;
                        appInfo = (AppInfo) p65Var2.L$1;
                        q65Var2 = (q65) p65Var2.L$0;
                        kotlin.a.a(obj2);
                        obj = ((Result) obj2).d();
                        q65Var2.f.send(new t7g0(q65Var2.g.getTimePassed("request_intermediate_token"), obj, appInfo.getPackageName(), y25Var2.a));
                        kotlin.a.a(obj);
                        return new AuthTokenResult(((mfx) obj).a);
                    }
                    AppInfo appInfo2 = (AppInfo) p65Var2.L$1;
                    q65 q65Var3 = (q65) p65Var2.L$0;
                    kotlin.a.a(obj2);
                    appInfo = appInfo2;
                    q65Var = q65Var3;
                }
                y25Var = (y25) obj2;
                if (!drm0.N(y25Var.b)) {
                    throw new IllegalStateException("Auth token is blank");
                }
                if (drm0.N(y25Var.a)) {
                    throw new IllegalStateException("Auth type is blank");
                }
                q65Var.g.storeTiming("request_intermediate_token");
                p55 p55Var = q65Var.c;
                String str = y25Var.a;
                String str2 = y25Var.b;
                String packageName2 = appInfo.getPackageName();
                String pubKey = appInfo.getPubKey();
                p65Var2.L$0 = q65Var;
                p65Var2.L$1 = appInfo;
                p65Var2.L$2 = y25Var;
                p65Var2.label = 2;
                Object a2 = p55Var.a(str, str2, packageName2, pubKey, p65Var2);
                if (a2 != coroutineSingletons) {
                    q65Var2 = q65Var;
                    y25Var2 = y25Var;
                    obj = a2;
                    q65Var2.f.send(new t7g0(q65Var2.g.getTimePassed("request_intermediate_token"), obj, appInfo.getPackageName(), y25Var2.a));
                    kotlin.a.a(obj);
                    return new AuthTokenResult(((mfx) obj).a);
                }
                return coroutineSingletons;
            }
        }
        p65Var = new p65(q65Var, continuationImpl);
        p65 p65Var22 = p65Var;
        Object obj22 = p65Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = p65Var22.label;
        if (i != 0) {
        }
        y25Var = (y25) obj22;
        if (!drm0.N(y25Var.b)) {
        }
    }

    @Override // xsna.n65
    public final void a(AsyncCallback asyncCallback, CallingAppIds callingAppIds) {
        myc0.h(this.e, null, null, new b(asyncCallback, callingAppIds, this, null), 3);
    }

    @Override // xsna.n65
    public final void c(AsyncCallback asyncCallback, CallingAppIds callingAppIds) {
        myc0.h(this.e, null, null, new a(asyncCallback, callingAppIds, this, null), 3);
    }

    @Override // com.vk.push.core.IPCInteractor
    public final void onDestroy() {
        yvj yvjVar = this.e;
        zvj.c(yvjVar, null);
        iyx.d(yvjVar.getCoroutineContext());
    }
}
