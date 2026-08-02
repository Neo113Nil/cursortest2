package defpackage;

import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.taxi.order.bottom_modal.ui.mvp.BottomModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class jd6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tfx b;

    public /* synthetic */ jd6(tfx tfxVar, int i) {
        this.a = i;
        this.b = tfxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        tfx tfxVar = this.b;
        switch (i) {
            case 0:
                BottomModalView.updateModalViewBehaviour$lambda$0(tfxVar);
                break;
            default:
                OrganizationsModalView.lambda$0$1(tfxVar);
                break;
        }
    }
}
