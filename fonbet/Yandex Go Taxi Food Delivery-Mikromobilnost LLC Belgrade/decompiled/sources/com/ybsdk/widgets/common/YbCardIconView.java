package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.core.utils.text.Text;
import defpackage.buz0;
import defpackage.cma1;
import defpackage.cq51;
import defpackage.cuz0;
import defpackage.dq51;
import defpackage.fch0;
import defpackage.lwg0;
import defpackage.ny61;
import defpackage.o361;
import defpackage.poh0;
import defpackage.qq31;
import defpackage.rbv;
import defpackage.rje;
import defpackage.sm91;
import defpackage.ung0;
import defpackage.v4b1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0002\u001a'B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/ybsdk/widgets/common/YbCardIconView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/core/utils/text/Text;", "subtitle", "bgColor", "Lzy11;", "showTooltip", "(Lcom/ybsdk/core/utils/text/Text;I)V", "dismissTooltip", "()V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "getBaseline", "()I", "Ldq51;", ClidProvider.STATE, "render", "(Ldq51;)V", "Lo361;", "binding", "Lo361;", "pressedTint", CA20Status.STATUS_USER_I, "Lcuz0;", "tooltip", "Lcuz0;", "Companion", "cq51", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class YbCardIconView extends ConstraintLayout {
    private static final cq51 Companion = new cq51();

    @Deprecated
    public static final float DEFAULT_ALPHA = 1.0f;

    @Deprecated
    public static final float PRESSED_ALPHA = 0.2f;
    private final o361 binding;
    private final int pressedTint;
    private cuz0 tooltip;

    public YbCardIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_layout_yb_card_icon, this);
        int i2 = fch0.imageCard;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
        if (appCompatImageView != null) {
            i2 = fch0.imageStatus;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView2 != null) {
                i2 = fch0.progress;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i2, this);
                if (circularProgressIndicator != null) {
                    this.binding = new o361(this, appCompatImageView, appCompatImageView2, circularProgressIndicator);
                    this.pressedTint = rje.a(context, ung0.ybColor_textIcon_quaternary);
                    setClickable(true);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void dismissTooltip() {
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.c();
        }
        this.tooltip = null;
    }

    private final void showTooltip(Text subtitle, int bgColor) {
        Context context = getContext();
        buz0 buz0Var = new buz0(context);
        buz0Var.l(subtitle);
        buz0Var.e = rje.a(context, bgColor);
        buz0Var.m = true;
        buz0Var.d(new qq31(25, this));
        buz0Var.n = true;
        buz0Var.n(ung0.ybColor_fill_default_0);
        buz0Var.k(Tooltip$PreferredPosition.TOP);
        buz0Var.g(Tooltip$PreferredGravity.CENTER);
        buz0Var.l = com.ybsdk.core.utils.ext.view.b.h(lwg0.ybsdk_tooltip_horizontal_padding, this);
        cuz0 a = buz0Var.a();
        a.f(this, 0L);
        this.tooltip = a;
    }

    public static /* synthetic */ void showTooltip$default(YbCardIconView ybCardIconView, Text text, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ung0.ybColor_button_primaryNormal;
        }
        ybCardIconView.showTooltip(text, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showTooltip$lambda$0(YbCardIconView ybCardIconView, Tooltip$DismissReason tooltip$DismissReason) {
        ybCardIconView.tooltip = null;
        return zy11.a;
    }

    @Override // android.view.View
    public int getBaseline() {
        return getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissTooltip();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (isClickable()) {
            Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                setAlpha(0.2f);
                this.binding.c.setImageTintList(ColorStateList.valueOf(this.pressedTint));
            } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 1)) {
                setAlpha(1.0f);
                this.binding.c.setImageTintList(null);
            }
        }
        return super.onTouchEvent(event);
    }

    public final void render(dq51 state) {
        rbv rbvVar = state.a;
        o361 o361Var = this.binding;
        CircularProgressIndicator circularProgressIndicator = o361Var.d;
        AppCompatImageView appCompatImageView = o361Var.c;
        circularProgressIndicator.setVisibility(!state.e ? 4 : 0);
        dismissTooltip();
        Text text = state.c;
        if (text != null) {
            showTooltip$default(this, text, 0, 2, null);
        }
        v4b1.k(rbvVar, appCompatImageView, null, null, 6);
        appCompatImageView.setVisibility(rbvVar == null ? 8 : 0);
        Drawable drawable = appCompatImageView.getDrawable();
        AnimationDrawable animationDrawable = drawable instanceof AnimationDrawable ? (AnimationDrawable) drawable : null;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        v4b1.k(state.b, o361Var.b, null, null, 6);
        setContentDescription(com.ybsdk.core.utils.text.d.a(sm91.c(o361Var), state.d));
    }

    public YbCardIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ YbCardIconView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public YbCardIconView(Context context) {
        this(context, null, 0, 6, null);
    }
}
