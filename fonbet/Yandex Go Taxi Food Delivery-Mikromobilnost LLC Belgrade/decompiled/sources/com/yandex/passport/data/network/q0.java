package com.yandex.passport.data.network;

import defpackage.d5j0;
import defpackage.evu0;
import defpackage.j73;
import defpackage.kvj0;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.scc;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes8.dex */
public final class q0 extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.common.network.m b;
    public final com.yandex.passport.data.network.core.p c;
    public final com.yandex.passport.data.network.core.h d;

    public q0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.m mVar, com.yandex.passport.data.network.core.p pVar, com.yandex.passport.data.network.core.h hVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = mVar;
        this.c = pVar;
        this.d = hVar;
    }

    public static String e(o0 o0Var) {
        return "lat=" + o0Var.a + ";lon=" + o0Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(p0 p0Var, ContinuationImpl continuationImpl) {
        CheckVpnBlockRequest$createRequest$1 checkVpnBlockRequest$createRequest$1;
        int i;
        com.yandex.passport.common.network.r rVar;
        if (continuationImpl instanceof CheckVpnBlockRequest$createRequest$1) {
            checkVpnBlockRequest$createRequest$1 = (CheckVpnBlockRequest$createRequest$1) continuationImpl;
            int i2 = checkVpnBlockRequest$createRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkVpnBlockRequest$createRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkVpnBlockRequest$createRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkVpnBlockRequest$createRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.data.models.g gVar = p0Var.a;
                    Pair pair = p0Var.i;
                    String str = p0Var.f;
                    com.yandex.passport.common.network.r g = oo31.g((String) oo31.h(0L, this.c, gVar).a, "/tmgrdfrend/checkvpn");
                    g.b("placemark", p0Var.b);
                    o0 o0Var = p0Var.c;
                    g.b("gps", o0Var != null ? e(o0Var) : null);
                    List list = p0Var.d;
                    if (list.isEmpty()) {
                        list = null;
                    }
                    g.b("product_location", list != null ? kotlin.collections.a.X(list, Extension.FIX_SPACE, null, null, new com.yandex.passport.common.network.t(this, 2), 30) : null);
                    List list2 = p0Var.e;
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    g.b("device_geo_location", list2 != null ? kotlin.collections.a.X(list2, Extension.FIX_SPACE, null, null, new com.yandex.passport.common.network.t(this, 3), 30) : null);
                    if (str != null) {
                        g.b("auth_token", "OAuth ".concat(str));
                    }
                    g.b(CommonUrlParts.APP_ID, p0Var.g);
                    g.b(StartupRequest.PARAM_APP_VERSION, p0Var.h);
                    StringBuilder sb = new StringBuilder();
                    sb.append(pair.c());
                    sb.append(HexString.CHAR_COMMA);
                    sb.append(pair.f());
                    g.b("sim_region", sb.toString());
                    g.b("device_region", p0Var.j);
                    g.b("Cookie", p0Var.k);
                    for (Map.Entry entry : p0Var.l.entrySet()) {
                        g.b((String) entry.getKey(), j73.L((String[]) entry.getValue(), Extension.FIX_SPACE, null, null, 62));
                    }
                    checkVpnBlockRequest$createRequest$1.L$0 = g;
                    checkVpnBlockRequest$createRequest$1.label = 1;
                    if (this.d.a(g, checkVpnBlockRequest$createRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = g;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (com.yandex.passport.common.network.r) checkVpnBlockRequest$createRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                return rVar.a();
            }
        }
        checkVpnBlockRequest$createRequest$1 = new CheckVpnBlockRequest$createRequest$1(this, continuationImpl);
        Object obj2 = checkVpnBlockRequest$createRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkVpnBlockRequest$createRequest$1.label;
        if (i != 0) {
        }
        return rVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r14v12, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x011b -> B:11:0x0121). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0131 -> B:12:0x0133). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(d5j0 d5j0Var, ContinuationImpl continuationImpl) {
        CheckVpnBlockRequest$executeWithRetryPolicy$1 checkVpnBlockRequest$executeWithRetryPolicy$1;
        int i;
        q0 q0Var;
        int i2;
        List list;
        d5j0 d5j0Var2;
        Ref$ObjectRef ref$ObjectRef;
        int i3;
        Throwable th;
        int i4;
        q0 q0Var2;
        d5j0 d5j0Var3;
        Result.Failure failure;
        Object obj;
        TimeoutCancellationException e;
        if (continuationImpl instanceof CheckVpnBlockRequest$executeWithRetryPolicy$1) {
            checkVpnBlockRequest$executeWithRetryPolicy$1 = (CheckVpnBlockRequest$executeWithRetryPolicy$1) continuationImpl;
            int i5 = checkVpnBlockRequest$executeWithRetryPolicy$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                checkVpnBlockRequest$executeWithRetryPolicy$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = checkVpnBlockRequest$executeWithRetryPolicy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkVpnBlockRequest$executeWithRetryPolicy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List g = scc.g(new Long(1000L), new Long(1000L), new Long(5000L));
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    int size = g.size() + 1;
                    q0Var = this;
                    i2 = 0;
                    list = g;
                    d5j0Var2 = d5j0Var;
                    ref$ObjectRef = ref$ObjectRef2;
                    i3 = size;
                    if (i2 >= i3) {
                    }
                } else if (i == 1) {
                    i2 = checkVpnBlockRequest$executeWithRetryPolicy$1.I$2;
                    i4 = checkVpnBlockRequest$executeWithRetryPolicy$1.I$1;
                    i3 = checkVpnBlockRequest$executeWithRetryPolicy$1.I$0;
                    ref$ObjectRef = (Ref$ObjectRef) checkVpnBlockRequest$executeWithRetryPolicy$1.L$3;
                    list = (List) checkVpnBlockRequest$executeWithRetryPolicy$1.L$2;
                    d5j0Var3 = (d5j0) checkVpnBlockRequest$executeWithRetryPolicy$1.L$1;
                    q0Var2 = (q0) checkVpnBlockRequest$executeWithRetryPolicy$1.L$0;
                    try {
                        try {
                            kotlin.b.b(obj2);
                        } catch (CancellationException e2) {
                            throw e2;
                        }
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                        failure = new Result.Failure(e);
                        obj = failure;
                        if (obj instanceof Result.Failure) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        failure = new Result.Failure(th);
                        obj = failure;
                        if (obj instanceof Result.Failure) {
                        }
                    }
                    Object value = ((Result) obj2).getValue();
                    kotlin.b.b(value);
                    obj = (kvj0) value;
                    if (obj instanceof Result.Failure) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = checkVpnBlockRequest$executeWithRetryPolicy$1.I$1;
                    int i7 = checkVpnBlockRequest$executeWithRetryPolicy$1.I$0;
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) checkVpnBlockRequest$executeWithRetryPolicy$1.L$3;
                    List list2 = (List) checkVpnBlockRequest$executeWithRetryPolicy$1.L$2;
                    d5j0 d5j0Var4 = (d5j0) checkVpnBlockRequest$executeWithRetryPolicy$1.L$1;
                    q0 q0Var3 = (q0) checkVpnBlockRequest$executeWithRetryPolicy$1.L$0;
                    kotlin.b.b(obj2);
                    d5j0Var2 = d5j0Var4;
                    list = list2;
                    ref$ObjectRef = ref$ObjectRef3;
                    i3 = i7;
                    i4 = i6;
                    i2 = i4 + 1;
                    q0Var = q0Var3;
                    if (i2 >= i3) {
                        try {
                        } catch (TimeoutCancellationException e4) {
                            d5j0Var3 = d5j0Var2;
                            e = e4;
                            q0Var2 = q0Var;
                            i4 = i2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            if (obj instanceof Result.Failure) {
                            }
                        } catch (Throwable th3) {
                            d5j0Var3 = d5j0Var2;
                            th = th3;
                            q0Var2 = q0Var;
                            i4 = i2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            if (obj instanceof Result.Failure) {
                            }
                        }
                        com.yandex.passport.common.network.m mVar = q0Var.b;
                        checkVpnBlockRequest$executeWithRetryPolicy$1.L$0 = q0Var;
                        checkVpnBlockRequest$executeWithRetryPolicy$1.L$1 = d5j0Var2;
                        checkVpnBlockRequest$executeWithRetryPolicy$1.L$2 = list;
                        checkVpnBlockRequest$executeWithRetryPolicy$1.L$3 = ref$ObjectRef;
                        checkVpnBlockRequest$executeWithRetryPolicy$1.I$0 = i3;
                        checkVpnBlockRequest$executeWithRetryPolicy$1.I$1 = i2;
                        checkVpnBlockRequest$executeWithRetryPolicy$1.I$2 = i2;
                        checkVpnBlockRequest$executeWithRetryPolicy$1.label = 1;
                        Object a = mVar.a(d5j0Var2, checkVpnBlockRequest$executeWithRetryPolicy$1);
                        if (a != coroutineSingletons) {
                            d5j0Var3 = d5j0Var2;
                            obj2 = a;
                            q0Var2 = q0Var;
                            i4 = i2;
                            Object value2 = ((Result) obj2).getValue();
                            kotlin.b.b(value2);
                            obj = (kvj0) value2;
                            if (obj instanceof Result.Failure) {
                                return (kvj0) obj;
                            }
                            ref$ObjectRef.element = Result.a(obj);
                            if (i2 < list.size()) {
                                Throwable th4 = (Throwable) ref$ObjectRef.element;
                                if (!(th4 instanceof IOException)) {
                                    if (th4 == null) {
                                        throw new IOException("Unknown error during checkVpn request");
                                    }
                                    throw th4;
                                }
                                long longValue = ((Number) list.get(i2)).longValue();
                                checkVpnBlockRequest$executeWithRetryPolicy$1.L$0 = q0Var2;
                                checkVpnBlockRequest$executeWithRetryPolicy$1.L$1 = d5j0Var3;
                                checkVpnBlockRequest$executeWithRetryPolicy$1.L$2 = list;
                                checkVpnBlockRequest$executeWithRetryPolicy$1.L$3 = ref$ObjectRef;
                                checkVpnBlockRequest$executeWithRetryPolicy$1.I$0 = i3;
                                checkVpnBlockRequest$executeWithRetryPolicy$1.I$1 = i4;
                                checkVpnBlockRequest$executeWithRetryPolicy$1.label = 2;
                                if (kotlinx.coroutines.a.i(longValue, checkVpnBlockRequest$executeWithRetryPolicy$1) != coroutineSingletons) {
                                    i6 = i4;
                                    i7 = i3;
                                    ref$ObjectRef3 = ref$ObjectRef;
                                    list2 = list;
                                    d5j0Var4 = d5j0Var3;
                                    q0Var3 = q0Var2;
                                    d5j0Var2 = d5j0Var4;
                                    list = list2;
                                    ref$ObjectRef = ref$ObjectRef3;
                                    i3 = i7;
                                    i4 = i6;
                                    i2 = i4 + 1;
                                    q0Var = q0Var3;
                                    if (i2 >= i3) {
                                        Throwable th5 = (Throwable) ref$ObjectRef.element;
                                        if (th5 == null) {
                                            throw new IOException("checkVpn request failed");
                                        }
                                        throw th5;
                                    }
                                }
                            } else {
                                d5j0Var2 = d5j0Var3;
                                q0Var3 = q0Var2;
                                i2 = i4 + 1;
                                q0Var = q0Var3;
                                if (i2 >= i3) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        checkVpnBlockRequest$executeWithRetryPolicy$1 = new CheckVpnBlockRequest$executeWithRetryPolicy$1(this, continuationImpl);
        Object obj22 = checkVpnBlockRequest$executeWithRetryPolicy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkVpnBlockRequest$executeWithRetryPolicy$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(7:11|12|13|14|(5:19|20|(1:22)(2:26|(1:28)(2:29|30))|23|24)|16|17)(2:34|35))(2:36|37))(3:41|42|(2:44|40))|38))|51|6|7|(0)(0)|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0059, code lost:
    
        if (r7 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0030, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0065, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0066, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x002e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005f, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(p0 p0Var, ContinuationImpl continuationImpl) {
        CheckVpnBlockRequest$run$1 checkVpnBlockRequest$run$1;
        int i;
        Object failure;
        if (continuationImpl instanceof CheckVpnBlockRequest$run$1) {
            checkVpnBlockRequest$run$1 = (CheckVpnBlockRequest$run$1) continuationImpl;
            int i2 = checkVpnBlockRequest$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkVpnBlockRequest$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkVpnBlockRequest$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkVpnBlockRequest$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    checkVpnBlockRequest$run$1.L$0 = this;
                    checkVpnBlockRequest$run$1.label = 1;
                    obj = c(p0Var, checkVpnBlockRequest$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (q0) checkVpnBlockRequest$run$1.L$0;
                        kotlin.b.b(obj);
                        Object failure2 = (kvj0) obj;
                        if (!(failure2 instanceof Result.Failure)) {
                            try {
                                kvj0 kvj0Var = (kvj0) failure2;
                                this.getClass();
                                List g = kvj0Var.y.g("Set-Cookie");
                                if (kvj0Var.w >= 500) {
                                    failure = new l0(g);
                                } else {
                                    String obj2 = evu0.k0(com.yandex.passport.internal.util.p.b(kvj0Var)).toString();
                                    failure = evu0.J(obj2) ? new l0(g) : new m0(obj2, g);
                                }
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            failure2 = failure;
                        }
                        return new Result(failure2);
                    }
                    this = (q0) checkVpnBlockRequest$run$1.L$0;
                    kotlin.b.b(obj);
                }
                checkVpnBlockRequest$run$1.L$0 = this;
                checkVpnBlockRequest$run$1.label = 2;
                obj = this.d((d5j0) obj, checkVpnBlockRequest$run$1);
            }
        }
        checkVpnBlockRequest$run$1 = new CheckVpnBlockRequest$run$1(this, continuationImpl);
        Object obj3 = checkVpnBlockRequest$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkVpnBlockRequest$run$1.label;
        if (i != 0) {
        }
        checkVpnBlockRequest$run$1.L$0 = this;
        checkVpnBlockRequest$run$1.label = 2;
        obj3 = this.d((d5j0) obj3, checkVpnBlockRequest$run$1);
    }
}
