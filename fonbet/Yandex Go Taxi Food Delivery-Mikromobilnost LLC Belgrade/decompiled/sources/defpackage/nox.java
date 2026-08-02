package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kyc.internal.interactor.a;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Params;
import com.ybsdk.feature.kyc.internal.screens.photov2.b;

/* loaded from: classes3.dex */
public final class nox implements hox {
    public final w3i a;

    public nox(w3i w3iVar) {
        this.a = w3iVar;
    }

    public final b a(KycPhotoV2Params kycPhotoV2Params) {
        w3i w3iVar = this.a;
        return new b(kycPhotoV2Params, (tfl0) ((u1g) w3iVar.b).get(), (Context) ((u1g) w3iVar.c).get(), (a) ((prq) w3iVar.w).get(), (opx) ((u1g) w3iVar.x).get(), (g5) ((u1g) w3iVar.y).get(), (AppAnalyticsReporter) ((u1g) w3iVar.z).get(), (df6) ((xvf0) w3iVar.A).get(), (vox) ((xvf0) w3iVar.B).get());
    }
}
