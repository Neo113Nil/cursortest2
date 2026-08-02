package com.yandex.go.explorer.impl.navigation;

import android.animation.ValueAnimator;
import com.yandex.go.explorer.impl.experiments.g;
import com.yandex.go.explorer.impl.ui.map.l;
import defpackage.ah00;
import defpackage.c0g;
import defpackage.gh00;
import defpackage.gto;
import defpackage.h55;
import defpackage.i6r;
import defpackage.k0b0;
import defpackage.ny61;
import defpackage.pzf;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.wuo;
import defpackage.xm00;
import defpackage.xvf0;
import defpackage.yuo;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c extends h55 {
    public final i6r D;
    public final wuo E;
    public final g F;
    public final k0b0 G;
    public final com.yandex.go.explorer.impl.data.repositories.c H;
    public pzf I;
    public boolean J;
    public boolean K;

    public c(i6r i6rVar, wuo wuoVar, g gVar, k0b0 k0b0Var, com.yandex.go.explorer.impl.data.repositories.c cVar) {
        super(null);
        this.D = i6rVar;
        this.E = wuoVar;
        this.F = gVar;
        this.G = k0b0Var;
        this.H = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(c cVar, ContinuationImpl continuationImpl) {
        ExplorerRouterImpl$syncUserLocations$1 explorerRouterImpl$syncUserLocations$1;
        int i;
        boolean booleanValue;
        cVar.getClass();
        if (continuationImpl instanceof ExplorerRouterImpl$syncUserLocations$1) {
            explorerRouterImpl$syncUserLocations$1 = (ExplorerRouterImpl$syncUserLocations$1) continuationImpl;
            int i2 = explorerRouterImpl$syncUserLocations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerRouterImpl$syncUserLocations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = explorerRouterImpl$syncUserLocations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerRouterImpl$syncUserLocations$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.explorer.impl.data.repositories.c cVar2 = cVar.H;
                    explorerRouterImpl$syncUserLocations$1.label = 1;
                    obj = cVar2.c(explorerRouterImpl$syncUserLocations$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    return zy11.a;
                }
                com.yandex.go.explorer.impl.data.repositories.a aVar = (com.yandex.go.explorer.impl.data.repositories.a) ((c0g) cVar.D).z.qg.get();
                explorerRouterImpl$syncUserLocations$1.Z$0 = booleanValue;
                explorerRouterImpl$syncUserLocations$1.label = 2;
                Object f = aVar.f(explorerRouterImpl$syncUserLocations$1);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        explorerRouterImpl$syncUserLocations$1 = new ExplorerRouterImpl$syncUserLocations$1(cVar, continuationImpl);
        Object obj2 = explorerRouterImpl$syncUserLocations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerRouterImpl$syncUserLocations$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
    }

    public static final void Q(c cVar, gto gtoVar) {
        cVar.getClass();
        tje.N(cVar.o(), null, null, new ExplorerRouterImpl$updateButtonState$1(cVar, ((pzf) gtoVar).b(), null), 3);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        pzf pzfVar = this.I;
        if (pzfVar == null || this.J) {
            return;
        }
        ((com.yandex.go.explorer.impl.ui.map.c) ((xvf0) pzfVar.d).get()).attach();
        this.J = true;
        ((l) ((xvf0) pzfVar.c).get()).Lg(this.K);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        R();
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        R();
        this.I = null;
        this.K = false;
        r0 r0Var = ((yuo) ((c0g) this.D).z.sg.get()).a;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        wuo wuoVar = this.E;
        wuoVar.b.l(null);
        wuoVar.c.l(null);
        r0 r0Var2 = wuoVar.d;
        r0Var2.getClass();
        r0Var2.m(null, bool);
        r0 r0Var3 = wuoVar.h;
        Boolean bool2 = Boolean.TRUE;
        r0Var3.getClass();
        r0Var3.m(null, bool2);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ExplorerRouterImpl$onLaunch$1(this, null), 3);
    }

    public final void R() {
        pzf pzfVar;
        if (this.J && (pzfVar = this.I) != null) {
            ((l) ((xvf0) pzfVar.c).get()).Lg(false);
            com.yandex.go.explorer.impl.ui.map.c cVar = (com.yandex.go.explorer.impl.ui.map.c) ((xvf0) pzfVar.d).get();
            ah00 ah00Var = (ah00) cVar.b;
            cVar.c.Cg();
            ValueAnimator valueAnimator = (ValueAnimator) cVar.Q.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            pzt0 pzt0Var = cVar.G;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            pzt0 pzt0Var2 = cVar.F;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            com.yandex.go.explorer.impl.ui.map.animation.a aVar = cVar.S;
            aVar.b = true;
            ArrayList arrayList = aVar.a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ValueAnimator) it.next()).cancel();
            }
            arrayList.clear();
            gh00 gh00Var = (gh00) ah00Var;
            gh00Var.u(cVar.I);
            cVar.H = false;
            cVar.Ig();
            xm00 xm00Var = cVar.x;
            if (xm00Var != null) {
                xm00Var.m();
            }
            xm00 xm00Var2 = cVar.x;
            if (xm00Var2 != null) {
                xm00Var2.d();
            }
            cVar.x = null;
            cVar.y.clear();
            cVar.A.clear();
            gh00Var.t(cVar.J);
            this.J = false;
        }
    }
}
