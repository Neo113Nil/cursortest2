package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.fragment.common.WebViewFragment;

/* loaded from: classes14.dex */
public final class may implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewFragment b;

    public /* synthetic */ may(WebViewFragment webViewFragment, int i) {
        this.a = i;
        this.b = webViewFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        WebViewFragment webViewFragment = this.b;
        switch (i) {
            case 0:
                rsx0 rsx0Var = (rsx0) obj;
                if (!(rsx0Var instanceof qsx0)) {
                    if (!(rsx0Var instanceof psx0)) {
                        w511.b();
                        break;
                    } else {
                        webViewFragment.showUnsupportedZone(((psx0) rsx0Var).a);
                    }
                } else {
                    webViewFragment.loadUrl(((qsx0) rsx0Var).a);
                }
                break;
            default:
                oe90 oe90Var = (oe90) obj;
                if (!(oe90Var instanceof ne90)) {
                    if (!(oe90Var instanceof me90)) {
                        w511.b();
                        break;
                    } else {
                        webViewFragment.showUnsupportedZone(((me90) oe90Var).a);
                    }
                } else {
                    webViewFragment.loadUrl(((ne90) oe90Var).a);
                }
                break;
        }
        return null;
    }
}
