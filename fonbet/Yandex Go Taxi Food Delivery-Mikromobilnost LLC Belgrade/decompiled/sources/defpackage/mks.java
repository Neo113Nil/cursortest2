package defpackage;

import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;

/* loaded from: classes8.dex */
public final /* synthetic */ class mks implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FullscreenSuperappSuggestModalView b;

    public /* synthetic */ mks(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, int i) {
        this.a = i;
        this.b = fullscreenSuperappSuggestModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView = this.b;
        switch (i) {
            case 0:
                FullscreenSuperappSuggestModalView.applyCartButtonState$lambda$1$0(fullscreenSuperappSuggestModalView);
                break;
            default:
                FullscreenSuperappSuggestModalView.setupCartsButton$lambda$0(fullscreenSuperappSuggestModalView);
                break;
        }
    }
}
