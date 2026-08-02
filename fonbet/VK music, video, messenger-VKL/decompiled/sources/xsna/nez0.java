package xsna;

import xsna.mez0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class nez0 implements fjz0 {
    public boolean b = false;
    public final /* synthetic */ mez0.f c;

    public nez0(mez0.f fVar) {
        this.c = fVar;
    }

    @Override // xsna.fjz0
    public final void a() {
        h8z0.e(this.c.a.a, "webviewShown", 2, null);
        gu8.c(null, "WebViewReachability: webview shown");
        this.b = true;
    }

    @Override // xsna.fjz0
    public final void b() {
        if (!this.b) {
            gu8.c(null, "WebViewReachability: !!! Rare bug occurred: call 'webview closed' without 'webview shown'");
        } else {
            h8z0.e(this.c.a.a, "webviewClosed", 2, null);
            gu8.c(null, "WebViewReachability: webview closed");
        }
    }

    @Override // xsna.fjz0
    public final void c() {
        h8z0.e(this.c.a.a, "pageLoadFailed", 2, null);
        gu8.c(null, "WebViewReachability: page load error");
    }

    @Override // xsna.fjz0
    public final void d() {
        h8z0.e(this.c.a.a, "pageLoaded", 2, null);
        gu8.c(null, "WebViewReachability: page loaded");
    }
}
