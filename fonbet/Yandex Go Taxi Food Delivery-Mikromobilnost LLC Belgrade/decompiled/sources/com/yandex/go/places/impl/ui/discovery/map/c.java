package com.yandex.go.places.impl.ui.discovery.map;

import defpackage.ike;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d dVar = this.a;
        if (booleanValue) {
            pzt0 pzt0Var = dVar.f0;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            dVar.f0 = dVar.P.a((ike) dVar.Jg());
            pzt0 pzt0Var2 = dVar.e0;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            dVar.e0 = tje.N(dVar.Jg(), null, null, new PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$$inlined$safeCollectIn$1(e.X(e.t(new m0(dVar.J.b(), e.t(new com.yandex.go.places.impl.domain.interactors.discovery.map.c(new com.yandex.go.superapp.discovery.map.impl.data.repositories.common.b(e.c(dVar.L.a.a)))), new PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$1(3, null))), new PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$2(dVar, null)), null, dVar), 3);
            ru.yandex.yandexmaps.multiplatform.pin.war.c cVar = dVar.b0.a;
            if (cVar != null) {
                cVar.q();
            }
        } else {
            pzt0 pzt0Var3 = dVar.f0;
            if (pzt0Var3 != null) {
                pzt0Var3.a(null);
            }
            dVar.f0 = null;
            pzt0 pzt0Var4 = dVar.e0;
            if (pzt0Var4 != null) {
                pzt0Var4.a(null);
            }
            dVar.e0 = null;
            ru.yandex.yandexmaps.multiplatform.pin.war.c cVar2 = dVar.b0.a;
            if (cVar2 != null) {
                cVar2.g();
            }
        }
        return zy11.a;
    }
}
