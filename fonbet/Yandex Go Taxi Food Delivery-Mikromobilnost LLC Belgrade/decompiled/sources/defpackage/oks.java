package defpackage;

import com.yandex.go.suggest.impl.presenter.c;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;

/* loaded from: classes8.dex */
public final /* synthetic */ class oks implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ oks(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                FullscreenSuperappSuggestModalView.lambda$0$onCurrentAddressClicked(cVar);
                break;
            case 1:
                FullscreenSuperappSuggestModalView.render$lambda$0$onNextButtonClicked(cVar);
                break;
            default:
                cVar.Mg();
                break;
        }
    }
}
