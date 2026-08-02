package xsna;

import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.oauth.tinkoff.a;

/* compiled from: TinkoffWebAuthProvider.kt */
/* loaded from: classes4.dex */
public final class tyo0 implements syo0 {
    public final eml a;
    public final htk0<com.vk.oauth.tinkoff.a> b;
    public final gc4 c;
    public uf7 d;

    public tyo0(eml emlVar, htk0 htk0Var, gc4 gc4Var) {
        this.a = emlVar;
        this.b = htk0Var;
        this.c = gc4Var;
    }

    @Override // xsna.syo0
    public final void a(String str) {
        uf7 uf7Var = this.d;
        htk0<com.vk.oauth.tinkoff.a> htk0Var = this.b;
        if (uf7Var == null) {
            htk0Var.update(new a.b("Secure data is null."));
            return;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("code");
        String queryParameter2 = parse.getQueryParameter("state");
        if (queryParameter == null || queryParameter2 == null || !queryParameter2.equals((String) uf7Var.a)) {
            htk0Var.update(new a.b("Invalid data."));
        } else {
            htk0Var.update(new a.f(queryParameter, (String) uf7Var.b));
        }
    }

    @Override // xsna.syo0
    public final boolean start() {
        uf7 uf7Var;
        try {
            uf7Var = this.a.c();
        } catch (Exception unused) {
            uf7Var = new uf7("", "", "", "");
        }
        this.d = uf7Var;
        gc4 gc4Var = this.c;
        String c = gc4Var.c();
        String d = gc4Var.d();
        Uri.Builder buildUpon = Uri.parse("https://id.tbank.ru/auth/authorize").buildUpon();
        buildUpon.appendQueryParameter("client_id", c);
        buildUpon.appendQueryParameter(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "code");
        buildUpon.appendQueryParameter("redirect_uri", d);
        fo70.a(buildUpon, uf7Var);
        buildUpon.appendQueryParameter("response_mode", "query");
        this.b.update(new a.g(buildUpon.build()));
        return true;
    }
}
