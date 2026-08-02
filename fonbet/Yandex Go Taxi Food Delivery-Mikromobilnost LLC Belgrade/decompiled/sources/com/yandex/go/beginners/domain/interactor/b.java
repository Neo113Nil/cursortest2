package com.yandex.go.beginners.domain.interactor;

import defpackage.ahe0;
import defpackage.bd;
import defpackage.bk1;
import defpackage.cbn;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.dd;
import defpackage.evu0;
import defpackage.j5z;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.lge0;
import defpackage.mge0;
import defpackage.nge0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.xan;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes12.dex */
public final class b {
    public final g a;
    public final bk1 b;
    public final rqo c;
    public final j5z d;

    public b(g gVar, bk1 bk1Var, rqo rqoVar, j5z j5zVar) {
        this.a = gVar;
        this.b = bk1Var;
        this.c = rqoVar;
        this.d = j5zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v4, types: [dd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        BeginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1 beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1;
        int i;
        xan xanVar;
        boolean z;
        String obj;
        Object obj2;
        if (continuationImpl instanceof BeginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1) {
            beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1 = (BeginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1) continuationImpl;
            int i2 = beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1.label;
                bd bdVar = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    q d = ((jbh) this.c).d(xan.h);
                    beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1.label = 1;
                    obj3 = d.b(beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                xanVar = (xan) obj3;
                g gVar = this.a;
                boolean z2 = !gVar.f() && gVar.g();
                if (xanVar.b || !xanVar.d || z2) {
                    return lge0.a;
                }
                cbn cbnVar = xanVar.f;
                if (cbnVar == null) {
                    return mge0.a;
                }
                String str = cbnVar.d;
                if (str != null && (obj = evu0.k0(str).toString()) != null) {
                    if (obj.length() <= 0) {
                        obj = null;
                    }
                    if (obj != null) {
                        Iterator it = ((com.yandex.go.agreement.interactor.a) this.b).b.a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((dd) obj2).a(), obj)) {
                                break;
                            }
                        }
                        ?? r7 = (dd) obj2;
                        if (r7 instanceof bd) {
                            String str2 = ((bd) r7).e;
                            if (str2 != null && !evu0.J(str2)) {
                                bdVar = r7;
                            }
                            bdVar = bdVar;
                        }
                    }
                }
                bd bdVar2 = bdVar;
                String language = this.d.c().getLanguage();
                List list = cbnVar.e;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (cvu0.t((String) it2.next(), language, true)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                return new nge0(new ahe0(d6z.Y(xanVar, cbnVar.a), d6z.Y(xanVar, cbnVar.b), d6z.Y(xanVar, cbnVar.c), z, bdVar2));
            }
        }
        beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1 = new BeginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1(this, continuationImpl);
        Object obj32 = beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beginnersPreGeoAuthInteractor$preGeoAuthLaunchStep$1.label;
        bd bdVar3 = null;
        if (i != 0) {
        }
        xanVar = (xan) obj32;
        g gVar2 = this.a;
        if (gVar2.f()) {
        }
        if (xanVar.b) {
        }
        return lge0.a;
    }
}
