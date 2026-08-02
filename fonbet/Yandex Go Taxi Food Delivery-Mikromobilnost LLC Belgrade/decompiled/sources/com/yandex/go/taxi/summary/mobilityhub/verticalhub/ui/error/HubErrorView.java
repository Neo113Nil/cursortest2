package com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.error;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.clh0;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.qxu;
import defpackage.s8h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/ui/error/HubErrorView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "subtitle", "Lzy11;", "render", "(Ljava/lang/String;Ljava/lang/String;)V", "", "slide", "updateSlide", "(F)V", "minContentHeight", "()I", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lqxu;", "binding", "Lqxu;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubErrorView extends GoFrameLayout {
    public static final int $stable = 8;
    private final qxu binding;

    public HubErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(clh0.hub_error_state_view, this);
        int i2 = s8h0.collapsed_brick_image;
        if (((GoImageView) cma1.O(i2, this)) != null) {
            i2 = s8h0.collapsed_error;
            GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i2, this);
            if (goConstraintLayout != null) {
                i2 = s8h0.error_subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView != null) {
                    i2 = s8h0.error_text;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
                    if (robotoTextView2 != null) {
                        i2 = s8h0.error_title;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i2, this);
                        if (robotoTextView3 != null) {
                            i2 = s8h0.expanded_error;
                            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i2, this);
                            if (goLinearLayout != null) {
                                this.binding = new qxu(this, goConstraintLayout, robotoTextView, robotoTextView2, robotoTextView3, goLinearLayout);
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final int minContentHeight() {
        return this.binding.b.getHeight();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    public final void render(String title, String subtitle) {
        this.binding.e.setText(title);
        this.binding.c.setText(subtitle);
        this.binding.c.setVisibility(subtitle != null ? 0 : 8);
        this.binding.d.setText(title);
    }

    public final void updateSlide(float slide) {
        qxu qxuVar = this.binding;
        if (slide > 0.5f) {
            qxuVar.b.setAlpha(0.0f);
            this.binding.f.setAlpha((slide - 0.5f) / 0.5f);
        } else {
            qxuVar.b.setAlpha((0.5f - slide) / 0.5f);
            this.binding.f.setAlpha(0.0f);
        }
    }

    public HubErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public HubErrorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ HubErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
