package com.yandex.go.safety.center;

import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.api.ShareResponse;
import com.yandex.go.safety.center.share.notification.ShareStatus;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.SafetyCenterProvider$startShareSession$job$1", f = "SafetyCenterProvider.kt", l = {177, 178, 179, 181, 184, 188}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterProvider$startShareSession$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ lz40 $forceShareFlow;
    final /* synthetic */ ShareRequestParam $shareRequestParam;
    final /* synthetic */ pz40 $statusSubject;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterProvider$startShareSession$job$1(pz40 pz40Var, j jVar, lz40 lz40Var, ShareRequestParam shareRequestParam, Continuation continuation) {
        super(2, continuation);
        this.$statusSubject = pz40Var;
        this.this$0 = jVar;
        this.$forceShareFlow = lz40Var;
        this.$shareRequestParam = shareRequestParam;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SafetyCenterProvider$startShareSession$job$1 safetyCenterProvider$startShareSession$job$1 = new SafetyCenterProvider$startShareSession$job$1(this.$statusSubject, this.this$0, this.$forceShareFlow, this.$shareRequestParam, continuation);
        safetyCenterProvider$startShareSession$job$1.L$0 = obj;
        return safetyCenterProvider$startShareSession$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterProvider$startShareSession$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0177 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tse] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3, types: [vpr] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.yandex.go.safety.center.share.notification.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        j jVar;
        lz40 lz40Var;
        ShareRequestParam shareRequestParam;
        n4u0 n4u0Var;
        ?? r2;
        int i;
        pz40 pz40Var2;
        ShareRequestParam shareRequestParam2;
        j jVar2;
        n4u0 n4u0Var2;
        lz40 lz40Var2;
        pz40 pz40Var3;
        lz40 lz40Var3;
        pz40 pz40Var4;
        boolean z;
        tpr c;
        ?? r0 = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
            switch (i2) {
                case 0:
                    kotlin.b.b(obj);
                    pz40Var = this.$statusSubject;
                    jVar = this.this$0;
                    lz40Var = this.$forceShareFlow;
                    shareRequestParam = this.$shareRequestParam;
                    try {
                        ShareStatus shareStatus = ShareStatus.PREPARING;
                        this.L$0 = r0;
                        this.L$1 = pz40Var;
                        this.L$2 = jVar;
                        this.L$3 = lz40Var;
                        this.L$4 = shareRequestParam;
                        this.L$5 = pz40Var;
                        this.label = 1;
                        r0 r0Var = (r0) pz40Var;
                        r0Var.emit(shareStatus, this);
                        n4u0Var = r0Var;
                    } catch (Throwable th2) {
                        r0 = pz40Var;
                        th = th2;
                        ShareStatus.Companion.getClass();
                        rol0 b = com.yandex.go.safety.center.share.notification.a.b(th);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 6;
                        if (kotlinx.coroutines.flow.e.u(b, r0, this) != coroutineSingletons) {
                        }
                    }
                    if (zy11Var == coroutineSingletons) {
                    }
                    r2 = ShareStatus.Companion;
                    i = jVar.f.l;
                    this.L$0 = null;
                    this.L$1 = n4u0Var;
                    this.L$2 = jVar;
                    this.L$3 = shareRequestParam;
                    this.L$4 = pz40Var;
                    this.L$5 = null;
                    this.label = 2;
                    if (r2.a(i, lz40Var, r0, this) != coroutineSingletons) {
                        pz40Var2 = pz40Var;
                        shareRequestParam2 = shareRequestParam;
                        jVar2 = jVar;
                        n4u0Var2 = n4u0Var;
                        ShareStatus shareStatus2 = ShareStatus.IN_PROGRESS;
                        this.L$0 = null;
                        this.L$1 = n4u0Var2;
                        this.L$2 = jVar2;
                        this.L$3 = shareRequestParam2;
                        this.L$4 = pz40Var2;
                        this.label = 3;
                        r0 r0Var2 = (r0) n4u0Var2;
                        r0Var2.emit(shareStatus2, this);
                        pz40Var3 = pz40Var2;
                        lz40Var2 = r0Var2;
                        if (zy11Var == coroutineSingletons) {
                        }
                        this.L$0 = null;
                        this.L$1 = lz40Var2;
                        this.L$2 = jVar2;
                        this.L$3 = shareRequestParam2;
                        this.L$4 = pz40Var3;
                        this.label = 4;
                        obj = jVar2.l(shareRequestParam2, this);
                        pz40Var4 = pz40Var3;
                        lz40Var3 = lz40Var2;
                        if (obj == coroutineSingletons) {
                        }
                        ShareResponse shareResponse = (ShareResponse) obj;
                        List list = shareRequestParam2.b;
                        jVar2.getClass();
                        z = shareResponse.a;
                        ShareResponse.Message message = shareResponse.b;
                        if (z) {
                            String str = message != null ? message.a : null;
                            if (str != null && str.length() != 0) {
                                String str2 = message != null ? message.a : null;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                jVar2.m(str2, list);
                            }
                        }
                        ShareStatus.Companion.getClass();
                        c = com.yandex.go.safety.center.share.notification.a.c(shareResponse);
                        this.L$0 = null;
                        this.L$1 = jVar2;
                        this.L$2 = shareRequestParam2;
                        this.L$3 = pz40Var4;
                        this.L$4 = null;
                        this.label = 5;
                        r0 = pz40Var4;
                        if (kotlinx.coroutines.flow.e.u(c, lz40Var3, this) == coroutineSingletons) {
                        }
                        jVar2.y.remove(shareRequestParam2);
                        return zy11Var;
                    }
                case 1:
                    pz40 pz40Var5 = (pz40) this.L$5;
                    shareRequestParam = (ShareRequestParam) this.L$4;
                    lz40Var = (lz40) this.L$3;
                    jVar = (j) this.L$2;
                    n4u0 n4u0Var3 = (pz40) this.L$1;
                    try {
                        kotlin.b.b(obj);
                        pz40Var = pz40Var5;
                        n4u0Var = n4u0Var3;
                        r2 = ShareStatus.Companion;
                        i = jVar.f.l;
                        this.L$0 = null;
                        this.L$1 = n4u0Var;
                        this.L$2 = jVar;
                        this.L$3 = shareRequestParam;
                        this.L$4 = pz40Var;
                        this.L$5 = null;
                        this.label = 2;
                        if (r2.a(i, lz40Var, r0, this) != coroutineSingletons) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r0 = pz40Var5;
                        ShareStatus.Companion.getClass();
                        rol0 b2 = com.yandex.go.safety.center.share.notification.a.b(th);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 6;
                        return kotlinx.coroutines.flow.e.u(b2, r0, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                case 2:
                    pz40 pz40Var6 = (pz40) this.L$4;
                    shareRequestParam2 = (ShareRequestParam) this.L$3;
                    jVar2 = (j) this.L$2;
                    n4u0Var2 = (pz40) this.L$1;
                    kotlin.b.b(obj);
                    pz40Var2 = pz40Var6;
                    ShareStatus shareStatus22 = ShareStatus.IN_PROGRESS;
                    this.L$0 = null;
                    this.L$1 = n4u0Var2;
                    this.L$2 = jVar2;
                    this.L$3 = shareRequestParam2;
                    this.L$4 = pz40Var2;
                    this.label = 3;
                    r0 r0Var22 = (r0) n4u0Var2;
                    r0Var22.emit(shareStatus22, this);
                    pz40Var3 = pz40Var2;
                    lz40Var2 = r0Var22;
                    if (zy11Var == coroutineSingletons) {
                    }
                    this.L$0 = null;
                    this.L$1 = lz40Var2;
                    this.L$2 = jVar2;
                    this.L$3 = shareRequestParam2;
                    this.L$4 = pz40Var3;
                    this.label = 4;
                    obj = jVar2.l(shareRequestParam2, this);
                    pz40Var4 = pz40Var3;
                    lz40Var3 = lz40Var2;
                    if (obj == coroutineSingletons) {
                    }
                    ShareResponse shareResponse2 = (ShareResponse) obj;
                    List list2 = shareRequestParam2.b;
                    jVar2.getClass();
                    z = shareResponse2.a;
                    ShareResponse.Message message2 = shareResponse2.b;
                    if (z) {
                    }
                    ShareStatus.Companion.getClass();
                    c = com.yandex.go.safety.center.share.notification.a.c(shareResponse2);
                    this.L$0 = null;
                    this.L$1 = jVar2;
                    this.L$2 = shareRequestParam2;
                    this.L$3 = pz40Var4;
                    this.L$4 = null;
                    this.label = 5;
                    r0 = pz40Var4;
                    if (kotlinx.coroutines.flow.e.u(c, lz40Var3, this) == coroutineSingletons) {
                    }
                    jVar2.y.remove(shareRequestParam2);
                    return zy11Var;
                case 3:
                    pz40 pz40Var7 = (pz40) this.L$4;
                    shareRequestParam2 = (ShareRequestParam) this.L$3;
                    jVar2 = (j) this.L$2;
                    lz40 lz40Var4 = (pz40) this.L$1;
                    kotlin.b.b(obj);
                    pz40Var3 = pz40Var7;
                    lz40Var2 = lz40Var4;
                    this.L$0 = null;
                    this.L$1 = lz40Var2;
                    this.L$2 = jVar2;
                    this.L$3 = shareRequestParam2;
                    this.L$4 = pz40Var3;
                    this.label = 4;
                    obj = jVar2.l(shareRequestParam2, this);
                    pz40Var4 = pz40Var3;
                    lz40Var3 = lz40Var2;
                    if (obj == coroutineSingletons) {
                    }
                    ShareResponse shareResponse22 = (ShareResponse) obj;
                    List list22 = shareRequestParam2.b;
                    jVar2.getClass();
                    z = shareResponse22.a;
                    ShareResponse.Message message22 = shareResponse22.b;
                    if (z) {
                    }
                    ShareStatus.Companion.getClass();
                    c = com.yandex.go.safety.center.share.notification.a.c(shareResponse22);
                    this.L$0 = null;
                    this.L$1 = jVar2;
                    this.L$2 = shareRequestParam2;
                    this.L$3 = pz40Var4;
                    this.L$4 = null;
                    this.label = 5;
                    r0 = pz40Var4;
                    if (kotlinx.coroutines.flow.e.u(c, lz40Var3, this) == coroutineSingletons) {
                    }
                    jVar2.y.remove(shareRequestParam2);
                    return zy11Var;
                case 4:
                    pz40 pz40Var8 = (pz40) this.L$4;
                    shareRequestParam2 = (ShareRequestParam) this.L$3;
                    jVar2 = (j) this.L$2;
                    lz40 lz40Var5 = (pz40) this.L$1;
                    kotlin.b.b(obj);
                    pz40Var4 = pz40Var8;
                    lz40Var3 = lz40Var5;
                    ShareResponse shareResponse222 = (ShareResponse) obj;
                    List list222 = shareRequestParam2.b;
                    jVar2.getClass();
                    z = shareResponse222.a;
                    ShareResponse.Message message222 = shareResponse222.b;
                    if (z) {
                    }
                    ShareStatus.Companion.getClass();
                    c = com.yandex.go.safety.center.share.notification.a.c(shareResponse222);
                    this.L$0 = null;
                    this.L$1 = jVar2;
                    this.L$2 = shareRequestParam2;
                    this.L$3 = pz40Var4;
                    this.L$4 = null;
                    this.label = 5;
                    r0 = pz40Var4;
                    if (kotlinx.coroutines.flow.e.u(c, lz40Var3, this) == coroutineSingletons) {
                    }
                    jVar2.y.remove(shareRequestParam2);
                    return zy11Var;
                case 5:
                    pz40 pz40Var9 = (pz40) this.L$3;
                    shareRequestParam2 = (ShareRequestParam) this.L$2;
                    jVar2 = (j) this.L$1;
                    kotlin.b.b(obj);
                    r0 = pz40Var9;
                    jVar2.y.remove(shareRequestParam2);
                    return zy11Var;
                case 6:
                    kotlin.b.b(obj);
                default:
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
