package com.yandex.go.scooters.ignition.controlling.enabled_notification;

import android.content.Context;
import defpackage.brn0;
import defpackage.ipn0;
import defpackage.k7x0;
import defpackage.l8x;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.tje;
import defpackage.tse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BA\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/yandex/go/scooters/ignition/controlling/enabled_notification/ScootersIgnitionControllingEnabledNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Ltse;", "coroutineScope", "Lk7x0;", "tagUrlFormatter", "Lpwy0;", "themeSwitcherProvider", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "Lbrn0;", "scootersIgnitiionExperimentRepository", "<init>", "(Landroid/content/Context;Lpav;Ltse;Lk7x0;Lpwy0;Lru/yandex/taxi/widget/c;Lbrn0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "provideDurationTime", "()J", "Lpav;", "Ltse;", "Lk7x0;", "Lpwy0;", "Lru/yandex/taxi/widget/c;", "Lbrn0;", "listItemComponent", "Lru/yandex/taxi/design/ListItemComponent;", "Ll8x;", "job", "Ll8x;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "w040", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersIgnitionControllingEnabledNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private final tse coroutineScope;
    private final c formattedTextConverter;
    private final pav imageLoader;
    private l8x job;
    private final ListItemComponent listItemComponent;
    private final brn0 scootersIgnitiionExperimentRepository;
    private final k7x0 tagUrlFormatter;
    private final pwy0 themeSwitcherProvider;

    private ScootersIgnitionControllingEnabledNotification(Context context, pav pavVar, tse tseVar, k7x0 k7x0Var, pwy0 pwy0Var, c cVar, brn0 brn0Var) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        this.coroutineScope = tseVar;
        this.tagUrlFormatter = k7x0Var;
        this.themeSwitcherProvider = pwy0Var;
        this.formattedTextConverter = cVar;
        this.scootersIgnitiionExperimentRepository = brn0Var;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        this.listItemComponent = listItemComponent;
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getId() {
        return "IGNITION_ENABLED_NOTIFICATION_ID";
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.job = tje.N(this.coroutineScope, null, null, new ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1(this.themeSwitcherProvider.a(), null, this), 3);
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l8x l8xVar = this.job;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.job = null;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    /* renamed from: provideDurationTime */
    public long getDuration() {
        return ipn0.a;
    }

    public /* synthetic */ ScootersIgnitionControllingEnabledNotification(Context context, pav pavVar, tse tseVar, k7x0 k7x0Var, pwy0 pwy0Var, c cVar, brn0 brn0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pavVar, tseVar, k7x0Var, pwy0Var, cVar, brn0Var);
    }
}
