package com.yandex.go.mainscreen.superapp.impl.foundation.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1 ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1) {
            ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1 = (EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1) continuation;
            int i2 = ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                Zone zone = (Zone) obj;
                jst.e.getClass();
                com.yandex.go.route.interactor.b bVar = this.b.a;
                Address h = bVar.c().h();
                if (h != null && jl40.l(h.getZoneName(), zone.a)) {
                    bVar.m(new ZoneAddress(h, zone), bVar.d());
                }
                ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.L$0 = null;
                ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.L$1 = null;
                ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.L$2 = null;
                ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.L$3 = null;
                ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.label = 1;
                return this.a.emit(zy11Var, ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1 = new EnsureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1(this, continuation);
        Object obj22 = ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ensureZoneInSourceAddressInteractor$ensureZoneInSourceAddress$$inlined$map$2$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
