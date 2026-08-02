package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kyc.internal.interactor.a;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoParams;
import com.ybsdk.feature.kyc.internal.screens.photo.b;

/* loaded from: classes3.dex */
public final class fpx implements yox {
    public final w3i a;

    public fpx(w3i w3iVar) {
        this.a = w3iVar;
    }

    public final b a(KycPhotoParams kycPhotoParams) {
        w3i w3iVar = this.a;
        return new b(kycPhotoParams, (tfl0) ((u1g) w3iVar.b).get(), (Context) ((u1g) w3iVar.c).get(), (a) ((prq) w3iVar.w).get(), (opx) ((u1g) w3iVar.x).get(), (ybz) ((u1g) w3iVar.y).get(), (g5) ((u1g) w3iVar.z).get(), (AppAnalyticsReporter) ((u1g) w3iVar.A).get(), (mpx) ((ef6) w3iVar.B).get());
    }
}
