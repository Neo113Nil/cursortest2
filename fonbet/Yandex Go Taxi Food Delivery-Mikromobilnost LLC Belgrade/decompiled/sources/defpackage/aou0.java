package defpackage;

import com.yandex.plus.home.feature.webviews.internal.uri.b;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.yandex.plus.webview.api.WebViewContainer;
import java.util.List;
import kotlin.a;

/* loaded from: classes2.dex */
public final class aou0 extends d35 {
    public final cl41 u;
    public final i3y v;

    public aou0(boolean z, boolean z2, WebViewContainer webViewContainer, p3d0 p3d0Var, j2n j2nVar, sls slsVar, cl41 cl41Var, so41 so41Var, tls tlsVar, wls wlsVar, qq31 qq31Var, wls wlsVar2, ul60 ul60Var, b bVar, long j, zqc zqcVar, el41 el41Var, znu0 znu0Var, WebViewType webViewType, jse jseVar) {
        super(z, z2, webViewContainer, p3d0Var, j2nVar, slsVar, cl41Var, so41Var, tlsVar, wlsVar, qq31Var, null, wlsVar2, ul60Var, bVar, false, j, jseVar, 2048);
        this.u = cl41Var;
        this.v = a.a(new r8c0(znu0Var, zqcVar, el41Var, webViewType, 13));
    }

    @Override // defpackage.d35
    public final List j() {
        return scc.g((com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.v.getValue(), new bsd0(this.u));
    }
}
