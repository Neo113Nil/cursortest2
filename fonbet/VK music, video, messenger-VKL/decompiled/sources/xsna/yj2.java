package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vungle.ads.internal.protos.Sdk;
import xsna.wv30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yj2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ yj2(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        bwp0 bwp0Var;
        switch (this.b) {
            case 0:
                oio.V1((oio) obj, this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return s3q0.a;
            case 1:
                ipm ipmVar = (ipm) obj;
                return new wv30.a((Dialog) ipmVar.a.c.get(Long.valueOf(this.c)), ipmVar.b);
            default:
                long j = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM ugc_chat_settings WHERE chat_id = ?");
                try {
                    V0.bindLong(1, j);
                    int k = egi.k(V0, "chat_id");
                    int k2 = egi.k(V0, "isHiddenInKb");
                    int k3 = egi.k(V0, "isHiddenEverywhere");
                    int k4 = egi.k(V0, "needToShowOnboarding");
                    int k5 = egi.k(V0, "isEditBanned");
                    int k6 = egi.k(V0, "canEdit");
                    int k7 = egi.k(V0, "canHide");
                    if (V0.step()) {
                        bwp0Var = new bwp0(V0.getLong(k), ((int) V0.getLong(k2)) != 0, ((int) V0.getLong(k3)) != 0, ((int) V0.getLong(k4)) != 0, ((int) V0.getLong(k5)) != 0, ((int) V0.getLong(k6)) != 0, ((int) V0.getLong(k7)) != 0);
                    } else {
                        bwp0Var = null;
                    }
                    return bwp0Var;
                } finally {
                    V0.close();
                }
        }
    }
}
