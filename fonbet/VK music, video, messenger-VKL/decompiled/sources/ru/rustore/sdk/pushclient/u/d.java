package ru.rustore.sdk.pushclient.u;

import android.os.RemoteException;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.push.InvalidateTokenResult;
import com.vk.push.core.push.IsPushTokenExistResult;
import com.vk.push.core.push.OnDeleteMessagesResult;
import com.vk.push.core.utils.ResultExtensionsKt;
import com.vk.push.core.utils.StringExtensionsKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bdn;
import xsna.d5o0;
import xsna.drm0;
import xsna.hpj;
import xsna.i2z0;
import xsna.iay0;
import xsna.kfy0;
import xsna.kiy0;
import xsna.mh40;
import xsna.myc0;
import xsna.s3q0;
import xsna.s9y0;
import xsna.spj;
import xsna.tuz;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* loaded from: classes9.dex */
public final class d implements kfy0 {
    public final i2z0 a;
    public final iay0 b;
    public final ru.rustore.sdk.pushclient.a.a c;
    public final s9y0 d;
    public final CrashReporterRepository e;
    public final AnalyticsSender f;
    public final Logger g;
    public final hpj h = zvj.a(bdn.b);

    @b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl$isPushTokenExist$1", f = "ClientServiceInteractorImpl.kt", l = {109, 110}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        public d a;
        public String b;
        public int c;
        public final /* synthetic */ CallingAppIds e;
        public final /* synthetic */ AsyncCallback f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CallingAppIds callingAppIds, AsyncCallback asyncCallback, String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.e = callingAppIds;
            this.f = asyncCallback;
            this.g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return d.this.new a(this.e, this.f, this.g, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:(1:(9:5|6|(1:21)(1:10)|11|12|13|14|15|16)(2:22|23))(1:24))(1:31)|25|(3:27|(5:30|6|(1:8)|21|11)|29)|12|13|14|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
        
            r6.d.g.error("Is push token exist result by ipc has failed", r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x003f, code lost:
        
            if (r7 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            d dVar;
            String str;
            Object obj3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                kotlin.a.a(obj);
                Logger.DefaultImpls.info$default(d.this.g, "Validating host...", null, 2, null);
                i2z0 i2z0Var = d.this.a;
                CallingAppIds callingAppIds = this.e;
                this.c = 1;
                Object a = i2z0Var.a(callingAppIds, this);
                obj2 = a;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = this.b;
                    dVar = this.a;
                    kotlin.a.a(obj);
                    IsPushTokenExistResult isPushTokenExistResult = (drm0.N(str) && str.equals((String) obj)) ? IsPushTokenExistResult.EXISTS : IsPushTokenExistResult.DOES_NOT_EXIST;
                    Logger.DefaultImpls.info$default(dVar.g, "Check result: " + isPushTokenExistResult.name(), null, 2, null);
                    obj3 = isPushTokenExistResult;
                    this.f.onResult(ResultExtensionsKt.toAidlResult(obj3));
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                obj2 = ((Result) obj).d();
            }
            dVar = d.this;
            String str2 = this.g;
            boolean z = obj2 instanceof Result.Failure;
            obj3 = obj2;
            if (!z) {
                s9y0 s9y0Var = dVar.d;
                this.a = dVar;
                this.b = str2;
                this.c = 2;
                obj = s9y0Var.a(this);
                if (obj != coroutineSingletons) {
                    str = str2;
                    if (drm0.N(str)) {
                    }
                    Logger.DefaultImpls.info$default(dVar.g, "Check result: " + isPushTokenExistResult.name(), null, 2, null);
                    obj3 = isPushTokenExistResult;
                }
                return coroutineSingletons;
            }
            this.f.onResult(ResultExtensionsKt.toAidlResult(obj3));
            return s3q0.a;
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl$onDeleteMessages$1", f = "ClientServiceInteractorImpl.kt", l = {82, 84}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        public int a;
        public final /* synthetic */ CallingAppIds c;
        public final /* synthetic */ AsyncCallback d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CallingAppIds callingAppIds, AsyncCallback asyncCallback, spj<? super b> spjVar) {
            super(2, spjVar);
            this.c = callingAppIds;
            this.d = asyncCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return d.this.new b(this.c, this.d, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:(1:(8:5|6|7|(1:9)(1:18)|10|11|12|13)(2:19|20))(1:21))(1:27)|22|(1:24)|7|(0)(0)|10|11|12|13) */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
        
            r5.b.g.error("On delete messages result by ipc has failed", r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        
            if (r6 == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
        
            if (r6 == r0) goto L17;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a;
            AidlResult<?> aidlResult;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                kotlin.a.a(obj);
                Logger.DefaultImpls.info$default(d.this.g, "Validating host...", null, 2, null);
                i2z0 i2z0Var = d.this.a;
                CallingAppIds callingAppIds = this.c;
                this.a = 1;
                a = i2z0Var.a(callingAppIds, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    a = (OnDeleteMessagesResult) obj;
                    aidlResult = ResultExtensionsKt.toAidlResult(a);
                    if (aidlResult.isSuccess()) {
                        d.this.g.error("On delete messages has failed", aidlResult.exceptionOrNull());
                    } else {
                        Logger.DefaultImpls.info$default(d.this.g, "On delete messages has successfully finished", null, 2, null);
                    }
                    this.d.onResult(aidlResult);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                a = ((Result) obj).d();
            }
            d dVar = d.this;
            if (!(a instanceof Result.Failure)) {
                Logger.DefaultImpls.info$default(dVar.g, "Calling onDeleteMessages...", null, 2, null);
                this.a = 2;
                obj = d.g(dVar, this);
            }
            aidlResult = ResultExtensionsKt.toAidlResult(a);
            if (aidlResult.isSuccess()) {
            }
            this.d.onResult(aidlResult);
            return s3q0.a;
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.ClientServiceInteractorImpl$onTokenInvalidated$1", f = "ClientServiceInteractorImpl.kt", l = {43, 44, 46, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        public String a;
        public int b;
        public final /* synthetic */ CallingAppIds d;
        public final /* synthetic */ AsyncCallback e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CallingAppIds callingAppIds, AsyncCallback asyncCallback, spj<? super c> spjVar) {
            super(2, spjVar);
            this.d = callingAppIds;
            this.e = asyncCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return d.this.new c(this.d, this.e, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0123, code lost:
        
            if (r3.h(r1, r10) == r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
        
            if (r11.g(r10) == r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x004c, code lost:
        
            if (r11 == r0) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            Throwable a;
            ru.rustore.sdk.pushclient.a.a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i == 0) {
                kotlin.a.a(obj);
                Logger.DefaultImpls.info$default(d.this.g, "Validating host...", null, 2, null);
                s9y0 s9y0Var = d.this.d;
                this.b = 1;
                obj = s9y0Var.a(this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        str = this.a;
                        kotlin.a.a(obj);
                        obj2 = ((Result) obj).d();
                        d dVar = d.this;
                        if (!(obj2 instanceof Result.Failure)) {
                            Logger.DefaultImpls.info$default(dVar.g, "Clearing push storage...", null, 2, null);
                            s9y0 s9y0Var2 = dVar.d;
                            this.a = str;
                            this.b = 3;
                        }
                        d dVar2 = d.this;
                        if (!(obj2 instanceof Result.Failure)) {
                        }
                        d dVar3 = d.this;
                        a = Result.a(obj2);
                        if (a != null) {
                        }
                        this.e.onResult(ResultExtensionsKt.toAidlResult(obj2));
                        Logger.DefaultImpls.info$default(d.this.g, "Calling re-subscription to retrieve a new push token", null, 2, null);
                        d5o0 d5o0Var = new d5o0();
                        Pair pair = new Pair(d5o0Var, new d5o0.a());
                        d5o0 d5o0Var2 = (d5o0) pair.d();
                        d5o0.a aVar2 = (d5o0.a) pair.g();
                        d5o0Var2.b(new tuz(d.this, 28), null);
                        d5o0Var2.b(null, new mh40(d.this, 26));
                        d dVar4 = d.this;
                        aVar = dVar4.c;
                        if (aVar == null) {
                        }
                        return s3q0.a;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    str = this.a;
                    kotlin.a.a(obj);
                    obj2 = InvalidateTokenResult.OK;
                    d dVar22 = d.this;
                    if (!(obj2 instanceof Result.Failure)) {
                        dVar22.getClass();
                        if (str != null && !drm0.N(str)) {
                            dVar22.f.send(new kiy0(str, ru.rustore.sdk.pushclient.b.b.b));
                        }
                        Logger.DefaultImpls.info$default(dVar22.g, "Invalidating token has successfully finished", null, 2, null);
                    }
                    d dVar32 = d.this;
                    a = Result.a(obj2);
                    if (a != null) {
                        dVar32.e.nonFatalReport(a, IssueKey.TOKEN_INVALIDATED);
                    }
                    try {
                        this.e.onResult(ResultExtensionsKt.toAidlResult(obj2));
                    } catch (RemoteException e) {
                        d.this.g.error("Return token invalidated result by ipc has failed", e);
                    }
                    Logger.DefaultImpls.info$default(d.this.g, "Calling re-subscription to retrieve a new push token", null, 2, null);
                    d5o0 d5o0Var3 = new d5o0();
                    Pair pair2 = new Pair(d5o0Var3, new d5o0.a());
                    d5o0 d5o0Var22 = (d5o0) pair2.d();
                    d5o0.a aVar22 = (d5o0.a) pair2.g();
                    d5o0Var22.b(new tuz(d.this, 28), null);
                    d5o0Var22.b(null, new mh40(d.this, 26));
                    d dVar42 = d.this;
                    aVar = dVar42.c;
                    if (aVar == null) {
                        Logger.DefaultImpls.error$default(dVar42.g, "SubscribeComponent is not initialized", null, 2, null);
                    } else {
                        this.a = null;
                        this.b = 4;
                    }
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            String str2 = (String) obj;
            i2z0 i2z0Var = d.this.a;
            CallingAppIds callingAppIds = this.d;
            this.a = str2;
            this.b = 2;
            Object a2 = i2z0Var.a(callingAppIds, this);
            if (a2 != coroutineSingletons) {
                str = str2;
                obj2 = a2;
                d dVar5 = d.this;
                if (!(obj2 instanceof Result.Failure)) {
                }
                d dVar222 = d.this;
                if (!(obj2 instanceof Result.Failure)) {
                }
                d dVar322 = d.this;
                a = Result.a(obj2);
                if (a != null) {
                }
                this.e.onResult(ResultExtensionsKt.toAidlResult(obj2));
                Logger.DefaultImpls.info$default(d.this.g, "Calling re-subscription to retrieve a new push token", null, 2, null);
                d5o0 d5o0Var32 = new d5o0();
                Pair pair22 = new Pair(d5o0Var32, new d5o0.a());
                d5o0 d5o0Var222 = (d5o0) pair22.d();
                d5o0.a aVar222 = (d5o0.a) pair22.g();
                d5o0Var222.b(new tuz(d.this, 28), null);
                d5o0Var222.b(null, new mh40(d.this, 26));
                d dVar422 = d.this;
                aVar = dVar422.c;
                if (aVar == null) {
                }
                return s3q0.a;
            }
            return coroutineSingletons;
        }
    }

    public d(i2z0 i2z0Var, iay0 iay0Var, ru.rustore.sdk.pushclient.a.a aVar, s9y0 s9y0Var, CrashReporterRepository crashReporterRepository, AnalyticsSender analyticsSender, Logger logger) {
        this.a = i2z0Var;
        this.b = iay0Var;
        this.c = aVar;
        this.d = s9y0Var;
        this.e = crashReporterRepository;
        this.f = analyticsSender;
        this.g = logger.createLogger("ClientServiceInteractor");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum g(d dVar, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.u.c cVar;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.u.c) {
            cVar = (ru.rustore.sdk.pushclient.u.c) continuationImpl;
            int i2 = cVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.c = i2 - Integer.MIN_VALUE;
                Object obj = cVar.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iay0 iay0Var = dVar.b;
                    cVar.c = 1;
                    if (iay0Var.e(cVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return OnDeleteMessagesResult.OK;
            }
        }
        cVar = new ru.rustore.sdk.pushclient.u.c(dVar, continuationImpl);
        Object obj2 = cVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.c;
        if (i != 0) {
        }
        return OnDeleteMessagesResult.OK;
    }

    @Override // xsna.kfy0
    public final void d(CallingAppIds callingAppIds, String str, AsyncCallback asyncCallback) {
        Logger.DefaultImpls.info$default(this.g, "Checking is push token " + StringExtensionsKt.hideSensitive(str) + " exist...", null, 2, null);
        myc0.h(this.h, null, null, new a(callingAppIds, asyncCallback, str, null), 3);
    }

    @Override // xsna.kfy0
    public final void e(AsyncCallback asyncCallback, CallingAppIds callingAppIds) {
        Logger.DefaultImpls.info$default(this.g, "On delete messages has requested", null, 2, null);
        myc0.h(this.h, null, null, new b(callingAppIds, asyncCallback, null), 3);
    }

    @Override // xsna.kfy0
    public final void f(AsyncCallback asyncCallback, CallingAppIds callingAppIds) {
        Logger.DefaultImpls.info$default(this.g, "Token invalidation has requested", null, 2, null);
        myc0.h(this.h, null, null, new c(callingAppIds, asyncCallback, null), 3);
    }

    @Override // com.vk.push.core.IPCInteractor
    public final void onDestroy() {
        Logger.DefaultImpls.info$default(this.g, "Destroying", null, 2, null);
        zvj.c(this.h, null);
    }
}
