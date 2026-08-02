package xsna;

import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.stickers.keyboard.StickersView;
import com.vungle.ads.internal.protos.Sdk;
import xsna.fwu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qdl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qdl0(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
        this.e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.disposables.c subscribe;
        switch (this.b) {
            case 0:
                ((StickersView) this.d).j(new UGCChatSettingsModel(this.c, false, false, false, false, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), (rdl0) this.e);
                return s3q0.a;
            default:
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                if (((Number) wh50Var.getValue()).intValue() == 0) {
                    subscribe = null;
                } else {
                    com.vk.core.utils.newtork.b.a.getClass();
                    subscribe = com.vk.core.utils.newtork.b.f().x0().t0(1L).L(new o860(new nom(this.c, wh50Var, 1), 15), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new epq0(new iyd0(wh50Var2, 22), 7));
                }
                return new fwu0.b(subscribe);
        }
    }
}
