package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.backoff.ExponentialBackOff;
import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.pushsdk.connection.NotifierConnectionComponent$startConnection$1;
import com.vk.push.pushsdk.notifier.model.NotifierRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.qjx0;
import xsna.rk70;
import xsna.uje0;

/* compiled from: VkpnsNotifierMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class s4w0 implements pk70 {
    public final FeatureManager a;
    public final hpj b;
    public final l4w0 c;
    public final h18 d;
    public final nm8 e;
    public final hpj f;
    public final wi50 g;
    public final bpn0 h;
    public final CopyOnWriteArrayList<String> i;
    public final CopyOnWriteArrayList<String> j;
    public final oy1 k;

    /* compiled from: VkpnsNotifierMessagesReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.notifier.VkpnsNotifierMessagesReceiver$reconnect$1", f = "VkpnsNotifierMessagesReceiver.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isUseFailOverAddresses;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$isUseFailOverAddresses = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return s4w0.this.new a(this.$isUseFailOverAddresses, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            Iterator<String> it = s4w0.this.i.iterator();
            s4w0 s4w0Var = s4w0.this;
            while (it.hasNext()) {
                s4w0Var.j.addIfAbsent(it.next());
            }
            s4w0.this.i.clear();
            s4w0.this.c.d("Reconnect to socket");
            s4w0.this.c.c(this.$isUseFailOverAddresses);
            return s3q0.a;
        }
    }

    /* compiled from: VkpnsNotifierMessagesReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.notifier.VkpnsNotifierMessagesReceiver$startReceiveMessages$1", f = "VkpnsNotifierMessagesReceiver.kt", l = {Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, 109}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return s4w0.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        
            if (r7.a() == false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            r6.L$0 = r7;
            r6.L$1 = null;
            r6.L$2 = null;
            r6.label = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        
            if (xsna.qsl.b(100, r6) != r0) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[EDGE_INSN: B:18:0x0066->B:19:0x0066 BREAK  A[LOOP:0: B:10:0x004b->B:17:?], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:6:0x003b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007b -> B:6:0x003b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            h7g0 h7g0Var;
            s4w0 s4w0Var;
            Iterator it;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                h7g0Var = new h7g0(s4w0.this.j, 4);
            } else {
                if (i == 1) {
                    it = (Iterator) this.L$2;
                    s4w0Var = (s4w0) this.L$1;
                    h7g0 h7g0Var2 = (h7g0) this.L$0;
                    kotlin.a.a(obj);
                    h7g0Var = h7g0Var2;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        this.L$0 = h7g0Var;
                        this.L$1 = s4w0Var;
                        this.L$2 = it;
                        this.label = 1;
                        if (s4w0.j(s4w0Var, str, this) == coroutineSingletons) {
                            break;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h7g0 h7g0Var3 = (h7g0) this.L$0;
                kotlin.a.a(obj);
                h7g0Var = h7g0Var3;
            }
            if (!h7g0Var.a()) {
                return s3q0.a;
            }
            it = h7g0Var.b().iterator();
            s4w0Var = s4w0.this;
            while (true) {
                if (!it.hasNext()) {
                }
            }
            return coroutineSingletons;
        }
    }

    /* compiled from: VkpnsNotifierMessagesReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.notifier.VkpnsNotifierMessagesReceiver$stopReceiveMessages$1", f = "VkpnsNotifierMessagesReceiver.kt", l = {253, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public c(spj<? super c> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return s4w0.this.new c(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            s4w0 s4w0Var;
            ui50 ui50Var;
            s4w0 s4w0Var2;
            Iterator<String> it;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    s4w0Var = s4w0.this;
                    wi50 wi50Var = s4w0Var.g;
                    this.L$0 = wi50Var;
                    this.L$1 = s4w0Var;
                    this.label = 1;
                    if (wi50Var.b(this) != coroutineSingletons) {
                        ui50Var = wi50Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$1;
                    s4w0Var2 = (s4w0) this.L$0;
                    kotlin.a.a(obj);
                    while (it.hasNext()) {
                        String next = it.next();
                        this.L$0 = s4w0Var2;
                        this.L$1 = it;
                        this.label = 2;
                        if (s4w0.k(s4w0Var2, next, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    s4w0.this.c.d("A manual closure");
                    s4w0.this.i.clear();
                    s4w0.this.j.clear();
                    zvj.c(s4w0.this.f, null);
                    zvj.c(s4w0.this.b, null);
                    return s3q0.a;
                }
                s4w0Var = (s4w0) this.L$1;
                ui50Var = (ui50) this.L$0;
                kotlin.a.a(obj);
                s4w0Var.e.B(null);
                ui50Var.c(null);
                Iterator<String> it2 = s4w0.this.i.iterator();
                s4w0Var2 = s4w0.this;
                it = it2;
                while (it.hasNext()) {
                }
                s4w0.this.c.d("A manual closure");
                s4w0.this.i.clear();
                s4w0.this.j.clear();
                zvj.c(s4w0.this.f, null);
                zvj.c(s4w0.this.b, null);
                return s3q0.a;
            } catch (Throwable th) {
                ui50Var.c(null);
                throw th;
            }
        }
    }

    public s4w0(Logger logger, pwi pwiVar, w80 w80Var, FeatureManager featureManager) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        BackOff build = new ExponentialBackOff.Builder().build();
        hpj a2 = zvj.a(wglVar);
        l4w0 l4w0Var = new l4w0(build, (okhttp3.o) o460.a.getValue(), logger);
        h18 h18Var = new h18(new bbu(logger, l4w0Var), pwiVar);
        this.a = featureManager;
        this.b = a2;
        this.c = l4w0Var;
        this.d = h18Var;
        this.e = w0b.a(-2, null, null, 6);
        this.f = zvj.a(wglVar);
        this.g = bay.a();
        this.h = new bpn0(new q4w0(logger));
        this.i = new CopyOnWriteArrayList<>();
        this.j = new CopyOnWriteArrayList<>();
        oy1 oy1Var = new oy1(w80Var, new n4w0(this, null), new o4w0(this, null));
        this.k = oy1Var;
        Iterator it = e43.l(new l200(l()), new sk70(l(), this, pwiVar), new efg0(build, this), oy1Var).iterator();
        while (it.hasNext()) {
            l4w0Var.e.add((uhx0) it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(1:9)(2:22|23))(2:24|(1:26)(1:27))|10|11|12|13|(1:18)(2:15|16)))|28|6|(0)(0)|10|11|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        r6 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(s4w0 s4w0Var, ContinuationImpl continuationImpl) {
        r4w0 r4w0Var;
        int i;
        qjx0.a aVar;
        s4w0Var.getClass();
        if (continuationImpl instanceof r4w0) {
            r4w0Var = (r4w0) continuationImpl;
            int i2 = r4w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r4w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = r4w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r4w0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    qjx0.a aVar2 = qjx0.c;
                    FeatureManager featureManager = s4w0Var.a;
                    Feature.StringFeature websocketActiveCheckConfig = CommonFeaturesKt.getWebsocketActiveCheckConfig();
                    r4w0Var.L$0 = aVar2;
                    r4w0Var.label = 1;
                    Object featureValue = featureManager.getFeatureValue(websocketActiveCheckConfig, r4w0Var);
                    if (featureValue == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = featureValue;
                    aVar = aVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (qjx0.a) r4w0Var.L$0;
                    kotlin.a.a(obj);
                }
                String str = (String) obj;
                aVar.getClass();
                JSONObject jSONObject = new JSONObject(str);
                Object failure = new qjx0(jSONObject.getBoolean("is_enabled"), jSONObject.getLong("check_interval_ms"));
                return Result.a(failure) != null ? failure : new qjx0(false, Long.MAX_VALUE);
            }
        }
        r4w0Var = new r4w0(s4w0Var, continuationImpl);
        Object obj2 = r4w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r4w0Var.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        aVar.getClass();
        JSONObject jSONObject2 = new JSONObject(str2);
        Object failure2 = new qjx0(jSONObject2.getBoolean("is_enabled"), jSONObject2.getLong("check_interval_ms"));
        if (Result.a(failure2) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(s4w0 s4w0Var, String str, ContinuationImpl continuationImpl) {
        t4w0 t4w0Var;
        Object obj;
        int i;
        s4w0Var.getClass();
        if (continuationImpl instanceof t4w0) {
            t4w0Var = (t4w0) continuationImpl;
            int i2 = t4w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t4w0Var.label = i2 - Integer.MIN_VALUE;
                obj = t4w0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = t4w0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    h18 h18Var = s4w0Var.d;
                    t4w0Var.L$0 = s4w0Var;
                    t4w0Var.L$1 = str;
                    t4w0Var.label = 1;
                    qk70 b2 = ((pwi) h18Var.c).b(str);
                    bbu bbuVar = (bbu) h18Var.b;
                    Logger.DefaultImpls.info$default((Logger) bbuVar.b, "Subscribe for pushes with id: " + b2.a, null, 2, null);
                    obj = Boolean.valueOf(((l4w0) bbuVar.a).e(bbu.a(str, b2, NotifierRequest.SUBSCRIBE)));
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) t4w0Var.L$1;
                    s4w0Var = (s4w0) t4w0Var.L$0;
                    kotlin.a.a(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    s4w0Var.j.addIfAbsent(str);
                    Logger.DefaultImpls.debug$default(s4w0Var.l(), "Send subscribe for pushes not delivered", null, 2, null);
                } else {
                    s4w0Var.i.addIfAbsent(str);
                    s4w0Var.j.remove(str);
                    Logger.DefaultImpls.debug$default(s4w0Var.l(), "Send subscribe for pushes", null, 2, null);
                }
                return s3q0.a;
            }
        }
        t4w0Var = new t4w0(s4w0Var, continuationImpl);
        obj = t4w0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = t4w0Var.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(s4w0 s4w0Var, String str, ContinuationImpl continuationImpl) {
        u4w0 u4w0Var;
        Object obj;
        int i;
        s4w0Var.getClass();
        if (continuationImpl instanceof u4w0) {
            u4w0Var = (u4w0) continuationImpl;
            int i2 = u4w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u4w0Var.label = i2 - Integer.MIN_VALUE;
                obj = u4w0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = u4w0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    h18 h18Var = s4w0Var.d;
                    u4w0Var.L$0 = s4w0Var;
                    u4w0Var.label = 1;
                    qk70 b2 = ((pwi) h18Var.c).b(str);
                    bbu bbuVar = (bbu) h18Var.b;
                    Logger.DefaultImpls.info$default((Logger) bbuVar.b, "Unsubscribe for pushes with id: " + b2.a, null, 2, null);
                    obj = Boolean.valueOf(((l4w0) bbuVar.a).e(bbu.a(str, b2, NotifierRequest.UNSUBSCRIBE)));
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s4w0Var = (s4w0) u4w0Var.L$0;
                    kotlin.a.a(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Logger.DefaultImpls.debug$default(s4w0Var.l(), "Send unsubscribe from pushes not delivered", null, 2, null);
                } else {
                    Logger.DefaultImpls.debug$default(s4w0Var.l(), "Send unsubscribe from pushes", null, 2, null);
                }
                return s3q0.a;
            }
        }
        u4w0Var = new u4w0(s4w0Var, continuationImpl);
        obj = u4w0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = u4w0Var.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return s3q0.a;
    }

    @Override // xsna.zje0
    public final void a() {
        Logger.DefaultImpls.debug$default(l(), "Pause receive messages", null, 2, null);
        iyx.d(this.b.b);
    }

    @Override // xsna.pk70
    public final tk70 c() {
        return this.c;
    }

    @Override // xsna.zje0
    public final b9f0 d() {
        return this.e;
    }

    @Override // xsna.zje0
    public final void e() {
        Logger.DefaultImpls.debug$default(l(), "Stop receive messages", null, 2, null);
        myc0.h(this.b, null, null, new c(null), 3);
    }

    @Override // xsna.pk70
    public final Object f(String str, NotifierConnectionComponent$startConnection$1.a.C1733a c1733a) {
        if (this.i.contains(str)) {
            Logger.DefaultImpls.warn$default(l(), "You are trying subscribe already subscribed token", null, 2, null);
            return s3q0.a;
        }
        this.j.addIfAbsent(str);
        Object k = myc0.k(this.b.b, new v4w0(this, str, null), c1733a);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    @Override // xsna.zje0
    public final void g() {
        Logger.DefaultImpls.debug$default(l(), "Start receive messages", null, 2, null);
        myc0.h(this.b, null, null, new b(null), 3);
    }

    public final Logger l() {
        return (Logger) this.h.getValue();
    }

    public final void m(rk70 rk70Var) {
        if (rk70Var instanceof rk70.f) {
            Logger.DefaultImpls.debug$default(l(), "Handle subscribed token", null, 2, null);
            return;
        }
        if (rk70Var instanceof rk70.b) {
            rk70.b bVar = (rk70.b) rk70Var;
            Logger.DefaultImpls.warn$default(l(), zil0.a(bVar.a, "Method request with error message: \"", bVar.b, "\" and code = "), null, 2, null);
            return;
        }
        if (rk70Var instanceof rk70.d) {
            uje0.b bVar2 = ((rk70.d) rk70Var).a;
            Logger.DefaultImpls.debug$default(l(), "Handle " + bVar2.c.size() + " push messages", null, 2, null);
            myc0.h(this.f, null, null, new p4w0(this, bVar2, null), 3);
            return;
        }
        if (rk70Var instanceof rk70.c) {
            uje0.a aVar = ((rk70.c) rk70Var).a;
            Logger.DefaultImpls.warn$default(l(), "Received message with error " + aVar.b, null, 2, null);
            return;
        }
        if (rk70Var instanceof rk70.e) {
            n("Server says that it is on shutdown", false);
        } else if (rk70Var instanceof rk70.a) {
            oy1 oy1Var = this.k;
            oy1Var.getClass();
            myc0.h(oy1Var.e, null, null, new ty1(oy1Var, new py1(oy1Var, null), null), 3);
        }
    }

    public final void n(String str, boolean z) {
        Logger.DefaultImpls.debug$default(l(), "Start notifier reconnect because of ".concat(str), null, 2, null);
        myc0.h(this.b, null, null, new a(z, null), 3);
    }

    @Override // xsna.zje0
    public final void b(sj80 sj80Var) {
    }

    @Override // xsna.zje0
    public final void h(sj80 sj80Var) {
    }
}
