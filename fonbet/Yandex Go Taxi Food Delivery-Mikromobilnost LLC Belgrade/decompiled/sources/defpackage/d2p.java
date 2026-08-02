package defpackage;

import com.yandex.go.external_service.view.ExternalServiceModalView;
import java.util.Map;

/* loaded from: classes12.dex */
public final class d2p implements r2p {
    public final /* synthetic */ ExternalServiceModalView a;

    public d2p(ExternalServiceModalView externalServiceModalView) {
        this.a = externalServiceModalView;
    }

    @Override // defpackage.rpc
    public final void r4(Map map) {
        q7w0 q7w0Var;
        q7w0Var = this.a.superAppWebViewFacade;
        q7w0Var.setCommonHeaders(map);
    }
}
