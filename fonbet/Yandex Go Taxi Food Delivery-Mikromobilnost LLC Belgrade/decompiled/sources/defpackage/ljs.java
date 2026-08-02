package defpackage;

import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;

/* loaded from: classes6.dex */
public final class ljs implements pjs {
    public final /* synthetic */ FullscreenDestinationSearchModalView a;

    public ljs(FullscreenDestinationSearchModalView fullscreenDestinationSearchModalView) {
        this.a = fullscreenDestinationSearchModalView;
    }

    @Override // defpackage.pjs
    public final void X3(boolean z) {
        tls tlsVar;
        tlsVar = this.a.delayedAnimation;
        tlsVar.invoke(Boolean.valueOf(z));
    }
}
