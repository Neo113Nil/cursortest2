package defpackage;

import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes10.dex */
public final class e7x extends c7x {
    public final JsReplyProxyBoundaryInterface a;

    public e7x(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.a = jsReplyProxyBoundaryInterface;
    }

    @Override // defpackage.c7x
    public final void a(String str) {
        if (!qp41.I.a()) {
            throw qp41.a();
        }
        this.a.postMessage(str);
    }

    @Override // defpackage.c7x
    public final void b(byte[] bArr) {
        if (!qp41.u.a()) {
            throw qp41.a();
        }
        this.a.postMessageWithPayload(new di6(new jh41(bArr)));
    }
}
