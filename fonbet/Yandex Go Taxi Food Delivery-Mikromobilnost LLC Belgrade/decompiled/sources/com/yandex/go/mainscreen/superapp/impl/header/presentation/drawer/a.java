package com.yandex.go.mainscreen.superapp.impl.header.presentation.drawer;

import android.content.Context;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.SuperAppLogoPositionRepository$LogoPosition;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppMainScreenLogoImageExperiment;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final rqo a;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.a b;
    public final Context c;

    public a(rqo rqoVar, com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.a aVar, Context context) {
        this.a = rqoVar;
        this.b = aVar;
        this.c = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DrawerGravityInteractor$retrieveDrawerGravity$1 drawerGravityInteractor$retrieveDrawerGravity$1;
        int i;
        if (continuationImpl instanceof DrawerGravityInteractor$retrieveDrawerGravity$1) {
            drawerGravityInteractor$retrieveDrawerGravity$1 = (DrawerGravityInteractor$retrieveDrawerGravity$1) continuationImpl;
            int i2 = drawerGravityInteractor$retrieveDrawerGravity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drawerGravityInteractor$retrieveDrawerGravity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = drawerGravityInteractor$retrieveDrawerGravity$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drawerGravityInteractor$retrieveDrawerGravity$1.label;
                if (i != 0) {
                    b.b(obj);
                    t1b0 e = ((jbh) this.a).e(SuperAppMainScreenLogoImageExperiment.k);
                    drawerGravityInteractor$retrieveDrawerGravity$1.label = 1;
                    obj = e.b(drawerGravityInteractor$retrieveDrawerGravity$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    b.b(obj);
                }
                drawerGravityInteractor$retrieveDrawerGravity$1.L$0 = null;
                drawerGravityInteractor$retrieveDrawerGravity$1.label = 2;
                Object b = b((SuperAppMainScreenLogoImageExperiment) obj, drawerGravityInteractor$retrieveDrawerGravity$1);
                return b != obj2 ? obj2 : b;
            }
        }
        drawerGravityInteractor$retrieveDrawerGravity$1 = new DrawerGravityInteractor$retrieveDrawerGravity$1(this, continuationImpl);
        Object obj3 = drawerGravityInteractor$retrieveDrawerGravity$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drawerGravityInteractor$retrieveDrawerGravity$1.label;
        if (i != 0) {
        }
        drawerGravityInteractor$retrieveDrawerGravity$1.L$0 = null;
        drawerGravityInteractor$retrieveDrawerGravity$1.label = 2;
        Object b2 = b((SuperAppMainScreenLogoImageExperiment) obj3, drawerGravityInteractor$retrieveDrawerGravity$1);
        if (b2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (defpackage.xw31.n(r6) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        return new java.lang.Integer(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (defpackage.xw31.n(r6) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(SuperAppMainScreenLogoImageExperiment superAppMainScreenLogoImageExperiment, ContinuationImpl continuationImpl) {
        DrawerGravityInteractor$retrieveGravityFromExperiment$1 drawerGravityInteractor$retrieveGravityFromExperiment$1;
        Object obj;
        int i;
        if (continuationImpl instanceof DrawerGravityInteractor$retrieveGravityFromExperiment$1) {
            drawerGravityInteractor$retrieveGravityFromExperiment$1 = (DrawerGravityInteractor$retrieveGravityFromExperiment$1) continuationImpl;
            int i2 = drawerGravityInteractor$retrieveGravityFromExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drawerGravityInteractor$retrieveGravityFromExperiment$1.label = i2 - Integer.MIN_VALUE;
                obj = drawerGravityInteractor$retrieveGravityFromExperiment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drawerGravityInteractor$retrieveGravityFromExperiment$1.label;
                int i3 = 3;
                Context context = this.c;
                if (i != 0) {
                    b.b(obj);
                    if (superAppMainScreenLogoImageExperiment.e) {
                        drawerGravityInteractor$retrieveGravityFromExperiment$1.L$0 = null;
                        drawerGravityInteractor$retrieveGravityFromExperiment$1.label = 1;
                        obj = this.b.d.a(drawerGravityInteractor$retrieveGravityFromExperiment$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (obj != SuperAppLogoPositionRepository$LogoPosition.CENTER) {
                }
            }
        }
        drawerGravityInteractor$retrieveGravityFromExperiment$1 = new DrawerGravityInteractor$retrieveGravityFromExperiment$1(this, continuationImpl);
        obj = drawerGravityInteractor$retrieveGravityFromExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drawerGravityInteractor$retrieveGravityFromExperiment$1.label;
        int i32 = 3;
        Context context2 = this.c;
        if (i != 0) {
        }
        if (obj != SuperAppLogoPositionRepository$LogoPosition.CENTER) {
        }
    }
}
