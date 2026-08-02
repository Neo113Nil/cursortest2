package com.yandex.go.navigator.repository;

import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.bvf0;
import defpackage.ehs0;
import defpackage.el00;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hhs0;
import defpackage.ihs0;
import defpackage.j4u;
import defpackage.mf50;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;

/* loaded from: classes12.dex */
public final class f {
    public final mf50 a;
    public final el00 b;
    public final ru.yandex.taxi.map_common.map.a c;
    public final tt2 d;
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final r0 f;
    public final e g;
    public ihs0 h;

    public f(mf50 mf50Var, el00 el00Var, ru.yandex.taxi.map_common.map.a aVar, tt2 tt2Var) {
        this.a = mf50Var;
        this.b = el00Var;
        this.c = aVar;
        this.d = tt2Var;
        r0 c = bvf0.c(null);
        this.f = c;
        this.g = new e(c, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x006f, code lost:
    
        if (r11.a(r1) == r2) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e A[Catch: all -> 0x00b2, TRY_ENTER, TryCatch #0 {all -> 0x00b2, blocks: (B:23:0x0096, B:25:0x009a, B:20:0x008b, B:11:0x0072, B:16:0x007e), top: B:10:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:23:0x0096, B:25:0x009a, B:20:0x008b, B:11:0x0072, B:16:0x007e), top: B:10:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.go.navigator.repository.f] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13, types: [g050] */
    /* JADX WARN: Type inference failed for: r3v15, types: [g050] */
    /* JADX WARN: Type inference failed for: r3v18, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ContinuationImpl continuationImpl) {
        NavigationInstanceRepository$getOrCreateInstance$1 navigationInstanceRepository$getOrCreateInstance$1;
        ?? r3;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        Navigation navigation;
        Object obj;
        Navigation navigation2;
        r0 r0Var = fVar.f;
        try {
            if (continuationImpl instanceof NavigationInstanceRepository$getOrCreateInstance$1) {
                navigationInstanceRepository$getOrCreateInstance$1 = (NavigationInstanceRepository$getOrCreateInstance$1) continuationImpl;
                int i = navigationInstanceRepository$getOrCreateInstance$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    navigationInstanceRepository$getOrCreateInstance$1.label = i - Integer.MIN_VALUE;
                    Object obj2 = navigationInstanceRepository$getOrCreateInstance$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r3 = navigationInstanceRepository$getOrCreateInstance$1.label;
                    if (r3 != 0) {
                        kotlin.b.b(obj2);
                        aVar = fVar.e;
                        navigationInstanceRepository$getOrCreateInstance$1.L$0 = aVar;
                        navigationInstanceRepository$getOrCreateInstance$1.label = 1;
                    } else if (r3 != 1) {
                        try {
                            if (r3 != 2) {
                                if (r3 != 3) {
                                    if (r3 != 4) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    g050Var = (g050) navigationInstanceRepository$getOrCreateInstance$1.L$0;
                                    try {
                                        kotlin.b.b(obj2);
                                        navigation = (Navigation) obj2;
                                        r0Var.l(navigation);
                                        g050Var.d(null);
                                        return navigation;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        g050Var.d(null);
                                        throw th;
                                    }
                                }
                                ?? r32 = (g050) navigationInstanceRepository$getOrCreateInstance$1.L$0;
                                kotlin.b.b(obj2);
                                obj = obj2;
                                aVar = r32;
                                navigation = (Navigation) obj;
                                if (navigation != null) {
                                    g050Var = aVar;
                                    r0Var.l(navigation);
                                    g050Var.d(null);
                                    return navigation;
                                }
                                navigationInstanceRepository$getOrCreateInstance$1.L$0 = aVar;
                                navigationInstanceRepository$getOrCreateInstance$1.label = 4;
                                Object a = fVar.c.a(navigationInstanceRepository$getOrCreateInstance$1);
                                if (a != coroutineSingletons) {
                                    kotlinx.coroutines.sync.a aVar2 = aVar;
                                    obj2 = a;
                                    g050Var = aVar2;
                                    navigation = (Navigation) obj2;
                                    r0Var.l(navigation);
                                    g050Var.d(null);
                                    return navigation;
                                }
                                return coroutineSingletons;
                            }
                            ?? r33 = (g050) navigationInstanceRepository$getOrCreateInstance$1.L$0;
                            kotlin.b.b(obj2);
                            aVar = r33;
                            navigationInstanceRepository$getOrCreateInstance$1.L$0 = aVar;
                            navigationInstanceRepository$getOrCreateInstance$1.label = 3;
                            obj = fVar.c(navigationInstanceRepository$getOrCreateInstance$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            navigation = (Navigation) obj;
                            if (navigation != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            g050Var = r3;
                            g050Var.d(null);
                            throw th;
                        }
                    } else {
                        ?? r34 = (g050) navigationInstanceRepository$getOrCreateInstance$1.L$0;
                        kotlin.b.b(obj2);
                        aVar = r34;
                    }
                    navigation2 = (Navigation) r0Var.getValue();
                    if (navigation2 == null) {
                        aVar.d(null);
                        return navigation2;
                    }
                    el00 el00Var = fVar.b;
                    navigationInstanceRepository$getOrCreateInstance$1.L$0 = aVar;
                    navigationInstanceRepository$getOrCreateInstance$1.label = 2;
                    if (el00Var.a(navigationInstanceRepository$getOrCreateInstance$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    navigationInstanceRepository$getOrCreateInstance$1.L$0 = aVar;
                    navigationInstanceRepository$getOrCreateInstance$1.label = 3;
                    obj = fVar.c(navigationInstanceRepository$getOrCreateInstance$1);
                    if (obj == coroutineSingletons) {
                    }
                    navigation = (Navigation) obj;
                    if (navigation != null) {
                    }
                }
            }
            navigation2 = (Navigation) r0Var.getValue();
            if (navigation2 == null) {
            }
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th4;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
        navigationInstanceRepository$getOrCreateInstance$1 = new NavigationInstanceRepository$getOrCreateInstance$1(fVar, continuationImpl);
        Object obj22 = navigationInstanceRepository$getOrCreateInstance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r3 = navigationInstanceRepository$getOrCreateInstance$1.label;
        if (r3 != 0) {
        }
    }

    public final Navigation b() {
        return (Navigation) this.f.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0078, code lost:
    
        if (r2 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        NavigationInstanceRepository$restoreNavigation$1 navigationInstanceRepository$restoreNavigation$1;
        int i;
        ihs0 ihs0Var;
        String l;
        Object k0;
        byte[] bArr;
        ihs0 ihs0Var2;
        Navigation navigation;
        Guidance guidance;
        if (continuationImpl instanceof NavigationInstanceRepository$restoreNavigation$1) {
            navigationInstanceRepository$restoreNavigation$1 = (NavigationInstanceRepository$restoreNavigation$1) continuationImpl;
            int i2 = navigationInstanceRepository$restoreNavigation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationInstanceRepository$restoreNavigation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigationInstanceRepository$restoreNavigation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationInstanceRepository$restoreNavigation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ihs0Var = this.h;
                    if (ihs0Var != null && (l = this.a.b.a().l("navigation", null)) != null) {
                        this.d.getClass();
                        sjh sjhVar = uyj.a;
                        NavigationInstanceRepository$restoreNavigation$serializedNavigation$1$1 navigationInstanceRepository$restoreNavigation$serializedNavigation$1$1 = new NavigationInstanceRepository$restoreNavigation$serializedNavigation$1$1(l, null);
                        navigationInstanceRepository$restoreNavigation$1.L$0 = ihs0Var;
                        navigationInstanceRepository$restoreNavigation$1.L$1 = null;
                        navigationInstanceRepository$restoreNavigation$1.label = 1;
                        k0 = tje.k0(sjhVar, navigationInstanceRepository$restoreNavigation$serializedNavigation$1$1, navigationInstanceRepository$restoreNavigation$1);
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ihs0Var2 = (ihs0) navigationInstanceRepository$restoreNavigation$1.L$0;
                    kotlin.b.b(obj);
                    navigation = (Navigation) obj;
                    if (((navigation != null || (guidance = navigation.getGuidance()) == null) ? null : guidance.getCurrentRoute()) == null) {
                        ehs0 ehs0Var = ihs0Var2.b;
                        GuidanceOwnerId guidanceOwnerId = GuidanceOwnerId.AUTO_NAVIGATION;
                        j4u j4uVar = ehs0Var.a;
                        if (guidanceOwnerId == (j4uVar != null ? j4uVar.getId() : null)) {
                            ehs0Var.a = null;
                            return navigation;
                        }
                    }
                    return navigation;
                }
                ihs0 ihs0Var3 = (ihs0) navigationInstanceRepository$restoreNavigation$1.L$0;
                kotlin.b.b(obj);
                k0 = obj;
                ihs0Var = ihs0Var3;
                bArr = (byte[]) k0;
                if (bArr != null) {
                    ihs0Var.b.a(new hhs0(ihs0Var));
                    navigationInstanceRepository$restoreNavigation$1.L$0 = ihs0Var;
                    navigationInstanceRepository$restoreNavigation$1.L$1 = null;
                    navigationInstanceRepository$restoreNavigation$1.label = 2;
                    Object d = this.c.d(bArr, navigationInstanceRepository$restoreNavigation$1);
                    if (d != coroutineSingletons) {
                        ihs0 ihs0Var4 = ihs0Var;
                        obj = d;
                        ihs0Var2 = ihs0Var4;
                        navigation = (Navigation) obj;
                        if (((navigation != null || (guidance = navigation.getGuidance()) == null) ? null : guidance.getCurrentRoute()) == null) {
                        }
                        return navigation;
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        navigationInstanceRepository$restoreNavigation$1 = new NavigationInstanceRepository$restoreNavigation$1(this, continuationImpl);
        Object obj2 = navigationInstanceRepository$restoreNavigation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationInstanceRepository$restoreNavigation$1.label;
        if (i != 0) {
        }
        bArr = (byte[]) k0;
        if (bArr != null) {
        }
        return null;
    }
}
