package defpackage;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import java.util.Objects;
import ru.yandex.taxi.analytics.q;

/* loaded from: classes9.dex */
public final class lc20 implements DeferredDeeplinkListener {
    public final /* synthetic */ tls a;
    public final /* synthetic */ q b;

    public lc20(tls tlsVar, q qVar) {
        this.a = tlsVar;
        this.b = qVar;
    }

    @Override // io.appmetrica.analytics.DeferredDeeplinkListener
    public final void onDeeplinkLoaded(String str) {
        this.a.invoke(str);
    }

    @Override // io.appmetrica.analytics.DeferredDeeplinkListener
    public final void onError(DeferredDeeplinkListener.Error error, String str) {
        hst hstVar = jst.e;
        Objects.toString(error);
        hstVar.getClass();
        int i = kc20.a[error.ordinal()];
        if (i != 1) {
            q qVar = this.b;
            if (i == 2) {
                qVar.e("METRICA_DEFFERED_DEEPLINK_ERROR:PARSE_ERROR", error.getDescription(), null);
            } else if (i == 3) {
                qVar.c("METRICA_DEFFERED_DEEPLINK_ERROR:NO_REFERRER", error.getDescription());
            } else {
                if (i != 4) {
                    w511.b();
                    return;
                }
                qVar.e("METRICA_DEFFERED_DEEPLINK_ERROR:UNKNOWN", error.getDescription(), null);
            }
        }
        this.a.invoke(null);
    }
}
