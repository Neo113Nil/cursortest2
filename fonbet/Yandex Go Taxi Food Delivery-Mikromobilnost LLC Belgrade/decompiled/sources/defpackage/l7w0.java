package defpackage;

import com.yandex.go.superapp.web.modal.WebModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class l7w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebModalView b;

    public /* synthetic */ l7w0(WebModalView webModalView, int i) {
        this.a = i;
        this.b = webModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        WebModalView webModalView = this.b;
        switch (i) {
            case 0:
                webModalView.onBackPress();
                break;
            case 1:
                webModalView.onBackPress();
                break;
            case 2:
                webModalView.onBackPressedInternal();
                break;
            default:
                webModalView.onBackPressedInternal();
                break;
        }
    }
}
