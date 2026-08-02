package defpackage;

import ru.yandex.taxi.design.PreviewHeadComponent;
import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class jny implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedOrderInfoModalView b;

    public /* synthetic */ jny(LinkedOrderInfoModalView linkedOrderInfoModalView, int i) {
        this.a = i;
        this.b = linkedOrderInfoModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 loadDetailsIcon$lambda$0;
        PreviewHeadComponent previewHeadComponent;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        LinkedOrderInfoModalView linkedOrderInfoModalView = this.b;
        switch (i) {
            case 0:
                loadDetailsIcon$lambda$0 = LinkedOrderInfoModalView.loadDetailsIcon$lambda$0(linkedOrderInfoModalView);
                break;
            case 1:
                linkedOrderInfoModalView.lastLoadedInfoItemIconTag = "";
                break;
            default:
                linkedOrderInfoModalView.lastLoadedIconTag = "";
                previewHeadComponent = linkedOrderInfoModalView.titleItem;
                previewHeadComponent.clearTrailView();
                break;
        }
        return zy11Var;
    }
}
