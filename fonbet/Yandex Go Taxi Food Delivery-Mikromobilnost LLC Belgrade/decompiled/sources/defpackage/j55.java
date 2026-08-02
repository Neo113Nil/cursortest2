package defpackage;

import com.yandex.go.navigator.BaseNavigatorModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class j55 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseNavigatorModalView b;

    public /* synthetic */ j55(BaseNavigatorModalView baseNavigatorModalView, int i) {
        this.a = i;
        this.b = baseNavigatorModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BaseNavigatorModalView baseNavigatorModalView = this.b;
        switch (i) {
            case 0:
                baseNavigatorModalView.onCompassButtonClicked();
                break;
            default:
                baseNavigatorModalView.onBackPressed();
                break;
        }
    }
}
