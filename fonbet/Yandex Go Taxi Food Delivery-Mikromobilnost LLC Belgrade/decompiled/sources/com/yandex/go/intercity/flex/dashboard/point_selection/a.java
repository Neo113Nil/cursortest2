package com.yandex.go.intercity.flex.dashboard.point_selection;

import android.content.Context;
import com.yandex.go.intercity.flex.dashboard.point_selection.layers.e;
import com.yandex.go.layers.domain.g;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.anw;
import defpackage.b1;
import defpackage.c0g;
import defpackage.cyx;
import defpackage.dow;
import defpackage.fnw;
import defpackage.g2g;
import defpackage.i6r;
import defpackage.j741;
import defpackage.k7x0;
import defpackage.knw;
import defpackage.lcw;
import defpackage.lnw;
import defpackage.ney;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pho;
import defpackage.q5z;
import defpackage.reu;
import defpackage.rp60;
import defpackage.sae;
import defpackage.tyx;
import defpackage.uxx;
import defpackage.vnw;
import defpackage.w030;
import defpackage.ysd0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.b;
import ru.yandex.taxi.layers.presentation.optimalview.c;

/* loaded from: classes12.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final sae G;
    public final dow H;
    public final b I;

    public a(w030 w030Var, sae saeVar, dow dowVar, b bVar) {
        super(null);
        this.F = w030Var;
        this.G = saeVar;
        this.H = dowVar;
        this.I = bVar;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r13.I.a(r0) != r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (kotlinx.coroutines.a.i(200, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(anw anwVar, ContinuationImpl continuationImpl) {
        IntercityFlexPointSelectionRouter$provideModalView$1 intercityFlexPointSelectionRouter$provideModalView$1;
        int i;
        if (continuationImpl instanceof IntercityFlexPointSelectionRouter$provideModalView$1) {
            intercityFlexPointSelectionRouter$provideModalView$1 = (IntercityFlexPointSelectionRouter$provideModalView$1) continuationImpl;
            int i2 = intercityFlexPointSelectionRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityFlexPointSelectionRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityFlexPointSelectionRouter$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityFlexPointSelectionRouter$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    intercityFlexPointSelectionRouter$provideModalView$1.L$0 = anwVar;
                    intercityFlexPointSelectionRouter$provideModalView$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        anwVar = (anw) intercityFlexPointSelectionRouter$provideModalView$1.L$0;
                        kotlin.b.b(obj);
                        anw anwVar2 = anwVar;
                        reu reuVar = new reu(11, this);
                        lcw lcwVar = this.H.a;
                        c cVar = lcwVar != null ? (c) lcwVar.get() : null;
                        if (cVar == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        sae saeVar = this.G;
                        saeVar.getClass();
                        anwVar2.getClass();
                        i6r i6rVar = (i6r) ((g2g) saeVar.b).i;
                        Context e2 = ((c0g) i6rVar).e2();
                        q5z.h(e2);
                        c0g c0gVar = (c0g) i6rVar;
                        cyx x2 = c0gVar.x2();
                        q5z.h(x2);
                        g gVar = (g) c0gVar.Jh.get();
                        q5z.h(gVar);
                        rp60 rp60Var = (rp60) c0gVar.z.Sm.get();
                        q5z.h(rp60Var);
                        uxx uxxVar = (uxx) c0gVar.zh.get();
                        q5z.h(uxxVar);
                        vnw vnwVar = new vnw(rp60Var, anwVar2, uxxVar);
                        ysd0 ysd0Var = (ysd0) c0gVar.wd.get();
                        q5z.h(ysd0Var);
                        k7x0 Z2 = c0gVar.Z2();
                        q5z.h(Z2);
                        pho k2 = c0gVar.k2();
                        q5z.h(k2);
                        fnw fnwVar = new fnw(x2, gVar, anwVar2, vnwVar, reuVar, ysd0Var, Z2, new b1(k2));
                        ney y2 = c0gVar.y2();
                        q5z.h(y2);
                        tyx tyxVar = (tyx) c0gVar.z.nm.get();
                        q5z.h(tyxVar);
                        ru.yandex.taxi.walkroute.a aVar = (ru.yandex.taxi.walkroute.a) c0gVar.Ce.get();
                        q5z.h(aVar);
                        rp60 rp60Var2 = (rp60) c0gVar.z.Sm.get();
                        q5z.h(rp60Var2);
                        lnw lnwVar = new lnw(y2, new e(tyxVar, anwVar2, aVar, rp60Var2), anwVar2);
                        j741 j741Var = (j741) c0gVar.Ae.get();
                        ah00 z2 = c0gVar.z2();
                        q5z.h(z2);
                        knw knwVar = new knw(lnwVar, j741Var, z2);
                        a3v q2 = c0gVar.q2();
                        q5z.h(q2);
                        pav w2 = c0gVar.w2();
                        q5z.h(w2);
                        return new IntercityPointSelectionModalView(e2, fnwVar, cVar, anwVar2, knwVar, q2, w2);
                    }
                    anwVar = (anw) intercityFlexPointSelectionRouter$provideModalView$1.L$0;
                    kotlin.b.b(obj);
                }
                intercityFlexPointSelectionRouter$provideModalView$1.L$0 = anwVar;
                intercityFlexPointSelectionRouter$provideModalView$1.label = 2;
            }
        }
        intercityFlexPointSelectionRouter$provideModalView$1 = new IntercityFlexPointSelectionRouter$provideModalView$1(this, continuationImpl);
        Object obj2 = intercityFlexPointSelectionRouter$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityFlexPointSelectionRouter$provideModalView$1.label;
        if (i != 0) {
        }
        intercityFlexPointSelectionRouter$provideModalView$1.L$0 = anwVar;
        intercityFlexPointSelectionRouter$provideModalView$1.label = 2;
    }
}
