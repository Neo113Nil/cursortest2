package xsna;

import android.net.Uri;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.Map;
import xsna.svv0;

/* compiled from: VkUiDataProvider.kt */
/* loaded from: classes6.dex */
public final class zuv0 implements tvv0 {
    public svv0.a a;
    public yeq0 b;
    public String c;

    @Override // xsna.tvv0
    public final String a() {
        return this.c;
    }

    @Override // xsna.tvv0
    public final String c() {
        return this.a.b;
    }

    @Override // xsna.tvv0
    public final boolean f() {
        return this.a.a.u;
    }

    @Override // xsna.tvv0
    public final boolean g() {
        return false;
    }

    @Override // xsna.tvv0
    public final long getAppId() {
        return this.a.a.b;
    }

    @Override // xsna.tvv0
    public final svv0 getData() {
        return this.a;
    }

    @Override // xsna.tvv0
    public final boolean h() {
        return this.a.a.f();
    }

    @Override // xsna.tvv0
    public final String i() {
        String str;
        WebApiApplication webApiApplication = this.a.a;
        String str2 = webApiApplication.C;
        yeq0 yeq0Var = this.b;
        String str3 = yeq0Var != null ? yeq0Var.a : null;
        if (str2 != null && str3 != null && !drm0.N(str3)) {
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            buildUpon.fragment(str3);
            return buildUpon.build().toString();
        }
        if (str2 != null) {
            return str2;
        }
        String str4 = "";
        if (webApiApplication.z != 0) {
            str = BundleUtil.UNDERLINE_TAG + webApiApplication.z;
        } else {
            str = "";
        }
        if (str3 != null && !drm0.N(str3)) {
            str4 = "#".concat(str3);
        }
        return "https://" + a0a.d + "/app" + webApiApplication.b + str + str4;
    }

    @Override // xsna.tvv0
    public final void j(String str) {
        this.c = str;
    }

    @Override // xsna.tvv0
    public final Map<String, String> k() {
        return null;
    }

    @Override // xsna.tvv0
    public final boolean l() {
        return this.a.h;
    }

    @Override // xsna.tvv0
    public final WebApiApplication m() {
        return this.a.a;
    }

    @Override // xsna.tvv0
    public final boolean n() {
        return false;
    }

    @Override // xsna.tvv0
    public final WebAdConfig o() {
        return null;
    }

    @Override // xsna.tvv0
    public final void p(yeq0 yeq0Var) {
        this.b = yeq0Var;
    }

    @Override // xsna.tvv0
    public final Long y() {
        return this.a.d;
    }
}
