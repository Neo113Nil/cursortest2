package xsna;

import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingInfo;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener;

/* compiled from: UrlSharingListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class gfq0 implements UrlSharingListener {
    public final hfq0 a;

    public gfq0(hfq0 hfq0Var) {
        this.a = hfq0Var;
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener
    public final void onUrlSharingStarted(UrlSharingInfo urlSharingInfo) {
        this.a.onUrlSharingStarted(urlSharingInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener
    public final void onUrlSharingStopped() {
        this.a.onUrlSharingStopped();
    }
}
