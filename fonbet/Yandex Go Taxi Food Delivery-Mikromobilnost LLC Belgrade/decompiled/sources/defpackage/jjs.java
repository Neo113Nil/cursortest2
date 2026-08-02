package defpackage;

import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class jjs implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FullscreenDestinationSearchModalView b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Runnable w;

    public /* synthetic */ jjs(FullscreenDestinationSearchModalView fullscreenDestinationSearchModalView, Runnable runnable, Runnable runnable2, int i) {
        this.a = i;
        this.b = fullscreenDestinationSearchModalView;
        this.c = runnable;
        this.w = runnable2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 animateShow$lambda$0;
        zy11 animateDismiss$lambda$0;
        int i = this.a;
        Runnable runnable = this.w;
        Runnable runnable2 = this.c;
        FullscreenDestinationSearchModalView fullscreenDestinationSearchModalView = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                animateShow$lambda$0 = FullscreenDestinationSearchModalView.animateShow$lambda$0(fullscreenDestinationSearchModalView, runnable2, runnable, booleanValue);
                return animateShow$lambda$0;
            default:
                animateDismiss$lambda$0 = FullscreenDestinationSearchModalView.animateDismiss$lambda$0(fullscreenDestinationSearchModalView, runnable2, runnable, booleanValue);
                return animateDismiss$lambda$0;
        }
    }
}
