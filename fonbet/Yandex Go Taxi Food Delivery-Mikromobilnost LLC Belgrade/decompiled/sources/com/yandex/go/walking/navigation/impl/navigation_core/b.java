package com.yandex.go.walking.navigation.impl.navigation_core;

import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final a a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public Navigation c;

    public b(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
    
        if (r8.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #0 {all -> 0x006e, blocks: (B:26:0x0050, B:28:0x0054), top: B:25:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v8, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        WalkNavigationInstanceHolder$getOrCreate$1 walkNavigationInstanceHolder$getOrCreate$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ?? r0;
        Navigation navigation;
        try {
            if (continuationImpl instanceof WalkNavigationInstanceHolder$getOrCreate$1) {
                walkNavigationInstanceHolder$getOrCreate$1 = (WalkNavigationInstanceHolder$getOrCreate$1) continuationImpl;
                int i2 = walkNavigationInstanceHolder$getOrCreate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    walkNavigationInstanceHolder$getOrCreate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = walkNavigationInstanceHolder$getOrCreate$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = walkNavigationInstanceHolder$getOrCreate$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.b;
                        walkNavigationInstanceHolder$getOrCreate$1.L$0 = aVar;
                        walkNavigationInstanceHolder$getOrCreate$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r0 = (g050) walkNavigationInstanceHolder$getOrCreate$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                r0 = r0;
                                this.c = (Navigation) obj;
                                navigation = (Navigation) obj;
                                aVar = r0;
                                aVar.d(null);
                                return navigation;
                            } catch (Throwable th) {
                                th = th;
                                r0.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) walkNavigationInstanceHolder$getOrCreate$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    navigation = this.c;
                    if (navigation == null) {
                        a aVar2 = this.a;
                        walkNavigationInstanceHolder$getOrCreate$1.L$0 = aVar;
                        walkNavigationInstanceHolder$getOrCreate$1.label = 2;
                        Object a = aVar2.a(walkNavigationInstanceHolder$getOrCreate$1);
                        if (a != coroutineSingletons) {
                            r0 = aVar;
                            obj = a;
                            this.c = (Navigation) obj;
                            navigation = (Navigation) obj;
                            aVar = r0;
                        }
                        return coroutineSingletons;
                    }
                    aVar.d(null);
                    return navigation;
                }
            }
            navigation = this.c;
            if (navigation == null) {
            }
            aVar.d(null);
            return navigation;
        } catch (Throwable th2) {
            th = th2;
            r0 = aVar;
            r0.d(null);
            throw th;
        }
        walkNavigationInstanceHolder$getOrCreate$1 = new WalkNavigationInstanceHolder$getOrCreate$1(this, continuationImpl);
        Object obj2 = walkNavigationInstanceHolder$getOrCreate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavigationInstanceHolder$getOrCreate$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004d, code lost:
    
        if (r8.a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0068, B:15:0x006c), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058 A[Catch: all -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:28:0x0050, B:32:0x0058), top: B:27:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        WalkNavigationInstanceHolder$restoreNavigation$1 walkNavigationInstanceHolder$restoreNavigation$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        Navigation navigation;
        try {
            if (continuationImpl instanceof WalkNavigationInstanceHolder$restoreNavigation$1) {
                walkNavigationInstanceHolder$restoreNavigation$1 = (WalkNavigationInstanceHolder$restoreNavigation$1) continuationImpl;
                int i2 = walkNavigationInstanceHolder$restoreNavigation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    walkNavigationInstanceHolder$restoreNavigation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = walkNavigationInstanceHolder$restoreNavigation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = walkNavigationInstanceHolder$restoreNavigation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.b;
                        walkNavigationInstanceHolder$restoreNavigation$1.L$0 = aVar;
                        walkNavigationInstanceHolder$restoreNavigation$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) walkNavigationInstanceHolder$restoreNavigation$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                navigation = (Navigation) obj;
                                if (navigation == null) {
                                    this.c = navigation;
                                } else {
                                    navigation = null;
                                }
                                g050Var.d(null);
                                return navigation;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) walkNavigationInstanceHolder$restoreNavigation$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    if (this.c == null) {
                        aVar.d(null);
                        return null;
                    }
                    a aVar2 = this.a;
                    walkNavigationInstanceHolder$restoreNavigation$1.L$0 = aVar;
                    walkNavigationInstanceHolder$restoreNavigation$1.label = 2;
                    Object b = aVar2.b(walkNavigationInstanceHolder$restoreNavigation$1);
                    if (b != coroutineSingletons) {
                        g050Var = aVar;
                        obj = b;
                        navigation = (Navigation) obj;
                        if (navigation == null) {
                        }
                        g050Var.d(null);
                        return navigation;
                    }
                    return coroutineSingletons;
                }
            }
            if (this.c == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        walkNavigationInstanceHolder$restoreNavigation$1 = new WalkNavigationInstanceHolder$restoreNavigation$1(this, continuationImpl);
        Object obj2 = walkNavigationInstanceHolder$restoreNavigation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavigationInstanceHolder$restoreNavigation$1.label;
        if (i != 0) {
        }
    }
}
