package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.oauth.tinkoff.a;
import com.vk.superapp.verification.account.VerificationFlow;
import java.util.Iterator;

/* compiled from: App2AppAuthProvider.kt */
/* loaded from: classes4.dex */
public final class z03 implements syo0 {
    public final Context a;
    public final htk0<com.vk.oauth.tinkoff.a> b;
    public final gc4 c;
    public final eml d;
    public final VerificationFlow e;
    public uf7 f;

    public z03(Context context, htk0 htk0Var, gc4 gc4Var, eml emlVar, VerificationFlow verificationFlow) {
        this.a = context;
        this.b = htk0Var;
        this.c = gc4Var;
        this.d = emlVar;
        this.e = verificationFlow;
    }

    @Override // xsna.syo0
    public final void a(String str) {
        uf7 uf7Var = this.f;
        htk0<com.vk.oauth.tinkoff.a> htk0Var = this.b;
        if (uf7Var == null) {
            htk0Var.update(new a.b("Secure data is null."));
            return;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("auth_status_code");
        String queryParameter2 = parse.getQueryParameter("code");
        if (!epx.f(queryParameter, "success") || queryParameter2 == null || drm0.N(queryParameter2)) {
            htk0Var.update(a.C1443a.a);
        } else {
            htk0Var.update(new a.f(queryParameter2, (String) uf7Var.b));
        }
    }

    @Override // xsna.syo0
    public final boolean start() {
        VerificationFlow verificationFlow = this.e;
        VerificationFlow.App2App app2App = null;
        if (verificationFlow instanceof VerificationFlow.App2App) {
            VerificationFlow.App2App app2App2 = (VerificationFlow.App2App) verificationFlow;
            if (!app2App2.b.isEmpty()) {
                app2App = app2App2;
            }
        }
        if (app2App == null) {
            return false;
        }
        try {
            uf7 c = this.d.c();
            this.f = c;
            Iterator<String> it = app2App.b.iterator();
            while (it.hasNext()) {
                Uri.Builder buildUpon = Uri.parse(it.next()).buildUpon();
                fo70.a(buildUpon, c);
                gc4 gc4Var = this.c;
                buildUpon.appendQueryParameter("redirect_uri", gc4Var.d());
                buildUpon.appendQueryParameter("callback_url", gc4Var.d());
                buildUpon.appendQueryParameter("clientId", gc4Var.c());
                Context context = this.a;
                buildUpon.appendQueryParameter("package_name", context.getPackageName());
                try {
                    context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, buildUpon.build()).addCategory("android.intent.category.BROWSABLE").addFlags(268435456).addFlags(1024));
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }
}
