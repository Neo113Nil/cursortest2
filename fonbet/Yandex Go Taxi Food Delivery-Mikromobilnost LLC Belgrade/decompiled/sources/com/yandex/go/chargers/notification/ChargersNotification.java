package com.yandex.go.chargers.notification;

import android.content.Context;
import defpackage.bdc;
import defpackage.d6a;
import defpackage.e6a;
import defpackage.f6a;
import defpackage.g18;
import defpackage.ju8;
import defpackage.nac;
import defpackage.pav;
import defpackage.s8o;
import defpackage.tje;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/go/chargers/notification/ChargersNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "", "notificationId", "", "title", "subtitle", "Lf6a;", "iconSource", "Lpav;", "imageLoader", "", "trailMode", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lf6a;Lpav;I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/String;", "getNotificationId", "()Ljava/lang/String;", "Lf6a;", "Lpav;", CA20Status.STATUS_USER_I, "Lg18;", "cancellable", "Lg18;", "content", "Lru/yandex/taxi/design/ListItemComponent;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersNotification extends NotificationTimedItemComponent<ListItemComponent> {
    private g18 cancellable;
    private final ListItemComponent content;
    private final f6a iconSource;
    private final pav imageLoader;
    private final String notificationId;
    private final int trailMode;

    public ChargersNotification(Context context, String str, CharSequence charSequence, CharSequence charSequence2, f6a f6aVar, pav pavVar, int i) {
        super(context, null, 0, 6, null);
        this.notificationId = str;
        this.iconSource = f6aVar;
        this.imageLoader = pavVar;
        this.trailMode = i;
        this.cancellable = g18.u1;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setRoundedBackground(s8o.m(new bdc(xng0.bgFloating), context));
        listItemComponent.setTitle(charSequence);
        listItemComponent.setSubtitle(charSequence2);
        listItemComponent.setTrailMode(i);
        if (f6aVar instanceof d6a) {
            listItemComponent.setLeadImage(tje.y(((d6a) f6aVar).a, context));
        } else if (!(f6aVar instanceof e6a)) {
            if (f6aVar != null) {
                w511.b();
                throw null;
            }
            listItemComponent.clearLeadView();
        }
        this.content = listItemComponent;
        setChild(listItemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(ChargersNotification chargersNotification) {
        chargersNotification.content.clearLeadView();
        return zy11.a;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.content.setRoundedBackground(s8o.m(new bdc(xng0.bgFloating), getContext()));
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId, reason: from getter */
    public String getUid() {
        return this.notificationId;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.iconSource instanceof e6a) {
            this.cancellable.cancel();
            nac nacVar = (nac) this.imageLoader.a(this.content.getLeadImageView());
            nacVar.i = new ju8(26, this);
            this.cancellable = nacVar.c(((e6a) this.iconSource).a);
        }
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.cancellable.cancel();
        this.cancellable = g18.u1;
        super.onDetachedFromWindow();
    }

    public /* synthetic */ ChargersNotification(Context context, String str, CharSequence charSequence, CharSequence charSequence2, f6a f6aVar, pav pavVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, charSequence, charSequence2, f6aVar, pavVar, (i2 & 64) != 0 ? 0 : i);
    }
}
