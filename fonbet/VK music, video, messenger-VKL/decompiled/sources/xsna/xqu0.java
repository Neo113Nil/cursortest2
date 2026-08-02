package xsna;

import android.view.View;
import com.vk.core.view.components.paging.list.VkErrorView;
import xsna.qtl;

/* compiled from: VkErrorViewConfiguration.kt */
/* loaded from: classes17.dex */
public final class xqu0 implements qtl {
    public final jwp b;

    public xqu0(jwp jwpVar) {
        this.b = jwpVar;
    }

    @Override // xsna.gxp
    public final by2 c(Throwable th) {
        qtl.k7.getClass();
        return qtl.a.b;
    }

    @Override // xsna.qtl
    public final void d(View view, Throwable th, gzs<s3q0> gzsVar) {
        if (view instanceof VkErrorView) {
            ((VkErrorView) view).c(this.b.provide());
        }
    }
}
