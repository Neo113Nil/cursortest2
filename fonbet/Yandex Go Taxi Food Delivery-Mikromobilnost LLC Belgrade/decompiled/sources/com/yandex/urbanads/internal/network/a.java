package com.yandex.urbanads.internal.network;

import android.content.SharedPreferences;
import com.yandex.go.mob.HostMobSupportedApiNames;
import defpackage.bg61;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.d5j0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.jwu;
import defpackage.ke1;
import defpackage.kf21;
import defpackage.kvj0;
import defpackage.me1;
import defpackage.nci0;
import defpackage.not;
import defpackage.ny61;
import defpackage.qhw0;
import defpackage.re21;
import defpackage.scc;
import defpackage.sjh;
import defpackage.t4j0;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zse;
import defpackage.zy11;
import java.io.Closeable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes2.dex */
public final class a {
    public final me1 a;
    public final re21 b;
    public final kf21 c;
    public final String d;
    public final ike e;
    public final OkHttpClient f;
    public final ke1 g;

    public a(me1 me1Var, re21 re21Var, kf21 kf21Var, String str) {
        this.a = me1Var;
        this.b = re21Var;
        this.c = kf21Var;
        this.d = str;
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.e = bvf0.a(cvw.U(a, (jse) zse.a.c));
        OkHttpClient.a aVar = new OkHttpClient.a();
        aVar.f(scc.g(Protocol.HTTP_2, Protocol.HTTP_1_1));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.x = bg61.b(30000L, timeUnit);
        aVar.b(30000L, timeUnit);
        aVar.g(30000L, timeUnit);
        this.f = new OkHttpClient(aVar);
        this.g = new ke1();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MediaAdvClient$buildEventUrl$1 mediaAdvClient$buildEventUrl$1;
        int i;
        String str2;
        if (continuationImpl instanceof MediaAdvClient$buildEventUrl$1) {
            mediaAdvClient$buildEventUrl$1 = (MediaAdvClient$buildEventUrl$1) continuationImpl;
            int i2 = mediaAdvClient$buildEventUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaAdvClient$buildEventUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaAdvClient$buildEventUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaAdvClient$buildEventUrl$1.label;
                String str3 = "https://media-adv.market.yandex.ru";
                if (i != 0) {
                    kotlin.b.b(obj);
                    mediaAdvClient$buildEventUrl$1.L$0 = str;
                    mediaAdvClient$buildEventUrl$1.label = 1;
                    not notVar = (not) this.c.a;
                    notVar.getClass();
                    obj = notVar.b(HostMobSupportedApiNames.MEDIAADV);
                    if (obj == null) {
                        notVar.c.getClass();
                        obj = "https://media-adv.market.yandex.ru";
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) mediaAdvClient$buildEventUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                str2 = (String) obj;
                if (str2 != null) {
                    String str4 = evu0.J(str2) ? null : str2;
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                return g8e.p(str3, "/events?click=", str);
            }
        }
        mediaAdvClient$buildEventUrl$1 = new MediaAdvClient$buildEventUrl$1(this, continuationImpl);
        Object obj2 = mediaAdvClient$buildEventUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaAdvClient$buildEventUrl$1.label;
        String str32 = "https://media-adv.market.yandex.ru";
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 != null) {
        }
        return g8e.p(str32, "/events?click=", str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:39|40))(3:41|42|(2:44|(1:46))(2:47|48))|12|13|14|(2:16|(1:18))|(2:27|28)|(3:22|23|24)(1:26)))|51|6|7|(0)(0)|12|13|14|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        if (r11 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        defpackage.ljo.a(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
    
        defpackage.h5z0.a.e(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[Catch: all -> 0x008a, TryCatch #3 {all -> 0x008a, blocks: (B:14:0x0060, B:16:0x0065, B:18:0x007e), top: B:13:0x0060, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[Catch: Exception -> 0x00ab, TryCatch #1 {Exception -> 0x00ab, blocks: (B:11:0x0030, B:12:0x005e, B:26:0x00a2, B:38:0x009b, B:42:0x003d, B:44:0x0051, B:47:0x00a3, B:48:0x00aa, B:35:0x0096, B:14:0x0060, B:16:0x0065, B:18:0x007e), top: B:7:0x0026, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d5j0 d5j0Var, boolean z, ContinuationImpl continuationImpl) {
        MediaAdvClient$execute$1 mediaAdvClient$execute$1;
        int i;
        Throwable th;
        Closeable closeable;
        SharedPreferences sharedPreferences = this.a.b;
        if (continuationImpl instanceof MediaAdvClient$execute$1) {
            mediaAdvClient$execute$1 = (MediaAdvClient$execute$1) continuationImpl;
            int i2 = mediaAdvClient$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaAdvClient$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mediaAdvClient$execute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaAdvClient$execute$1.label;
                th = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    OkHttpClient okHttpClient = this.f;
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    mediaAdvClient$execute$1.L$0 = null;
                    mediaAdvClient$execute$1.Z$0 = z;
                    mediaAdvClient$execute$1.label = 1;
                    if (!atomicBoolean.compareAndSet(false, true)) {
                        throw new IllegalStateException("Already executed");
                    }
                    obj = ((nci0) okHttpClient.newCall(d5j0Var)).execute();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = mediaAdvClient$execute$1.Z$0;
                    kotlin.b.b(obj);
                }
                closeable = (Closeable) obj;
                kvj0 kvj0Var = (kvj0) closeable;
                if (z) {
                    ke1 ke1Var = this.g;
                    TreeMap e = kvj0Var.y.e();
                    String string = sharedPreferences.getString("cookie", null);
                    ke1Var.getClass();
                    String a = ke1.a(string, e);
                    if (!evu0.J(a)) {
                        sharedPreferences.edit().putString("cookie", a).apply();
                    }
                }
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (th != null) {
                    return zy11.a;
                }
                throw th;
            }
        }
        mediaAdvClient$execute$1 = new MediaAdvClient$execute$1(this, continuationImpl);
        Object obj3 = mediaAdvClient$execute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaAdvClient$execute$1.label;
        th = null;
        if (i != 0) {
        }
        closeable = (Closeable) obj3;
        kvj0 kvj0Var2 = (kvj0) closeable;
        if (z) {
        }
        if (closeable != null) {
        }
        if (th != null) {
        }
    }

    public final Object c(String str, boolean z, Map map, boolean z2, SuspendLambda suspendLambda) {
        String string;
        t4j0 t4j0Var = new t4j0();
        jwu jwuVar = new jwu();
        jwuVar.i(null, str);
        t4j0Var.a = jwuVar.e();
        if (z && (string = this.a.b.getString("cookie", null)) != null) {
            t4j0Var.a("Cookie", string);
        }
        if (map == null || !map.containsKey(ExtFunctionsKt.HEADER_USER_AGENT)) {
            t4j0Var.a(ExtFunctionsKt.HEADER_USER_AGENT, this.b.a.a());
        }
        if (z2 && (map == null || !map.containsKey("Referer"))) {
            t4j0Var.a("Referer", this.d);
        }
        Object b = b(new d5j0(t4j0Var), z, suspendLambda);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }

    public final void d(String str) {
        tje.N(this.e, null, null, new MediaAdvClient$sendEvent$1(this, str, null), 3);
    }

    public final void e(String str, Map map, boolean z) {
        tje.N(this.e, null, null, new MediaAdvClient$sendPixelEvent$1(this, str, z, map, null), 3);
    }
}
