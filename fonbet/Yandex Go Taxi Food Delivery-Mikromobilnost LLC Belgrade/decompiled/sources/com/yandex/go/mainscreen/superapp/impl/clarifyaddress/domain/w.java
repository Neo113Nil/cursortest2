package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.ButtonsAlignment;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import defpackage.avj0;
import defpackage.evu0;
import defpackage.f4w0;
import defpackage.g4w0;
import defpackage.jjc0;
import defpackage.jl40;
import defpackage.kjc0;
import defpackage.kw11;
import defpackage.kyh0;
import defpackage.lwz0;
import defpackage.mjc0;
import defpackage.mwz0;
import defpackage.nfh;
import defpackage.njc0;
import defpackage.nwz0;
import defpackage.ny61;
import defpackage.o00;
import defpackage.ojc0;
import defpackage.owz0;
import defpackage.pjc0;
import defpackage.pv0;
import defpackage.pwz0;
import defpackage.tig0;
import defpackage.tls;
import defpackage.vpr;
import defpackage.w27;
import defpackage.w511;
import defpackage.wju;
import defpackage.x27;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class w implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ tig0 c;

    public w(vpr vprVar, tls tlsVar, tig0 tig0Var) {
        this.a = vprVar;
        this.b = tlsVar;
        this.c = tig0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1 superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1;
        int i;
        pjc0 kjc0Var;
        Address address;
        NearestZoneResponse nearestZoneResponse;
        g4w0 g4w0Var;
        if (continuation instanceof SuperAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1) {
            superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1 = (SuperAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1) continuation;
            int i2 = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pwz0 pwz0Var = (pwz0) obj;
                    boolean booleanValue = ((Boolean) this.b.invoke(pwz0Var)).booleanValue();
                    Object obj3 = f4w0.a;
                    if (booleanValue) {
                        nfh nfhVar = (nfh) this.c.b;
                        zuj0 zuj0Var = (zuj0) nfhVar.a;
                        zuj0 zuj0Var2 = (zuj0) nfhVar.a;
                        boolean l = jl40.l(pwz0Var, nwz0.a);
                        jjc0 jjc0Var = jjc0.a;
                        if (l) {
                            g4w0Var = new g4w0(nfhVar.s(), new o00(new x27(((avj0) zuj0Var2).h(kyh0.enter_address), jjc0Var), new x27(((avj0) zuj0Var).h(kyh0.location_sharing_dialog_confirm), ojc0.a), ButtonsAlignment.HORIZONTAL), pwz0Var);
                        } else if (jl40.l(pwz0Var, mwz0.a)) {
                            g4w0Var = new g4w0(nfhVar.s(), new o00(new x27(((avj0) zuj0Var2).h(kyh0.enter_address), jjc0Var), new x27(((avj0) zuj0Var).h(kyh0.superapp_main_to_settings), mjc0.a), ButtonsAlignment.HORIZONTAL), pwz0Var);
                        } else if (pwz0Var instanceof owz0) {
                            owz0 owz0Var = (owz0) pwz0Var;
                            kw11 kw11Var = owz0Var.a;
                            pv0 pv0Var = (pv0) ((ru.yandex.taxi.search.suggest.i) nfhVar.b).i().orElse(null);
                            String str = kw11Var != null ? kw11Var.a : null;
                            if (str == null) {
                                str = (pv0Var == null || (nearestZoneResponse = pv0Var.d) == null) ? null : nearestZoneResponse.a();
                                if (str == null) {
                                    String q0 = (pv0Var == null || (address = pv0Var.a) == null) ? null : address.q0();
                                    if (q0 == null) {
                                        q0 = ((avj0) zuj0Var).h(kyh0.address_region_not_supported_default_prefix);
                                    }
                                    str = String.format(((avj0) zuj0Var).h(kyh0.address_region_not_supported), Arrays.copyOf(new Object[]{q0}, 1));
                                }
                            }
                            avj0 avj0Var = (avj0) zuj0Var;
                            wju wjuVar = new wju(str, avj0Var.h(kyh0.try_change_the_address), jjc0Var);
                            String str2 = kw11Var != null ? kw11Var.e : null;
                            String str3 = kw11Var != null ? kw11Var.d : null;
                            if (str2 == null || evu0.J(str2) || str3 == null || evu0.J(str3)) {
                                str2 = avj0Var.h(kyh0.enter_address);
                                kjc0Var = new kjc0(str);
                            } else {
                                kjc0Var = new njc0(str3);
                            }
                            obj3 = new g4w0(wjuVar, new o00(new x27(str2, kjc0Var), w27.a, ButtonsAlignment.VERTICAL), owz0Var);
                        } else if (!jl40.l(pwz0Var, lwz0.a)) {
                            w511.b();
                            return null;
                        }
                        obj3 = g4w0Var;
                    }
                    superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.L$0 = null;
                    superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.L$1 = null;
                    superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.L$2 = null;
                    superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.L$3 = null;
                    superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1 = new SuperAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppTopPlaquesReasonsInteractor$listenToTopPlaques$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
