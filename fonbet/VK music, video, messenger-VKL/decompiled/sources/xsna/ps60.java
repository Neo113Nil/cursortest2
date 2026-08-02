package xsna;

import com.google.android.gms.tasks.Task;
import com.vk.web.view.marker.di.WebViewMarkerComponent;
import com.vkontakte.android.fragments.WebViewFragment;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ps60 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ps60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ((ss60) this.c).b.getClass();
                return Boolean.valueOf(ce60.m());
            case 1:
                return m4s.n((Task) this.c);
            case 2:
                qyo0 qyo0Var = (qyo0) this.c;
                return qyo0Var.a(qyo0Var.b);
            default:
                WebViewMarkerComponent webViewMarkerComponent = (WebViewMarkerComponent) j6i.c(((WebViewFragment) this.c).K0, WebViewMarkerComponent.class);
                return new qg90(Boolean.valueOf(webViewMarkerComponent.m7().isEnabled()), webViewMarkerComponent);
        }
    }
}
