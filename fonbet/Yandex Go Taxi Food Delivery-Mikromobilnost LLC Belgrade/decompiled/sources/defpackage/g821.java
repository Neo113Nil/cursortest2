package defpackage;

import com.yandex.go.taxi.order.change.source.mvp.UpdateSourcePointConfirmationModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class g821 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UpdateSourcePointConfirmationModalView b;

    public /* synthetic */ g821(UpdateSourcePointConfirmationModalView updateSourcePointConfirmationModalView, int i) {
        this.a = i;
        this.b = updateSourcePointConfirmationModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UpdateSourcePointConfirmationModalView updateSourcePointConfirmationModalView = this.b;
        switch (i) {
            case 0:
                UpdateSourcePointConfirmationModalView.onAttachedToWindow$lambda$2$0(updateSourcePointConfirmationModalView);
                break;
            default:
                updateSourcePointConfirmationModalView.onBackPressed();
                break;
        }
    }
}
