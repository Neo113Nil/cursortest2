package com.yandex.plus.plaquesdk.plaque;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Notification$Position;
import defpackage.joc0;
import defpackage.koc0;
import defpackage.lf20;
import defpackage.loc0;
import defpackage.ny61;
import defpackage.ok60;
import defpackage.pxg0;
import defpackage.roc0;
import defpackage.rvg0;
import defpackage.w511;
import defpackage.wuj0;
import defpackage.xpg0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/plus/plaquesdk/plaque/NotificationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lloc0;", "notification", "", "notificationSize", "Landroid/widget/FrameLayout$LayoutParams;", "getLayoutParams", "(Lloc0;I)Landroid/widget/FrameLayout$LayoutParams;", "Lcom/yandex/plus/plaquesdk/plaque/api/models/PlaqueModel$Notification$Position;", "position", "Lzy11;", "updateNotificationMargins", "(Lcom/yandex/plus/plaquesdk/plaque/api/models/PlaqueModel$Notification$Position;I)V", "Landroidx/appcompat/widget/AppCompatImageView;", "createIconView", "()Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/appcompat/widget/AppCompatTextView;", "createCountView", "()Landroidx/appcompat/widget/AppCompatTextView;", "Lroc0;", "plaqueModel", "update", "(Lroc0;)V", "tabletNotificationSize", CA20Status.STATUS_USER_I, "plaqueNotificationSize", "Landroid/widget/ImageView;", "iconView", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "countView", "Landroid/widget/TextView;", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationView extends FrameLayout {
    private final TextView countView;
    private final ImageView iconView;
    private final int plaqueNotificationSize;
    private final int tabletNotificationSize;

    public NotificationView(Context context) {
        super(context);
        this.tabletNotificationSize = getContext().getResources().getDimensionPixelSize(rvg0.plaque_sdk_tablet_notification_size);
        this.plaqueNotificationSize = getContext().getResources().getDimensionPixelSize(rvg0.plaque_sdk_plaque_notification_size);
        AppCompatImageView createIconView = createIconView();
        this.iconView = createIconView;
        AppCompatTextView createCountView = createCountView();
        this.countView = createCountView;
        setTransitionName("plaque_notification_container_transition_name");
        setImportantForAccessibility(2);
        addView(createIconView);
        addView(createCountView);
        setClipChildren(false);
        setClipToPadding(false);
    }

    private final AppCompatTextView createCountView() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTransitionName("plaque_notification_count_transition_name");
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        appCompatTextView.setImportantForAccessibility(2);
        Resources resources = appCompatTextView.getContext().getResources();
        int i = pxg0.plaque_sdk_plaque_notification_count_background;
        ThreadLocal threadLocal = wuj0.a;
        appCompatTextView.setBackground(resources.getDrawable(i, null));
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextSize(0, appCompatTextView.getContext().getResources().getDimensionPixelSize(rvg0.plaque_sdk_plaque_notification_count_text_size));
        appCompatTextView.setTextColor(appCompatTextView.getContext().getResources().getColor(xpg0.plaque_sdk_plaque_notification_count_text, null));
        appCompatTextView.setVisibility(8);
        return appCompatTextView;
    }

    private final AppCompatImageView createIconView() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setTransitionName("plaque_notification_icon_transition_name");
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        appCompatImageView.setImportantForAccessibility(2);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_START);
        appCompatImageView.setVisibility(8);
        return appCompatImageView;
    }

    private final FrameLayout.LayoutParams getLayoutParams(loc0 notification, int notificationSize) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        if (notification instanceof joc0) {
            layoutParams = new FrameLayout.LayoutParams(-2, notificationSize);
        } else {
            if (!(notification instanceof koc0)) {
                w511.b();
                return null;
            }
            layoutParams = new FrameLayout.LayoutParams(notificationSize, notificationSize);
        }
        int i2 = ok60.a[notification.getPosition().ordinal()];
        if (i2 == 1) {
            i = 8388611;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            i = 8388613;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    private final void updateNotificationMargins(PlaqueModel$Notification$Position position, int notificationSize) {
        int i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = -notificationSize;
        int i3 = i2 / 2;
        int[] iArr = ok60.a;
        int i4 = iArr[position.ordinal()];
        int i5 = 0;
        if (i4 == 1) {
            i = i3;
        } else {
            if (i4 != 2) {
                w511.b();
                return;
            }
            i = 0;
        }
        int i6 = iArr[position.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                w511.b();
                return;
            }
            i5 = i2 / 4;
        }
        int i7 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.setMarginEnd(i5);
        marginLayoutParams.bottomMargin = i7;
        setLayoutParams(marginLayoutParams);
    }

    public final void update(roc0 plaqueModel) {
        loc0 loc0Var = plaqueModel.c;
        if (loc0Var == null) {
            this.iconView.setVisibility(8);
            this.countView.setVisibility(8);
            return;
        }
        int i = plaqueModel.b instanceof lf20 ? this.plaqueNotificationSize : this.tabletNotificationSize;
        if (loc0Var instanceof joc0) {
            this.iconView.setVisibility(8);
            this.countView.setVisibility(0);
            setTransitionName("plaque_notification_count_transition_name");
            TextView textView = this.countView;
            int i2 = ((joc0) loc0Var).a;
            textView.setText(i2 <= 99 ? String.valueOf(i2) : "99+");
            this.countView.setMinWidth(i);
        } else {
            if (!(loc0Var instanceof koc0)) {
                w511.b();
                return;
            }
            this.countView.setVisibility(8);
            this.iconView.setVisibility(0);
            setTransitionName("plaque_notification_icon_transition_name");
            this.iconView.setImageDrawable(((koc0) loc0Var).a.a);
        }
        setLayoutParams(getLayoutParams(loc0Var, i));
        updateNotificationMargins(loc0Var.getPosition(), i);
    }
}
