package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.contacts.Contact;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class idj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ idj(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Contact.zb((Contact) obj, null, false, null, Long.valueOf(this.c), 0L, 0L, 32511);
            default:
                final long j = this.c;
                return ((kw8) obj).c(new izs() { // from class: xsna.v840
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        oio.V1((oio) obj2, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                        return s3q0.a;
                    }
                });
        }
    }
}
