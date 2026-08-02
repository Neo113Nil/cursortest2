package defpackage;

import android.webkit.ValueCallback;
import ru.rt.ebs.cryptosdk.core.verification.esia.system.EsiaAuthWebClient;

/* loaded from: classes4.dex */
public final /* synthetic */ class pme implements ValueCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ pme(int i) {
        this.a = i;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                xby.d.getClass();
                break;
            case 1:
                EsiaAuthWebClient.Companion.clearCookies$lambda$0((Boolean) obj);
                break;
            default:
                break;
        }
    }
}
