package com.yandex.plus.home.plaque.feature.internal.presentation;

import com.yandex.plus.log.api.LogPriority;
import defpackage.ag20;
import defpackage.boc0;
import defpackage.bvf0;
import defpackage.e3n;
import defpackage.eg20;
import defpackage.ffx;
import defpackage.g6u;
import defpackage.g8e;
import defpackage.gkc0;
import defpackage.if20;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.kf20;
import defpackage.kjz;
import defpackage.mmc0;
import defpackage.ny61;
import defpackage.o370;
import defpackage.of20;
import defpackage.oo2;
import defpackage.pgz;
import defpackage.phc0;
import defpackage.qda0;
import defpackage.rf20;
import defpackage.rhc0;
import defpackage.rkc0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.unr0;
import defpackage.vf20;
import defpackage.vng;
import defpackage.w511;
import defpackage.weu;
import defpackage.yf20;
import defpackage.yk;
import defpackage.yo40;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class d {
    public final kjz a;
    public final com.yandex.plus.home.plaque.feature.internal.domain.interactors.a b;
    public final gkc0 c;
    public final com.yandex.plus.home.plaque.feature.internal.domain.interactors.b d;
    public final yo40 e;
    public final oo2 f;
    public final o370 g;
    public final pgz h;
    public final ike i;
    public final jse j;
    public final n0 k = ffx.c(0, 0, null, 7);
    public final r0 l = bvf0.c(null);
    public final r0 m;
    public final r0 n;
    public final ike o;

    public d(com.yandex.plus.home.plaque.feature.internal.domain.observable.a aVar, kjz kjzVar, com.yandex.plus.home.plaque.feature.internal.domain.interactors.a aVar2, gkc0 gkc0Var, com.yandex.plus.home.plaque.feature.internal.domain.interactors.b bVar, yo40 yo40Var, oo2 oo2Var, o370 o370Var, pgz pgzVar, ike ikeVar, jse jseVar, g6u g6uVar) {
        this.a = kjzVar;
        this.b = aVar2;
        this.c = gkc0Var;
        this.d = bVar;
        this.e = yo40Var;
        this.f = oo2Var;
        this.g = o370Var;
        this.h = pgzVar;
        this.i = ikeVar;
        this.j = jseVar;
        Boolean bool = Boolean.FALSE;
        this.m = bvf0.c(bool);
        this.n = bvf0.c(bool);
        ike f = g8e.f(g6uVar);
        this.o = f;
        LogPriority logPriority = LogPriority.INFO;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PlaqueViewModel", "init");
        }
        r0 r0Var = ((rkc0) kjzVar.b).e;
        qda0 qda0Var = new qda0(6);
        yk ykVar = vng.c;
        com.yandex.plus.home.common.utils.c.e(vng.l(new m0(vng.l(r0Var, qda0Var, ykVar), aVar.a.e(), new PlaqueViewModel$3(this, null)), new weu(24, this), ykVar), f, new PlaqueViewModel$5(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x017b, code lost:
    
        if (kotlinx.coroutines.a.j(r3, r5) == r6) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0156, code lost:
    
        if (r18.c(r5) == r6) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, boc0 boc0Var, phc0 phc0Var, rhc0 rhc0Var, ContinuationImpl continuationImpl) {
        PlaqueViewModel$showPlaque$1 plaqueViewModel$showPlaque$1;
        int i;
        phc0 phc0Var2;
        rhc0 rhc0Var2;
        boc0 boc0Var2;
        rhc0 rhc0Var3;
        boc0 boc0Var3;
        boc0 boc0Var4;
        long f;
        phc0 phc0Var3;
        LogPriority logPriority;
        Object value;
        boc0 boc0Var5;
        pgz pgzVar = dVar.h;
        yo40 yo40Var = dVar.e;
        r0 r0Var = dVar.l;
        if (continuationImpl instanceof PlaqueViewModel$showPlaque$1) {
            plaqueViewModel$showPlaque$1 = (PlaqueViewModel$showPlaque$1) continuationImpl;
            int i2 = plaqueViewModel$showPlaque$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueViewModel$showPlaque$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plaqueViewModel$showPlaque$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueViewModel$showPlaque$1.label;
                Object obj3 = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        plaqueViewModel$showPlaque$1.L$0 = boc0Var;
                        plaqueViewModel$showPlaque$1.L$1 = phc0Var;
                        plaqueViewModel$showPlaque$1.L$2 = rhc0Var;
                        plaqueViewModel$showPlaque$1.label = 1;
                        Object x = e.x(dVar.n, new PlaqueViewModel$waitUntilPlaqueBecomeAttached$2(2, null), plaqueViewModel$showPlaque$1);
                        if (x != obj2) {
                            x = obj3;
                        }
                        if (x != obj2) {
                            phc0Var2 = phc0Var;
                            rhc0Var2 = rhc0Var;
                            boc0Var2 = boc0Var;
                            if (phc0Var2 != null) {
                                r0Var.l(rhc0Var2);
                                plaqueViewModel$showPlaque$1.L$0 = boc0Var2;
                                plaqueViewModel$showPlaque$1.L$1 = null;
                                plaqueViewModel$showPlaque$1.L$2 = rhc0Var2;
                                plaqueViewModel$showPlaque$1.label = 7;
                                if (dVar.c(plaqueViewModel$showPlaque$1) != obj2) {
                                    rhc0Var3 = rhc0Var2;
                                    boc0Var3 = boc0Var2;
                                    if (!jl40.l(rhc0Var3, rhc0.g)) {
                                        yo40Var.k(rhc0Var3, boc0Var3);
                                    }
                                }
                            } else if (!e3n.j(phc0Var2.e()) || !e3n.j(phc0Var2.f())) {
                                boc0Var4 = boc0Var2;
                                plaqueViewModel$showPlaque$1.L$0 = boc0Var4;
                                plaqueViewModel$showPlaque$1.L$1 = phc0Var2;
                                plaqueViewModel$showPlaque$1.L$2 = null;
                                plaqueViewModel$showPlaque$1.label = 4;
                                break;
                            } else {
                                r0Var.l(rhc0Var2);
                                plaqueViewModel$showPlaque$1.L$0 = boc0Var2;
                                plaqueViewModel$showPlaque$1.L$1 = phc0Var2;
                                plaqueViewModel$showPlaque$1.L$2 = rhc0Var2;
                                plaqueViewModel$showPlaque$1.label = 2;
                                if (dVar.c(plaqueViewModel$showPlaque$1) != obj2) {
                                    boc0Var4 = boc0Var2;
                                    if (!jl40.l(rhc0Var2, rhc0.g)) {
                                        yo40Var.k(rhc0Var2, boc0Var4);
                                    }
                                    f = phc0Var2.f();
                                    plaqueViewModel$showPlaque$1.L$0 = boc0Var4;
                                    plaqueViewModel$showPlaque$1.L$1 = phc0Var2;
                                    plaqueViewModel$showPlaque$1.L$2 = null;
                                    plaqueViewModel$showPlaque$1.label = 3;
                                    if (kotlinx.coroutines.a.j(f, plaqueViewModel$showPlaque$1) != obj2) {
                                        phc0Var3 = phc0Var2;
                                        logPriority = LogPriority.INFO;
                                        if (pgzVar.e(logPriority)) {
                                            pgzVar.a(logPriority, "PlaqueViewModel", "showAfterMillis ended for " + phc0Var3.b().a);
                                        }
                                        phc0Var2 = phc0Var3;
                                        plaqueViewModel$showPlaque$1.L$0 = boc0Var4;
                                        plaqueViewModel$showPlaque$1.L$1 = phc0Var2;
                                        plaqueViewModel$showPlaque$1.L$2 = null;
                                        plaqueViewModel$showPlaque$1.label = 4;
                                    }
                                }
                            }
                        }
                    case 1:
                        rhc0Var2 = (rhc0) plaqueViewModel$showPlaque$1.L$2;
                        phc0Var2 = (phc0) plaqueViewModel$showPlaque$1.L$1;
                        boc0Var2 = (boc0) plaqueViewModel$showPlaque$1.L$0;
                        kotlin.b.b(obj);
                        if (phc0Var2 != null) {
                        }
                    case 2:
                        rhc0Var2 = (rhc0) plaqueViewModel$showPlaque$1.L$2;
                        phc0 phc0Var4 = (phc0) plaqueViewModel$showPlaque$1.L$1;
                        boc0 boc0Var6 = (boc0) plaqueViewModel$showPlaque$1.L$0;
                        kotlin.b.b(obj);
                        phc0Var2 = phc0Var4;
                        boc0Var4 = boc0Var6;
                        if (!jl40.l(rhc0Var2, rhc0.g)) {
                        }
                        f = phc0Var2.f();
                        plaqueViewModel$showPlaque$1.L$0 = boc0Var4;
                        plaqueViewModel$showPlaque$1.L$1 = phc0Var2;
                        plaqueViewModel$showPlaque$1.L$2 = null;
                        plaqueViewModel$showPlaque$1.label = 3;
                        if (kotlinx.coroutines.a.j(f, plaqueViewModel$showPlaque$1) != obj2) {
                        }
                    case 3:
                        phc0Var3 = (phc0) plaqueViewModel$showPlaque$1.L$1;
                        boc0Var4 = (boc0) plaqueViewModel$showPlaque$1.L$0;
                        kotlin.b.b(obj);
                        logPriority = LogPriority.INFO;
                        if (pgzVar.e(logPriority)) {
                        }
                        phc0Var2 = phc0Var3;
                        plaqueViewModel$showPlaque$1.L$0 = boc0Var4;
                        plaqueViewModel$showPlaque$1.L$1 = phc0Var2;
                        plaqueViewModel$showPlaque$1.L$2 = null;
                        plaqueViewModel$showPlaque$1.label = 4;
                        break;
                    case 4:
                        phc0 phc0Var5 = (phc0) plaqueViewModel$showPlaque$1.L$1;
                        boc0Var4 = (boc0) plaqueViewModel$showPlaque$1.L$0;
                        kotlin.b.b(obj);
                        phc0Var2 = phc0Var5;
                        r0Var.l(phc0Var2);
                        yo40Var.k(phc0Var2, boc0Var4);
                        tje.N(dVar.o, null, null, new PlaqueViewModel$showPlaque$3(dVar, phc0Var2, null), 3);
                        long e = phc0Var2.e();
                        plaqueViewModel$showPlaque$1.L$0 = null;
                        plaqueViewModel$showPlaque$1.L$1 = phc0Var2;
                        plaqueViewModel$showPlaque$1.L$2 = null;
                        plaqueViewModel$showPlaque$1.label = 5;
                        break;
                    case 5:
                        phc0 phc0Var6 = (phc0) plaqueViewModel$showPlaque$1.L$1;
                        kotlin.b.b(obj);
                        phc0Var2 = phc0Var6;
                        LogPriority logPriority2 = LogPriority.INFO;
                        if (pgzVar.e(logPriority2)) {
                            pgzVar.a(logPriority2, "PlaqueViewModel", "closeAfterMillis ended for " + phc0Var2.b().a);
                        }
                        kjz kjzVar = dVar.a;
                        String str = phc0Var2.b().a;
                        pgz pgzVar2 = (pgz) kjzVar.c;
                        if (pgzVar2.e(logPriority2)) {
                            pgzVar2.a(logPriority2, "PlaqueContextObservableImpl", unr0.l(')', "onPlaqueShown(", str));
                        }
                        rkc0 rkc0Var = (rkc0) kjzVar.b;
                        Set set = rkc0Var.a;
                        r0 r0Var2 = rkc0Var.e;
                        do {
                            value = r0Var2.getValue();
                            boc0Var5 = (boc0) value;
                            set.add(str);
                        } while (!r0Var2.k(value, boc0.a(boc0Var5, kotlin.collections.b.o(boc0Var5.a, new Pair("PlaquesShown", kotlin.collections.a.N0(set))))));
                        n0 n0Var = dVar.k;
                        mmc0 mmc0Var = new mmc0(phc0Var2.b().a);
                        plaqueViewModel$showPlaque$1.L$0 = null;
                        plaqueViewModel$showPlaque$1.L$1 = null;
                        plaqueViewModel$showPlaque$1.L$2 = null;
                        plaqueViewModel$showPlaque$1.label = 6;
                        return n0Var.emit(mmc0Var, plaqueViewModel$showPlaque$1) == obj2 ? obj2 : obj3;
                    case 6:
                        kotlin.b.b(obj);
                        return obj3;
                    case 7:
                        rhc0Var3 = (rhc0) plaqueViewModel$showPlaque$1.L$2;
                        boc0Var3 = (boc0) plaqueViewModel$showPlaque$1.L$0;
                        kotlin.b.b(obj);
                        if (!jl40.l(rhc0Var3, rhc0.g)) {
                        }
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        plaqueViewModel$showPlaque$1 = new PlaqueViewModel$showPlaque$1(dVar, continuationImpl);
        Object obj4 = plaqueViewModel$showPlaque$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueViewModel$showPlaque$1.label;
        Object obj32 = zy11.a;
        switch (i) {
        }
    }

    public static eg20 b(eg20 eg20Var, Map map, boolean z) {
        if (eg20Var instanceof yf20) {
            yf20 yf20Var = (yf20) eg20Var;
            Boolean bool = (Boolean) map.get(yf20Var.getId());
            if (bool != null) {
                z = bool.booleanValue();
            }
            return yf20.d(yf20Var, z);
        }
        if (eg20Var instanceof if20) {
            if20 if20Var = (if20) eg20Var;
            List b = if20Var.b();
            ArrayList arrayList = new ArrayList(tcc.n(b, 10));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(b((eg20) it.next(), map, z));
            }
            return if20.d(if20Var, arrayList);
        }
        if (eg20Var instanceof rf20) {
            rf20 rf20Var = (rf20) eg20Var;
            List list = rf20Var.e;
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b((eg20) it2.next(), map, z));
            }
            return new rf20(rf20Var.a, rf20Var.b, rf20Var.c, rf20Var.d, arrayList2, rf20Var.f);
        }
        if ((eg20Var instanceof kf20) || (eg20Var instanceof of20) || (eg20Var instanceof vf20) || (eg20Var instanceof ag20)) {
            return eg20Var;
        }
        w511.b();
        return null;
    }

    public final Object c(Continuation continuation) {
        Object x = e.x(this.m, new PlaqueViewModel$waitUntilPlaqueBecomeVisible$2(2, null), continuation);
        return x == CoroutineSingletons.COROUTINE_SUSPENDED ? x : zy11.a;
    }
}
