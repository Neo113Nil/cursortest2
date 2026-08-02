package com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.m0;
import core.network.mapi.client.a;
import core.network.mapi.exception.MapiClientException;
import defpackage.g6u;
import defpackage.jl40;
import defpackage.jo0;
import defpackage.ku00;
import defpackage.lu00;
import defpackage.mdh;
import defpackage.noh;
import defpackage.npb;
import defpackage.ny61;
import defpackage.o400;
import defpackage.p85;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v5j0;
import defpackage.vu00;
import defpackage.xu00;
import defpackage.yu00;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.StreamResetException;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJD\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001b\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"¨\u0006$"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/network/mapi/MapiClientImpl;", "Llu00;", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "Lcore/network/mapi/client/a;", "client", "Ltse;", "networkScope", "<init>", "(Lp85;Lcore/network/mapi/client/a;Ltse;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.KEY_EXCEPTION, "", "startTime", "Lzy11;", "processException", "(Ljava/lang/Exception;J)V", "R", "Lvu00;", "request", "Lyu00;", "parser", "Lku00;", "listener", "Lxu00;", "executeRequest", "(Lvu00;Lyu00;Lku00;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lv5j0;", "details", "(Lvu00;Lyu00;Lku00;Lv5j0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp85;", "Lcore/network/mapi/client/a;", "Ltse;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MapiClientImpl implements lu00 {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long DELAY_BETWEEN_RETRIES = 1000;

    @Deprecated
    public static final long RETRIES_TIME_MILLIS = 300000;
    private final p85 activityProvider;
    private final a client;
    private final tse networkScope;

    public MapiClientImpl(p85 p85Var, a aVar, tse tseVar) {
        this.activityProvider = p85Var;
        this.client = aVar;
        this.networkScope = tseVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final noh executeRequest$lambda$0(MapiClientImpl mapiClientImpl, vu00 vu00Var, yu00 yu00Var, ku00 ku00Var) {
        tse tseVar = mapiClientImpl.networkScope;
        sjh sjhVar = uyj.a;
        return tje.h(tseVar, mdh.b.plus(jl40.a()), null, new MapiClientImpl$executeRequest$executeRequest$1$1(mapiClientImpl, vu00Var, yu00Var, ku00Var, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final noh executeRequest$lambda$2(MapiClientImpl mapiClientImpl, vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, v5j0 v5j0Var) {
        tse tseVar = mapiClientImpl.networkScope;
        sjh sjhVar = uyj.a;
        return tje.h(tseVar, mdh.b.plus(jl40.a()), null, new MapiClientImpl$executeRequest$executeRequest$2$1(mapiClientImpl, vu00Var, yu00Var, ku00Var, v5j0Var, null), 2);
    }

    private final void processException(Exception exception, long startTime) {
        if (exception instanceof MapiClientException) {
            if (!(exception.getCause() instanceof SocketException) && !(exception.getCause() instanceof UnknownHostException)) {
                throw exception;
            }
        } else if (!(exception instanceof IOException) && !(exception instanceof StreamResetException)) {
            throw exception;
        }
        if (System.currentTimeMillis() - startTime > RETRIES_TIME_MILLIS) {
            throw exception;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:43|(3:68|69|(2:71|(10:73|55|56|(4:58|17|18|19)|20|21|22|23|24|(1:28)(1:26)))(2:74|75))|45|46|47|48|49|50|51|(11:53|54|55|56|(0)|20|21|22|23|24|(0))|28) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:11|12|13|14|(3:40|41|(11:43|(3:68|69|(2:71|(10:73|55|56|(4:58|17|18|19)|20|21|22|23|24|(1:28)(1:26)))(2:74|75))|45|46|47|48|49|50|51|(11:53|54|55|56|(0)|20|21|22|23|24|(0))|28))|16|17|18|19|20|21|22|23|24|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0181, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ad, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r2) != r7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0184, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0188, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        r13 = r2;
        r12 = r3;
        r6 = r4;
        r3 = r8;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        r17 = r12;
        r8 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008d  */
    /* JADX WARN: Type inference failed for: r5v13, types: [sls] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01ad -> B:12:0x0043). Please report as a decompilation issue!!! */
    @Override // defpackage.lu00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object executeRequest(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, v5j0 v5j0Var, Continuation<? super xu00> continuation) {
        MapiClientImpl$executeRequest$2 mapiClientImpl$executeRequest$2;
        int i;
        v5j0 v5j0Var2;
        MapiClientImpl$executeRequest$2 mapiClientImpl$executeRequest$22;
        long currentTimeMillis;
        vu00 vu00Var2;
        yu00 yu00Var2;
        ku00 ku00Var2;
        vu00 vu00Var3;
        yu00 yu00Var3;
        ku00 ku00Var3;
        Object obj;
        long j;
        final npb npbVar;
        ku00 ku00Var4;
        yu00 yu00Var4;
        vu00 vu00Var4;
        noh nohVar;
        v5j0 v5j0Var3;
        npb npbVar2;
        FragmentActivity fragmentActivity;
        MapiClientImpl$executeRequest$2 mapiClientImpl$executeRequest$23;
        long j2;
        if (continuation instanceof MapiClientImpl$executeRequest$2) {
            mapiClientImpl$executeRequest$2 = (MapiClientImpl$executeRequest$2) continuation;
            int i2 = mapiClientImpl$executeRequest$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapiClientImpl$executeRequest$2.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapiClientImpl$executeRequest$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapiClientImpl$executeRequest$2.label;
                if (i != 0) {
                    b.b(obj2);
                    v5j0Var2 = v5j0Var;
                    mapiClientImpl$executeRequest$22 = mapiClientImpl$executeRequest$2;
                    currentTimeMillis = System.currentTimeMillis();
                    vu00Var2 = vu00Var;
                    yu00Var2 = yu00Var;
                    ku00Var2 = ku00Var;
                    fragmentActivity = (FragmentActivity) this.activityProvider.a();
                    npbVar = new npb(this, vu00Var2, yu00Var2, ku00Var2, v5j0Var2, 2);
                    if (fragmentActivity != null) {
                    }
                    MapiClientImpl$executeRequest$2 mapiClientImpl$executeRequest$24 = mapiClientImpl$executeRequest$22;
                    long j3 = currentTimeMillis;
                    vu00Var4 = vu00Var2;
                    yu00Var4 = yu00Var2;
                    ku00Var4 = ku00Var2;
                    j = j3;
                    mapiClientImpl$executeRequest$2 = mapiClientImpl$executeRequest$24;
                    vu00Var3 = vu00Var4;
                    yu00Var3 = yu00Var4;
                    ku00Var3 = ku00Var4;
                    nohVar = (noh) npbVar.invoke();
                    mapiClientImpl$executeRequest$2.L$0 = vu00Var3;
                    mapiClientImpl$executeRequest$2.L$1 = yu00Var3;
                    mapiClientImpl$executeRequest$2.L$2 = ku00Var3;
                    mapiClientImpl$executeRequest$2.L$3 = v5j0Var2;
                    mapiClientImpl$executeRequest$2.L$4 = null;
                    mapiClientImpl$executeRequest$2.J$0 = j;
                    mapiClientImpl$executeRequest$2.label = 2;
                    Object k = nohVar.k(mapiClientImpl$executeRequest$2);
                    if (k == coroutineSingletons) {
                    }
                } else if (i == 1) {
                    j = mapiClientImpl$executeRequest$2.J$0;
                    ?? r5 = (sls) mapiClientImpl$executeRequest$2.L$4;
                    v5j0Var3 = (v5j0) mapiClientImpl$executeRequest$2.L$3;
                    ku00Var3 = (ku00) mapiClientImpl$executeRequest$2.L$2;
                    yu00Var3 = (yu00) mapiClientImpl$executeRequest$2.L$1;
                    vu00Var3 = (vu00) mapiClientImpl$executeRequest$2.L$0;
                    try {
                        b.b(obj2);
                        npbVar2 = r5;
                    } catch (Exception e) {
                        e = e;
                        v5j0Var2 = v5j0Var3;
                        ku00Var4 = ku00Var3;
                        yu00Var4 = yu00Var3;
                        vu00Var4 = vu00Var3;
                        processException(e, j);
                        mapiClientImpl$executeRequest$2.L$0 = vu00Var4;
                        mapiClientImpl$executeRequest$2.L$1 = yu00Var4;
                        mapiClientImpl$executeRequest$2.L$2 = ku00Var4;
                        mapiClientImpl$executeRequest$2.L$3 = v5j0Var2;
                        mapiClientImpl$executeRequest$2.L$4 = null;
                        mapiClientImpl$executeRequest$2.J$0 = j;
                        mapiClientImpl$executeRequest$2.label = 3;
                    }
                    v5j0 v5j0Var4 = v5j0Var3;
                    obj = obj2;
                    npbVar = npbVar2;
                    v5j0Var2 = v5j0Var4;
                    nohVar = (noh) obj;
                    if (nohVar == null) {
                    }
                    mapiClientImpl$executeRequest$2.L$0 = vu00Var3;
                    mapiClientImpl$executeRequest$2.L$1 = yu00Var3;
                    mapiClientImpl$executeRequest$2.L$2 = ku00Var3;
                    mapiClientImpl$executeRequest$2.L$3 = v5j0Var2;
                    mapiClientImpl$executeRequest$2.L$4 = null;
                    mapiClientImpl$executeRequest$2.J$0 = j;
                    mapiClientImpl$executeRequest$2.label = 2;
                    Object k2 = nohVar.k(mapiClientImpl$executeRequest$2);
                    if (k2 == coroutineSingletons) {
                    }
                } else if (i == 2) {
                    j = mapiClientImpl$executeRequest$2.J$0;
                    v5j0Var2 = (v5j0) mapiClientImpl$executeRequest$2.L$3;
                    ku00Var4 = (ku00) mapiClientImpl$executeRequest$2.L$2;
                    yu00Var4 = (yu00) mapiClientImpl$executeRequest$2.L$1;
                    vu00Var4 = (vu00) mapiClientImpl$executeRequest$2.L$0;
                    try {
                        b.b(obj2);
                        return obj2;
                    } catch (Exception e2) {
                        e = e2;
                        processException(e, j);
                        mapiClientImpl$executeRequest$2.L$0 = vu00Var4;
                        mapiClientImpl$executeRequest$2.L$1 = yu00Var4;
                        mapiClientImpl$executeRequest$2.L$2 = ku00Var4;
                        mapiClientImpl$executeRequest$2.L$3 = v5j0Var2;
                        mapiClientImpl$executeRequest$2.L$4 = null;
                        mapiClientImpl$executeRequest$2.J$0 = j;
                        mapiClientImpl$executeRequest$2.label = 3;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = mapiClientImpl$executeRequest$2.J$0;
                    v5j0Var2 = (v5j0) mapiClientImpl$executeRequest$2.L$3;
                    ku00Var4 = (ku00) mapiClientImpl$executeRequest$2.L$2;
                    yu00Var4 = (yu00) mapiClientImpl$executeRequest$2.L$1;
                    vu00Var4 = (vu00) mapiClientImpl$executeRequest$2.L$0;
                    b.b(obj2);
                    yu00 yu00Var5 = yu00Var4;
                    mapiClientImpl$executeRequest$22 = mapiClientImpl$executeRequest$2;
                    vu00Var2 = vu00Var4;
                    currentTimeMillis = j;
                    yu00Var2 = yu00Var5;
                    ku00Var2 = ku00Var4;
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        MapiClientImpl$executeRequest$2 mapiClientImpl$executeRequest$25 = mapiClientImpl$executeRequest$22;
                        long j4 = currentTimeMillis;
                        vu00Var4 = vu00Var2;
                        yu00Var4 = yu00Var2;
                        ku00Var4 = ku00Var2;
                        j = j4;
                        mapiClientImpl$executeRequest$2 = mapiClientImpl$executeRequest$25;
                    }
                    fragmentActivity = (FragmentActivity) this.activityProvider.a();
                    npbVar = new npb(this, vu00Var2, yu00Var2, ku00Var2, v5j0Var2, 2);
                    if (fragmentActivity != null) {
                        try {
                        } catch (Exception e4) {
                            e = e4;
                            mapiClientImpl$executeRequest$23 = mapiClientImpl$executeRequest$22;
                            j2 = currentTimeMillis;
                        }
                        Lifecycle lifecycle = fragmentActivity.getLifecycle();
                        if (lifecycle != null) {
                            Lifecycle.State state = Lifecycle.State.RESUMED;
                            sjh sjhVar = uyj.a;
                            g6u g6uVar = o400.a.x;
                            boolean G = g6uVar.G(mapiClientImpl$executeRequest$22.get_context());
                            if (!G) {
                                try {
                                } catch (Exception e5) {
                                    e = e5;
                                    ku00Var4 = ku00Var2;
                                    long j5 = currentTimeMillis;
                                    vu00Var4 = vu00Var2;
                                    mapiClientImpl$executeRequest$2 = mapiClientImpl$executeRequest$22;
                                    yu00Var4 = yu00Var2;
                                    j = j5;
                                    processException(e, j);
                                    mapiClientImpl$executeRequest$2.L$0 = vu00Var4;
                                    mapiClientImpl$executeRequest$2.L$1 = yu00Var4;
                                    mapiClientImpl$executeRequest$2.L$2 = ku00Var4;
                                    mapiClientImpl$executeRequest$2.L$3 = v5j0Var2;
                                    mapiClientImpl$executeRequest$2.L$4 = null;
                                    mapiClientImpl$executeRequest$2.J$0 = j;
                                    mapiClientImpl$executeRequest$2.label = 3;
                                }
                                if (lifecycle.b() == Lifecycle.State.DESTROYED) {
                                    throw new LifecycleDestroyedException();
                                }
                                if (lifecycle.b().compareTo(state) >= 0) {
                                    obj = (noh) npbVar.invoke();
                                    long j6 = currentTimeMillis;
                                    vu00Var3 = vu00Var2;
                                    yu00Var3 = yu00Var2;
                                    mapiClientImpl$executeRequest$2 = mapiClientImpl$executeRequest$22;
                                    ku00Var3 = ku00Var2;
                                    j = j6;
                                    try {
                                    } catch (Exception e6) {
                                        e = e6;
                                        ku00Var4 = ku00Var3;
                                        yu00Var4 = yu00Var3;
                                        vu00Var4 = vu00Var3;
                                        processException(e, j);
                                        mapiClientImpl$executeRequest$2.L$0 = vu00Var4;
                                        mapiClientImpl$executeRequest$2.L$1 = yu00Var4;
                                        mapiClientImpl$executeRequest$2.L$2 = ku00Var4;
                                        mapiClientImpl$executeRequest$2.L$3 = v5j0Var2;
                                        mapiClientImpl$executeRequest$2.L$4 = null;
                                        mapiClientImpl$executeRequest$2.J$0 = j;
                                        mapiClientImpl$executeRequest$2.label = 3;
                                    }
                                    nohVar = (noh) obj;
                                    if (nohVar == null) {
                                        ku00Var4 = ku00Var3;
                                        yu00Var4 = yu00Var3;
                                        vu00Var4 = vu00Var3;
                                        vu00Var3 = vu00Var4;
                                        yu00Var3 = yu00Var4;
                                        ku00Var3 = ku00Var4;
                                        nohVar = (noh) npbVar.invoke();
                                    }
                                    mapiClientImpl$executeRequest$2.L$0 = vu00Var3;
                                    mapiClientImpl$executeRequest$2.L$1 = yu00Var3;
                                    mapiClientImpl$executeRequest$2.L$2 = ku00Var3;
                                    mapiClientImpl$executeRequest$2.L$3 = v5j0Var2;
                                    mapiClientImpl$executeRequest$2.L$4 = null;
                                    mapiClientImpl$executeRequest$2.J$0 = j;
                                    mapiClientImpl$executeRequest$2.label = 2;
                                    Object k22 = nohVar.k(mapiClientImpl$executeRequest$2);
                                    return k22 == coroutineSingletons ? coroutineSingletons : k22;
                                }
                            }
                            sls slsVar = new sls() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl$executeRequest$$inlined$withResumed$2
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final noh invoke() {
                                    return (noh) sls.this.invoke();
                                }
                            };
                            mapiClientImpl$executeRequest$22.L$0 = vu00Var2;
                            mapiClientImpl$executeRequest$22.L$1 = yu00Var2;
                            mapiClientImpl$executeRequest$22.L$2 = ku00Var2;
                            mapiClientImpl$executeRequest$22.L$3 = v5j0Var2;
                            mapiClientImpl$executeRequest$22.L$4 = npbVar;
                            mapiClientImpl$executeRequest$22.J$0 = currentTimeMillis;
                            mapiClientImpl$executeRequest$22.label = 1;
                            mapiClientImpl$executeRequest$23 = mapiClientImpl$executeRequest$22;
                            j2 = currentTimeMillis;
                            Object a = m0.a(lifecycle, state, G, g6uVar, slsVar, mapiClientImpl$executeRequest$23);
                            if (a != coroutineSingletons) {
                                v5j0 v5j0Var5 = v5j0Var2;
                                npbVar2 = npbVar;
                                obj2 = a;
                                v5j0Var3 = v5j0Var5;
                                vu00Var3 = vu00Var2;
                                yu00Var3 = yu00Var2;
                                ku00Var3 = ku00Var2;
                                j = j2;
                                mapiClientImpl$executeRequest$2 = mapiClientImpl$executeRequest$23;
                                v5j0 v5j0Var42 = v5j0Var3;
                                obj = obj2;
                                npbVar = npbVar2;
                                v5j0Var2 = v5j0Var42;
                                nohVar = (noh) obj;
                                if (nohVar == null) {
                                }
                                mapiClientImpl$executeRequest$2.L$0 = vu00Var3;
                                mapiClientImpl$executeRequest$2.L$1 = yu00Var3;
                                mapiClientImpl$executeRequest$2.L$2 = ku00Var3;
                                mapiClientImpl$executeRequest$2.L$3 = v5j0Var2;
                                mapiClientImpl$executeRequest$2.L$4 = null;
                                mapiClientImpl$executeRequest$2.J$0 = j;
                                mapiClientImpl$executeRequest$2.label = 2;
                                Object k222 = nohVar.k(mapiClientImpl$executeRequest$2);
                                if (k222 == coroutineSingletons) {
                                }
                            }
                        }
                    }
                    MapiClientImpl$executeRequest$2 mapiClientImpl$executeRequest$242 = mapiClientImpl$executeRequest$22;
                    long j32 = currentTimeMillis;
                    vu00Var4 = vu00Var2;
                    yu00Var4 = yu00Var2;
                    ku00Var4 = ku00Var2;
                    j = j32;
                    mapiClientImpl$executeRequest$2 = mapiClientImpl$executeRequest$242;
                    vu00Var3 = vu00Var4;
                    yu00Var3 = yu00Var4;
                    ku00Var3 = ku00Var4;
                    nohVar = (noh) npbVar.invoke();
                    mapiClientImpl$executeRequest$2.L$0 = vu00Var3;
                    mapiClientImpl$executeRequest$2.L$1 = yu00Var3;
                    mapiClientImpl$executeRequest$2.L$2 = ku00Var3;
                    mapiClientImpl$executeRequest$2.L$3 = v5j0Var2;
                    mapiClientImpl$executeRequest$2.L$4 = null;
                    mapiClientImpl$executeRequest$2.J$0 = j;
                    mapiClientImpl$executeRequest$2.label = 2;
                    Object k2222 = nohVar.k(mapiClientImpl$executeRequest$2);
                    if (k2222 == coroutineSingletons) {
                    }
                }
            }
        }
        mapiClientImpl$executeRequest$2 = new MapiClientImpl$executeRequest$2(this, continuation);
        Object obj22 = mapiClientImpl$executeRequest$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapiClientImpl$executeRequest$2.label;
        if (i != 0) {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/network/mapi/MapiClientImpl$Companion;", "", "<init>", "()V", "DELAY_BETWEEN_RETRIES", "", "RETRIES_TIME_MILLIS", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:11|12|13|14|(3:39|40|(9:42|(3:62|63|(2:65|(9:67|52|53|(4:55|17|18|19)|20|21|22|23|(1:27)(1:25)))(2:68|69))|44|45|46|47|48|(10:50|51|52|53|(0)|20|21|22|23|(0))|27))|16|17|18|19|20|21|22|23|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:42|(3:62|63|(2:65|(9:67|52|53|(4:55|17|18|19)|20|21|22|23|(1:27)(1:25)))(2:68|69))|44|45|46|47|48|(10:50|51|52|53|(0)|20|21|22|23|(0))|27) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018a, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r2) != r6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0163, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0167, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012e, code lost:
    
        r12 = r2;
        r11 = r3;
        r5 = r4;
        r3 = r7;
        r2 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0080  */
    /* JADX WARN: Type inference failed for: r5v24, types: [sls] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x018a -> B:12:0x003f). Please report as a decompilation issue!!! */
    @Override // defpackage.lu00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object executeRequest(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, Continuation<? super xu00> continuation) {
        MapiClientImpl$executeRequest$1 mapiClientImpl$executeRequest$1;
        int i;
        MapiClientImpl$executeRequest$1 mapiClientImpl$executeRequest$12;
        long currentTimeMillis;
        vu00 vu00Var2;
        yu00 yu00Var2;
        ku00 ku00Var2;
        vu00 vu00Var3;
        yu00 yu00Var3;
        ku00 ku00Var3;
        Object obj;
        long j;
        final jo0 jo0Var;
        ku00 ku00Var4;
        yu00 yu00Var4;
        vu00 vu00Var4;
        noh nohVar;
        jo0 jo0Var2;
        FragmentActivity fragmentActivity;
        MapiClientImpl$executeRequest$1 mapiClientImpl$executeRequest$13;
        long j2;
        if (continuation instanceof MapiClientImpl$executeRequest$1) {
            mapiClientImpl$executeRequest$1 = (MapiClientImpl$executeRequest$1) continuation;
            int i2 = mapiClientImpl$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapiClientImpl$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapiClientImpl$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapiClientImpl$executeRequest$1.label;
                if (i != 0) {
                    b.b(obj2);
                    mapiClientImpl$executeRequest$12 = mapiClientImpl$executeRequest$1;
                    currentTimeMillis = System.currentTimeMillis();
                    vu00Var2 = vu00Var;
                    yu00Var2 = yu00Var;
                    ku00Var2 = ku00Var;
                    fragmentActivity = (FragmentActivity) this.activityProvider.a();
                    jo0Var = new jo0(this, vu00Var2, yu00Var2, ku00Var2, 18);
                    if (fragmentActivity != null) {
                    }
                    MapiClientImpl$executeRequest$1 mapiClientImpl$executeRequest$14 = mapiClientImpl$executeRequest$12;
                    long j3 = currentTimeMillis;
                    vu00Var4 = vu00Var2;
                    yu00Var4 = yu00Var2;
                    ku00Var4 = ku00Var2;
                    j = j3;
                    mapiClientImpl$executeRequest$1 = mapiClientImpl$executeRequest$14;
                    vu00Var3 = vu00Var4;
                    yu00Var3 = yu00Var4;
                    ku00Var3 = ku00Var4;
                    nohVar = (noh) jo0Var.invoke();
                    mapiClientImpl$executeRequest$1.L$0 = vu00Var3;
                    mapiClientImpl$executeRequest$1.L$1 = yu00Var3;
                    mapiClientImpl$executeRequest$1.L$2 = ku00Var3;
                    mapiClientImpl$executeRequest$1.L$3 = null;
                    mapiClientImpl$executeRequest$1.J$0 = j;
                    mapiClientImpl$executeRequest$1.label = 2;
                    Object k = nohVar.k(mapiClientImpl$executeRequest$1);
                    if (k == coroutineSingletons) {
                    }
                } else if (i == 1) {
                    j = mapiClientImpl$executeRequest$1.J$0;
                    ?? r5 = (sls) mapiClientImpl$executeRequest$1.L$3;
                    ku00Var3 = (ku00) mapiClientImpl$executeRequest$1.L$2;
                    yu00Var3 = (yu00) mapiClientImpl$executeRequest$1.L$1;
                    vu00Var3 = (vu00) mapiClientImpl$executeRequest$1.L$0;
                    try {
                        b.b(obj2);
                        jo0Var2 = r5;
                    } catch (Exception e) {
                        e = e;
                        ku00Var4 = ku00Var3;
                        yu00Var4 = yu00Var3;
                        vu00Var4 = vu00Var3;
                        processException(e, j);
                        mapiClientImpl$executeRequest$1.L$0 = vu00Var4;
                        mapiClientImpl$executeRequest$1.L$1 = yu00Var4;
                        mapiClientImpl$executeRequest$1.L$2 = ku00Var4;
                        mapiClientImpl$executeRequest$1.L$3 = null;
                        mapiClientImpl$executeRequest$1.J$0 = j;
                        mapiClientImpl$executeRequest$1.label = 3;
                    }
                    jo0 jo0Var3 = jo0Var2;
                    obj = obj2;
                    jo0Var = jo0Var3;
                    nohVar = (noh) obj;
                    if (nohVar == null) {
                    }
                    mapiClientImpl$executeRequest$1.L$0 = vu00Var3;
                    mapiClientImpl$executeRequest$1.L$1 = yu00Var3;
                    mapiClientImpl$executeRequest$1.L$2 = ku00Var3;
                    mapiClientImpl$executeRequest$1.L$3 = null;
                    mapiClientImpl$executeRequest$1.J$0 = j;
                    mapiClientImpl$executeRequest$1.label = 2;
                    Object k2 = nohVar.k(mapiClientImpl$executeRequest$1);
                    if (k2 == coroutineSingletons) {
                    }
                } else if (i == 2) {
                    j = mapiClientImpl$executeRequest$1.J$0;
                    ku00Var4 = (ku00) mapiClientImpl$executeRequest$1.L$2;
                    yu00Var4 = (yu00) mapiClientImpl$executeRequest$1.L$1;
                    vu00Var4 = (vu00) mapiClientImpl$executeRequest$1.L$0;
                    try {
                        b.b(obj2);
                        return obj2;
                    } catch (Exception e2) {
                        e = e2;
                        processException(e, j);
                        mapiClientImpl$executeRequest$1.L$0 = vu00Var4;
                        mapiClientImpl$executeRequest$1.L$1 = yu00Var4;
                        mapiClientImpl$executeRequest$1.L$2 = ku00Var4;
                        mapiClientImpl$executeRequest$1.L$3 = null;
                        mapiClientImpl$executeRequest$1.J$0 = j;
                        mapiClientImpl$executeRequest$1.label = 3;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = mapiClientImpl$executeRequest$1.J$0;
                    ku00Var4 = (ku00) mapiClientImpl$executeRequest$1.L$2;
                    yu00Var4 = (yu00) mapiClientImpl$executeRequest$1.L$1;
                    vu00Var4 = (vu00) mapiClientImpl$executeRequest$1.L$0;
                    b.b(obj2);
                    yu00 yu00Var5 = yu00Var4;
                    mapiClientImpl$executeRequest$12 = mapiClientImpl$executeRequest$1;
                    vu00Var2 = vu00Var4;
                    currentTimeMillis = j;
                    yu00Var2 = yu00Var5;
                    ku00Var2 = ku00Var4;
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        MapiClientImpl$executeRequest$1 mapiClientImpl$executeRequest$15 = mapiClientImpl$executeRequest$12;
                        long j4 = currentTimeMillis;
                        vu00Var4 = vu00Var2;
                        yu00Var4 = yu00Var2;
                        ku00Var4 = ku00Var2;
                        j = j4;
                        mapiClientImpl$executeRequest$1 = mapiClientImpl$executeRequest$15;
                    }
                    fragmentActivity = (FragmentActivity) this.activityProvider.a();
                    jo0Var = new jo0(this, vu00Var2, yu00Var2, ku00Var2, 18);
                    if (fragmentActivity != null) {
                        try {
                        } catch (Exception e4) {
                            e = e4;
                            mapiClientImpl$executeRequest$13 = mapiClientImpl$executeRequest$12;
                            j2 = currentTimeMillis;
                        }
                        Lifecycle lifecycle = fragmentActivity.getLifecycle();
                        if (lifecycle != null) {
                            Lifecycle.State state = Lifecycle.State.RESUMED;
                            sjh sjhVar = uyj.a;
                            g6u g6uVar = o400.a.x;
                            boolean G = g6uVar.G(mapiClientImpl$executeRequest$12.get_context());
                            if (!G) {
                                try {
                                } catch (Exception e5) {
                                    e = e5;
                                    ku00Var4 = ku00Var2;
                                    long j5 = currentTimeMillis;
                                    vu00Var4 = vu00Var2;
                                    mapiClientImpl$executeRequest$1 = mapiClientImpl$executeRequest$12;
                                    yu00Var4 = yu00Var2;
                                    j = j5;
                                    processException(e, j);
                                    mapiClientImpl$executeRequest$1.L$0 = vu00Var4;
                                    mapiClientImpl$executeRequest$1.L$1 = yu00Var4;
                                    mapiClientImpl$executeRequest$1.L$2 = ku00Var4;
                                    mapiClientImpl$executeRequest$1.L$3 = null;
                                    mapiClientImpl$executeRequest$1.J$0 = j;
                                    mapiClientImpl$executeRequest$1.label = 3;
                                }
                                if (lifecycle.b() != Lifecycle.State.DESTROYED) {
                                    if (lifecycle.b().compareTo(state) >= 0) {
                                        obj = (noh) jo0Var.invoke();
                                        long j6 = currentTimeMillis;
                                        vu00Var3 = vu00Var2;
                                        yu00Var3 = yu00Var2;
                                        mapiClientImpl$executeRequest$1 = mapiClientImpl$executeRequest$12;
                                        ku00Var3 = ku00Var2;
                                        j = j6;
                                        try {
                                        } catch (Exception e6) {
                                            e = e6;
                                            ku00Var4 = ku00Var3;
                                            yu00Var4 = yu00Var3;
                                            vu00Var4 = vu00Var3;
                                            processException(e, j);
                                            mapiClientImpl$executeRequest$1.L$0 = vu00Var4;
                                            mapiClientImpl$executeRequest$1.L$1 = yu00Var4;
                                            mapiClientImpl$executeRequest$1.L$2 = ku00Var4;
                                            mapiClientImpl$executeRequest$1.L$3 = null;
                                            mapiClientImpl$executeRequest$1.J$0 = j;
                                            mapiClientImpl$executeRequest$1.label = 3;
                                        }
                                        nohVar = (noh) obj;
                                        if (nohVar == null) {
                                            ku00Var4 = ku00Var3;
                                            yu00Var4 = yu00Var3;
                                            vu00Var4 = vu00Var3;
                                            vu00Var3 = vu00Var4;
                                            yu00Var3 = yu00Var4;
                                            ku00Var3 = ku00Var4;
                                            nohVar = (noh) jo0Var.invoke();
                                        }
                                        mapiClientImpl$executeRequest$1.L$0 = vu00Var3;
                                        mapiClientImpl$executeRequest$1.L$1 = yu00Var3;
                                        mapiClientImpl$executeRequest$1.L$2 = ku00Var3;
                                        mapiClientImpl$executeRequest$1.L$3 = null;
                                        mapiClientImpl$executeRequest$1.J$0 = j;
                                        mapiClientImpl$executeRequest$1.label = 2;
                                        Object k22 = nohVar.k(mapiClientImpl$executeRequest$1);
                                        return k22 == coroutineSingletons ? coroutineSingletons : k22;
                                    }
                                } else {
                                    throw new LifecycleDestroyedException();
                                }
                            }
                            sls slsVar = new sls() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl$executeRequest$$inlined$withResumed$1
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final noh invoke() {
                                    return (noh) sls.this.invoke();
                                }
                            };
                            mapiClientImpl$executeRequest$12.L$0 = vu00Var2;
                            mapiClientImpl$executeRequest$12.L$1 = yu00Var2;
                            mapiClientImpl$executeRequest$12.L$2 = ku00Var2;
                            mapiClientImpl$executeRequest$12.L$3 = jo0Var;
                            mapiClientImpl$executeRequest$12.J$0 = currentTimeMillis;
                            mapiClientImpl$executeRequest$12.label = 1;
                            mapiClientImpl$executeRequest$13 = mapiClientImpl$executeRequest$12;
                            j2 = currentTimeMillis;
                            Object a = m0.a(lifecycle, state, G, g6uVar, slsVar, mapiClientImpl$executeRequest$13);
                            if (a != coroutineSingletons) {
                                jo0Var2 = jo0Var;
                                obj2 = a;
                                vu00Var3 = vu00Var2;
                                yu00Var3 = yu00Var2;
                                ku00Var3 = ku00Var2;
                                j = j2;
                                mapiClientImpl$executeRequest$1 = mapiClientImpl$executeRequest$13;
                                jo0 jo0Var32 = jo0Var2;
                                obj = obj2;
                                jo0Var = jo0Var32;
                                nohVar = (noh) obj;
                                if (nohVar == null) {
                                }
                                mapiClientImpl$executeRequest$1.L$0 = vu00Var3;
                                mapiClientImpl$executeRequest$1.L$1 = yu00Var3;
                                mapiClientImpl$executeRequest$1.L$2 = ku00Var3;
                                mapiClientImpl$executeRequest$1.L$3 = null;
                                mapiClientImpl$executeRequest$1.J$0 = j;
                                mapiClientImpl$executeRequest$1.label = 2;
                                Object k222 = nohVar.k(mapiClientImpl$executeRequest$1);
                                if (k222 == coroutineSingletons) {
                                }
                            }
                        }
                    }
                    MapiClientImpl$executeRequest$1 mapiClientImpl$executeRequest$142 = mapiClientImpl$executeRequest$12;
                    long j32 = currentTimeMillis;
                    vu00Var4 = vu00Var2;
                    yu00Var4 = yu00Var2;
                    ku00Var4 = ku00Var2;
                    j = j32;
                    mapiClientImpl$executeRequest$1 = mapiClientImpl$executeRequest$142;
                    vu00Var3 = vu00Var4;
                    yu00Var3 = yu00Var4;
                    ku00Var3 = ku00Var4;
                    nohVar = (noh) jo0Var.invoke();
                    mapiClientImpl$executeRequest$1.L$0 = vu00Var3;
                    mapiClientImpl$executeRequest$1.L$1 = yu00Var3;
                    mapiClientImpl$executeRequest$1.L$2 = ku00Var3;
                    mapiClientImpl$executeRequest$1.L$3 = null;
                    mapiClientImpl$executeRequest$1.J$0 = j;
                    mapiClientImpl$executeRequest$1.label = 2;
                    Object k2222 = nohVar.k(mapiClientImpl$executeRequest$1);
                    if (k2222 == coroutineSingletons) {
                    }
                }
            }
        }
        mapiClientImpl$executeRequest$1 = new MapiClientImpl$executeRequest$1(this, continuation);
        Object obj22 = mapiClientImpl$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapiClientImpl$executeRequest$1.label;
        if (i != 0) {
        }
    }
}
