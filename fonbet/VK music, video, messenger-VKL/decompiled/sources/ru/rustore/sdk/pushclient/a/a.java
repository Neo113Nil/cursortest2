package ru.rustore.sdk.pushclient.a;

import androidx.car.app.hardware.common.CarZone;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.clientid.ClientId;
import com.vk.push.core.push.RegisterForPushesResult;
import com.vk.push.core.utils.ResultExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.b6l;
import xsna.bay;
import xsna.d4z0;
import xsna.d5o0;
import xsna.drm0;
import xsna.efy0;
import xsna.iid;
import xsna.j5g;
import xsna.jay0;
import xsna.jfy0;
import xsna.kay0;
import xsna.kiy0;
import xsna.lhg;
import xsna.liy0;
import xsna.nay0;
import xsna.p2z0;
import xsna.s3q0;
import xsna.spj;
import xsna.ui50;
import xsna.wi50;
import xsna.wkz;
import xsna.yoy0;
import xsna.z9y0;

/* loaded from: classes9.dex */
public final class a {
    public final ru.rustore.sdk.pushclient.m.b a;
    public final jay0 b;
    public final ru.rustore.sdk.pushclient.s.b c;
    public final iid d;
    public final p2z0 e;
    public final d4z0 f;
    public final AnalyticsSender g;
    public final AnalyticsTimingsStore h;
    public final ru.rustore.sdk.pushclient.k.b i;
    public final Logger l;
    public final LinkedList j = new LinkedList();
    public final wi50 k = bay.a();
    public final AtomicInteger m = new AtomicInteger(0);

    /* renamed from: ru.rustore.sdk.pushclient.a.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2397a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RegisterForPushesResult.values().length];
            try {
                iArr[RegisterForPushesResult.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RegisterForPushesResult.ALREADY_REGISTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {160, 166}, m = "deleteToken")
    public static final class b extends ContinuationImpl {
        public a a;
        public d5o0.a b;
        public String c;
        public /* synthetic */ Object d;
        public int f;

        public b(spj<? super b> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {151}, m = "getToken")
    public final class c extends ContinuationImpl {
        public a a;
        public /* synthetic */ Object b;
        public int d;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {180, 181}, m = "onPushTokenRefreshed-Du7M8sQ")
    public final class d extends ContinuationImpl {
        public a a;
        public String b;
        public boolean c;
        public /* synthetic */ Object d;
        public int f;

        public d(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {139, 143, 146}, m = "registerForPushes")
    public final class e extends ContinuationImpl {
        public a a;
        public /* synthetic */ Object b;
        public int d;

        public e(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return a.this.g(this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {269, 188, 190, 203}, m = "registerPushToken-Du7M8sQ")
    public final class f extends ContinuationImpl {
        public a a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public f(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return a.this.f(null, this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {64, 65, 70, 82, 83, CarZone.CAR_ZONE_COLUMN_PASSENGER, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m = "requestFullReSubscription")
    public final class g extends ContinuationImpl {
        public a a;
        public d5o0.a b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public g(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return a.this.h(null, this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", l = {245}, m = "sendRegisterForPushesEvent-nMHjR3k")
    public final class h extends ContinuationImpl {
        public AnalyticsSender a;
        public String b;
        public Object c;
        public long d;
        public /* synthetic */ Object e;
        public int g;

        public h(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return a.this.a(null, null, this);
        }
    }

    public a(ru.rustore.sdk.pushclient.m.b bVar, jay0 jay0Var, ru.rustore.sdk.pushclient.s.b bVar2, iid iidVar, p2z0 p2z0Var, d4z0 d4z0Var, AnalyticsSender analyticsSender, AnalyticsTimingsStore analyticsTimingsStore, ru.rustore.sdk.pushclient.k.b bVar3, Logger logger) {
        this.a = bVar;
        this.b = jay0Var;
        this.c = bVar2;
        this.d = iidVar;
        this.e = p2z0Var;
        this.f = d4z0Var;
        this.g = analyticsSender;
        this.h = analyticsTimingsStore;
        this.i = bVar3;
        this.l = logger.createLogger("SubscribeComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Object obj, ContinuationImpl continuationImpl) {
        h hVar;
        int i;
        AnalyticsSender analyticsSender;
        String str2;
        Object obj2;
        long j;
        if (continuationImpl instanceof h) {
            hVar = (h) continuationImpl;
            int i2 = hVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.g = i2 - Integer.MIN_VALUE;
                Object obj3 = hVar.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hVar.g;
                if (i != 0) {
                    kotlin.a.a(obj3);
                    long timePassed = this.h.getTimePassed(ru.rustore.sdk.pushclient.e.a.class);
                    AnalyticsSender analyticsSender2 = this.g;
                    hVar.a = analyticsSender2;
                    hVar.b = str;
                    hVar.c = obj;
                    hVar.d = timePassed;
                    hVar.g = 1;
                    Object e2 = this.i.e(hVar);
                    if (e2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    analyticsSender = analyticsSender2;
                    obj3 = e2;
                    str2 = str;
                    obj2 = obj;
                    j = timePassed;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j2 = hVar.d;
                    Object obj4 = hVar.c;
                    String str3 = hVar.b;
                    analyticsSender = hVar.a;
                    kotlin.a.a(obj3);
                    j = j2;
                    obj2 = obj4;
                    str2 = str3;
                }
                analyticsSender.send(new ru.rustore.sdk.pushclient.e.d(j, obj2, str2, ((AppInfo) obj3).getPackageName()));
                return s3q0.a;
            }
        }
        hVar = new h(continuationImpl);
        Object obj32 = hVar.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hVar.g;
        if (i != 0) {
        }
        analyticsSender.send(new ru.rustore.sdk.pushclient.e.d(j, obj2, str2, ((AppInfo) obj32).getPackageName()));
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r2.f(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        d dVar;
        int i;
        a aVar;
        boolean booleanValue;
        boolean z;
        if (continuationImpl instanceof d) {
            dVar = (d) continuationImpl;
            int i2 = dVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.f = i2 - Integer.MIN_VALUE;
                Object obj = dVar.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dVar.f;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(this.l, "Saving new push token to the storage", null, 2, null);
                    dVar.a = this;
                    dVar.b = str;
                    dVar.f = 1;
                    obj = this.b.e(str, dVar);
                    if (obj != coroutineSingletons) {
                        aVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = dVar.c;
                    kotlin.a.a(obj);
                    return Boolean.valueOf(z);
                }
                str = dVar.b;
                aVar = dVar.a;
                kotlin.a.a(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    dVar.a = null;
                    dVar.b = null;
                    dVar.c = booleanValue;
                    dVar.f = 2;
                }
                z = booleanValue;
                return Boolean.valueOf(z);
            }
        }
        dVar = new d(continuationImpl);
        Object obj2 = dVar.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.f;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        z = booleanValue;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        c cVar;
        int i;
        Object a;
        a aVar;
        String str;
        if (continuationImpl instanceof c) {
            cVar = (c) continuationImpl;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(this.l, "Get current push token", null, 2, null);
                    cVar.a = this;
                    cVar.d = 1;
                    a = this.b.a(cVar);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = cVar.a;
                    kotlin.a.a(obj);
                    a = ((kay0) obj).a;
                }
                str = (String) a;
                if (drm0.N(str)) {
                    Logger.DefaultImpls.warn$default(aVar.l, "No saved push token found", null, 2, null);
                }
                return str;
            }
        }
        cVar = new c(continuationImpl);
        Object obj2 = cVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.d;
        if (i != 0) {
        }
        str = (String) a;
        if (drm0.N(str)) {
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(d5o0<s3q0>.a aVar, spj<? super s3q0> spjVar) {
        b bVar;
        int i;
        a aVar2;
        String str;
        d5o0<s3q0>.a aVar3;
        String str2;
        Object obj;
        a aVar4;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.f;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    Logger.DefaultImpls.warn$default(this.l, "Deletion current push token", null, 2, null);
                    bVar.a = this;
                    bVar.b = aVar;
                    bVar.f = 1;
                    obj2 = c(bVar);
                    if (obj2 != coroutineSingletons) {
                        aVar2 = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = bVar.c;
                    aVar3 = bVar.b;
                    aVar4 = bVar.a;
                    kotlin.a.a(obj2);
                    obj = ((Result) obj2).d();
                    if (obj instanceof Result.Failure) {
                        Logger.DefaultImpls.info$default(aVar4.l, "Push token successfully deleted", null, 2, null);
                        aVar4.g.send(new kiy0(str2, ru.rustore.sdk.pushclient.b.b.a));
                        aVar3.b(s3q0.a);
                    } else {
                        RuntimeException runtimeException = new RuntimeException("Push token deletion failed", Result.a(obj));
                        Logger.DefaultImpls.warn$default(aVar4.l, "Push token deletion failed", null, 2, null);
                        aVar3.a(runtimeException);
                    }
                    return s3q0.a;
                }
                aVar = bVar.b;
                aVar2 = bVar.a;
                kotlin.a.a(obj2);
                str = (String) obj2;
                if (!drm0.N(str)) {
                    Logger.DefaultImpls.warn$default(aVar2.l, "No saved push token to delete", null, 2, null);
                    aVar.a(new IllegalStateException("No saved push token to delete"));
                    return s3q0.a;
                }
                jay0 jay0Var = aVar2.b;
                bVar.a = aVar2;
                bVar.b = aVar;
                bVar.c = str;
                bVar.f = 2;
                Object b2 = jay0Var.b(str, bVar);
                if (b2 != coroutineSingletons) {
                    aVar3 = aVar;
                    str2 = str;
                    obj = b2;
                    aVar4 = aVar2;
                    if (obj instanceof Result.Failure) {
                    }
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
        }
        bVar = new b(spjVar);
        Object obj22 = bVar.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.f;
        if (i != 0) {
        }
        str = (String) obj22;
        if (!drm0.N(str)) {
        }
    }

    public final void e(Throwable th) {
        s3q0 s3q0Var;
        synchronized (this.j) {
            do {
                try {
                    d5o0.a aVar = (d5o0.a) this.j.poll();
                    if (aVar != null) {
                        aVar.a(th);
                        s3q0Var = s3q0.a;
                    } else {
                        s3q0Var = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } while (s3q0Var != null);
            s3q0 s3q0Var2 = s3q0.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x011b, code lost:
    
        if (r2.a(r12, r4) != r5) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0127 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003d, B:15:0x0121, B:17:0x0127), top: B:13:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce A[Catch: all -> 0x0078, TryCatch #3 {all -> 0x0078, blocks: (B:32:0x00ca, B:34:0x00ce, B:38:0x010b, B:45:0x0108, B:46:0x00f6, B:53:0x006e, B:54:0x00b9), top: B:52:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        f fVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        ui50 ui50Var;
        a aVar;
        Object a;
        String str3;
        Object obj;
        ui50 ui50Var2;
        Object obj2;
        a aVar2;
        String str4;
        Throwable a2;
        try {
            if (continuationImpl instanceof f) {
                fVar = (f) continuationImpl;
                int i2 = fVar.g;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fVar.g = i2 - Integer.MIN_VALUE;
                    Object obj3 = fVar.e;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fVar.g;
                    if (i != 0) {
                        kotlin.a.a(obj3);
                        fVar.a = this;
                        str2 = str;
                        fVar.b = str2;
                        ui50Var = this.k;
                        fVar.c = ui50Var;
                        fVar.g = 1;
                        if (ui50Var.b(fVar) != coroutineSingletons) {
                            aVar = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            ui50Var = (ui50) fVar.c;
                            str3 = (String) fVar.b;
                            aVar = fVar.a;
                            try {
                                kotlin.a.a(obj3);
                                obj = ((Result) obj3).d();
                                fVar.a = aVar;
                                fVar.b = str3;
                                fVar.c = ui50Var;
                                fVar.d = obj;
                                fVar.g = 3;
                                if (aVar.a(str3, obj, fVar) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (!(obj instanceof Result.Failure)) {
                                }
                                obj2 = obj;
                                ui50Var2 = ui50Var;
                                aVar2 = aVar;
                                a2 = Result.a(obj2);
                                if (a2 != null) {
                                }
                                ui50Var2.c(null);
                                return s3q0.a;
                            } catch (Throwable th) {
                                th = th;
                                ui50Var2 = ui50Var;
                                ui50Var = ui50Var2;
                                ui50Var.c(null);
                                throw th;
                            }
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj2 = fVar.c;
                            ui50Var2 = (ui50) fVar.b;
                            aVar2 = fVar.a;
                            try {
                                kotlin.a.a(obj3);
                                a2 = Result.a(obj2);
                                if (a2 != null) {
                                    aVar2.l.error("Register for pushes has failed", a2);
                                }
                                ui50Var2.c(null);
                                return s3q0.a;
                            } catch (Throwable th2) {
                                th = th2;
                                ui50Var = ui50Var2;
                                ui50Var.c(null);
                                throw th;
                            }
                        }
                        Object obj4 = fVar.d;
                        ui50 ui50Var3 = (ui50) fVar.c;
                        str3 = (String) fVar.b;
                        aVar = fVar.a;
                        try {
                            kotlin.a.a(obj3);
                            obj = obj4;
                            ui50Var = ui50Var3;
                            if (!(obj instanceof Result.Failure)) {
                                nay0 nay0Var = (nay0) obj;
                                Logger logger = aVar.l;
                                Logger.DefaultImpls.info$default(logger, "Register for pushes completed, result = " + nay0Var.a, null, 2, null);
                                int i3 = C2397a.a[nay0Var.a.ordinal()];
                                if (i3 == 1) {
                                    str4 = "Register for pushes successful, host = " + nay0Var.b.getPackageName();
                                } else if (i3 != 2) {
                                    d4z0 d4z0Var = aVar.f;
                                    fVar.a = aVar;
                                    fVar.b = ui50Var;
                                    fVar.c = obj;
                                    fVar.d = null;
                                    fVar.g = 4;
                                } else {
                                    str4 = "Result is already registered";
                                }
                                Logger.DefaultImpls.info$default(logger, str4, null, 2, null);
                                d4z0 d4z0Var2 = aVar.f;
                                fVar.a = aVar;
                                fVar.b = ui50Var;
                                fVar.c = obj;
                                fVar.d = null;
                                fVar.g = 4;
                            }
                            obj2 = obj;
                            ui50Var2 = ui50Var;
                            aVar2 = aVar;
                            a2 = Result.a(obj2);
                            if (a2 != null) {
                            }
                            ui50Var2.c(null);
                            return s3q0.a;
                        } catch (Throwable th3) {
                            th = th3;
                            ui50Var2 = ui50Var3;
                            ui50Var = ui50Var2;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    ui50Var = (ui50) fVar.c;
                    String str5 = (String) fVar.b;
                    aVar = fVar.a;
                    kotlin.a.a(obj3);
                    str2 = str5;
                    p2z0 p2z0Var = aVar.e;
                    fVar.a = aVar;
                    fVar.b = str2;
                    fVar.c = ui50Var;
                    fVar.g = 2;
                    a = p2z0Var.a(str2, fVar);
                    if (a != coroutineSingletons) {
                        str3 = str2;
                        obj = a;
                        fVar.a = aVar;
                        fVar.b = str3;
                        fVar.c = ui50Var;
                        fVar.d = obj;
                        fVar.g = 3;
                        if (aVar.a(str3, obj, fVar) == coroutineSingletons) {
                        }
                        if (!(obj instanceof Result.Failure)) {
                        }
                        obj2 = obj;
                        ui50Var2 = ui50Var;
                        aVar2 = aVar;
                        a2 = Result.a(obj2);
                        if (a2 != null) {
                        }
                        ui50Var2.c(null);
                        return s3q0.a;
                    }
                    return coroutineSingletons;
                }
            }
            p2z0 p2z0Var2 = aVar.e;
            fVar.a = aVar;
            fVar.b = str2;
            fVar.c = ui50Var;
            fVar.g = 2;
            a = p2z0Var2.a(str2, fVar);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            th = th4;
            ui50Var.c(null);
            throw th;
        }
        fVar = new f(continuationImpl);
        Object obj32 = fVar.e;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fVar.g;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r2.h(r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r2.f(r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        e eVar;
        int i;
        Object a;
        a aVar;
        String str;
        if (continuationImpl instanceof e) {
            eVar = (e) continuationImpl;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
                Object obj = eVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eVar.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(this.l, "Calling register for pushes", null, 2, null);
                    eVar.a = this;
                    eVar.d = 1;
                    a = this.b.a(eVar);
                    if (a != coroutineSingletons) {
                        aVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                aVar = eVar.a;
                kotlin.a.a(obj);
                a = ((kay0) obj).a;
                str = (String) a;
                if (drm0.N(str)) {
                    eVar.a = null;
                    eVar.d = 3;
                } else {
                    Logger.DefaultImpls.warn$default(aVar.l, "No saved push token found.", null, 2, null);
                    d5o0 d5o0Var = new d5o0();
                    d5o0.a aVar2 = (d5o0.a) new Pair(d5o0Var, new d5o0.a()).g();
                    eVar.a = null;
                    eVar.d = 2;
                }
                return coroutineSingletons;
            }
        }
        eVar = new e(continuationImpl);
        Object obj2 = eVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.d;
        if (i != 0) {
        }
        str = (String) a;
        if (drm0.N(str)) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|179|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0040, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0233, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0053, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x003d, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x029f, code lost:
    
        if (r5.h(r2, r0) == r1) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0124 A[Catch: all -> 0x0132, TimeoutCancellationException -> 0x0135, TryCatch #16 {TimeoutCancellationException -> 0x0135, all -> 0x0132, blocks: (B:108:0x010c, B:110:0x0124, B:112:0x012a, B:113:0x0138, B:114:0x013f, B:115:0x0140), top: B:107:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0140 A[Catch: all -> 0x0132, TimeoutCancellationException -> 0x0135, TRY_LEAVE, TryCatch #16 {TimeoutCancellationException -> 0x0135, all -> 0x0132, blocks: (B:108:0x010c, B:110:0x0124, B:112:0x012a, B:113:0x0138, B:114:0x013f, B:115:0x0140), top: B:107:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00d9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01df A[Catch: TimeoutCancellationException -> 0x0040, all -> 0x0203, TryCatch #1 {TimeoutCancellationException -> 0x0040, blocks: (B:16:0x0038, B:17:0x01d7, B:19:0x01df, B:20:0x01e8, B:29:0x0200, B:37:0x0207, B:38:0x0208, B:39:0x0209, B:40:0x0217, B:94:0x005c, B:104:0x006c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0209 A[Catch: TimeoutCancellationException -> 0x0040, all -> 0x0203, TryCatch #1 {TimeoutCancellationException -> 0x0040, blocks: (B:16:0x0038, B:17:0x01d7, B:19:0x01df, B:20:0x01e8, B:29:0x0200, B:37:0x0207, B:38:0x0208, B:39:0x0209, B:40:0x0217, B:94:0x005c, B:104:0x006c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192 A[Catch: all -> 0x0203, TimeoutCancellationException -> 0x0218, TryCatch #4 {all -> 0x0203, blocks: (B:17:0x01d7, B:19:0x01df, B:20:0x01e8, B:29:0x0200, B:37:0x0207, B:38:0x0208, B:39:0x0209, B:40:0x0217, B:47:0x018e, B:49:0x0192, B:52:0x0199, B:58:0x01ac, B:61:0x01b4, B:63:0x01c6, B:70:0x021c, B:72:0x0222, B:73:0x0229, B:74:0x0230), top: B:46:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0222 A[Catch: all -> 0x0203, TimeoutCancellationException -> 0x0218, TryCatch #4 {all -> 0x0203, blocks: (B:17:0x01d7, B:19:0x01df, B:20:0x01e8, B:29:0x0200, B:37:0x0207, B:38:0x0208, B:39:0x0209, B:40:0x0217, B:47:0x018e, B:49:0x0192, B:52:0x0199, B:58:0x01ac, B:61:0x01b4, B:63:0x01c6, B:70:0x021c, B:72:0x0222, B:73:0x0229, B:74:0x0230), top: B:46:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.d5o0$a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19, types: [xsna.d5o0$a] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [ru.rustore.sdk.pushclient.a.a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(d5o0.a aVar, ContinuationImpl continuationImpl) {
        g gVar;
        ?? r2;
        ?? r5;
        String message;
        int incrementAndGet;
        a aVar2;
        ru.rustore.sdk.pushclient.s.b bVar;
        d5o0.a aVar3;
        a aVar4;
        a aVar5;
        String packageName;
        Object c2;
        a aVar6;
        Object obj;
        a aVar7;
        d5o0.a aVar8;
        a aVar9;
        Object d2;
        a aVar10;
        Throwable a;
        String str;
        a aVar11;
        s3q0 s3q0Var;
        if (continuationImpl instanceof g) {
            gVar = (g) continuationImpl;
            int i = gVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.f = i - Integer.MIN_VALUE;
                Object obj2 = gVar.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r2 = gVar.f;
                switch (r2) {
                    case 0:
                        kotlin.a.a(obj2);
                        Logger.DefaultImpls.info$default(this.l, "Full re-subscription has been requested", null, 2, null);
                        synchronized (this.j) {
                            if (!this.j.isEmpty()) {
                                this.j.add(aVar);
                                Logger.DefaultImpls.info$default(this.l, "Re-subscription is in progress already", null, 2, null);
                                return s3q0.a;
                            }
                            this.j.add(aVar);
                            try {
                                bVar = this.c;
                                try {
                                    gVar.a = this;
                                    gVar.b = aVar;
                                    gVar.f = 1;
                                } catch (TimeoutCancellationException e2) {
                                    aVar3 = aVar;
                                    e = e2;
                                    aVar4 = this;
                                    r2 = aVar3;
                                    r5 = aVar4;
                                    r5.l.error("Re-subscription failed due to timeout: ", e);
                                    message = e.getMessage();
                                    if (message == null) {
                                    }
                                    r5.e(new Throwable(message));
                                    incrementAndGet = r5.m.incrementAndGet();
                                    if (incrementAndGet <= 2) {
                                    }
                                    return s3q0.a;
                                } catch (Throwable th) {
                                    th = th;
                                    aVar2 = this;
                                    aVar2.l.error("Re-subscription failed: ", th);
                                    aVar2.e(th);
                                    return s3q0.a;
                                }
                            } catch (TimeoutCancellationException e3) {
                                e = e3;
                                r2 = this;
                                r5 = r2;
                                r2 = aVar;
                                e = e;
                                r5.l.error("Re-subscription failed due to timeout: ", e);
                                message = e.getMessage();
                                if (message == null) {
                                }
                                r5.e(new Throwable(message));
                                incrementAndGet = r5.m.incrementAndGet();
                                if (incrementAndGet <= 2) {
                                }
                                return s3q0.a;
                            } catch (Throwable th2) {
                                th = th2;
                                r2 = this;
                                aVar2 = r2;
                                aVar2.l.error("Re-subscription failed: ", th);
                                aVar2.e(th);
                                return s3q0.a;
                            }
                            if (bVar.a(true, gVar) != coroutineSingletons) {
                                aVar5 = this;
                                ru.rustore.sdk.pushclient.m.b bVar2 = aVar5.a;
                                try {
                                    gVar.a = aVar5;
                                    gVar.b = aVar;
                                    gVar.f = 2;
                                    obj2 = bVar2.invoke(gVar);
                                    if (obj2 == coroutineSingletons) {
                                    }
                                    z9y0 z9y0Var = ((jfy0) obj2).a;
                                    packageName = ((AppInfo) j5g.Y(z9y0Var.a())).getPackageName();
                                    aVar5.g.send(new liy0(packageName));
                                    gVar.a = aVar5;
                                    gVar.b = aVar;
                                    gVar.c = packageName;
                                    gVar.f = 3;
                                    c2 = z9y0Var.c(gVar);
                                } catch (TimeoutCancellationException e4) {
                                    aVar3 = aVar;
                                    e = e4;
                                    aVar4 = aVar5;
                                    r2 = aVar3;
                                    r5 = aVar4;
                                    r5.l.error("Re-subscription failed due to timeout: ", e);
                                    message = e.getMessage();
                                    if (message == null) {
                                    }
                                    r5.e(new Throwable(message));
                                    incrementAndGet = r5.m.incrementAndGet();
                                    if (incrementAndGet <= 2) {
                                    }
                                    return s3q0.a;
                                }
                                if (c2 != coroutineSingletons) {
                                    aVar6 = aVar5;
                                    r2 = aVar;
                                    obj = c2;
                                    aVar7 = aVar6;
                                    try {
                                        aVar7.g.send(new efy0(packageName, obj, aVar7.h.getTimePassed(liy0.class)));
                                    } catch (TimeoutCancellationException e5) {
                                        e = e5;
                                        r5 = aVar7;
                                        r5.l.error("Re-subscription failed due to timeout: ", e);
                                        message = e.getMessage();
                                        if (message == null) {
                                        }
                                        r5.e(new Throwable(message));
                                        incrementAndGet = r5.m.incrementAndGet();
                                        if (incrementAndGet <= 2) {
                                        }
                                        return s3q0.a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        aVar2 = aVar7;
                                        aVar2.l.error("Re-subscription failed: ", th);
                                        aVar2.e(th);
                                        return s3q0.a;
                                    }
                                    if (ResultExtensionsKt.isValid(obj)) {
                                        Throwable a2 = Result.a(obj);
                                        if (a2 == null) {
                                            a2 = new RuntimeException("Auth token error");
                                        }
                                        aVar7.l.warn("Auth token error", a2);
                                        throw a2;
                                    }
                                    Logger.DefaultImpls.info$default(aVar7.l, "Auth token has been obtained", null, 2, null);
                                    iid iidVar = aVar7.d;
                                    gVar.a = aVar7;
                                    gVar.b = r2;
                                    gVar.c = obj;
                                    gVar.f = 4;
                                    wkz wkzVar = ((yoy0) iidVar.b).a;
                                    if (coroutineSingletons != null) {
                                        aVar8 = r2;
                                        aVar9 = aVar7;
                                        obj2 = null;
                                        try {
                                            jay0 jay0Var = aVar9.b;
                                            kotlin.a.a(obj);
                                            gVar.a = aVar9;
                                            gVar.b = aVar8;
                                            gVar.c = null;
                                            gVar.f = 5;
                                            d2 = jay0Var.d((String) obj, (ClientId) obj2, gVar);
                                        } catch (TimeoutCancellationException e6) {
                                            e = e6;
                                            d5o0.a aVar12 = aVar8;
                                            r5 = aVar9;
                                            r2 = aVar12;
                                            r5.l.error("Re-subscription failed due to timeout: ", e);
                                            message = e.getMessage();
                                            if (message == null) {
                                            }
                                            r5.e(new Throwable(message));
                                            incrementAndGet = r5.m.incrementAndGet();
                                            if (incrementAndGet <= 2) {
                                            }
                                            return s3q0.a;
                                        }
                                        if (d2 != coroutineSingletons) {
                                            aVar = aVar8;
                                            aVar10 = aVar9;
                                            try {
                                                aVar10.g.send(new ru.rustore.sdk.pushclient.e.a(d2, aVar10.h.getTimePassed(efy0.class)));
                                            } catch (TimeoutCancellationException e7) {
                                                aVar3 = aVar;
                                                e = e7;
                                                aVar4 = aVar10;
                                                r2 = aVar3;
                                                r5 = aVar4;
                                                r5.l.error("Re-subscription failed due to timeout: ", e);
                                                message = e.getMessage();
                                                if (message == null) {
                                                    message = "";
                                                }
                                                r5.e(new Throwable(message));
                                                incrementAndGet = r5.m.incrementAndGet();
                                                if (incrementAndGet <= 2) {
                                                    r5.m.incrementAndGet();
                                                    Logger.DefaultImpls.info$default(r5.l, lhg.a(incrementAndGet, "The SDK is already trying to re-subscribe again. retry count "), null, 2, null);
                                                    gVar.a = null;
                                                    gVar.b = null;
                                                    gVar.c = null;
                                                    gVar.f = 7;
                                                    break;
                                                } else {
                                                    Logger.DefaultImpls.info$default(r5.l, "Exceeded the maximum number of retry attempts 2", null, 2, null);
                                                    r5.m.set(0);
                                                }
                                                return s3q0.a;
                                            }
                                            try {
                                                try {
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    r2 = aVar10;
                                                    aVar2 = r2;
                                                    aVar2.l.error("Re-subscription failed: ", th);
                                                    aVar2.e(th);
                                                    return s3q0.a;
                                                }
                                            } catch (TimeoutCancellationException e8) {
                                                e = e8;
                                                r2 = aVar10;
                                                r5 = r2;
                                                r2 = aVar;
                                                e = e;
                                                r5.l.error("Re-subscription failed due to timeout: ", e);
                                                message = e.getMessage();
                                                if (message == null) {
                                                }
                                                r5.e(new Throwable(message));
                                                incrementAndGet = r5.m.incrementAndGet();
                                                if (incrementAndGet <= 2) {
                                                }
                                                return s3q0.a;
                                            }
                                            if (!(d2 instanceof Result.Failure)) {
                                                kay0 kay0Var = (kay0) (d2 instanceof Result.Failure ? null : d2);
                                                String str2 = kay0Var != null ? kay0Var.a : null;
                                                if (str2 == null) {
                                                    str2 = null;
                                                }
                                                if (str2 != null && !drm0.N(str2)) {
                                                    Logger.DefaultImpls.info$default(aVar10.l, "Push token has been obtained", null, 2, null);
                                                    kotlin.a.a(d2);
                                                    String str3 = ((kay0) d2).a;
                                                    gVar.a = aVar10;
                                                    gVar.b = aVar;
                                                    gVar.c = str3;
                                                    gVar.f = 6;
                                                    Object b2 = aVar10.b(str3, gVar);
                                                    if (b2 != coroutineSingletons) {
                                                        str = str3;
                                                        obj2 = b2;
                                                        aVar11 = aVar10;
                                                        if (((Boolean) obj2).booleanValue()) {
                                                            IOException iOException = new IOException("Can't store push token");
                                                            aVar11.l.warn("Push token error", iOException);
                                                            throw iOException;
                                                        }
                                                        Logger.DefaultImpls.info$default(aVar11.l, "Re-subscription has successfully completed", null, 2, null);
                                                        synchronized (aVar11.j) {
                                                            do {
                                                                try {
                                                                    d5o0.a aVar13 = (d5o0.a) aVar11.j.poll();
                                                                    if (aVar13 != null) {
                                                                        aVar13.b(str);
                                                                        s3q0Var = s3q0.a;
                                                                    } else {
                                                                        s3q0Var = null;
                                                                    }
                                                                } finally {
                                                                }
                                                            } while (s3q0Var != null);
                                                            s3q0 s3q0Var2 = s3q0.a;
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }
                                            }
                                            a = Result.a(d2);
                                            if (a == null) {
                                                a = new RuntimeException("Push token is empty");
                                            }
                                            aVar10.l.warn("Push token error", a);
                                            throw a;
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                    case 1:
                        aVar = gVar.b;
                        aVar5 = gVar.a;
                        kotlin.a.a(obj2);
                        ru.rustore.sdk.pushclient.m.b bVar22 = aVar5.a;
                        gVar.a = aVar5;
                        gVar.b = aVar;
                        gVar.f = 2;
                        obj2 = bVar22.invoke(gVar);
                        if (obj2 == coroutineSingletons) {
                        }
                        z9y0 z9y0Var2 = ((jfy0) obj2).a;
                        packageName = ((AppInfo) j5g.Y(z9y0Var2.a())).getPackageName();
                        aVar5.g.send(new liy0(packageName));
                        gVar.a = aVar5;
                        gVar.b = aVar;
                        gVar.c = packageName;
                        gVar.f = 3;
                        c2 = z9y0Var2.c(gVar);
                        if (c2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        aVar = gVar.b;
                        aVar5 = gVar.a;
                        kotlin.a.a(obj2);
                        z9y0 z9y0Var22 = ((jfy0) obj2).a;
                        packageName = ((AppInfo) j5g.Y(z9y0Var22.a())).getPackageName();
                        aVar5.g.send(new liy0(packageName));
                        gVar.a = aVar5;
                        gVar.b = aVar;
                        gVar.c = packageName;
                        gVar.f = 3;
                        c2 = z9y0Var22.c(gVar);
                        if (c2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        String str4 = (String) gVar.c;
                        d5o0.a aVar14 = gVar.b;
                        a aVar15 = gVar.a;
                        kotlin.a.a(obj2);
                        c2 = ((Result) obj2).d();
                        aVar6 = aVar15;
                        packageName = str4;
                        r2 = aVar14;
                        obj = c2;
                        aVar7 = aVar6;
                        aVar7.g.send(new efy0(packageName, obj, aVar7.h.getTimePassed(liy0.class)));
                        if (ResultExtensionsKt.isValid(obj)) {
                        }
                        break;
                    case 4:
                        obj = gVar.c;
                        d5o0.a aVar16 = gVar.b;
                        a aVar17 = gVar.a;
                        kotlin.a.a(obj2);
                        aVar8 = aVar16;
                        aVar9 = aVar17;
                        jay0 jay0Var2 = aVar9.b;
                        kotlin.a.a(obj);
                        gVar.a = aVar9;
                        gVar.b = aVar8;
                        gVar.c = null;
                        gVar.f = 5;
                        d2 = jay0Var2.d((String) obj, (ClientId) obj2, gVar);
                        if (d2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        aVar = gVar.b;
                        aVar9 = gVar.a;
                        kotlin.a.a(obj2);
                        d2 = ((Result) obj2).d();
                        aVar10 = aVar9;
                        aVar10.g.send(new ru.rustore.sdk.pushclient.e.a(d2, aVar10.h.getTimePassed(efy0.class)));
                        if (!(d2 instanceof Result.Failure)) {
                        }
                        a = Result.a(d2);
                        if (a == null) {
                        }
                        aVar10.l.warn("Push token error", a);
                        throw a;
                    case 6:
                        str = (String) gVar.c;
                        d5o0.a aVar18 = gVar.b;
                        a aVar19 = gVar.a;
                        kotlin.a.a(obj2);
                        aVar11 = aVar19;
                        if (((Boolean) obj2).booleanValue()) {
                        }
                        break;
                    case 7:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        gVar = new g(continuationImpl);
        Object obj22 = gVar.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = gVar.f;
        switch (r2) {
        }
    }
}
