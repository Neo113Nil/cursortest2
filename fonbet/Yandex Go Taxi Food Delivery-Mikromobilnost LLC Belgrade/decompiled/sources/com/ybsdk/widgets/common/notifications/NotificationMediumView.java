package com.ybsdk.widgets.common.notifications;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.banners.CloseBannerButtonView;
import defpackage.cma1;
import defpackage.ei60;
import defpackage.fch0;
import defpackage.fi60;
import defpackage.gi60;
import defpackage.hi60;
import defpackage.j4c;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.poh0;
import defpackage.rje;
import defpackage.s361;
import defpackage.ung0;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/widgets/common/notifications/NotificationMediumView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgi60;", ClidProvider.STATE, "Lzy11;", "bindRightPartData", "(Lgi60;)V", "Lhi60;", "render", "(Lhi60;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setCloseButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Ls361;", "binding", "Ls361;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationMediumView extends ConstraintLayout {
    private final s361 binding;

    public NotificationMediumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_notification_view_medium, this);
        int i2 = fch0.notificationCloseButton;
        CloseBannerButtonView closeBannerButtonView = (CloseBannerButtonView) cma1.O(i2, this);
        if (closeBannerButtonView != null) {
            i2 = fch0.notificationIcon;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = fch0.notificationTitle;
                TextView textView = (TextView) cma1.O(i2, this);
                if (textView != null) {
                    i2 = fch0.rightIcon;
                    ImageView imageView2 = (ImageView) cma1.O(i2, this);
                    if (imageView2 != null) {
                        i2 = fch0.rightPart;
                        if (((Barrier) cma1.O(i2, this)) != null) {
                            i2 = fch0.subtitle;
                            TextView textView2 = (TextView) cma1.O(i2, this);
                            if (textView2 != null) {
                                this.binding = new s361(this, closeBannerButtonView, imageView, textView, imageView2, textView2);
                                setBackgroundResource(nyg0.ybsdk_bg_notification_view_medium);
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

    private final void bindRightPartData(gi60 state) {
        this.binding.b.setVisibility(4);
        this.binding.c.setVisibility(4);
        if (state instanceof ei60) {
            this.binding.b.setVisibility(0);
            this.binding.b.render(new j4c(rje.a(getContext(), ung0.ybColor_fill_default_300), null));
        } else {
            if (jl40.l(state, fi60.a)) {
                return;
            }
            w511.b();
        }
    }

    public final void render(hi60 state) {
        setVisibility(8);
    }

    public final void setCloseButtonOnClickListener(View.OnClickListener onClickListener) {
        this.binding.b.setOnClickListener(onClickListener);
    }

    public NotificationMediumView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ NotificationMediumView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public NotificationMediumView(Context context) {
        this(context, null, 0, 6, null);
    }
}
