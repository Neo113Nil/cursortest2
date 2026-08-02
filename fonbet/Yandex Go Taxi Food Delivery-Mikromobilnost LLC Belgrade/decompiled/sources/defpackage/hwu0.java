package defpackage;

import java.util.Map;

/* loaded from: classes12.dex */
public final class hwu0 implements s2p {
    public static final hwu0 a = new hwu0();

    public static void q(String str) {
        xby.t(jst.e, "SUPERAPP:EXTERNAL_SERVICE:NAVIGATOR", null, "StubNavigator. Not implemented ".concat(str), 6);
    }

    @Override // defpackage.s2p
    public final void a(sls slsVar, sls slsVar2) {
        q("requestAuthorization");
    }

    @Override // defpackage.s2p
    public final void b(h1p h1pVar, w6a0 w6a0Var, vdn vdnVar) {
        q("showPaymentMethodList");
    }

    @Override // defpackage.s2p
    public final void c(String str) {
        q("defaultCall");
    }

    @Override // defpackage.s2p
    public final void close() {
        q("close");
    }

    @Override // defpackage.s2p
    public final void d(String str) {
        q("openUrlInWebView");
    }

    @Override // defpackage.s2p
    public final void e(h1p h1pVar, o8w0 o8w0Var, gcn gcnVar) {
        q("openSuperProfile");
    }

    @Override // defpackage.s2p
    public final void f(h1p h1pVar) {
        q("openOrders");
    }

    @Override // defpackage.s2p
    public final void g(emu0 emu0Var, wew0 wew0Var) {
        q("openStories");
    }

    @Override // defpackage.s2p
    public final void h(ew51 ew51Var, gcn gcnVar) {
        q("openYb");
    }

    @Override // defpackage.s2p
    public final void i(h1p h1pVar, qxx0 qxx0Var) {
        q("openPlus");
    }

    @Override // defpackage.s2p
    public final void j(hkv hkvVar, String str, gcn gcnVar) {
        q("openCallSelectRouter");
    }

    @Override // defpackage.s2p
    public final void k(Map map, gcn gcnVar) {
        q("openCharity");
    }

    @Override // defpackage.s2p
    public final void l(h1p h1pVar, String str, gcn gcnVar) {
        q("openSupport");
    }

    @Override // defpackage.s2p
    public final boolean m() {
        q("isLaunched");
        return false;
    }

    @Override // defpackage.s2p
    public final void n(rfn rfnVar) {
        q("openChat");
    }

    @Override // defpackage.s2p
    public final void o(h1p h1pVar, a90 a90Var) {
        q("addCard");
    }

    @Override // defpackage.s2p
    public final void p() {
        q("hideWebViewCard");
    }
}
