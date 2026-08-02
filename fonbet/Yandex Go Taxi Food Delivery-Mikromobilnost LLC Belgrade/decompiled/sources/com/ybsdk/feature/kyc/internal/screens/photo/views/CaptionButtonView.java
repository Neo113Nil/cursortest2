package com.ybsdk.feature.kyc.internal.screens.photo.views;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.cbh0;
import defpackage.cma1;
import defpackage.j38;
import defpackage.jnh0;
import defpackage.k38;
import defpackage.l38;
import defpackage.m38;
import defpackage.n38;
import defpackage.ny61;
import defpackage.ra61;
import defpackage.smg0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photo/views/CaptionButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ln38;", ClidProvider.STATE, "Lzy11;", "render", "(Ln38;)V", "Lra61;", "binding", "Lra61;", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CaptionButtonView extends FrameLayout {
    private final ra61 binding;

    public CaptionButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(jnh0.ybsdk_view_caption_button, this);
        int i2 = cbh0.button;
        if (((AppCompatImageView) cma1.O(i2, this)) != null) {
            i2 = cbh0.check;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                i2 = cbh0.progress;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i2, this);
                if (circularProgressIndicator != null) {
                    this.binding = new ra61(this, appCompatImageView, circularProgressIndicator);
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, smg0.ybsdk_click_scale_animator));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$4(View view) {
        if (view != null) {
            b.c(view, true, 0L, 0, 0L, null, 30);
        }
        return zy11.a;
    }

    public final void render(n38 state) {
        View view = this.binding.b;
        if (view.getVisibility() != 0) {
            view = null;
        }
        if (view == null) {
            view = this.binding.c;
            if (view.getVisibility() != 0) {
                view = null;
            }
        }
        View view2 = view;
        ra61 ra61Var = this.binding;
        View view3 = ra61Var.b;
        if (!(state instanceof k38)) {
            view3 = null;
        }
        if (view3 == null) {
            view3 = state instanceof m38 ? ra61Var.c : null;
        }
        if (view2 != null) {
            b.c(view2, false, 0L, 0, 0L, new j38(view3, 0), 14);
        }
        if (view2 == null && view3 != null) {
            b.c(view3, true, 0L, 0, 0L, null, 30);
        }
        setEnabled(state instanceof l38);
    }

    public CaptionButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CaptionButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CaptionButtonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
