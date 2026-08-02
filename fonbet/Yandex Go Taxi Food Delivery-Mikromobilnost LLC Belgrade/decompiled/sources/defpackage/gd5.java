package defpackage;

import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.Arrays;
import java.util.Collections;
import ru.yandex.taxi.fragment.common.BaseWebChromeClient;
import ru.yandex.taxi.logistics.care.impl.router.f;

/* loaded from: classes5.dex */
public final /* synthetic */ class gd5 implements BaseWebChromeClient.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ValueCallback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gd5(Object obj, ValueCallback valueCallback, int i) {
        this.a = i;
        this.c = obj;
        this.b = valueCallback;
    }

    @Override // java.util.function.Consumer
    public final void accept(Uri[] uriArr) {
        l8x l8xVar;
        int i = this.a;
        ValueCallback valueCallback = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Uri[] uriArr2 = uriArr;
                l8xVar = ((BaseWebChromeClient) obj).createIntentJob;
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                jst.e.n("ShowFileChooser received values");
                valueCallback.onReceiveValue(uriArr2);
                if (uriArr2 != null) {
                    String.format("Received uris: %s", Arrays.copyOf(new Object[]{Collections.singletonList(uriArr2)}, 1));
                    break;
                }
                break;
            case 1:
                Uri[] uriArr3 = uriArr;
                pzt0 pzt0Var = ((f) obj).W;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                jst.e.n("ShowFileChooser received values");
                valueCallback.onReceiveValue(uriArr3);
                if (uriArr3 != null) {
                    String.format("Received uris: %s", Arrays.copyOf(new Object[]{Collections.singletonList(uriArr3)}, 1));
                    break;
                }
                break;
            default:
                Uri[] uriArr4 = uriArr;
                pzt0 pzt0Var2 = ((m420) obj).d;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                jst.e.n("ShowFileChooser received values");
                valueCallback.onReceiveValue(uriArr4);
                if (uriArr4 != null) {
                    String.format("Received uris: %s", Arrays.copyOf(new Object[]{scc.g(Arrays.copyOf(uriArr4, uriArr4.length))}, 1));
                    break;
                }
                break;
        }
    }
}
