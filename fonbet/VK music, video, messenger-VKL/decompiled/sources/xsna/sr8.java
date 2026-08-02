package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.js.bridge.events.AddToCommunity$Response;
import com.vk.superapp.js.bridge.events.EventNames;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sr8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sr8(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((tr8) this.d).E.a(this.c, null);
                break;
            default:
                yuv0 yuv0Var = (yuv0) this.d;
                yuv0Var.b.s(EventNames.AddToCommunity, new AddToCommunity$Response(null, new AddToCommunity$Response.Data(this.c, null, 2, null), 1, null));
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(yuv0Var.a.getString(R.string.vk_apps_app_added_to_community));
                break;
        }
        return s3q0.a;
    }
}
