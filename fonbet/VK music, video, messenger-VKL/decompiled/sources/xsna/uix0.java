package xsna;

import com.vk.billing.StorePurchasesManager;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import java.lang.ref.WeakReference;

/* compiled from: WebViewFragment.java */
/* loaded from: classes7.dex */
public final class uix0 implements StorePurchasesManager.a<mge0> {
    public final /* synthetic */ WeakReference b;
    public final /* synthetic */ pix0 c;
    public final /* synthetic */ WebViewFragment d;

    public uix0(WebViewFragment webViewFragment, WeakReference weakReference, pix0 pix0Var) {
        this.d = webViewFragment;
        this.b = weakReference;
        this.c = pix0Var;
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void a() {
        cvk.u(R.string.purchase_cancelled, false);
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void c(mge0 mge0Var, nge0 nge0Var) {
        WebViewFragment webViewFragment = this.d;
        webViewFragment.Mf(-1, null);
        webViewFragment.M0 = null;
        aeg0 aeg0Var = (aeg0) this.b.get();
        if (aeg0Var != null) {
            aeg0Var.yk(this.c);
        }
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void d(mge0 mge0Var) {
        cvk.u(R.string.error, false);
        this.d.M0 = null;
        aeg0 aeg0Var = (aeg0) this.b.get();
        if (aeg0Var != null) {
            aeg0Var.yk(this.c);
        }
    }

    @Override // com.vk.billing.StorePurchasesManager.a
    public final void b() {
    }
}
