package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingInfo;

/* compiled from: UrlSharingListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class hfq0 implements ffq0 {
    public final CopyOnWriteArraySet<ffq0> b = new CopyOnWriteArraySet<>();

    @Override // xsna.ffq0
    public final void onUrlSharingStarted(UrlSharingInfo urlSharingInfo) {
        Iterator<ffq0> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onUrlSharingStarted(urlSharingInfo);
        }
    }

    @Override // xsna.ffq0
    public final void onUrlSharingStopped() {
        Iterator<ffq0> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onUrlSharingStopped();
        }
    }
}
