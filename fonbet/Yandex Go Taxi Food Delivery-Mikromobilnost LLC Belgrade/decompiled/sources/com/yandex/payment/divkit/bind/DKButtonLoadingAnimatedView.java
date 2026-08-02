package com.yandex.payment.divkit.bind;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.apa0;
import defpackage.cma1;
import defpackage.l9h0;
import defpackage.ny61;
import defpackage.orf;
import defpackage.ulh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/yandex/payment/divkit/bind/DKButtonLoadingAnimatedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "startAnimation", "()V", "stopAnimation", "Lapa0;", "binding", "Lapa0;", "Landroid/view/animation/TranslateAnimation;", "anim", "Landroid/view/animation/TranslateAnimation;", "Companion", "orf", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKButtonLoadingAnimatedView extends ConstraintLayout {
    public static final long ANIMATION_DURATION = 1000;
    public static final orf Companion = new orf();
    private final TranslateAnimation anim;
    private final apa0 binding;

    public DKButtonLoadingAnimatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(ulh0.paymentsdk_divkit_button_loading_view, this);
        int i = l9h0.blur_view;
        View O = cma1.O(i, this);
        if (O == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
            throw null;
        }
        this.binding = new apa0(this, O);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 2, 2.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setRepeatMode(1);
        translateAnimation.setRepeatCount(-1);
        this.anim = translateAnimation;
    }

    public final void startAnimation() {
        this.binding.a.setVisibility(0);
        this.binding.b.startAnimation(this.anim);
    }

    public final void stopAnimation() {
        this.binding.a.setVisibility(8);
        this.anim.cancel();
        this.anim.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DKButtonLoadingAnimatedView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DKButtonLoadingAnimatedView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
