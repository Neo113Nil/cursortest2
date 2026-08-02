package com.yandex.go.taxi.order.promotions.notification.ui;

import android.content.Context;
import defpackage.h60;
import defpackage.isc;
import defpackage.jl40;
import defpackage.jsc;
import defpackage.ksc;
import defpackage.lsc;
import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/taxi/order/promotions/notification/ui/PromoblockNotification;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Llsc;", ClidProvider.STATE, "<init>", "(Landroid/content/Context;Llsc;)V", "Lzy11;", "onNotificationClick", "()V", "Llsc;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PromoblockNotification extends NotificationItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private final lsc state;

    /* JADX WARN: Multi-variable type inference failed */
    public PromoblockNotification(Context context, lsc lscVar) {
        super(context, null, 0, 6, null);
        this.state = lscVar;
        setChild(new ListItemComponent(context, null, 0, 6, null));
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        if (listItemComponent != null) {
            listItemComponent.setLeadImage(lscVar.b);
            listItemComponent.setTitle(lscVar.c);
            listItemComponent.setSubtitle(lscVar.d);
            listItemComponent.stopProgressAnimation();
            listItemComponent.setDebounceClickListener(new h60(14, lscVar.f));
            ksc kscVar = lscVar.e;
            if (jl40.l(kscVar, jsc.a)) {
                listItemComponent.clearTrailView();
                return;
            }
            if (!(kscVar instanceof isc)) {
                w511.b();
                throw null;
            }
            isc iscVar = (isc) kscVar;
            listItemComponent.setTrailCompanionText(iscVar.b);
            listItemComponent.getNavigationIconParams().b = iscVar.a;
            listItemComponent.setTrailMode(2);
        }
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getUid() {
        return this.state.a;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onNotificationClick() {
        this.state.f.invoke();
    }
}
