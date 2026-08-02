package com.yandex.go.places.complaint.impl.ui;

import android.content.Context;
import defpackage.cc;
import defpackage.g18;
import defpackage.lxc;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.pav;
import defpackage.tje;
import defpackage.ztg0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/places/complaint/impl/ui/ComplaintNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "", "title", "imageUrl", "<init>", "(Landroid/content/Context;Lpav;Ljava/lang/String;Ljava/lang/String;)V", "Lzy11;", "onDetachedFromWindow", "()V", "", "provideDurationTime", "()J", "Ljava/lang/String;", "Lg18;", "cancellable", "Lg18;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "lxc", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComplaintNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final lxc Companion = new lxc();
    public static final long DURATION = 2500;
    public static final String NOTIFICATION_ID = "COMPLAINT_SUCCESS";
    private g18 cancellable;
    private final String title;

    public ComplaintNotification(Context context, pav pavVar, String str, String str2) {
        super(context, null, 0, 6, null);
        this.title = str;
        this.cancellable = g18.u1;
        setAccessibilityLiveRegion(1);
        setContentDescription(str);
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        int r = tje.r(mrg0.go_design_s_space, listItemComponent.getContext());
        int r2 = tje.r(ztg0.complaint_notification_icon_size, listItemComponent.getContext());
        listItemComponent.setTitle(str);
        listItemComponent.setLeadImageSize((r * 2) + r2);
        listItemComponent.setLeadImagePadding(r);
        this.cancellable.cancel();
        nac nacVar = (nac) pavVar.a(listItemComponent.getLeadImageView());
        nacVar.i = new cc(listItemComponent, 3);
        this.cancellable = nacVar.c(str2);
        setChild(listItemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$0$0(ListItemComponent listItemComponent) {
        listItemComponent.clearLeadView();
        return zy11.a;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getId() {
        return NOTIFICATION_ID;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.cancellable.cancel();
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    /* renamed from: provideDurationTime */
    public long getDuration() {
        return DURATION;
    }
}
