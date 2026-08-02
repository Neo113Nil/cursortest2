package defpackage;

import com.yandex.go.agreement.trackable.mvp.TrackableAcceptanceModalView;
import com.yandex.go.agreement.trackable.mvp.b;

/* loaded from: classes12.dex */
public final /* synthetic */ class o101 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TrackableAcceptanceModalView b;

    public /* synthetic */ o101(TrackableAcceptanceModalView trackableAcceptanceModalView, int i) {
        this.a = i;
        this.b = trackableAcceptanceModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        b bVar2;
        b bVar3;
        int i = this.a;
        TrackableAcceptanceModalView trackableAcceptanceModalView = this.b;
        switch (i) {
            case 0:
                TrackableAcceptanceModalView.setCloseButton$lambda$0(trackableAcceptanceModalView);
                break;
            case 1:
                bVar = trackableAcceptanceModalView.presenter;
                bVar.Lg(g101.a);
                break;
            case 2:
                bVar2 = trackableAcceptanceModalView.presenter;
                bVar2.Lg(e101.a);
                break;
            default:
                bVar3 = trackableAcceptanceModalView.presenter;
                bVar3.Lg(f101.a);
                break;
        }
    }
}
