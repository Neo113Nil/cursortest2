package com.ybsdk.feature.kyc.internal.screens.photo;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.epx;
import defpackage.onx;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zmg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoFragment$getViewBinding$1$4 extends FunctionReferenceImpl implements sls {
    public KycPhotoFragment$getViewBinding$1$4(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onStatusViewPrimaryButtonClick", "onStatusViewPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        zmg zmgVar = zmg.h;
        AppAnalyticsReporter appAnalyticsReporter = bVar.I;
        KycStatus kycStatus = ((onx) bVar.X()).b;
        int i = kycStatus == null ? -1 : epx.a[kycStatus.ordinal()];
        if (i == 1) {
            appAnalyticsReporter.F.a.a("kyc_online.geo.click.access", null);
            bVar.Z(zmgVar);
        } else if (i != 2) {
            appAnalyticsReporter.F.a.a("kyc_online.error.photo.camera_access.click.to_setting", null);
            bVar.Z(zmg.g);
        } else {
            appAnalyticsReporter.F.a.a("kyc_online.geo_second.click.access", null);
            bVar.Z(zmgVar);
        }
        return zy11.a;
    }
}
