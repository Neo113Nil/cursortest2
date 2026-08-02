package com.yandex.go.pickup_from_photo.presentation;

import com.yandex.go.pickup_from_photo.data.PickupFromPhotoGyroscopeRepository;
import com.yandex.go.pickup_from_photo.domain.f;
import defpackage.jey;
import defpackage.job0;
import defpackage.jq80;
import defpackage.jqr;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.xnb0;
import defpackage.znb0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class c extends jey {
    public final /* synthetic */ job0 a;
    public final /* synthetic */ xnb0 b;

    public c(job0 job0Var, xnb0 xnb0Var) {
        this.a = job0Var;
        this.b = xnb0Var;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        job0 job0Var = this.a;
        job0Var.F = e.H(job0Var.Jg(), new j0(null, new jqr(job0Var.A.b(), new PickupFromPhotoPresenter$attachView$1$onStart$1(2, this.b, znb0.class, "render", "render(Lcom/yandex/go/pickup_from_photo/presentation/PickupFromPhotoUiState;)V", 4), 3), new PickupFromPhotoPresenter$attachView$1$onStart$2(job0Var, null)));
        PickupFromPhotoGyroscopeRepository pickupFromPhotoGyroscopeRepository = job0Var.D;
        pickupFromPhotoGyroscopeRepository.startListening(new jq80(3));
        tje.N(job0Var.Jg(), null, null, new PickupFromPhotoPresenter$start$1(job0Var, null), 3);
        f fVar = job0Var.A;
        job0Var.G = e.H(job0Var.Jg(), new jqr(e.t(new m0(e.t(new m0(fVar.b(), pickupFromPhotoGyroscopeRepository.observeOrientation(), new PickupFromPhotoPresenter$needShowPitchHintFlow$1(job0Var, null))), e.t(new m0(e.t(new j0(null, fVar.b(), new PickupFromPhotoPresenter$needShowAzimuthHintFlow$1(job0Var, null))), pickupFromPhotoGyroscopeRepository.observeOrientation(), new PickupFromPhotoPresenter$needShowAzimuthHintFlow$2(job0Var, null))), new PickupFromPhotoPresenter$orientationHintFlow$1(3, null))), new PickupFromPhotoPresenter$start$2(job0Var, null), 3));
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        job0 job0Var = this.a;
        pzt0 pzt0Var = job0Var.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        job0Var.F = null;
        pzt0 pzt0Var2 = job0Var.G;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        job0Var.G = null;
        this.b.a.stopCamera();
        job0Var.D.stopListening();
    }
}
