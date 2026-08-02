package com.yandex.go.ui;

import android.content.Context;
import defpackage.cc;
import defpackage.g18;
import defpackage.nac;
import defpackage.nq21;
import defpackage.pav;
import defpackage.sls;
import defpackage.u601;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/yandex/go/ui/UserPhotoNotificationItemComponent;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "", "title", Constants.KEY_MESSAGE, "", "duration", "imageUrl", "Lkotlin/Function0;", "Lzy11;", "onClick", "<init>", "(Landroid/content/Context;Lpav;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lsls;)V", "onDetachedFromWindow", "()V", "provideDurationTime", "()J", "J", "Lg18;", "cancellable", "Lg18;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "nq21", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UserPhotoNotificationItemComponent extends NotificationTimedItemComponent<ListItemComponent> {
    public static final nq21 Companion = new nq21();
    public static final String NOTIFICATION_ID = "UserPhotoNotification";
    private g18 cancellable;
    private final long duration;

    public UserPhotoNotificationItemComponent(Context context, pav pavVar, String str, String str2, long j, String str3, sls slsVar) {
        super(context, null, 0, 6, null);
        this.duration = j;
        this.cancellable = g18.u1;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(str);
        listItemComponent.setSubtitle(str2);
        if (str3 != null) {
            this.cancellable.cancel();
            nac nacVar = (nac) pavVar.a(listItemComponent.getLeadImageView());
            nacVar.i = new cc(listItemComponent, 5);
            this.cancellable = nacVar.c(str3);
        } else {
            listItemComponent.clearLeadView();
        }
        listItemComponent.setDebounceClickListener(new u601(4, slsVar));
        setChild(listItemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$0$0(ListItemComponent listItemComponent) {
        listItemComponent.clearLeadView();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$1(sls slsVar) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getUid() {
        return NOTIFICATION_ID;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.cancellable.cancel();
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    /* renamed from: provideDurationTime, reason: from getter */
    public long getDuration() {
        return this.duration;
    }

    public /* synthetic */ UserPhotoNotificationItemComponent(Context context, pav pavVar, String str, String str2, long j, String str3, sls slsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pavVar, str, str2, j, str3, (i & 64) != 0 ? null : slsVar);
    }
}
