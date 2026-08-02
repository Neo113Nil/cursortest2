package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: VKCaptchaWebViewClient.kt */
/* loaded from: classes2.dex */
public final class vwy0 extends Lambda implements gzs<qoy0> {
    private /* synthetic */ hxy0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwy0(hxy0 hxy0Var) {
        super(0);
        this.a = hxy0Var;
    }

    @Override // xsna.gzs
    public final qoy0 invoke() {
        hxy0 hxy0Var = this.a;
        return new qoy0(hxy0Var.g, hxy0Var.h);
    }
}
