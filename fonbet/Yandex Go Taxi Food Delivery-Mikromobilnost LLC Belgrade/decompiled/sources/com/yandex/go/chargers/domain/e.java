package com.yandex.go.chargers.domain;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.data.model.ChargersUserStateResponse;
import com.yandex.go.chargers.network.api.ChargersApi;
import defpackage.cmt;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.ney;
import defpackage.ny61;
import defpackage.sya;
import defpackage.tt2;
import defpackage.u2a;
import defpackage.vya;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class e implements u2a {
    public final h3y a;
    public final ney b;
    public final sya c;
    public final f d;
    public final a e;
    public final vya f;
    public final hbp0 g;
    public final d h = new d(this);

    /* JADX WARN: Multi-variable type inference failed */
    public e(tt2 tt2Var, h3y h3yVar, ney neyVar, sya syaVar, f fVar, a aVar, vya vyaVar) {
        this.a = h3yVar;
        this.b = neyVar;
        this.c = syaVar;
        this.d = fVar;
        this.e = aVar;
        this.f = vyaVar;
        this.g = new hbp0(new ChargersUserStateInteractor$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, ContinuationImpl continuationImpl) {
        ChargersUserStateInteractor$getAndStoreUserState$1 chargersUserStateInteractor$getAndStoreUserState$1;
        int i;
        ChargersUserStateResponse chargersUserStateResponse;
        eVar.getClass();
        if (continuationImpl instanceof ChargersUserStateInteractor$getAndStoreUserState$1) {
            chargersUserStateInteractor$getAndStoreUserState$1 = (ChargersUserStateInteractor$getAndStoreUserState$1) continuationImpl;
            int i2 = chargersUserStateInteractor$getAndStoreUserState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersUserStateInteractor$getAndStoreUserState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersUserStateInteractor$getAndStoreUserState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersUserStateInteractor$getAndStoreUserState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersUserStateInteractor$getAndStoreUserState$1.label = 1;
                    obj = eVar.c(chargersUserStateInteractor$getAndStoreUserState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                chargersUserStateResponse = (ChargersUserStateResponse) obj;
                zy11 zy11Var = zy11.a;
                if (chargersUserStateResponse != null) {
                    return zy11Var;
                }
                r0 r0Var = eVar.c.a;
                r0Var.getClass();
                r0Var.m(null, chargersUserStateResponse);
                return zy11Var;
            }
        }
        chargersUserStateInteractor$getAndStoreUserState$1 = new ChargersUserStateInteractor$getAndStoreUserState$1(eVar, continuationImpl);
        Object obj3 = chargersUserStateInteractor$getAndStoreUserState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersUserStateInteractor$getAndStoreUserState$1.label;
        if (i != 0) {
        }
        chargersUserStateResponse = (ChargersUserStateResponse) obj3;
        zy11 zy11Var2 = zy11.a;
        if (chargersUserStateResponse != null) {
        }
    }

    @Override // defpackage.u2a
    public final void a() {
        ney neyVar = this.b;
        d dVar = this.h;
        neyVar.b(dVar, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(1:12)(2:13|14))(2:16|17))(4:18|19|20|(1:23)(1:22)))|24|25|(4:27|(2:29|23)|20|(0)(0))(1:30)))|38|6|7|(0)|24|25|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        r10 = defpackage.s8o.I(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r10 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        r7 = r10.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        r0.L$0 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        r7 = 3000;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: GoApiException -> 0x0039, TRY_ENTER, TryCatch #0 {GoApiException -> 0x0039, blocks: (B:16:0x0035, B:27:0x0050, B:20:0x0066, B:19:0x003f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ChargersUserStateInteractor$requestUserState$1 chargersUserStateInteractor$requestUserState$1;
        int i;
        ChargersApi chargersApi;
        if (continuationImpl instanceof ChargersUserStateInteractor$requestUserState$1) {
            chargersUserStateInteractor$requestUserState$1 = (ChargersUserStateInteractor$requestUserState$1) continuationImpl;
            int i2 = chargersUserStateInteractor$requestUserState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersUserStateInteractor$requestUserState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersUserStateInteractor$requestUserState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersUserStateInteractor$requestUserState$1.label;
                if (i != 0) {
                    if (i == 1) {
                        chargersApi = (ChargersApi) chargersUserStateInteractor$requestUserState$1.L$0;
                        kotlin.b.b(obj);
                        cmt<ChargersUserStateResponse> a = chargersApi.a((Map) obj);
                        chargersUserStateInteractor$requestUserState$1.L$0 = null;
                        chargersUserStateInteractor$requestUserState$1.label = 2;
                        Object a2 = ru.yandex.taxi.network.api.a.a(a, null, chargersUserStateInteractor$requestUserState$1);
                        return a2 != obj2 ? obj2 : a2;
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                if (kotlinx.coroutines.a.p(chargersUserStateInteractor$requestUserState$1.get_context())) {
                    return null;
                }
                chargersApi = (ChargersApi) this.a.get();
                f fVar = this.d;
                chargersUserStateInteractor$requestUserState$1.L$0 = chargersApi;
                chargersUserStateInteractor$requestUserState$1.label = 1;
                obj = fVar.c(chargersUserStateInteractor$requestUserState$1);
                if (obj == obj2) {
                }
                cmt<ChargersUserStateResponse> a3 = chargersApi.a((Map) obj);
                chargersUserStateInteractor$requestUserState$1.L$0 = null;
                chargersUserStateInteractor$requestUserState$1.label = 2;
                Object a22 = ru.yandex.taxi.network.api.a.a(a3, null, chargersUserStateInteractor$requestUserState$1);
                if (a22 != obj2) {
                }
            }
        }
        chargersUserStateInteractor$requestUserState$1 = new ChargersUserStateInteractor$requestUserState$1(this, continuationImpl);
        Object obj3 = chargersUserStateInteractor$requestUserState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersUserStateInteractor$requestUserState$1.label;
        if (i != 0) {
        }
        kotlin.b.b(obj3);
        if (kotlinx.coroutines.a.p(chargersUserStateInteractor$requestUserState$1.get_context())) {
        }
    }

    @Override // defpackage.u2a
    public final void onDetach() {
        this.b.d(this.h);
    }
}
