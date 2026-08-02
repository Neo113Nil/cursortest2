package xsna;

import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.log.L;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o46 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o46(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                r46 r46Var = (r46) this.d;
                L.i((Throwable) obj);
                r46Var.I(new UGCChatSettingsModel(this.c, false, false, false, false, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null));
                break;
            default:
                ((gkb) this.d).b.e(this.c, ((bdb) obj).i);
                break;
        }
        return s3q0.a;
    }
}
