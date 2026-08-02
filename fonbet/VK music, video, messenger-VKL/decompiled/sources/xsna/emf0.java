package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class emf0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ emf0(long j, kg50 kg50Var) {
        this.c = j;
        this.d = kg50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                int i2 = RedesignedClipsTopBar.N;
                return ((kw8) obj).c(new zya(this.c, (kg50) obj2));
            default:
                hwp0 hwp0Var = (hwp0) obj2;
                Boolean bool = (Boolean) obj;
                iwp0 iwp0Var = hwp0Var.c;
                long j = this.c;
                UGCChatSettingsModel a = iwp0Var.a(j);
                if (a == null) {
                    a = new UGCChatSettingsModel(j, false, false, false, false, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
                }
                if (!bool.booleanValue()) {
                    return a;
                }
                UGCChatSettingsModel zb = UGCChatSettingsModel.zb(a, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                hwp0Var.g(zb);
                return zb;
        }
    }

    public /* synthetic */ emf0(hwp0 hwp0Var, long j) {
        this.d = hwp0Var;
        this.c = j;
    }
}
