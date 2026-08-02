package defpackage;

import com.yandex.go.taxi.order.bottom_modal.ui.mvp.BottomModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class id6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomModalView b;

    public /* synthetic */ id6(BottomModalView bottomModalView, int i) {
        this.a = i;
        this.b = bottomModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BottomModalView bottomModalView = this.b;
        switch (i) {
            case 0:
                bottomModalView.onBackPressed();
                break;
            default:
                bottomModalView.onBackPressed();
                break;
        }
    }
}
