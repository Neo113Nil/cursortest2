package com.yandex.go.masstransit.design.ui_components;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.tje;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/masstransit/design/ui_components/IconNotificationComponent;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "", "uid", "Landroid/graphics/Bitmap;", "icon", "", "title", "subtitle", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "Lzy11;", "setTitle", "(Ljava/lang/CharSequence;)V", "setSubtitle", "Ljava/lang/String;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IconNotificationComponent extends NotificationItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private final String uid;

    public IconNotificationComponent(Context context, String str, Bitmap bitmap, CharSequence charSequence, CharSequence charSequence2) {
        super(context, null, 0, 6, null);
        this.uid = str;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setBackgroundColor(0);
        listItemComponent.setTitle(charSequence);
        listItemComponent.setSubtitle(charSequence2);
        if (bitmap != null) {
            listItemComponent.setLeadImage(bitmap);
        }
        listItemComponent.setTitleTextSizePx(tje.u(16, listItemComponent.getContext()));
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId, reason: from getter */
    public String getUid() {
        return this.uid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSubtitle(CharSequence subtitle) {
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        if (listItemComponent != null) {
            listItemComponent.setSubtitle(subtitle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitle(CharSequence title) {
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        if (listItemComponent != null) {
            listItemComponent.setTitle(title);
        }
    }

    public /* synthetic */ IconNotificationComponent(Context context, String str, Bitmap bitmap, CharSequence charSequence, CharSequence charSequence2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? UUID.randomUUID().toString() : str, bitmap, charSequence, (i & 16) != 0 ? null : charSequence2);
    }
}
