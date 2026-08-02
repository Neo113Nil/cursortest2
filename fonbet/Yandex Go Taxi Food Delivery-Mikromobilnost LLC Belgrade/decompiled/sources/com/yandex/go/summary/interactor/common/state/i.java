package com.yandex.go.summary.interactor.common.state;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.bww0;
import defpackage.eow0;
import defpackage.ev4;
import defpackage.evu0;
import defpackage.f36;
import defpackage.fow0;
import defpackage.h36;
import defpackage.hhs0;
import defpackage.hlx0;
import defpackage.i36;
import defpackage.iww0;
import defpackage.jhu0;
import defpackage.jl40;
import defpackage.jww0;
import defpackage.kww0;
import defpackage.lww0;
import defpackage.mja1;
import defpackage.nrv0;
import defpackage.nvi0;
import defpackage.nww0;
import defpackage.ny61;
import defpackage.orv0;
import defpackage.prv0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wp2;
import defpackage.yp2;
import defpackage.yvw0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ hhs0 b;

    public i(vpr vprVar, hhs0 hhs0Var) {
        this.a = vprVar;
        this.b = hhs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1 surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        lww0 lww0Var;
        nww0 nww0Var;
        if (continuation instanceof SurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1) {
            surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1 = (SurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    prv0 prv0Var = (prv0) obj;
                    if (jl40.l(prv0Var, nrv0.a)) {
                        nww0Var = null;
                    } else {
                        if (!(prv0Var instanceof orv0)) {
                            w511.b();
                            return null;
                        }
                        jhu0 jhu0Var = (jhu0) this.b.b;
                        orv0 orv0Var = (orv0) prv0Var;
                        jhu0Var.getClass();
                        i36 i36Var = orv0Var.e;
                        hlx0 hlx0Var = orv0Var.a;
                        bww0 bww0Var = new bww0(jhu0.k((List) hlx0Var.c));
                        List list = (List) hlx0Var.w;
                        iww0 iww0Var = new iww0(jhu0.k(list));
                        ev4 ev4Var = (ev4) hlx0Var.x;
                        wp2 wp2Var = ev4Var.a;
                        float f = ev4Var.d;
                        nvi0 nvi0Var = ev4Var.b;
                        int i3 = nvi0Var == null ? 12 : 20;
                        if (nvi0Var == null) {
                            nvi0Var = mja1.b("", null, 6);
                        }
                        eow0 eow0Var = new eow0(bww0Var, new yvw0(wp2Var, f, i3, nvi0Var, (((List) hlx0Var.c).isEmpty() && list.isEmpty()) ? 64 : 40), iww0Var);
                        fow0 fow0Var = i36Var == null ? null : new fow0(new h36(i36Var.a, i36Var.g), new f36(i36Var.c, i36Var.h, i36Var.i));
                        wp2 a = ((yp2) jhu0Var.a).a((String) hlx0Var.y, AppColor$Palette.Background);
                        if (i36Var != null) {
                            String str = i36Var.f;
                            lww0Var = evu0.J(str) ? null : new jww0(str);
                        } else {
                            lww0Var = kww0.a;
                        }
                        lww0 lww0Var2 = lww0Var;
                        StringBuilder sb = new StringBuilder();
                        sb.append(orv0Var.b);
                        if (i36Var != null) {
                            String str2 = i36Var.c;
                            String str3 = i36Var.a;
                            if (!evu0.J(str3)) {
                                sb.append(Extension.FIX_SPACE.concat(str3));
                            }
                            if (!evu0.J(str2)) {
                                sb.append(Extension.FIX_SPACE.concat(str2));
                            }
                        }
                        nww0Var = new nww0(eow0Var, a, fow0Var, lww0Var2, sb.toString(), orv0Var.c);
                    }
                    surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(nww0Var, surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1 = new SurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
