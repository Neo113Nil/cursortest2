package defpackage;

import com.yandex.go.places.complaint.impl.ui.ComplaintNotification;
import com.yandex.go.ui.UserPhotoNotificationItemComponent;
import ru.yandex.taxi.banners.NotificationBannerView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.preorder.AcceptEulaDialog;

/* loaded from: classes13.dex */
public final /* synthetic */ class cc implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListItemComponent b;

    public /* synthetic */ cc(ListItemComponent listItemComponent, int i) {
        this.a = i;
        this.b = listItemComponent;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 lambda$0$0;
        zy11 lambda$0$02;
        zy11 _init_$lambda$0;
        zy11 lambda$0$03;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ListItemComponent listItemComponent = this.b;
        switch (i) {
            case 0:
                lambda$0$0 = AcceptEulaDialog.lambda$0$0(listItemComponent);
                return lambda$0$0;
            case 1:
                listItemComponent.clearLeadView();
                return zy11Var;
            case 2:
                listItemComponent.clearTrailView();
                return zy11Var;
            case 3:
                lambda$0$02 = ComplaintNotification.lambda$0$0(listItemComponent);
                return lambda$0$02;
            case 4:
                _init_$lambda$0 = NotificationBannerView._init_$lambda$0(listItemComponent);
                return _init_$lambda$0;
            default:
                lambda$0$03 = UserPhotoNotificationItemComponent.lambda$0$0(listItemComponent);
                return lambda$0$03;
        }
    }
}
