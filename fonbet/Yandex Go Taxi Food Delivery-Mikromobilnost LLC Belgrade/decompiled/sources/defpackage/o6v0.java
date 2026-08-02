package defpackage;

import com.yandex.go.preorder.suggested.menu.ui.SuggestMenuModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class o6v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuggestMenuModalView b;

    public /* synthetic */ o6v0(SuggestMenuModalView suggestMenuModalView, int i) {
        this.a = i;
        this.b = suggestMenuModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SuggestMenuModalView suggestMenuModalView = this.b;
        switch (i) {
            case 0:
                SuggestMenuModalView.onAttachedToWindow$lambda$0$2(suggestMenuModalView);
                break;
            default:
                suggestMenuModalView.setupMapCard();
                break;
        }
    }
}
