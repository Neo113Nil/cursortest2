package com.yandex.go.walking.navigation.impl.navigation_core;

import com.yandex.mapkit.navigation.transport.Guidance;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.Type;
import defpackage.el00;
import defpackage.g311;
import defpackage.ny61;
import defpackage.s541;
import defpackage.y141;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.s;

/* loaded from: classes8.dex */
public final class a {
    public final el00 a;
    public final g311 b;
    public final com.yandex.go.walking.navigation.impl.navigation_core.guidance.c c;
    public final s541 d;
    public final y141 e;

    public a(el00 el00Var, g311 g311Var, com.yandex.go.walking.navigation.impl.navigation_core.guidance.c cVar, s541 s541Var, y141 y141Var) {
        this.a = el00Var;
        this.b = g311Var;
        this.c = cVar;
        this.d = s541Var;
        this.e = y141Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        WalkNavigationFactory$createNavigation$1 walkNavigationFactory$createNavigation$1;
        int i;
        if (continuationImpl instanceof WalkNavigationFactory$createNavigation$1) {
            walkNavigationFactory$createNavigation$1 = (WalkNavigationFactory$createNavigation$1) continuationImpl;
            int i2 = walkNavigationFactory$createNavigation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavigationFactory$createNavigation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavigationFactory$createNavigation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavigationFactory$createNavigation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s sVar = new s((el00) this.b.a.a.get(), Type.PEDESTRIAN);
                    walkNavigationFactory$createNavigation$1.label = 1;
                    obj = sVar.a(walkNavigationFactory$createNavigation$1);
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
                Navigation navigation = (Navigation) obj;
                navigation.addListener(this.d);
                Guidance guidance = navigation.getGuidance();
                guidance.enableAutoRerouting();
                guidance.addListener(this.e);
                return navigation;
            }
        }
        walkNavigationFactory$createNavigation$1 = new WalkNavigationFactory$createNavigation$1(this, continuationImpl);
        Object obj2 = walkNavigationFactory$createNavigation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavigationFactory$createNavigation$1.label;
        if (i != 0) {
        }
        Navigation navigation2 = (Navigation) obj2;
        navigation2.addListener(this.d);
        Guidance guidance2 = navigation2.getGuidance();
        guidance2.enableAutoRerouting();
        guidance2.addListener(this.e);
        return navigation2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r5.a.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        WalkNavigationFactory$restoreNavigation$1 walkNavigationFactory$restoreNavigation$1;
        int i;
        if (continuationImpl instanceof WalkNavigationFactory$restoreNavigation$1) {
            walkNavigationFactory$restoreNavigation$1 = (WalkNavigationFactory$restoreNavigation$1) continuationImpl;
            int i2 = walkNavigationFactory$restoreNavigation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavigationFactory$restoreNavigation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavigationFactory$restoreNavigation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavigationFactory$restoreNavigation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    walkNavigationFactory$restoreNavigation$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Navigation navigation = (Navigation) obj;
                        if (navigation != null) {
                            navigation.addListener(this.d);
                            Guidance guidance = navigation.getGuidance();
                            guidance.enableAutoRerouting();
                            guidance.addListener(this.e);
                        }
                        return navigation;
                    }
                    kotlin.b.b(obj);
                }
                walkNavigationFactory$restoreNavigation$1.label = 2;
                obj = this.c.c(walkNavigationFactory$restoreNavigation$1);
            }
        }
        walkNavigationFactory$restoreNavigation$1 = new WalkNavigationFactory$restoreNavigation$1(this, continuationImpl);
        Object obj2 = walkNavigationFactory$restoreNavigation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavigationFactory$restoreNavigation$1.label;
        if (i != 0) {
        }
        walkNavigationFactory$restoreNavigation$1.label = 2;
        obj2 = this.c.c(walkNavigationFactory$restoreNavigation$1);
    }
}
