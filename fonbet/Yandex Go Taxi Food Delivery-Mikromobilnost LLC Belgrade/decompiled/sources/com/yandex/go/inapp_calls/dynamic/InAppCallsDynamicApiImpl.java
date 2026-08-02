package com.yandex.go.inapp_calls.dynamic;

import android.content.Context;
import com.yandex.go.inapp_calls.InAppCallsDynamicApi;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$Source;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$NotReadyException;
import defpackage.ik7;
import defpackage.jl40;
import defpackage.jl7;
import defpackage.mqu;
import defpackage.mz31;
import defpackage.ng7;
import defpackage.nl7;
import defpackage.ny61;
import defpackage.nz31;
import defpackage.ojv;
import defpackage.ol7;
import defpackage.pjv;
import defpackage.q501;
import defpackage.q6c0;
import defpackage.qjv;
import defpackage.qpv;
import defpackage.rjv;
import defpackage.rl7;
import defpackage.t270;
import defpackage.t6u;
import defpackage.uri0;
import defpackage.v5c0;
import defpackage.vri0;
import defpackage.xw80;
import defpackage.yg7;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/inapp_calls/dynamic/InAppCallsDynamicApiImpl;", "Lcom/yandex/go/inapp_calls/InAppCallsDynamicApi;", "", "isInit", "Z", "Lrjv;", "dependencies", "Lrjv;", "dynamic"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppCallsDynamicApiImpl implements InAppCallsDynamicApi {
    public static final InAppCallsDynamicApiImpl INSTANCE = new InAppCallsDynamicApiImpl();
    private static rjv dependencies;
    private static volatile boolean isInit;

    public static void m(qjv qjvVar) {
        rjv rjvVar = dependencies;
        if (rjvVar == null) {
            rjvVar = null;
        }
        rjvVar.f.invoke(qjvVar.i(), qjvVar.h(), qjvVar.g());
    }

    public static void n(pjv pjvVar, rl7 rl7Var) {
        q501 q501Var = nl7.b;
        rjv rjvVar = dependencies;
        if (rjvVar == null) {
            rjvVar = null;
        }
        q501.D(a.a(rjvVar.a), rl7Var, pjvVar.h());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.go.inapp_calls.InAppCallsDynamicApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qjv qjvVar, ContinuationImpl continuationImpl) {
        InAppCallsDynamicApiImpl$startOutgoingCall$1 inAppCallsDynamicApiImpl$startOutgoingCall$1;
        int i;
        try {
            if (continuationImpl instanceof InAppCallsDynamicApiImpl$startOutgoingCall$1) {
                inAppCallsDynamicApiImpl$startOutgoingCall$1 = (InAppCallsDynamicApiImpl$startOutgoingCall$1) continuationImpl;
                int i2 = inAppCallsDynamicApiImpl$startOutgoingCall$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    inAppCallsDynamicApiImpl$startOutgoingCall$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = inAppCallsDynamicApiImpl$startOutgoingCall$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = inAppCallsDynamicApiImpl$startOutgoingCall$1.label;
                    if (i != 0) {
                        b.b(obj);
                        if (!isInit) {
                            return new Result.Failure(new InAppCallsFeatureWrapper$NotReadyException("invoke init(...) function before use calls plugin"));
                        }
                        q501 q501Var = nl7.b;
                        if (q501.z()) {
                            throw new InAppCallsDynamicApi.InAppCallException.CallAlreadyStartedException();
                        }
                        InAppCallsDynamicApiImpl inAppCallsDynamicApiImpl = INSTANCE;
                        inAppCallsDynamicApiImpl$startOutgoingCall$1.L$0 = qjvVar;
                        inAppCallsDynamicApiImpl$startOutgoingCall$1.L$1 = null;
                        inAppCallsDynamicApiImpl$startOutgoingCall$1.L$2 = null;
                        inAppCallsDynamicApiImpl$startOutgoingCall$1.L$3 = null;
                        inAppCallsDynamicApiImpl$startOutgoingCall$1.label = 1;
                        obj = inAppCallsDynamicApiImpl.p(qjvVar, inAppCallsDynamicApiImpl$startOutgoingCall$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qjvVar = (qjv) inAppCallsDynamicApiImpl$startOutgoingCall$1.L$0;
                        b.b(obj);
                    }
                    q501 q501Var2 = nl7.b;
                    q501.w(new mqu(6, qjvVar, (rl7) obj));
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            q501 q501Var22 = nl7.b;
            q501.w(new mqu(6, qjvVar, (rl7) obj));
            return zy11.a;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        inAppCallsDynamicApiImpl$startOutgoingCall$1 = new InAppCallsDynamicApiImpl$startOutgoingCall$1(this, continuationImpl);
        Object obj2 = inAppCallsDynamicApiImpl$startOutgoingCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsDynamicApiImpl$startOutgoingCall$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.go.inapp_calls.InAppCallsDynamicApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pjv pjvVar, ContinuationImpl continuationImpl) {
        InAppCallsDynamicApiImpl$handleIncomingPush$1 inAppCallsDynamicApiImpl$handleIncomingPush$1;
        int i;
        zy11 zy11Var = zy11.a;
        try {
            if (continuationImpl instanceof InAppCallsDynamicApiImpl$handleIncomingPush$1) {
                inAppCallsDynamicApiImpl$handleIncomingPush$1 = (InAppCallsDynamicApiImpl$handleIncomingPush$1) continuationImpl;
                int i2 = inAppCallsDynamicApiImpl$handleIncomingPush$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    inAppCallsDynamicApiImpl$handleIncomingPush$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = inAppCallsDynamicApiImpl$handleIncomingPush$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = inAppCallsDynamicApiImpl$handleIncomingPush$1.label;
                    if (i != 0) {
                        b.b(obj);
                        if (!isInit) {
                            return new Result.Failure(new InAppCallsFeatureWrapper$NotReadyException("invoke init(...) function before use calls plugin"));
                        }
                        String str = (String) pjvVar.f().get(Constants.KEY_DATA);
                        InAppCallsAnalytics$Source inAppCallsAnalytics$Source = jl40.l((String) pjvVar.f().get("source"), "xiva_ws") ? InAppCallsAnalytics$Source.WebSocket : InAppCallsAnalytics$Source.Native;
                        JSONObject optJSONObject = str != null ? new JSONObject(str).optJSONObject("extra_info") : null;
                        rjv rjvVar = dependencies;
                        if (rjvVar == null) {
                            rjvVar = null;
                        }
                        rjvVar.b.g(optJSONObject != null ? optJSONObject.optString("call_guid") : null, optJSONObject != null ? optJSONObject.optString("call_platform_id") : null, optJSONObject != null ? optJSONObject.optString("linkage_id") : null, inAppCallsAnalytics$Source);
                        q501 q501Var = nl7.b;
                        if (q501.z()) {
                            rjv rjvVar2 = dependencies;
                            if (rjvVar2 == null) {
                                rjvVar2 = null;
                            }
                            rjvVar2.b.f(optJSONObject != null ? optJSONObject.optString("call_guid") : null, optJSONObject != null ? optJSONObject.optString("call_platform_id") : null, optJSONObject != null ? optJSONObject.optString("linkage_id") : null, inAppCallsAnalytics$Source);
                            return zy11Var;
                        }
                        InAppCallsDynamicApiImpl inAppCallsDynamicApiImpl = INSTANCE;
                        inAppCallsDynamicApiImpl$handleIncomingPush$1.L$0 = pjvVar;
                        inAppCallsDynamicApiImpl$handleIncomingPush$1.L$1 = null;
                        inAppCallsDynamicApiImpl$handleIncomingPush$1.L$2 = null;
                        inAppCallsDynamicApiImpl$handleIncomingPush$1.L$3 = null;
                        inAppCallsDynamicApiImpl$handleIncomingPush$1.L$4 = null;
                        inAppCallsDynamicApiImpl$handleIncomingPush$1.L$5 = null;
                        inAppCallsDynamicApiImpl$handleIncomingPush$1.L$6 = null;
                        inAppCallsDynamicApiImpl$handleIncomingPush$1.label = 1;
                        obj = inAppCallsDynamicApiImpl.o(pjvVar, inAppCallsDynamicApiImpl$handleIncomingPush$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pjvVar = (pjv) inAppCallsDynamicApiImpl$handleIncomingPush$1.L$0;
                        b.b(obj);
                    }
                    q501 q501Var2 = nl7.b;
                    q501.w(new mqu(5, pjvVar, (rl7) obj));
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            q501 q501Var22 = nl7.b;
            q501.w(new mqu(5, pjvVar, (rl7) obj));
            return zy11Var;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        inAppCallsDynamicApiImpl$handleIncomingPush$1 = new InAppCallsDynamicApiImpl$handleIncomingPush$1(this, continuationImpl);
        Object obj2 = inAppCallsDynamicApiImpl$handleIncomingPush$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsDynamicApiImpl$handleIncomingPush$1.label;
    }

    @Override // com.yandex.go.inapp_calls.InAppCallsDynamicApi
    public final synchronized void h(rjv rjvVar) {
        AtomicBoolean atomicBoolean = ol7.a;
        ol7.a(rjvVar.a);
        if (isInit) {
            return;
        }
        dependencies = rjvVar;
        q501 q501Var = nl7.b;
        Context a = a.a(rjvVar.a);
        int i = 4;
        v5c0 v5c0Var = new v5c0(i, rjvVar.b);
        jl7 jl7Var = new jl7(rjvVar.c, rjvVar.d);
        String str = rjvVar.e;
        t270 t270Var = rjvVar.g;
        rjv rjvVar2 = dependencies;
        if (rjvVar2 == null) {
            rjvVar2 = null;
        }
        q501Var.A(a, v5c0Var, new q6c0(i, str, t270Var, rjvVar2.b), jl7Var, a.b(rjvVar.a));
        isInit = true;
    }

    @Override // com.yandex.go.inapp_calls.InAppCallsDynamicApi
    public final Object k(Context context) {
        if (!isInit) {
            return new Result.Failure(new InAppCallsFeatureWrapper$NotReadyException("invoke init(...) function before use calls plugin"));
        }
        try {
            q501 q501Var = nl7.b;
            if (!q501.z()) {
                throw new InAppCallsDynamicApi.InAppCallException.NotStartedException();
            }
            try {
                q501.x(a.a(context));
                return zy11.a;
            } catch (Throwable th) {
                throw new InAppCallsDynamicApi.InAppCallException.SDKException(th);
            }
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
    }

    @Override // com.yandex.go.inapp_calls.InAppCallsDynamicApi
    public final boolean l() {
        Object failure;
        if (!isInit) {
            return false;
        }
        if (isInit) {
            try {
                q501 q501Var = nl7.b;
                failure = Boolean.valueOf(q501.z());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        } else {
            failure = new Result.Failure(new InAppCallsFeatureWrapper$NotReadyException("invoke init(...) function before use calls plugin"));
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Boolean bool = (Boolean) failure;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Object o(pjv pjvVar, Continuation continuation) {
        ik7 ik7Var;
        if (pjvVar.c() == null && pjvVar.d() == null && pjvVar.a() == null && pjvVar.b() == null) {
            ik7Var = null;
        } else {
            ik7Var = new ik7(pjvVar.c(), pjvVar.d(), pjvVar.b(), pjvVar.a());
        }
        return q(pjvVar.g(), new qpv(pjvVar.f(), ik7Var, pjvVar.e()), null, (ContinuationImpl) continuation);
    }

    public final Object p(qjv qjvVar, Continuation continuation) {
        ik7 ik7Var;
        if (qjvVar.c() == null && qjvVar.d() == null && qjvVar.a() == null && qjvVar.b() == null) {
            ik7Var = null;
        } else {
            ik7Var = new ik7(qjvVar.c(), qjvVar.d(), qjvVar.b(), qjvVar.a());
        }
        return q(qjvVar.k(), null, new xw80(qjvVar.h(), qjvVar.f(), qjvVar.e(), qjvVar.j(), ik7Var, qjvVar.i()), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(ojv ojvVar, qpv qpvVar, xw80 xw80Var, ContinuationImpl continuationImpl) {
        InAppCallsDynamicApiImpl$createStartArgsUnsafe$1 inAppCallsDynamicApiImpl$createStartArgsUnsafe$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ojv ojvVar2;
        qpv qpvVar2;
        q qVar;
        xw80 xw80Var2;
        Object b;
        vri0 vri0Var;
        Object c;
        mz31 mz31Var;
        ojv ojvVar3;
        vri0 vri0Var2;
        xw80 xw80Var3;
        qpv qpvVar3;
        if (continuationImpl instanceof InAppCallsDynamicApiImpl$createStartArgsUnsafe$1) {
            inAppCallsDynamicApiImpl$createStartArgsUnsafe$1 = (InAppCallsDynamicApiImpl$createStartArgsUnsafe$1) continuationImpl;
            int i2 = inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.label;
                if (i != 0) {
                    b.b(obj);
                    rjv rjvVar = dependencies;
                    if (rjvVar == null) {
                        rjvVar = null;
                    }
                    q qVar2 = rjvVar.h;
                    ojvVar2 = ojvVar;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$0 = ojvVar2;
                    qpvVar2 = qpvVar;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$1 = qpvVar2;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$2 = xw80Var;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$3 = qVar2;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.label = 1;
                    Object a = qVar2.a(inAppCallsDynamicApiImpl$createStartArgsUnsafe$1);
                    if (a != coroutineSingletons) {
                        qVar = qVar2;
                        obj = a;
                        xw80Var2 = xw80Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mz31Var = (mz31) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$5;
                        vri0Var2 = (vri0) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$4;
                        xw80 xw80Var4 = (xw80) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$2;
                        qpv qpvVar4 = (qpv) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$1;
                        ojvVar3 = (ojv) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$0;
                        b.b(obj);
                        xw80Var3 = xw80Var4;
                        qpvVar3 = qpvVar4;
                        return new rl7(ojvVar3.d(), ojvVar3.b(), ojvVar3.f(), ojvVar3.a(), ojvVar3.e(), false, ojvVar3.c(), xw80Var3, qpvVar3, new yg7(vri0Var2.a(), mz31Var.a(), ((nz31) obj).a()), new ng7(new uri0(vri0Var2.d(), vri0Var2.b(), vri0Var2.c()), new t6u(mz31Var.b())));
                    }
                    vri0 vri0Var3 = (vri0) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$4;
                    q qVar3 = (q) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$3;
                    xw80Var2 = (xw80) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$2;
                    qpvVar2 = (qpv) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$1;
                    ojv ojvVar4 = (ojv) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$0;
                    b.b(obj);
                    vri0Var = vri0Var3;
                    ojvVar2 = ojvVar4;
                    qVar = qVar3;
                    mz31 mz31Var2 = (mz31) obj;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$0 = ojvVar2;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$1 = qpvVar2;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$2 = xw80Var2;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$3 = null;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$4 = vri0Var;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$5 = mz31Var2;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.label = 3;
                    c = qVar.c(inAppCallsDynamicApiImpl$createStartArgsUnsafe$1);
                    if (c != coroutineSingletons) {
                        mz31Var = mz31Var2;
                        obj = c;
                        ojvVar3 = ojvVar2;
                        vri0Var2 = vri0Var;
                        xw80Var3 = xw80Var2;
                        qpvVar3 = qpvVar2;
                        return new rl7(ojvVar3.d(), ojvVar3.b(), ojvVar3.f(), ojvVar3.a(), ojvVar3.e(), false, ojvVar3.c(), xw80Var3, qpvVar3, new yg7(vri0Var2.a(), mz31Var.a(), ((nz31) obj).a()), new ng7(new uri0(vri0Var2.d(), vri0Var2.b(), vri0Var2.c()), new t6u(mz31Var.b())));
                    }
                    return coroutineSingletons;
                }
                q qVar4 = (q) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$3;
                xw80Var2 = (xw80) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$2;
                qpvVar2 = (qpv) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$1;
                ojv ojvVar5 = (ojv) inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$0;
                b.b(obj);
                qVar = qVar4;
                ojvVar2 = ojvVar5;
                vri0 vri0Var4 = (vri0) obj;
                inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$0 = ojvVar2;
                inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$1 = qpvVar2;
                inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$2 = xw80Var2;
                inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$3 = qVar;
                inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$4 = vri0Var4;
                inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.label = 2;
                b = qVar.b(inAppCallsDynamicApiImpl$createStartArgsUnsafe$1);
                if (b != coroutineSingletons) {
                    vri0Var = vri0Var4;
                    obj = b;
                    mz31 mz31Var22 = (mz31) obj;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$0 = ojvVar2;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$1 = qpvVar2;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$2 = xw80Var2;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$3 = null;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$4 = vri0Var;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$5 = mz31Var22;
                    inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.label = 3;
                    c = qVar.c(inAppCallsDynamicApiImpl$createStartArgsUnsafe$1);
                    if (c != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        inAppCallsDynamicApiImpl$createStartArgsUnsafe$1 = new InAppCallsDynamicApiImpl$createStartArgsUnsafe$1(this, continuationImpl);
        Object obj2 = inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.label;
        if (i != 0) {
        }
        vri0 vri0Var42 = (vri0) obj2;
        inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$0 = ojvVar2;
        inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$1 = qpvVar2;
        inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$2 = xw80Var2;
        inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$3 = qVar;
        inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.L$4 = vri0Var42;
        inAppCallsDynamicApiImpl$createStartArgsUnsafe$1.label = 2;
        b = qVar.b(inAppCallsDynamicApiImpl$createStartArgsUnsafe$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
