package com.yandex.go.mainscreen.superapp.impl.currentaddress;

import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import defpackage.cob0;
import defpackage.hxx;
import defpackage.jqr;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.sy60;
import defpackage.umb0;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements sls {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        c cVar = this.a;
        ((umb0) cVar.L).b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.SUGGEST);
        com.yandex.go.pickup_from_photo.navigation.c cVar2 = (com.yandex.go.pickup_from_photo.navigation.c) cVar.K.get();
        pzt0 pzt0Var = cVar.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cVar.M = e.H(cVar.o(), new jqr(e.c(cVar2.M.a), new CurrentAddressSearchModalViewRouter$openPickupFromPhoto$1(cVar, null), 3));
        cVar.E(cVar2, new cob0(PickupFromPhotoPayload$Origin.SUGGEST, true), sy60.Q2, hxx.a);
        return zy11.a;
    }
}
