package defpackage;

import com.yandex.go.external_service.view.ExternalServiceModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class c2p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExternalServiceModalView b;

    public /* synthetic */ c2p(ExternalServiceModalView externalServiceModalView, int i) {
        this.a = i;
        this.b = externalServiceModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ExternalServiceModalView externalServiceModalView = this.b;
        switch (i) {
            case 0:
                externalServiceModalView.expand();
                break;
            default:
                externalServiceModalView.expand();
                break;
        }
    }
}
