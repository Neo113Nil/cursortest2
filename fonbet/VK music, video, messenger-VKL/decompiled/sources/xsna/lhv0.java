package xsna;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.oauth.sber.VkSberBaseActivity;
import com.vk.toggle.anonymous.SakFeatures;
import xsna.eo70;

/* compiled from: VkSberVerificationManager.kt */
/* loaded from: classes4.dex */
public final class lhv0 implements jhv0 {
    public final m2h0 a;
    public uf7 b;
    public String c;

    public lhv0(m2h0 m2h0Var) {
        this.a = m2h0Var;
    }

    @Override // xsna.jhv0
    public final eo70 a(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return new eo70.a();
        }
        String queryParameter = data.getQueryParameter("state");
        if (data.getQueryParameter("code") != null) {
            uf7 uf7Var = this.b;
            if (epx.f(queryParameter, uf7Var != null ? (String) uf7Var.a : null)) {
                String queryParameter2 = data.getQueryParameter("code");
                if (queryParameter2 == null) {
                    queryParameter2 = "";
                }
                String str = queryParameter2;
                String b = b();
                m2h0 m2h0Var = this.a;
                m2h0Var.getClass();
                return new eo70.e(str, b, SakFeatures.Type.SAK_SBER_ID_CLOUD.h() ? m2h0Var.c() : m2h0Var.b(), m2h0Var.a(), this.c);
            }
        }
        data.getQueryParameter("error");
        return new eo70.a();
    }

    @Override // xsna.jhv0
    public final String b() {
        uf7 uf7Var = this.b;
        String str = uf7Var != null ? (String) uf7Var.b : null;
        return str == null ? "" : str;
    }

    @Override // xsna.jhv0
    public final void c(VkSberBaseActivity vkSberBaseActivity, String str) {
        this.c = str;
        uf7 c = new eml(0).c();
        this.b = c;
        Uri.Builder encodedPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("id.sber.ru").encodedPath("CSAFront/oidc/authorize.do");
        encodedPath.appendQueryParameter(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "code");
        m2h0 m2h0Var = this.a;
        m2h0Var.getClass();
        encodedPath.appendQueryParameter("client_id", SakFeatures.Type.SAK_SBER_ID_CLOUD.h() ? m2h0Var.c() : m2h0Var.b());
        encodedPath.appendQueryParameter(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, m2h0Var.d());
        encodedPath.appendQueryParameter("nonce", str);
        encodedPath.appendQueryParameter("redirect_uri", m2h0Var.a());
        fo70.a(encodedPath, c);
        Uri build = encodedPath.build();
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(vkSberBaseActivity, build);
    }
}
