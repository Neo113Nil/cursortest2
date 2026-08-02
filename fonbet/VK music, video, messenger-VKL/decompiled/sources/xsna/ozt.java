package xsna;

import android.webkit.WebView;
import com.vk.webapp.fragments.GiftsCatalogFragment;

/* compiled from: GiftsCatalogFragment.kt */
/* loaded from: classes7.dex */
public final class ozt extends WebView.VisualStateCallback {
    public final /* synthetic */ GiftsCatalogFragment a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public ozt(GiftsCatalogFragment giftsCatalogFragment, int i, int i2) {
        this.a = giftsCatalogFragment;
        this.b = i;
        this.c = i2;
    }

    @Override // android.webkit.WebView.VisualStateCallback
    public final void onComplete(long j) {
        GiftsCatalogFragment giftsCatalogFragment = this.a;
        if (!giftsCatalogFragment.isAdded() || giftsCatalogFragment.getView() == null) {
            return;
        }
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            int i3 = i + 1;
            WebView po = giftsCatalogFragment.po();
            if (po != null) {
                po.postVisualStateCallback(0L, new ozt(giftsCatalogFragment, i3, i2));
                return;
            }
            return;
        }
        WebView po2 = giftsCatalogFragment.po();
        if (po2 != null) {
            po2.setLayerType(2, null);
        }
        WebView po3 = giftsCatalogFragment.po();
        if (po3 != null) {
            po3.invalidate();
        }
        giftsCatalogFragment.b0 = false;
    }
}
