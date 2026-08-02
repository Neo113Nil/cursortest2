package com.yandex.go.walking.navigation.impl.navigation_core.guidance;

import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.Type;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.e41;
import defpackage.el00;
import defpackage.g050;
import defpackage.g311;
import defpackage.gtq0;
import defpackage.iid0;
import defpackage.kgx;
import defpackage.n541;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.yandex.taxi.map_common.map.s;

/* loaded from: classes8.dex */
public final class c {
    public static final /* synthetic */ kgx[] g = {new MutablePropertyReference1Impl("storedNavigationSnapshot", 0, "getStoredNavigationSnapshot()Ljava/lang/String;", c.class)};
    public final tt2 a;
    public final e41 b;
    public final cne0 c;
    public final s d;
    public final iid0 e;
    public final kotlinx.coroutines.sync.a f;

    public c(dne0 dne0Var, tt2 tt2Var, e41 e41Var, g311 g311Var) {
        this.a = tt2Var;
        this.b = e41Var;
        cne0 a = dne0Var.a("walk_nav_guidance_session_storage");
        this.c = a;
        this.d = new s((el00) g311Var.a.a.get(), Type.PEDESTRIAN);
        this.e = new iid0(a, "navigation_snapshot");
        this.f = gtq0.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.go.walking.navigation.impl.navigation_core.guidance.c] */
    /* JADX WARN: Type inference failed for: r8v10, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v10, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v8, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Navigation navigation, n541 n541Var, ContinuationImpl continuationImpl) {
        WalkNavGuidanceSessionStorage$backupSession$1 walkNavGuidanceSessionStorage$backupSession$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Throwable th;
        ?? r8;
        Navigation navigation2;
        Navigation navigation3;
        try {
            if (continuationImpl instanceof WalkNavGuidanceSessionStorage$backupSession$1) {
                walkNavGuidanceSessionStorage$backupSession$1 = (WalkNavGuidanceSessionStorage$backupSession$1) continuationImpl;
                int i2 = walkNavGuidanceSessionStorage$backupSession$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    walkNavGuidanceSessionStorage$backupSession$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = walkNavGuidanceSessionStorage$backupSession$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = walkNavGuidanceSessionStorage$backupSession$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        walkNavGuidanceSessionStorage$backupSession$1.L$0 = navigation;
                        walkNavGuidanceSessionStorage$backupSession$1.L$1 = n541Var;
                        ?? r11 = this.f;
                        walkNavGuidanceSessionStorage$backupSession$1.L$2 = r11;
                        walkNavGuidanceSessionStorage$backupSession$1.label = 1;
                        if (r11.a(walkNavGuidanceSessionStorage$backupSession$1) != coroutineSingletons) {
                            navigation2 = navigation;
                            navigation3 = r11;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r8 = (g050) walkNavGuidanceSessionStorage$backupSession$1.L$2;
                            try {
                                kotlin.b.b(obj);
                                r8.d(null);
                                return zy11.a;
                            } catch (Throwable th2) {
                                th = th2;
                                r8.d(null);
                                throw th;
                            }
                        }
                        ?? r9 = (g050) walkNavGuidanceSessionStorage$backupSession$1.L$2;
                        n541Var = (n541) walkNavGuidanceSessionStorage$backupSession$1.L$1;
                        kotlin.b.b(obj);
                        navigation = r9;
                        walkNavGuidanceSessionStorage$backupSession$1.L$0 = null;
                        walkNavGuidanceSessionStorage$backupSession$1.L$1 = null;
                        walkNavGuidanceSessionStorage$backupSession$1.L$2 = navigation;
                        walkNavGuidanceSessionStorage$backupSession$1.label = 3;
                        if (g(n541Var, walkNavGuidanceSessionStorage$backupSession$1) != coroutineSingletons) {
                            r8 = navigation;
                            r8.d(null);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    }
                    ?? r92 = (g050) walkNavGuidanceSessionStorage$backupSession$1.L$2;
                    n541Var = (n541) walkNavGuidanceSessionStorage$backupSession$1.L$1;
                    navigation2 = (Navigation) walkNavGuidanceSessionStorage$backupSession$1.L$0;
                    kotlin.b.b(obj);
                    navigation3 = r92;
                    walkNavGuidanceSessionStorage$backupSession$1.L$0 = null;
                    walkNavGuidanceSessionStorage$backupSession$1.L$1 = n541Var;
                    walkNavGuidanceSessionStorage$backupSession$1.L$2 = navigation3;
                    walkNavGuidanceSessionStorage$backupSession$1.label = 2;
                    navigation = navigation3;
                    if (f(navigation2, walkNavGuidanceSessionStorage$backupSession$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    walkNavGuidanceSessionStorage$backupSession$1.L$0 = null;
                    walkNavGuidanceSessionStorage$backupSession$1.L$1 = null;
                    walkNavGuidanceSessionStorage$backupSession$1.L$2 = navigation;
                    walkNavGuidanceSessionStorage$backupSession$1.label = 3;
                    if (g(n541Var, walkNavGuidanceSessionStorage$backupSession$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            walkNavGuidanceSessionStorage$backupSession$1.L$0 = null;
            walkNavGuidanceSessionStorage$backupSession$1.L$1 = n541Var;
            walkNavGuidanceSessionStorage$backupSession$1.L$2 = navigation3;
            walkNavGuidanceSessionStorage$backupSession$1.label = 2;
            navigation = navigation3;
            if (f(navigation2, walkNavGuidanceSessionStorage$backupSession$1) == coroutineSingletons) {
            }
            walkNavGuidanceSessionStorage$backupSession$1.L$0 = null;
            walkNavGuidanceSessionStorage$backupSession$1.L$1 = null;
            walkNavGuidanceSessionStorage$backupSession$1.L$2 = navigation;
            walkNavGuidanceSessionStorage$backupSession$1.label = 3;
            if (g(n541Var, walkNavGuidanceSessionStorage$backupSession$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            Navigation navigation4 = navigation;
            th = th3;
            r8 = navigation4;
        }
        walkNavGuidanceSessionStorage$backupSession$1 = new WalkNavGuidanceSessionStorage$backupSession$1(this, continuationImpl);
        Object obj2 = walkNavGuidanceSessionStorage$backupSession$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceSessionStorage$backupSession$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        WalkNavGuidanceSessionStorage$clear$1 walkNavGuidanceSessionStorage$clear$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof WalkNavGuidanceSessionStorage$clear$1) {
                walkNavGuidanceSessionStorage$clear$1 = (WalkNavGuidanceSessionStorage$clear$1) continuationImpl;
                int i2 = walkNavGuidanceSessionStorage$clear$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    walkNavGuidanceSessionStorage$clear$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = walkNavGuidanceSessionStorage$clear$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = walkNavGuidanceSessionStorage$clear$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.f;
                        walkNavGuidanceSessionStorage$clear$1.L$0 = aVar;
                        walkNavGuidanceSessionStorage$clear$1.label = 1;
                        if (aVar.a(walkNavGuidanceSessionStorage$clear$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) walkNavGuidanceSessionStorage$clear$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.c.a();
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            this.c.a();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        walkNavGuidanceSessionStorage$clear$1 = new WalkNavGuidanceSessionStorage$clear$1(this, continuationImpl);
        Object obj2 = walkNavGuidanceSessionStorage$clear$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceSessionStorage$clear$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|(1:(3:(1:(5:11|12|13|14|15)(2:21|22))(7:23|24|25|26|27|(3:30|14|15)|29)|19|20)(1:37))(1:46)|38|39|(2:41|42)(5:43|(2:45|29)|27|(0)|29)))|48|6|(0)(0)|38|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        r8 = r10;
        r10 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        if (r10.a(r0) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #1 {all -> 0x00b5, blocks: (B:27:0x009b, B:39:0x006f, B:43:0x0082), top: B:38:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v13, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v9, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        WalkNavGuidanceSessionStorage$getStoredNavigation$1 walkNavGuidanceSessionStorage$getStoredNavigation$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        String str;
        Object k0;
        Throwable th;
        g050 g050Var;
        Object d;
        if (continuationImpl instanceof WalkNavGuidanceSessionStorage$getStoredNavigation$1) {
            walkNavGuidanceSessionStorage$getStoredNavigation$1 = (WalkNavGuidanceSessionStorage$getStoredNavigation$1) continuationImpl;
            int i2 = walkNavGuidanceSessionStorage$getStoredNavigation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceSessionStorage$getStoredNavigation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavGuidanceSessionStorage$getStoredNavigation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceSessionStorage$getStoredNavigation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar = this.f;
                    walkNavGuidanceSessionStorage$getStoredNavigation$1.L$0 = aVar;
                    walkNavGuidanceSessionStorage$getStoredNavigation$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ?? r2 = (g050) walkNavGuidanceSessionStorage$getStoredNavigation$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                k0 = obj;
                                aVar = r2;
                                s sVar = this.d;
                                walkNavGuidanceSessionStorage$getStoredNavigation$1.L$0 = aVar;
                                walkNavGuidanceSessionStorage$getStoredNavigation$1.L$1 = null;
                                walkNavGuidanceSessionStorage$getStoredNavigation$1.L$2 = null;
                                walkNavGuidanceSessionStorage$getStoredNavigation$1.label = 3;
                                d = sVar.d((byte[]) k0, walkNavGuidanceSessionStorage$getStoredNavigation$1);
                                if (d != coroutineSingletons) {
                                    kotlinx.coroutines.sync.a aVar2 = aVar;
                                    obj = d;
                                    g050Var = aVar2;
                                    g050Var.d(null);
                                    return obj;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var = r2;
                            }
                        } else {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) walkNavGuidanceSessionStorage$getStoredNavigation$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                g050Var.d(null);
                                return obj;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        g050Var.d(null);
                        throw th;
                    }
                    ?? r22 = (g050) walkNavGuidanceSessionStorage$getStoredNavigation$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r22;
                }
                str = (String) this.e.getValue(this, g[0]);
                if (str != null) {
                    aVar.d(null);
                    return null;
                }
                this.a.getClass();
                sjh sjhVar = uyj.a;
                WalkNavGuidanceSessionStorage$getStoredNavigation$2$decodedSnapshot$1 walkNavGuidanceSessionStorage$getStoredNavigation$2$decodedSnapshot$1 = new WalkNavGuidanceSessionStorage$getStoredNavigation$2$decodedSnapshot$1(str, null);
                walkNavGuidanceSessionStorage$getStoredNavigation$1.L$0 = aVar;
                walkNavGuidanceSessionStorage$getStoredNavigation$1.L$1 = null;
                walkNavGuidanceSessionStorage$getStoredNavigation$1.label = 2;
                k0 = tje.k0(sjhVar, walkNavGuidanceSessionStorage$getStoredNavigation$2$decodedSnapshot$1, walkNavGuidanceSessionStorage$getStoredNavigation$1);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                s sVar2 = this.d;
                walkNavGuidanceSessionStorage$getStoredNavigation$1.L$0 = aVar;
                walkNavGuidanceSessionStorage$getStoredNavigation$1.L$1 = null;
                walkNavGuidanceSessionStorage$getStoredNavigation$1.L$2 = null;
                walkNavGuidanceSessionStorage$getStoredNavigation$1.label = 3;
                d = sVar2.d((byte[]) k0, walkNavGuidanceSessionStorage$getStoredNavigation$1);
                if (d != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        walkNavGuidanceSessionStorage$getStoredNavigation$1 = new WalkNavGuidanceSessionStorage$getStoredNavigation$1(this, continuationImpl);
        Object obj2 = walkNavGuidanceSessionStorage$getStoredNavigation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceSessionStorage$getStoredNavigation$1.label;
        if (i != 0) {
        }
        str = (String) this.e.getValue(this, g[0]);
        if (str != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        if (r9.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:25:0x0058, B:27:0x0062), top: B:24:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        WalkNavGuidanceSessionStorage$getStoredRouteAddresses$1 walkNavGuidanceSessionStorage$getStoredRouteAddresses$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        String l;
        n541 n541Var;
        try {
            if (continuationImpl instanceof WalkNavGuidanceSessionStorage$getStoredRouteAddresses$1) {
                walkNavGuidanceSessionStorage$getStoredRouteAddresses$1 = (WalkNavGuidanceSessionStorage$getStoredRouteAddresses$1) continuationImpl;
                int i2 = walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.f;
                        walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.L$0 = aVar;
                        walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                n541Var = (n541) obj;
                                g050Var.d(null);
                                return n541Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    l = this.c.l("guidance_route_addresses", null);
                    if (l != null) {
                        g050Var = aVar;
                        n541Var = null;
                        g050Var.d(null);
                        return n541Var;
                    }
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    WalkNavGuidanceSessionStorage$getStoredRouteAddresses$2$1$1 walkNavGuidanceSessionStorage$getStoredRouteAddresses$2$1$1 = new WalkNavGuidanceSessionStorage$getStoredRouteAddresses$2$1$1(this, l, null);
                    walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.L$0 = aVar;
                    walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.L$1 = null;
                    walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.L$2 = null;
                    walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.label = 2;
                    Object k0 = tje.k0(sjhVar, walkNavGuidanceSessionStorage$getStoredRouteAddresses$2$1$1, walkNavGuidanceSessionStorage$getStoredRouteAddresses$1);
                    if (k0 != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = k0;
                        g050Var = aVar2;
                        n541Var = (n541) obj;
                        g050Var.d(null);
                        return n541Var;
                    }
                    return coroutineSingletons;
                }
            }
            l = this.c.l("guidance_route_addresses", null);
            if (l != null) {
            }
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
        walkNavGuidanceSessionStorage$getStoredRouteAddresses$1 = new WalkNavGuidanceSessionStorage$getStoredRouteAddresses$1(this, continuationImpl);
        Object obj2 = walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceSessionStorage$getStoredRouteAddresses$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        WalkNavGuidanceSessionStorage$hasStoredSession$1 walkNavGuidanceSessionStorage$hasStoredSession$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof WalkNavGuidanceSessionStorage$hasStoredSession$1) {
                walkNavGuidanceSessionStorage$hasStoredSession$1 = (WalkNavGuidanceSessionStorage$hasStoredSession$1) continuationImpl;
                int i2 = walkNavGuidanceSessionStorage$hasStoredSession$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    walkNavGuidanceSessionStorage$hasStoredSession$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = walkNavGuidanceSessionStorage$hasStoredSession$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = walkNavGuidanceSessionStorage$hasStoredSession$1.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.f;
                        walkNavGuidanceSessionStorage$hasStoredSession$1.L$0 = aVar;
                        walkNavGuidanceSessionStorage$hasStoredSession$1.label = 1;
                        if (aVar.a(walkNavGuidanceSessionStorage$hasStoredSession$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) walkNavGuidanceSessionStorage$hasStoredSession$1.L$0;
                        kotlin.b.b(obj);
                    }
                    if (((String) this.e.getValue(this, g[0])) != null) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
            if (((String) this.e.getValue(this, g[0])) != null) {
            }
            return Boolean.valueOf(z);
        } finally {
            g050Var.d(null);
        }
        walkNavGuidanceSessionStorage$hasStoredSession$1 = new WalkNavGuidanceSessionStorage$hasStoredSession$1(this, continuationImpl);
        Object obj2 = walkNavGuidanceSessionStorage$hasStoredSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceSessionStorage$hasStoredSession$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Navigation navigation, ContinuationImpl continuationImpl) {
        WalkNavGuidanceSessionStorage$storeNavigation$1 walkNavGuidanceSessionStorage$storeNavigation$1;
        int i;
        if (continuationImpl instanceof WalkNavGuidanceSessionStorage$storeNavigation$1) {
            walkNavGuidanceSessionStorage$storeNavigation$1 = (WalkNavGuidanceSessionStorage$storeNavigation$1) continuationImpl;
            int i2 = walkNavGuidanceSessionStorage$storeNavigation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceSessionStorage$storeNavigation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavGuidanceSessionStorage$storeNavigation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceSessionStorage$storeNavigation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    walkNavGuidanceSessionStorage$storeNavigation$1.L$0 = null;
                    walkNavGuidanceSessionStorage$storeNavigation$1.label = 1;
                    obj = this.d.e(navigation, walkNavGuidanceSessionStorage$storeNavigation$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (c) walkNavGuidanceSessionStorage$storeNavigation$1.L$2;
                        kotlin.b.b(obj);
                        this.e.setValue(this, g[0], (String) obj);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                this.a.getClass();
                sjh sjhVar = uyj.a;
                WalkNavGuidanceSessionStorage$storeNavigation$2 walkNavGuidanceSessionStorage$storeNavigation$2 = new WalkNavGuidanceSessionStorage$storeNavigation$2((byte[]) obj, null);
                walkNavGuidanceSessionStorage$storeNavigation$1.L$0 = null;
                walkNavGuidanceSessionStorage$storeNavigation$1.L$1 = null;
                walkNavGuidanceSessionStorage$storeNavigation$1.L$2 = this;
                walkNavGuidanceSessionStorage$storeNavigation$1.label = 2;
                obj = tje.k0(sjhVar, walkNavGuidanceSessionStorage$storeNavigation$2, walkNavGuidanceSessionStorage$storeNavigation$1);
            }
        }
        walkNavGuidanceSessionStorage$storeNavigation$1 = new WalkNavGuidanceSessionStorage$storeNavigation$1(this, continuationImpl);
        Object obj3 = walkNavGuidanceSessionStorage$storeNavigation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceSessionStorage$storeNavigation$1.label;
        if (i != 0) {
        }
        this.a.getClass();
        sjh sjhVar2 = uyj.a;
        WalkNavGuidanceSessionStorage$storeNavigation$2 walkNavGuidanceSessionStorage$storeNavigation$22 = new WalkNavGuidanceSessionStorage$storeNavigation$2((byte[]) obj3, null);
        walkNavGuidanceSessionStorage$storeNavigation$1.L$0 = null;
        walkNavGuidanceSessionStorage$storeNavigation$1.L$1 = null;
        walkNavGuidanceSessionStorage$storeNavigation$1.L$2 = this;
        walkNavGuidanceSessionStorage$storeNavigation$1.label = 2;
        obj3 = tje.k0(sjhVar2, walkNavGuidanceSessionStorage$storeNavigation$22, walkNavGuidanceSessionStorage$storeNavigation$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(n541 n541Var, ContinuationImpl continuationImpl) {
        WalkNavGuidanceSessionStorage$storeRouteAddresses$1 walkNavGuidanceSessionStorage$storeRouteAddresses$1;
        int i;
        if (continuationImpl instanceof WalkNavGuidanceSessionStorage$storeRouteAddresses$1) {
            walkNavGuidanceSessionStorage$storeRouteAddresses$1 = (WalkNavGuidanceSessionStorage$storeRouteAddresses$1) continuationImpl;
            int i2 = walkNavGuidanceSessionStorage$storeRouteAddresses$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceSessionStorage$storeRouteAddresses$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavGuidanceSessionStorage$storeRouteAddresses$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceSessionStorage$storeRouteAddresses$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    WalkNavGuidanceSessionStorage$storeRouteAddresses$serializedAddresses$1 walkNavGuidanceSessionStorage$storeRouteAddresses$serializedAddresses$1 = new WalkNavGuidanceSessionStorage$storeRouteAddresses$serializedAddresses$1(this, n541Var, null);
                    walkNavGuidanceSessionStorage$storeRouteAddresses$1.L$0 = null;
                    walkNavGuidanceSessionStorage$storeRouteAddresses$1.label = 1;
                    obj = tje.k0(sjhVar, walkNavGuidanceSessionStorage$storeRouteAddresses$serializedAddresses$1, walkNavGuidanceSessionStorage$storeRouteAddresses$1);
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
                this.c.r("guidance_route_addresses", (String) obj);
                return zy11.a;
            }
        }
        walkNavGuidanceSessionStorage$storeRouteAddresses$1 = new WalkNavGuidanceSessionStorage$storeRouteAddresses$1(this, continuationImpl);
        Object obj2 = walkNavGuidanceSessionStorage$storeRouteAddresses$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceSessionStorage$storeRouteAddresses$1.label;
        if (i != 0) {
        }
        this.c.r("guidance_route_addresses", (String) obj2);
        return zy11.a;
    }
}
