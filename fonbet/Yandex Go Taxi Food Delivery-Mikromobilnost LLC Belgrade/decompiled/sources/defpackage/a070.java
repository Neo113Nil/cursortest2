package defpackage;

import com.yandex.plus.webview.internal.contract.impl.loading.b;

/* loaded from: classes2.dex */
public final class a070 extends b {
    public long e;

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void e(swh swhVar) {
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void f() {
        this.d = x85.a;
        this.e = Long.MIN_VALUE;
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void g() {
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void i(String str) {
        if (this.d.equals(w85.a)) {
            d(System.currentTimeMillis() - this.e <= this.a);
        }
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.b
    public final void j(String str) {
        this.e = System.currentTimeMillis();
        b();
    }
}
