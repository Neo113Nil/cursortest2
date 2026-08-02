package com.yandex.go.taxi.tariffs.internal.interactor;

import com.yandex.go.taxi.tariffs.interactor.SetTariffInfoInteractorImpl$setTariffsInfo$$inlined$setTariffInfoInternal$1;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.models.TariffChangeReason;
import defpackage.ae61;
import defpackage.c4r0;
import defpackage.cwd;
import defpackage.dwj0;
import defpackage.en11;
import defpackage.g7j0;
import defpackage.grz0;
import defpackage.jaq0;
import defpackage.jjj0;
import defpackage.jl40;
import defpackage.ktj0;
import defpackage.m4r0;
import defpackage.maj0;
import defpackage.mdh;
import defpackage.moz0;
import defpackage.mqz0;
import defpackage.mtj0;
import defpackage.nrx0;
import defpackage.ntj0;
import defpackage.nu1;
import defpackage.ny61;
import defpackage.opz0;
import defpackage.orz0;
import defpackage.pex0;
import defpackage.prz0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uvw;
import defpackage.uyj;
import defpackage.vrz0;
import defpackage.vug;
import defpackage.w511;
import defpackage.yal0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;
import ru.yandex.taxi.preorder.tollroad.data.RoadRestriction;
import ru.yandex.taxi.preorder.tollroad.data.TollRoadsAvailability;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes8.dex */
public final class f {
    public final com.yandex.go.taxi.tariffs.internal.repository.a a;
    public final m4r0 b;
    public final uvw c;
    public final ru.yandex.taxi.preorder.tollroad.a d;
    public final opz0 e;
    public final mqz0 f;
    public final ae61 g;
    public final nrx0 h;
    public final tt2 i;
    public final jaq0 j;

    public f(com.yandex.go.taxi.tariffs.internal.repository.a aVar, m4r0 m4r0Var, uvw uvwVar, ru.yandex.taxi.preorder.tollroad.a aVar2, opz0 opz0Var, mqz0 mqz0Var, ae61 ae61Var, nrx0 nrx0Var, tt2 tt2Var, jaq0 jaq0Var) {
        this.a = aVar;
        this.b = m4r0Var;
        this.c = uvwVar;
        this.d = aVar2;
        this.e = opz0Var;
        this.f = mqz0Var;
        this.g = ae61Var;
        this.h = nrx0Var;
        this.i = tt2Var;
        this.j = jaq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UpdateTariffsInteractor$awaitMapkitRoutesForTollRoads$1 updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1;
        int i;
        if (continuationImpl instanceof UpdateTariffsInteractor$awaitMapkitRoutesForTollRoads$1) {
            updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1 = (UpdateTariffsInteractor$awaitMapkitRoutesForTollRoads$1) continuationImpl;
            int i2 = updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(this.f.a.e);
                    updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(eVar, updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1 = new UpdateTariffsInteractor$awaitMapkitRoutesForTollRoads$1(this, continuationImpl);
        Object obj2 = updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateTariffsInteractor$awaitMapkitRoutesForTollRoads$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if (c(r8, r4, com.yandex.go.taxi.tariffs.models.TariffChangeReason.DEFAULT, r6) == r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g7j0 g7j0Var, dwj0 dwj0Var, cwd cwdVar, boolean z, ContinuationImpl continuationImpl) {
        UpdateTariffsInteractor$handleNewTariffs$1 updateTariffsInteractor$handleNewTariffs$1;
        int i;
        boolean isEnabled;
        cwd cwdVar2;
        dwj0 dwj0Var2;
        boolean z2;
        boolean z3;
        g7j0 g7j0Var2 = g7j0Var;
        dwj0 dwj0Var3 = dwj0Var;
        cwd cwdVar3 = cwdVar;
        boolean z4 = z;
        if (continuationImpl instanceof UpdateTariffsInteractor$handleNewTariffs$1) {
            updateTariffsInteractor$handleNewTariffs$1 = (UpdateTariffsInteractor$handleNewTariffs$1) continuationImpl;
            int i2 = updateTariffsInteractor$handleNewTariffs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateTariffsInteractor$handleNewTariffs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateTariffsInteractor$handleNewTariffs$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateTariffsInteractor$handleNewTariffs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    isEnabled = ((en11) this.e.a.getValue()).isEnabled();
                    if (isEnabled) {
                        dwj0 a = dwj0.a(dwj0Var3, null, new cwd(cwdVar3.a, cwdVar3.b, cwdVar3.c, cwdVar3.d, cwdVar3.e, cwdVar3.f), 3);
                        updateTariffsInteractor$handleNewTariffs$1.L$0 = g7j0Var2;
                        updateTariffsInteractor$handleNewTariffs$1.L$1 = dwj0Var3;
                        updateTariffsInteractor$handleNewTariffs$1.L$2 = cwdVar3;
                        updateTariffsInteractor$handleNewTariffs$1.Z$0 = z4;
                        updateTariffsInteractor$handleNewTariffs$1.Z$1 = isEnabled;
                        updateTariffsInteractor$handleNewTariffs$1.label = 1;
                    } else {
                        dwj0 a2 = dwj0.a(dwj0Var3, null, cwdVar3, 3);
                        updateTariffsInteractor$handleNewTariffs$1.L$0 = g7j0Var2;
                        updateTariffsInteractor$handleNewTariffs$1.L$1 = null;
                        updateTariffsInteractor$handleNewTariffs$1.L$2 = cwdVar3;
                        updateTariffsInteractor$handleNewTariffs$1.Z$0 = z4;
                        updateTariffsInteractor$handleNewTariffs$1.Z$1 = isEnabled;
                        updateTariffsInteractor$handleNewTariffs$1.label = 4;
                        if (c(a2, z4, TariffChangeReason.DEFAULT, updateTariffsInteractor$handleNewTariffs$1) != obj2) {
                            cwdVar2 = cwdVar3;
                            if (!z4) {
                            }
                        }
                    }
                }
                if (i == 1) {
                    boolean z5 = updateTariffsInteractor$handleNewTariffs$1.Z$1;
                    boolean z6 = updateTariffsInteractor$handleNewTariffs$1.Z$0;
                    cwdVar3 = (cwd) updateTariffsInteractor$handleNewTariffs$1.L$2;
                    dwj0 dwj0Var4 = (dwj0) updateTariffsInteractor$handleNewTariffs$1.L$1;
                    g7j0 g7j0Var3 = (g7j0) updateTariffsInteractor$handleNewTariffs$1.L$0;
                    kotlin.b.b(obj);
                    z4 = z6;
                    dwj0Var3 = dwj0Var4;
                    isEnabled = z5;
                    g7j0Var2 = g7j0Var3;
                    if (!z4) {
                        d(g7j0Var2, cwdVar3);
                    }
                    if (g7j0Var2.a.c.b.size() > 1 && !this.f.a.l) {
                        updateTariffsInteractor$handleNewTariffs$1.L$0 = null;
                        updateTariffsInteractor$handleNewTariffs$1.L$1 = dwj0Var3;
                        updateTariffsInteractor$handleNewTariffs$1.L$2 = cwdVar3;
                        updateTariffsInteractor$handleNewTariffs$1.Z$0 = z4;
                        updateTariffsInteractor$handleNewTariffs$1.Z$1 = isEnabled;
                        updateTariffsInteractor$handleNewTariffs$1.label = 2;
                        if (a(updateTariffsInteractor$handleNewTariffs$1) != obj2) {
                            boolean z7 = z4;
                            dwj0Var2 = dwj0Var3;
                            z2 = z7;
                            z3 = isEnabled;
                            if (!this.f.a.l) {
                            }
                        }
                    }
                } else if (i == 2) {
                    z3 = updateTariffsInteractor$handleNewTariffs$1.Z$1;
                    z2 = updateTariffsInteractor$handleNewTariffs$1.Z$0;
                    cwdVar3 = (cwd) updateTariffsInteractor$handleNewTariffs$1.L$2;
                    dwj0Var2 = (dwj0) updateTariffsInteractor$handleNewTariffs$1.L$1;
                    kotlin.b.b(obj);
                    if (!this.f.a.l) {
                        dwj0 a3 = dwj0.a(dwj0Var2, null, cwdVar3, 3);
                        updateTariffsInteractor$handleNewTariffs$1.L$0 = null;
                        updateTariffsInteractor$handleNewTariffs$1.L$1 = null;
                        updateTariffsInteractor$handleNewTariffs$1.L$2 = null;
                        updateTariffsInteractor$handleNewTariffs$1.Z$0 = z2;
                        updateTariffsInteractor$handleNewTariffs$1.Z$1 = z3;
                        updateTariffsInteractor$handleNewTariffs$1.label = 3;
                        Object c = c(a3, z2, TariffChangeReason.DEFAULT, updateTariffsInteractor$handleNewTariffs$1);
                        return c == obj2 ? obj2 : c;
                    }
                } else {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z8 = updateTariffsInteractor$handleNewTariffs$1.Z$0;
                    cwdVar2 = (cwd) updateTariffsInteractor$handleNewTariffs$1.L$2;
                    g7j0 g7j0Var4 = (g7j0) updateTariffsInteractor$handleNewTariffs$1.L$0;
                    kotlin.b.b(obj);
                    z4 = z8;
                    g7j0Var2 = g7j0Var4;
                    if (!z4) {
                        d(g7j0Var2, cwdVar2);
                    }
                }
                return zy11.a;
            }
        }
        updateTariffsInteractor$handleNewTariffs$1 = new UpdateTariffsInteractor$handleNewTariffs$1(this, continuationImpl);
        Object obj3 = updateTariffsInteractor$handleNewTariffs$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateTariffsInteractor$handleNewTariffs$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0199, code lost:
    
        if (r3 == r5) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x007f, code lost:
    
        if (r19.a.c(r1, !r2, r4) == r5) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(dwj0 dwj0Var, boolean z, TariffChangeReason tariffChangeReason, ContinuationImpl continuationImpl) {
        UpdateTariffsInteractor$updateTariffsForResponse$1 updateTariffsInteractor$updateTariffsForResponse$1;
        int i;
        TariffChangeReason tariffChangeReason2;
        cwd cwdVar;
        dwj0 dwj0Var2;
        boolean z2;
        TariffChangeReason tariffChangeReason3;
        Object obj;
        pex0 m;
        pex0 pex0Var;
        Object obj2;
        cwd cwdVar2;
        pzt0 pzt0Var;
        dwj0 dwj0Var3 = dwj0Var;
        boolean z3 = z;
        if (continuationImpl instanceof UpdateTariffsInteractor$updateTariffsForResponse$1) {
            updateTariffsInteractor$updateTariffsForResponse$1 = (UpdateTariffsInteractor$updateTariffsForResponse$1) continuationImpl;
            int i2 = updateTariffsInteractor$updateTariffsForResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateTariffsInteractor$updateTariffsForResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = updateTariffsInteractor$updateTariffsForResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateTariffsInteractor$updateTariffsForResponse$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    updateTariffsInteractor$updateTariffsForResponse$1.L$0 = dwj0Var3;
                    tariffChangeReason2 = tariffChangeReason;
                    updateTariffsInteractor$updateTariffsForResponse$1.L$1 = tariffChangeReason2;
                    updateTariffsInteractor$updateTariffsForResponse$1.Z$0 = z3;
                    updateTariffsInteractor$updateTariffsForResponse$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj3);
                            this.c.a.k(PriceUpdate$PriceLoadingState.LOADED);
                            return zy11Var;
                        }
                        z2 = updateTariffsInteractor$updateTariffsForResponse$1.Z$0;
                        tariffChangeReason3 = (TariffChangeReason) updateTariffsInteractor$updateTariffsForResponse$1.L$1;
                        dwj0Var2 = (dwj0) updateTariffsInteractor$updateTariffsForResponse$1.L$0;
                        kotlin.b.b(obj3);
                        cwdVar2 = dwj0Var2.c;
                        m4r0 m4r0Var = this.b;
                        if (cwdVar2 == null) {
                            pzt0Var = m4r0Var.d.a(tariffChangeReason3, new SetTariffInfoInteractorImpl$setTariffsInfo$$inlined$setTariffInfoInternal$1(m4r0Var, null, cwdVar2));
                        } else {
                            m4r0Var.getClass();
                            pzt0Var = null;
                        }
                        if (pzt0Var != null) {
                            updateTariffsInteractor$updateTariffsForResponse$1.L$0 = null;
                            updateTariffsInteractor$updateTariffsForResponse$1.L$1 = null;
                            updateTariffsInteractor$updateTariffsForResponse$1.Z$0 = z2;
                            updateTariffsInteractor$updateTariffsForResponse$1.label = 3;
                            obj3 = pzt0Var.u0(updateTariffsInteractor$updateTariffsForResponse$1);
                        }
                        this.c.a.k(PriceUpdate$PriceLoadingState.LOADED);
                        return zy11Var;
                    }
                    boolean z4 = updateTariffsInteractor$updateTariffsForResponse$1.Z$0;
                    TariffChangeReason tariffChangeReason4 = (TariffChangeReason) updateTariffsInteractor$updateTariffsForResponse$1.L$1;
                    dwj0 dwj0Var4 = (dwj0) updateTariffsInteractor$updateTariffsForResponse$1.L$0;
                    kotlin.b.b(obj3);
                    z3 = z4;
                    dwj0Var3 = dwj0Var4;
                    tariffChangeReason2 = tariffChangeReason4;
                }
                cwdVar = dwj0Var3.c;
                if (cwdVar != cwd.g) {
                    g7j0 g7j0Var = dwj0Var3.a;
                    mtj0 mtj0Var = ntj0.a;
                    e(g7j0Var, new ktj0(cwdVar));
                    if (!z3) {
                        for (pex0 pex0Var2 : cwdVar.c) {
                            boolean g = pex0Var2.g();
                            String str = pex0Var2.b;
                            if (g && ru.yandex.taxi.tariffs.model.b.h(pex0Var2)) {
                                jaq0 jaq0Var = this.j;
                                maj0 maj0Var = jaq0Var.a;
                                if (maj0Var.c(str) == null) {
                                    Iterator it = ru.yandex.taxi.tariffs.model.b.b(pex0Var2).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it.next();
                                        nu1 nu1Var = (nu1) obj2;
                                        if (nu1Var.c && nu1Var.d) {
                                            break;
                                        }
                                    }
                                    nu1 nu1Var2 = (nu1) obj2;
                                    if (nu1Var2 != null) {
                                        maj0Var.b(str, nu1Var2.b);
                                    }
                                }
                                maj0 maj0Var2 = jaq0Var.a;
                                String c = maj0Var2.c(str);
                                Iterator it2 = ru.yandex.taxi.tariffs.model.b.b(pex0Var2).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (jl40.l(((nu1) obj).b, c)) {
                                        break;
                                    }
                                }
                                nu1 nu1Var3 = (nu1) obj;
                                if (nu1Var3 != null && !nu1Var3.d && (m = ((k) jaq0Var.b).m()) != null && (m.O instanceof jjj0) && (pex0Var = m.M0) != null) {
                                    c4r0.g(jaq0Var.c, SelectionOrigin.INVALIDATE, pex0Var.J0, null, 12);
                                    maj0Var2.a(m.b);
                                }
                            }
                        }
                        updateTariffsInteractor$updateTariffsForResponse$1.L$0 = dwj0Var3;
                        updateTariffsInteractor$updateTariffsForResponse$1.L$1 = tariffChangeReason2;
                        updateTariffsInteractor$updateTariffsForResponse$1.Z$0 = z3;
                        updateTariffsInteractor$updateTariffsForResponse$1.label = 2;
                        this.i.getClass();
                        sjh sjhVar = uyj.a;
                        Object k0 = tje.k0(mdh.b, new UpdateTariffsInteractor$saveDisplayableTariffClasses$2(this, cwdVar, null), updateTariffsInteractor$updateTariffsForResponse$1);
                        if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            k0 = zy11Var;
                        }
                        if (k0 != coroutineSingletons) {
                            TariffChangeReason tariffChangeReason5 = tariffChangeReason2;
                            dwj0Var2 = dwj0Var3;
                            z2 = z3;
                            tariffChangeReason3 = tariffChangeReason5;
                            cwdVar2 = dwj0Var2.c;
                            m4r0 m4r0Var2 = this.b;
                            if (cwdVar2 == null) {
                            }
                            if (pzt0Var != null) {
                            }
                            this.c.a.k(PriceUpdate$PriceLoadingState.LOADED);
                        }
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        updateTariffsInteractor$updateTariffsForResponse$1 = new UpdateTariffsInteractor$updateTariffsForResponse$1(this, continuationImpl);
        Object obj32 = updateTariffsInteractor$updateTariffsForResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateTariffsInteractor$updateTariffsForResponse$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        cwdVar = dwj0Var3.c;
        if (cwdVar != cwd.g) {
        }
        return zy11Var2;
    }

    public final void d(g7j0 g7j0Var, cwd cwdVar) {
        vrz0 vrz0Var;
        TollRoadsAvailability tollRoadsAvailability;
        grz0 grz0Var;
        yal0 yal0Var = cwdVar.b;
        Boolean bool = g7j0Var.a.k;
        mqz0 mqz0Var = this.f;
        mqz0Var.getClass();
        if (yal0Var == null || (vrz0Var = yal0Var.j) == null) {
            vrz0Var = vrz0.i;
        }
        ru.yandex.taxi.preorder.tollroad.data.e eVar = mqz0Var.a;
        prz0 prz0Var = eVar.a;
        r0 r0Var = eVar.f;
        prz0Var.getClass();
        if (jl40.l(vrz0Var, vrz0.i)) {
            grz0Var = grz0.c;
        } else {
            Boolean bool2 = vrz0Var.a;
            int i = orz0.a[vrz0Var.b.ordinal()];
            if (i == 1) {
                tollRoadsAvailability = TollRoadsAvailability.ENABLED;
            } else if (i == 2) {
                tollRoadsAvailability = TollRoadsAvailability.DISABLED;
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                tollRoadsAvailability = TollRoadsAvailability.ENABLED_IF_ONLY_TOLLS;
            }
            grz0Var = new grz0(bool2, bool, tollRoadsAvailability);
        }
        if (jl40.l(grz0Var, grz0.c) || jl40.l((grz0) r0Var.getValue(), grz0Var)) {
            return;
        }
        Boolean bool3 = grz0Var.a;
        r0Var.l(grz0Var);
        Boolean bool4 = grz0Var.b;
        Boolean bool5 = Boolean.TRUE;
        boolean l = jl40.l(bool4, bool5);
        boolean z = !l;
        boolean l2 = jl40.l(bool3, bool5);
        boolean z2 = eVar.b() == RoadRestriction.NONE;
        if (!l && l2 && z2) {
            eVar.i.l(RoadRestriction.TOLL_ONLY);
            eVar.e(true, TollRoadSetReason.GOT_NEW_TOLL_ROADS);
            return;
        }
        moz0 moz0Var = eVar.b;
        moz0Var.getClass();
        com.yandex.go.analytics.b bVar = moz0Var.a;
        bVar.getClass();
        vug vugVar = new vug(bVar, "TollRoad.onGotNewTollRoads");
        vugVar.g("isTollRoadNotSelected", z);
        vugVar.g("isHasTolls", l2);
        vugVar.g("isNoRestrictions", z2);
        vugVar.m();
    }

    public final void e(g7j0 g7j0Var, ntj0 ntj0Var) {
        Boolean bool = g7j0Var.a.k;
        ru.yandex.taxi.preorder.tollroad.a aVar = this.d;
        aVar.getClass();
        r0 r0Var = aVar.b;
        Boolean bool2 = Boolean.TRUE;
        if (jl40.l(bool, bool2)) {
            r0Var.l(ntj0Var);
        } else if (jl40.l(bool, Boolean.FALSE)) {
            aVar.a.l(ntj0Var);
        }
        ntj0Var.getClass();
        if ((ntj0Var instanceof ktj0) && ((cwd) ((ktj0) ntj0Var).b).f && !jl40.l(bool, bool2)) {
            r0Var.l(ntj0Var);
        }
    }
}
