package xsna;

import android.view.View;

/* compiled from: VkEmptyViewConfiguration.kt */
/* loaded from: classes17.dex */
public final class vqu0 implements ptl {
    public final vgp b;

    public vqu0(vgp vgpVar) {
        this.b = vgpVar;
    }

    @Override // xsna.whp
    public final String a() {
        return "";
    }

    @Override // xsna.ptl
    public final void i(View view) {
        if (view instanceof uqu0) {
            ((uqu0) view).a(this.b.provide());
        }
    }
}
