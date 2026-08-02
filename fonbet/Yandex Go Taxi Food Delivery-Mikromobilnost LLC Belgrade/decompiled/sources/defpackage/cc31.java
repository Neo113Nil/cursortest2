package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class cc31 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ VerticalHubV1ModalView b;

    public /* synthetic */ cc31(VerticalHubV1ModalView verticalHubV1ModalView, int i) {
        this.a = i;
        this.b = verticalHubV1ModalView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 hubItemsAdapter$lambda$0$0;
        zy11 stickyVerticals$lambda$0;
        int i = this.a;
        VerticalHubV1ModalView verticalHubV1ModalView = this.b;
        int intValue = ((Integer) obj).intValue();
        ob31 ob31Var = (ob31) obj2;
        switch (i) {
            case 0:
                hubItemsAdapter$lambda$0$0 = VerticalHubV1ModalView.hubItemsAdapter$lambda$0$0(verticalHubV1ModalView, intValue, ob31Var);
                return hubItemsAdapter$lambda$0$0;
            default:
                stickyVerticals$lambda$0 = VerticalHubV1ModalView.stickyVerticals$lambda$0(verticalHubV1ModalView, intValue, ob31Var);
                return stickyVerticals$lambda$0;
        }
    }
}
