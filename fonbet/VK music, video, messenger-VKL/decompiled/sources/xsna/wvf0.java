package xsna;

import android.os.Build;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.time.DurationUnit;
import org.chromium.base.version_info.VersionConstants;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.j6x;
import xsna.uyc0;
import xsna.zno;

/* compiled from: RemoteSettings.kt */
/* loaded from: classes.dex */
public final class wvf0 implements i3j0 {
    public final kotlin.coroutines.d a;
    public final uir b;
    public final ad3 c;
    public final v5k d;
    public final zpy<x0j0> e;
    public final wi50 f = bay.a();

    /* compiled from: RemoteSettings.kt */
    @b6l(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {177, 83, 101}, m = "updateSettings")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return wvf0.this.b(this);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @b6l(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135, 138, VersionConstants.PRODUCT_MAJOR_VERSION, 141, 143}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<JSONObject, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = wvf0.this.new b(spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(JSONObject jSONObject, spj<? super s3q0> spjVar) {
            return ((b) create(jSONObject, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x01b4, code lost:
        
            if (r13 == r4) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x018c, code lost:
        
            if (r13 == r4) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0161, code lost:
        
            if (r13 == r4) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0139, code lost:
        
            if (r13 == r4) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
        
            if (r13 == r4) goto L84;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
        /* JADX WARN: Type inference failed for: r13v14, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref$ObjectRef ref$ObjectRef;
            Boolean bool;
            Ref$ObjectRef ref$ObjectRef2;
            Ref$ObjectRef ref$ObjectRef3;
            Ref$ObjectRef ref$ObjectRef4;
            Ref$ObjectRef ref$ObjectRef5;
            s3q0 s3q0Var;
            Object c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            uyc0.a<Integer> aVar = x0j0.f;
            switch (i) {
                case 0:
                    kotlin.a.a(obj);
                    JSONObject jSONObject = (JSONObject) this.L$0;
                    Objects.toString(jSONObject);
                    Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                    ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                    if (jSONObject.has("app_quality")) {
                        JSONObject jSONObject2 = (JSONObject) jSONObject.get("app_quality");
                        try {
                            bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        } catch (JSONException e) {
                            e = e;
                            bool = null;
                        }
                        try {
                            if (jSONObject2.has("sampling_rate")) {
                                ref$ObjectRef6.element = (Double) jSONObject2.get("sampling_rate");
                            }
                            if (jSONObject2.has("session_timeout_seconds")) {
                                ref$ObjectRef.element = (Integer) jSONObject2.get("session_timeout_seconds");
                            }
                            if (jSONObject2.has("cache_duration")) {
                                ref$ObjectRef7.element = (Integer) jSONObject2.get("cache_duration");
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                            if (bool == null) {
                            }
                        }
                    } else {
                        bool = null;
                    }
                    if (bool == null) {
                        x0j0 e3 = wvf0.this.e();
                        this.L$0 = ref$ObjectRef6;
                        this.L$1 = ref$ObjectRef;
                        this.L$2 = ref$ObjectRef7;
                        this.label = 1;
                        Object c2 = e3.c(x0j0.c, bool, this);
                        if (c2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            c2 = s3q0.a;
                        }
                        if (c2 != coroutineSingletons) {
                            ref$ObjectRef4 = ref$ObjectRef6;
                            ref$ObjectRef5 = ref$ObjectRef;
                            ref$ObjectRef3 = ref$ObjectRef7;
                            ref$ObjectRef = ref$ObjectRef5;
                            ref$ObjectRef2 = ref$ObjectRef4;
                            if (((Integer) ref$ObjectRef.element) != null) {
                                x0j0 e4 = wvf0.this.e();
                                Integer num = (Integer) ref$ObjectRef.element;
                                this.L$0 = ref$ObjectRef2;
                                this.L$1 = ref$ObjectRef3;
                                this.L$2 = null;
                                this.label = 2;
                                Object c3 = e4.c(x0j0.e, num, this);
                                if (c3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    c3 = s3q0.a;
                                    break;
                                }
                            }
                            if (((Double) ref$ObjectRef2.element) != null) {
                                x0j0 e5 = wvf0.this.e();
                                Double d = (Double) ref$ObjectRef2.element;
                                this.L$0 = ref$ObjectRef3;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 3;
                                Object c4 = e5.c(x0j0.d, d, this);
                                if (c4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    c4 = s3q0.a;
                                    break;
                                }
                            }
                            if (((Integer) ref$ObjectRef3.element) == null) {
                                s3q0Var = null;
                                if (s3q0Var == null) {
                                    x0j0 e6 = wvf0.this.e();
                                    Integer num2 = new Integer(86400);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 5;
                                    Object c5 = e6.c(aVar, num2, this);
                                    if (c5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        c5 = s3q0.a;
                                        break;
                                    }
                                }
                                x0j0 e7 = wvf0.this.e();
                                Long l = new Long(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                                c = e7.c(x0j0.g, l, this);
                                if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    c = s3q0.a;
                                    break;
                                }
                            } else {
                                x0j0 e8 = wvf0.this.e();
                                Integer num3 = (Integer) ref$ObjectRef3.element;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                                Object c6 = e8.c(aVar, num3, this);
                                if (c6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    c6 = s3q0.a;
                                    break;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef6;
                    ref$ObjectRef3 = ref$ObjectRef7;
                    if (((Integer) ref$ObjectRef.element) != null) {
                    }
                    if (((Double) ref$ObjectRef2.element) != null) {
                    }
                    if (((Integer) ref$ObjectRef3.element) == null) {
                    }
                    break;
                case 1:
                    ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
                    ref$ObjectRef5 = (Ref$ObjectRef) this.L$1;
                    ref$ObjectRef4 = (Ref$ObjectRef) this.L$0;
                    kotlin.a.a(obj);
                    ref$ObjectRef = ref$ObjectRef5;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    if (((Integer) ref$ObjectRef.element) != null) {
                    }
                    if (((Double) ref$ObjectRef2.element) != null) {
                    }
                    if (((Integer) ref$ObjectRef3.element) == null) {
                    }
                    break;
                case 2:
                    ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                    ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
                    kotlin.a.a(obj);
                    if (((Double) ref$ObjectRef2.element) != null) {
                    }
                    if (((Integer) ref$ObjectRef3.element) == null) {
                    }
                    break;
                case 3:
                    ref$ObjectRef3 = (Ref$ObjectRef) this.L$0;
                    kotlin.a.a(obj);
                    if (((Integer) ref$ObjectRef3.element) == null) {
                    }
                    break;
                case 4:
                    kotlin.a.a(obj);
                    s3q0Var = s3q0.a;
                    if (s3q0Var == null) {
                    }
                    x0j0 e72 = wvf0.this.e();
                    Long l2 = new Long(System.currentTimeMillis());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 6;
                    c = e72.c(x0j0.g, l2, this);
                    if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                    break;
                case 5:
                    kotlin.a.a(obj);
                    x0j0 e722 = wvf0.this.e();
                    Long l22 = new Long(System.currentTimeMillis());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 6;
                    c = e722.c(x0j0.g, l22, this);
                    if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                    break;
                case 6:
                    kotlin.a.a(obj);
                    return s3q0.a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: RemoteSettings.kt */
    @b6l(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<String, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = new c(2, spjVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // xsna.wzs
        public final Object invoke(String str, spj<? super s3q0> spjVar) {
            return ((c) create(str, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.L$0));
            return s3q0.a;
        }
    }

    public wvf0(@wv5 kotlin.coroutines.d dVar, uir uirVar, ad3 ad3Var, v5k v5kVar, zpy<x0j0> zpyVar) {
        this.a = dVar;
        this.b = uirVar;
        this.c = ad3Var;
        this.d = v5kVar;
        this.e = zpyVar;
    }

    @Override // xsna.i3j0
    public final Double a() {
        ysi0 ysi0Var = e().b;
        if (ysi0Var == null) {
            ysi0Var = null;
        }
        return ysi0Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:26:0x0050, B:27:0x00ae, B:29:0x00b8, B:32:0x00be, B:37:0x008c, B:39:0x0096, B:42:0x009c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:26:0x0050, B:27:0x00ae, B:29:0x00b8, B:32:0x00be, B:37:0x008c, B:39:0x0096, B:42:0x009c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:26:0x0050, B:27:0x00ae, B:29:0x00b8, B:32:0x00be, B:37:0x008c, B:39:0x0096, B:42:0x009c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:26:0x0050, B:27:0x00ae, B:29:0x00b8, B:32:0x00be, B:37:0x008c, B:39:0x0096, B:42:0x009c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    @Override // xsna.i3j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(spj<? super s3q0> spjVar) {
        a aVar;
        ?? r6;
        ui50 ui50Var;
        ui50 ui50Var2;
        wvf0 wvf0Var;
        String str;
        try {
            if (spjVar instanceof a) {
                aVar = (a) spjVar;
                int i = aVar.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.label = i - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r6 = aVar.label;
                    if (r6 != 0) {
                        kotlin.a.a(obj);
                        wi50 wi50Var = this.f;
                        if (!wi50Var.e() && !e().b()) {
                            return s3q0.a;
                        }
                        aVar.L$0 = this;
                        aVar.L$1 = wi50Var;
                        aVar.label = 1;
                        if (wi50Var.b(aVar) != coroutineSingletons) {
                            ui50Var2 = wi50Var;
                            wvf0Var = this;
                        }
                        return coroutineSingletons;
                    }
                    if (r6 != 1) {
                        if (r6 != 2) {
                            if (r6 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ui50Var = (ui50) aVar.L$0;
                            try {
                                kotlin.a.a(obj);
                                s3q0 s3q0Var = s3q0.a;
                                ui50Var.c(null);
                                return s3q0.a;
                            } catch (Throwable th) {
                                th = th;
                                ui50Var.c(null);
                                throw th;
                            }
                        }
                        ui50Var2 = (ui50) aVar.L$1;
                        wvf0Var = (wvf0) aVar.L$0;
                        kotlin.a.a(obj);
                        str = ((j6x) obj).a;
                        if (!str.equals("")) {
                            s3q0 s3q0Var2 = s3q0.a;
                            ui50Var2.c(null);
                            return s3q0Var2;
                        }
                        Pair pair = new Pair("X-Crashlytics-Installation-ID", str);
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        wvf0Var.getClass();
                        Pair pair2 = new Pair("X-Crashlytics-Device-Model", new Regex(DomExceptionUtils.SEPARATOR).g(format, ""));
                        Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", new Regex(DomExceptionUtils.SEPARATOR).g(Build.VERSION.INCREMENTAL, ""));
                        Pair pair4 = new Pair("X-Crashlytics-OS-Display-Version", new Regex(DomExceptionUtils.SEPARATOR).g(Build.VERSION.RELEASE, ""));
                        wvf0Var.c.getClass();
                        Map k = pn00.k(pair, pair2, pair3, pair4, new Pair("X-Crashlytics-API-Client-Version", "2.1.2"));
                        v5k v5kVar = wvf0Var.d;
                        b bVar = wvf0Var.new b(null);
                        c cVar = new c(2, null);
                        aVar.L$0 = ui50Var2;
                        aVar.L$1 = null;
                        aVar.label = 3;
                        if (v5kVar.a(k, bVar, cVar, aVar) != coroutineSingletons) {
                            ui50Var = ui50Var2;
                            s3q0 s3q0Var3 = s3q0.a;
                            ui50Var.c(null);
                            return s3q0.a;
                        }
                        return coroutineSingletons;
                    }
                    ui50Var2 = (ui50) aVar.L$1;
                    wvf0Var = (wvf0) aVar.L$0;
                    kotlin.a.a(obj);
                    if (wvf0Var.e().b()) {
                        s3q0 s3q0Var4 = s3q0.a;
                        ui50Var2.c(null);
                        return s3q0Var4;
                    }
                    j6x.a aVar2 = j6x.c;
                    uir uirVar = wvf0Var.b;
                    aVar.L$0 = wvf0Var;
                    aVar.L$1 = ui50Var2;
                    aVar.label = 2;
                    obj = aVar2.a(uirVar, aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = ((j6x) obj).a;
                    if (!str.equals("")) {
                    }
                }
            }
            if (r6 != 0) {
            }
            if (wvf0Var.e().b()) {
            }
        } catch (Throwable th2) {
            th = th2;
            ui50Var = r6;
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r6 = aVar.label;
    }

    @Override // xsna.i3j0
    public final Boolean c() {
        ysi0 ysi0Var = e().b;
        if (ysi0Var == null) {
            ysi0Var = null;
        }
        return ysi0Var.a;
    }

    @Override // xsna.i3j0
    public final zno d() {
        ysi0 ysi0Var = e().b;
        if (ysi0Var == null) {
            ysi0Var = null;
        }
        Integer num = ysi0Var.c;
        if (num == null) {
            return null;
        }
        zno.a aVar = zno.c;
        return new zno(eoo.e(num.intValue(), DurationUnit.SECONDS));
    }

    public final x0j0 e() {
        return this.e.get();
    }
}
