package xsna;

import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.internal.utils.analytics.MiniAppEntryPoint;
import java.util.Map;
import xsna.svv0;

/* compiled from: VkUiDataProvider.kt */
/* loaded from: classes6.dex */
public final class rwv0 implements tvv0 {
    public final svv0.b a;
    public String b;

    public rwv0(svv0.b bVar) {
        this.a = bVar;
        MiniAppEntryPoint miniAppEntryPoint = MiniAppEntryPoint.UNKNOWN;
    }

    @Override // xsna.tvv0
    public final String a() {
        return this.b;
    }

    @Override // xsna.tvv0
    public final String c() {
        return this.a.a;
    }

    @Override // xsna.tvv0
    public final boolean f() {
        return false;
    }

    @Override // xsna.tvv0
    public final boolean g() {
        return this.a.c;
    }

    @Override // xsna.tvv0
    public final long getAppId() {
        return this.a.b;
    }

    @Override // xsna.tvv0
    public final svv0 getData() {
        return this.a;
    }

    @Override // xsna.tvv0
    public final boolean h() {
        return false;
    }

    @Override // xsna.tvv0
    public final String i() {
        String str = this.a.a;
        return str == null ? "" : str;
    }

    @Override // xsna.tvv0
    public final void j(String str) {
        this.b = str;
    }

    @Override // xsna.tvv0
    public final Map<String, String> k() {
        return this.a.e;
    }

    @Override // xsna.tvv0
    public final boolean l() {
        return this.a.f;
    }

    @Override // xsna.tvv0
    public final WebApiApplication m() {
        return null;
    }

    @Override // xsna.tvv0
    public final boolean n() {
        return this.a.d;
    }

    @Override // xsna.tvv0
    public final WebAdConfig o() {
        return this.a.h;
    }

    @Override // xsna.tvv0
    public final Long y() {
        return null;
    }

    @Override // xsna.tvv0
    public final void p(yeq0 yeq0Var) {
    }
}
