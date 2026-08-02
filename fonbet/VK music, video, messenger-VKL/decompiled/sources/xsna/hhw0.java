package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.fragments.WebViewFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class hhw0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hhw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((r6i0) obj2).invoke(obj);
                break;
            default:
                WebViewFragment webViewFragment = (WebViewFragment) obj2;
                Throwable th = (Throwable) obj;
                int i2 = WebViewFragment.O0;
                if (th instanceof VKApiExecutionException) {
                    j03.i(webViewFragment.requireContext(), (VKApiExecutionException) th);
                }
                webViewFragment.Mf(0, null);
                break;
        }
    }
}
