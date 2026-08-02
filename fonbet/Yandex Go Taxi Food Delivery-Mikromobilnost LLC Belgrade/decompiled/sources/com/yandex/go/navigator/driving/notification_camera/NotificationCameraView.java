package com.yandex.go.navigator.driving.notification_camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.ah60;
import defpackage.bh60;
import defpackage.cma1;
import defpackage.fuh0;
import defpackage.ny61;
import defpackage.z5h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/navigator/driving/notification_camera/NotificationCameraView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lah60;", "uiState", "Lzy11;", "render", "(Lah60;)V", "Lbh60;", "binding", "Lbh60;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCameraView extends GoLinearLayout {
    public static final int $stable = 8;
    private final bh60 binding;

    public NotificationCameraView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View inflate = LayoutInflater.from(context).inflate(fuh0.notification_camera_view, (ViewGroup) this, false);
        addView(inflate);
        int i3 = z5h0.distance_between_camera;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
        if (robotoTextView == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
            throw null;
        }
        GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
        this.binding = new bh60(goLinearLayout, robotoTextView);
        setClipChildren(false);
        goLinearLayout.setElevation(4.0f);
    }

    public final void render(ah60 uiState) {
        this.binding.b.setText(uiState.a);
    }

    public NotificationCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public NotificationCameraView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public NotificationCameraView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ NotificationCameraView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
