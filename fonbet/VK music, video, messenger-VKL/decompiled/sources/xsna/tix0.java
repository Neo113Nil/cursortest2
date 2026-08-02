package xsna;

import android.annotation.TargetApi;
import com.vk.storycamera.screen.StoryCameraFragment;
import com.vkontakte.android.fragments.WebViewFragment;

/* compiled from: WebViewFragment.java */
/* loaded from: classes7.dex */
public final class tix0 implements gzs<s3q0> {
    public final /* synthetic */ WebViewFragment b;

    public tix0(WebViewFragment webViewFragment) {
        this.b = webViewFragment;
    }

    @Override // xsna.gzs
    @TargetApi(21)
    public final s3q0 invoke() {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a("", "");
        aVar.s();
        aVar.C = true;
        new StoryCameraFragment.a(aVar.a()).g(103, this.b);
        return s3q0.a;
    }
}
