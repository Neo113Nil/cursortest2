package com.yandex.go.inapp_calls.repository;

import android.content.Context;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.inapp_calls.InAppCallsDynamicApi;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.proxyprovision.i;
import com.yandex.go.proxyprovision.j;
import defpackage.a8n;
import defpackage.b8n;
import defpackage.c8n;
import defpackage.d8n;
import defpackage.g050;
import defpackage.g6u;
import defpackage.gtq0;
import defpackage.i7n;
import defpackage.jkv;
import defpackage.jst;
import defpackage.mdh;
import defpackage.njv;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pjv;
import defpackage.qjv;
import defpackage.sjh;
import defpackage.t270;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.y7n;
import defpackage.z7n;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.experiments.d;

/* loaded from: classes.dex */
public final class c {
    public final q a;
    public final tt2 b;
    public final i7n c;
    public final njv d;
    public final Context e;
    public final zuj0 f;
    public final jkv g;
    public final t270 h;
    public final j i;
    public volatile InAppCallsDynamicApi j;
    public final kotlinx.coroutines.sync.a k = gtq0.a();

    public c(q qVar, tt2 tt2Var, i7n i7nVar, njv njvVar, Context context, zuj0 zuj0Var, jkv jkvVar, t270 t270Var, j jVar) {
        this.a = qVar;
        this.b = tt2Var;
        this.c = i7nVar;
        this.d = njvVar;
        this.e = context;
        this.f = zuj0Var;
        this.g = jkvVar;
        this.h = t270Var;
        this.i = jVar;
    }

    public static InAppCallsFeatureWrapper$State g(d8n d8nVar) {
        if (d8nVar instanceof b8n) {
            return InAppCallsFeatureWrapper$State.READY;
        }
        if (d8nVar instanceof a8n) {
            return InAppCallsFeatureWrapper$State.NOT_LOADED;
        }
        if (d8nVar instanceof z7n) {
            return InAppCallsFeatureWrapper$State.LOADING;
        }
        if (d8nVar instanceof c8n) {
            return InAppCallsFeatureWrapper$State.UNAVAILABLE;
        }
        if (d8nVar instanceof y7n) {
            return InAppCallsFeatureWrapper$State.ERROR;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1 inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1;
        Object obj;
        int i;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof InAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1) {
            inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1 = (InAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1) continuationImpl;
            int i2 = inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1.label = i2 - Integer.MIN_VALUE;
                obj = inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = this.i;
                    inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1.label = 1;
                    obj = jVar.a(inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1);
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
                if (((Boolean) obj).booleanValue() || this.j != null) {
                    return zy11Var;
                }
                ((com.yandex.go.dynamic.impl.b) this.c).p(DynamicFeature.INAPP_CALLS).start();
                return zy11Var;
            }
        }
        inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1 = new InAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1(this, continuationImpl);
        obj = inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsFeatureWrapper$forceLoadInAppCallsFeature$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
            ((com.yandex.go.dynamic.impl.b) this.c).p(DynamicFeature.INAPP_CALLS).start();
            return zy11Var;
        }
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(ContinuationImpl continuationImpl) {
        InAppCallsFeatureWrapper$getCurrentState$1 inAppCallsFeatureWrapper$getCurrentState$1;
        Object obj;
        int i;
        if (continuationImpl instanceof InAppCallsFeatureWrapper$getCurrentState$1) {
            inAppCallsFeatureWrapper$getCurrentState$1 = (InAppCallsFeatureWrapper$getCurrentState$1) continuationImpl;
            int i2 = inAppCallsFeatureWrapper$getCurrentState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsFeatureWrapper$getCurrentState$1.label = i2 - Integer.MIN_VALUE;
                obj = inAppCallsFeatureWrapper$getCurrentState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsFeatureWrapper$getCurrentState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = this.i;
                    inAppCallsFeatureWrapper$getCurrentState$1.label = 1;
                    obj = jVar.a(inAppCallsFeatureWrapper$getCurrentState$1);
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
                if (!((Boolean) obj).booleanValue()) {
                    return InAppCallsFeatureWrapper$State.UNAVAILABLE;
                }
                if (this.j != null) {
                    return InAppCallsFeatureWrapper$State.READY;
                }
                i7n i7nVar = this.c;
                DynamicFeature dynamicFeature = DynamicFeature.INAPP_CALLS;
                ((com.yandex.go.dynamic.impl.b) i7nVar).getClass();
                return g(com.yandex.go.dynamic.impl.b.n(dynamicFeature));
            }
        }
        inAppCallsFeatureWrapper$getCurrentState$1 = new InAppCallsFeatureWrapper$getCurrentState$1(this, continuationImpl);
        obj = inAppCallsFeatureWrapper$getCurrentState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsFeatureWrapper$getCurrentState$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final g c() {
        return e.X(new i(d.b(this.i.a)), new InAppCallsFeatureWrapper$getStateFlow$$inlined$flatMapLatest$1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r8.f(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(pjv pjvVar, ContinuationImpl continuationImpl) {
        InAppCallsFeatureWrapper$handleIncomingPush$1 inAppCallsFeatureWrapper$handleIncomingPush$1;
        Object obj;
        int i;
        pjv pjvVar2;
        c cVar;
        InAppCallsDynamicApi inAppCallsDynamicApi;
        if (continuationImpl instanceof InAppCallsFeatureWrapper$handleIncomingPush$1) {
            inAppCallsFeatureWrapper$handleIncomingPush$1 = (InAppCallsFeatureWrapper$handleIncomingPush$1) continuationImpl;
            int i2 = inAppCallsFeatureWrapper$handleIncomingPush$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsFeatureWrapper$handleIncomingPush$1.label = i2 - Integer.MIN_VALUE;
                obj = inAppCallsFeatureWrapper$handleIncomingPush$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsFeatureWrapper$handleIncomingPush$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = this.i;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.L$0 = pjvVar;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.L$1 = this;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.label = 1;
                    obj = jVar.a(inAppCallsFeatureWrapper$handleIncomingPush$1);
                    if (obj != coroutineSingletons) {
                        pjvVar2 = pjvVar;
                        cVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    cVar = (c) inAppCallsFeatureWrapper$handleIncomingPush$1.L$1;
                    pjvVar2 = (pjv) inAppCallsFeatureWrapper$handleIncomingPush$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    cVar = (c) inAppCallsFeatureWrapper$handleIncomingPush$1.L$1;
                    pjvVar2 = (pjv) inAppCallsFeatureWrapper$handleIncomingPush$1.L$0;
                    kotlin.b.b(obj);
                    inAppCallsDynamicApi = cVar.j;
                    if (inAppCallsDynamicApi != null) {
                        InAppCallsFeatureWrapper$NotReadyException inAppCallsFeatureWrapper$NotReadyException = new InAppCallsFeatureWrapper$NotReadyException("await init before call function");
                        jst.e.s(inAppCallsFeatureWrapper$NotReadyException);
                        return new Result.Failure(inAppCallsFeatureWrapper$NotReadyException);
                    }
                    cVar.h();
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    InAppCallsFeatureWrapper$handleIncomingPush$2$1 inAppCallsFeatureWrapper$handleIncomingPush$2$1 = new InAppCallsFeatureWrapper$handleIncomingPush$2$1(inAppCallsDynamicApi, pjvVar2, null);
                    inAppCallsFeatureWrapper$handleIncomingPush$1.L$0 = null;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.L$1 = null;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.L$2 = null;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.L$3 = null;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.L$4 = null;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.label = 3;
                    obj = tje.k0(g6uVar, inAppCallsFeatureWrapper$handleIncomingPush$2$1, inAppCallsFeatureWrapper$handleIncomingPush$1);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new Result.Failure(new InAppCallsFeatureWrapper$NotReadyException("in-app calls are disabled by experiment"));
                }
                if (cVar.j == null) {
                    inAppCallsFeatureWrapper$handleIncomingPush$1.L$0 = pjvVar2;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.L$1 = cVar;
                    inAppCallsFeatureWrapper$handleIncomingPush$1.label = 2;
                }
                inAppCallsDynamicApi = cVar.j;
                if (inAppCallsDynamicApi != null) {
                }
            }
        }
        inAppCallsFeatureWrapper$handleIncomingPush$1 = new InAppCallsFeatureWrapper$handleIncomingPush$1(this, continuationImpl);
        obj = inAppCallsFeatureWrapper$handleIncomingPush$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsFeatureWrapper$handleIncomingPush$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        InAppCallsFeatureWrapper$hasActiveCall$1 inAppCallsFeatureWrapper$hasActiveCall$1;
        Object obj;
        int i;
        InAppCallsDynamicApi inAppCallsDynamicApi;
        if (continuationImpl instanceof InAppCallsFeatureWrapper$hasActiveCall$1) {
            inAppCallsFeatureWrapper$hasActiveCall$1 = (InAppCallsFeatureWrapper$hasActiveCall$1) continuationImpl;
            int i2 = inAppCallsFeatureWrapper$hasActiveCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsFeatureWrapper$hasActiveCall$1.label = i2 - Integer.MIN_VALUE;
                obj = inAppCallsFeatureWrapper$hasActiveCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsFeatureWrapper$hasActiveCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = this.i;
                    inAppCallsFeatureWrapper$hasActiveCall$1.label = 1;
                    obj = jVar.a(inAppCallsFeatureWrapper$hasActiveCall$1);
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
                if (((Boolean) obj).booleanValue() && (inAppCallsDynamicApi = this.j) != null) {
                }
                return Boolean.FALSE;
            }
        }
        inAppCallsFeatureWrapper$hasActiveCall$1 = new InAppCallsFeatureWrapper$hasActiveCall$1(this, continuationImpl);
        obj = inAppCallsFeatureWrapper$hasActiveCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsFeatureWrapper$hasActiveCall$1.label;
        if (i != 0) {
        }
        return ((Boolean) obj).booleanValue() ? Boolean.FALSE : Boolean.valueOf(inAppCallsDynamicApi.l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        if (r9.a(r1) == r2) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:24:0x0052, B:28:0x005a), top: B:23:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1 inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        zy11 zy11Var = zy11.a;
        try {
            if (continuationImpl instanceof InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1) {
                inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1 = (InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1) continuationImpl;
                int i2 = inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.k;
                        inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.L$0 = aVar;
                        inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                g050Var.d(null);
                                return zy11Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r3 = (g050) inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r3;
                    }
                    if (this.j == null) {
                        aVar.d(null);
                        return zy11Var;
                    }
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$2$1 inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$2$1 = new InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$2$1(this, null);
                    inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.L$0 = aVar;
                    inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.label = 2;
                    if (tje.k0(mdhVar, inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$2$1, inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1) != coroutineSingletons) {
                        g050Var = aVar;
                        g050Var.d(null);
                        return zy11Var;
                    }
                    return coroutineSingletons;
                }
            }
            if (this.j == null) {
            }
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar2 = aVar;
            th = th3;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
        inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1 = new InAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1(this, continuationImpl);
        Object obj2 = inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsFeatureWrapper$initPluginIfDynamicFeatureReady$1.label;
        if (i != 0) {
        }
    }

    public final void h() {
        jkv jkvVar = this.g;
        if (jkvVar.a.g("IsInAppCallsUsed", false)) {
            return;
        }
        jkvVar.a.u("IsInAppCallsUsed", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        InAppCallsFeatureWrapper$prefetch$1 inAppCallsFeatureWrapper$prefetch$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof InAppCallsFeatureWrapper$prefetch$1) {
            inAppCallsFeatureWrapper$prefetch$1 = (InAppCallsFeatureWrapper$prefetch$1) continuationImpl;
            int i2 = inAppCallsFeatureWrapper$prefetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsFeatureWrapper$prefetch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppCallsFeatureWrapper$prefetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsFeatureWrapper$prefetch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppCallsFeatureWrapper$prefetch$1.label = 1;
                    obj = this.i.a(inAppCallsFeatureWrapper$prefetch$1);
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
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (!booleanValue) {
                    return zy11Var;
                }
                ((com.yandex.go.dynamic.impl.b) this.c).o(DynamicFeature.INAPP_CALLS);
                return zy11Var;
            }
        }
        inAppCallsFeatureWrapper$prefetch$1 = new InAppCallsFeatureWrapper$prefetch$1(this, continuationImpl);
        Object obj2 = inAppCallsFeatureWrapper$prefetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsFeatureWrapper$prefetch$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (!booleanValue) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r8.f(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Context context, ContinuationImpl continuationImpl) {
        InAppCallsFeatureWrapper$resumeCall$1 inAppCallsFeatureWrapper$resumeCall$1;
        Object obj;
        int i;
        Context context2;
        c cVar;
        InAppCallsDynamicApi inAppCallsDynamicApi;
        if (continuationImpl instanceof InAppCallsFeatureWrapper$resumeCall$1) {
            inAppCallsFeatureWrapper$resumeCall$1 = (InAppCallsFeatureWrapper$resumeCall$1) continuationImpl;
            int i2 = inAppCallsFeatureWrapper$resumeCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsFeatureWrapper$resumeCall$1.label = i2 - Integer.MIN_VALUE;
                obj = inAppCallsFeatureWrapper$resumeCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsFeatureWrapper$resumeCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = this.i;
                    inAppCallsFeatureWrapper$resumeCall$1.L$0 = context;
                    inAppCallsFeatureWrapper$resumeCall$1.L$1 = this;
                    inAppCallsFeatureWrapper$resumeCall$1.label = 1;
                    obj = jVar.a(inAppCallsFeatureWrapper$resumeCall$1);
                    if (obj != coroutineSingletons) {
                        context2 = context;
                        cVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    cVar = (c) inAppCallsFeatureWrapper$resumeCall$1.L$1;
                    context2 = (Context) inAppCallsFeatureWrapper$resumeCall$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    cVar = (c) inAppCallsFeatureWrapper$resumeCall$1.L$1;
                    context2 = (Context) inAppCallsFeatureWrapper$resumeCall$1.L$0;
                    kotlin.b.b(obj);
                    inAppCallsDynamicApi = cVar.j;
                    if (inAppCallsDynamicApi != null) {
                        InAppCallsFeatureWrapper$NotReadyException inAppCallsFeatureWrapper$NotReadyException = new InAppCallsFeatureWrapper$NotReadyException("await init before call function");
                        jst.e.s(inAppCallsFeatureWrapper$NotReadyException);
                        return new Result.Failure(inAppCallsFeatureWrapper$NotReadyException);
                    }
                    cVar.h();
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    InAppCallsFeatureWrapper$resumeCall$2$1 inAppCallsFeatureWrapper$resumeCall$2$1 = new InAppCallsFeatureWrapper$resumeCall$2$1(inAppCallsDynamicApi, context2, null);
                    inAppCallsFeatureWrapper$resumeCall$1.L$0 = null;
                    inAppCallsFeatureWrapper$resumeCall$1.L$1 = null;
                    inAppCallsFeatureWrapper$resumeCall$1.L$2 = null;
                    inAppCallsFeatureWrapper$resumeCall$1.L$3 = null;
                    inAppCallsFeatureWrapper$resumeCall$1.L$4 = null;
                    inAppCallsFeatureWrapper$resumeCall$1.label = 3;
                    obj = tje.k0(g6uVar, inAppCallsFeatureWrapper$resumeCall$2$1, inAppCallsFeatureWrapper$resumeCall$1);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new Result.Failure(new InAppCallsFeatureWrapper$NotReadyException("in-app calls are disabled by experiment"));
                }
                if (cVar.j == null) {
                    inAppCallsFeatureWrapper$resumeCall$1.L$0 = context2;
                    inAppCallsFeatureWrapper$resumeCall$1.L$1 = cVar;
                    inAppCallsFeatureWrapper$resumeCall$1.label = 2;
                }
                inAppCallsDynamicApi = cVar.j;
                if (inAppCallsDynamicApi != null) {
                }
            }
        }
        inAppCallsFeatureWrapper$resumeCall$1 = new InAppCallsFeatureWrapper$resumeCall$1(this, continuationImpl);
        obj = inAppCallsFeatureWrapper$resumeCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsFeatureWrapper$resumeCall$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r8.f(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(qjv qjvVar, ContinuationImpl continuationImpl) {
        InAppCallsFeatureWrapper$startOutgoingCall$1 inAppCallsFeatureWrapper$startOutgoingCall$1;
        Object obj;
        int i;
        qjv qjvVar2;
        c cVar;
        InAppCallsDynamicApi inAppCallsDynamicApi;
        if (continuationImpl instanceof InAppCallsFeatureWrapper$startOutgoingCall$1) {
            inAppCallsFeatureWrapper$startOutgoingCall$1 = (InAppCallsFeatureWrapper$startOutgoingCall$1) continuationImpl;
            int i2 = inAppCallsFeatureWrapper$startOutgoingCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsFeatureWrapper$startOutgoingCall$1.label = i2 - Integer.MIN_VALUE;
                obj = inAppCallsFeatureWrapper$startOutgoingCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsFeatureWrapper$startOutgoingCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = this.i;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.L$0 = qjvVar;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.L$1 = this;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.label = 1;
                    obj = jVar.a(inAppCallsFeatureWrapper$startOutgoingCall$1);
                    if (obj != coroutineSingletons) {
                        qjvVar2 = qjvVar;
                        cVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    cVar = (c) inAppCallsFeatureWrapper$startOutgoingCall$1.L$1;
                    qjvVar2 = (qjv) inAppCallsFeatureWrapper$startOutgoingCall$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    cVar = (c) inAppCallsFeatureWrapper$startOutgoingCall$1.L$1;
                    qjvVar2 = (qjv) inAppCallsFeatureWrapper$startOutgoingCall$1.L$0;
                    kotlin.b.b(obj);
                    inAppCallsDynamicApi = cVar.j;
                    if (inAppCallsDynamicApi != null) {
                        InAppCallsFeatureWrapper$NotReadyException inAppCallsFeatureWrapper$NotReadyException = new InAppCallsFeatureWrapper$NotReadyException("await init before call function");
                        jst.e.s(inAppCallsFeatureWrapper$NotReadyException);
                        return new Result.Failure(inAppCallsFeatureWrapper$NotReadyException);
                    }
                    cVar.h();
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    InAppCallsFeatureWrapper$startOutgoingCall$2$1 inAppCallsFeatureWrapper$startOutgoingCall$2$1 = new InAppCallsFeatureWrapper$startOutgoingCall$2$1(inAppCallsDynamicApi, qjvVar2, null);
                    inAppCallsFeatureWrapper$startOutgoingCall$1.L$0 = null;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.L$1 = null;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.L$2 = null;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.L$3 = null;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.L$4 = null;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.label = 3;
                    obj = tje.k0(g6uVar, inAppCallsFeatureWrapper$startOutgoingCall$2$1, inAppCallsFeatureWrapper$startOutgoingCall$1);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new Result.Failure(new InAppCallsFeatureWrapper$NotReadyException("in-app calls are disabled by experiment"));
                }
                if (cVar.j == null) {
                    inAppCallsFeatureWrapper$startOutgoingCall$1.L$0 = qjvVar2;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.L$1 = cVar;
                    inAppCallsFeatureWrapper$startOutgoingCall$1.label = 2;
                }
                inAppCallsDynamicApi = cVar.j;
                if (inAppCallsDynamicApi != null) {
                }
            }
        }
        inAppCallsFeatureWrapper$startOutgoingCall$1 = new InAppCallsFeatureWrapper$startOutgoingCall$1(this, continuationImpl);
        obj = inAppCallsFeatureWrapper$startOutgoingCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsFeatureWrapper$startOutgoingCall$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
