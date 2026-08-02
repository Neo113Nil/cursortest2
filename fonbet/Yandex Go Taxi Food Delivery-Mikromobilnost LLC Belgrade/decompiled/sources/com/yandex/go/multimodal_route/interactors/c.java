package com.yandex.go.multimodal_route.interactors;

import com.yandex.mapkit.transport.Transport;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.g6u;
import defpackage.j18;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pw30;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uu40;
import defpackage.uyj;
import defpackage.vj;
import defpackage.vu40;
import defpackage.wj;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.map_common.map.r;

/* loaded from: classes8.dex */
public final class c implements uu40 {
    public final r a;
    public final tt2 b;

    public c(r rVar, tt2 tt2Var) {
        this.a = rVar;
        this.b = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v6, types: [T, pw30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, String str, ContinuationImpl continuationImpl) {
        MultimodalRouteUriInteractorImpl$resolveUriInternal$1 multimodalRouteUriInteractorImpl$resolveUriInternal$1;
        int i;
        cl7 cl7Var;
        cVar.getClass();
        if (continuationImpl instanceof MultimodalRouteUriInteractorImpl$resolveUriInternal$1) {
            multimodalRouteUriInteractorImpl$resolveUriInternal$1 = (MultimodalRouteUriInteractorImpl$resolveUriInternal$1) continuationImpl;
            int i2 = multimodalRouteUriInteractorImpl$resolveUriInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteUriInteractorImpl$resolveUriInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteUriInteractorImpl$resolveUriInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteUriInteractorImpl$resolveUriInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r rVar = cVar.a;
                    multimodalRouteUriInteractorImpl$resolveUriInternal$1.L$0 = str;
                    multimodalRouteUriInteractorImpl$resolveUriInternal$1.label = 1;
                    obj = rVar.a(multimodalRouteUriInteractorImpl$resolveUriInternal$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) multimodalRouteUriInteractorImpl$resolveUriInternal$1.L$0;
                    kotlin.b.b(obj);
                }
                Transport transport = (Transport) obj;
                multimodalRouteUriInteractorImpl$resolveUriInternal$1.L$0 = str;
                multimodalRouteUriInteractorImpl$resolveUriInternal$1.L$1 = transport;
                multimodalRouteUriInteractorImpl$resolveUriInternal$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(multimodalRouteUriInteractorImpl$resolveUriInternal$1));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(29, y);
                cl7Var = new cl7(j18Var, vjVar);
                y.element = new pw30(transport.createTaxiMasstransitRouter().resolveUri(str, new vu40(new MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$2(cl7Var), new MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$3(cl7Var))), 5);
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 29));
                } else {
                    vjVar.invoke();
                }
                Object s = j18Var.s();
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        multimodalRouteUriInteractorImpl$resolveUriInternal$1 = new MultimodalRouteUriInteractorImpl$resolveUriInternal$1(cVar, continuationImpl);
        Object obj2 = multimodalRouteUriInteractorImpl$resolveUriInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteUriInteractorImpl$resolveUriInternal$1.label;
        if (i != 0) {
        }
        Transport transport2 = (Transport) obj2;
        multimodalRouteUriInteractorImpl$resolveUriInternal$1.L$0 = str;
        multimodalRouteUriInteractorImpl$resolveUriInternal$1.L$1 = transport2;
        multimodalRouteUriInteractorImpl$resolveUriInternal$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(multimodalRouteUriInteractorImpl$resolveUriInternal$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        vj vjVar2 = new vj(29, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        y2.element = new pw30(transport2.createTaxiMasstransitRouter().resolveUri(str, new vu40(new MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$2(cl7Var), new MultimodalRouteUriInteractorImpl$resolveUriInternal$$inlined$suspendCallbackApi$3(cl7Var))), 5);
        if (cl7Var.c()) {
        }
        Object s2 = j18Var2.s();
        if (s2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        MultimodalRouteUriInteractorImpl$resolveUri$1 multimodalRouteUriInteractorImpl$resolveUri$1;
        int i;
        if (continuationImpl instanceof MultimodalRouteUriInteractorImpl$resolveUri$1) {
            multimodalRouteUriInteractorImpl$resolveUri$1 = (MultimodalRouteUriInteractorImpl$resolveUri$1) continuationImpl;
            int i2 = multimodalRouteUriInteractorImpl$resolveUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteUriInteractorImpl$resolveUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteUriInteractorImpl$resolveUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteUriInteractorImpl$resolveUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    MultimodalRouteUriInteractorImpl$resolveUri$2 multimodalRouteUriInteractorImpl$resolveUri$2 = new MultimodalRouteUriInteractorImpl$resolveUri$2(this, str, null);
                    multimodalRouteUriInteractorImpl$resolveUri$1.L$0 = null;
                    multimodalRouteUriInteractorImpl$resolveUri$1.label = 1;
                    obj = tje.k0(g6uVar, multimodalRouteUriInteractorImpl$resolveUri$2, multimodalRouteUriInteractorImpl$resolveUri$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        multimodalRouteUriInteractorImpl$resolveUri$1 = new MultimodalRouteUriInteractorImpl$resolveUri$1(this, continuationImpl);
        Object obj2 = multimodalRouteUriInteractorImpl$resolveUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteUriInteractorImpl$resolveUri$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
