package com.ybsdk.feature.kyc.internal.screens.photo;

import com.ybsdk.core.permissions.RequestPermissionResult;
import defpackage.ds31;
import defpackage.qya0;
import defpackage.tje;

/* loaded from: classes3.dex */
public final class a implements qya0 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.qya0
    public final void c(RequestPermissionResult requestPermissionResult) {
        boolean isGranted = requestPermissionResult.getIsGranted();
        b bVar = this.a;
        if (isGranted) {
            tje.N(ds31.a(bVar), null, null, new KycPhotoViewModel$onLocationPermissionStatusChange$1(bVar, null), 3);
        } else {
            bVar.o0();
        }
    }

    @Override // defpackage.qya0
    public final void d() {
    }

    @Override // defpackage.qya0
    public final void e() {
    }

    @Override // defpackage.qya0
    public final void f() {
    }
}
