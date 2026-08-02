package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.List;
import xsna.bex0;

/* compiled from: JsAuthDelegate.kt */
/* loaded from: classes6.dex */
public final class h2y implements l1w0 {
    public final /* synthetic */ i2y a;
    public final /* synthetic */ long b;
    public final /* synthetic */ JsApiMethodType c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ x6y f;

    public h2y(i2y i2yVar, long j, JsApiMethodType jsApiMethodType, Long l, boolean z, x6y x6yVar) {
        this.a = i2yVar;
        this.b = j;
        this.c = jsApiMethodType;
        this.d = l;
        this.e = z;
        this.f = x6yVar;
    }

    @Override // xsna.l1w0
    public final void a(Throwable th) {
        this.f.z(this.c, th);
    }

    @Override // xsna.l1w0
    public final void b() {
        bex0.a.a(this.f, this.c, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
    }

    @Override // xsna.l1w0
    public final void c(List<String> list) {
        qro0.c(new e2y(this.b, this.c, this.d, list, this.a, true, this.e));
    }
}
