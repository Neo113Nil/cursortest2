package com.yandex.go.dynamic.impl;

import com.yandex.go.dynamic.api.DynamicFeature;
import defpackage.a8n;
import defpackage.alw0;
import defpackage.b8n;
import defpackage.d8n;
import defpackage.g050;
import defpackage.g7n;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.y7n;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"Lh7n;", "T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.dynamic.impl.DynamicFeatureLoaderImpl$startDownload$1", f = "DynamicFeatureLoaderImpl.kt", l = {105, 331, 112, HProv.PP_CACHE_SIZE, HProv.PP_SAME_MEDIA, HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DynamicFeatureLoaderImpl$startDownload$1 extends SuspendLambda implements wls {
    final /* synthetic */ DynamicFeature $feature;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFeatureLoaderImpl$startDownload$1(DynamicFeature dynamicFeature, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$feature = dynamicFeature;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicFeatureLoaderImpl$startDownload$1(this.$feature, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicFeatureLoaderImpl$startDownload$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0057: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:79:0x0055 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0058: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:79:0x0055 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014c A[Catch: all -> 0x003c, CancellationException -> 0x01a4, TRY_LEAVE, TryCatch #5 {all -> 0x003c, blocks: (B:16:0x0037, B:17:0x0146, B:19:0x014c), top: B:15:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4 A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #4 {all -> 0x00fb, blocks: (B:43:0x00e8, B:45:0x00f4), top: B:42:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102 A[Catch: all -> 0x0054, CancellationException -> 0x01a4, TRY_LEAVE, TryCatch #2 {all -> 0x0054, blocks: (B:28:0x004f, B:49:0x00fd, B:51:0x0102, B:56:0x0156, B:57:0x0159, B:62:0x0099, B:64:0x00c9), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e5  */
    /* JADX WARN: Type inference failed for: r0v24, types: [g050] */
    /* JADX WARN: Type inference failed for: r3v11, types: [pz40] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        DynamicFeature dynamicFeature;
        DynamicFeature dynamicFeature2;
        b bVar;
        b bVar2;
        Throwable th2;
        DynamicFeature dynamicFeature3;
        b bVar3;
        b bVar4;
        DynamicFeature dynamicFeature4;
        kotlinx.coroutines.sync.a aVar;
        pz40 pz40Var;
        kotlinx.coroutines.sync.a aVar2;
        r0 r0Var;
        d8n d8nVar;
        boolean z;
        r0 r0Var2;
        boolean z2;
        d8n d8nVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean z3 = true;
        try {
            try {
            } catch (Throwable th3) {
                th = th3;
                dynamicFeature2 = dynamicFeature;
                bVar2 = bVar;
            }
            switch (this.label) {
                case 0:
                    kotlin.b.b(obj);
                    DynamicFeature dynamicFeature5 = this.$feature;
                    b bVar5 = this.this$0;
                    try {
                        List list = alw0.a;
                    } catch (Throwable th4) {
                        dynamicFeature2 = dynamicFeature5;
                        th = th4;
                        bVar2 = bVar5;
                        g7n g7nVar = bVar2.c;
                        String id = dynamicFeature2.getId();
                        g7nVar.a.d(id);
                        xby.l(jst.e, "DynamicFeature.Download.Error", null, th, id, 2);
                        this.L$0 = th;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 5;
                        obj = b.i(bVar2, dynamicFeature2, this);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (!alw0.a.contains(dynamicFeature5)) {
                        return null;
                    }
                    this.L$0 = dynamicFeature5;
                    this.L$1 = bVar5;
                    this.L$2 = bVar5;
                    this.L$3 = dynamicFeature5;
                    this.label = 1;
                    Object i = b.i(bVar5, dynamicFeature5, this);
                    if (i != coroutineSingletons) {
                        dynamicFeature3 = dynamicFeature5;
                        bVar3 = bVar5;
                        bVar4 = bVar3;
                        dynamicFeature4 = dynamicFeature3;
                        obj = i;
                        pz40 pz40Var2 = (pz40) obj;
                        aVar = bVar4.f;
                        this.L$0 = dynamicFeature3;
                        this.L$1 = bVar4;
                        this.L$2 = bVar3;
                        this.L$3 = dynamicFeature4;
                        this.L$4 = pz40Var2;
                        this.L$5 = aVar;
                        this.L$6 = null;
                        this.label = 2;
                        if (aVar.a(this) != coroutineSingletons) {
                            pz40Var = pz40Var2;
                            aVar2 = aVar;
                            try {
                                r0Var = (r0) pz40Var;
                                d8nVar = (d8n) r0Var.getValue();
                                if (!(d8nVar instanceof a8n)) {
                                    if (!(d8nVar instanceof y7n)) {
                                        z3 = false;
                                    }
                                }
                                if (z3) {
                                    z = z3;
                                    bVar2 = bVar3;
                                    DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1 dynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1 = new DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1(2, null);
                                    this.L$0 = bVar2;
                                    this.L$1 = dynamicFeature4;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.Z$0 = z;
                                    this.label = 4;
                                    obj = e.x(r0Var, dynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1, this);
                                    if (obj != coroutineSingletons) {
                                    }
                                } else {
                                    this.L$0 = bVar3;
                                    this.L$1 = dynamicFeature4;
                                    this.L$2 = r0Var;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.Z$0 = z3;
                                    this.label = 3;
                                    if (b.d(bVar4, dynamicFeature3, r0Var, this) != coroutineSingletons) {
                                        boolean z4 = z3;
                                        r0Var2 = r0Var;
                                        z2 = z4;
                                        z = z2;
                                        r0Var = r0Var2;
                                        bVar2 = bVar3;
                                        try {
                                            DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1 dynamicFeatureLoaderImpl$startDownload$1$1$terminalState$12 = new DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1(2, null);
                                            this.L$0 = bVar2;
                                            this.L$1 = dynamicFeature4;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.Z$0 = z;
                                            this.label = 4;
                                            obj = e.x(r0Var, dynamicFeatureLoaderImpl$startDownload$1$1$terminalState$12, this);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            dynamicFeature2 = dynamicFeature4;
                                            g7n g7nVar2 = bVar2.c;
                                            String id2 = dynamicFeature2.getId();
                                            g7nVar2.a.d(id2);
                                            xby.l(jst.e, "DynamicFeature.Download.Error", null, th, id2, 2);
                                            this.L$0 = th;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.label = 5;
                                            obj = b.i(bVar2, dynamicFeature2, this);
                                            if (obj != coroutineSingletons) {
                                            }
                                            return coroutineSingletons;
                                        }
                                        if (obj != coroutineSingletons) {
                                            dynamicFeature2 = dynamicFeature4;
                                            d8nVar2 = (d8n) obj;
                                            if (d8nVar2 instanceof b8n) {
                                                return ((b8n) d8nVar2).a;
                                            }
                                            return null;
                                        }
                                    }
                                }
                            } finally {
                                aVar2.d(null);
                            }
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    dynamicFeature4 = (DynamicFeature) this.L$3;
                    bVar3 = (b) this.L$2;
                    b bVar6 = (b) this.L$1;
                    DynamicFeature dynamicFeature6 = (DynamicFeature) this.L$0;
                    kotlin.b.b(obj);
                    bVar4 = bVar6;
                    dynamicFeature3 = dynamicFeature6;
                    pz40 pz40Var22 = (pz40) obj;
                    aVar = bVar4.f;
                    this.L$0 = dynamicFeature3;
                    this.L$1 = bVar4;
                    this.L$2 = bVar3;
                    this.L$3 = dynamicFeature4;
                    this.L$4 = pz40Var22;
                    this.L$5 = aVar;
                    this.L$6 = null;
                    this.label = 2;
                    if (aVar.a(this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                case 2:
                    ?? r0 = (g050) this.L$5;
                    pz40 pz40Var3 = (pz40) this.L$4;
                    DynamicFeature dynamicFeature7 = (DynamicFeature) this.L$3;
                    b bVar7 = (b) this.L$2;
                    bVar4 = (b) this.L$1;
                    dynamicFeature3 = (DynamicFeature) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        aVar2 = r0;
                        pz40Var = pz40Var3;
                        dynamicFeature4 = dynamicFeature7;
                        bVar3 = bVar7;
                        r0Var = (r0) pz40Var;
                        d8nVar = (d8n) r0Var.getValue();
                        if (!(d8nVar instanceof a8n)) {
                        }
                        if (z3) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        dynamicFeature2 = dynamicFeature7;
                        bVar2 = bVar7;
                        g7n g7nVar22 = bVar2.c;
                        String id22 = dynamicFeature2.getId();
                        g7nVar22.a.d(id22);
                        xby.l(jst.e, "DynamicFeature.Download.Error", null, th, id22, 2);
                        this.L$0 = th;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 5;
                        obj = b.i(bVar2, dynamicFeature2, this);
                        if (obj != coroutineSingletons) {
                            th2 = th;
                            y7n y7nVar = new y7n(th2);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 6;
                            ((r0) ((pz40) obj)).emit(y7nVar, this);
                            if (zy11.a != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    break;
                case 3:
                    z2 = this.Z$0;
                    ?? r3 = (pz40) this.L$2;
                    dynamicFeature4 = (DynamicFeature) this.L$1;
                    bVar3 = (b) this.L$0;
                    kotlin.b.b(obj);
                    r0Var2 = r3;
                    z = z2;
                    r0Var = r0Var2;
                    bVar2 = bVar3;
                    DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1 dynamicFeatureLoaderImpl$startDownload$1$1$terminalState$122 = new DynamicFeatureLoaderImpl$startDownload$1$1$terminalState$1(2, null);
                    this.L$0 = bVar2;
                    this.L$1 = dynamicFeature4;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.Z$0 = z;
                    this.label = 4;
                    obj = e.x(r0Var, dynamicFeatureLoaderImpl$startDownload$1$1$terminalState$122, this);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                case 4:
                    dynamicFeature2 = (DynamicFeature) this.L$1;
                    bVar2 = (b) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        d8nVar2 = (d8n) obj;
                        if (d8nVar2 instanceof b8n) {
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        g7n g7nVar222 = bVar2.c;
                        String id222 = dynamicFeature2.getId();
                        g7nVar222.a.d(id222);
                        xby.l(jst.e, "DynamicFeature.Download.Error", null, th, id222, 2);
                        this.L$0 = th;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 5;
                        obj = b.i(bVar2, dynamicFeature2, this);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    return null;
                case 5:
                    th2 = (Throwable) this.L$0;
                    kotlin.b.b(obj);
                    y7n y7nVar2 = new y7n(th2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 6;
                    ((r0) ((pz40) obj)).emit(y7nVar2, this);
                    if (zy11.a != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return null;
                case 6:
                    kotlin.b.b(obj);
                    return null;
                default:
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
