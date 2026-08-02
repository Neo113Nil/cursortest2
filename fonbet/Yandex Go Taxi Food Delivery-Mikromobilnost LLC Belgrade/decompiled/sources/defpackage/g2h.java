package defpackage;

import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class g2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5f0 b;

    public /* synthetic */ g2h(g5f0 g5f0Var, int i) {
        this.a = i;
        this.b = g5f0Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        EmptyList emptyList = EmptyList.a;
        g5f0 g5f0Var = this.b;
        switch (i) {
            case 0:
                if (baseDeeplinkAction instanceof DeeplinkAction.OpenProAcquireCard) {
                    g5f0Var.b.g(d5f0.a);
                    break;
                }
                break;
            default:
                if (baseDeeplinkAction instanceof DeeplinkAction.SendProOpenScreenRequest) {
                    g5f0Var.b.g(new e5f0(((DeeplinkAction.SendProOpenScreenRequest) baseDeeplinkAction).getDeeplink()));
                    break;
                }
                break;
        }
        return new v0h(emptyList, null, 6);
    }
}
