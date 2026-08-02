package com.ybsdk.feature.kyc.internal.screens.photo;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.ds31;
import defpackage.hnx;
import defpackage.inx;
import defpackage.jnx;
import defpackage.k5c;
import defpackage.l8x;
import defpackage.mdh;
import defpackage.onx;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tnx;
import defpackage.uc5;
import defpackage.uyj;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoFragment$getViewBinding$1$5 extends FunctionReferenceImpl implements sls {
    public KycPhotoFragment$getViewBinding$1$5(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onErrorPrimaryButtonClick", "onErrorPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        AppAnalyticsReporter appAnalyticsReporter = bVar.I;
        ArrayList arrayList = bVar.M;
        jnx jnxVar = ((onx) bVar.X()).a;
        if (jnxVar != null) {
            if (jnxVar instanceof inx) {
                appAnalyticsReporter.F.a.a("kyc_online.error.photo.download.click.again", null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l8x) it.next()).a(null);
                }
                arrayList.clear();
                if (bVar.L.isEmpty()) {
                    bVar.p0();
                } else {
                    for (tnx tnxVar : bVar.L) {
                        k5c a = ds31.a(bVar);
                        sjh sjhVar = uyj.a;
                        arrayList.add(tje.N(a, mdh.b, null, new KycPhotoViewModel$uploadPhoto$job$1(bVar, tnxVar, null), 2));
                    }
                    bVar.c0();
                }
            } else {
                if (!(jnxVar instanceof hnx)) {
                    w511.b();
                    return null;
                }
                appAnalyticsReporter.F.a.a("kyc_online.error.photo.no_camera.click.good", null);
                bVar.C.e();
            }
        }
        return zy11.a;
    }
}
