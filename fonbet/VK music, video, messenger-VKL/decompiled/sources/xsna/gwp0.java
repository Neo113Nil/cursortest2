package xsna;

import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gwp0 implements izs {
    public final /* synthetic */ hwp0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ gwp0(hwp0 hwp0Var, long j, boolean z) {
        this.b = hwp0Var;
        this.c = j;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        hwp0 hwp0Var = this.b;
        iwp0 iwp0Var = hwp0Var.c;
        long j = this.c;
        UGCChatSettingsModel a = iwp0Var.a(j);
        if (a == null) {
            a = new UGCChatSettingsModel(j, false, false, false, false, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
        }
        if (!bool.booleanValue()) {
            return a;
        }
        UGCChatSettingsModel zb = UGCChatSettingsModel.zb(a, !this.d, 125);
        hwp0Var.g(zb);
        return zb;
    }
}
